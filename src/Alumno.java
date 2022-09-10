
public class Alumno {
 
	//Información confidencial 
	private String Telefono;		
	private int Edad;
	
	//Información Pública.
	private int Codigo;
	private String Nombres;
	private String Apellidos;
		

	public String getNombres()
	{
		return this.Nombres;
	}
	public void setNombres( String Nombres)
	{
		this.Nombres=Nombres;		
	}		
	public int getCodigo()
	{
		return this.Codigo;
	}
	
	
	public String getApellidos()
	{
		return this.Apellidos;
	}
	

	public void setCodigo(int Codigo)
	{
		this.Codigo=Codigo;
	}
	
	
	public String EsMayorEdad()
	{
		String mensaje="Es Mayor Edad";
		if( Edad<18)
		mensaje="Es Menor Edad";
		return mensaje;
	}

	
	public Alumno()
	{
		Codigo=0;
		Nombres="";
		Apellidos="";
		
	}
	public Alumno(int Codigo)
	{
		this.Codigo=Codigo;
	}
	
	public Alumno(int Codigo, String Nombres, String Apellidos )
	{
		
		
	}
		
}






