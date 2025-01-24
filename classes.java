//WAP to create a employee class and create methods having details of employee i, employee name,employee adress?

class Employee{
    int empId;
    String empName;
    String empAge;
    String empAddress;
    String empDepartment;
    
    void setDetails(int empId,String empName,String empAge,String empAddress,String empDepartment){
        this.empId=empId;
        this.empName=empName;
        this.empAge=empAge;
        this.empAddress=empAddress;
        this.empDepartment = empDepartment;
    }
    
    void getDetails(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Age : "+empAge);
        System.out.println("Employee Address : "+empAddress);
        System.out.println("Employee Department : "+empDepartment);
    }
}

public class classes
{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setDetails(101,"Rahul","25","Pune","IT");
        e2.setDetails(102,"Vasu","21","Mumbai","Marketing");
        e1.getDetails();
        e2.getDetails();  
    }
}