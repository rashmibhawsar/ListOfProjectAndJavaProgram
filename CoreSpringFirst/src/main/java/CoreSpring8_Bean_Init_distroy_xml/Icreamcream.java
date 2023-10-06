package CoreSpring8_Bean_Init_distroy_xml;

public class Icreamcream {

	public String flavor;

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Icreamcream [flavor=" + flavor + "]";
	}
	public void entry() {

		System.out.println("deliciouus  icecream created");
	}
	public void exit()

	{
		System.out.println(" destroyed ....");
	}
}
