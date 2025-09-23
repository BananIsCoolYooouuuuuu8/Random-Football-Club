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
        TextView textViewChooseTheClub = findViewById(R.id.chooseTheLeagueID);
        LinearLayout linearLayoutPremierLeague = findViewById(R.id.premierLeagueID);
        LinearLayout linearLayoutLaliga = findViewById(R.id.laligaID);
        LinearLayout linearLayoutBundesliga = findViewById(R.id.bundesligaID);
        LinearLayout linearLayoutLigue1 = findViewById(R.id.ligue1ID);
        LinearLayout linearLayoutSeriaA = findViewById(R.id.seriaAID);
        ImageView imageViewClub = findViewById(R.id.clubImageID);
        TextView textViewClubName = findViewById(R.id.clubNameID);
        linearLayoutPremierLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewChooseTheClub.setVisibility(View.GONE);
                linearLayoutPremierLeague.setVisibility(View.GONE);
                linearLayoutLaliga.setVisibility(View.GONE);
                linearLayoutBundesliga.setVisibility(View.GONE);
                linearLayoutLigue1.setVisibility(View.GONE);
                linearLayoutSeriaA.setVisibility(View.GONE);
                Club club = getRandomPremierLeagueClub();
                imageViewClub.setImageResource(club.getLogoClub());
                imageViewClub.setVisibility(View.VISIBLE);
                textViewClubName.setText(club.getNameClub());
                textViewClubName.setVisibility(View.VISIBLE);
                buttonRestart.setVisibility(View.VISIBLE);
            }
        });
        linearLayoutLaliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewChooseTheClub.setVisibility(View.GONE);
                linearLayoutPremierLeague.setVisibility(View.GONE);
                linearLayoutLaliga.setVisibility(View.GONE);
                linearLayoutBundesliga.setVisibility(View.GONE);
                linearLayoutLigue1.setVisibility(View.GONE);
                linearLayoutSeriaA.setVisibility(View.GONE);
                Club club = getRandomLaligaClub();
                imageViewClub.setImageResource(club.getLogoClub());
                imageViewClub.setVisibility(View.VISIBLE);
                textViewClubName.setText(club.getNameClub());
                textViewClubName.setVisibility(View.VISIBLE);
                buttonRestart.setVisibility(View.VISIBLE);
            }
        });
        linearLayoutBundesliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewChooseTheClub.setVisibility(View.GONE);
                linearLayoutPremierLeague.setVisibility(View.GONE);
                linearLayoutLaliga.setVisibility(View.GONE);
                linearLayoutBundesliga.setVisibility(View.GONE);
                linearLayoutLigue1.setVisibility(View.GONE);
                linearLayoutSeriaA.setVisibility(View.GONE);
                Club club = getRandomBundesligaClub();
                imageViewClub.setImageResource(club.getLogoClub());
                imageViewClub.setVisibility(View.VISIBLE);
                textViewClubName.setText(club.getNameClub());
                textViewClubName.setVisibility(View.VISIBLE);
                buttonRestart.setVisibility(View.VISIBLE);
            }
        });
        linearLayoutLigue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewChooseTheClub.setVisibility(View.GONE);
                linearLayoutPremierLeague.setVisibility(View.GONE);
                linearLayoutLaliga.setVisibility(View.GONE);
                linearLayoutBundesliga.setVisibility(View.GONE);
                linearLayoutLigue1.setVisibility(View.GONE);
                linearLayoutSeriaA.setVisibility(View.GONE);
                Club club = getRandomLigue1Club();
                imageViewClub.setImageResource(club.getLogoClub());
                imageViewClub.setVisibility(View.VISIBLE);
                textViewClubName.setText(club.getNameClub());
                textViewClubName.setVisibility(View.VISIBLE);
                buttonRestart.setVisibility(View.VISIBLE);
            }
        });
        linearLayoutSeriaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewChooseTheClub.setVisibility(View.GONE);
                linearLayoutPremierLeague.setVisibility(View.GONE);
                linearLayoutLaliga.setVisibility(View.GONE);
                linearLayoutBundesliga.setVisibility(View.GONE);
                linearLayoutLigue1.setVisibility(View.GONE);
                linearLayoutSeriaA.setVisibility(View.GONE);
                Club club = getRandomSeriaAClub();
                imageViewClub.setImageResource(club.getLogoClub());
                imageViewClub.setVisibility(View.VISIBLE);
                textViewClubName.setText(club.getNameClub());
                textViewClubName.setVisibility(View.VISIBLE);
                buttonRestart.setVisibility(View.VISIBLE);
            }
        });
        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewClub.setVisibility(View.GONE);
                textViewClubName.setVisibility(View.GONE);
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
    public Club getRandomPremierLeagueClub() {
        Club liverpool = new Club(R.drawable.liverpool_logo, "Liverpool");
        Club manchesterCity = new Club(R.drawable.manchester_city_logo, "Manchester city");
        Club arsenal = new Club(R.drawable.arsenal_logo, "Arsenal");
        List<Club> clubs = new ArrayList<>();
        clubs.add(liverpool);
        clubs.add(manchesterCity);
        clubs.add(arsenal);
        Random random = new Random();
        int randomIndexClub = random.nextInt(clubs.size());
        return clubs.get(randomIndexClub);
    }

    public Club getRandomLaligaClub() {
        Club barcelona = new Club(R.drawable.barcelona_logo, "Barcelona");
        Club realMadrid = new Club(R.drawable.real_madrid_logo, "Real Madrid");
        Club realBetis = new Club(R.drawable.real_betis_logo, "Real Betis");
        List<Club> clubs = new ArrayList<>();
        clubs.add(barcelona);
        clubs.add(realMadrid);
        clubs.add(realBetis);
        Random random = new Random();
        int randomIndex = random.nextInt(clubs.size());
        return clubs.get(randomIndex);
    }

    public Club getRandomBundesligaClub() {
        Club bayernMunchen = new Club(R.drawable.bayern_munchen_logo, "Bayern Munchen");
        Club borussiaDortmund = new Club(R.drawable.borussia_dortmund_logo, "Borussia Dortmund");
        Club bayer = new Club(R.drawable.bayer_logo, "Bayer");
        List<Club> clubs = new ArrayList<>();
        clubs.add(bayernMunchen);
        clubs.add(borussiaDortmund);
        clubs.add(bayer);
        Random random = new Random();
        int randomIndex = random.nextInt(clubs.size());
        return clubs.get(randomIndex);
    }

    public Club getRandomLigue1Club() {
        Club psg = new Club(R.drawable.psg_logo, "Paris-Saint-Germain");
        Club monaco = new Club(R.drawable.monaco_logo, "Monaco");
        Club lyon = new Club(R.drawable.lyon_logo, "Lyon");
        List<Club> clubs = new ArrayList<>();
        clubs.add(psg);
        clubs.add(monaco);
        clubs.add(lyon);
        Random random = new Random();
        int randomIndex = random.nextInt(clubs.size());
        return clubs.get(randomIndex);
    }
    public Club getRandomSeriaAClub() {
        Club milan = new Club(R.drawable.milan_logo, "Milan");
        Club inter = new Club(R.drawable.inter_logo, "Inter");
        Club atalanta = new Club(R.drawable.atalanta_logo, "Atalanta");
        List<Club> clubs = new ArrayList<>();
        clubs.add(milan);
        clubs.add(inter);
        clubs.add(atalanta);
        Random random = new Random();
        int randomIndex = random.nextInt(clubs.size());
        return clubs.get(randomIndex);
    }
}