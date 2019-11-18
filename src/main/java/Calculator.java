public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int canAdd() {
        return this.num1 + this.num2;
    }

    public int canSubtract() {
        return this.num1 - this.num2;
    }

    public int canMultiply() {
        return this.num1 * this.num2;
    }

    public double canDivide() {
        return this.num1 / this.num2;
    }
}
