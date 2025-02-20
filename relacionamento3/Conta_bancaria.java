package relacionamento3;

public class Conta_bancaria {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String saldoAtual;
    private String limiteDisponivel;
    
    public Conta_bancaria(String banco, String agencia, String numeroConta, String saldoAtual,
            String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }
    
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }
    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
    @Override
    public String toString() {
        return "Conta_bancaria [banco=" + banco + ", agencia=" + agencia + ", numeroConta=" + numeroConta
                + ", saldoAtual=" + saldoAtual + ", limiteDisponivel=" + limiteDisponivel + "]";
    }

    
}
