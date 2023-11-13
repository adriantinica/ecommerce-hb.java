package store.entities;

import javax.persistence.*;


import finance.entities.Money;

@Entity
@Table(name="clients")
public class Client {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
	
    private String city;
    private String phone;
    private String email;
    
    
    
    @OneToOne
    private Address address;
    
}
