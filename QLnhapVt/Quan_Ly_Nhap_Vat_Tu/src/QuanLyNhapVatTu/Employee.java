package QuanLyNhapVatTu;

import java.util.*;

public class Employee extends Human {
    private String code;
    private String shift;
    Warehoure department;

    public Employee(String name, String contact, String code, String shift, Warehoure department) {
        super(name, contact);
        this.code = code;
        this.shift = shift;
        this.department = department;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        code = scanner.nextLine();
        System.out.println("Nhap ca lam: ");
        shift = scanner.nextLine();

        System.out.print("Nhap ten kho hang cua nv: ");
        String departmentName = scanner.nextLine();

    }

    public void output() {
        System.out.println("\n code: " + code);
        System.out.println("\n shift: " + shift);
        if (department != null) {
            System.out.println("Kho hang cua nv: " + department.getName());
        } else {
            System.out.println("NV chua duoc gan vao kho hang nao.");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Warehoure getDepartment() {
        return department;
    }

    public void setDepartment(Warehoure department) {
        this.department = department;
    }

}
