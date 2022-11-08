public class Cat extends Pet{
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String getType() {
        return "Cat";
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
