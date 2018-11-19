package guias;
import java.util.Scanner;

public class Ej22 {

	private static Scanner sc;

	public static void main(String[] args) {
		int aux;
		int N = 0;
		String a=("*");
		sc = new Scanner(System.in);
		//ingreso de datos
		System.out.println("Ingrese el alto de la escalera");
		N=sc.nextInt();
		//declaro array
		String pir [] = new String [N];
		//rellena el array
		for (int i=0;i<N;i++){   
			pir[i]=a;
			a=("*")+a;
		}
		//muestra 
		for(int j=1;j<=N;j++){
			aux=N-j;
			System.out.println(pir[aux]);
			
		}
	}

}
