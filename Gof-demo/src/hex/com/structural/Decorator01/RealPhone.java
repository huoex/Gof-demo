package hex.com.structural.Decorator01;
public class RealPhone implements Phone {
    @Override
    public void call() {
        System.out.println("打电话。。。");
    }
}