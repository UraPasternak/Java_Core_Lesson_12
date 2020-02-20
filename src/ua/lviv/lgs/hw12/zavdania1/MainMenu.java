package ua.lviv.lgs.hw12.zavdania1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

	public static void main(String[] args) {
		Avto avto = new Avto(100, 2005, new Kermo(15), new Dvygun(4));
		List <Avto> areyAvto = new ArrayList<Avto>();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Введіть \"а\", якщо бажаєте вивести toString() даних елементів масиву на консоль");
			System.out.println(
					"Введіть \"б\", якщо бажаєте для всіх обєктів даного масиву засетити одинаковий  обєкт класу Авто");
			String s = scan.nextLine();

			switch (s) {

			case "а": {
				for (int i = 0; i < 10; i++) {
					areyAvto.add(new Avto());
				}
				System.out.println(areyAvto);
				System.out.println("==========================================================================");
				break;
			}
			case "б": {
				for (int i = 0; i < 10; i++) {
					areyAvto.set(i, avto);
				}
				System.out.println(areyAvto);
				System.out.println("==========================================================================");
				break;
			}
			default: System.out.println("Введіть \"а\", або \"б\" !!!");
			}
		}

	}

}
