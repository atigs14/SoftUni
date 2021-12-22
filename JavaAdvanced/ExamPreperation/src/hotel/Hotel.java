package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person){
        if (this.capacity > this.roster.size()){
            this.roster.add(person);
        }
    }

    public int getCount(){
        return this.roster.size();
    }

    public boolean remove(String name){
        for (Person p : roster) {
            if (p.getName().equals(name)){
                this.roster.remove(p);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown){
        for (Person p : roster) {
            if (p.getName().equals(name) && p.getHometown().equals(hometown)){
                return p;
            }
        }
        return null;
    }
    public String getStatistics(){
        StringBuilder out = new StringBuilder();

        out.append(String.format("The people in the hotel %s are:%n",this.name));

        for (Person p : roster) {
            out.append(p.toString()).append(System.lineSeparator());
        }
        return out.toString().trim();
    }


}
