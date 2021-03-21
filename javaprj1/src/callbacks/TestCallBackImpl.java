package callbacks;

public class TestCallBackImpl  {
	 int a;
	 int b;
	 
	TestCallBackImpl(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void callback(TestCallBack callback) {
             callback.callback(this.a, this.b);		
	}

}
