package Builder;

public class Ali extends Ogretmen implements IBilgi{
	public Ali() {
		super();
	}
	@Override
	void isimGetir() {
		System.out.println("Ali ��retmen se�ildi.");
	}
	@Override
	public String bilgiDuzeyi() {
		return "Bilgi duzeyi K�t�.";	
	}
}
	