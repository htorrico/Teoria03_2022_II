
public class Persona {

	//Atributos
	private String DNI;
	private String Nombres;
	private double Sueldo;
	private double SueldoNeto;
	
	
    private static int Cantidad = 0;
    

    public static int getCantidad()
	{
		return Cantidad;
	}
	public void setCantidad(int Cantidad)
	{
		this.Cantidad=Cantidad;
	}
	    
	//Constructores
	public Persona()
	{
		Cantidad++;	
	}
	
	public Persona(String DNI, String Nombres, double Sueldo)
	{
		Cantidad++;	
		this.DNI=DNI;
		this.Nombres=Nombres;
		this.Sueldo=Sueldo;		
	}
	
   	
	//Métodos Públicos
	public String getDNI()
	{
		return this.DNI;
	}
	public void setDNI(String DNI)
	{
		this.DNI=DNI;
	}
	
	public String getNombres()
	{
		return this.Nombres;
	}
	public void setNombres(String Nombres)
	{
		this.Nombres=Nombres;
	}
	
	public double getSueldo()
	{
		return this.Sueldo;
	}
	public void setSueldo(double Sueldo)
	{
		this.Sueldo=Sueldo;
	}
	
	//Lógica de Negocio
	public double getImpuesto()
	{
		return this.Sueldo*Sunat.ImpuestoSueldo;
	}
		
	public double getSueldoNeto()
	{
		return this.SueldoNeto;
	}
	public void CalcularSueldoNeto()
	{
		this.SueldoNeto=this.Sueldo-getImpuesto();				
	}
		
}
