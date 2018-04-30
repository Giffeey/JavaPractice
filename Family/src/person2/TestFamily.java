package person2;

public class TestFamily {
	public static void main(String[] args) {
		Person karakade = new Person("Karakade:Karakade:1");
		Person yam = new Person("P-Yam:Yam:0");
		Person pin = new Person("P-Pin", "Pin", 0);
		karakade.addSlave(yam);
		karakade.addSlave(pin);
		
		yam.addSlave(pin); // error cannot add slave to slave
		
		Person dej = new Person("Muen Sunthorndeja", "Por Dej", 1);
		dej.addSlave(new Person("Joy", "Joy", 0));

		System.out.println("----------");
		Family family = new Family("Augya Horathibordee");
		family.add(dej);
		family.add(karakade);
		System.out.println("Find P-Yam: " + family.find("P-Yam"));	
		System.out.println("----------");


		family.displayFamily();
		System.out.println();
		System.out.println("Master of " + yam +" is " +family.findMaster(yam));
        }
}

