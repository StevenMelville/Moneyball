import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> list = loadPlayers();

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
                list.add(new Player(info[1], info[2], Double.valueOf(info[3]), Double.valueOf(info[4]), Double.valueOf(info[5]),
                                    info[6], info[7], !info[8].equals("Undrafted") ? Double.valueOf(info[8]) : 0, !info[9].equals("Undrafted") ? Double.valueOf(info[9]) : 0, !info[10].equals("Undrafted") ? Double.valueOf(info[10]) : 0,
                                    Double.valueOf(info[11]), Double.valueOf(info[12]), Double.valueOf(info[13]), Double.valueOf(info[14]), Double.valueOf(info[15]),
                                    Double.valueOf(info[16]), Double.valueOf(info[17]), Double.valueOf(info[18]), Double.valueOf(info[19]), Double.valueOf(info[20]), info[21]));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}
