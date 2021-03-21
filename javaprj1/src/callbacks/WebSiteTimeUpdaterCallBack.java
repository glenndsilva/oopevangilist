package callbacks;

public class WebSiteTimeUpdaterCallBack  implements TimeUpdaterCallBack {
     public void updateTime(long time) {
        // print the updated time anywhere in your website's example
    	 System.out.println("Hello");
        System.out.println(time);
    }
}
