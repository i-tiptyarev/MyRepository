/**
 * Created by Юрий on 08.11.2014.
 */
import java.util.*;


public class Main {
     public static void main(String[] args) {
         int switcher = 0;
         Scanner in = new Scanner(System.in);
         System.out.println("Hello World!");
         Engine engine = new Engine();
         do {
             System.out.println("Choose number:\n1. Add Song to PlayList.\n2. Watch current PlayList.\n3. Watch number of songs in PlayList\n4. Exit\n");
             switcher = in.nextInt();
             switch (switcher) {
                 case 1:
                     engine.Add();
                     break;
                 case 2:
                     engine.GetPlayList();
                     break;
                 case 3:
                     System.out.println(engine.count);
                     break;
                 case 4:
                     System.out.println("GoodBye!");
                     break;
             }
         }while(switcher != 4);

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

