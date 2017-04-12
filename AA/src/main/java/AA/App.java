package AA;



import java.util.*;

import java.io.*;

import com.opencsv.*;

import org.apache.commons.collections.*;





public class App 
{
    public int max(int a,int b)
    {
    	//return a;
    	return a>b ? a:b;
    }
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App appl = new App(); 
        System.out.println("Le max est:" + appl.max(5, 4));
        
        
    	int nb = 0;
        int monmax = 0;
        CSVReader reader;
        CSVWriter writer;
		try {
			reader = new CSVReader(new FileReader("data.csv"));
			writer = new CSVWriter (new FileWriter ("data-filtered.csv"));
			List<String[]> myEntries = reader.readAll();
			
			
			   for(String[] num : myEntries) {
		            nb = Integer.parseInt(Arrays.toString(num).substring(1, Arrays.toString(num).length()-1));
			if(nb > monmax){
		                monmax = nb;
		            }
			System.out.println("Lecture du nombre : " + nb);
			System.out.println("Le nombre maximum est : " + monmax);
			
			Iterator<String[]> IT = myEntries.iterator();
	        IT.next();
			
	        while(IT.hasNext())
	        {
	        	String[] chiffres = IT.next();
	        	List<String> list  = Arrays.asList(chiffres);
	        	Vector<String> out = new Vector<String>();
	           	Predicate predicat = new Predicate()
	           	{
	           	    public boolean evaluate(Object object)
	           	    {
	           	    	try
	           	    	{
	           	    		return Integer.parseInt((String) object) > 50;
	           	    	}
	           	    	catch (java.lang.NumberFormatException e)
	           	    	{
	           	    		return false;
	           	    	}
	           	    }
	           	};
	           	CollectionUtils.select(list, predicat, out);
	            System.out.println("OUT : " + out);
	            writer.writeNext(out.toArray(new String[0]));
	            
	        }
	    }
		            
			   writer.close();
		        

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
       
	//parcourt
		
     
    }

    
    


}




