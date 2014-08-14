package hex.com.structural.Decorator01;
public abstract class PhoneDecorate implements Phone {
  private Phone phone = null;
  public PhoneDecorate(Phone phone) {
    this.phone = phone;
  }
  @Override
  public void call() {
    this.phone.call();
  }
}