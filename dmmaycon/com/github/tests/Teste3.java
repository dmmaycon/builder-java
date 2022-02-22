package dmmaycon.com.github.tests;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dmmaycon.com.github.domain.Cliente;
import dmmaycon.com.github.domain.Emissor;
import dmmaycon.com.github.domain.NotaFiscal;
import dmmaycon.com.github.domain.NotaFiscalBuilder;
import dmmaycon.com.github.domain.NotaFiscalBuilderFluent;
import dmmaycon.com.github.domain.Produto;

public class Teste3 {

	public static void main(String[] args) {
		Emissor emissor = new Emissor("Empresa Teste", "10.222.222/0001-10");
		Cliente cliente = new Cliente("Cliente Teste", "123.456.789-00");
		
		Produto produto1 = new Produto("C123", "Produto Teste 1", "Descrição Produto Teste 1", 1, new BigDecimal(33.33));
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos.add(produto1);
		
		NotaFiscal nf = NotaFiscalBuilderFluent.builder()
				.setDataEmissao(new Date())
				.setNumero("123456")
				.setChave("ABC")	
				.setEmissor(emissor)
				.setCliente(cliente)
				.setListaProdutos(listaProdutos)
				.gera();

		
		System.out.println(nf);

	}
	
}
