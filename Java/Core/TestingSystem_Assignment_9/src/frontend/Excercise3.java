package frontend;
import entity.CPU;
import entity.Car;

public class Excercise3 {
	public static void main(String[] args) {
//		question1:
		CPU cpu = new CPU(500f);
		CPU.Processor processor = cpu.new Processor();
		CPU.Ram ram = cpu.new Ram();
		System.out.println("Price= "+cpu+ " Cache= " + processor.getCache() + " ClockSpeed= " + ram.getClockSpeed());
		
//		question2:
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println(car+" " + engine);
//		question3: Day la Inner class
//		question4: 
//		Ngay: 31/10/2017
//		Gio: 10:15:30
	}
}
