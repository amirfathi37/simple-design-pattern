public class MultimediaFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public MultimediaFacade() {
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
        soundSystem = new SoundSystem();
    }

    public void watchMovie(String movie) {
        dvdPlayer.on();
        dvdPlayer.play(movie);

        projector.on();
        projector.setInput(dvdPlayer);

        soundSystem.on();
        soundSystem.setVolume(10);
    }

    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}


