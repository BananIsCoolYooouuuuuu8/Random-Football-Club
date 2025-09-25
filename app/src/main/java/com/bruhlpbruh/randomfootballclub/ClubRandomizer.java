package com.bruhlpbruh.randomfootballclub;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClubRandomizer {

    private List<Club> premierLeagueClubs = new ArrayList<>();

    private List<Club> laligaClubs = new ArrayList<>();
    private List<Club> bundesligaClubs = new ArrayList<>();
    private List<Club> ligue1Clubs = new ArrayList<>();
    private List<Club> seriaAClubs = new ArrayList<>();
    public ClubRandomizer() {
        initializePremierLeague();
        initializeLaliga();
        initializeBundesliga();
        initializeLigue1();
        initializeSeriaA();
    }

    public Club getClubByLeague(League league) {
        switch (league) {
            case PREMIER_LEAGUE:
                return getRandomPremierLeagueClub();
            case LALIGA:
                return getRandomLaligaClub();
            case BUNDESLIGA:
                return getRandomBundesligaClub();
            case LIGUE_1:
                return getRandomLigue1Club();
            case SERIA_A:
                return getRandomSeriaAClub();
            default:
                return getRandomLaligaClub();
        }
    }

    public Club getRandomPremierLeagueClub() {
        Random random = new Random();
        int randomIndexClub = random.nextInt(premierLeagueClubs.size());
        return premierLeagueClubs.get(randomIndexClub);
    }

    public Club getRandomLaligaClub() {
        Random random = new Random();
        int randomIndex = random.nextInt(laligaClubs.size());
        return laligaClubs.get(randomIndex);
    }

    public Club getRandomBundesligaClub() {
        Random random = new Random();
        int randomIndex = random.nextInt(bundesligaClubs.size());
        return bundesligaClubs.get(randomIndex);
    }

    public Club getRandomLigue1Club() {
        Random random = new Random();
        int randomIndex = random.nextInt(ligue1Clubs.size());
        return ligue1Clubs.get(randomIndex);
    }

    private void initializePremierLeague() {
        Club liverpool = new Club(R.drawable.liverpool_logo, "Liverpool");
        Club manchesterCity = new Club(R.drawable.manchester_city_logo, "Manchester city");
        Club arsenal = new Club(R.drawable.arsenal_logo, "Arsenal");
        Club newcastleUnited = new Club(R.drawable.newcastle_united_logo, "Newcastle United");
        Club bournemouth = new Club(R.drawable.bournemouth_logo, "Bournemouth");
        Club manchesterUnited = new Club(R.drawable.manchester_united_logo, "Manchester United");
        Club crystalPalace = new Club(R.drawable.crystal_palace_logo, "Crystal Palace");
        Club chelsea = new Club(R.drawable.chelsea_logo, "Chelsea");
        Club astonVilla = new Club(R.drawable.aston_villa_logo, "Aston Villa");
        Club tottenham = new Club(R.drawable.tottenham, "Tottenham");
        premierLeagueClubs.add(liverpool);
        premierLeagueClubs.add(manchesterCity);
        premierLeagueClubs.add(arsenal);
        premierLeagueClubs.add(newcastleUnited);
        premierLeagueClubs.add(bournemouth);
        premierLeagueClubs.add(manchesterUnited);
        premierLeagueClubs.add(crystalPalace);
        premierLeagueClubs.add(chelsea);
        premierLeagueClubs.add(astonVilla);
        premierLeagueClubs.add(tottenham);
    }

    private void initializeLaliga() {
        Club barcelona = new Club(R.drawable.barcelona_logo, "Barcelona");
        Club realMadrid = new Club(R.drawable.real_madrid_logo, "Real Madrid");
        Club realBetis = new Club(R.drawable.real_betis_logo, "Real Betis");
        Club athleticBilbao = new Club(R.drawable.athletic_bilbao_logo, "Athletic Bilbao");
        Club atleticoMadrid = new Club(R.drawable.atletico_madrid_logo, "Atletico Madrid");
        Club espanyol = new Club(R.drawable.espanyol_logo, "Espanyol");
        Club getafe = new Club(R.drawable.getafe_logo, "Getafe");
        Club girona = new Club(R.drawable.girona_logo, "Girona");
        Club sevilla = new Club(R.drawable.sevilla_logo, "Sevilla");
        Club valencia = new Club(R.drawable.valencia_logo, "Valencia");
        laligaClubs.add(barcelona);
        laligaClubs.add(realMadrid);
        laligaClubs.add(realBetis);
        laligaClubs.add(athleticBilbao);
        laligaClubs.add(atleticoMadrid);
        laligaClubs.add(espanyol);
        laligaClubs.add(getafe);
        laligaClubs.add(girona);
        laligaClubs.add(sevilla);
        laligaClubs.add(valencia);
    }

    public Club getRandomSeriaAClub() {
        Random random = new Random();
        int randomIndex = random.nextInt(seriaAClubs.size());
        return seriaAClubs.get(randomIndex);
    }

    private void initializeBundesliga() {
        Club bayernMunchen = new Club(R.drawable.bayern_munchen_logo, "Bayern Munchen");
        Club borussiaDortmund = new Club(R.drawable.borussia_dortmund_logo, "Borussia Dortmund");
        Club bayer = new Club(R.drawable.bayer_logo, "Bayer");
        Club mainz = new Club(R.drawable.mainz_logo, "Mainz 05");
        Club leipzig = new Club(R.drawable.rb_leipzig_logo, "RB Leipzig");
        Club stuttgart = new Club(R.drawable.stuttgart_logo, "Stuttgart");
        Club wolfsburg = new Club(R.drawable.wolfsburg_logo, "Wolfsburg");
        Club augsburg = new Club(R.drawable.augsburg_logo, "Augsburg");
        Club borussiaMonchengladbach = new Club(R.drawable.borussia_monchengladbach_logo, "Borussia Monchengladbach");
        Club freiburg = new Club(R.drawable.freiburg_logo, "Freiburg");
        Club schalke = new Club(R.drawable.schalke_logo, "Schalke 04");
        Club union = new Club(R.drawable.union_logo, "Union");
        bundesligaClubs.add(bayernMunchen);
        bundesligaClubs.add(borussiaDortmund);
        bundesligaClubs.add(bayer);
        bundesligaClubs.add(mainz);
        bundesligaClubs.add(leipzig);
        bundesligaClubs.add(stuttgart);
        bundesligaClubs.add(wolfsburg);
        bundesligaClubs.add(augsburg);
        bundesligaClubs.add(borussiaMonchengladbach);
        bundesligaClubs.add(freiburg);
        bundesligaClubs.add(schalke);
        bundesligaClubs.add(union);
    }

    private void initializeLigue1() {
        Club psg = new Club(R.drawable.psg_logo, "Paris-Saint-Germain");
        Club monaco = new Club(R.drawable.monaco_logo, "Monaco");
        Club lyon = new Club(R.drawable.lyon_logo, "Lyon");
        Club havre = new Club(R.drawable.havre_logo, "Havre");
        Club lens = new Club(R.drawable.lens_logo, "Lens");
        Club losc = new Club(R.drawable.losc_logo, "Losc");
        Club metz = new Club(R.drawable.metz_logo, "Metz");
        Club nantes = new Club(R.drawable.nantes_logo, "Nantes");
        Club nice = new Club(R.drawable.nice_logo, "Nice");
        Club toulouse = new Club(R.drawable.toulouse_logo, "Toulouse");
        ligue1Clubs.add(psg);
        ligue1Clubs.add(monaco);
        ligue1Clubs.add(lyon);
        ligue1Clubs.add(havre);
        ligue1Clubs.add(lens);
        ligue1Clubs.add(losc);
        ligue1Clubs.add(metz);
        ligue1Clubs.add(nantes);
        ligue1Clubs.add(nice);
        ligue1Clubs.add(toulouse);
    }

    private void initializeSeriaA() {
        Club milan = new Club(R.drawable.milan_logo, "Milan");
        Club inter = new Club(R.drawable.inter_logo, "Inter");
        Club atalanta = new Club(R.drawable.atalanta_logo, "Atalanta");
        Club bologna = new Club(R.drawable.bologna_logo, "Bologna");
        Club fiorentina = new Club(R.drawable.fiorentina_logo, "Fiorentina");
        Club genoa = new Club(R.drawable.genoa_logo, "Genoa");
        Club juventus = new Club(R.drawable.juventus_logo, "Juventus");
        Club lazio = new Club(R.drawable.lazio_logo, "Lazio");
        Club napoli = new Club(R.drawable.napoli_logo, "Napoli");
        Club rome = new Club(R.drawable.rome_logo, "Rome");
        seriaAClubs.add(milan);
        seriaAClubs.add(inter);
        seriaAClubs.add(atalanta);
        seriaAClubs.add(bologna);
        seriaAClubs.add(fiorentina);
        seriaAClubs.add(genoa);
        seriaAClubs.add(juventus);
        seriaAClubs.add(lazio);
        seriaAClubs.add(napoli);
        seriaAClubs.add(rome);
    }

}
