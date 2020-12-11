package com.sahana.data.dto;

public class CompanyDTO {
	private String name;
	private String type;
	private String location;
	private int companyId;
	private String webSite;
    public CompanyDTO()
    {
    	System.out.println("Default constructor ");
    }
    public CompanyDTO(String name,String type,String location,int companyId,String website )
    {
    	System.out.println("CompanyDTO constructor");
    	this.name=name;
    	this.type=type;
    	this.location=location;
    	this.companyId=companyId;
    	this.webSite=webSite;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;

}

}
