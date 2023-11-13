package finance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="currencies")
public class Currency {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable= false)
	private String name;
	
	@Column(nullable= false, length = 3)
	private String code;
	@OneToMany(mappedBy = "sourceCurrency" )
	private List<Rate> rates = new ArrayList<>();

	public Currency() {}
	
	public Currency(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

	public List<Rate> getRates() {
		return rates;
	}

	

	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
	
	
	
	
}
