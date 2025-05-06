class Player {
    static int totalPlayers = 0;
    String playerName;

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.playerName = "Alex";
        Player.totalPlayers++;

        Player p2 = new Player();
        p2.playerName = "Blake";
        Player.totalPlayers++;

        System.out.println("Total Players: " + Player.totalPlayers);
    }
}