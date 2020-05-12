package dbKadai3;

import java.util.Date;

public class EmployeeInfoBean {
	public int id;
	public String name;
	public String branch;
	public String department;
	public String position;
	public Date joinDate;
	public int age;
    /**
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id セットする id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return branch
     */
    public String getBranch() {
        return branch;
    }
    /**
     * @param branch セットする branch
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }
    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }
    /**
     * @param department セットする department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * @return position
     */
    public String getPosition() {
        return position;
    }
    /**
     * @param position セットする position
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /**
     * @return joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }
    /**
     * @param joinDate セットする joinDate
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    /**
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age セットする age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "id=" + id + ", name=" + name + ", branch=" + branch + ", department=" + department + ", position="
                + position + ", joinDate=" + joinDate + ", age=" + age;

    }
}
