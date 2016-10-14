package autowiring;

public class LaptopStore {
    AcerLaptop laptop1;  
    LenovoLaptop laptop2;  
    public LaptopStore(AcerLaptop laptop1, LenovoLaptop laptop2){  
        this.laptop1 = laptop1;  
        this.laptop2 = laptop2;  
   }
    public Laptop getLaptop1() {  
         return laptop1;  
    }  
    public void setLaptop1(AcerLaptop laptop1) {  
         this.laptop1 = laptop1;  
    }  
    public Laptop getLaptop2() {  
         return laptop2;  
    }  
    public void setLaptop2(LenovoLaptop laptop2) {  
         this.laptop2 = laptop2;  
    }  
}
