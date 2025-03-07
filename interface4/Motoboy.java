

public class Motoboy extends Funcionario {

    private String carteiraHab;

    // Construtor que chama o construtor da classe pai (Funcionario)
    public Motoboy(String nome, String dataNasc, double salario, Sexo sexo, Setor setor, String carteiraHab) {
        super(nome, dataNasc, salario, sexo, setor);
        this.carteiraHab = carteiraHab;
    }
    
    public String getCarteiraHab() {
        return carteiraHab;
    }

    
    public void setCarteiraHab(String carteiraHab) {
        this.carteiraHab = carteiraHab;
    }

    
    

    public double salarioFinal() {
       
        return super.getSalario ;
    }

    public String toString() {
        return super.toString() + 
               "\nCarteira de Habilitação: " + carteiraHab;
    }
}