package hex.com.structural.Decorator01;
public class PhoneMain {

  public static void main(String[] args) {
    Phone phone = new RealPhone();
    phone.call();
    System.out.println("-----------------------");
    PhoneDecorate pd = new BeforePhone(phone);
    pd.call();
    System.out.println("-----------------------");
    pd = new AfterPhone(phone);
    pd.call();
    System.out.println("-----------------------");
    pd = new AfterPhone(new BeforePhone(phone));
    pd.call();
    }

}