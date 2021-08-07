package com.springbootsecurity.model;

public class Employee {
	
	 private int empId;
	    private String empName;
	    private String empDept;
	    private String empLocation;
		public Employee(int empId, String empName, String empDept, String empLocation) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empDept = empDept;
			this.empLocation = empLocation;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		public String getEmpLocation() {
			return empLocation;
		}
		public void setEmpLocation(String empLocation) {
			this.empLocation = empLocation;
		}
		@Override
		public String toString() {
			return "EmployeeModel [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empLocation="
					+ empLocation + "]";
		}
	    
	    

}
