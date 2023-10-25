package Questao2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TestarApp {
    public static void main(String[] args) {
        RepositorioAeroporto repositorio = new RepositorioAeroporto();
        try {
            List<String> linhas = Files.readAllLines(Path.of("/Users/Felipe/OneDrive/Documentos/aeroporto.txt"));
            for (String linha : linhas) {
                String[] campos = linha.split(",");
                String id = campos[0];
                String nome = campos[1];
                repositorio.CadastrarAeroporto(id, nome);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        System.out.println("Cadastrando um novo aeroporto: ");
        boolean cadastrou = repositorio.CadastrarAeroporto("ABC", "Aeroporto Teste de Campina Grande");
        if (cadastrou) {
            System.out.println("Aeroporto cadastrado com sucesso!");
        } else {
            System.out.println("Não foi possível cadastrar o aeroporto.");
        }




        System.out.println("\nBuscando o aeroporto: ");
        boolean encontrado = repositorio.buscarAeroporto();

        System.out.println("\nTestando getAeroporto: ");
        Aeroporto aeroporto = repositorio.getAeroporto("");


        System.out.println("\nListando aeroportos por nome: ");
        repositorio.listarAeroportosPorNomeTerminal();

        System.out.println("\nListando aeroportos por código: ");
        repositorio.listarAeroportosPorCodigoTerminal();


    }
}
