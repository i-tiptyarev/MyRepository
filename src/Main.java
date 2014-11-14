/**
 * Created by Юрий on 08.11.2014.
 */
import java.util.*;


public class Main {
     public static void main(String[] args) {
         System.out.println("Hello World!");
         Engine engine = new Engine();
         AddSong(engine);
         AddSong(engine);
         System.out.println(engine.count);
         engine.GetPlayList();
     }

    public static void AddSong(Engine engine)
    {
        System.out.println("Enter Song Name");
        Scanner in = new Scanner(System.in);
        engine.Song = in.nextLine();
        engine.Add();
        System.out.println("Adding Successful");
        engine.count++;
    }
}

