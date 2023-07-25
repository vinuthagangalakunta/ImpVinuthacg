package com.financialorgratingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Feedback_tb")
public class Feedback implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="feedback_Id")
	private int feedbackId;
	@Column(name="message")
	private String message;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="organizationId")
	private Organization org;

	public int getFeedbackId() {
		return feedbackId;
	}
	
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	
	public Feedback(int feedbackId, String message, User user, Organization org) {
		super();
		this.feedbackId = feedbackId;
		this.message = message;
		this.user = user;
		this.org = org;
	}

	public Feedback() {
		
	}

	
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", message=" + message + ", user=" + user + ", org=" + org + "]";
	}
		
	
}