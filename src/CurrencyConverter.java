import java.util.Objects;
import java.util.Scanner;

public class CurrencyConverter {
    // Variables
    public Scanner reader = new Scanner(System.in);
    
    public String initialCurrency;
    public String wantedCurrency;
    public float initialAmount;
    public float wantedAmount;
    // Variables

    public void Run()
    {
        System.out.println("Initial Currency? \n");
        System.out.println("(1) Euros\n(2) Dollars\n(3) British Pounds");

        System.out.print("Input: ");
        initialCurrency = reader.nextLine();

        if(Objects.equals(initialCurrency, "1"))
        {
            ConvertEuro();
        }

    }

    public void ConvertEuro()
    {
        System.out.println("\nWanted Currency?");
        System.out.println("(1) Dollars\n(2) British Pounds");

        System.out.print("Input: ");
        wantedCurrency = reader.nextLine();

        if(Objects.equals(wantedCurrency, "1"))
        {
            System.out.print("Amount in euros: ");
            initialAmount = reader.nextInt();

            wantedAmount = initialAmount * 1.20f;

            System.out.print("Amount in dollars: " + wantedAmount);
        }
    }
}
