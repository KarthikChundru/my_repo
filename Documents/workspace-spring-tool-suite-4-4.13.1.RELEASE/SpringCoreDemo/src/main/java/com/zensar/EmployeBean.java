package com.zensar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class EmployeBean {


private String name;

@Autowired
@Qualifier("projectBeans2")
    private ProjectBean project;

    public EmployeBean() {
}

    public EmployeBean(String name, ProjectBean project) {
    super();
    this.name = name;
    this.project = project;
}


    public EmployeBean(ProjectBean project) {
    this.project = project;
         System.out.println("Inside single parameterized constructor...");
}
    public String getName() {
    return name;
}
    public void setName(String name) {
    this.name = name;
}
    public ProjectBean getProject() {
    return project;
}
    public void setProject(ProjectBean project) {
    this.project = project;

}


@Override
    public String toString() {
    return " [name=" + name + ", project=" + project + " ]";
  }

}