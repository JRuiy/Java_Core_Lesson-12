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
		System.out.println("�������� 1 ��� ����, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2 ��� ����, ��� �������� ����� ���� ���� ����");
		System.out.println("�������� 3 ��� ����, ��� �������� �� ����� ����� ���� � ������� ���");
		System.out.println("�������� 4 ��� ����, ��� �������� �� ����� ����� ����� ������� ���");
		System.out.println("�������� 5 ��� ����, ��� �������� �� ����� ����� ����� ������� ���");
		System.out.println("�������� 6 ��� ����, ��� �������� �������� ���� ����");
		System.out.println("�������� 7 ��� ����, ��� �������� ��������� ���� ����");
		System.out.println("�������� 8 ��� ����, ��� ��������, �� ����� ����� ����� ������� ���");
		System.out.println("�������� 9 ��� ����, ��� ��������, �� ����� ����� ������� ������� ���");
		System.out.println("�������� 10 ��� ����, ��� �������� �� �������� ����� �� ����� ������� ���");
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
				System.out.println("������ �����: ");
				sc = new Scanner(System.in);
				String monthIn = sc.next().toUpperCase();
				
				boolean flag = false;

				for (int i = 0; i < months.size(); i++) {
					if (months.get(i).toString().equals(monthIn)) {
						System.out.println("̳���� ����");
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("������ ����� �� ����");
				}
				break;
			}
			case "2": {
				System.out.println("������ ���� ����: ");
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
					System.out.println("���� ���� ���� �� ����");
				}
				break;
			}
			case "3":{
				System.out.println("������ ������� ��� � �����");
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
					System.out.println("̳���� � ����� �������� ��� �� ����");
				}
				break;
			}
			case "5":{
				System.out.println("������ ������� ��� � �����");
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
					System.out.println("̳����� � ������ �������� ��� �� ����");
				}
				break;
			}
			case "6":{
				System.out.println("������ ���� ����: ");
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
				System.out.println("������ ���� ����: ");
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
						System.out.println("̳����, �� ����� ����� ������� ���: " + m);
					}	
				}
				break;
			}
			case "9":{
				for (Month m : months) {
					if(m.getDays() % 2 != 0) {
						System.out.println("̳����, �� ����� ������� ������� ���: " + m);
					}	
				}
				break;
			}
			case "10":{
				System.out.println("������ �����: ");
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
						System.out.println("����� ����� �� ����� ������� ���");
					}else {
						System.out.println("����� ����� �� ������� ������� ���");
					}
				}
				if(!flag) {
					System.out.println("��������� ����� �� ����");
				}
			}
			}
		}
	}
}
