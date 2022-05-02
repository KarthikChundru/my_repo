package com.zensar;


public class ProjectBean {


private String name;
private String departmentId;


public ProjectBean() {
super();
}


    public ProjectBean(String name, String departmentId) {
    super();
    this.name = name;
    this.departmentId = departmentId;
}


    public String getName() {
    return name;
}


    public void setName(String name) {
    this.name = name;
}


    public String getDepartmentId() {
    return departmentId;
}


    public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
}


    public String toString() {
    return name + " , departmentId= " + departmentId;
  }
}