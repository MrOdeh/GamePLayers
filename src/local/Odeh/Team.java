package local.Odeh;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private int playedGame = 0;
    private String name;
    ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addMember(T player) {
        if ((player != null) && !(member.contains(player))) {
            this.member.add(player);
            System.out.println(player.getName() + " --- Added");
            return true;
        }
        System.out.println(player.getName() + "Player already exists.");
        return false;
    }

    public int numPlayer() {
        return this.member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (theirScore > ourScore) {
            lost++;
            message = "Ansa m3leem";
        } else if (theirScore == ourScore) {
            tied++;
            message = "3'alg";
        } else {
            won++;
            message = "5awa";
        }
        playedGame++;
        if (opponent != null) {
            System.out.println(this.getName() + " " + message + " " + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
