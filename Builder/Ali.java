package Builder;

public class Ali extends Ogretmen implements IBilgi{
	public Ali() {
		super();
	}
	@Override
	void isimGetir() {
		System.out.println("Ali öðretmen seçildi.");
	}
	@Override
	public String bilgiDuzeyi() {
		return "Bilgi duzeyi Kötü.";	
	}
}
	