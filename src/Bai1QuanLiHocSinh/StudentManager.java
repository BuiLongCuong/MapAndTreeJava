package Bai1QuanLiHocSinh;

import java.util.HashMap;
import java.util.Map;

public class StudentManager implements Manager {
    private Map<Integer, Student> studentMap = new HashMap<>();
    private int size;

    public StudentManager() {
        this.studentMap = studentMap;
        size=0;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void add(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void edit(int id, String name, String sex, double[] arrScores) {
        int index =findById(id);
        for (Map.Entry<Integer, Student> hocSinh :studentMap.entrySet()) {
            if(hocSinh.getKey()==index){
                hocSinh.getValue().setName(name);
                hocSinh.getValue().setGender(sex);
                hocSinh.getValue().setArrScores(arrScores);
            }
        }
    }

    @Override
    public void delete(int id) {
        studentMap.remove(id);
    }

    @Override
    public void showAll() {
        for (Map.Entry<Integer, Student> arrStudent : studentMap.entrySet()) {
            System.out.println(arrStudent.getValue());
        }
    }

//    @Override
//    public  Map<Integer, Bai1.Student> showAll() {
////        for (Map.Entry<Integer, Bai1.Student> arrStudent : studentMap.entrySet()) {
////            System.out.println(arrStudent.getValue());
////        }
//        return studentMap;
//    }

    @Override
    public Map<Integer, Student> findByName(String name) {
        Map<Integer,Student> searchStudent = new HashMap<>();
        for (Map.Entry<Integer,Student> student: studentMap.entrySet()) {
            if(student.getValue().getName().toLowerCase().contains(name.toLowerCase())){
                searchStudent.put(student.getKey(),student.getValue());
            }
        }
        return searchStudent;
    }

    @Override
    public int findById(int id) {
        for (Map.Entry<Integer, Student> sinhVien : studentMap.entrySet()) {
            if(sinhVien.getKey() ==id){
                return sinhVien.getKey();
            }
        }
        return -1;
    }

    @Override
    public Student findStudentById(int id) {
        for (Map.Entry<Integer, Student> sinhVien : studentMap.entrySet()) {
            if(sinhVien.getKey()==id){
                return sinhVien.getValue();
            }
        }
        return null;
    }

    @Override
    public Student maxAvg() {
        double maxAvg= 0;
        Student sinhVienHasMaxAvg = null;
        for (Map.Entry<Integer, Student> student :studentMap.entrySet()) {
            if(student.getValue().avg()>maxAvg){
                maxAvg=student.getValue().avg();
                sinhVienHasMaxAvg= student.getValue();
            }
        }
        return sinhVienHasMaxAvg;
    }
}

