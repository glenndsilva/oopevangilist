package anony;

public class ToJson implements Media {
      private final Page page;
      
      ToJson(Page page2){
    	  this.page = page2;
      }
      
      public Media with(String name, String value) {
    	  return new ToJson(this.page.with(name, value));
      }
      
    public String json() {
    	 return  this.page.json();
      }
}
