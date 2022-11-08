public class Fish extends Pet{
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void initializeActions() {
        setAttention(2);
        setSleep(9);
        setEat(12);

    }

    @Override
    public String getType() {
        return "Fish";
    }

    @Override
    public String act() {
        StringBuilder sb = new StringBuilder();
        if (isSleeping()) {
            sb.append("\nThe fish, " + getName() + ", was sleepy and took a nap.");
        } else if (needsFood()) {
            sb.append("\nThe fish, " + getName() + ", was hungry and ate.");
        }else if (needAttention()) {
            sb.append("\nThe fish, " + getName() + ", sought your attention.");
        }
        String[] other = {
                "The fish, " + getName() + " swam to the bottom",
                "The fish, " + getName() + " swim back and forth freely",
                "The fish, " + getName() + " nibbled on the plants.",
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
