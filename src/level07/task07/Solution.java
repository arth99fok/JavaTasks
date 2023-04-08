package level07.task07;

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username){
        if (username.equals("user")) {
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }

    }
}
