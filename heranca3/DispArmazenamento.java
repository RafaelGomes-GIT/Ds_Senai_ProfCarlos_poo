package heranca3;

public class DispArmazenamento extends Super {
    private String tipoConexao;

    public DispArmazenamento() {
    }

    public DispArmazenamento(String marca, String modelo, String cpcArmaz, String tipoConexao) {
        super(marca, modelo, cpcArmaz);
        this.tipoConexao = tipoConexao;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "\nDispArmazenamento \nmarca=" + marca + "\n tipoConexao=" + tipoConexao + "\n Modelo=" + Modelo
                + "\n cpcArmaz=" + cpcArmaz + "\n";
    }




    

}
