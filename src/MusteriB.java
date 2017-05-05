
public class MusteriB {
	
	public static int B_Musteri_Sayisi=0;
	
	public  MusteriB()
	{
		B_Musteri_Sayisi++;
		System.out.println("Sisteme +1 B Müsteri girisi yapildi..");
		IProduct product=new ProductFactory().makeProduct();
	}
	
	
	
	public static void ToplamMusteriSayisiB()
	{
		System.out.println("Toplamda"+" "+B_Musteri_Sayisi+" adet B musterisi mevcut");
	}
	

}
