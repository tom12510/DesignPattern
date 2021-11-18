package org.example.Visitor.Case1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for (Employee employee : mockEmployee()) {
            employee.report();
        }
    }

    private static List<Employee> mockEmployee() {
        List<Employee> employees = new ArrayList<>();
        CommonEmployee commonEmployee = new CommonEmployee();
        return null;
    }
}
