
import java.util.HashSet;
import java.util.Set;

public class Carrinho {
    private Set<Livro> itens;

    public Carrinho() {
        this.itens = new HashSet<>();
    }

    public void adicionarItem(Livro item) {
        if (!this.itens.contains(item)) {
            this.itens.add(item);
        }
    }

    public void removerItem(Livro item) {
        this.itens.remove(item);
    }

    public Livro pesquisarItem(String codigo) {
        for (Livro item : this.itens) {
            if (item.getCodigo().equals(codigo)) {
                return item;
            }
        }
        return null;
    }

    public void listarItens() {
        for (Livro item : this.itens) {
            System.out.println(item.getCodigo() + " - " + item.getAutor() + " - " + item.getTitulo());
        }
    }
}