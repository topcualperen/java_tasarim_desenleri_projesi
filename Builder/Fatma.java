package Builder;

public class Fatma extends Ogretmen implements IBilgi{
	public Fatma() {
		super();
	}
	@Override
	void isimGetir() {
		System.out.println("Fatma ��retmen se�ildi.");
	}
	@Override
	public String bilgiDuzeyi() {
		return "Bilgi duzeyi iyi.";	
	}
}