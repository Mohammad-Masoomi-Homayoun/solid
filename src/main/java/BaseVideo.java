public class BaseVideo {

    private String name;
    private String url;
    private int watchCount;
    private int videoLength;
    private Category category;

    public int watchTimeEarning(Video video) {

        int earn = 0;

        switch (video.getCategory()) {

            case GAMING:
                earn = video.getWatchCount() * 1;
                break;
            case EDUCATIONAL:
                earn = video.getWatchCount() * 2;
                break;
            case DOCUMENTARY:
                earn = video.getWatchCount() * 3;
                break;
        }
        return earn;
    }


    public void playAdd() throws Exception {
        return;
    }
}
