package org.import2;
import javax.persistence.*;
@Entity(name="import_company_details")
@Table(name="import_company_details")

public class Import_company_details {
	@Column(name="company_name")
	private String importCompanyName;
	@Id
	@Column(name="company_id")
	private String importCompanyId;
	@Column(name="company_address")
	private String importCompanyAddress;
	@Column(name="company_emailid")
	private String importCompanyEmailId;
	public String getImportCompanyName() {
		return importCompanyName;
	}
	public void setImportCompanyName(String importCompanyName) {
		this.importCompanyName = importCompanyName;
	}
	public String getImportCompanyId() {
		return importCompanyId;
	}
	public void setImportCompanyId(String importCompanyId) {
		this.importCompanyId = importCompanyId;
	}
	public String getImportCompanyAddress() {
		return importCompanyAddress;
	}
	public void setImportCompanyAddress(String importCompanyAddress) {
		this.importCompanyAddress = importCompanyAddress;
	}
	public String getImportCompanyEmailId() {
		return importCompanyEmailId;
	}
	public void setImportCompanyEmailId(String importCompanyEmailId) {
		this.importCompanyEmailId = importCompanyEmailId;
	}
	

}
