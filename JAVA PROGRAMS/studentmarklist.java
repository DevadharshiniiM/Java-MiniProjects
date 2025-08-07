public class studentmarklist {
    public static void  greet(){
        System.out.println("Welcome to the student marklist program");
        System.out.println("=======================================");
        }
        public static void calculateMarks(int[][] marks,String[] subjects)
        {
            greet();
            String[] students = {"Devadharshini","Dhanuja","Gracemaria","Harini","Dhayanithi","Charles"};
            int[][] marks = {{100,98,99,96,97},{99,98,97,96,95},{97,95,96,97,98},{97,95,96,93,92},{99,97,95,96,97},{99,93,94,96,96}};
            int sum =0;
            for(int j= 0; j<students.length; j++){
                sum += marks[i][j];
            }
            }

        }
        public static void calculateMarks(String[] marks,String[] subjects){
            int tamil = 0,english = 0 ,maths = 0,science = 0,social = 0;
            double average = 0.0;
              
           if(average>90){
                System.out.println("Grade:A+");
           }
           else if(average>80 && average<=90){
                System.out.println("Grade:A");
           }  
           else if(average>70 && average<=80){
                System.out.println("Grade:B+");
           }      
           else if(average>60 && average<=70)
           {
                System.out.println("Grade:B");
           }
          else if(  average>50 && average<=60){
                System.out.println("Grade:C");
          }
          else if(average>40 && average<=50){
                System.out.println("Grade:D");
          }
          else{
                System.out.println("Grade:F");
          }

          }

          public static void displaystudents(String[] students,double[] average)
          {
            for(int i=0; i<students.length; i++)
            {

                if(average[i] > 90)
                {
                    System.out.println("Student:"+ students[i]+"is a Topper ");
                }
                else if (average[i] > 80 && average[i] <=90)
                {
                    System.out.println("Student:"+ students[i]+"is a Good Student ");
                }
                else if (average[i] > 70 && average[i] <=80)
                {
                    System.out.println("Student:"+ students[i]+"is a  Average Student ");
                }
                else if (average[i] > 60 && average[i] <=70){
                     System.out.println("Student:"+ students[i]+"is a Below Average Student ");
                }
                else if (average[i] > 50 && average[i] <=60){
                    System.out.println("Student:"+ students[i]+"is a Needs to Improvement ");
                }
                else
                {
                    System.out.println("Student:"+ students[i]+"is a Poor Student ");
                }
                System.out.println(" students:" +students[i].toString());
                System.out.println(students[i] + " Average marks :" +average[i]);
                System.out.println("=======================================");    
                     



            }
           
          }
          }
                
        