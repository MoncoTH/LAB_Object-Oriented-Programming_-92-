package shape;
import java.util.Scanner;
public class Command2{
	public static void main(String[] args) {
		float shape=0;
		String Color;
		try (Scanner sc = new Scanner(System.in)){
		System.out.print("Enter the shape color: ");
		Color = sc.next();
		System.out.print("Enter the square’s side: ");
		shape = sc.nextFloat();
	}
	Square area = new Square();
	area.setColor(Color,shape);
	area.setArea1();
	area.setArea2();
	
	System.out.print("Square: color = " + area.getColor() + "\nSquare: area = " + area.getArea() + "\nSquare: perimeter = " + area.getPerimeter());
	}
}