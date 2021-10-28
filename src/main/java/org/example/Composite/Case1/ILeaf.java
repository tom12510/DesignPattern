package org.example.Composite.Case1;

/**
 * 叶子结点接口
 */
public interface ILeaf extends ICorp{
    void setParent(ICorp branch);

    ICorp getParent();
}
