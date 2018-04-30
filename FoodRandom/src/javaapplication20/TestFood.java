
package javaapplication20;

public class TestFood {

	public static void main(String[] args) {
		FoodRuffle [] list = {new FoodRuffle("Ninja Burger", "Burger", 90),
				new FoodRuffle("Yang Neoi", "Buffet", 90),
				new FoodRuffle("Hotto Bun", "Burger", 80),
				new FoodRuffle("Chabu Laos", "Buffet", 90),
				new FoodRuffle("Mos Burger", "Burger", 90),
				new FoodRuffle("Shinkanzen ", "Sushi", 200),
				new FoodRuffle("Yum Yupa", "Yum", 40)};
		RuffleBag rb = new RuffleBag(list);
		rb.randomPick();
		System.out.println("----- Filter Burger ------------------");
		RuffleBag burgerBag = rb.filterByType("Burger");
		burgerBag.randomPick();	
                
	}
}

