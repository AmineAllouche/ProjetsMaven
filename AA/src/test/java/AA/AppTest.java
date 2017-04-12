package AA;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{
    public int max(int a,int b)
    {
    	return a>b ? a:b;
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**	
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testmax()
    {   	
    	assertEquals(max(4,5),5);
    }
    public void max2()
    {
    	assertEquals(max(5,4),5);
    }

    public void testApp()
    {
        assertTrue( true );
    }
    
}
