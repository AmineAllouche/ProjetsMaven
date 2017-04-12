package AA;



import java.util.*;

import java.io.*;

import com.opencsv.CSVReader;


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
		try {
			reader = new CSVReader(new FileReader("data.csv"));
			List<String[]> myEntries = reader.readAll();
			
			
			   for(String[] num : myEntries) {
		            nb = Integer.parseInt(Arrays.toString(num).substring(1, Arrays.toString(num).length()-1));
			if(nb > monmax){
		                monmax = nb;
		            }
			System.out.println("Lecture du nombre : " + nb);
			System.out.println("Le nombre maximum est : " + monmax);
		            }

		        

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




