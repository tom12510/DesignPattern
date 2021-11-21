package org.example.Builder.Case2;

/**
 * 实现部分商品行为(构建材料不同项)
 */
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}
