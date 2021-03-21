package deco;

public class WhiteCream implements Cream {
	Cake cake;
	
	WhiteCream(Cake cake){
		this.cake = cake;
	}

	public int cost() {
		System.out.println(this.cake.cost());
		return this.cake.cost()+10;
	}
}
