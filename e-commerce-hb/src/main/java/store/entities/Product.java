package store.entities;

import javax.persistence.*;


import finance.entities.Money;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@SequenceGenerator(name = "product_sequence", allocationSize = 1, initialValue = 1)
    private Integer id;
    private String name;
    
    
    @OneToOne
    private Money price;
    
    @ManyToOne
    private Category category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category="
				+ category + "]";
		
	}
	
	
	
	
    
    
    
}
