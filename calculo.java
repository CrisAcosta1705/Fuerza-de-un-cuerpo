package ejercicio;
import java.util.Scanner;
public class calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		double f;
		int M,A;
		
		System.out.println("Ingrese la masa del cuerpo");
		M = tc.nextInt();
		
		System.out.println("Ingrese la Aceleracion del cuerpo");
		A = tc.nextInt();
		
		f = M*A;
		
		System.out.println("Masa del cuerpo: "+M);
		System.out.println("Aceleracion del cuerpo: "+A);
		System.out.println("La fuerza del cuerpos es: "+f);
	}

}
