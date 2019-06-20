import java.util.HashMap;

public class TrackList {
    public void trackList(){
        HashMap<String, String> tracks = new HashMap<>();
        tracks.put("Monster","Tell me again about how it hurts, being awfully loud for an introvert");
        tracks.put("Light Up The Night","At the heart of the city there is a building that looks down over all there is.");
        tracks.put("Why Am I Like This","I saw a girl crying on the train, gin and tonic from a can to ease the pain");
        tracks.put("Always","Tonight you look like a dream, then again, you always do to me");
        
        String name = tracks.get("Monster");
    }
}