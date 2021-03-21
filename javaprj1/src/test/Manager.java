package test;

public class Manager {
	    public String arr[];
	
	    Manager(String  arr1[]){
	    	this.arr = arr1;
	    }
	     
		public void send(Messenger manage) {
			   for(int i=0; i < arr.length;i++) {
			   manage.send(arr[i]);
			   }
		}
		
		public static void main(String args[]) {
			       final   String ar[] = {"A","B","C","D"};
			
			        Manager mgr = new Manager(ar);
			        
			                  mgr.send(new Messenger() {
			                	    public void send(String name) {
			                	    	System.out.println(name);
			                	    }
			                  });
		}
}
