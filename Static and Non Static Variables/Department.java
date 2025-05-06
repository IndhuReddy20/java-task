class Department {
    static String departmentName = "HR";
    String employeeName;

    public static void main(String[] args) {
        Department d1 = new Department();
        d1.employeeName = "John";
        Department d2 = new Department();
        d2.employeeName = "Alice";

        System.out.println("Department: " + Department.departmentName);
        System.out.println("Employee 1: " + d1.employeeName);
        System.out.println("Employee 2: " + d2.employeeName);

        Department.departmentName = "Marketing";

        System.out.println("\nAfter modification:");
        System.out.println("Department: " + Department.departmentName);
        System.out.println("Employee 1: " + d1.employeeName);
        System.out.println("Employee 2: " + d2.employeeName);
    }
}
