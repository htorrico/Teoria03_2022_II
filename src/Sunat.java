
public  class Sunat {
	
	public static double ImpuestoSueldo=0.15;
	
	public static double ImpuestoReal(double Sueldo)
	{
		double Impuesto=0;
		double SueldoAnual= Sueldo*12;
		
		if(SueldoAnual<=23000)
			Impuesto=Sueldo*0.08;
		if(SueldoAnual>23000 && SueldoAnual<=92000 )
			Impuesto=Sueldo*0.14;
		if(SueldoAnual>92000  )
			Impuesto=Sueldo*0.30;			
		return Impuesto;
	}
}
