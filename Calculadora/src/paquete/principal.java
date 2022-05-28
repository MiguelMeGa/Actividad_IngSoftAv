package paquete;


public class principal {

	public static void main(String[] args) 
	{
		 double resultado; 
		//En primer lugar se define un objeto de la clase calculadora
		 calculadora micalculadora=new calculadora();
	     test mitest=new test();
		
		 //Se define en este punto las pruebas unitarias relacionadas con la suma
		
         //Suma de dos n�meros positivos
		 resultado=micalculadora.suma(1,2);
		 mitest.compruebavalores(3, resultado);
		 
		 //Suma de n�mero negativo y positivo
		 resultado=micalculadora.suma(-1,2);
		 mitest.compruebavalores(1, resultado);
		 //COmprobaci�n de indicaci�n de fallo en el test
		 mitest.compruebavalores(2, resultado);
		 
		 
		 //Suma de dos n�meros con decimales
		 resultado=micalculadora.suma(1.234,2.2);
		 mitest.compruebavalores(3.434,resultado);
		 
		 
		 
		 //Suma de dos n�meros decimales negativos
		 resultado=micalculadora.suma(-1.234,-2.2);
		 mitest.compruebavalores(-3.434, resultado);
		
		 
		 //Suma de dos n�meros con precisi�n mayor a 10-3
		 resultado=micalculadora.suma(1.23456,2.2222);
		 mitest.compruebavalores(3.457, resultado);
	
		 ////////////////////////////////////////
		 //Test para las operaciones de resta
		 /////////////////////////////////////////
		
		 //Resta de dos n�meros enteros positivos 
		 resultado=micalculadora.resta(3,5);
		 mitest.compruebavalores(-2,resultado);
		 
		 
		 //Resta de dos n�meros negativos
		 resultado=micalculadora.resta(-3,-5);
		 mitest.compruebavalores(3,resultado);
		 
		 //Resta  de n�mero negativo y positivo
		 resultado=micalculadora.resta(-3,5);
		 mitest.compruebavalores(8,resultado);
		 
		 
		 //Resta de dos n�meros con decimales
		 resultado=micalculadora.resta(8.353,5.003);
		 mitest.compruebavalores(3.35,resultado);
		 
		//Resta de dos n�meros con decimales
		 resultado=micalculadora.resta(2,5.003);
		 mitest.compruebavalores(-3.003,resultado);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

	

}
