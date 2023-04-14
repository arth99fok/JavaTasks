package level11.task08;

public class Programmer {
    private int salary = 1000;

    public void setSalary(int salary) {
        this.salary = Math.max(this.salary, salary);
    }

    public int getSalary() {
        return this.salary;
    }

}