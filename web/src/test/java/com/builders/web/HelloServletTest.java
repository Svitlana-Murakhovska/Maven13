package com.builders.web;

import com.builders.utils.BuildersUtil;
import junit.framework.Assert;
import org.junit.Test;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//import static org.testng.TestNGAntTask.Mode.junit;

public class HelloServletTest {

    @Test
    public void testHello() {
        InputStream stream = BuildersUtil.class.getClassLoader().getResourceAsStream("web_config_test.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(properties.getProperty("test_hello"));
    }

}
