package test;

public class MyMessenger implements Messenger{
	  protected String[] contactlist;
	  
	  public MyMessenger(String[] names) {
		  contactlist  =  names;
	  }

	@Override
	public void show() {
         for(String name : contactlist)		{
      	      System.out.println(name);
         }
	}
}