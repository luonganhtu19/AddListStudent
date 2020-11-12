package function;

import Entities.Student;

public class ManageStudent {
    private static Student[] listStudent= new Student[0];
    public Student get(int index){
        return this.listStudent[index];
    }

    public void add(Student _students){
        if (_students==null){
            return;
        };
        int lengthListStudent=listStudent.length;
        Student[] listStudentNew=new Student[lengthListStudent+1];
        for (int i = 0; i < listStudent.length; i++) {
            listStudentNew[i]=listStudent[i];
        }
        listStudentNew[lengthListStudent]=_students;
        listStudent=listStudentNew;
    }
    public Student[] getListStudent() {
        return listStudent;
    }
    public void display() {
        for (Student student : this.getListStudent()) {
            System.out.println(student.toString());
        }
    }
}
