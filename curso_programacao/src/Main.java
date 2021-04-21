public class Main {

	public static void main(String[] args) {
		
		int halfArea;
		double superiorBase, inferiorBase, height, area;
		superiorBase = 6.0;
		inferiorBase = 8.0;
		height = 5.0;
		area = (superiorBase + inferiorBase) / 2.0 * height;
		
		System.out.println("Trapeze Area");
		System.out.println("Superior Base:\t" + superiorBase);
		System.out.println("Inferior Base:\t" + inferiorBase);
		System.out.println("Height:\t\t" + height);
		System.out.println("Area:\t\t" + area);
		
		halfArea = (int) area / 2;
		System.out.println("Half Of Area:\t" + halfArea);
	}
}
