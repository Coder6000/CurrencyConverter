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
        if(Objects.equals(initialCurrency, "2"))
        {
            ConvertDollars();
        }
        if(Objects.equals(initialCurrency, "3"))
        {
            ConvertBritishPounds();
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
            initialAmount = reader.nextFloat();

            wantedAmount = initialAmount * 1.08f;

            System.out.print("Amount in dollars: " + wantedAmount);
        }

        if(Objects.equals(wantedCurrency, "2"))
        {
            System.out.print("Amount in euros: ");
            initialAmount = reader.nextFloat();

            wantedAmount = initialAmount * 0.86f;

            System.out.print("Amount in british pounds: " + wantedAmount);
        }
    }

    public void ConvertDollars()
    {
        System.out.println("\nWanted Currency?");
        System.out.println("(1) Euros\n(2) British Pounds");

        System.out.print("Input: ");
        wantedCurrency = reader.nextLine();

        if(Objects.equals(wantedCurrency, "1"))
        {
            System.out.print("Amount in dollars: ");
            initialAmount = reader.nextFloat();

            wantedAmount = initialAmount * 0.92f;

            System.out.print("Amount in euros: " + wantedAmount);
        }
        if(Objects.equals(wantedCurrency, "2"))
        {
            System.out.print("Amount in dollars: ");
            initialAmount = reader.nextFloat();

            wantedAmount = initialAmount * 0.79f;

            System.out.print("Amount in british pounds: " + wantedAmount);
        }
    }

    public void ConvertBritishPounds()
    {
        System.out.println("\nWanted Currency?");
        System.out.println("(1) Euros\n(2) Dollars");

        System.out.print("Input: ");
        wantedCurrency = reader.nextLine();

        if(Objects.equals(wantedCurrency, "1"))
        {
            System.out.print("Amount in british pounds: ");
            initialAmount = reader.nextFloat();

            wantedAmount = initialAmount * 1.17f;

            System.out.print("Amount in euros: " + wantedAmount);
        }
        if(Objects.equals(wantedCurrency, "2"))
        {
            System.out.print("Amount in british pounds: ");
            initialAmount = reader.nextFloat();

            wantedAmount = initialAmount * 1.26f;

            System.out.print("Amount in dollars: " + wantedAmount);
        }
    }
}
