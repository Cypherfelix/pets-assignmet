public class Dog extends Pet{
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void initializeActions() {
        setAttention(9);
        setSleep(13);
        setEat(3);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String act() {
        StringBuilder sb = new StringBuilder();
        if (isSleeping()) {
            sb.append("\nThe dog, " + getName() + ", was sleepy and took a nap.");
        } else if (needsFood()) {
            sb.append("\nThe dog, " + getName() + ", was hungry and ate.");
        }else if (needAttention()) {
            sb.append("\nThe dog, " + getName() + ", sought your attention.");
        }

        String[] other = {
                "The dog, " + getName() + " went for a walk",
                "The dog, " + getName() + " played fetch",
                "The dog, " + getName() + " tore the squeaker out of its toy.",
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
