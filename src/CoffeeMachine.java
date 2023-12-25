public class CoffeeMachine {
    private String model;
    private int maxCoffee;
    private int maxWater;
    private int maxWasteBin;
    private int milkCapacity;
    private int currentCoffee;
    private int currentWater;
    private int currentWasteBin;
    private int currentMilk;

    public CoffeeMachine(String model, int maxCoffee, int maxWater, int maxWasteBin, int milkCapacity) {
        this.model = model;
        this.maxCoffee = maxCoffee;
        this.maxWater = maxWater;
        this.maxWasteBin = maxWasteBin;
        this.milkCapacity = milkCapacity;
    }

    public void fillCoffee(int amount) {
        currentCoffee = Math.min(amount, maxCoffee);
    }

    public void fillWater(int amount) {
        currentWater = Math.min(amount, maxWater);
    }

    public void fillMilk(int amount) {
        currentMilk = Math.min(amount, milkCapacity);
    }

    public void emptyWasteBin() {
        currentWasteBin = 0;
    }

    public boolean makeEspresso() {
        if (currentWater < 30 || currentCoffee < 22 || currentWasteBin >= maxWasteBin) {
            return false;
        }
        currentWater -= 30;
        currentCoffee -= 22;
        currentWasteBin++;
        return true;
    }

    public boolean makeAmericano() {
        if (currentWater < 100 || currentCoffee < 22 || currentWasteBin >= maxWasteBin) {
            return false;
        }
        currentWater -= 100;
        currentCoffee -= 22;
        currentWasteBin++;
        return true;
    }

    public boolean makeCappuccino(int milkAmount) {
        if (currentWater < 30 || currentCoffee < 22 || currentMilk < milkAmount || currentWasteBin >= maxWasteBin) {
            return false;
        }
        currentWater -= 30;
        currentCoffee -= 22;
        currentMilk -= milkAmount;
        currentWasteBin++;
        return true;
    }

    public boolean makeLatte(int milkAmount) {
        if (currentWater < 30 || currentCoffee < 22 || currentMilk < milkAmount || currentWasteBin >= maxWasteBin) {
            return false;
        }
        currentWater -= 30;
        currentCoffee -= 22;
        currentMilk -= milkAmount;
        currentWasteBin++;
        return true;
    }
}
