package ua.lviv.lgs.hw12.zavdania3;

public class Main {

	public static void main(String[] args) {
		MyArrayList a = new MyArrayList();
		a.add(25);
		a.add(30);
		a.add("25");
		a.add("cjvkj");
		a.add('h');
		a.add(1235);
		a.add(0.25);
		a.add(25f);
		
		a.remove(5);
		a.remove(3);
		a.remove(7);

	}

}
