package com.cg.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Student implements Serializable{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue (strategy= GenerationType.SEQUENCE, generator="Seq1")
	@SequenceGenerator(name = "Seq1", sequenceName = "SEQ_1",initialValue = 102)
	private int studId;
	private String studName;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	
	

}
