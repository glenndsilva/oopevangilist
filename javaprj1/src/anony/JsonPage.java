package anony;

import java.util.Map;

public class JsonPage implements Page {
       private final Map<String, String> attrs;
       
       JsonPage(Map<String, String> map){
    	   this.attrs = map;
       }
       
       public Page with(String name, String value) {
    	  // Map<String, String> map = new HashMap<>();
    	   this.attrs.put(name,value);
    	 //  map.put(name, value);
    	   return new JsonPage(attrs);
       }
       
       public String json() {
    	   StringBuilder str = new StringBuilder();
           for(Map.Entry ent : this.attrs.entrySet()) {
        	   str.append(ent.getKey());
        	   str.append(ent.getValue());
           }
             return str.toString();
       }
       
}
