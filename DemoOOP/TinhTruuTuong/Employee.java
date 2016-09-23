package TinhTruuTuong;
abstract class Employee
{
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number)
   {
      System.out.println("Tạo một Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }

   abstract void mailCheck();
   
   
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public String setAddress()
   {
     return address;
   }
   public int getNumber()
   {
     return number;
   }
}