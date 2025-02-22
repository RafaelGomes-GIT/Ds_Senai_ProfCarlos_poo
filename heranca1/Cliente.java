package heranca1;

public class Cliente extends Pessoa {
    private String data_Compra;
    private String formadecompra;
    
    
    
    public Cliente() {
    }



    public Cliente(String nome, int idade, String data_Compra, String formadecompra) {
        super(nome, idade);
        this.data_Compra = data_Compra;
        this.formadecompra = formadecompra;
    }



    public String getData_Compra() {
        return data_Compra;
    }



    public void setData_Compra(String data_Compra) {
        this.data_Compra = data_Compra;
    }



    public String getFormadecompra() {
        return formadecompra;
    }



    public void setFormadecompra(String formadecompra) {
        this.formadecompra = formadecompra;
    }



    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", data_Compra=" + data_Compra + ", idade=" + idade + ", formadecompra="
                + formadecompra + "]";
    }




    
    

    
    
    
}
