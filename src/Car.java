import Enums.CarBrand;
import Enums.Color;

/**
 * Created by sodobescu on 4/18/2017.
 */
public class Car
{
	private CarBrand brand;
	private Color color;

	public Car(CarBrand brand, Color color) {
		this.brand = brand;
		this.color = color;
	}
	public class Engine
	{
		public Engine() {}
		public boolean checkIfReady(double petrol, double oil) {
			class Petrol
			{
				double cuantity;
				public Petrol() {
					cuantity = petrol;
				}
				boolean isEnough() {
					return (cuantity > 10) ? true : false;
				}
			}
			class Oil
			{
				double cuantity;
				public Oil() {
					cuantity = oil;
				}
				boolean isEnough() {
					return (cuantity > 1) ? true : false;
				}
			}

			return new Oil().isEnough() & new Petrol().isEnough();
		}
	}
	public class Wheel
	{
		public Wheel() {
		}
		public boolean checkIfReady(double preasure, boolean state) {
			class State
			{
				boolean isReady;
				public State() {
					isReady = state;
				}
				boolean isEnough() {
					return isReady;
				}
			}
			class Preasure
			{
				double cuantity;
				public Preasure() {
					cuantity = preasure;
				}
				boolean isEnough() {
					return (cuantity > 2 && cuantity < 4) ? true : false;
				}
			}
			return new State().isEnough() & new Preasure().isEnough();
		}
	}
	public CarBrand getBrand() {
		return brand;
	}
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}

