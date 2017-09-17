package br.com.fabricadeprogramador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.model.Produto;
import br.com.fabricadeprogramador.repository.ProdutoRepository;

@RequestMapping("/produtocontroller")
@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public Produto adicionar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	@GetMapping("/buscarmaiscaro")
	public Produto buscarMaisCaro () {
		return produtoRepository.buscarMaisCaro();
	}
	
	@GetMapping("/buscarmaisbarato")
	public Produto buscarMaisBarato () {
		return produtoRepository.buscarMaisBarato();
	}
	
	@GetMapping("/buscarmedia")
	public double buscarMedia () {
		return produtoRepository.buscarMedia();
	}
	
	@GetMapping("/buscarordenado")
	List<Produto> buscarOrdenado() {
		return produtoRepository.buscarOrdenado();
	}
	
	
	

}
