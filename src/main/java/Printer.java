public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }
    public int getPaper(){
        return this.paper;
    }
    public int print(int copies){
        return this.paper -= copies;
    }
}
