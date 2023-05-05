package com.cwiztech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBLACCOUNT")

public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ACCOUNT_ID;
	
	@Column(name = "ACCOUNTTYPE_ID")
	private String ACCOUNTTYPE_ID;
	
	@Transient
	private String ACCOUNTTYPE_DETAIL;
		
	@Column(name = "ACCOUNT_NAME")
	private String ACCOUNT_NAME;

	@Column(name = "ISACTIVE")
	private String ISACTIVE;

	@JsonIgnore
	@Column(name = "MODIFIED_BY")
	private Long MODIFIED_BY;

	@JsonIgnore
	@Column(name = "MODIFIED_WHEN")
	private String MODIFIED_WHEN;

	@JsonIgnore
	@Column(name = "MODIFIED_WORKSTATION")
	private String MODIFIED_WORKSTATION;
	
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public void setACCOUNT_ID(long aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}

	public String getACCOUNTTYPE_ID() {
		return ACCOUNTTYPE_ID;
	}

	public void setACCOUNTTYPE_ID(String aCCOUNTTYPE_ID) {
		ACCOUNTTYPE_ID = aCCOUNTTYPE_ID;
	}

	public String getACCOUNTTYPE_DETAIL() {
		return ACCOUNTTYPE_DETAIL;
	}

	public void setACCOUNTTYPE_DETAIL(String aCCOUNTTYPE_DETAIL) {
		ACCOUNTTYPE_DETAIL = aCCOUNTTYPE_DETAIL;
	}

	public String getACCOUNT_NAME() {
		return ACCOUNT_NAME;
	}

	public void setACCOUNT_NAME(String aCCOUNT_NAME) {
		ACCOUNT_NAME = aCCOUNT_NAME;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}

	@JsonIgnore
	public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	@JsonIgnore
	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}

	@JsonIgnore
	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
	}

	public static long getDatabaseTableID() {
		return (long) 1;
	}

}
