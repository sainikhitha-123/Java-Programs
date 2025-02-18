class Employee {
        String name;
        int age;
    public Employee(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Nikhitha", 21);
        Employee emp2 = new Employee("Kavitha", 30);
        emp1.print();
        emp2.print();

        // Comparing by age
        if (emp1.age > emp2.age) {
            System.out.println(emp1.name + " is older");
        } else if (emp1.age < emp2.age) {
            System.out.println(emp2.name + " is older");
        } else {
            System.out.println(emp1.name + " and " + emp2.name + " are same age");
        }

        // Comparing by name
        if (emp1.name.compareTo(emp2.name) > 0) {
            System.out.println(emp1.name + " comes after " + emp2.name);
        } else if (emp1.name.compareTo(emp2.name) < 0) {
            System.out.println(emp1.name + " comes before " + emp2.name);
        } else {
            System.out.println(emp1.name + " and " + emp2.name + "same");
        }
    }
}

