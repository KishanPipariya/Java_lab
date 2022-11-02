package Unit3;

public class BankBranch {
    static double netWorth = 50000, totalLoanAmount;
    static int noOfAccount = 0;
    int customerNumber, noOfInstallments = 0;
    double accountBalance, loanSanctioned = 0;
    String customerName;

    BankBranch(int customerNumber, String customerName, int accountBalance){
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        noOfAccount++;
        netWorth += accountBalance;
    }

    boolean loanRequest(double loanAmount){
        if(loanAmount < netWorth && loanAmount + loanSanctioned <= (2 * accountBalance)){
            totalLoanAmount += loanAmount;
            netWorth -= loanAmount;
            loanSanctioned += loanAmount;
            return true;
        }
        else{
            return false;
        }
    }

    void loanRepay(double amount){
        netWorth += amount;
        noOfInstallments++;
        if(amount <= loanSanctioned){
            loanSanctioned -= amount;
        }
        else{
            accountBalance += amount - loanSanctioned;
            loanSanctioned = 0;
        }
    }

    void customerInfo(){
        System.out.println("Account number:" + customerNumber);
        System.out.println("Name:" + customerName);
        System.out.println("Balance:" + accountBalance);
        System.out.println("Loan:" + loanSanctioned);
        System.out.println("Installments:" + noOfInstallments);
    }

    static void inspection(){
        System.out.println("Net worth:" + netWorth);
        System.out.println("Number of accounts:" + noOfAccount);
        System.out.println("Total loans sanctioned:" + totalLoanAmount);
    }

}

class BankBranchTest{
    public static void main(String[] args){
        BankBranch.inspection();
        BankBranch b1 = new BankBranch(123, "Test", 30000);
        BankBranch.inspection();
        b1.customerInfo();
        boolean loanStatus = b1.loanRequest(10000);
        System.out.println("Loan status:" + loanStatus);
        loanStatus = b1.loanRequest(70000);
        System.out.println("Loan status:" + loanStatus);
        b1.customerInfo();
        b1.loanRepay(5000);
        b1.customerInfo();
        b1.loanRepay(2000);
        b1.customerInfo();
    }
}
