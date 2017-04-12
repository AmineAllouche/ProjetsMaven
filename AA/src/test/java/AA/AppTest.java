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

    /**

     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testmax()
    {   
    	App apk = new App();
    	assertEquals( apk.max(4, 5) ,5);
    	assertEquals( apk.max(5, 4),5);
    }

    public void testApp()
    {
        assertTrue( true );
    }

}
