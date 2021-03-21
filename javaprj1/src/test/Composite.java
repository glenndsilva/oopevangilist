package test;

import java.util.ArrayList;
import java.util.List;

public class Composite 	implements Component {
		String name;
	
		Composite(String name){
			this.name = name;
		}
		
		private List<Component> childComponents = new ArrayList<Component>();
		public void add(Component component) {
		childComponents.add(component);
		}
		public void remove(Component component) {
		childComponents.remove(component);
		}
		
		public void show() {
			System.out.println(this.name);
		for (Component component : childComponents) {
			component.show();
		}
	}
}
