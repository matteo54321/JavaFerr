/**
  Author: Stefano Ferretti, modifica di un programma del libro Lewis, Loftus, ...
  Destinato agli studenti del Corso di Laboratorio di Programmazione di Internet - CdL in Informatica per il Management
  Università di Bologna
  Il codice di partenza è di un libro che detiene il copyright di tale codice
  Quindi, vi prego di NON distribuire questo codice ma di usarlo solo per esempio!
  */

class TicTacToe_2010 {

    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    // by SF
    // aggiunta una variabile istanza in cui voglio memorizzare il vincitore
    private String winner;

    /**
       Costruisce una scacchiera vuota.
    */
    public TicTacToe_2010()
    {
       board = new String[ROWS][COLUMNS];
       // riempi di spazi
       for (int i = 0; i < ROWS; i++)
          for (int j = 0; j < COLUMNS; j++)
             board[i][j] = " ";
       winner = "none";
    }

/**
       Imposta un settore della scacchiera.
	   Il settore deve essere libero.
       @param i l'indice di riga 
       @param j l'indice di colonna
       @param player il giocatore ("x" o "o")
Modified by SF & studenti dell'AA 2010/11
       check per verificare che le coordinate date in input siano corrette e non corrispondano ad una posizione già occupata
Restituisce un booleano per indicare se la mossa è valida ed è stata apportata alla mappa di gioco
    */
    public boolean set(int i, int j, String player)
    {
       if ((i < 0) || (i >= ROWS))
	  return false;
       if ((j < 0) || (j >= COLUMNS))
	  return false;
       if (board[i][j].equals(" ")) {
          board[i][j] = player;
          return true;
       }
       return false;
    }
 
    /** Crea una rappresentazione della scacchiera
        in una stringa, ad esempio
       |x  o|
       |  x |
       |   o|
       @return la rappresentazione della stringa
    */
    public String toString()
    {
       String r = "";
       for (int i = 0; i < ROWS; i++)
       {
          r = r + "|";
          for (int j = 0; j < COLUMNS; j++)         
             r = r + board[i][j];
          r = r + "|\n";
       }
       return r;
    }

/**
by SF
Controlla se la partita è fininta oppure un giocatore ha vinto
Ci sono modi migliori per realizzare questo metodo!!
*/
    boolean checkEnd(String player){
      // controllo righe
      for (int i=0; i < ROWS; i++)
	if ((board[i][0].equals(player)) && (board[i][1].equals(player)) && (board[i][2].equals(player))) {
	  winner = player;
	  return true;
	}
      // controllo le colonne
      for (int i=0; i < COLUMNS; i++)
	if ((board[0][i].equals(player)) && (board[1][i].equals(player)) && (board[2][i].equals(player))){
	  winner = player;
	  return true;
	}
      // controllo diagonale principale
	if ((board[0][0].equals(player)) && (board[1][1].equals(player)) && (board[2][2].equals(player))){
	  winner = player;
	  return true;
	}
      // controllo altra diagonale 
	if ((board[0][2].equals(player)) && (board[1][1].equals(player)) && (board[2][0].equals(player))){
	  winner = player;
	  return true;
	}
      //se sono arrivato fino a qui nessuno ha vinto, verifico se le caselle sono tutte occupate, ovvero se la partita è terminata
       for (int i = 0; i < ROWS; i++)
          for (int j = 0; j < COLUMNS; j++)
	    if (board[i][j].equals(" "))
	      return false;
      // se sono arrivato qui vuol dire che tutte le caselle erano diverse da " ", quindi sono tutte occupate
      return true;
      
    }

// by SF
  String getWinner(){
    return winner;
  }
  

}
