package br.com.fiap.checkpoint.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint.model.Pedido;

@Repository
public interface OrderRepository extends JpaRepository<Pedido, Long> {


}
