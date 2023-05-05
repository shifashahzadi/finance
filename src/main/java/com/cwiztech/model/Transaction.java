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
@Table(name = "TBLTRANSACTION")

public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long TRANSACTION_ID;
	
	@Column(name = "TRANSACTION_NAME")
	private String TRANSACTION_NAME;
	
	@Column(name = "TRANSACTION_DESCRIPTION")
	private String TRANSACTION_DESCRIPTION;
	
	@Column(name = "TRANSACTION_AMOUNT")
	private Double TRANSACTION_AMOUNT;
	
	@Column(name = "TRANSACTION_DATE")
	private String TRANSACTION_DATE;
	
	@Column(name = "TRANSACTIONTYPE_ID")
	private Long TRANSACTIONTYPE_ID;
	
	@Transient
	private String TRANSACTIONTYPE_DETAIL;
	
	@Column(name = "ACCOUNT_ID")
	private Long ACCOUNT_ID;
	
	@Transient
	private String ACCOUNT_DETAIL;
	
	@Column(name = "CURRENCY_ID")
	private String CURRENCY_ID;
	
	@Transient
	private String CURRENCY_DETAIL;
	
	@Column(name = "COMPANY_ID")
	private String COMPANY_ID;
	
	@Transient
	private String COMPANY_DETAIL;
	
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
	
	public long getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}

	public void setTRANSACTION_ID(long tRANSACTION_ID) {
		TRANSACTION_ID = tRANSACTION_ID;
	}

	public String getTRANSACTION_NAME() {
		return TRANSACTION_NAME;
	}

	public void setTRANSACTION_NAME(String tRANSACTION_NAME) {
		TRANSACTION_NAME = tRANSACTION_NAME;
	}

	public String getTRANSACTION_DESCRIPTION() {
		return TRANSACTION_DESCRIPTION;
	}

	public void setTRANSACTION_DESCRIPTION(String tRANSACTION_DESCRIPTION) {
		TRANSACTION_DESCRIPTION = tRANSACTION_DESCRIPTION;
	}

	public Double getTRANSACTION_AMOUNT() {
		return TRANSACTION_AMOUNT;
	}

	public void setTRANSACTION_AMOUNT(Double tRANSACTION_AMOUNT) {
		TRANSACTION_AMOUNT = tRANSACTION_AMOUNT;
	}

	public String getTRANSACTION_DATE() {
		return TRANSACTION_DATE;
	}

	public void setTRANSACTION_DATE(String tRANSACTION_DATE) {
		TRANSACTION_DATE = tRANSACTION_DATE;
	}

	public Long getTRANSACTIONTYPE_ID() {
		return TRANSACTIONTYPE_ID;
	}

	public void setTRANSACTIONTYPE_ID(Long tRANSACTIONTYPE_ID) {
		TRANSACTIONTYPE_ID = tRANSACTIONTYPE_ID;
	}

	public String getTRANSACTIONTYPE_DETAIL() {
		return TRANSACTIONTYPE_DETAIL;
	}

	public void setTRANSACTIONTYPE_DETAIL(String tRANSACTIONTYPE_DETAIL) {
		TRANSACTIONTYPE_DETAIL = tRANSACTIONTYPE_DETAIL;
	}

	public Long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public void setACCOUNT_ID(Long aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}

	public String getACCOUNT_DETAIL() {
		return ACCOUNT_DETAIL;
	}

	public void setACCOUNT_DETAIL(String aCCOUNT_DETAIL) {
		ACCOUNT_DETAIL = aCCOUNT_DETAIL;
	}

	public String getCURRENCY_ID() {
		return CURRENCY_ID;
	}

	public void setCURRENCY_ID(String cURRENCY_ID) {
		CURRENCY_ID = cURRENCY_ID;
	}

	public String getCURRENCY_DETAIL() {
		return CURRENCY_DETAIL;
	}

	public void setCURRENCY_DETAIL(String cURRENCY_DETAIL) {
		CURRENCY_DETAIL = cURRENCY_DETAIL;
	}

	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}

	public void setCOMPANY_ID(String cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}

	public String getCOMPANY_DETAIL() {
		return COMPANY_DETAIL;
	}

	public void setCOMPANY_DETAIL(String cOMPANY_DETAIL) {
		COMPANY_DETAIL = cOMPANY_DETAIL;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}

	public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}

	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
	}

	public static long getDatabaseTableID() {
		return (long) 2;
	}

}

