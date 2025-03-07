package interface4;

public class Diretor extends Funcionario implements Contratacao {
     
    private final double premio = 0.2;

    

     public Diretor(String nome, String dataNasc, double salario, Sexo sexo, Setor setor) {
        super(nome, dataNasc, salario, sexo, setor);
    
    }


    public double getPremio() {
        return premio;
    }  


    @Override
    public void admitir(Funcionario funcionario) {
        
        System.out.println("Admitindo o funcionário: " + funcionario.getNome());
    }

    
    @Override
    public void demitir(Funcionario funcionario) {
        
        System.out.println("Demitindo o funcionário: " + funcionario.getNome());
    }

    
    @Override
    public double salarioFinal() {
        
        return this.salario + (this.salario * premio); 
    }


    public String toString(){
        return super.toString();
    }

}
