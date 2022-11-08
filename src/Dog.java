public class Dog extends Pet{
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String act() {

        return null;
    }

    @Override
    public String toString() {
        return getType() + "\t" + super.toString();
    }
}
