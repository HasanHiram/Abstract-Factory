
public class MusteriA {
	
	public static int A_Musteri_Sayisi=0;
	
	public  MusteriA()
	{
		A_Musteri_Sayisi++;
		System.out.println("Sisteme +1 A Müsteri girisi yapildi..");
		IProduct product=new ProductFactory().makeProduct();
	}
		
	public void RenkSec(RenkCesidi secim)
	{
		System.out.println("Renk cesidi"+" "+secim+"olarak belirtildi.");
	}
	

	
	
	public static void ToplamMusteriSayisiA()
	{
		System.out.println("Toplamda"+" "+A_Musteri_Sayisi+" adet A musterisi mevcut");
	}
	

}
