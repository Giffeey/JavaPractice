package person;

public class TestPerson {
	public static void main(String[] args) {
		Person karakade = new Person("Karakade:Karakade:1");
		Person yam = new Person("P-Yam:Yam:0");
		Person pin = new Person("P-Pin", "Pin", 0);
		karakade.addSlave(yam);
		karakade.addSlave(pin);
		
		yam.addSlave(pin); // error cannot add slave to slave
		System.out.println(yam);

	}
}

