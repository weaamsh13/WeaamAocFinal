package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class ChelseaRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chelsea_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. Kepa Arrizabalaga\n" +
                "13. Willy Caballero\n" +
                "31. Jamie Cumming\n" +
                "\n" +
                "DEFENDERS:\n" +
                "2. Antonio Rudiger\n" +
                "3. Marcos Alonso\n" +
                "4. Andreas Christensen\n" +
                "28. Cesar Azpilicueta\n" +
                "33. Emerson Palmieri\n" +
                "15. Kurt Zouma\n" +
                "24. Reece James\n" +
                "29. Fikayo Tomori\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "5. Jorginho\n" +
                "7. N'golo Kante\n" +
                "8. Ross Barkley\n" +
                "17. Mateo Kovacic\n" +
                "12. Roben Loftus-Cheek\n" +
                "NoNumber. Marco Van Ginkel\n" +
                "19. Mason Mount\n" +
                "\n" +
                "FORWARD:\n" +
                "11. Pedro\n" +
                "20. Callum Hudson-Odoi\n" +
                "18. Oliver Giroud\n" +
                "10. Willian\n" +
                "23. Michy Batshuayi\n" +
                "22. Christian Pulisic\n" +
                "9. Tammy Abraham\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewIdchelsea);
        scrollView.addView(tv);
    }
}
