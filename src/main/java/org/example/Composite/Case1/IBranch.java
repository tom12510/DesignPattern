package org.example.Composite.Case1;

import java.util.ArrayList;

/**
 * 树枝接口(进行关联操作)
 */
public interface IBranch extends ICorp {
    //添加节点
    void addSubordinate(ICorp corp);

    //获取结点
    ArrayList<ICorp> getSubordinate();

     void setParent(ICorp branch);

    ICorp getParent();
}
