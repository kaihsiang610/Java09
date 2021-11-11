class CCircle1 {
	private static double pi = 3.14;
	private double radius;

	public CCircle1(double r) {
		radius = r;
	}

	public void show() {
		System.out.print("radius=" + radius);
		System.out.println(", area=" + pi * radius * radius);
	}
}

public class Class16 {
	public static void main(String args[]) {
		CCircle1 cir[];
		cir = new CCircle1[6];

		for (int i = 0; i < cir.length; i++) {
			cir[i] = new CCircle1((double) i);
			cir[i].show();
		}
	}
}