import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		
      ArrayList <String> list1 = new ArrayList();
      list1.add("call");
      list1.add("fog");
      list1.add("memail");
      
      for (String li : list1)
      {
    	  System.out.println(li);
      }

     // list1.remove(list1);
      list1.remove(1);
      System.out.println(list1);
      
      if(list1.isEmpty())
      {
    	  list1.add("added 1 element");
    	  
      }
      else 
      {
    	  System.out.println("remove element");
    	  
    	  list1.remove(1);
      }
      System.out.println(list1);
      

	}

}
