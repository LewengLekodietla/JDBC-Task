package JDBCAssessment;
/**
 * This class describes the Building object and it's attributes
 * @author sirlewengmakgopa
 * @version 19 April 2024
 * */
public class Building {
	
	private int erfNumber;
	private String buildingType;
	private String physicalAddress;
	
	public Building() {
		
	}
	/**
	 * @param no args
	 * @return building's erf number 
	 * */
	public int getErfNumber() {
		return erfNumber;
	}
	/**
	 * @param building's erf number as the only value
	 * */
	public void setErfNumber(int erfNumber) {
		this.erfNumber = erfNumber;
	}
	/**
	 * @param no args
	 * @return building type being designed
	 * */
	public String getBuildingType() {
		return buildingType;
	}
	/**
	 * @param building's type as the only value
	 * */
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	/**
	 * @param no args
	 * @return building's physical address or location 
	 * */
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	/**
	 * @param building's physical address as the only value
	 * */
	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}
	
}
