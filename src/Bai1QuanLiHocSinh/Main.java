package Bai1QuanLiHocSinh;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager clazz = new StudentManager();
        Student sv1 = new Student("An","Nam",new double[]{9,9,9});
        Student sv2 = new Student("Khang","Nam",new double[]{7,6,7});
        Student sv3 = new Student("Tuấn","Nam",new double[]{8,8,8});
        Student sv4 = new Student("Tú","Nam",new double[]{7,7,7});
        Student sv5 = new Student("Bình","Nam",new double[]{5,5,5});
        clazz.add(sv1);
        clazz.add(sv2);
        clazz.add(sv3);
        clazz.add(sv4);
//        System.out.println(clazz.showAll());
//        for (Map.Entry<Integer, Bai1.Student> arrStudent : clazz.showAll().entrySet()) {
//            System.out.println(arrStudent.getValue());
//        }
//        clazz.edit(2,sv5);
//        clazz.delete(2);
        System.out.println("Danh sách học sinh:");
//        for (Map.Entry<Integer, Bai1.Student> arrStudent : clazz.showAll().entrySet()) {
//            System.out.println(arrStudent.getValue());
//        }
        clazz.showAll();
        Scanner input = new Scanner(System.in);
        int choice;
        do { System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Menu quản lí học sinh:");
            System.out.println("1.Thêm mới sinh viên.");
            System.out.println("2.Xóa sinh viên.");
            System.out.println("3.Sửa sinh viên.");
            System.out.println("4.Tìm kiếm sinh viên.");
            System.out.println("5.Danh sách học viên bạn cần tìm");
            System.out.println("6.Học viên có điểm trung bình cao nhất.");
            System.out.println("7.Danh sách sinh viên.");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhập tên sinh viên:");
                    String name = input.nextLine();
                    System.out.println("Nhập giới tính sinh viên:");
                    String sex = input.nextLine();
                    double[]arrScores = new double[3];
                    System.out.println("Nhập điểm môn Toán:");
                    double toan = input.nextDouble();
                    arrScores[0]=toan;
                    System.out.println("Nhập điểm môn Văn:");
                    double van = input.nextDouble();
                    arrScores[1]=van;
                    System.out.println("Nhập điểm môn Anh:");
                    double anh = input.nextDouble();
                    arrScores[2]=anh;
                    Student newStudent = new Student(name,sex,arrScores);
                    clazz.add(newStudent);
//                    for (Map.Entry<Integer, Bai1.Student> arrStudent : clazz.showAll().entrySet()) {
//                        System.out.println(arrStudent.getValue());
//                    }
                    clazz.showAll();
                    break;
                case 2:
                    System.out.println("Nhập số id của sinh viên bạn muốn xóa:");
                    int idDelete = input.nextInt();
                    if(clazz.findById(idDelete)!=-1){
                        clazz.delete(idDelete);
                    }else{
                        System.out.println("Không có sinh viên nào cả!!");
                    }
//                    for (Map.Entry<Integer, Bai1.Student> arrStudent : clazz.showAll().entrySet()) {
//                        System.out.println(arrStudent.getValue());
//                    }
                    clazz.showAll();
                    break;
                case 3:
                    System.out.println("Nhập số id bạn muốn sửa:");
                    int editId = input.nextInt();
                    input.nextLine();
                    if(clazz.findById(editId)!=-1){
                        System.out.println("Nhập tên sinh viên:");
                        String editName = input.nextLine();
                        System.out.println("Nhập giới tính sinh viên:");
                        String editSex = input.nextLine();
                        double[]editArrScores = new double[3];
                        System.out.println("Nhập điểm môn Toán:");
                        double editToan = input.nextDouble();
                        editArrScores[0]=editToan;
                        System.out.println("Nhập điểm môn Văn:");
                        double editVan = input.nextDouble();
                        editArrScores[1]=editVan;
                        System.out.println("Nhập điểm môn Anh:");
                        double editAnh = input.nextDouble();
                        editArrScores[2]=editAnh;
                        clazz.edit(editId,editName,editSex,editArrScores);
                        clazz.showAll();
                    }
                    break;
                case 4:
                    System.out.println("Nhập số id của sinh viên bạn muốn tìm:");
                    int id = input.nextInt();
                    if(clazz.findById(id)!=-1){
                        System.out.println(clazz.findStudentById(id));
                    }else {
                        System.out.println("Không có sinh viên nào cả!!");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên sinh viên bạn muốn tìm:");
                    String searchName = input.nextLine();
                    if(clazz.findByName(searchName).isEmpty()){
                        System.out.println("Không có sinh viên nào cả!!");
                    }else {
//                        for (int i = 0; i < clazz.findByName(searchName); i++) {
//
//                        }
                        System.out.println(clazz.findByName(searchName));
                    }
                    break;
                case 6:
                    System.out.println(clazz.maxAvg());
                    break;
                case 7:
                    clazz.showAll();
                    break;
            }
        }while (choice!=0);

    }
}
