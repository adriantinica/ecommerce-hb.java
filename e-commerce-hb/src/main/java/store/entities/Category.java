package store.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator = "hibernate_sequence")
	@SequenceGenerator(name = "hibernate_sequence", sequenceName = "category_sequence", allocationSize = 1)
	private Integer id;
	@Column(name="title")
	private String name;
	
	public Category() {
	}
	
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<>();
	
	@ManyToOne
	private Category parent;
	
	@OneToMany(mappedBy = "parent")
	private Set<Category> subCategories = new HashSet<>();  // unic records

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

	@Override
	public String toString() {
		
		String ps ="";
		for (Product product: products) {
			ps+= product;
		}
		
		return "Category [id=" + id + ", name=" + name + "]\n " +ps;
	}
	
	
	
	
	
	
	

}
