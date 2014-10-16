/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sstoneman1
 */
public class AlarmTest {
    private Alarm alarm;
    
    public AlarmTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SETUP CLASS RUNNING -- Nothing to do.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TEARDOWN CLASS RUNNING -- Nothing to do.");
    }
    
    @Before
    public void setUp() {
        alarm = new Alarm();
    }
    
    @After
    public void tearDown() {
        System.out.println("TEARDOWN RUNNING -- Nothing to do.");
    }

    /**
     * Test of getHour method, of class Alarm.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        assertEquals(0, alarm.getHour());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMinute method, of class Alarm.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        assertEquals(0, alarm.getMinute());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTime method, of class Alarm.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        assertTrue(alarm.setTime(7,30));
        assertEquals(7, alarm.getHour());
        assertEquals(30, alarm.getMinute());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Alarm.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "7:30AM";
        alarm.setTime(7, 30);
        assertEquals(expResult, alarm.toString());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
