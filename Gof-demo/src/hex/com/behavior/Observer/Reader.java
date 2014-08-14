package hex.com.behavior.Observer;
class Reader implements Observer {
  private String name;

  public Reader(NewsPaper paper, String name) {
    this.name = name;
    paper.subscribe(this);
  }

  @Override
  public void update(int data) {
    System.out.println(name + " update data:" + data);
  }
}