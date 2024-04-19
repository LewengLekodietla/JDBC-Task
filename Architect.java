package JDBCAssessment;
/**
 * This is a class that defines an architect object and it's attributes
 * @author sirlewengmakgopa
 * @version 19 April 2024
 * */
public class Architect {
	/**
	 * private fields that can be accessed only within this class
	 * String and int values for field names
	 * */
	private String architectName;
	private int architectTelNo;
	private String architectEmailAdd;
	private String architectPhysicalAdd;
	
	public Architect() {
		
	}
	/**
	 * @param no args
	 * @return architect's name
	 * */
	public String getArchitectName() {
		return architectName;
	}
	/**
	 * @param architect's name as the only value
	 * */
	public void setArchitectName(String architectName) {
		this.architectName = architectName;
	}
	/**
	 * @param no args
	 * @return architect's contact number
	 * */
	public int getArchitectTelNo() {
		return architectTelNo;
	}
	/**
	 * @param architect's contact number as the only value
	 * */
	public void setArchitectTelNo(int architectTelNo) {
		this.architectTelNo = architectTelNo;
	}
	/**
	 * @param no args
	 * @return architect's email address
	 * */
	public String getArchitectEmailAdd() {
		return architectEmailAdd;
	}
	/**
	 * @param architect's email address as the only value
	 * */
	public void setArchitectEmailAdd(String architectEmailAdd) {
		this.architectEmailAdd = architectEmailAdd;
	}
	/**
	 * @param no args
	 * @return architect's physical address
	 * */
	public String getArchitectPhysicalAdd() {
		return architectPhysicalAdd;
	}
	/**
	 * @param architect's physical address as the only value
	 * */
	public void setArchitectPhysicalAdd(String architectPhysicalAdd) {
		this.architectPhysicalAdd = architectPhysicalAdd;
	}
	
}
