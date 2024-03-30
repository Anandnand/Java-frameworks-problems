package com.mapping.manyToMany;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employees {
	@Id
	int id;
	String EmployeeName;
	String team;
	@ManyToMany
	List<Technology> tech;
	public Employees() {
		super();
	}
	public Employees(int id, String employeeName, String team, List<Technology> tech) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		this.team = team;
		this.tech = tech;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public List<Technology> getTech() {
		return tech;
	}
	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", EmployeeName=" + EmployeeName + ", team=" + team + ", tech=" + tech + "]";
	}

}
