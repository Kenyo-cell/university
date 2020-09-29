public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double averageEduLevel;

    public Student(String name, int age, double level) {
        this.name = name;
        this.age = age;
        averageEduLevel = level;
    }

    @Override
    public int compareTo(Student o) {
        return this.averageEduLevel == o.averageEduLevel ? 0 :
            this.averageEduLevel > o.averageEduLevel ? 1 : -1;
    }

    public String getName() {
        return name;
    }
    
    public double getLevel() {
        return this.averageEduLevel;
    }

    public boolean equals(Student o) {
        return this.compareTo(o) == 0 ? true : false;
    }

    public String toString() {
        return String.format("%s (%d): %f", name, age, averageEduLevel);
    }
}
