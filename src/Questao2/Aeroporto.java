package Questao2;

import java.util.Objects;

public class Aeroporto {
    private String id;
    private String nome;

    public Aeroporto(String id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeroporto aeroporto = (Aeroporto) o;
        return Objects.equals(id, aeroporto.id) && Objects.equals(nome, aeroporto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
