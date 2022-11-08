import java.util.Random;

public abstract class Pet implements Comparable<Pet> {
    private String name;
    private int age;
    private double weight;
    private Random rand;
    private int eat,sleep,attention,curHour;

    public Pet(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.rand = new Random();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public boolean needsFood() {
        return rand.nextInt(25) <= eat;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public boolean isSleeping() {
        return rand.nextInt(25) <= sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public boolean needAttention() {
        return rand.nextInt(25) <= attention;
    }

    public void setAttention(int attention) {
        this.attention = attention;
    }

    public void setCurHour(int curHour) {
        this.curHour = curHour;
    }

    public abstract void initializeActions();

    public abstract String getType();

    public Random getRand() {
        return rand;
    }

    @Override
    public int compareTo(Pet o) {
        return this.getName().compareTo(o.getName());
    }

    public abstract String act();

    @Override
    public String toString() {
        return String.format("%-10s %-5d %-5.2f",getName(),getAge(),getWeight());
    }
}
