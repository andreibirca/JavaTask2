package pack1;

public class Student {
    private String name;
    private int age;

    void setData(String n, int a ){
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setData("Popescu", 19);
        student2.setData("Vasilache", 22);

        System.out.println("Varsta medie a studentilor este: "
            +(((double)student1.getAge() + (double)student2.getAge())/2));
    }
}
