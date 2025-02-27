package heranca3;

public class Memoria extends Super{
    private String frequencia;

    public Memoria() {
    }

    public Memoria(String marca, String modelo, String cpcArmaz, String frequencia) {
        super(marca, modelo, cpcArmaz);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nMemoria: \nmarca=" + marca + "\n frequencia=" + frequencia + "\n Modelo=" + Modelo + "\n cpcArmaz="
                + cpcArmaz + "\n";
    }


    

}
