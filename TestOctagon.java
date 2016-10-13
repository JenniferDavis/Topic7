
public class TestOctagon extends Octagon implements Cloneable, Comparable<Integer> {

	public static void main(String[] args) {
		// create an octagon object with side value of 5
		Octagon octagon = new Octagon(5);
		//Display its area and perimeter
		System.out.println("Octagon Area: " + octagon.getArea() );
		System.out.println("Octagon Perimeter: " + octagon.getPerimeter() );
		//Create a new object using clone method
		Octagon octagon2 = (Octagon)octagon.clone();
		//compare the two objects using the compareTo method
		System.out.println(octagon.compareTo(octagon2));
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
