package JDBCAssessment;
/**
 * This class describes the Customer object and it's attributes
 * @author sirlewengmakgopa
 * @version 19 April 2024
 * */
public class Customer {

	private int customerTelephoneNo;
	private String customerEmailAdd;
	private String customerPhysAdd;
	
	public Customer() {
		
	}
	/**
	 * @param no args
	 * @return customer's contact number
	 * */
	public int getCustomerTelephoneNo() {
		return customerTelephoneNo;
	}
	/**
	 * @param customer's contact number as the only value
	 * */
	public void setCustomerTelephoneNo(int customerTelephoneNo) {
		this.customerTelephoneNo = customerTelephoneNo;
	}
	/**
	 * @param no args
	 * @return customer's email address
	 * */
	public String getCustomerEmailAdd() {
		return customerEmailAdd;
	}
	/**
	 * @param customer's email address as the only value
	 * */
	public void setCustomerEmailAdd(String customerEmailAdd) {
		this.customerEmailAdd = customerEmailAdd;
	}
	/**
	 * @param no args
	 * @return customer's physical address
	 * */
	public String getCustomerPhysAdd() {
		return customerPhysAdd;
	}
	/**
	 * @param customer's physical address as the only value
	 * */
	public void setCustomerPhysAdd(String customerPhysAdd) {
		this.customerPhysAdd = customerPhysAdd;
	}
	
	
}
