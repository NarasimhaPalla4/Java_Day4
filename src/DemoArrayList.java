import java.util.*;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Narasimha");
        name.add("Arun");
        name.add("Lokesh");
        name.add("Vivek");
        name.add("Vishal");
        for(int position=0;position< name.size();position++){
            System.out.println(name.get(position));
        }
        name.add("Paddu");
        System.out.println("ArrayList after adding one extra Trainee: "+name);
    }
}
