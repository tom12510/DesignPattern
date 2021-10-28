package org.example.Composite.Case1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Branch root = compositeCorpTree();
        // 获取根结点数据
        System.out.println(root.getInfo());

        System.out.println(getTreeInfo(root));
    }

    // 生成树
    public static Branch compositeCorpTree() {
        Branch root = new Branch("miaomiaole", "Boss", 10000);
        Branch developDep = new Branch("miaomiaole_1", "部门研发经理", 100000);
        Branch financeDep = new Branch("miaomiaole_2", "财务部经理", 20000);
        Branch salesDep = new Branch("miaomiaole_3", "销售部门经理", 1000);
        //再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);

        //把所有的小兵都产生出来
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEO秘书", 8000);
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副经理", 20000);

        //开始组装
        // root ->{k,salesDep,financeDep,developDep} -> {zhengLaoLiu,firstDevGroup,secondDevGroup....}
        root.addSubordinate(k);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        root.addSubordinate(developDep);

        //研发部
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        //开发部
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        // 财务部
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        financeDep.addSubordinate(j);
        return root;
    }
    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root){
        ArrayList<ICorp> subordinateList = root.getSubordinate();
        String info = "";
        for(ICorp s :subordinateList){
            if(s instanceof Leaf){ //是员工就直接获得信息
                info = info + s.getInfo()+"\n";
            }else{ //是个小头目
                info = info + s.getInfo() +"\n"+ getTreeInfo((Branch)s);
            }
        }
        return info;
    }

}
