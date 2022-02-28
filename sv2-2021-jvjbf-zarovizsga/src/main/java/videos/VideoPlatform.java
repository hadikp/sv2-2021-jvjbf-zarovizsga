package videos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VideoPlatform {


    private List<Channel> channels = new ArrayList<>();

    public void makeChannel(Path path, List<String> readFile) {
        for(int i = 1; i < readFile.size(); i++) {
            String[] stSplit = readFile.get(i).split(";");
            String channelName = stSplit[0];
            int subscriptions = Integer.parseInt(stSplit[1]);
            int numOfVideos = Integer.parseInt(stSplit[2]);
            channels.add(new Channel(channelName, subscriptions, numOfVideos));
        }
    }

    public void readDataFromFile(Path path) {
        try {
            List<String> readFile = Files.readAllLines(path);
            makeChannel(path, readFile);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot open file for read!");
        }
    }

    public int calculateSumOfVideos() {
        int sum = 0;
        for(Channel c: channels) {
            sum += c.getNumberOfVideos();
        }
        return sum;
    }

    public List<Channel> getChannels() {
        return channels;
    }
}
