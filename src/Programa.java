import java.util.Scanner;

/*---------------|o|----------------------------------
 * Programa que permite introducir 2 numeros enteros positivos 
 * y a continuacion efectuar sobre ellos las 4 operaciones basicas matematicas
 * (suma, resta, producto y cociente) sin el uso de metodos para posteriormente 
 * visualizar los resultados
 * 
 * Autor: Dani Crespo
 * Fecha: 13/4/22
 * 
 * Fecha de modificacion: 15/4/22
 * Autor de la modificacion: Dani C. 
 * Se añaden comentarios y el chequeo de que los numeros introducidos sean positivos
 * Se elimina la opcion de que numero2 sea cero
 * Se convierte el cociente en real
 *------------------------------------------>o<------*/

public class Programa 
{
	public static void main(String [] arg)
	{
		//Declaracion de variables
		int numero1, numero2, suma, resta, producto;
		float division;
		
		//Construyo un objeto leer de tipo Scanner para capturar por teclado los numeros
		Scanner leer=new Scanner(System.in);
		
		//Bloque try/catch para el control de excepciones
		try 
		{
			System.out.println("Introduce por orden dos numeros enteros positivos: ");
			
			//Uso un blucle do/while para asegurarme que el numero1 sea mayor que cero
			do 
			{
				System.out.print("Introduce primer número: ");
				numero1= leer.nextInt();
				if(numero1<=0) System.out.println("El numero ha de ser entero positivo");
			}while (numero1<=0);
			
			//Uso un blucle do/while para asegurarme que el numero1 sea mayor que cero
			do 
			{
				System.out.print("Introduce segundo número: ");
				numero2= leer.nextInt();
				if(numero2<=0) System.out.println("El numero ha de ser entero positivo");
			}while (numero2<=0);
			
			//Efectuo la suma y muestro en consola
			suma=numero1+numero2;
			System.out.println("La suma de "+numero1+" y "+numero2+" es "+suma);
			
			//Efectuo la resta y muestro en consola
			resta=numero1-numero2;
			System.out.println("La resta de "+numero1+" y "+numero2+" es "+resta);
			
			//Efectuo el producto y muestro en consola
			producto=numero1*numero2;
			System.out.println("El producto de "+numero1+" y "+numero2+" es "+producto);			
			
			//Efectuo el cociente y muestro en consola. Convierto el cociente entero en real
			division=(float)numero1/numero2;
			System.out.println("El cociente entre "+numero1+" y "+numero2+" es "+division);						
		}
		
		//Bloque de recepcion de excepciones
		catch (Exception excepcion)
		{
			System.out.println("Necesitamos numeros enteros positivos");
		}		
	}

}
