package br.com.fiap.checkpoint.model;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	private Instant dataPedido;
	private Long codigoCliente;
	private Instant dataCadastro;
	private BigDecimal valorTotal;
	
	//GETTERS AND SETTERS
	public Instant getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Instant dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Long getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public Instant getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Instant dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
}
