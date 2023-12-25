import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");

       Scanner scanner = new Scanner(System.in);
        System.out.print("Введите модель кофемашины: ");
        String model = scanner.nextLine();
        System.out.print("Введите максимальное количество кофе для загрузки: ");
        int maxCoffee = scanner.nextInt();
        System.out.print("Введите максимальное количество воды для загрузки: ");
        int maxWater = scanner.nextInt();
        System.out.print("Введите максимальную емкость бака с отработанным кофе: ");
        int maxWasteBin = scanner.nextInt();

        CoffeeMachine coffeeMachine = new CoffeeMachine(model, maxCoffee, maxWater, maxWasteBin);

        System.out.print("Введите количество кофе для загрузки: ");
        int coffeeAmount = scanner.nextInt();
        coffeeMachine.fillCoffee(coffeeAmount);

        System.out.print("Введите количество воды для загрузки: ");
        int waterAmount = scanner.nextInt();
        coffeeMachine.fillWater(waterAmount);

        System.out.println("Выберите действие:");
        System.out.println("1. Приготовить эспрессо");
        System.out.println("2. Приготовить американо");
        System.out.println("3. Очистить бак с отработанным кофе");
        int action = scanner.nextInt();

        boolean success = false;
        switch (action) {
            case 1:
                success = coffeeMachine.makeEspresso();
                break;
            case 2:
                success = coffeeMachine.makeAmericano();
                break;
            case 3:
                coffeeMachine.emptyWasteBin();
                break;
            default:
                System.out.println("Неверное действие!");
                break;
        }

        if (success) {
            System.out.println("Кофе приготовлено!");
        } else {
            System.out.println("Ошибка при приготовлении кофе!");
        }
    }
}
