package com.exam.dto;

public class ExamDto {

	private int seq;
	private String name;
	private int score;
	
	public ExamDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamDto(int seq, String name, int score) {
		super();
		this.seq = seq;
		this.name = name;
		this.score = score;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "ExamDto [seq=" + seq + ", name=" + name + ", score=" + score + "]";
	}
}
