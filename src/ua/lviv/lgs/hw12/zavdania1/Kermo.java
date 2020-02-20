package ua.lviv.lgs.hw12.zavdania1;

public class Kermo {
	private int dKolesa;
	private String material;
	
	public Kermo(int dKolesa) {
		super();
		this.dKolesa = dKolesa;
		this.material = "Шкіра";
	}
	public Kermo(int dKolesa, String material) {
		super();
		this.dKolesa = dKolesa;
		this.material = material;
	}
	@Override
	public String toString() {
		return "Kermo [dKolesa=" + dKolesa + ", material=" + material + "]";
	}
}
