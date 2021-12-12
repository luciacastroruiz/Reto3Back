
package co.edu.arboleda.sergio.ciclo4.repository;

import co.edu.arboleda.sergio.ciclo4.interfaces.InterfaceOrder;
import co.edu.arboleda.sergio.ciclo4.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase Crea el repositorio OrderRepository
 * @since 11-12-2021
 * @version 1.0
 * @author Grupo 4 subgrupo 2
 */
@Repository
public class OrderRepository {
    
    @Autowired
    private InterfaceOrder interfaceOrder;

    public List<Order> getAll() {
        return (List<Order>) interfaceOrder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceOrder.findById(id);
    }

    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    public void update(Order order) {
        interfaceOrder.save(order);
    }

    public void delete(Order order) {
        interfaceOrder.delete(order);
    }
    
    public Optional<Order> lastUserId(){
        return interfaceOrder.findTopByOrderByIdDesc();
    }
    
    public List<Order> findByZone(String zona) {
        return interfaceOrder.findByZone(zona);
    }
    
}
