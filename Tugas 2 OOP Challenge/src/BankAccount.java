import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);

    // getter setter accountNumber
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    // getter setter balance
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    // getter setter customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    // getter setter customerEmail
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }

    // getter setter customerPhone
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    // deposit method
    static int depositNotification(int balance, int deposit){
        return balance + deposit;
    }

    //withdraw method
    static int withdrawNotification(int balance, int withdraw){
        return balance - withdraw;
    }

    public static void main(String[] args){
        BankAccount firstNasabah = new BankAccount();
        firstNasabah.setAccountNumber("543217654");
        firstNasabah.setBalance(4000000);
        firstNasabah.setCustomerName("Nyonyalita");
        firstNasabah.setCustomerEmail("nyonyalita@mail.com");
        firstNasabah.setCustomerPhone("089766638798");

        System.out.println("Selamat datang kembali, " + firstNasabah.getCustomerName() + "!");
        System.out.println("Cek data akun anda sebelum memulai transaksi!");
        System.out.println("Nomor akun  : " + firstNasabah.getAccountNumber());
        System.out.println("Saldo       : " + firstNasabah.getBalance());
        System.out.println("Email       : " + firstNasabah.getCustomerEmail());
        System.out.println("Telepon     : " + firstNasabah.getCustomerPhone());

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        System.out.println("Ketik 0 untuk deposit atau ketik 1 untuk withdraw");
        int code = in.nextInt();
        if(code == 0){
            System.out.print("Jumlah deposit : ");
            int deposit = in.nextInt();
            System.out.println("Jumlah saldo : " + depositNotification(firstNasabah.getBalance(), deposit));
        } else {
            System.out.print("Jumlah penarikan : ");
            int withdraw = in.nextInt();
            if(withdraw>firstNasabah.getBalance()){
                System.out.println("Saldo tidak mencukupi");
            } else{
                System.out.println("Sisa saldo : " + withdrawNotification(firstNasabah.getBalance(), withdraw));
            }

        }
    }
}
