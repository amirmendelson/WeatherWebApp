package com.masterlean;


import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.masterlean.net.URLReader;
 

public class URLReaderTest {
    @BeforeClass
    public static void oneTimeSetUp() {
    	System.out.println("@BeforeClass - oneTimeSetUp 09/2017");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
    	System.out.println("@AfterClass - oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
        System.out.println("@Before - setUp");
    }
 
    @After
    public void tearDown() {
        System.out.println("@After - tearDown");
    }
 
    @Test
    public void testGetDateTime() {
        System.out.println("@Test - testGetDateTime");
    	URLReader reader = new URLReader();
        String time = reader.getDateTime();
        System.out.println("@Test - testGetDateTime = " + time);
        assertNotNull(time);
    }
}