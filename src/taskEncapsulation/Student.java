package taskEncapsulation;

public class Student {
	private int admissionId;
	private long phoneNumber;
	private String name,eMail;
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
