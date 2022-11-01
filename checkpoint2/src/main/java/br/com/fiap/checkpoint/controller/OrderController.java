package br.com.fiap.checkpoint.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint.command.CommandList;
import br.com.fiap.checkpoint.model.Pedido;
import br.com.fiap.checkpoint.repository.OrderRepository;

@RestController
@RequestMapping("pedidos")
public class OrderController {

private OrderRepository orderRepository;
private CommandList listaDeComandos;
	
	//DECLARACAO COMANDOS
	public OrderController(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
		this.listaDeComandos = new CommandList();
	}

	//LISTAGEM DOS PEDISO
	@GetMapping("/list")
	public List<Pedido> listarPedidos() {
		return listaDeComandos.listarPedidos(orderRepository);
	}
	
	//CRIAR UM NOVO PEDIDO
	@PostMapping("/save")
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return listaDeComandos.criarPedido(orderRepository, pedido);
	}

	//DELETAR UM PEDIDO
	@DeleteMapping("/{id}")
	public void deletarPedido(@PathVariable("id")Long id) {
		listaDeComandos.deletarPedido(orderRepository, id);
	}
	
	//ALTERAR UM PEDIDO
	@PutMapping("/update/{id}")
	public Pedido alterarPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
		return listaDeComandos.alterarPedido(orderRepository, id, pedido);
	}

}
