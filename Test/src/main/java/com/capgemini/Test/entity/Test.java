package com.capgemini.Test.entity;

import java.math.BigInteger;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class Test {

	@Id
	private BigInteger id;
	private int totalmarks;
	private String title;
	private String duration;
	private LocalDateTime starttime;
	private LocalDateTime endtime;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public LocalDateTime getStarttime() {
		return starttime;
	}
	public void setStarttime(LocalDateTime starttime) {
		this.starttime = starttime;
	}
	public LocalDateTime getEndtime() {
		return endtime;
	}
	public void setEndtime(LocalDateTime endtime) {
		this.endtime = endtime;
	}
	

	
}
