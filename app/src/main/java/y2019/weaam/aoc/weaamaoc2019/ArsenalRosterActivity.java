package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class ArsenalRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsenal_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. Brend Leno\n" +
                "26. Emiliano Martinez\n" +
                "33. Matt Macey\n" +
                "\n" +
                "DEFENDERS:\n" +
                "2. Hector Bellerin\n" +
                "3. Kieran Tierney\n" +
                "5. Sokratis\n" +
                "16. Rob Holding\n" +
                "20. Shkodran Mustafi\n" +
                "21. Calum Chambers\n" +
                "23. David Luiz\n" +
                "27. Konstantinios Mavropanos\n" +
                "31. Sead Kolasinac\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "8. Dani Ceballos\n" +
                "10. Mesut Ozil\n" +
                "11. Lucas Torreira\n" +
                "15. Ainsley Maitland-Niles\n" +
                "28. Joe Willock\n" +
                "29. Matteo Guendouzi\n" +
                "32. Emile Smith Rowe\n" +
                "34. Granit Xhaka\n" +
                "\n" +
                "FORWARD:\n" +
                "9. Alexandre Lacazette\n" +
                "14. Pierre-Emerick Aubameyang\n" +
                "19. Nicolas Pepe\n" +
                "24. Reiss Nelson\n" +
                "35. Gabrielle Martinelli\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewIdarsenal);
        scrollView.addView(tv);
    }
}
