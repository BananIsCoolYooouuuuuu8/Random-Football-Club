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
import java.util.function.Consumer;

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
        premierLeagueClubs.add(liverpool);
        premierLeagueClubs.add(manchesterCity);
        premierLeagueClubs.add(arsenal);
        Random random = new Random();
        int randomIndexClub = random.nextInt(premierLeagueClubs.size());
        return premierLeagueClubs.get(randomIndexClub);
    }

    public Club getRandomLaligaClub() {
        Club barcelona = new Club(R.drawable.barcelona_logo, "Barcelona");
        Club realMadrid = new Club(R.drawable.real_madrid_logo, "Real Madrid");
        Club realBetis = new Club(R.drawable.real_betis_logo, "Real Betis");
        laligaClubs.add(barcelona);
        laligaClubs.add(realMadrid);
        laligaClubs.add(realBetis);
        Random random = new Random();
        int randomIndex = random.nextInt(laligaClubs.size());
        return laligaClubs.get(randomIndex);
    }

    public Club getRandomBundesligaClub() {
        Club bayernMunchen = new Club(R.drawable.bayern_munchen_logo, "Bayern Munchen");
        Club borussiaDortmund = new Club(R.drawable.borussia_dortmund_logo, "Borussia Dortmund");
        Club bayer = new Club(R.drawable.bayer_logo, "Bayer");
        bundesligaClubs.add(bayernMunchen);
        bundesligaClubs.add(borussiaDortmund);
        bundesligaClubs.add(bayer);
        Random random = new Random();
        int randomIndex = random.nextInt(bundesligaClubs.size());
        return bundesligaClubs.get(randomIndex);
    }

    public Club getRandomLigue1Club() {
        Club psg = new Club(R.drawable.psg_logo, "Paris-Saint-Germain");
        Club monaco = new Club(R.drawable.monaco_logo, "Monaco");
        Club lyon = new Club(R.drawable.lyon_logo, "Lyon");
        ligue1Clubs.add(psg);
        ligue1Clubs.add(monaco);
        ligue1Clubs.add(lyon);
        Random random = new Random();
        int randomIndex = random.nextInt(ligue1Clubs.size());
        return ligue1Clubs.get(randomIndex);
    }
    public Club getRandomSeriaAClub() {
        Club milan = new Club(R.drawable.milan_logo, "Milan");
        Club inter = new Club(R.drawable.inter_logo, "Inter");
        Club atalanta = new Club(R.drawable.atalanta_logo, "Atalanta");
        seriaAClubs.add(milan);
        seriaAClubs.add(inter);
        seriaAClubs.add(atalanta);
        Random random = new Random();
        int randomIndex = random.nextInt(seriaAClubs.size());
        return seriaAClubs.get(randomIndex);
    }
}