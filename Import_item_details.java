package org.import2;

import javax.persistence.Column;
import javax.persistence.Id;

public class Import_item_details {
	@Column(name="import_id")
	private int importItemId;
	@Column(name="company1_id")
	private int exportCompanyId;
	@Id
	@Column(name="company_id")
	private int importCompanyId;
	@Column(name="item_name")
	private String importItemName;
	@Column(name="quantity")
	private String importItemQuantity;
	@Column(name="date")
	private String importItemDate;
	@Column(name="address")
	private String importitemAddress;
	public int getImportItemId() {
		return importItemId;
	}
	public void setImportItemId(int importItemId) {
		this.importItemId = importItemId;
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
	public String getImportItemName() {
		return importItemName;
	}
	public void setImportItemName(String importItemName) {
		this.importItemName = importItemName;
	}
	public String getImportItemQuantity() {
		return importItemQuantity;
	}
	public void setImportItemQuantity(String importItemQuantity) {
		this.importItemQuantity = importItemQuantity;
	}
	public String getImportItemDate() {
		return importItemDate;
	}
	public void setImportItemDate(String importItemDate) {
		this.importItemDate = importItemDate;
	}
	public String getImportitemAddress() {
		return importitemAddress;
	}
	public void setImportitemAddress(String importitemAddress) {
		this.importitemAddress = importitemAddress;
	}
	

}
