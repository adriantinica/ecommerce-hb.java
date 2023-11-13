package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import finance.entities.Currency;
import finance.entities.Money;
import store.entities.Category;
import store.entities.Product;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("local-hb");
		EntityManager em = emf.createEntityManager();	
		
		//CRUD
		
		//create
		
		//Category cat1 = new Category();
		//cat1.setName("Category with product");	
	
		//Product p1 = new Product();
		//p1.setName("Product 2");		
		
		//em.getTransaction().begin();
		//em.persist(cat1);
		//p1.setCategory(cat1);
		//em.persist(p1);
		
		//em.getTransaction().commit();
		
		//read+ update
		
		//Category cat2 = em.find(Category.class, 1);
		//System.out.println(cat2);
		//cat1.setName("CategoryOne");
		//em.getTransaction().begin();
	    //em.persist(cat1);
	    //em.getTransaction().commit();
	    
	    
	    //delete-update
	    //Category cat1 = em.find(Category.class, 7);
		//System.out.println(cat1);
	    //em.getTransaction().begin();
	    //em.remove(cat1);
	    //em.getTransaction().commit();
				
		//em.getTransaction().begin();
		//em.persist(USD);
		//em.persist(m1);
		
	    //em.getTransaction().commit();
				  
	    //Money money = em.find(Money.class,3);
	    //System.out.println(money);
	    //System.out.println(money.getValue());                 // Eager Fetching
	    //System.out.println(money.getCurrency());
	    
	   Product product = em.find(Product.class, 1);
	   System.out.println(product.getPrice().getCurrency().getRates());
	   System.out.println(product.getName()); 
	
	   System.out.println(product.getPrice());
	    
		//Currency currency = em.find(Currency.class, 2);
		//System.out.println(currency);                       //Lazy fetching
		//System.out.println(currency.getRates());
	}

}
