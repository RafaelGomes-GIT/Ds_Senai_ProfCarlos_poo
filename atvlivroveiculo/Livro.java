package atvlivroveiculo;

class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePaginas;
    private double valorCompra;

   
    public Livro(String titulo, String autor, String isbn, int numeroDePaginas, double valorCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorCompra = valorCompra;
    }

  
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    
    public void exibirInformacoes() {
        System.out.println("Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de Páginas: " + numeroDePaginas);
        System.out.println("Valor de Compra: R$ " + valorCompra);
        System.out.println();
    }
}