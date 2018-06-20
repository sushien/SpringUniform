package com.uniform.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uniform_data database table.
 * 
 */
@Entity
@Table(name="uniform_data")
@NamedQuery(name="UniformData.findAll", query="SELECT u FROM UniformData u")
public class UniformData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Id")
	private int id;

	@Column(name="School_Name")
	private String school_Name;

	@Column(name="Student_Name")
	private String student_Name;

	@Column(name="Uniform_Id")
	private int uniform_Id;

	public UniformData() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchool_Name() {
		return this.school_Name;
	}

	public void setSchool_Name(String school_Name) {
		this.school_Name = school_Name;
	}

	public String getStudent_Name() {
		return this.student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getUniform_Id() {
		return this.uniform_Id;
	}

	public void setUniform_Id(int uniform_Id) {
		this.uniform_Id = uniform_Id;
	}

}
