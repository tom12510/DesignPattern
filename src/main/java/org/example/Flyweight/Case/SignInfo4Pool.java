package org.example.Flyweight.Case;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * SignInfo对象池
 */
@Data
@NoArgsConstructor
public class SignInfo4Pool extends SignInfo {
    // 对象变量唯一标识(必然有一个唯一的、可访问的状态标志该对象，而
    //且池中的对象声明周期是由池容器决定)
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

}
