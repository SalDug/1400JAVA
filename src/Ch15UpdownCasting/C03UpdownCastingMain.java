package Ch15UpdownCasting;

class Computer{
	private String SN;
	private String CPUSpec;
	private String RAMSpec;
	private String DISKSpec;
	public void PowerON() {
		System.out.println("전원을 켭니다");
	}
	public void PowerOFF() {
		System.out.println("전원을 끕니다");
	}
	public Computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		super();
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
	}
	public String getSN() {
		return SN;
	}
	public void setSN(String sN) {
		SN = sN;
	}
	public String getCPUSpec() {
		return CPUSpec;
	}
	public void setCPUSpec(String cPUSpec) {
		CPUSpec = cPUSpec;
	}
	public String getRAMSpec() {
		return RAMSpec;
	}
	public void setRAMSpec(String rAMSpec) {
		RAMSpec = rAMSpec;
	}
	public String getDISKSpec() {
		return DISKSpec;
	}
	public void setDISKSpec(String dISKSpec) {
		DISKSpec = dISKSpec;
	}
	
}
class Notebook extends Computer{
	int battery;
	public void move() {
		System.out.println("이동합니다");
		battery -= 5;
	}
	public Notebook(String SN, String CPUSpec, String RAMSpec, String DISKSpec, int battery) {
		super(SN, CPUSpec, RAMSpec, DISKSpec);
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Notebook [battery=" + battery + ", getSN()=" + getSN() + ", getCPUSpec()=" + getCPUSpec()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}
	
}

class Tablet extends Computer{
	String PencilNo;
	public void WritePen() {
		System.out.println("Pen으로 씁니다");
	}
	public Tablet(String SN, String CPUSpec, String RAMSpec, String DISKSpec, String PencilNo) {
		super(SN, CPUSpec, RAMSpec, DISKSpec);
		this.PencilNo = PencilNo;
	}
	@Override
	public String toString() {
		return "Tablet [PencilNo=" + PencilNo + ", getSN()=" + getSN() + ", getCPUSpec()=" + getCPUSpec()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() +  "]";
	}
	
}
public class C03UpdownCastingMain {
	public static void ShowInfo(Computer ref) {
		if(ref instanceof Notebook) {
			Notebook NN = (Notebook)ref;	
			System.out.println(NN.toString());
		}
		else if(ref instanceof Tablet) {
			Tablet NT = (Tablet)ref;	
			System.out.println(NT.toString());
		}
		
	}
	public static void main(String[] args) {
		Notebook MYcom = new Notebook("1-2-3-4", "I7", "16G", "1T", 100);
		Tablet MYtab = new Tablet("9-8-7-6", "I3", "8G", "128G", "PEN-123");
		ShowInfo(MYcom);
		ShowInfo(MYtab);
	}

}
