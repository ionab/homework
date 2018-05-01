public class Printer {
    private int paper;
    private int volume;

    public Printer(int paper, int volume){
        this.paper = paper;
        this.volume = volume;

    }
    public int getPaper(){
        return this.paper;
    }

    public int getVolume(){
        return this.volume;
    }

    public void print(int copies, int pages) {
        if ((pages * copies) <= this.paper) {
            this.paper -= pages * copies;
            this.volume -= pages * copies;
        }
    }

    public void refill(int new_paper){
        this.paper = new_paper;
    }
}
