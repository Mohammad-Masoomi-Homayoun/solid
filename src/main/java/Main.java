

public class Main {

  public static void main(String[] args) throws Exception {

    MyVideo myVideo = new MyVideo();
    WatchCounter watchCounter = new ComedyWatchCounter();

    myVideo.setWatchCount(5);

    myVideo.setCategory(Category.GAMING);
    System.out.println(watchCounter.getValue(myVideo));



  }
}
