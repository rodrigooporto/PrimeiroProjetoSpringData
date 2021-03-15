package br.rodrigooporto.repository;

import br.rodrigooporto.domain.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    Produto findProdutoById(Long l);

    List<Produto> findByQuantidadeAndValor(int quantidade, Double valor);
}
