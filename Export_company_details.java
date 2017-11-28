package org.import2;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="export_company_details")
@Table(name="export_company_details")
public class Export_company_details {
	@Column(name="company_name")
	private String exportCompanyName;
	@Id
	@Column(name="company1_id")
	private String exportCompanyId;
	@Column(name="company_address")
	private String exportCompanyAddress;
	@Column(name="company_emailid")
	private String exportCompanyEmailId;
	public String getExportCompanyName() {
		return exportCompanyName;
	}
	public void setExportCompanyName(String exportCompanyName) {
		this.exportCompanyName = exportCompanyName;
	}
	public String getExportCompanyId() {
		return exportCompanyId;
	}
	public void setExportCompanyId(String exportCompanyId) {
		this.exportCompanyId = exportCompanyId;
	}
	public String getExportCompanyAddress() {
		return exportCompanyAddress;
	}
	public void setExportCompanyAddress(String exportCompanyAddress) {
		this.exportCompanyAddress = exportCompanyAddress;
	}
	public String getExportCompanyEmailId() {
		return exportCompanyEmailId;
	}
	public void setExportCompanyEmailId(String exportCompanyEmailId) {
		this.exportCompanyEmailId = exportCompanyEmailId;
	}
	

}
