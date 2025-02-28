package interface2;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
       return "Qua-Qua";
    }

    @Override
    public String comer() {
        return "Peixe";
    }

}
