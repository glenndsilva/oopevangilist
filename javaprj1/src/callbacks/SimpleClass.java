package callbacks;

import java.util.ArrayList;

public class SimpleClass {
	    ArrayList<Listner>  obj1 = new ArrayList<Listner>();
       
       
       public void register(Listner listner) {
    	    obj1.add(listner);
       }
       
       public void buttonClicked(String buttonValue) {
    	      for(int i=0; i < obj1.size();i++) {
    	    	   Listner l = obj1.get(i);
    	    	   if(i==Integer.parseInt(buttonValue)) {
    	    	     l.check(i+"");
    	    	   }
    	      }
       }
       
       public static void main(String args[]) {
    	      SimpleClass sp = new SimpleClass();
    	      
    	      sp.register(new Listner() {
    	    	  public void check(String value) {
    	    		     System.out.println("Button "+value +" Was Clicked");
    	    	  }
    	      });
    	      
    	      sp.register(new Listner() {
    	    	  public void check(String value) {
    	    		     System.out.println("Button "+value +" Was Clicked1");
    	    	  }
    	      });
    	      
    	         	      
    	      sp.buttonClicked("0");
    	      
       }
       
}
