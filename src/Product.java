
public class Product implements IProduct{
	
	public Product()
	{
		Tekerlek();
	}

	public void Tekerlek()
	{
		System.out.println("4 adet tekerlek yerlesitirildi");
		IcAksam();
	}
	
	public void IcAksam()
	{
		System.out.println("Aracin ic aksami hazirlandi");
		Kaporta();
	}
	
	public void Kaporta()
	{
		System.out.println("Kaporta montaji gerceklesti");
		Bagaj();
	}
	
	public void Bagaj()
	{
		System.out.println("Bagaj modulu eklendi");
	}
	
	public void RenkSecimi(RenkCesidi secim)
	{
		System.out.println("Renk secenegi"+" "+secim+ "olarak guncellendi.");
		
	}
	
	

		
}

