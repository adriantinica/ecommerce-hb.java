package finance.entities;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="rates")
public class Rate {
	
	@Id
	@GeneratedValue
	private Integer id;
	private LocalDate date;
	private Double value;
	
	@ManyToOne
	private Currency sourceCurrency;
	@ManyToOne
	private Currency targetCurrency;
	
	public Rate() {}

	public Rate(Double value, Currency sourceCurrency, Currency targetCurrency) {
		this.date = LocalDate.now();
		this.value = value;
		this.sourceCurrency = sourceCurrency;
		this.targetCurrency = targetCurrency;
	}

	public Integer getId() {
		return id;
	}

	public Double getValue() {
		return value;
	}

	public Currency getSourceCurrency() {
		return sourceCurrency;
	}

	public Currency getTargetCurrency() {
		return targetCurrency;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void setSourceCurrency(Currency sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public void setTargetCurrency(Currency targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	@Override
	public String toString() {
		return "\nRate [id=" + id + ", date=" + date + ", value=" + value + ",\n\n sourceCurrency=" + sourceCurrency
				+ ",\n\n targetCurrency=" + targetCurrency + "]";
	}
	
	
	
	
	
	
	

}
