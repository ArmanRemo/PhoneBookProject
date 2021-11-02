package PhoneBook;

//first name, last name, address, phone number
public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
//	private Address myAddress;
	Address address;

	public Person(String firstName, String lastName, String phoneNumber, String street, String city, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = new Address(street, city, state, zip);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
