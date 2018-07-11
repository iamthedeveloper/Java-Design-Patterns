package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> itemList = new ArrayList<Item>();

	public void addItem(Item item) {
		itemList.add(item);
	}

	public float getMealPrice() {
		float mealPrice = 0;
		for (Item item : itemList) {
			mealPrice += item.price();
		}
		return mealPrice;
	}
	
	 public void showItems(){
		   
	      for (Item item : itemList) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.price());
	      }		
	   }	
}
