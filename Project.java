package JDBCAssessment;

import java.time.LocalDate;
/**
 * This class describes the Project object and it's attributes
 * @author sirlewengmakgopa
 * @version 19 April 2024
 * */
public class Project {
	
	private String projectNumber;
	private String projectName;
	private int totalProjectFeeCharge;
	private int totalAmountPaidToDate;
	private LocalDate projectDeadline;
	private String architectName;
	private String contractorName;
	private String customerName;
	private String projectStatus;
	
	public Project() {
		
	}
	/**
	 * @param no args
	 * @return project number 
	 * */
	public String getProjectNumber() {
		return projectNumber;
	}
	/**
	 * @param project number as the only value
	 * */
	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}
	/**
	 * @param no args
	 * @return project name as stored in system 
	 * */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param project name as the only value
	 * */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @param no args
	 * @return project fee charged to customer 
	 * */
	public int getTotalProjectFeeCharge() {
		return totalProjectFeeCharge;
	}
	/**
	 * @param project fee charged to the customer as the only value
	 * */
	public void setTotalProjectFeeCharge(int totalProjectFeeCharge) {
		this.totalProjectFeeCharge = totalProjectFeeCharge;
	}
	/**
	 * @param no args
	 * @return amount paid by customer for project thus far 
	 * */
	public int getTotalAmountPaidToDate() {
		return totalAmountPaidToDate;
	}
	/**
	 * @param the amount paid by the customer as the only value
	 * */
	public void setTotalAmountPaidToDate(int totalAmountPaidToDate) {
		this.totalAmountPaidToDate = totalAmountPaidToDate;
	}
	/**
	 * @param no args
	 * @return project deadline date 
	 * */
	public LocalDate getProjectDeadline() {
		return projectDeadline;
	}
	/**
	 * @param project deadline as the only value
	 * */
	public void setProjectDeadline(LocalDate projectDeadline) {
		this.projectDeadline = projectDeadline;
	}
	/**
	 * @param no args
	 * @return project architect name
	 * */
	public String getArchitectName() {
		return architectName;
	}
	/**
	 * @param project architect name as the only value
	 * */
	public void setArchitectName(String architectName) {
		this.architectName = architectName;
	}
	/**
	 * @param no args
	 * @return project contractor name 
	 * */
	public String getContractorName() {
		return contractorName;
	}
	/**
	 * @param project contractor name as the only value
	 * */
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}	
	/**
	 * @param no args
	 * @return project customer name 
	 * */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customer name as the only value
	 * */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @param no args
	 * @return project status 
	 * */
	public String getProjectStatus() {
		return projectStatus;
	}
	/**
	 * @param project status as the only value
	 * */
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	
}
