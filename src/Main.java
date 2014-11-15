/**
 * Created by Юрий on 08.11.2014.
 */
import java.util.*;


public class Main {
     public static void main(String[] args) {
         MainMenu();
     }

    public static void MainMenu()
    {
        int switcher = 0;
        Scanner in = new Scanner(System.in);
        Engine engine = new Engine();
        do {
            System.out.println("Music Player v0.6\n Меню:\n1. Добавить композицию в список\n2. Начать воспроизведение\n3. Остановить воспроизведение\n4. Воспроизвести предыдущую композицию\n5. Воспроизвести следующую композицию \n6. Удалить композицию из списка \n7. Показать весь список \n8. Выход из программы \n");
            switcher = in.nextInt();
            switch (switcher) {
                case 1:
                    engine.Add();
                    break;
                case 2:
                    engine.Play();
                    break;
                case 3:
                    engine.Stop();
                    break;
                case 4:
                    engine.Back();
                    break;
                case 5:
                    engine.Forward();
                    break;
                case 6:
                    engine.Remove();
                    break;
                case 7:
                    engine.GetPlayList();
                    break;
                case 8:
                    System.out.println("GoodBye!");
                    break;
            }
        }while(switcher != 8);
    }
}

