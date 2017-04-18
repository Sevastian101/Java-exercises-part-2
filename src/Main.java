import Enums.CarBrand;
import Enums.Color;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by sodobescu on 4/10/2017.
 */
public class Main
{
	public static void main(String args[]){
		/**
		 * Checking if the methods of ArrayProcesser works
		 */
		ArrayList<Integer> myarray=new ArrayList(Arrays.asList(1,4,5,6,1,2,346,3));
		ArrayProcesser validation=new ArrayProcesser();

		System.out.println(validation.contains1or4(myarray));
		System.out.println(validation.countEvenNumbers(myarray));
		System.out.println(validation.contains1or2After1(myarray));

		Car BMW =new Car(CarBrand.BMW, Color.BLACK);
		Car.Engine engine=BMW.new Engine();
		Car.Wheel  wheel=BMW.new Wheel();

		System.out.println("Car brand is:"+BMW.getBrand() +" color is "+BMW.getColor());
		System.out.println("Next brand is:"+BMW.getBrand().displaysNext());
		System.out.println("Previous brand is:"+BMW.getBrand().displaysPrevious());

		System.out.println("Engine is ready:"+engine.checkIfReady(20,4));
		System.out.println("Wheel is ready:"+wheel.checkIfReady(3,true));

	}
}
