package org.example.Factory.Implement;

import org.example.Factory.Abstract.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 */
public class ProductFactory {
    private static final Map<String, Product> parMap = new HashMap();

    public static synchronized Product createProduct(String type) {
        Product product = null;
        if (parMap.containsKey(type)) {
            product = parMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }

            parMap.put(type, product);
        }
        return product;
    }
}
