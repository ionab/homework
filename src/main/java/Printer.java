public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }
    public int getPaper(){
        return this.paper;
    }
    public void print(int copies, int pages) {
        if ((pages * copies) <= this.paper) {
            this.paper -= pages * copies;
        }
    }
}
