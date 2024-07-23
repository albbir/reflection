package school;


public class Teacher {
    private String teacher;
    //profession
    private int cabinet_number;
    //number of cabinet
    private int age;
    //teachers age

    private Teacher(String teacher, int cabinet_number, int age){
        this.teacher = teacher;
        this.cabinet_number = cabinet_number;
        this.age = age;
    }

    Teacher(){}

    private String getTeacher() {
        return teacher;
    }

    private void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setCabinet_number(int cabinet_number){
        this.cabinet_number = cabinet_number;
    }

    private int getCabinet_number(){
        return cabinet_number;
    }
}