package basic.concepts;

public class ConstructorDemo {
	
public static void main(String[] args) {
		
		Cars c1 = new Cars();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		Cars c2 = new Cars(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}

}
