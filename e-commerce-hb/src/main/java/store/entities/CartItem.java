package store.entities;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


import finance.entities.Money;

@Entity
@Table(name="cart_items")
public class CartItem {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
	
    
    
    
    @OneToOne
    private Product product;
    
    private Integer quantity;
    
    @ManyToOne
    private Cart cart;
    
    @OneToOne
     private Money totlaCost;
    
}
