package ua.lviv.lgs.hw12.zavdania1;

public class Avto {
	private int horses;
	private int year;
	private Kermo kermo;
	private Dvygun dvigun;
	
	public Avto() {
		super();
		this.horses = RandomZ.ramdomZnach(80,200);
		this.year = RandomZ.ramdomZnach(1999,2010);
		this.kermo = new Kermo(RandomZ.ramdomZnach(10,20));
		this.dvigun = new Dvygun(RandomZ.ramdomZnach(4,8));
	}
	
	public Avto(int horses, int year, Kermo kermo, Dvygun dvigun) {
		super();
		this.horses = horses;
		this.year = year;
		this.kermo = kermo;
		this.dvigun = dvigun;
	}
	public int getHorses() {
		return horses;
	}
	public void setHorses(int horses) {
		this.horses = horses;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Kermo getKermo() {
		return kermo;
	}
	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}
	public Dvygun getDvigun() {
		return dvigun;
	}
	public void setDvigun(Dvygun dvigun) {
		this.dvigun = dvigun;
	}
	@Override
	public String toString() {
		return "Avto [horses=" + horses + ", year=" + year + ", kermo=" + kermo.toString() + ", dvigun=" + dvigun.toString() + "]";
	}
	
	
	
}
