
public class TestarApp {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        // Adiciona alguns livros ao carrinho
        Livro livro1 = new Livro("L001", "George Orwell", "1984");
        Livro livro2 = new Livro("L002", "Ray Bradbury", "Fahrenheit 451");
        Livro livro3 = new Livro("L003", "Aldous Huxley", "Admirável Mundo Novo");

        carrinho.adicionarItem(livro1);
        carrinho.adicionarItem(livro2);
        carrinho.adicionarItem(livro3);

        // Verifica se os livros foram adicionados corretamente
        carrinho.listarItens();

        // Remove um livro do carrinho
        carrinho.removerItem(livro2);

        // Verifica se o livro foi removido corretamente
        carrinho.listarItens();

        // Pesquisa um livro pelo código
        Livro livroEncontrado = carrinho.pesquisarItem("L003");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }
    }
}