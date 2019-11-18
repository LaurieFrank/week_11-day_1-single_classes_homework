public class WaterBottle {
    private int volume;
    private int drink;

    public WaterBottle(){
        this.volume = 100;
        this.drink = 10;
    }

    public int checkVolume() {
        return this.volume;
    }

    public int takeDrink() {
        return this.volume - this.drink;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume = 100;
    }
}
