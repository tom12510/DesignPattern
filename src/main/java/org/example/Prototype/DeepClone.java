package org.example.Prototype;

import lombok.Data;

import java.io.*;
import java.time.LocalDate;

/**
 * 深拷贝
 */
@Data
public class DeepClone implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneNamel;

    private String cloneClass;

    private CloneThing cloneThing;

    public DeepClone(String cloneNamel, String cloneClass) {
        this.cloneNamel = cloneNamel;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //对基本数据类型克隆
        DeepClone deep = (DeepClone) super.clone();

        //对引用数据类型单独处理
        deep.cloneThing = (CloneThing) deep.cloneThing.clone();

        return super.clone();
    }


}
