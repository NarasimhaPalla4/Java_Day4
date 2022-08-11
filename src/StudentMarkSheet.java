import java.util.*;

public class StudentMarkSheet {
    public static void main(String[] args) {
        int sum=0,totalSubjects,position;
        float percent;
        ArrayList<Integer> markSheet = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        totalSubjects=s.nextInt();
        for(position=0;position<totalSubjects;position++){
            markSheet.add(s.nextInt());
        }
        //Percentage of total marks
        for(position=0;position<markSheet.size();position++){
            sum+=markSheet.get(position);
        }
        percent=(float)(sum)/markSheet.size();
        System.out.println("Percentage of total marks is: "+percent);

        //Removing the element at index 2
        try {
            markSheet.remove(2);
            sum = 0;
            for (int i = 0; i < markSheet.size(); i++) {
                sum += markSheet.get(i);
            }
            percent = (float) (sum) / markSheet.size();
            System.out.println("Percentage of marks after removing the element at index 2: "+percent);
        }
        catch(IndexOutOfBoundsException i){
            System.out.println("Your ArrayList size is less than 3, so you cannot remove element at 2nd position");
        }
    }
}
