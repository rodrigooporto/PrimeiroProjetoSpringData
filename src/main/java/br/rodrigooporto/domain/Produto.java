package br.rodrigooporto.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int quantidade;
    private Double valor;

    protected Produto(){}

    public Produto(String nome, int quantidade, Double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "br.domain.Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
