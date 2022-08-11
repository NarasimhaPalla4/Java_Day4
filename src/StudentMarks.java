import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Double> studentData = new HashMap<>();
        studentData.put("Hindi", 75.0);
        studentData.put("English", 85.0);
        studentData.put("Maths", 100.0);
        studentData.put("Science", 90.0);
        studentData.put("Social", 70.0);
        for (Map.Entry<String, Double> iterator : studentData.entrySet()) {
            System.out.println("Subject: "+iterator.getKey()+"Marks: "+iterator.getValue());
        }
    }
}
