package deco;

public class BlackCream implements Cream{
      Cake cake;
      
     BlackCream(Cake cake){
    	 this.cake = cake;
     }
	
	public int cost() {
		// TODO Auto-generated method stub
		return cake.cost()+40;
	}

	
	public static void main(String args[]) {
		   Cake ck = new WhiteCream(new BlackCream(new BlackForest()));
		   System.out.println(ck.cost());
	}
}
