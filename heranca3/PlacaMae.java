package heranca3;

public class PlacaMae extends Super{
    private String soquete;

    public PlacaMae() {
    }

    public PlacaMae(String marca, String modelo, String cpcArmaz, String soquete) {
        super(marca, modelo, cpcArmaz);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "\nPlacaMae: \nmarca=" + marca + "\n soquete=" + soquete + "\n Modelo=" + Modelo + "\n";

        
    }



    

}
