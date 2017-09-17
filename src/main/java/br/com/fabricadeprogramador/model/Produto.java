package br.com.fabricadeprogramador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Produto {
	
	@GeneratedValue(generator = "seq_produto")
	@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto")
	@Id
	private int id;
	private String descricao;
	private double valor;

}
