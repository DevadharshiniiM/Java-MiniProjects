import java.util.ArrayList;
public class AttendanceArrayList {
    public AttendanceArrayList(){

    }
    public static void main(String[] args) {
        ArrayList<Integer> SeminarStudents = new ArrayList<>();
        SeminarStudents.add(123);
        SeminarStudents.add(234);
        SeminarStudents.add(456);
        SeminarStudents.add(678);
        SeminarStudents.add(143);

        SeminarStudents.remove(3);
       
        SeminarStudents.add(987);
        

        System.out.println("Current Seminar Students:");
       
            System.out.println(SeminarStudents);
        
    }
}