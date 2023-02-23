import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


@Data
public class Video {

    private String name;
    private String url;
    private int watchCount;
    private int videoLength;
    private Category category;

    private BaseVideo baseVideo;


    public int watchTimeEarning(Video video) {

        int earn = 0;

        switch (video.getCategory()) {

            case GAMING:
                earn = video.getWatchCount();
                break;
            case EDUCATIONAL:
                earn = video.getWatchCount() * 2;
                break;
            case DOCUMENTARY:
                earn = video.getWatchCount() * 3;
                break;
            case SCI_FI:
                earn = video.getWatchCount() * 4;
                break;
        }
        return earn;
    }



    public int watchTime(Video video) {
        return video.watchCount * video.videoLength;
    }

    public void save(String name) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("test.mkv"));
        fos.write(new byte[]{1,2,3});
        fos.close();
    }


    public void playAdd() throws Exception {
//        play some video
        return;
    }



}
