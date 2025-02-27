package heranca3;

public class Processador extends Super{
    private String frequencia;
    private Produto produto;

   

    public Processador(String marca, String modelo, String cpcArmaz, String frequencia, Produto produto) {
        super(marca, modelo, cpcArmaz);
        this.frequencia = frequencia;
        this.produto = produto;
    }

    public Processador() {
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nProcessador: \nmarca=" + marca + "\n frequencia=" + frequencia + "\n Modelo=" + Modelo + "\n";
    }

    
    
}

