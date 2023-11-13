package store.entities;

import javax.persistence.*;


import finance.entities.Money;

@Entity
@Table(name="adresses")
public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
	
    private String name;
    private String phone;
    private String email;
    
    
    
    @OneToOne
    @JoinColumn(name="client_id")
    private Client client;
    
}
