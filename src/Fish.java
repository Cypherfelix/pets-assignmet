public class Fish extends Pet{
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String getType() {
        return "Fish";
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
