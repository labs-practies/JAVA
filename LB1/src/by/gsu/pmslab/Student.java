package by.gsu.pmslab;

public class Student {
    private String lastName;
    private int age;
    private boolean debt;
    public Student (String lastName, int age, boolean debt){
        this.lastName = lastName;
        this.age  = age;
        this.debt = debt;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDebt() {
        return debt;
    }

    public void setDebt(boolean debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return lastName+";"+age+";"+debt;
    }
}
