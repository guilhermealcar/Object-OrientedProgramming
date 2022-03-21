package pacoteA;

public class ClassA {

    public int primeiro;
    int segundo; // package private
    private int terceiro;
    protected int quarto; // package private + filhos

    private int getTerceiro(){
        return this.terceiro;
    }
}
