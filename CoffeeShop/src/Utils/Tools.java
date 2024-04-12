/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thnrg
 */
public class Tools 
{
    public static void SetIcon(JLabel container, String imgpath)
    {
        ImageIcon icon = new ImageIcon(imgpath);
        Image image = icon.getImage();
        Image scaled = image.getScaledInstance(container.getWidth(), container.getHeight(), java.awt.Image.SCALE_SMOOTH);
        container.setIcon(new ImageIcon(scaled));
        
    }
    
    public static void SetFrameToCenter (JFrame frame)
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }
    
    public static void SetFrameToCenter (JDialog frame)
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }
    
    public static Connection GetCon()
    {
        try
        {
            Connection conn = DriverManager.getConnection(getConInfo());
            return conn;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static String getConInfo()
    {
        return "jdbc:sqlserver://localhost:1433;databaseName=" + ReadProps.getDBName() + ";username=" + ReadProps.getUsername() + ";password=" + ReadProps.getPassword();
    }
    
    public static void loadComboBox(JComboBox comboBox, ArrayList<String> data) {
        comboBox.removeAllItems();

        for (String item : data) {
            comboBox.addItem(item);
        }
    }
    
    public static DefaultTableModel trimColumns(DefaultTableModel model, int desiredLength) {
        int currentLength = model.getColumnCount();
        if (currentLength > desiredLength) {
            for (int i = currentLength - 1; i >= desiredLength; i--) {
                model.setColumnCount(i);
            }
        }
        return model;
    }
    
    public static void setLAF()
    {
        try 
        {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } 
        catch (UnsupportedLookAndFeelException ex) 
        {
            
        }
    }

    /**
     *
     * @param cboCity
     * @param cboDistrict
     * @param cboWard
     * @param status: 0 - update everything, 1 - update District, Ward, 2 - update Ward
     */
    public static void addressSelector(JComboBox cboCity, JComboBox cboDistrict, JComboBox cboWard, int status)
    {
        if(status <= 0)
        {
            ArrayList<String> cities = new ArrayList();
            try(Connection con = Tools.GetCon())
            {
                
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select full_name from provinces");
                
                while (rs.next()) {
                    String fullName = rs.getString("full_name");
                    cities.add(fullName);
                }
                 
                
            }
            catch (Exception ex) 
            {
            }
            loadComboBox(cboCity, cities);
        }
        
        if(status <= 1)
        {
            ArrayList<String> districts = new ArrayList();
            try(Connection con = Tools.GetCon())
            {
                
                PreparedStatement stm = con.prepareStatement("Select full_name from districts where province_code in (Select code from provinces where full_name like ?)");
                stm.setNString(1, cboCity.getSelectedItem().toString());
                ResultSet rs = stm.executeQuery();
                
                while (rs.next()) {
                    String fullName = rs.getString("full_name");
                    districts.add(fullName);
                }
            }
            catch(Exception ex)
            {
            }
            loadComboBox(cboDistrict, districts);
        }
        
        if(status <= 2)
        {
            ArrayList<String> wards = new ArrayList();
            try(Connection con = Tools.GetCon())
            {
                
                PreparedStatement stm = con.prepareStatement("Select full_name from wards where district_code in (Select code from districts where full_name like ?)");
                stm.setNString(1, cboDistrict.getSelectedItem().toString());
                ResultSet rs = stm.executeQuery();
                
                while (rs.next()) {
                    String fullName = rs.getString("full_name");
                    wards.add(fullName);
                }
            }
            catch(Exception ex)
            {
            }
            loadComboBox(cboWard, wards);
        }
    }
}
