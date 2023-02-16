

public class PremiumVideo extends Video {

    @Override
    public void playAdd() throws Exception {
        throw new Exception("This type of videos should not play ads");
    }
}
