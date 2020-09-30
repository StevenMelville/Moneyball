import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        loadPlayers();
    }

    public static ArrayList<Player> loadPlayers(){
        ArrayList<Player> list = new ArrayList<>();

        try {
            Scanner file = new Scanner(new File("all_seasons.csv"));
            String player;
            String info[];
            file.nextLine();

            while(file.hasNextLine()){
                player = file.nextLine();
                info = player.split(",");

                list.add(new Player());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}
