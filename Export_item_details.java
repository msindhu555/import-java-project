package org.import2;
import javax.persistence.*;
@Entity(name="export_item_details")
@Table(name="export_item_details")


public class Export_item_details {
	
	@Column(name="export_id")
	private int exportItemId;
	@Id
	@Column(name="company1_id")
	private int exportCompanyId;
	@Column(name="company_id")
	private int importCompanyId;
	@Column(name="item_name")
	private String exportItemName;
	@Column(name="quantity")
	private String exportItemQuantity;
	@Column(name="date")
	private String exportItemDate;
	@Column(name="address")
	private String exportitemAddress;
	public int getExportItemId() {
		return exportItemId;
	}
	public void setExportItemId(int exportItemId) {
		this.exportItemId = exportItemId;
	}
	public int getExportCompanyId() {
		return exportCompanyId;
	}
	public void setExportCompanyId(int exportCompanyId) {
		this.exportCompanyId = exportCompanyId;
	}
	public int getImportCompanyId() {
		return importCompanyId;
	}
	public void setImportCompanyId(int importCompanyId) {
		this.importCompanyId = importCompanyId;
	}
	public String getExportItemName() {
		return exportItemName;
	}
	public void setExportItemName(String exportItemName) {
		this.exportItemName = exportItemName;
	}
	public String getExportItemQuantity() {
		return exportItemQuantity;
	}
	public void setExportItemQuantity(String exportItemQuantity) {
		this.exportItemQuantity = exportItemQuantity;
	}
	public String getExportItemDate() {
		return exportItemDate;
	}
	public void setExportItemDate(String exportItemDate) {
		this.exportItemDate = exportItemDate;
	}
	public String getExportitemAddress() {
		return exportitemAddress;
	}
	public void setExportitemAddress(String exportitemAddress) {
		this.exportitemAddress = exportitemAddress;
	}
	

}
