package paquete;

public class calculadora {

	public calculadora()
	{
		//Constructor de la clase calculadora	
	}
	
	////////////////////////////////////////
	//Metodo de la suma
	////////////////////////////////////////
	
	public double suma (double a, double b)
	{
		
		return a+b;//Se devuelve la suma de a +b
	}
	
	//////////////////////////////////////////
	//Metodo para la resta
	/////////////////////////////////////////
	
	public double resta(double a, double b)
	{
		return a-b;
	}
	
	///////////////////////////////////////////
	//Metodo para la multiplicacion
	//////////////////////////////////////////
	
	public double multiplicacion(double a, double b)
	{
		return a*b;
	}
	
	
	//////////////////////////////////////////
	// Metodo para la division
	///////////////////////////////////////////
	
	public double division(double a, double b)
	{
		return a/b;
	}
	
	
	/////////////////////////////////////////////
	//Metodo para la raiz cuadrada de un numero
	////////////////////////////////////////////
	
	public double raiz(double a)
	{
		double resultado=0;
		double candidato=0;
		
		//Se comienza por el 0
		while((candidato*candidato)<a)
		{ 
			candidato+=0.0001;   //Se suma una diezmilesima 
		}
		
		resultado=candidato;
		return resultado;
		
	}

}
