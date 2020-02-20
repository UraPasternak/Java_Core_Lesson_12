package ua.lviv.lgs.hw12.zavdania3;

import java.util.ArrayList;


public class MyArrayList extends ArrayList{

	@Override
	public boolean add(Object e) {
		System.out.println("Обєкт додано!");
		return false;
	}

	@Override
	public Object remove(int index) {
		System.out.println("Обєкт за індексом " + index + " видалено!");
		return null;
	}

}
