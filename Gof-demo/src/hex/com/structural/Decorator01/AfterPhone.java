package hex.com.structural.Decorator01;
public class AfterPhone extends PhoneDecorate {
  Phone phone = null;
  public AfterPhone(Phone phone) {
    super(phone);
    this.phone = phone;
  }
  @Override
  public void call() {
    super.call();
    System.out.println("打完电话。。。。");
  }
}