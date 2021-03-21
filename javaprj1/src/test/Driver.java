package test;

public class Driver {
      public static void main(String args[]) {
    	  final String friends [] = new String[] {"jim","kate","bill","mark"};
    	  
    	  Messenger msg = new MyMessenger(friends);
    	  
    	  msg.show();
    	  
    	  Messenger msg1 = new Messenger() {

			@Override
			public void show() {
				for(String name : friends) {
					send(name);
				}				
			}

			@Override
			public void send(String message) {
				//	for(String name : friends) {
						System.out.println(message);
				//	}
			}
    		     
    	  };
    	  		msg1.show();
    	  		
    	  		 Messenger msg2 = new Messenger() {

    	  			@Override
    	  			public void show() {
    	  				for(String name : friends) {
    						send(name);
    					}    	  				
    	  			}

    	  			@Override
    	  			public void send(String message) {
    	  				//for(String name : friends) {
    	  					System.out.print(message);
    	  				//}
    	  			}
    	  	    	  
    	  	      };
    	  	            msg2.show();

    	  		
    	  		
    	  		
      }
      
           
      
}
