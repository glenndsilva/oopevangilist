package test;

import java.util.ArrayList;


public class CompositeTest {
	public static void main(String[] args) {
		ArrayList<String> records = new ArrayList<String>();
		
		records.add("A");
		records.add("A");
		records.add("A");
		records.add("B");
		records.add("C");
		
		
		/*Leaf leaf1 = new Leaf("1");
		Leaf leaf2 = new Leaf("2");
		Leaf leaf3 = new Leaf("3");
		Leaf leaf4 = new Leaf("4");
		Leaf leaf5 = new Leaf("5");
		
		///Composite composite1 = new Composite("A");
		
		composite1.add(leaf1);
		composite1.add(leaf2);
		Composite composite2 = new Composite("B");
		composite2.add(leaf3);
		composite2.add(leaf4);
		composite2.add(leaf5);
		composite1.add(composite2);
		composite1.show();
		*/
		Composite composite1 = null;
		
		ArrayList <Component> mainheader = new ArrayList<Component>();
		String s = "";
		for(int i = 0; i < records.size();i++) {
			  if(i==0){
				  composite1 = new Composite(records.get(i));
				  Leaf leaf = new Leaf(records.get(i));
				  composite1.add(leaf);
				  
			  }
			
			  String temp = records.get(i);
			  if(i <= records.size()) {
				  if(i > 0) {
				    s = records.get(i-1);
				    temp = records.get(i);
				  }
			  }
			  if(temp.equals(s)){
				  Leaf leaf = new Leaf(records.get(i));
				  composite1.add(leaf);
				  //documentheader.print();
			  }else {
				  
				  mainheader.add(composite1);
				 		  if(i+1 == records.size()) {
				 			// composite1 = new Composite(records.get(i));
					         mainheader.add(composite1);
						  }
			  }
		 }
	}
}
