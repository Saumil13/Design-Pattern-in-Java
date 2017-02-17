import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionBinarySearch {

	public static void main(String[] args)
    {
		ArrayList<String> arlst=new ArrayList<String>();
	      
		   // populate the list
		   arlst.add("TP");
		   arlst.add("PROVIDES");
		   arlst.add("QUALITY");
		   arlst.add("TUTORIALS");
		      
		   // search the list for key 'QUALITY'
		   int index=Collections.binarySearch(arlst, "TP");     
		      
		   System.out.println("'QUALITY' is available at index: "+index);
       
    }
}
