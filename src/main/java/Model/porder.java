package Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="porder")
public class porder {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String Name;
	private Integer Product1;
	private Integer Product2;
	private Integer Product3;
	private Integer Sum;
	private Integer discountprice;
	private Date pdate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getProduct1() {
		return Product1;
	}
	public void setProduct1(Integer product1) {
		Product1 = product1;
	}
	public Integer getProduct2() {
		return Product2;
	}
	public void setProduct2(Integer product2) {
		Product2 = product2;
	}
	public Integer getProduct3() {
		return Product3;
	}
	public void setProduct3(Integer product3) {
		Product3 = product3;
	}
	public Integer getSum() {
		return Sum;
	}
	public void setSum(Integer sum) {
		Sum = sum;
	}
	public Integer getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(Integer discountprice) {
		this.discountprice = discountprice;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
}

