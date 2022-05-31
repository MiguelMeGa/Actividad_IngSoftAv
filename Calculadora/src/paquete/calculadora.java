package paquete;

public class calculadora {

	public calculadora()
	{
		
		
	}
	
	////////////////////////////////////////
	//             M�todo de la suma
	////////////////////////////////////////
	
	public double suma (double a, double b)
	{
		
		return a+b;//Se devuelve la suma de a +b
	}
	
	//////////////////////////////////////////
	// 			M�todo para la resta
	/////////////////////////////////////////
	
	public double resta(double a, double b)
	{
		return a-b;
	}
	
	///////////////////////////////////////////
	// 		M�todo para la multiplicaci�n
	//////////////////////////////////////////
	
	public double multiplicacion(double a, double b)
	{
		return a*b;
	}
	
	
	//////////////////////////////////////////
	// M�todo para la divisi�n
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
		double resultado=0,dif1=0,dif2=0;
		double aprox=0,candidato=0;
		
		//Se comienza por el 0
		while((candidato*candidato)<a)
		{ 
			aprox=candidato;
			candidato+=0.0001;   //Se suma una diezmilesima 
		}
		
		resultado=candidato;
		return resultado;
		
	}
	
	
}
