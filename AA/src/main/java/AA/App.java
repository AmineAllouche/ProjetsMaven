package AA;


public class App 
{
    public int max(int a,int b)
    {
    	return a;
//    	return a>b ? a:b;
    }
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App appl = new App(); 
        System.out.println("Le max est:" + appl.max(5, 4));
    }
    


}


