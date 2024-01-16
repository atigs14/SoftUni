package Animals;

public class Animals {
    private String name;
    private int age;
    private String gender;

    public Animals(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        if (gender.isBlank()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return "Default sound";
    }


}
