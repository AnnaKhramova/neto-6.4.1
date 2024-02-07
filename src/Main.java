import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket();
        while (true) {
            System.out.print("\nВыберите операцию:\n" +
                    "0. Выход из магазина\n" +
                    "1. Вывод доступных товаров\n" +
                    "2. Составить корзину\n" +
                    "3. Просмотр корзины\n" +
                    "4. Оформить заказ\n" +
                    "Ваш выбор: ");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 0:
                    return;
                case 1:
                    printList(Assortment.getAssortment());
                    break;
                case 2:
                    basket.createBasket();
                    break;
                case 3:
                    System.out.println("Ваша корзина:");
                    printList(basket.getBasket());
                    basket.printSum();
                    break;
                case 4:
                    new Order().createOrder(basket);
                    basket = new Basket();
                    break;
                default:
                    System.out.println("Такой операции нет");
                    break;
            }
        }
    }

    static void printList(List<Good> list) {
        for (Good good : list) {
            System.out.println(good);
        }
    }
}
