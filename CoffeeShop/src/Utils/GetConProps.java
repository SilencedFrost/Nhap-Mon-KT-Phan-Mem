/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author SIlencedFrost
 */
public class GetConProps {
    
    public static String getDBName()
    {
        return Tools.getProps("connection").getProperty("dbname");
    }
    
    public static String getUsername()
    {
        return Tools.getProps("connection").getProperty("username");
    }
    
    public static String getPassword()
    {
        return Tools.getProps("connection").getProperty("pass");
    }
}
