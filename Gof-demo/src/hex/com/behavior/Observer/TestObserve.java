package hex.com.behavior.Observer;
public class TestObserve {
  public static void main(String[] args) {
    NewsPaper newsPaper = new NewsPaper();
    Reader tom = new Reader(newsPaper, "tom");
    Reader jack = new Reader(newsPaper, "jack");
    newsPaper.changeData(10);
    System.out.println("--");
    newsPaper.unsubscribe(tom);
    newsPaper.changeData(5);
  }
}