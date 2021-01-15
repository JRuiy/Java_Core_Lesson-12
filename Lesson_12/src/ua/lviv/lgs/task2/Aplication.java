package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aplication {

	enum Seasons {
		WINTER, SPRING, SUMMER, FALL;

	}

	enum Month {
		JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
		MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
		SEPTEMBER(30, Seasons.FALL), OCTOBER(31, Seasons.FALL), NOVEMBER(30, Seasons.FALL),
		DECEMBER(31, Seasons.WINTER);

		int days;
		Seasons seasons;

		private Month(int days, Seasons seasons) {
			this.days = days;
			this.seasons = seasons;
		}

		public int getDays() {
			return days;
		}

		public Seasons getSeasons() {
			return seasons;
		}
	}

	static void menu() {
		System.out.println("Ќатисн≥ть 1 дл€ того, щоб перев≥рити чи Ї такий м≥с€ць");
		System.out.println("Ќатисн≥ть 2 дл€ того, щоб показати м≥с€ц≥ ц≥Їњ пори року");
		System.out.println("Ќатисн≥ть 3 дл€ того, щоб показати €к≥ м≥с€ц≥ мають таку ж к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 4 дл€ того, щоб показати €к≥ м≥с€ц≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 5 дл€ того, щоб показати €к≥ м≥с€ц≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 6 дл€ того, щоб показати наступну пору року");
		System.out.println("Ќатисн≥ть 7 дл€ того, щоб показати попередню пору року");
		System.out.println("Ќатисн≥ть 8 дл€ того, щоб показати, €к≥ м≥с€ц≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 9 дл€ того, щоб показати, €к≥ м≥с€ц≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 10 дл€ того, щоб показати чи вказаний м≥с€ць маЇ парну к≥льк≥сть дн≥в");
	}

	public static void main(String[] args) {

		ArrayList<Seasons> seasons = new ArrayList<Seasons>();
		if (!seasons.isEmpty()) {
			seasons.clear();
		}
		{
			Collections.addAll(seasons, Seasons.values());
		}
		ArrayList<Month> months = new ArrayList<Month>();
		if (!months.isEmpty()) {
			months.clear();
		}
		{
			Collections.addAll(months, Month.values());
		}
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("¬вед≥ть м≥с€ць: ");
				sc = new Scanner(System.in);
				String monthIn = sc.next().toUpperCase();
				
				boolean flag = false;

				for (int i = 0; i < months.size(); i++) {
					if (months.get(i).toString().equals(monthIn)) {
						System.out.println("ћ≥с€ць ≥снуЇ");
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}
				break;
			}
			case "2": {
				System.out.println("¬вед≥ть пору року: ");
				sc = new Scanner(System.in);
				String seasonIn = sc.next().toUpperCase();

				boolean flag = false;

				for (int i = 0; i < seasons.size(); i++) {
					if (seasons.get(i).toString().equals(seasonIn)) {
						flag = true;
					}
				}

				if (flag) {
					for (Month m: months) {
						if (m.getSeasons().name().equals(seasonIn)) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					System.out.println("“акоњ пори року не ≥снуЇ");
				}
				break;
			}
			case "3":{
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥");
				sc = new Scanner(System.in);
				int monthDays = sc.nextInt();
				
				boolean flag = false;
				
				for (Month m : months) {
					if (m.getDays() == monthDays) {
						flag = true;
					}
				}
				
				if(flag) {
					for (Month m : months) {
						if (m.getDays() == monthDays) {
							System.out.println(m);
						}
					}
				}
				if(!flag) {
					System.out.println("ћ≥с€ц€ з такою к≥лькостю дн≥в не ≥снуЇ");
				}
				break;
			}
			case "5":{
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥");
				sc = new Scanner(System.in);
				int monthDays = sc.nextInt();
				
				boolean flag = false;
				
				for (Month m : months) {
					if (m.getDays()>monthDays) {
						flag = true;
					}
				}
				
				if(flag) {
					for (Month m : months) {
						if(m.getDays()>monthDays) {
							System.out.println(m);
						}
					}
				}
				if(!flag) {
					System.out.println("ћ≥с€ц≥в з б≥льшою к≥лькостю дн≥в не ≥снуЇ");
				}
				break;
			}
			case "6":{
				System.out.println("¬вед≥ть пору року: ");
				sc = new Scanner(System.in);
				String seasonIn = sc.next().toUpperCase();
				
				boolean flag = false;
				
				for (int i = 0; i < seasons.size(); i++) {
					if(seasons.get(i).toString().equals(seasonIn)) {
						flag = true;
					}
				}
				
				if (flag) {
					Seasons sea2 = Seasons.valueOf(seasonIn);
					int ordinal = sea2.ordinal();
					
					if (ordinal == (seasons.size()-1)) {
						ordinal = 0;
						System.out.println(seasons.get(ordinal));
					}else {
						System.out.println(seasons.get(ordinal+1));
					}
				}
				break;
			}
			case "7":{
				System.out.println("¬вед≥ть пору року: ");
				sc = new Scanner(System.in);
				String seasonIn = sc.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s: seasons) {
					if(s.name().equals(seasonIn)) {
						flag = true;
					}
				}
				
				if (flag) {
					Seasons sea2 = Seasons.valueOf(seasonIn);
					int ordinal = sea2.ordinal();
					
					if (ordinal == 0) {
						ordinal = seasons.size()-1;
						System.out.println(seasons.get(ordinal));
					}else {
						System.out.println(seasons.get(ordinal-1));
					}
				}
				break;
			}
			case "8":{
				for (Month m : months) {
					if(m.getDays() % 2 == 0) {
						System.out.println("ћ≥с€ц≥, €к≥ мають парну к≥льк≥сть дн≥в: " + m);
					}	
				}
				break;
			}
			case "9":{
				for (Month m : months) {
					if(m.getDays() % 2 != 0) {
						System.out.println("ћ≥с€ц≥, €к≥ мають непарну к≥льк≥сть дн≥в: " + m);
					}	
				}
				break;
			}
			case "10":{
				System.out.println("¬вед≥ть м≥с€ць: ");
				sc = new Scanner(System.in);
				String monthIn = sc.next().toUpperCase();
				
				boolean flag = false;
				
				for (Month m : months) {
					if (m.name().equals(monthIn)) {
						flag = true;
					}
				}
				
				Month mon2 = Month.valueOf(monthIn);
				
				
				if(flag) {
					if(mon2.getDays() % 2 == 0) {
						System.out.println("ƒаний м≥с€ць маЇ парну к≥льк≥сть дн≥в");
					}else {
						System.out.println("ƒаний м≥с€ць маЇ непарну к≥льк≥сть дн≥в");
					}
				}
				if(!flag) {
					System.out.println("¬казаного м≥с€ц€ не ≥снуЇ");
				}
			}
			}
		}
	}
}
