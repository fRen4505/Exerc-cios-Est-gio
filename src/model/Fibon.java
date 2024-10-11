package model;
import java.util.ArrayList;

public class Fibon {
    private Integer inserido;
    private ArrayList<Integer> sequencia = new ArrayList<>();
    private int val;

    public int getInserido(){
        return inserido;
    }
    
    public ArrayList<Integer> getSequencia(){
        return sequencia;
    }

    public boolean testFibonacci(){
        sequencia.add(0);
        sequencia.add(1);

        for (int i = 1; i < 18 ; i++) {
            val = sequencia.get(i) + sequencia.get(i - 1);
            sequencia.add(val);
        }

        if (sequencia.contains(inserido)) {
            return true;
        } else {
            return false;
        }
    }

    public Fibon(int ins){
        this.inserido = ins;
    }
}
