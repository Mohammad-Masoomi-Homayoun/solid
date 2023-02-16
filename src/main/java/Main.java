import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        List<Video> playList = new ArrayList<>();
        playList.add(new Video());
        playList.add(new PremiumVideo());

        for(Video video: playList)
            video.playAdd();

        VideoService videoService = new VideoService(new GamingVideoEarnCalculator());
        videoService.calculateEarnings(new Video());


    }
}
