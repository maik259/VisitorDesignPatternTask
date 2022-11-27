package task1;

public class PackagingCalculator implements Visitor {

	@Override
	public void visitGlass(Glass g) {
		System.out.println(g.getName() + ":\n >should be wrapped with Bubble wraps and packed in a box with dimension: "
				+ getPackaging(g));
	}

	@Override
	public void visitFurniture(Furniture f) {
		System.out.println(
				f.getName() + ":\n >should be covered with waterproof covers with area of: " + getPackaging(f));
	}

	@Override
	public void visitElectronic(Electronic e) {
		System.out.println(e.getName() + ":\n >should be covered with Polythylene and packed in a box with dimension: "
				+ getPackaging(e));

	}

	public String getPackaging(HouseholdItem i) {
		if (i.getClass().equals(Glass.class)) {
			((Glass) i).setHeight(((Glass) i).getHeight() + 1);
			((Glass) i).setLenght(((Glass) i).getLenght() + 1);
			((Glass) i).setWidth(((Glass) i).getWidth() + 1);
			return ((Glass) i).getHeight() + 1 + "x" + ((Glass) i).getLenght() + "x" + ((Glass) i).getWidth();
		}

		if (i.getClass().equals(Furniture.class)) {
			return ((Furniture) i).getLenght() + "x" + ((Furniture) i).getWidth();
		}
		if (i.getClass().equals(Electronic.class)) {
			((Electronic) i).setHeight(((Electronic) i).getHeight() + 1);
			((Electronic) i).setLenght(((Electronic) i).getLenght() + 1);
			((Electronic) i).setWidth(((Electronic) i).getWidth() + 1);
			return ((Electronic) i).getHeight() + "x" + ((Electronic) i).getLenght() + "x"
					+ ((Electronic) i).getWidth();
		}

		return null;
	}

}
