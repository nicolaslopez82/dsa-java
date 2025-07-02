package practice;

import java.util.*;
import java.util.stream.Collectors;

// Example TransactionParser class
class TransactionParser{

    private double amount;
    private String description;
    private String type; // e.g., "DEBIT", "CREDIT"

    public TransactionParser(double amount, String description, String type) {
        this.amount = amount;
        this.description = description;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }


    public static Comparator<TransactionParser> COMPARATOR_BY_AMOUNT = new Comparator<TransactionParser>(){
        @Override
        public int compare(TransactionParser o1, TransactionParser o2) {
            return (int) (o1.getAmount() - o2.getAmount());
        }
    };

    @Override
    public String toString() {
        return "Transaction [amount=" + amount + ", description=" + description + ", type=" + type + "]";
    }

    public static void main(String[] args) {
        // Create a list of transactions
        List<TransactionParser> transactions = new ArrayList<>();
        transactions.add(new TransactionParser(100.0, "Groceries", "DEBIT"));
        transactions.add(new TransactionParser(500.0, "Salary", "CREDIT"));
        transactions.add(new TransactionParser(25.0, "Coffee", "DEBIT"));

        // Parsing the list using a for-each loop
        System.out.println("Parsing transactions using for-each loop:");
        for (TransactionParser tx : transactions) {
            System.out.println("  Amount: " + tx.getAmount() + ", Description: " + tx.getDescription() + ", Type: " + tx.getType());
        }

        // Parsing the list using Java Streams (more concise for certain operations)
        System.out.println("\nParsing transactions using Java Streams:");

        Map<String, List<TransactionParser>> transactionsByType = new HashMap<>();
        transactionsByType = transactions.stream().collect(Collectors.groupingBy(TransactionParser::getType));

        for (Map.Entry<String, List<TransactionParser>> entry : transactionsByType.entrySet()) {
            System.out.println("  Type: " + entry.getKey() + ", " + entry.getValue());
        }

        System.out.println("\nParsing transactions using Java forEach:");

        transactionsByType.forEach((key, value) -> {
            System.out.println("  Type: " + key + ", " + value);
        });

        System.out.println("\n");
        System.out.println("COMPARATOR_BY_AMOUNT Comparator:");
        Collections.sort(transactions, TransactionParser.COMPARATOR_BY_AMOUNT);
        for (TransactionParser tx : transactions) {
            System.out.println("  Amount: " + tx.getAmount() + ", Description: " + tx.getDescription() + ", Type: " + tx.getType());
        }
    }
}
