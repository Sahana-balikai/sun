package com.sahana.data.dto;

public class CountryDTO {
	private String name;
	private String continent;
	private String[] states;
	private int population;
	private String primeMinister;
	private String president;
	private String[] languages;
	
	public CountryDTO() {
		System.out.println("default constroctors");
	}
	public CountryDTO(String name, String continent) {
		this.name = name;
		this.continent = continent;
	}
	public CountryDTO(int population, String primeMinister, String president) {
	this.states=states;
	this.population=population;
	this.primeMinister=primeMinister;
	this.president=president;
	}
	public CountryDTO(String[] states, String[] languages) {
		this.states=states;
		this.languages=languages;
	}
	public CountryDTO(String name) {
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}
	public String getContinent() {
		return continent;
	}
	public String[] getStates() {
		return states;
	}
	public int getPopulation() {
		return population;
	}
	public String getPrimeMinister() {
		return primeMinister;
	}
	public String getPresident() {
		return president;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public void setStates(String[] states) {
		this.states = states;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	

}
