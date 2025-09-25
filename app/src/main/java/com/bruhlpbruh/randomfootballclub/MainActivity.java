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

public class MainActivity extends AppCompatActivity {

    private final ClubRandomizer clubRandomizer = new ClubRandomizer();
    private Button buttonRestart;
    private TextView textViewChooseTheClub;
    private LinearLayout clubAndNameDisplay;
    private LinearLayout linearLayoutPremierLeague;
    private LinearLayout linearLayoutLaliga;
    private LinearLayout linearLayoutBundesliga;
    private LinearLayout linearLayoutLigue1;
    private LinearLayout linearLayoutSeriaA;
    private ImageView imageViewClub;
    private TextView textViewClubName;

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
        findViews();
        linearLayoutPremierLeague.setOnClickListener(v -> showRandomClub(League.PREMIER_LEAGUE));
        linearLayoutLaliga.setOnClickListener(v -> showRandomClub(League.LALIGA));
        linearLayoutBundesliga.setOnClickListener(v -> showRandomClub(League.BUNDESLIGA));
        linearLayoutLigue1.setOnClickListener(v -> showRandomClub(League.LIGUE_1));
        linearLayoutSeriaA.setOnClickListener(v -> showRandomClub(League.SERIA_A));
        buttonRestart.setOnClickListener(v -> {
            clubAndNameDisplay.setVisibility(View.GONE);
            buttonRestart.setVisibility(View.GONE);
            textViewChooseTheClub.setVisibility(View.VISIBLE);
            linearLayoutPremierLeague.setVisibility(View.VISIBLE);
            linearLayoutLaliga.setVisibility(View.VISIBLE);
            linearLayoutBundesliga.setVisibility(View.VISIBLE);
            linearLayoutLigue1.setVisibility(View.VISIBLE);
            linearLayoutSeriaA.setVisibility(View.VISIBLE);
        });
    }

    private void showRandomClub(League league) {
        hideLeaguesView();
        Club club = clubRandomizer.getClubByLeague(league);
        setImageAndNameClub(club);
        showButtonRestartAndClubDisplay();
    }

    private void setImageAndNameClub(Club club) {
        imageViewClub.setImageResource(club.getLogoClub());
        textViewClubName.setText(club.getNameClub());
    }

    private void showButtonRestartAndClubDisplay() {
        buttonRestart.setVisibility(View.VISIBLE);
        clubAndNameDisplay.setVisibility(View.VISIBLE);
    }

    private void hideLeaguesView() {
        textViewChooseTheClub.setVisibility(View.GONE);
        linearLayoutPremierLeague.setVisibility(View.GONE);
        linearLayoutLaliga.setVisibility(View.GONE);
        linearLayoutBundesliga.setVisibility(View.GONE);
        linearLayoutLigue1.setVisibility(View.GONE);
        linearLayoutSeriaA.setVisibility(View.GONE);
    }

    public void findViews() {
        buttonRestart = findViewById(R.id.buttonRestart);
        clubAndNameDisplay = findViewById(R.id.clubAndNameDisplay);
        textViewChooseTheClub = findViewById(R.id.chooseTheLeague);
        linearLayoutPremierLeague = findViewById(R.id.premierLeague);
        linearLayoutLaliga = findViewById(R.id.laliga);
        linearLayoutBundesliga = findViewById(R.id.bundesliga);
        linearLayoutLigue1 = findViewById(R.id.ligue1);
        linearLayoutSeriaA = findViewById(R.id.seriaA);
        imageViewClub = findViewById(R.id.clubImage);
        textViewClubName = findViewById(R.id.clubName);
    }
}