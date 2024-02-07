public class Fruit implements Good, ByWeight {
    final int DEFAULT_WEIGHT = 100;
    private String name;
    private int cost;
    private int weight;

    public Fruit(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.weight = DEFAULT_WEIGHT;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
        cost = cost * (int) ((double) weight / (double) DEFAULT_WEIGHT);
    }

    @Override
    public String toString() {
        return name + " " + weight + "гр. " + cost;
    }
}
