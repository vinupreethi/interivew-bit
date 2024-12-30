package org.designpatterns.StructuralDesignPatterns.facade;

public class HomeTheatre {
    private  Remote remote=new Remote();
    private DVD dvd=new DVD();
    private Screen screen=new Screen();
    private Speaker speaker=new Speaker();

    void startHomeTheatre()
    {
        remote.remoteOn();;
        dvd.dvdOn();
        screen.screenOn();;
        speaker.speakerOn();
    }
}
