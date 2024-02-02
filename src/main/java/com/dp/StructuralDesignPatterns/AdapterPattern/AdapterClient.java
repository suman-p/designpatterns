package com.dp.StructuralDesignPatterns.AdapterPattern;

public class AdapterClient {
    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Calvin Klien");
        employee.setJobTitle("Managing Director");
        employee.setOfficeLocation("Domain, Austin");
    }

    public static void main(String[] args) {
        // Using class / Two-way Adapter
        EmployeeClassAdapter employeeClassAdapter=new EmployeeClassAdapter();
        populateEmployeeData(employeeClassAdapter);
        BusinessCardDesigner businessCardDesigner=new BusinessCardDesigner();
        String card = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println(card);
        System.out.println("***************************************************");
        // Using Object Adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        businessCardDesigner=new BusinessCardDesigner();
        card = businessCardDesigner.designCard(employeeObjectAdapter);
        System.out.println(card);

    }
}
