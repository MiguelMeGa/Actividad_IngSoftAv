package paquete;


public class principal {

	public static void main(String[] args) 
	{
		 double resultado; 
		 
		 //En primer lugar se define un objeto de la clase calculadora
		 calculadora micalculadora=new calculadora();
	     test mitest=new test();
		
	     ////////////////////////////////////////
	     //Test para la opercaion de suma
	     /////////////////////////////////////////
		
         //Suma de dos numeros positivos
		 resultado=micalculadora.suma(1,2);
		 mitest.compruebavalores(3, resultado);
		 
		 //Suma de numero negativo y positivo
		 resultado=micalculadora.suma(-1,2);
		 mitest.compruebavalores(1, resultado);
		 
		 //Comprobacion de indicacion de fallo en el test
		 mitest.compruebavalores(2, resultado);
		 
		 
		 //Suma de dos numeros con decimales
		 resultado=micalculadora.suma(1.234,2.2);
		 mitest.compruebavalores(3.434,resultado);
		 
		 
		 //Suma de dos numeros decimales negativos
		 resultado=micalculadora.suma(-1.234,-2.2);
		 mitest.compruebavalores(-3.434, resultado);
		
		 
		 //Suma de dos numeros con precision mayor a 10-3
		 resultado=micalculadora.suma(1.23456,2.2222);
		 mitest.compruebavalores(3.457, resultado);
	
		 ////////////////////////////////////////
		 //Test para la opercaion de resta
		 /////////////////////////////////////////
		
		 //Resta de dos numeros enteros positivos 
		 resultado=micalculadora.resta(3,5);
		 mitest.compruebavalores(-2,resultado);
		 
		 
		 //Resta de dos numeros negativos
		 resultado=micalculadora.resta(-3,-5);
		 mitest.compruebavalores(2,resultado);
		 
		 //Resta  de numero negativo y positivo
		 resultado=micalculadora.resta(-3,5);
		 mitest.compruebavalores(-8,resultado);
		 
		 
		 //Resta de dos numeros con decimales
		 resultado=micalculadora.resta(8.353,5.003);
		 mitest.compruebavalores(3.35,resultado);
		 
		 //Resta de dos numeros con decimales
		 resultado=micalculadora.resta(2,5.003);
		 mitest.compruebavalores(-3.003,resultado);
		 
		 
		 /////////////////////////////////////////////////
		 //Test para las operacion de  multiplicacion
		 /////////////////////////////////////////////////
		 
		 //Multiplicacion de 2 numeros enteros
		 resultado=micalculadora.multiplicacion(3,5);
		 mitest.compruebavalores(15, resultado);
		 
		 //Se comprueba la propiedad conmutativa 
		 resultado=micalculadora.multiplicacion(3,5);
		 mitest.compruebavalores(15, resultado);
		 
		 //Se comprueba si se marca el error
		 resultado=micalculadora.multiplicacion(5,5);
		 mitest.compruebavalores(20, resultado);
		 
		 //Multiplicacion de numero positivo y negativo
		 resultado=micalculadora.multiplicacion(-3,5);
		 mitest.compruebavalores(-15, resultado);
		 
		 //Multiplicacion de dos numeros negativos
		 resultado=micalculadora.multiplicacion(-4,-5);
		 mitest.compruebavalores(20, resultado);
		 
		 
		 //Multiplicacion de dos numeros decimales
		 resultado=micalculadora.multiplicacion(3.123,4.24);
		 mitest.compruebavalores(13.242, resultado);
		 
		 
		 //Multiplicacion de positivo por cero
		 resultado=micalculadora.multiplicacion(7,0);
		 mitest.compruebavalores(0, resultado);
		 
		 //Multiplicacion de negativo por cero
		 resultado=micalculadora.multiplicacion(0,-9);
		 mitest.compruebavalores(0, resultado);
		 
		 //Multiplicacion de decimal por cero
		 resultado=micalculadora.multiplicacion(2.64,0);
		 mitest.compruebavalores(0, resultado);
		 
		 
		 /////////////////////////////////////////////
		 //Test para la operacion de division
		 /////////////////////////////////////////////
		 
		 
		 //Division de 2 numeros enteros
		 resultado=micalculadora.division(3,5);
		 mitest.compruebavalores(0.6, resultado);
		 
		 //Division de 1 entero negativo y otro entero positivo
		 resultado=micalculadora.division(-3,5);
		 mitest.compruebavalores(-0.6, resultado);
		 
		 //Division de 2 enteros negativos
		 resultado=micalculadora.division(-8,-5);
		 mitest.compruebavalores(1.6, resultado);
		 
		 //Division de 2 numeros con decimales
		 resultado=micalculadora.division(3.2,1.5);
		 mitest.compruebavalores(2.133, resultado);
		 
		 //Comprobacion de error
		 resultado=micalculadora.division(3.2,1.5);
		 mitest.compruebavalores(2.18, resultado);
		 
	   
		 /////////////////////////////////////////////////
		 //Test para la operacion de raiz cuadrada
		 /////////////////////////////////////////////////
		 
		 //Raiz de un numero entero
		 resultado=micalculadora.raiz(9); 
		 mitest.compruebavalores(3, resultado);
		 
		 //Raiz de un numero decimal
		 resultado=micalculadora.raiz(10.3);
		 mitest.compruebavalores(3.209, resultado);
		 
		 //Raiz de un numero proximo a 0
		 resultado=micalculadora.raiz(0.8);
		 mitest.compruebavalores(0.894, resultado);
		 
		 
		 //Raiz de 0
		 resultado=micalculadora.raiz(0);
		 mitest.compruebavalores(0, resultado);
		  
	}

}
