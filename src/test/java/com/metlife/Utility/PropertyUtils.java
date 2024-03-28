package com.metlife.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils
{
    public static String getProperty(String key)
    {
        Properties p=new Properties();
        try
        {
            p.load(new FileInputStream("src/test/resources/SetBrowsers.properties"));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return p.getProperty(key);
    }
}
