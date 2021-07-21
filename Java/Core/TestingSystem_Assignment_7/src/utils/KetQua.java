package utils;

import java.io.Serializable;
import java.time.LocalDate;

public class KetQua implements Serializable{
	LocalDate date;
	String nhat;
	String nhi;
	String ba;
	String bon;
	String nam;
	String sau;
	String bay;
	String dacbiet;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getNhat() {
		return nhat;
	}

	public void setNhat(String nhat) {
		this.nhat = nhat;
	}

	public String getNhi() {
		return nhi;
	}

	public void setNhi(String nhi) {
		this.nhi = nhi;
	}

	public String getBa() {
		return ba;
	}

	public void setBa(String ba) {
		this.ba = ba;
	}

	public String getBon() {
		return bon;
	}

	public void setBon(String bon) {
		this.bon = bon;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getSau() {
		return sau;
	}

	public void setSau(String sau) {
		this.sau = sau;
	}

	public String getBay() {
		return bay;
	}

	public void setBay(String bay) {
		this.bay = bay;
	}

	public String getDacbiet() {
		return dacbiet;
	}

	public void setDacbiet(String dacbiet) {
		this.dacbiet = dacbiet;
	}

	public KetQua(LocalDate date, String nhat, String nhi, String ba, String bon, String nam, String sau, String bay,
			String dacbiet) {
		super();
		this.date = date;
		this.nhat = nhat;
		this.nhi = nhi;
		this.ba = ba;
		this.bon = bon;
		this.nam = nam;
		this.sau = sau;
		this.bay = bay;
		this.dacbiet = dacbiet;
	}
	
	public KetQua() {
	}

	@Override
	public String toString() {
		return "KetQua [date=" + date + ", nhat=" + nhat + ", nhi=" + nhi + ", ba=" + ba + ", bon=" + bon + ", nam="
				+ nam + ", sau=" + sau + ", bay=" + bay + ", dacbiet=" + dacbiet + "]";
	}
	
	
}
