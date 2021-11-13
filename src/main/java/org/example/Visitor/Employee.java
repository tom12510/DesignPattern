package org.example.Visitor;

public abstract class Employee {
    public final static int MALE = 0;

    public final static int FEMALE = 1;

    private String name;

    private int salary;

    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public final void report() {
        System.out.println(this);
        System.out.println("其他信息");
        System.out.println(this + this.getOtherInfo());
    }

    //拼装员工其他的信息
    protected abstract String getOtherInfo();
}
