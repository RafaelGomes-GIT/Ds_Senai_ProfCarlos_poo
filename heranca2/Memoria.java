package heranca2;

public class Memoria extends Pc{
    private String cpcd_Armazenamento;

    public Memoria() {
    }

    public Memoria(String marca, String modelo, String cpcd_Armazenamento) {
        super(marca, modelo);
        this.cpcd_Armazenamento = cpcd_Armazenamento;
    }

    public String getCpcd_Armazenamento() {
        return cpcd_Armazenamento;
    }

    public void setCpcd_Armazenamento(String cpcd_Armazenamento) {
        this.cpcd_Armazenamento = cpcd_Armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", cpcd_Armazenamento=" + cpcd_Armazenamento + ", modelo=" + modelo + "]";
    }


    

    
}
