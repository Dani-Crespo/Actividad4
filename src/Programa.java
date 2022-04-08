import java.util.Scanner;

public class Programa 
{
	public static void main(String [] arg)
	{
		int numero1, numero2, suma, resta, producto, division;
		Scanner leer=new Scanner(System.in);
		
		try 
		{
			System.out.print("Introduce primer número: ");
			numero1= leer.nextInt();
			
			System.out.print("Introduce segundo número: ");
			numero2= leer.nextInt();
			
			suma=numero1+numero2;
			System.out.println("La suma de "+numero1+" y "+numero2+" es "+suma);
			
			resta=numero1-numero2;
			System.out.println("La resta de "+numero1+" y "+numero2+" es "+resta);
			
			producto=numero1*numero2;
			System.out.println("El producto de "+numero1+" y "+numero2+" es "+producto);
			
			if(numero2==0)
			{
				System.out.println("No se puede dividir por cero");
			}
			else
			{
				division=numero1/numero2;
				System.out.println("El cociente entero entre "+numero1+" y "+numero2+" es "+division);
			}			
		}
		
		catch (Exception excepcion)
		{
			System.out.println("Necesitamos numeros");
		}		
	}

}
