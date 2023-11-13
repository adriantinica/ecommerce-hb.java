package store.entities;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


import finance.entities.Money;

@Entity
@Table(name="carts")
public class Cart {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
	
    
    
    
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    
    
    @OneToMany(mappedBy= "cart")
    private Set<CartItem> items = new HashSet<>();
    
    @OneToOne
     private Money totlaCost;
    
}
