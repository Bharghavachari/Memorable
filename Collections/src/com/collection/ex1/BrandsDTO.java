package com.collection.ex1;

import java.io.Serializable;

public class BrandsDTO implements Serializable {

	private int Brandid;
	private String BrandName;
	private int Established;
	private String IndustryType;
	private String HeadQuater;
	
	public BrandsDTO() {
		super();
		}

	public int getBrandid() {
		return Brandid;
	}

	public void setBrandid(int brandid) {
		Brandid = brandid;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public int getEstablished() {
		return Established;
	}

	public void setEstablished(int established) {
		Established = established;
	}

	public String getIndustryType() {
		return IndustryType;
	}

	public void setIndustryType(String industryType) {
		IndustryType = industryType;
	}

	public String getHeadQuater() {
		return HeadQuater;
	}

	public void setHeadQuater(String headQuater) {
		HeadQuater = headQuater;
	}

	@Override
	public String toString() {
		return "BrandsDTO [Brandid=" + Brandid + ", BrandName=" + BrandName + ", Established=" + Established
				+ ", IndustryType=" + IndustryType + ", HeadQuater=" + HeadQuater + "]";
	}
	
}
