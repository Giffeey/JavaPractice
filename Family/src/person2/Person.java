package person2;

import java.util.ArrayList;

public class Person {

    public static int slave = 0;
    public static int nobility = 1;
    private String name;
    private String nickname;
    private int status;
    private ArrayList<Person> slaves;

    public Person(String name, String nickname, int status) {
        this.name = name;
        this.nickname = nickname;
        this.status = status;
        if (status == 1) {
            slaves = new ArrayList<Person>();
        }

    }

    public Person(String person) {
        String[] parts = person.split(":");
        name = parts[0];
        nickname = parts[1];
        status = Integer.parseInt(parts[2]);
        if (status == 1) {
            slaves = new ArrayList<Person>();
        }
    }

    public void addSlave(Person p) {
        if (status == 1) {
            slaves.add(p);
        } else {
            System.out.println("Error: can't add slave. Only nobility could have slaves!");
        }
    }

    public ArrayList<Person> getSlaves() {
        if (slaves != null) {
            return slaves;
        } else {
            return null;
        }
    }

    public String getStringStatus() {
        if (status == 0) {
            return "SLAVE";
        } else if (status == 1) {
            return "NOBILITY";
        } else {
            return "UNKNOWN";
        }
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "[" + name + " or " + nickname + " - " + getStringStatus() + "]";
    }
}
