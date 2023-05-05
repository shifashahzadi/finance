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
@Table(name = "TBLJOURNAL")

public class Journal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long JOURNAL_ID;
	
	@Column(name = "TRANSACTION_ID")
	private String TRANSACTION_ID;
	
	@Transient
	private String TRANSACTION_DETAIL;
		
	@Column(name = "JOURNAL_DATE")
	private String JOURNAL_DATE;
	
	@Column(name = "JOURNAL_DESCRIPTION")
	private String JOURNAL_DESCRIPTION;
	
	@Column(name = "JOURNAL_DEBITAMOUNT")
	private Long JOURNAL_DEBITAMOUNT;
	
	@Column(name = "JOURNAL_CREDITAMOUNT")
	private Long JOURNAL_CREDITAMOUNT;
	
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
	
		
	public long getJOURNAL_ID() {
		return JOURNAL_ID;
	}


	public void setJOURNAL_ID(long jOURNAL_ID) {
		JOURNAL_ID = jOURNAL_ID;
	}


	public String getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}


	public void setTRANSACTION_ID(String tRANSACTION_ID) {
		TRANSACTION_ID = tRANSACTION_ID;
	}


	public String getTRANSACTION_DETAIL() {
		return TRANSACTION_DETAIL;
	}


	public void setTRANSACTION_DETAIL(String tRANSACTION_DETAIL) {
		TRANSACTION_DETAIL = tRANSACTION_DETAIL;
	}


	public String getJOURNAL_DATE() {
		return JOURNAL_DATE;
	}


	public void setJOURNAL_DATE(String jOURNAL_DATE) {
		JOURNAL_DATE = jOURNAL_DATE;
	}


	public String getJOURNAL_DESCRIPTION() {
		return JOURNAL_DESCRIPTION;
	}


	public void setJOURNAL_DESCRIPTION(String jOURNAL_DESCRIPTION) {
		JOURNAL_DESCRIPTION = jOURNAL_DESCRIPTION;
	}

	public Long getJOURNAL_DEBITAMOUNT() {
		return JOURNAL_DEBITAMOUNT;
	}


	public void setJOURNAL_DEBITAMOUNT(Long jOURNAL_DEBITAMOUNT) {
		JOURNAL_DEBITAMOUNT = jOURNAL_DEBITAMOUNT;
	}


	public Long getJOURNAL_CREDITAMOUNT() {
		return JOURNAL_CREDITAMOUNT;
	}


	public void setJOURNAL_CREDITAMOUNT(Long jOURNAL_CREDITAMOUNT) {
		JOURNAL_CREDITAMOUNT = jOURNAL_CREDITAMOUNT;
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
		return (long) 11;
	}
	
}
