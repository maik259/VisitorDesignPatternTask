package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// Initialize some household
		List<HouseholdItem> householdItems = new ArrayList<>();

		Electronic microwaveOven = new Electronic("Microwave Oven", 37, 48, 27, 13, false);
		Electronic tv = new Electronic("TV", 122, 73, 15, 18, true);

		Glass wineGlass = new Glass("Wine glasses", 33, 28, 23, 1);
		Glass coffeeTable = new Glass("Glass Coffee Table", 80, 80, 45, 3);

		Furniture bed = new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard = new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);

		List<HouseholdItem> namesList = Arrays.asList(microwaveOven, tv, wineGlass, coffeeTable, bed, cupboard);
		householdItems.addAll(namesList);

		Visitor c = new CostCalculator();
		Visitor p = new PackagingCalculator();
		for(int i = 0; i < householdItems.size(); i++) {
			namesList.get(i).accept(c);
		}
		for(int j = 0; j < householdItems.size(); j++) {
			namesList.get(j).accept(p);
		}
		

		
		
	}

}