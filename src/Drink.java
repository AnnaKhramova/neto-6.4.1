public class Drink implements Good {
    private String name;
    private int cost;

    public Drink(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " " + cost;
    }
}
