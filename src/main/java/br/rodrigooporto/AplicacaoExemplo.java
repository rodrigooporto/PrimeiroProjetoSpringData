package br.rodrigooporto;

import br.rodrigooporto.domain.Produto;
import br.rodrigooporto.repository.ProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AplicacaoExemplo {

    public static void main(String[] args){
        SpringApplication.run(AplicacaoExemplo.class);
    }

    @Bean
    public String exemplo (ProdutoRepository repository){
        System.out.println("Cadastro de Produtos no Banco de Dados.");
        repository.save(new Produto("Sabonete", 10, 1.35));
        repository.save(new Produto("Lâmpada", 15, 1.35));
        repository.save(new Produto("Arraz", 1, 18.35));
        repository.save(new Produto("Feijão", 30, 12.35));
        repository.save(new Produto("Computador", 5, 1565.35));

        System.out.println("Lista de produtos Cadastrados");
        for(Produto produto : repository.findAll()){
            System.out.println(produto.toString());
        }

        System.out.println("Consultando com paramentros");
        System.out.println(repository.findProdutoById(1L));

        System.out.println("Produtos com quantidade acima de 01 e valor acima de 1, ou seja todos");
        for(Produto produto : repository.findByQuantidadeAndValor(10, 1.35)){
            System.out.println(produto.toString());
            System.out.println("------------------------------------------");
        }

        return "";

    }
}
