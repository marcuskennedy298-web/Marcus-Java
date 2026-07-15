public class KennedyM_J5B_Demo
{
    public static void main(String[] args)
    {
        // Loan 1 - No-args constructor using setters
        Loan loan1 = new Loan();

        loan1.setName("Dipak Pravin");
        loan1.setLoanAmt(429700.84);
        loan1.setPymtAmt(86500);
        loan1.setIntRate(.12);
        loan1.setNumPymts(8);


        // Loan 2 - Full constructor
        Loan loan2 = new Loan(
                "Andy Wu",
                77777.77,
                13534.48,
                .08,
                8);


        printLoan(loan1);
        loan1.printAmortSched();


        printLoan(loan2);
        loan2.printAmortSched();
    }


    public static void printLoan(Loan loan)
    {
        System.out.println();

        System.out.println("Name:           " + loan.getName());
        System.out.printf("Loan Amt:       %,.2f%n", loan.getLoanAmt());
        System.out.printf("Loan Pymt:      %,.2f%n", loan.getPymtAmt());
        System.out.printf("Loan Int Rate:  %.2f%%%n",
                loan.getIntRate() * 100);
        System.out.println("Loan Num Pymts: " + loan.getNumPymts());
    }
}