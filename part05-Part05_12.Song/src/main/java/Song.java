
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object song){
        if(this == song){
            return true;
        }
        
        if(!(song instanceof Song)){
            return false;
        }
        
        Song compareSong = (Song) song;
        
        if(this.artist.equals(compareSong.artist) && 
                this.name.equals(compareSong.name) &&
                this.durationInSeconds == compareSong.durationInSeconds){
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
