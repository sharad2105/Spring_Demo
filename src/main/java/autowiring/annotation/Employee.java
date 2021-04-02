package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("qulifire2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}

