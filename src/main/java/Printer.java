public class Printer {
    private int sheetsLeft;
    private int pages;
    private int copies;

    public Printer(int sheetsLeft, int copies, int pages){
        this.sheetsLeft = sheetsLeft;
        this.pages = pages;
        this.copies = copies;
    }

    public int hasSheets() {
        return this.sheetsLeft;
    }

    public boolean print(){
        return this.sheetsLeft >= this.pages * this.copies;
    }

    public int reduceSheets() {
        return this.sheetsLeft - this.pages * this.copies;}
}

