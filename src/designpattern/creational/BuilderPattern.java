package designpattern.creational;

import java.util.ArrayList;
import java.util.List;

interface Item {
	   public String name();
	   public Packing packing();
	   public float price();	
	}
	
	interface Packing {
	   public String pack();
	}

	class Wrapper implements Packing {
	
		@Override
		public String pack() {
			
			return "Wrapper";
		}
		
	}

	class Bottle implements Packing {
		
		@Override
		public String pack() {
			
			return "Bottle";
		}
	}
	
	abstract class Burger implements Item {
		
		@Override
		public Packing packing() {
			return new Wrapper();
		}
	}
	
	abstract class CoolDrink implements Item {
		
		@Override
		public Packing packing() {
			
			return new Bottle();
		}
		
		@Override
		public abstract float price();
	}
	
	class VegBurger extends Burger {

		@Override
		public String name() {
			
			return "Veg Burger";
		}

		@Override
		public float price() {
			
			return 25.5f;
		}
		
		
	}
	
	class ChickenBurger extends Burger {

		@Override
		public String name() {
			
			return "Chicken Burger";
		}

		@Override
		public float price() {
			
			return 50.0f;
		}
		
		
	}
	
	class Coke extends CoolDrink {

		@Override
		public String name() {
			
			return "Coke";
		}

		@Override
		public float price() {
			
			return 30.0f;
		}
		
	}
	
	class Pepsi extends CoolDrink {
		
		@Override
		public float price() {
			return 35.0f;
		}
		
		@Override
		public String name() {
			return "Pepsi";
		}
	}
	
	class Meal {
		private List<Item> items = new ArrayList<Item>();
		
		public void addItem(Item item ) {
			items.add(item);
		}
		public float getCost() {
			float cost = 0.0f;
			
			for(Item item: items){
				cost+=item.price();
			}
			return cost;
			}
		public void showItems() {
			for(Item item: items){
				 System.out.print("Item : " + item.name());
		         System.out.print(", Packing : " + item.packing().pack());
		         System.out.println(", Price : " + item.price());
			}
		}
		
	}
	
	class MealBuilder{
		public Meal prepareVegMeal() {
			Meal meal = new Meal();
			meal.addItem(new VegBurger());
			meal.addItem(new Pepsi());
			return meal;
		}
		
		public Meal prepareNonVegMeal() {
			Meal meal = new Meal();
			meal.addItem(new ChickenBurger());
			meal.addItem(new Coke());
			
			return meal;
			
		}
	}

public class BuilderPattern {

	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		Meal vegMeal = mb.prepareVegMeal();
		 System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Cost of Veg Meal is "+vegMeal.getCost());
		Meal nonveg = mb.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonveg.showItems();
		System.out.println("Cost of Non Veg Meal is "+nonveg.getCost());

	}

}
