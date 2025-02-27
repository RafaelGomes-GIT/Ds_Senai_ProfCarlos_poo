package heranca3;

public enum Produto {
    FABRICA("novo"),
    SEMINOVO("usado");

    private String descricao;

    private Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    
}
