import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenarMm {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], nElementos, aux;
		//elementos a contener en mi arreglo
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo:"));
		
		arreglo = new int[nElementos];
		
		//Pedimos nuestros elementos al usuario
		for(int i=0;i<nElementos;i++) {
			 System.out.print((i+1)+"Digite un numero");
			 arreglo[i] = entrada.nextInt();
		}
		//Ordenar nuestro arreglo por medio del metodo burbuja
		for(int i=0; i<nElementos; i++) {
			for(int j=0; j<(nElementos-1);j++) {
				if(arreglo [j] > arreglo[j+1]) {//condicionar el arreglo del for
					aux = arreglo[j];//Valor actual
					arreglo[j] = arreglo[j+1];//valor del numero siguiente
					arreglo[j+1] = aux; 
				}
			}
			
		}
		
		//Mostrar nuestro arreglo
		System.out.print("Orden de arreglo: ");
		for(int i=0;i<nElementos;i++) {
			System.out.print(arreglo[i]+ " - ");
			
		}
		
		System.out.print("Arreglo de mayor a menor");
		for(int i=(nElementos-1);i>=0;i--) {
			System.out.println(arreglo[i]+" - ");
		}
		
		
	}

}
