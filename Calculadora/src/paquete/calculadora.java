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
	//M�todo para la ra�z cuadrada de un n�mero
	////////////////////////////////////////////
	
	public double raiz(double a)
	{
		double resultado,aprox1=0,aprox2=0,dif1=0,dif2=0;
		double aprox=1,candidato=1;
		
		//Se comienza por el 0
		while((aprox*aprox)<a)
		{ 
			candidato=aprox;
			aprox+=0.5;   //Se suma una unidad 
		}
		dif1=Math.abs(((double)aprox*aprox)-a);
		dif2=Math.abs(a-((double)candidato*candidato));
		
		if(dif2<dif1)
		{
			candidato=aprox;
		}
		else
		{
			
		}
		
		//Primeramente encontramos un n�mero que multiplicado por si mismo se acerque al n�mero a
		aprox1=((double)(candidato*candidato*candidato*candidato+6*(candidato*candidato)*a+(a*a)))/((double)(4*candidato*candidato*candidato+4*candidato*a));
		
		resultado=aprox1;
		return resultado;
		
	}
	
	
}
