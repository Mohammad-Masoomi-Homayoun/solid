public class ComedyWatchCounter implements WatchCounter, LikeCounter{

  @Override
  public int getValue(MyVideo myVideo) {
    return myVideo.getWatchCount() * 10;
  }

  @Override
  public int countLike() {
    return 0;
  }
}
