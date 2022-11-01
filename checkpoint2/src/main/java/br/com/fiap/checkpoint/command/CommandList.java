package br.com.fiap.checkpoint.command;

import java.util.List;

import br.com.fiap.checkpoint.model.Pedido;
import br.com.fiap.checkpoint.repository.OrderRepository;


public class CommandList {
	
	//LISTAGEM DOS PEDIDOS
	public List<Pedido> listarPedidos(OrderRepository repository) {
		return repository.findAll();
	}
	
	//CRIAR UM NOVO PEDIDO
	public Pedido criarPedido(OrderRepository repository, Pedido pedido) {
		return repository.save(pedido);
	}
	
	//DELETAR UM PEDIDO
	public void deletarPedido(OrderRepository repository, Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
		}
	}
	
	//ALTERAR PEDIDO
	public Pedido alterarPedido(OrderRepository repository, Long id, Pedido novoPedido) {
		
		Pedido order = repository.getById(id);
     
		order.setDataPedido(novoPedido.getDataPedido());
        order.setCodigoCliente(novoPedido.getCodigoCliente());
        order.setDataCadastro(novoPedido.getDataCadastro());
        order.setValorTotal(novoPedido.getValorTotal());
        
       return repository.save(order); 
    }
	
}
