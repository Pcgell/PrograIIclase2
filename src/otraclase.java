
public class otraclase {

	
	public static void main(String[] args)
	{
		objetos obj = new objetos();
		
		obj.setDistancia(-1);
		
		System.out.println(obj.getDistancia());
		
		objetos.hola();
		
		obj.hola2();
		
		objetos distancianegativa = new objetos(-1);
		
		System.out.println(distancianegativa.getDistancia());
		
		System.out.println(distancianegativa.cuenta());
	
	}
}
