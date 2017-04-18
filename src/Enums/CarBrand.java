package Enums;

/**
 * Created by sodobescu on 4/10/2017.
 */
public enum CarBrand
{
	BMW, MERCEDES, AUDI, OPEL;
	public CarBrand displaysPrevious() {
		for (CarBrand brandName : CarBrand.values()) {
			if (brandName.ordinal() == this.ordinal() - 1) {
				return brandName;
			}
		}
		return CarBrand.OPEL;
	}
	public CarBrand displaysNext() {

		for (CarBrand brandName : CarBrand.values()) {
			if (brandName.ordinal() == this.ordinal() + 1) {
				return brandName;
			}
		}
		return CarBrand.BMW;
	}
	public void displaysAll() {
		for (CarBrand brandName : CarBrand.values()) {
			System.out.print(brandName + " ");
		}
	}

}
