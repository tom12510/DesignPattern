package org.example.Composite.Case1;

import java.util.ArrayList;

/**
 * 组合类 负责父子结点关联
 * 实现通用方法
 */
public class Branch implements IBranch {

    private String name = "";

    private String position = "";

    private int salary = 0;
    //聚合ICop
    ArrayList<ICorp> subordinateList = new ArrayList<>();

    //通过构造函数生成结点必要信息
    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }


    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }

    //领导也是人，他也有信息
    @Override
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
