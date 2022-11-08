public class Cat extends Pet {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void initializeActions() {
        setAttention(7);
        setSleep(10);
        setEat(4);
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String act() {
        initializeActions();
        StringBuilder sb = new StringBuilder();
        if (isSleeping()) {
            sb.append("\nThe cat, ").append(getName()).append(", was sleepy and took a nap.");
        } else if (needsFood()) {
            sb.append("\nThe cat, ").append(getName()).append(", was hungry and ate.");
        }else if (needAttention()) {
            sb.append("\nThe cat, ").append(getName()).append(", sought your attention.");
        }

        String[] other = {
                "The cat, " + getName() + " was bored and watched tv",
                "The cat, " + getName() + " took some cat nip",
                "The cat, " + getName() + " was bored and groomed itself",
        };

        int i = getRand().nextInt(other.length);
        if (i != 0){
            sb.append("\n").append(other[i - 1]);
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%-10s %s", getType(), super.toString());
    }
}
