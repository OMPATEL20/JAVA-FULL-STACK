

import java.util.Scanner;
class Employee{
    private String name;
    private String address;
    private String mobile;

   
    public Employee()
    {
        
    }

    public Employee(String name, String address, String mobile)
    {
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }

    public void setName(String name)
    {
         this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setMobile(String mobile)
    {
        this.mobile=mobile;
    }

    public String getName()
    {
        return this.name;
    }

    
    public String getMobile()
    {
        return this.mobile;
    }
    
    public String getAddress()
    {
        return this.address;
    }

    public void displayEmployeeDetails()
    {
        
        System.out.println("Name: "+this.getName());
        System.out.println("Address: "+this.getAddress());
        System.out.println("Mobile: "+this.getMobile());
    }
}
  






public class employeemain{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Employee employee = new Employee();

            System.out.println("Enter the name: ");
            String name=sc.nextLine();
            employee.setName(name);

            System.out.println("Enter Address: ");
            String address=sc.nextLine();
            employee.setAddress(address);

            System.out.println("Enter mobile: ");
            String mobile=sc.nextLine();
            employee.setMobile(mobile);

            System.out.println("Employee details: ");
            employee.displayEmployeeDetails();

        }
}
