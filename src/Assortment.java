import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assortment {

    private static final List<Good> assortment = new ArrayList<>(Arrays.asList(
            new Fruit("Яблоки", 130),
            new Fruit("Бананы", 150),
            new Fruit("Манго", 200),
            new Fruit("Киви", 170),
            new Fruit("Лимон", 110),
            new Drink("Лимонад", 100),
            new Drink("Сок", 90),
            new Drink("Молочный коктейль", 50),
            new Drink("Холодный чай", 70)
    ));

    public static List<Good> getAssortment() {
        return assortment;
    }

    public static Good getGood(String name) {
        List<Good> found = assortment.stream()
                .filter(g -> g.getName().equals(name))
                .toList();
        if (found == null || found.isEmpty()) {
            System.out.println("Такого товара нет");
        }
        return found.isEmpty() ? null : found.get(0);
    }
}
