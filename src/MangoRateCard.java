import java.util.*;
public class MangoRateCard {
    public static void main(String[] args) {
        HashMap<String,Double> mangoDetails= new HashMap<>();
        mangoDetails.put("Kesar",90.0);
        mangoDetails.put("Alphonso",80.0);
        mangoDetails.put("Safeda",85.0);
        for(Map.Entry<String,Double> iterator: mangoDetails.entrySet()){
            System.out.println("MangoType: "+iterator.getKey()+" Price "+iterator.getValue());
        }

        HashMap<String,Integer> totalPrice = new HashMap<>();
        totalPrice.put("Kesar",30);
        totalPrice.put("Alphonso",40);
        totalPrice.put("Safeda",50);
        Double price, sum=0.0;
        for(String iterate: totalPrice.keySet()){
            price = totalPrice.get(iterate)*mangoDetails.get(iterate);
            sum+=price;
            System.out.println("Total price of type "+iterate+" is: "+price);
        }
        System.out.println("Total price of all types of mangoes: "+sum);
    }
}
