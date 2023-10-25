public class Student {
    String name;
    int age;
    String subject;

    public Student(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", 20, "Математика");
        Student student2 = new Student("Иван", 22, "Физика");

        compareStudents1(student1, student2);
        compareStudents2(student1, student2);
    }

    public static void compareStudents1(Student student1, Student student2) {
        if (student1.equals(student2)) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void compareStudents2(Student student1, Student student2) {
        if (student1.getName().equals(student2.getName())) {
            if (student1.getAge() == student2.getAge()) {
                if (student1.getSubject().equals(student2.getSubject())) {
                    System.out.println("Студенты равны");
                } else {
                    System.out.println("Студенты не равны. Различие в специальности");
                }
            } else {
                System.out.println("Студенты не равны. Различие в возрасте");
            }
        } else {
            System.out.println("Студенты не равны. Различие в имени");
        }
    }
}

