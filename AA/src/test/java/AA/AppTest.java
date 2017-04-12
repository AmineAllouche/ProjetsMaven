package AA;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
<<<<<<< HEAD

public class AppTest 
    extends TestCase
{
    public int max(int a,int b)
    {
    	return a>b ? a:b;
    }
=======
public class AppTest 
    extends TestCase
{
>>>>>>> f8c0cda46c632a174a13e8ed1842cffc853e2aad
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

<<<<<<< HEAD
    /**	
=======
    /**
>>>>>>> f8c0cda46c632a174a13e8ed1842cffc853e2aad
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
<<<<<<< HEAD
    public void testmax()
    {   	
    	assertEquals(max(4,5),5);
    }
    public void max2()
    {
    	assertEquals(max(5,4),5);
    }

=======
>>>>>>> f8c0cda46c632a174a13e8ed1842cffc853e2aad
    public void testApp()
    {
        assertTrue( true );
    }
<<<<<<< HEAD
    
=======
>>>>>>> f8c0cda46c632a174a13e8ed1842cffc853e2aad
}
