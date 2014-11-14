/**
 * Created by Vanek on 17.10.2014.
 */

import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Engine {
    PlayList pl = new PlayList();
    PlayListItem plItem;
    String NextSong, PreviousSong, CurrentlySong, Song;
    Clip clip;
    int framePosition = 0;
    int count = 0;

    /*public void Play()
    {
        try{
            plItem = pl.plItem;
            AudioInputStream ais = AudioSystem.getAudioInputStream(plItem.file);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(framePosition);
            clip.start();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }*/

    public void Stop()
    {
        try {
            clip.stop();
            framePosition = clip.getFramePosition();
            clip.close();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Back()
    {
        try{

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Forward()
    {
        try{

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Add()
    {
        try{
            pl.Add(Song);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Remove()
    {
        try{
            pl.Remove(Song);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void GetPlayList() {
        PlayListItem currentPlItem;
        for (int i = 1; i <= count; i++)
        {
            //currentPlItem = new PlayListItem(pl.plmass.get(i).Name);
            //currentPlItem.Name = pl.plmass.get(i).Name;
            //System.out.println(currentPlItem.Name);
            System.out.println(pl.plmass.get(i).Name);
        }
    }
}
