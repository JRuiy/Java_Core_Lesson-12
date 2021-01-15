package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Aplication {

	static void menu() {
		System.out.println("Натисніть 1 якщо хочете вивести дані колекції");
		System.out.println("Натисність 2 щоб змінити об'єкти масиву");
	}
	
	public static void main(String[] args) {
		
		int range = getRandomValueFromRange(1, 3);
		
		ArrayList<Car> car = new ArrayList<Car>();
		for (int i = 0; i<range; i++) {
			car.add(i, new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1999, 2020),
					new Helm(getRandomValueFromRange(20, 30), "leather"),
					new Engine(getRandomValueFromRange(2, 10))));
		}
		
		while (true) {
			menu();

			Scanner sc = new Scanner(System.in);

			switch (sc.next()) {
			case "1": {
				System.out.println(car);
				break;
			}
			case "2": {
				for (int i =0; i<car.size(); i++) {
					car.set(i, new Car(250, 2020, new Helm(25, "leather"), new Engine(8)));
				}
				System.out.println(car);
				break;
			}
			}
		}
		
	}
	
	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}
}
