package PhoneBook;

import java.util.*;

public class phoneBookMain {

	static String[] people = {};
	static Person p1;
	static String firstName, lastName, phoneNumber, street, city, state, zip;
	static int searchN;
	static String personInfo;
	static String contactList;
	static int searchP;
	static String pInfo;

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		int input;
		do {
			bookMain();
			input = num.nextInt();
			switch (input) {
			case 1:
				if (input == 1) {
					String[] addP = new String[people.length + 1];
					for (int i = 0; i < people.length; i++) {
						addP[i] = people[i];
					}
					String info = addPerson();
					System.out.println("\nNew contact added: \n" + info + "\n");
					addP[addP.length - 1] = info;
					people = addP;
					break;
				}

			case 2:
				if (input == 2) {
					searchFor(searchN, personInfo);

					break;
				}
			case 3:
				if (input == 3) {
					System.out.println("----Your Contact List----");
					contactL();
					break;
				}
			case 4:
				if (input == 4) {
					updateOrDelete(searchP, pInfo);
					break;
				}
			case 5:
			default:
				if (input == 5) {
					System.out.println("----Closing the app----");
				}

			}

		} while (input != 5);

	}

	public static void bookMain() {
		Scanner num = new Scanner(System.in);
		// Print menu
		System.out.println("~~This Here Is Your Phonebook App~~");
		System.out.println("Enter 1 to add Person's information");
		System.out.println("Enter 2 to search for a Person");
		System.out.println("Enter 3 to display contact list");
		System.out.println("Enter 4 to update/delete a Person");
		System.out.println("Enter 5 to exit the app");

	}

	public static String addPerson() {
		Scanner num = new Scanner(System.in);

		System.out.println("Please enter first name");
		firstName = num.nextLine();

		System.out.println("Please enter last name");
		lastName = num.nextLine();

		System.out.println("Please enter the street");
		street = num.nextLine();

		System.out.println("Please enter the city");
		city = num.nextLine();

		System.out.println("Please enter the state");
		state = num.nextLine();

		System.out.println("Please enter the zip code");
		zip = num.nextLine();

		System.out.println("Please enter phone number");
		phoneNumber = num.nextLine();

		p1 = new Person(firstName, lastName, phoneNumber, street, city, state, zip);
		String contact = p1.getFirstName() + ", " + p1.getLastName() + ", " + p1.address.getStreet() + ", "
				+ p1.address.getCity() + ", " + p1.address.getState() + ", " + p1.address.getZip() + ", ("
				+ p1.getPhoneNumber().substring(0, 3) + ")-" + p1.getPhoneNumber().substring(3, 6) + "-"
				+ p1.getPhoneNumber().substring(6, 10);
		System.out.println("-------------------------------");
		bookMain();
		return contact;
	}

	public static void searchFor(int x, String y) {
		Scanner num = new Scanner(System.in);
		System.out.println(
				"\n1. Search by first name, last name, street, city, state or zip code \n2. Search by telephone number");
		x = num.nextInt();
		for (int i = 0; i < people.length; i++) {
			if (x == 1) {
				System.out.println("\nEnter contact information: ");
				y = num.next();
				if (people[i].contains(y)) {
					System.out.println(people[i]);
					System.out.println("--------------------------");
					break;
				}

			}

			else if (x == 2) {
				System.out.println("\nEnter phone number: ");
				y = num.next();
				y = " (" + y.substring(0, 3) + ")-" + y.substring(3, 6) + "-" + y.substring(6, 10);
				if (people[i].contains(y)) {
					System.out.println(people[i]);
					System.out.println("--------------------------");
					break;
				}
			}
		}
	}

	public static void contactL() {

		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
		System.out.println("--------------------------");

	}

	public static void updateOrDelete(int x, String y) {
		Scanner num = new Scanner(System.in);
		System.out.println("\n1.Update contact using phone number \n2. Delete contact using phone number");
		x = num.nextInt();
		for (int i = 0; i < people.length; i++) {
			if (x == 1) {
				System.out.println("\nPhone Number: ");
				y = num.next();
				y = " (" + y.substring(0, 3) + ")-" + y.substring(3, 6) + "-" + y.substring(6, 10);
				if (people[i].contains(y)) {
					System.out.println(people[i]);
					String updateP = addPerson();
					people[i] = updateP;
					System.out.println(people[i]);
					System.out.println("--------------------------");

				}
			} else if (x == 2) {
				System.out.println("\nPhone Number: ");
				y = num.next();
				y = " (" + y.substring(0, 3) + ")-" + y.substring(3, 6) + "-" + y.substring(6, 10);
				if (people[i].contains(y)) {
					people[i] = null;
					System.out.println("--------------------------");
					break;
				}
			}
		}
	}
}
