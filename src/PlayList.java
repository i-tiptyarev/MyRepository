/**
 * Created by Vanek on 17.10.2014.
 */

import java.io.*;
import java.util.*;

public class PlayList
{
    PlayListItem plItem;
    ArrayList<PlayListItem> plmass;


    public void Add(String Name)
    {
        plItem = new PlayListItem(Name);
        plmass.add(plItem);
    }

    public void Remove(String Name)
    {
        plItem = new PlayListItem(Name);
        plmass.remove(plItem);
    }

    public PlayList()
    {
        plmass = new ArrayList<PlayListItem>();
    }
}

class PlayListItem
{
    public String Name;
    public String Directory;
    public File file;

    public PlayListItem()
    {
        this.Name = null;
    }

    public PlayListItem(String Name)
    {
        this.file = new File(Name);
        this.Name = Name;
        //this.Directory = file.getPath();
    }
}
