package beanlifecycle;

public class HelloWorld {
    private String messageBean;

    public void setMessageBean(String message){
       this.messageBean  = message;
    }
    public void getMessageBean(){
       System.out.println("Your Message : " + messageBean);
    }
    public void init(){
       System.out.println("Bean is going through init.");
    }
    public void destroy(){
       System.out.println("Bean will destroy now.");
    }
}
