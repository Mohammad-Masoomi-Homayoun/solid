public interface WatchCounter {
  default int getValue(MyVideo myVideo) {
    switch (myVideo.getCategory()) {
      case GAMING:
        return myVideo.getWatchCount() * 3;
      case DOCUMENTARY:
        return myVideo.getWatchCount() * 4;
      case SCI_FI:
        return myVideo.getWatchCount() * 6;
      default:
        return myVideo.getWatchCount();
    }
  }
}
