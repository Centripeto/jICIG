package com.lostrucos.jicig.core;

import java.util.List;

public interface InformationSet {

    // Restituisce l'indice del giocatore a cui appartiene questo insieme di informazioni.
    int getPlayerIndex();

    // Restituisce una lista di stati di gioco possibili coerenti con le informazioni di cui dispone il giocatore.
    List<GameState> getPossibleStates();

    // Restituisce un valore booleano che indica se questo insieme di informazioni rappresenta uno stato terminale del gioco.
    boolean isTerminal();

    // Restituisce l'utilità (punteggio o ricompensa) per il giocatore specificato se questo insieme di informazioni rappresenta uno stato terminale.
    double getUtility(int player);

    // Restituisce l'utilità media per il giocatore associato a questo insieme di informazioni, calcolata su tutti gli stati di gioco possibili.
    double getAverageUtility();

    // Restituisce una lista delle azioni valide per il giocatore associato a questo insieme di informazioni.
    List<Action> getPlayerActions();

    // Restituisce il nuovo insieme di informazioni risultante dall'applicazione dell'azione specificata.
    InformationSet getNextInformationSet(Action action);

}