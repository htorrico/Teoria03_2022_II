
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		.
	
		Persona Hugo= new Persona();
		Hugo.setDNI("45524520");
		Hugo.setNombres("Hugo Felipe");
		Hugo.setSueldo(1000);
		
		Persona Jose= new Persona();
		Jose.setDNI("45524520");
		Jose.setNombres("Hugo Felipe");
		Jose.setSueldo(7000);
				
		Persona Adriana= new Persona("71185256","Adriana",10000);		
		Persona Gabriel= new Persona("34324234","Gabriel",10000);
					
		
		Adriana.CalcularSueldoNeto();
		Hugo.CalcularSueldoNeto();
		
		//Impuesto es:
		System.out.println("Impuesto de Adriana es");		
		System.out.println(Adriana.getImpuesto());
		System.out.println("Sueldo Neto de Adriana es");
		System.out.println(Adriana.getSueldoNeto());
		System.out.println("Cantidad Personas");	
		
		Persona Miguel= new Persona("34324234","Miguel",10000);		
		
		System.out.println(Persona.getCantidad());
		
		//System.out.println(Hugo.getSueldoNeto());
		
		
	
					
	}
	
	public static void Ejemplo01()
	{
		Alumno a1= new Alumno();
		a1.setNombres("Reyna Victoria");		
		Alumno a2= new Alumno(5);
		Alumno a3= new Alumno(1,"Hugo Felipe","Torrico Márquez");
				
		System.out.println(a1.getNombres());		
		
		System.out.println(a1.getCodigo());
	    System.out.println(a2.getCodigo());
	    System.out.println(a3.getCodigo());
		
	}

}
