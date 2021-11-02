package org.example.Flyweight.Case;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象创建工厂
 */
public class SignInfoFactory {

    //容量池
    private static Map<String, SignInfo> pool = new HashMap<>();

    // 已弃用
    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "----建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---直接从池中取得");
        }
        return result;
    }
}
