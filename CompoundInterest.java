package com.company;

/**
 * @ author Omoze Oyarebu
 * Project-A certain bank offers 6.5% interest on savings accounts, compounded annually.
 *          Create a table that shows how much money a person will accumulate over a period of 25 years,
 *          assuming that the person makes an initial investment of $1000 and deposits $100 each year
 *          after the first. Your table should indicate for each year the current balance, the interest
 *          ,the new deposit, and the new balance.
 *
 * Version 1.0
 */

public class CompoundInterest {

    public static void main(String[] args) {
        CompoundTable(1000,25,6.5,100);

    }

    /**
     *
     * @param Initial_Investment
     * @param Number_of_Years
     * @param Interest_Rate
     * @param Yearly_deposit
     */
    public static void CompoundTable(int Initial_Investment,int Number_of_Years,double Interest_Rate, double
                                                                                            Yearly_deposit) {
        //A= P *(1 +r*n)

        double p; // initial deposit principal
        double r = Interest_Rate/100; // Interest rate
        int n = 1;//Annually
        int t = Number_of_Years;// Years

        double A; //Final Amount
        double New_Balance;
        double Interest_Amount;
        p = Initial_Investment;
        double Yearly_Depo =Yearly_deposit;



        System.out.println("Initial Balance =$"+(int) p);
        System.out.println("Year\t Current-Balance\tInterest-Gained-Amount\t\tYearly-Deposit\t\tNew-Balance");
        for(int year = 1; year <= t; year++){

            A = p * (1 + r * n);

            Interest_Amount = A - p;
            New_Balance = A + Yearly_Depo;

            System.out.println(year + "\t\t\t$" +(int) Round(p) + "\t\t\t\t\t$" + Round(Interest_Amount)
                    + "\t\t\t\t\t$" + Round(Yearly_Depo) + "\t\t\t$" + (int) Round(New_Balance));

            p = New_Balance;
        }


    }

    /**
     *
     * @param num- Used to Round numbers to two places when call by round
     * @return - The equation to round to two places
     */
    public static double Round(double num) {
        return Math.round(num * 100)/100;
    }
}
