package paquete;
import java.text.DecimalFormat;

public class test {
	
	
	public test()
	{
		
		
	}
	private static final DecimalFormat df = new DecimalFormat("0.000");
	
	public void  compruebavalores(double a, double b)
	{
		
		double diferencia;
	
		diferencia=a-b;
		
		if(Math.abs(diferencia)>=0.001 )
		{    
			System.out.println( "Error " +a+ " distinto de " +b);
		}
		else
		{
			
		}
	   
	}
	

	
  

}
