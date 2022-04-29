public class Main {
    public static void main(String[] args) {

        int check = 100;
        int pay = 1100;
        int bonus;
        int sum = check + pay;
        if (pay >= 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int total = sum + bonus;

        System.out.println("Бонусы: " + bonus);
        System.out.println("Общий баланc: " + total);

    }
}