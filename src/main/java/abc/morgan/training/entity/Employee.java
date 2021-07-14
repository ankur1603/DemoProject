package abc.morgan.training.entity;

public class Employee extends Person{
    private Integer empId;

    public Employee(){

    }

    public Employee(String name,Integer age,Integer employeeId){
        super(name,age);
        this.empId = employeeId;
    }

    public Employee(String name,int employeeId){
        super(name);
        this.empId = employeeId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String greetWithName(String language){
        return "Hello! My name is "+ this.getName() +". I am a "+ language + " programmer";
    }
}
