
public class Livro {
    private String codigo;
    private String autor;
    private String titulo;

    public Livro(String codigo, String autor, String titulo) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
    }

    // Getters e Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}