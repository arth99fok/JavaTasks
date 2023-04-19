package level13.task04;

public class Solution {
    public static Integer balance;

    public static void main(String[] args) {
        String bill = "1234567890";
        balance = Integer.MAX_VALUE;
        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);

    }
}
