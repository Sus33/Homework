package amount;

public class Loan {
    public static void main(String[] args) {
        Loan loan = new Loan();
        loan.loan(20000);
    }

    public void loan(int amount) {
        int month = 1;
        while (month <= 3) {
            int payment = (amount * 10) / 100;
            amount -= payment;
            System.out.println(amount);
            ++month;
        }
    }
}
