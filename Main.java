public class Main {
    public static void main(String[] args) {
    MusicDownloader pink = new MusicDownloader("Pink Pony Club", "Chappel Roan", "Midwest Princess", "https://www.spotify.com/pink-pony-club.mp3", 2023);
    pink.showFileLink("Pink Pony Club");
    }
}

class MusicDownloader {
    private String songName;
    private String artistName;
    private String album;
    private String fileLink;
    private int releaseYear;

    public MusicDownloader(String songName, String artistName, String album, String fileLink, int releaseYear){
       this.songName = songName;
       this.artistName = artistName;
       this.album = album;
       this.fileLink = fileLink;
       this.releaseYear = releaseYear;
    }

    public void showFileLink(String songName){
        if (this.songName.equalsIgnoreCase(songName)){
        System.out.println("Link for " + songName + " is: "+ fileLink);
        } else {
            System.out.println("Song Not Found");
        }
    }
}