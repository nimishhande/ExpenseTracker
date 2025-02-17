import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Expense {
    String category;
    double amount;
    String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return category + " | ₹" + amount + " | " + description;
    }
}

public class ExpenseTracker extends JFrame {
    private DefaultListModel<String> expenseListModel;
    private JList<String> expenseList;
    private JTextField categoryField, amountField, descField, binaryInputField, decimalOutputField;
    private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        setTitle("Expense Tracker & Binary Converter");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        expenses = new ArrayList<>();
        expenseListModel = new DefaultListModel<>();
        expenseList = new JList<>(expenseListModel);

        // Expense Management Panel
        JPanel expensePanel = new JPanel(new GridLayout(5, 2));
        categoryField = new JTextField();
        amountField = new JTextField();
        descField = new JTextField();
        JButton addExpense = new JButton("Add Expense");

        addExpense.addActionListener(e -> {
            String category = categoryField.getText();
            double amount = Double.parseDouble(amountField.getText());
            String description = descField.getText();

            Expense expense = new Expense(category, amount, description);
            expenses.add(expense);
            expenseListModel.addElement(expense.toString());

            categoryField.setText("");
            amountField.setText("");
            descField.setText("");
        });

        expensePanel.add(new JLabel("Category:"));
        expensePanel.add(categoryField);
        expensePanel.add(new JLabel("Amount:"));
        expensePanel.add(amountField);
        expensePanel.add(new JLabel("Description:"));
        expensePanel.add(descField);
        expensePanel.add(addExpense);

        // Binary to Decimal Converter Panel
        JPanel converterPanel = new JPanel(new GridLayout(3, 2));
        binaryInputField = new JTextField();
        decimalOutputField = new JTextField();
        decimalOutputField.setEditable(false);
        JButton convertButton = new JButton("Convert");

        convertButton.addActionListener(e -> {
            String binaryStr = binaryInputField.getText();
            try {
                int decimal = Integer.parseInt(binaryStr, 2);
                decimalOutputField.setText(String.valueOf(decimal));
            } catch (NumberFormatException ex) {
                decimalOutputField.setText("Invalid Binary");
            }
        });

        converterPanel.add(new JLabel("Binary Input:"));
        converterPanel.add(binaryInputField);
        converterPanel.add(new JLabel("Decimal Output:"));
        converterPanel.add(decimalOutputField);
        converterPanel.add(convertButton);

        // Expense List Panel
        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.add(new JLabel("Expense List:"), BorderLayout.NORTH);
        listPanel.add(new JScrollPane(expenseList), BorderLayout.CENTER);

        // Add all panels to frame
        add(expensePanel);
        add(converterPanel);
        add(listPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExpenseTracker();
    }
}
