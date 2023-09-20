package Bai1QuanLiHocSinh;

import java.util.Map;

public interface Manager {
    void add(Student student);
    void edit(int id, String name, String sex, double[] arrScores);
    void delete(int id);
    //        Map<Integer, Bai1.Student> showAll();
    void showAll();
    Map<Integer, Student> findByName(String name);
    int findById(int id);
    Student findStudentById(int id);
    Student maxAvg();

}

