public class Livro {
    private String titulo = "";
    private String autor = "";
    private int numeroDePaginas = 0;
    private boolean emprestado = false;

    Livro() { }
    Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    String emprestar() {
        this.emprestado = true;
        return "Livro emprestado.";
    }

    String devolver() {
        this.emprestado = false;
        return "Livro devolvido.";
    }

    String status() {
        if (this.emprestado)
            return String.format(
                    "Livro: %s \nAutor: %s \nPáginas: %s \nLivro emprestado",
                    this.titulo, this.autor, this.numeroDePaginas);

        return String.format(
                "Livro: %s \nAutor: %s \nPáginas: %s \nLivro devolvido",
                this.titulo, this.autor, this.numeroDePaginas);
    }

    String setNumeroPaginas(int numPaginas) {
        if (numPaginas <= 0)
            return "Número de páginas inválido.";

        this.numeroDePaginas = numPaginas;
        return "Número de páginas definido.";
    }
}
