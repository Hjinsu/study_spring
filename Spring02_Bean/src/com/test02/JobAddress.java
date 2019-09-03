package com.test02;

public class JobAddress {
	private Address addr;
	private String jobName;
	
	public JobAddress() {
		this.addr = new Address("홍길동", "서울 강남", "010-1010-1010");
		this.jobName = "web개발자";
	}
	
	public JobAddress(Address addr, String jobName) {
		this.addr = addr;
		this.jobName = jobName;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public Address getAddr() {
		return addr;
	}
	public String getJobName() {
		return jobName;
	}
	
	public String toString() {
		return addr.toString() + "\t 직업 : " + jobName;
	}
	
	
}
