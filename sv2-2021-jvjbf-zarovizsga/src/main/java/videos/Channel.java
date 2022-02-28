package videos;

public class Channel {

    private String channelName;
    private int subsriptions;
    private int numberOfVideos;

    public Channel(String channelName, int subsriptions, int numberOfVideos) {
        this.channelName = channelName;
        this.subsriptions = subsriptions;
        this.numberOfVideos = numberOfVideos;
    }

    public String getChannelName() {
        return channelName;
    }

    public int getSubsriptions() {
        return subsriptions;
    }

    public int getNumberOfVideos() {
        return numberOfVideos;
    }
}
