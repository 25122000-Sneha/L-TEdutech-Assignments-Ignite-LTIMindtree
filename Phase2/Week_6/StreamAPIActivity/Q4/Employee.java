package Phase2.Week_6.StreamAPIActivity.Q4;


class Employee{
    private String name;
    private Double salary;
    
    Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
    String getName(){
        return this.name;
    }
    Double getSalary(){
        return this.salary;
    }
    
    public String toString() {
        //Fill your code here
        return this.name+"\t"+this.salary;
    } 
}

