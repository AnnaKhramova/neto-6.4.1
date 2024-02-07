import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {

    private List<Good> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public List<Good> getBasket() {
        return basket;
    }

    public Basket createBasket() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите название товара или \"end\": ");
            String goodName = scanner.nextLine();
            if (goodName.equals("end")) {
                break;
            } else {
                Good good = Assortment.getGood(goodName);
                if (good == null) {
                    continue;
                }
                if (good.getClass().equals(Fruit.class)) {
                    System.out.println("\nВведите вес в граммах: ");
                    int weight = scanner.nextInt();
                    scanner.nextLine();
                    ((Fruit) good).setWeight(weight);
                }
                this.basket.add(good);
                System.out.println("Добавлено!");
            }
        }
        return this;
    }

    public void printSum() {
        System.out.println("Итого: " + getSum());
    }

    public int getSum() {
        return basket.stream()
                .map(Good::getCost)
                .reduce(0, Integer::sum);
    }
}
