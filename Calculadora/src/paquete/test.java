package paquete;

public class test {
	
	public test()
	{
		//constructor de la clase test 
	}
	
	
	public void  compruebavalores(double a, double b)
	{
		
		double diferencia;
	
		diferencia=a-b;
		
		if(Math.abs(diferencia)>=0.001 )
		{    
			System.out.println( "Error " +a+ " distinto de " +b);
		}
	   
	}
	
}
