public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 2970;       // Amount to be dispensed

        // Updated: smallest bill is now 20
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 20.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
    }
}