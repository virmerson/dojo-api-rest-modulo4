package br.com.fabricadeprogramador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fabricadeprogramador.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	@Query("select p from Produto p where p.valor = (select max(pro.valor) from Produto pro)")
	Produto buscarMaisCaro(); 
	

	@Query("select p from Produto p where p.valor = (select min(pro.valor) from Produto pro)")
	Produto buscarMaisBarato(); 


	@Query("select avg(pro.valor) from Produto pro")
	double buscarMedia();
	
	@Query("select p from Produto p order by p.valor")
	List<Produto> buscarOrdenado();
}