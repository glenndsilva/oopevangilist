package callbacks;

public class MainMethod {
      public static void main(String args[]) {
            TestCallBackImpl tm = new TestCallBackImpl(4,3);
              tm.callback(new TestCallBack() {
            	  public void callback(int a,int b) {
            		    System.out.println("Hello" + (a+b));
            	  }
              });
      }
}
