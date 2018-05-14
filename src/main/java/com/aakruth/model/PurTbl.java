package com.aakruth.model;
// Generated Apr 16, 2017 12:21:33 AM by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * PurTbl generated by hbm2java
 */
@Entity
@Table(name = "pur_tbl", catalog = "aakruthdb")
public class PurTbl implements java.io.Serializable {

	@JsonView(DataTablesOutput.View.class)
	private Integer purId;
	@JsonView(DataTablesOutput.View.class)
	private PrdTbl prdTbl;
	@JsonView(DataTablesOutput.View.class)
	private UsrTbl usrTbl;
	@JsonView(DataTablesOutput.View.class)
	private int cnt;
	@JsonView(DataTablesOutput.View.class)
	private Date purdte;
	@JsonView(DataTablesOutput.View.class)
	private Date enddte;
	@JsonView(DataTablesOutput.View.class)
	private char sta;
	@JsonView(DataTablesOutput.View.class)
	private Integer invoice;
	@JsonView(DataTablesOutput.View.class)
	private BigDecimal vat;

	@Override
	public String toString() {
		return "PurTbl [purId=" + purId + ", prdTbl=" + prdTbl + ", usrTbl=" + usrTbl + ", cnt=" + cnt + ", purdte="
				+ purdte + ", enddte=" + enddte + ", sta=" + sta + ", invoice=" + invoice + ", vat=" + vat + "]";
	}

	public PurTbl() {
	}

	public PurTbl(PrdTbl prdTbl, UsrTbl usrTbl, int cnt, Date purdte, Date enddte, char sta) {
		this.prdTbl = prdTbl;
		this.usrTbl = usrTbl;
		this.cnt = cnt;
		this.purdte = purdte;
		this.enddte = enddte;
		this.sta = sta;
	}

	public PurTbl(PrdTbl prdTbl, UsrTbl usrTbl, int cnt, Date purdte, Date enddte, char sta, Integer invoice,
			BigDecimal vat) {
		this.prdTbl = prdTbl;
		this.usrTbl = usrTbl;
		this.cnt = cnt;
		this.purdte = purdte;
		this.enddte = enddte;
		this.sta = sta;
		this.invoice = invoice;
		this.vat = vat;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PUR_ID", unique = true, nullable = false)
	public Integer getPurId() {
		return this.purId;
	}

	public void setPurId(Integer purId) {
		this.purId = purId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRD_ID", nullable = false)
	public PrdTbl getPrdTbl() {
		return this.prdTbl;
	}

	public void setPrdTbl(PrdTbl prdTbl) {
		this.prdTbl = prdTbl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USR_ID", nullable = false)
	public UsrTbl getUsrTbl() {
		return this.usrTbl;
	}

	public void setUsrTbl(UsrTbl usrTbl) {
		this.usrTbl = usrTbl;
	}

	@Column(name = "CNT", nullable = false)
	public int getCnt() {
		return this.cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PURDTE", nullable = false, length = 10)
	public Date getPurdte() {
		return this.purdte;
	}

	public void setPurdte(Date purdte) {
		this.purdte = purdte;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDTE", nullable = false, length = 10)
	public Date getEnddte() {
		return this.enddte;
	}

	public void setEnddte(Date enddte) {
		this.enddte = enddte;
	}

	@Column(name = "STA", nullable = false, length = 1)
	public char getSta() {
		return this.sta;
	}

	public void setSta(char sta) {
		this.sta = sta;
	}

	@Column(name = "INVOICE")
	public Integer getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Integer invoice) {
		this.invoice = invoice;
	}

	@Column(name = "VAT", precision = 10)
	public BigDecimal getVat() {
		return this.vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

}