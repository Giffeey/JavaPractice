package person2;

import java.util.Scanner;

public class TestInputFamily {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter family name: ");
        String famName = input.nextLine();

        Family fam = new Family(famName);

        int x = 0;
        String sentence = "";
        
        do {
            System.out.println("");
            System.out.println("1. add nobility person");
            System.out.println("2. find a person");
            System.out.println("3. display family");
            System.out.println("4. quit");
            System.out.print("Select your choice: ");
            x = input.nextInt();
            
            switch (x) {
                case 1:
                    System.out.print("Enter name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.print("Enter nickname: ");
                    String nickname = input.nextLine();
                    Person person = new Person(name, nickname, 1);
                    fam.add(person);
                    
                    System.out.print("Enter slaves (i.e., Joy:Joy:0) or blank line when done:  ");
                    while (input.hasNextLine()) {
                        sentence = input.nextLine();
                        if (sentence.equals("")) {
                            break;
                        }
                    Person slave = new Person(sentence);
                    person.addSlave(slave);
                    System.out.print("Enter slaves (i.e., Joy:Joy:0) or blank line when done:  ");
                    }
                    
                    break;
                    
                case 2:
                    
                    System.out.print("Enter name to find: ");
                    input.nextLine();
                    String findName = input.nextLine();
                    System.out.println(fam.find(findName));
                    break;
                case 3:
                    fam.displayFamily();
                    break;
          

            }
        } while (x != 4);

        System.out.println("");
        System.out.println("Good day!");

    }
}
