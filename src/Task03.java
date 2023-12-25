import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите модель кофемашины: ");
        String model = scanner.nextLine();
        System.out.print("Введите максимальное количество молотого кофе для загрузки: ");
        int maxGroundCoffee = scanner.nextInt();
        System.out.print("Введите максимальное количество воды для загрузки: ");
        int maxWater = scanner.nextInt();
        System.out.print("Введите максимальную емкость бака с отработанным кофе: ");
        int maxWasteBin = scanner.nextInt();
        System.out.print("Введите размер встроенной емкости для молока: ");
        int milkCapacity = scanner.nextInt();
        System.out.print("Введите размер бака для немолотого кофе: ");
        int maxWholeCoffee = scanner.nextInt();

        CoffeeMachine coffeeMachine = new CoffeeMachine(model, maxGroundCoffee, maxWater, maxWasteBin, milkCapacity, maxWholeCoffee);

        System.out.print("Введите количество молотого кофе для загрузки: ");
        int groundCoffeeAmount = scanner.nextInt();
        coffeeMachine.fillGroundCoffee(groundCoffeeAmount);

        System.out.print("Введите количество воды для загрузки: ");
        int waterAmount = scanner.nextInt();
        coffeeMachine.fillWater(waterAmount);

        System.out.print("Введите количество молока для загрузки: ");
        int milkAmount = scanner.nextInt();
        coffeeMachine.fillMilk(milkAmount);

        System.out.print("Введите количество немолотого кофе для загрузки: ");
        int wholeCoffeeAmount = scanner.nextInt();
        coffeeMachine.fillWholeCoffee(wholeCoffeeAmount);

        System.out.println("Выберите действие:");
        System.out.println("1. Приготовить американо");
        System.out.println("2. Приготовить латте");
        System.out.println("3. Очистить бак с отработанным кофе");
        int action = scanner.nextInt();

        boolean success = false;
        switch (action) {
            case 1:
                success = coffeeMachine.makeAmericano();
                break;
            case 2:
                System.out.print("Введите количество молока для латте: ");
                int latteMilkAmount = scanner.nextInt();
                success = coffeeMachine.makeLatte(latteMilkAmount);
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
