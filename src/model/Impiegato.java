package model;

import java.time.LocalDate;

public class Impiegato {
	private int empno;
	private String ename;
    private String job;
    private String  Manager;
	private LocalDate hiredate;
	private double sal;
	private double comm;
	private String department;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Impiegato [empno=" + empno + ", ename=" + ename + ", job=" + job + ", Manager=" + Manager
				+ ", hiredate=" + hiredate + ", sal=" + sal + ", comm=" + comm + ", department=" + department + "]";
	}
		

}
