public class VideoService {


    private final EarnCalculator earnCalculator;

    public VideoService(EarnCalculator earnCalculator) {
        this.earnCalculator = earnCalculator;
    }

    public int calculateEarnings(Video video) {
        return earnCalculator.watchTimeEarning(video);
    }
}
