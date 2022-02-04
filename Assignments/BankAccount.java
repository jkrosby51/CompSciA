public class BankAccount{
   private String name;
   private double balance;
   private String id;
   private double balance;
   private int transactions;
   
   /*public BankAccount(String id)
   
   public double getBalance()
   public String getID()
   public String getTransactions()
   
   public void deposit(double amount)
   
   public void withdraw(double amount)*/
   
   public boolean transactionFee(double fee){
      
      for(int i = 1; i <= transactions; i++)
         balance -= fee * i;
      
      if(balance > 0)
         return true;
      balance = 0;
      return false;
   }
   
   public String toString(){
      String finalString = "";
      if(balance >= 0){
         finalString += name + ", $";
         finalString += (String) String.format("%.2f", balance);
      } else {
         
         finalString += name + ", -$";
         finalString += (String) String.format("%.2f", (balance * -1));
      }
      return finalString;
   }
   
   public void transfer(BankAccount id, double amount){
      int fee = 5;
      if(balance > fee){
         balance -= (amount + fee);
         
         if(amount < 0)
            balance += (amount + fee);
         else {
            if(balance < 0){
               amount += balance;
               amount -= fee;
               balance = 0;
            }
            transactions++;
            id.transactions++;
            id.balance += amount; 
         }
      }
   }
   
}
