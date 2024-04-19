package JDBCAssessment;
/**
 * This class describes the Contractor object and it's attributes
 * @author sirlewengmakgopa
 * @version 19 April 2024
 * */
public class Contractor {
	
	private String contractorName;
	private int contractorTelNo;
	private String contractorEmailAdd;
	private String contractorPhysicalAdd;
	
	public Contractor() {
		
	}
	/**
	 * @param no args
	 * @return contractor's name
	 * */
	public String getContractorName() {
		return contractorName;
	}
	/**
	 * @param contractor's name as the only value
	 * */
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	/**
	 * @param no args
	 * @return contractor's contact number
	 * */
	public int getContractorTelNo() {
		return contractorTelNo;
	}
	/**
	 * @param contractor's contact number as the only value
	 * */
	public void setContractorTelNo(int contractorTelNo) {
		this.contractorTelNo = contractorTelNo;
	}
	/**
	 * @param no args
	 * @return contractor's email address
	 * */
	public String getContractorEmailAdd() {
		return contractorEmailAdd;
	}
	/**
	 * @param contractor's email address as the only value
	 * */
	public void setContractorEmailAdd(String contractorEmailAdd) {
		this.contractorEmailAdd = contractorEmailAdd;
	}
	/**
	 * @param no args
	 * @return contractor's physical address
	 * */
	public String getContractorPhysicalAdd() {
		return contractorPhysicalAdd;
	}
	/**
	 * @param contractor's physical address as the only value
	 * */
	public void setContractorPhysicalAdd(String contractorPhysicalAdd) {
		this.contractorPhysicalAdd = contractorPhysicalAdd;
	}
	
}
