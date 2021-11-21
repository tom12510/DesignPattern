package org.example.Builder.Case3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String name;
    private int age;
    private int gender;
}
