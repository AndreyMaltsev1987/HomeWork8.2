public class CoffeeMachine {
    private String model;
    private int maxGroundCoffee;
    private int maxWater;
    private int maxWasteBin;
    private int milkCapacity;
    private int maxWholeCoffee;
    private int currentGroundCoffee;
    private int currentWater;
    private int currentWasteBin;
    private int currentMilk;
    private int currentWholeCoffee;

    public CoffeeMachine(String model, int maxGroundCoffee, int maxWater, int maxWasteBin, int milkCapacity, int maxWholeCoffee) {
        this.model = model;
        this.maxGroundCoffee = maxGroundCoffee;
        this.maxWater = maxWater;
        this.maxWasteBin = maxWasteBin;
        this.milkCapacity = milkCapacity;
        this.maxWholeCoffee = maxWholeCoffee;
    }

    public void fillGroundCoffee(int amount) {
        currentGroundCoffee = Math.min(amount, maxGroundCoffee);
    }

    public void fillWater(int amount) {
        currentWater = Math.min(amount, maxWater);
    }

    public void fillMilk(int amount) {
        currentMilk = Math.min(amount, milkCapacity);
    }

    public void fillWholeCoffee(int amount) {
        currentWholeCoffee = Math.min(amount, maxWholeCoffee);
    }

    public void emptyWasteBin() {
        currentWasteBin = 0;
    }

    public boolean makeAmericano() {
        if (currentWater < 100 || currentGroundCoffee < 22 || currentWasteBin >= maxWasteBin) {
            return false;
        }
        currentWater -= 100;
        currentGroundCoffee -= 22;
        currentWasteBin++;
        return true;
    }

    public boolean makeLatte(int milkAmount) {
        if (currentWater < 30 || currentGroundCoffee < 22 || currentMilk < milkAmount || currentWasteBin >= maxWasteBin) {
            return false;
        }
        currentWater -= 30;
        currentGroundCoffee -= 22;
        currentMilk -= milkAmount;
        currentWasteBin++;
        return true;
    }

}
