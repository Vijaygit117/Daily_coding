package Oops.staticExample;


    class BankAccount {
        String accountNumber;
        String accountHolderName;
        double balance;

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        void deposit(double amount) {
            System.out.print("Deposited Amount: " + amount);
            balance += amount;
            System.out.println("New Balance: " + balance);

        }

        void withdraw(double amount) {
            if (balance < amount) {
                System.out.println("Insufficient Balance.Your Current Balance :"+balance);
            } else {
                System.out.println("the Amount you withdrawn: " + amount);
                balance -= amount;
                System.out.println("Your New Balance: "+balance);
            }

        }

        void displayAccountInfo() {
            System.out.println("---------------- Account Info ---------------------");
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Account HolderName: " + this.accountHolderName);
            System.out.println("Account Balance: " + this.balance);
            System.out.println("--------------------------------------------------");
        }
    }

        public class BankAccountMain {
            public static void main(String[] args) {
                BankAccount Person1 = new BankAccount("1A2S3D4F5G", "MR.TOM", 10000);
                BankAccount Person2 = new BankAccount("1A2S3D4FOA", "MR.JERRY", 10000);
                System.out.println("-----Testing Person 1-----");
                Person1.displayAccountInfo();
                Person1.deposit(1200);
                Person1.displayAccountInfo();//checking after deposit
                System.out.println("-----Testing Person 2-----");
                Person2.displayAccountInfo();
                Person2.withdraw(100000);
                Person2.displayAccountInfo();
                Person2.withdraw(500);
                Person2.displayAccountInfo();

            }
        }


