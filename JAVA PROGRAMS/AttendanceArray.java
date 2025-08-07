public class AttendanceArray{
    public static void main(String[] args) {
        String students[]={"Moni","Santo","Midhunes","Deva","Linges","Dhaya"};
        Boolean present[]={true,false,true,true,true,false};
        for(int i =0;i<students.length;i++)
        {
            System.out.println(students [4] +   " is"  +(present[4]?" present":" absent"));
        }
    }
}