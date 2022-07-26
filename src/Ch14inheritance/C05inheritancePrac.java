package Ch14inheritance;

class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getsize() {
		return size;
	}
	
}
class ColorTV extends TV{
	int colornum;
	public ColorTV(int size, int colornum) {
		super(size);
		this.colornum = colornum;
	}
	public void printproperty() {
		System.out.printf("%d인치 %d컬러\n", getsize(), colornum);
	}
}
class IPTV extends TV{
	String address;
	int colornum;
	public IPTV(String address, int size, int colornum) {
		super(size);
		this.address = address;
		this.colornum = colornum;
	}
	public void printproperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러\n", address, getsize(), colornum);
	}
}


public class C05inheritancePrac {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printproperty();
		IPTV IPTV = new IPTV("192.1.1.2",32, 2048);
		IPTV.printproperty();

	}

}
