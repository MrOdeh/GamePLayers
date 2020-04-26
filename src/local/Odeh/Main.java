package local.Odeh;

public class Main {

    public static void main(String[] args) {
        Football mahmoud = new Football("Mahmoud");
        Football mahmoud4 = new Football("Mahmoud4");
        Football mahmoud3 = new Football("Mahmoud3");
        SoccerPLayer Ahmad = new SoccerPLayer("Ahmad");
        Baseball Yazan = new Baseball("Yazan");

        Football mahmoud2 = new Football("Mahmoud2");
        SoccerPLayer Ahmad2 = new SoccerPLayer("Ahmad2");
        Baseball Yazan2 = new Baseball("Yazan2");

        Team<Football> adelaiedTeam = new Team("adelaiedTeam");
        Team<Football> adelaiedTeam3 = new Team("adelaiedTeam3");
        Team<SoccerPLayer> wahdat = new Team("wahdat");
        Team<Baseball> nshama = new Team("nshalama");

        Team<Football> adelaiedTeam2 = new Team("adelaiedTeam2");
        Team<Football> adelaiedTeam4 = new Team("adelaiedTeam4");
        Team<SoccerPLayer> wahdat2 = new Team("wahdat2");
        Team<Baseball> nshama2 = new Team("nshalama2");

        System.out.println("Total number of player is# " + adelaiedTeam.numPlayer());
        adelaiedTeam.addMember(mahmoud);
        adelaiedTeam2.addMember(mahmoud2);
        wahdat.addMember(Ahmad);
        wahdat2.addMember(Ahmad2);
        nshama.addMember(Yazan);
        nshama2.addMember(Yazan2);
        adelaiedTeam3.addMember(mahmoud3);
        adelaiedTeam4.addMember(mahmoud4);
        System.out.println("Total number of player is# " + adelaiedTeam.numPlayer());


        adelaiedTeam.matchResult(adelaiedTeam2, 1, 0);
        adelaiedTeam.matchResult(adelaiedTeam3, 3, 8);
        //adelaiedTeam.matchResult(adelaiedTeam2,2,0);
        adelaiedTeam4.matchResult(adelaiedTeam2, 2, 1);

        System.out.println(adelaiedTeam.getName() + "  ranked#  " + adelaiedTeam.ranking());
        System.out.println(wahdat.getName() + "  ranked#  " + wahdat.ranking());
        System.out.println(adelaiedTeam4.getName() + "  ranked#  " + adelaiedTeam4.ranking());

        System.out.println(adelaiedTeam.compareTo(adelaiedTeam2));
    }
}
