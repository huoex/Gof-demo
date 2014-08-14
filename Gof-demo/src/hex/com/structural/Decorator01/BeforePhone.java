package hex.com.structural.Decorator01;
public class BeforePhone extends PhoneDecorate {
  Phone phone = null;
  public BeforePhone(Phone phone) {
    super(phone);
    this.phone = phone;
  }
  @Override
  public void call() {
    System.out.println("打电话之前。。。。。");
    super.call();
  }
}