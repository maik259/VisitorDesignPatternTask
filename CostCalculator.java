package task1;

public class CostCalculator implements Visitor {
	private double tmpCost;

	@Override
	public void visitGlass(Glass g) {
		System.out.println("Total Cost for " + g.getName() + " is: " + getCost(g) + " Euros");
	}

	@Override
	public void visitFurniture(Furniture f) {
		System.out.println("Total Cost for " + f.getName() + " is: " + getCost(f) + " Euros");
	}

	@Override
	public void visitElectronic(Electronic e) {
		System.out.println("Total Cost for " + e.getName() + " is: " + getCost(e) + " Euros");
	}

	public double getCost(HouseholdItem i) {
		if (i.getClass().equals(Glass.class)) {
			switch (((Glass) i).getTickness()) {
			case 1:
				tmpCost = ((Glass) i).getLenght() * 0.05;
				break;
			case 2:
				tmpCost = ((Glass) i).getLenght() * 0.03;
				break;
			case 3:
				tmpCost = ((Glass) i).getLenght() * 0.02;
				break;
			default:
			}
			return tmpCost;
		}

		if (i.getClass().equals(Furniture.class)) {
			return tmpCost = ((Furniture) i).getWeight();
		}

		if (i.getClass().equals(Electronic.class)) {
			if (((Electronic) i).getFragile()) {
				return tmpCost = ((Electronic) i).getWeight() * 0.5;
			} else {
				return tmpCost = ((Electronic) i).getWeight() * 0.3333333333333333;
			}
		}

		return -1;

	}
}
