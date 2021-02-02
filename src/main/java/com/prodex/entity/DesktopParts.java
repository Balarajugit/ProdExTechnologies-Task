package com.prodex.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class DesktopParts {

	@Id
	@GeneratedValue
	private int motherboardid;
	private String customerName;
	private String instanceName;
	private String ipAddress;
	private int assetLimit;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date expireDate;
	public DesktopParts() {
		super();
	}
	public int getMotherboardid() {
		return motherboardid;
	}
	public void setMotherboardid(int motherboardid) {
		this.motherboardid = motherboardid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getInstanceName() {
		return instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getAssetLimit() {
		return assetLimit;
	}
	public void setAssetLimit(int assetLimit) {
		this.assetLimit = assetLimit;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	@Override
	public String toString() {
		return "DesktopParts [motherboardid=" + motherboardid + ", customerName=" + customerName + ", instanceName="
				+ instanceName + ", ipAddress=" + ipAddress + ", assetLimit=" + assetLimit + ", expireDate="
				+ expireDate + "]";
	}
	
	
	
	
}
