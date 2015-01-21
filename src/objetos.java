
public class objetos 
{
	//atributos 
	private int Distancia;
	static int cuenta = 0;
	
	//metodos
	
	
	public int suma(int Distancia)
	{
		return this.Distancia + Distancia;
	}
	
	public int getDistancia()
	{
		return Distancia;
	}
	public void setDistancia(int a) {
		Distancia = Math.abs(a);
	}
	
	
	public void hola2()
	{
		System.out.println("Hola publico");
		hola3();
	}
	
	
	private void hola3()
	{
		System.out.println("Hola privado.");
		
	}
	public static void hola() {
		// TODO Auto-generated method stub
		System.out.println("Hola estatico");
	}
	
	//contructor
	objetos()
	{
		Distancia = 1;
		cuenta += 1;
	}
	
	objetos(int a )
	{
		setDistancia(a);
		cuenta += 1;
	}
	
	public int suma(objetos a)
	{
		return this.Distancia + a.Distancia;
	}
	
	public int cuenta()
	{
		return cuenta;
	}
	
}
