import java.util.Scanner;

/**
 * <h1>Clase Programa</h1>
 * permite introducir 2 numeros enteros positivos 
 * y a continuacion efectuar sobre ellos las 4 operaciones basicas matematicas
 * (suma, resta, producto y cociente) sin el uso de metodos para posteriormente 
 * visualizar los resultados
 * <br/>
 * <ul>
 * 	<li>Fecha de modificacion: 15/4/22</li>
 * 	<li>Autor de la modificacion: Dani C.</li> 
 * 	<li>Modificaciones:
 * 		<ul>
 * 		<li>Se añaden comentarios</li>
 * 		<li>chequeo de que los numeros introducidos sean positivos</li>
 * 		<li>Se elimina la opcion de que numero2 sea cero</li>
 * 		<li>Se convierte el cociente en real</li>
 * 		</ul>
 * 	</li>
 * </ul>
 * <ul>
 * 	<li>Fecha de modificacion: 15/4/22</li>
 * 	<li>Autor de la modificacion: Dani C.</li>
 * 	<li>Modificaciones:
 * 		<ul>
 * 		<li>Se agrupa la salida de resultados para poder convertirlo en metodo</li>
 * 		</ul>
 * 	</li>
 * 
 * @author Dani Crespo
 * @since 13/4/22
 * @version 1.3
 */
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
			
			//Efectuo la suma
			suma = metodo_sumar(numero1, numero2);			
			
			//Efectuo la resta
			resta = metodo_restar(numero1, numero2);			
			
			//Efectuo el producto
			producto = metodo_multiplicar(numero1, numero2);						
			
			//Efectuo el cociente. Convierto el cociente entero en real
			division = metodo_dividir(numero1, numero2);
				
			
			//Se muestran los resultados por consola
			metodo_mostrar(numero1, numero2, suma, resta, producto, division);
			
		}
		
		//Bloque de recepcion de excepciones
		catch (Exception excepcion)
		{
			System.out.println("Necesitamos numeros enteros positivos");
		}		
	}


	/**
	 * <h2>Método metodo_mostrar</h2>
	 * Muestra por consola los resultados obtenidos de los metodos metodo_sumar, metodo_restar, metodo_multiplicar y metodo_dividir
	 * @param numero1
	 * @param numero2
	 * @param suma
	 * @param resta
	 * @param producto
	 * @param division
	 */
	public static void metodo_mostrar(int numero1, int numero2, int suma, int resta, int producto, float division) {
		System.out.println("La suma de "+numero1+" y "+numero2+" es "+suma);
		System.out.println("La resta de "+numero1+" y "+numero2+" es "+resta);
		System.out.println("El producto de "+numero1+" y "+numero2+" es "+producto);
		System.out.println("El cociente entre "+numero1+" y "+numero2+" es "+division);
	}

	/**
	 * <h2>Método metodo_dividir</h2>
	 * @param numero1
	 * @param numero2
	 * @return El cociente de los números introducidos como parámetros (numero1/numero2).
	 */
	public static float metodo_dividir(int numero1, int numero2) {
		float division;
		division=(float)numero1/numero2;
		return division;
	}
	
	/**
	 * <h2>Método metodo_multiplicar</h2>
	 * @param numero1
	 * @param numero2
	 * @return El producto de los números introducidos como parámetros.
	 */
	public static int metodo_multiplicar(int numero1, int numero2) {
		int producto;
		producto=numero1*numero2;
		return producto;
	}

	/**
	 * <h2>Método metodo_restar</h2>
	 * @param numero1
	 * @param numero2
	 * @return La resta de los números introducidos como parámetros.
	 */
	public static int metodo_restar(int numero1, int numero2) {
		int resta;
		resta=numero1-numero2;
		return resta;
	}

	/**
	 * <h2>Método metodo_sumar</h2>
	 * @param numero1
	 * @param numero2
	 * @return La suma de los números introducidos como parámetros.
	 */
	public static int metodo_sumar(int numero1, int numero2) {
		int suma;
		suma=numero1+numero2;
		return suma;
	}

}
