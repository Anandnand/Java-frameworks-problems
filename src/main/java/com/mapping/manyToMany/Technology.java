package com.mapping.manyToMany;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int techId;
	String techName;
	
	@ManyToMany
	List<Employees> empl;

	public Technology() {
		super();
	}

	public Technology(int techId, String techName, List<Employees> empl) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.empl = empl;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public List<Employees> getEmpl() {
		return empl;
	}

	public void setEmpl(List<Employees> empl) {
		this.empl = empl;
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", empl=" + empl + "]";
	}
	
	

}
