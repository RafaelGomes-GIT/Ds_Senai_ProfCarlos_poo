package heranca3;

public abstract class Super {
    protected String marca;
    protected String Modelo;
    protected String cpcArmaz;
    
    
    
    
    
    
    public Super() {
    }

    
    public Super(String marca, String modelo, String cpcArmaz) {
        this.marca = marca;
        Modelo = modelo;
        this.cpcArmaz = cpcArmaz;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getCpcArmaz() {
        return cpcArmaz;
    }
    public void setCpcArmaz(String cpcArmaz) {
        this.cpcArmaz = cpcArmaz;
    }


    @Override
    public String toString() {
        return "Super [marca=" + marca + ", Modelo=" + Modelo + ", cpcArmaz=" + cpcArmaz + "]";
    }


    
}
