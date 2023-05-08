import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		MEDIA = (A * 0.20) + (B * 0.30) + (C * 0.50);
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		
		
		sc.close();
	}

}
