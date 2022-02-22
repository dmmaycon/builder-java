package dmmaycon.com.github.domain.interfaces;

import java.util.Date;
import java.util.List;

import dmmaycon.com.github.domain.Cliente;
import dmmaycon.com.github.domain.Emissor;
import dmmaycon.com.github.domain.NotaFiscalBuilderFluent;
import dmmaycon.com.github.domain.Produto;

public interface INotaFiscalBuilderFluent {
	public NotaFiscalBuilderFluent setDataEmissao(Date dataEmissao);
	public NotaFiscalBuilderFluent setNumero(String numero);
	public NotaFiscalBuilderFluent setChave(String chave);
	public NotaFiscalBuilderFluent setEmissor(Emissor emissor);
	public NotaFiscalBuilderFluent setCliente(Cliente cliente);
	public NotaFiscalBuilderFluent setListaProdutos(List<Produto> listaProdutos);
}
