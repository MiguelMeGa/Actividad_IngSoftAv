package paquete;
import java.text.DecimalFormat;

public class test {
	
	
	public test()
	{
		
		
	}
	private static final DecimalFormat df = new DecimalFormat("0.000");
	
	public void  compruebavalores(double a, double b)
	{
		double x,y;
		x=formato3decimales(a);
		y=formato3decimales(b);
		
		if(x!=y)
		{    
			System.out.println( "Error " +x+ " distinto de " +y);
		}
		else
		{
			
		}
	   
	}
	
	private double formato3decimales(double num)
	{
		double numero,decimal,vuelta;
		int entero;
		
		
		numero=num*1000;       //Se toma el n�mero en cuest��n
		entero=(int)(numero);  //se toma la parte entera
		
		decimal=numero-entero; //Nos quedamos con la parte decimal
		
		
		if(decimal>0.5)        //Si la parte decimal es mayor que 0,5
		{
			
			entero=entero+1; //Se suma 1 a la parte entera
			
		}
		//En caso contrario uno se queda donde est�
		
		vuelta=(double)(entero/1000);
		
		return vuelta; 

	}
	
  

}
