public class Player {

    //    private int points, assist, rebounds, steals, blocks;
    private String name;
    private Game [][] gamesStats = new Game[22][];
    private int gameIndex =0;

    public Player(String name){
        this.name = name;

    }

    public void setGameStats(String name, Game[] gameStats){
        if(this.name == name) {
            gamesStats[gameIndex] = new Game[gameStats.length];
            gameIndex++;
        }
        else
            System.out.println("Wrong Player");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game[] [] getGamesStats() {
//        for(int i = 0; i < gamesStats.length; i++){
//            for(int j =0; j < gamesStats[i].length; j++){
//                System.out.print(gamesStats[i][j]);
//            }
//            System.out.println();
//        }
        return gamesStats;
    }


}
