package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {
    }


    @Test
    public void using_properties_utility_method(){
        //This will read the given "key;s" value and return it
        // as a String
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));
    }
}