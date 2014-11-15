/**
 * Created by Vanek on 17.10.2014.
 */

import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Engine {
    PlayList pl = new PlayList();
    PlayListItem plItem;
    String Song;
    Clip clip;
    int framePosition = 0;
    int count = 0;
    int number = 0;

    public void Play()
    {
        try{
            plItem = pl.plmass.get(number);
            System.out.println("Now Playing: " + plItem.Name);
            //AudioInputStream ais = AudioSystem.getAudioInputStream(plItem.file);
            //clip = AudioSystem.getClip();
            //clip.open(ais);
            //clip.setFramePosition(framePosition);
            //clip.start();
            //do
            //{

            //}while(framePosition !=  clip.getFrameLength());

            //Forward();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    public void Stop()
    {
        try {
            //clip.stop();
            //framePosition = clip.getFramePosition();
            //clip.close();
            System.out.println("Player Stopped");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Back()
    {
        try{
            //clip.stop();
            //framePosition = 0;
            //clip.close();
            number--;
            plItem = pl.plmass.get(number);
            System.out.println("Now Playing: " + plItem.Name);
            //AudioInputStream ais = AudioSystem.getAudioInputStream(plItem.file);
            //clip = AudioSystem.getClip();
            //clip.open(ais);
            //clip.setFramePosition(framePosition);
            //clip.start();
            //do
            //{

            //}while(framePosition !=  clip.getFrameLength());

            //Forward();

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Forward()
    {
        try{
            //clip.stop();
            //framePosition = 0;
            //clip.close();
            number++;
            plItem = pl.plmass.get(number);
            System.out.println("Now Playing: " + plItem.Name);
            //AudioInputStream ais = AudioSystem.getAudioInputStream(plItem.file);
            //clip = AudioSystem.getClip();
            //clip.open(ais);
            //clip.setFramePosition(framePosition);
            //clip.start();
            //do
            //{

            //}while(framePosition !=  clip.getFrameLength());

            //Forward();

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Repeat()
    {
            //do
            //{

            //}while(framePosition !=  clip.getFrameLength());
            //clip.stop();
            //framePosition = 0;
            //clip.close();
            plItem = pl.plmass.get(number);
            System.out.println("Now Playing: " + plItem.Name);
            //AudioInputStream ais = AudioSystem.getAudioInputStream(plItem.file);
            //clip = AudioSystem.getClip();
            //clip.open(ais);
            //clip.setFramePosition(framePosition);
            //clip.start();
    }
    public void Add()
    {
        try{
            Scanner in = new Scanner(System.in);

            System.out.println("Enter Song Name");
            Song = in.nextLine();
            pl.Add(Song);
            System.out.println("Adding Successful");
            count++;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void Remove()
    {
        try{
            Scanner in = new Scanner(System.in);

            if(count == 0)
            {
             System.out.println("PlayList is Empty");
            }
            else {
                System.out.println("Enter Song Name, which you want remove");
                Song = in.nextLine();
                pl.Remove(Song);
                System.out.println("Removing Successful");
                count--;
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void GetPlayList() {
        for (int i = 0; i < count; i++)
        {
            System.out.println((i+1) + ". " +pl.plmass.get(i).Name);
        }
    }
}
