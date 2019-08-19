package principal;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method m = new Method();
//System.out.println(m.secuencia());

		Integer size = 53;
		long inicio = 0;
		long result = 1;
		Double posicion = null;
		long[] fib = new long[size];
		Scanner s = new Scanner(System.in);
		boolean enEjecuon = true;
		boolean check = true;

		fib[0] = 1;
		fib[1] = 2;
		for (int i = 0; i < 50; i++) {
			fib[i + 2] = fib[i] + fib[i + 1];
			
		}

		System.out.println("Seleccione la posicion que desea encontrar");
		System.out.println("dentro de la secuencia Fibonacci");

		while (enEjecuon == true) {
			
			
			do {
			s = new Scanner(System.in);
			
			try {
				posicion = s.nextDouble();
				check = posicion.isNaN();
				
			} catch (Exception e) {
				check = true;
				System.out.println("Ese no es un número, intente de nuevo");
			}
			
			
			if(posicion >= 1 && posicion <= 50 && check == false) {
				check = false;
			}else if(posicion < 1 || posicion > 50 || check == true) {
				check = true;
				System.out.println("Ingrese únicamente valores entre 1 y 50");
			}
			
			}while(check!=false);
			
			
			posicion = posicion - 1;
			String n = String.valueOf(Math.round(posicion));
            Integer nn = Integer.valueOf(n);
			System.out.println(fib[nn]);
			
			
			
			
			
			
			
			
		}
	}

}
