package Questao2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class RepositorioAeroporto {
    private TreeSet<Aeroporto> aeroportos;

    public RepositorioAeroporto() {
        aeroportos = new TreeSet<>(Comparator.comparing(Aeroporto::getNome));
    }

    public boolean CadastrarAeroporto(String ID, String nome) {
        Aeroporto novoAeroporto = new Aeroporto(ID, nome);
        return aeroportos.add(novoAeroporto);
    }
   public Aeroporto getAeroporto(String scanner) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o ID do aeroporto que deseja buscar: ");
       String ID = teclado.nextLine();
      for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getId().equals(ID)) {
                System.out.println("Aeroporto encontrado: " + aeroporto);
                return aeroporto;
            }
      }
       System.out.println("Aeroporto não encontrado.");
       return null;
    }

    public boolean buscarAeroporto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ID do aeroporto que deseja buscar: ");
        String ID = teclado.nextLine();
        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getId().equals(ID)) {
                System.out.println("O aeroporto correspondente ao ID informado se encontra na base de dados do repositório!");
                return true;
            }
        }
        System.out.println("O aeroporto correspondente ao ID informado Não se encontra na base de dados do repositório!");
        return false;
    }

    public void listarAeroportosPorNomeTerminal() {
        TreeSet<Aeroporto> Nomes = new TreeSet<>(Comparator.comparing(Aeroporto::getNome));
        Nomes.addAll(aeroportos);
        for (Aeroporto aeroporto : Nomes) {
            System.out.println(aeroporto);
        }
    }

    public void listarAeroportosPorCodigoTerminal() {
        TreeSet<Aeroporto> Codigos = new TreeSet<>(Comparator.comparing(Aeroporto::getId));
        Codigos.addAll(aeroportos);
        for (Aeroporto aeroporto : Codigos) {
            System.out.println(aeroporto);
        }
    }

    }