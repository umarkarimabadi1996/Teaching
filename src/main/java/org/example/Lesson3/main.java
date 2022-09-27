package org.example.Lesson3;

public class main {

    public static void main(String[] args) {


        //customerRecievesProduct("Coke", 2.50, 3, "card");
        String item = customerRecievesProduct("Coke", 3, 3, "cash");
        System.out.println(item);
    }


    public static String customerRecievesProduct(String item, double cost, double moneyRecieved, String paymentType) {
        boolean canItemBeSold = canItemBeSold(cost, moneyRecieved);

        if (canItemBeSold) {
            boolean isCard = paymentMethod(paymentType);
                if (isCard)  {
                    boolean isBankContacted = contactBank(paymentType);
                    System.out.println(isBankContacted);

                    String returnitemAndChange = returnItemAndChange(item,0);
                    return returnitemAndChange;

                } else {
                    double change = changeReturned(cost, moneyRecieved);
                    // TODO Figure out way to return change
                    //return change;
                    String returnItemAndChange= returnItemAndChange(item, change);
                    return returnItemAndChange;
                }
            }

        // Think of this as System.exit(1);
        throw new RuntimeException("Crash");
    }

    public static boolean canItemBeSold(double cost, double moneyRecieved) {
        if (moneyRecieved >= cost){
            return true;
        }
        else{
            return false;
        }
    }

    public static double changeReturned(double cost, double moneyRecieved) {
        double change =  moneyRecieved - cost;
        return change;
    }

    public static boolean paymentMethod(String paymentType) {

        if(paymentType.equals("card")) {
            return true;
        } else {
           return false;
        }

    }

    public static boolean contactBank(String paymentType) {
        System.out.println("Calling bank");
        return true;
    }

    public static String returnItemAndChange(String item, double change){
        return item + change;
    }
}
