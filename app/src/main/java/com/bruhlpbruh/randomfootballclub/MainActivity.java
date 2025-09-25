package com.bruhlpbruh.randomfootballclub;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    List<Club> premierLeagueClubs = new ArrayList<>();
    List<Club> laligaClubs = new ArrayList<>();
    List<Club> bundesligaClubs = new ArrayList<>();
    List<Club> ligue1Clubs = new ArrayList<>();
    List<Club> seriaAClubs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button buttonRestart = findViewById(R.id.buttonRestart);
        LinearLayout clubAndNameDisplay = findViewById(R.id.clubAndNameDisplay);
        TextView textViewChooseTheClub = findViewById(R.id.chooseTheLeague);
        LinearLayout linearLayoutPremierLeague = findViewById(R.id.premierLeague);
        LinearLayout linearLayoutLaliga = findViewById(R.id.laliga);
        LinearLayout linearLayoutBundesliga = findViewById(R.id.bundesliga);
        LinearLayout linearLayoutLigue1 = findViewById(R.id.ligue1);
        LinearLayout linearLayoutSeriaA = findViewById(R.id.seriaA);
        ImageView imageViewClub = findViewById(R.id.clubImage);
        TextView textViewClubName = findViewById(R.id.clubName);
        linearLayoutPremierLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaguesViewHiding(textViewChooseTheClub, linearLayoutPremierLeague, linearLayoutLaliga, linearLayoutBundesliga, linearLayoutLigue1, linearLayoutSeriaA);
                Club club = getRandomPremierLeagueClub();
                setImageAndNameClub(club, imageViewClub, textViewClubName);
                buttonRestartAndClubDisplaydisclosure(buttonRestart, clubAndNameDisplay);
            }
        });
        linearLayoutLaliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaguesViewHiding(textViewChooseTheClub, linearLayoutPremierLeague, linearLayoutLaliga, linearLayoutBundesliga, linearLayoutLigue1, linearLayoutSeriaA);
                Club club = getRandomLaligaClub();
                setImageAndNameClub(club, imageViewClub, textViewClubName);
                buttonRestartAndClubDisplaydisclosure(buttonRestart, clubAndNameDisplay);
            }
        });
        linearLayoutBundesliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaguesViewHiding(textViewChooseTheClub, linearLayoutPremierLeague, linearLayoutLaliga, linearLayoutBundesliga, linearLayoutLigue1, linearLayoutSeriaA);
                Club club = getRandomBundesligaClub();
                setImageAndNameClub(club, imageViewClub, textViewClubName);
                buttonRestartAndClubDisplaydisclosure(buttonRestart, clubAndNameDisplay);
            }
        });
        linearLayoutLigue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaguesViewHiding(textViewChooseTheClub, linearLayoutPremierLeague, linearLayoutLaliga, linearLayoutBundesliga, linearLayoutLigue1, linearLayoutSeriaA);
                Club club = getRandomLigue1Club();
                setImageAndNameClub(club, imageViewClub, textViewClubName);
                buttonRestartAndClubDisplaydisclosure(buttonRestart, clubAndNameDisplay);
            }
        });
        linearLayoutSeriaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaguesViewHiding(textViewChooseTheClub, linearLayoutPremierLeague, linearLayoutLaliga, linearLayoutBundesliga, linearLayoutLigue1, linearLayoutSeriaA);
                Club club = getRandomSeriaAClub();
                setImageAndNameClub(club, imageViewClub, textViewClubName);
                buttonRestartAndClubDisplaydisclosure(buttonRestart, clubAndNameDisplay);
            }
        });
        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clubAndNameDisplay.setVisibility(View.GONE);
                buttonRestart.setVisibility(View.GONE);
                textViewChooseTheClub.setVisibility(View.VISIBLE);
                linearLayoutPremierLeague.setVisibility(View.VISIBLE);
                linearLayoutLaliga.setVisibility(View.VISIBLE);
                linearLayoutBundesliga.setVisibility(View.VISIBLE);
                linearLayoutLigue1.setVisibility(View.VISIBLE);
                linearLayoutSeriaA.setVisibility(View.VISIBLE);
            }
        });
    }

    private static void setImageAndNameClub(Club club, ImageView imageViewClub, TextView textViewClubName) {
        imageViewClub.setImageResource(club.getLogoClub());
        textViewClubName.setText(club.getNameClub());
    }

    private static void buttonRestartAndClubDisplaydisclosure(Button buttonRestart, LinearLayout clubAndNameDisplay) {
        buttonRestart.setVisibility(View.VISIBLE);
        clubAndNameDisplay.setVisibility(View.VISIBLE);
    }

    private static void leaguesViewHiding(TextView textViewChooseTheClub, LinearLayout linearLayoutPremierLeague, LinearLayout linearLayoutLaliga, LinearLayout linearLayoutBundesliga, LinearLayout linearLayoutLigue1, LinearLayout linearLayoutSeriaA) {
        textViewChooseTheClub.setVisibility(View.GONE);
        linearLayoutPremierLeague.setVisibility(View.GONE);
        linearLayoutLaliga.setVisibility(View.GONE);
        linearLayoutBundesliga.setVisibility(View.GONE);
        linearLayoutLigue1.setVisibility(View.GONE);
        linearLayoutSeriaA.setVisibility(View.GONE);
    }

    public Club getRandomPremierLeagueClub() {
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
        Random random = new Random();
        int randomIndexClub = random.nextInt(premierLeagueClubs.size());
        return premierLeagueClubs.get(randomIndexClub);
    }

    public Club getRandomLaligaClub() {
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
        Random random = new Random();
        int randomIndex = random.nextInt(laligaClubs.size());
        return laligaClubs.get(randomIndex);
    }

    public Club getRandomBundesligaClub() {
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
        Random random = new Random();
        int randomIndex = random.nextInt(bundesligaClubs.size());
        return bundesligaClubs.get(randomIndex);
    }

    public Club getRandomLigue1Club() {
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
        Random random = new Random();
        int randomIndex = random.nextInt(ligue1Clubs.size());
        return ligue1Clubs.get(randomIndex);
    }
    public Club getRandomSeriaAClub() {
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
        Random random = new Random();
        int randomIndex = random.nextInt(seriaAClubs.size());
        return seriaAClubs.get(randomIndex);
    }
}