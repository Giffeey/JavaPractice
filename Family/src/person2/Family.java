package person2;

import java.util.ArrayList;

public class Family {

    private String houseName;
    private ArrayList<Person> person;
    private int master;

    public Family(String houseName) {
        this.houseName = houseName;
        person = new ArrayList<Person>();
    }

    public void add(Person p) {
        person.add(p);
        master++;
    }

    public Person find(String name) {

        for (int i = 0; i < master; i++)
            
            for (int j = 0; j<person.get(i).getSlaves().size(); j++)
                
                if (person.get(i).getName().equalsIgnoreCase(name)) 
                    return person.get(i);
            
            
                else if (person.get(i).getSlaves().get(j).getName().equalsIgnoreCase(name))
                    return person.get(i).getSlaves().get(j);
        
                
                
    System.out.print("could not find the person name: "+ name.trim());
        
        return null;
        
    }

    public Person findMaster(Person slave) {
        for (int i = 0; i < master; i++) {
            for (int j = 0; j < person.get(i).getSlaves().size(); j++) {
                if (person.get(i).getSlaves().get(j).equals(slave)) {
                    return person.get(i);
                }
            }
        }

        return null;
    }

    public int getCount() {
        int slave = 0;
        for (int i = 0; i < master; i++) {
            slave += person.get(i).getSlaves().size();
        }
        return person.size() + slave;
    }

    public void displayFamily() {
        System.out.println("Family: " + houseName + " has " + getCount() + " persons");
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
            System.out.println("  " + person.get(i).getSlaves().size() + " Slaves:");
            if (person.get(i).getSlaves().size() > 0) {
                for (int j = 0; j < person.get(i).getSlaves().size(); j++) {
                    System.out.println("   " + person.get(i).getSlaves().get(j));
                }
            }

        }
    }

    @Override
    public String toString() {
        return "Family{" + "houseName=" + houseName + ", person=" + person + " people " + getCount() + '}';
    }

}
