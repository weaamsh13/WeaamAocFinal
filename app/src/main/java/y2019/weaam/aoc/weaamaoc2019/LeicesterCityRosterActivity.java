package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class LeicesterCityRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leicester_city_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. Kasper Schmeichel\n" +
                "12. Danny Ward\n" +
                "35. Eldin Jakupovic\n" +
                "\n" +
                "DEFENDERS:\n" +
                "2. James Justin\n" +
                "3. Ben Chillwell\n" +
                "4. Çaglar Söyüncü\n" +
                "5. Wes Morgan\n" +
                "6. Jonny Evans\n" +
                "16. Filip Benkovic\n" +
                "18. Daniel Amartey\n" +
                "21. Ricardo Pereira\n" +
                "28. Christian Fuchs\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "7. Demarai Gray\n" +
                "8. Youri Tielemans\n" +
                "10. James Maddison\n" +
                "11. Marc Albrighton\n" +
                "15. Harvey Barnes\n" +
                "20. Hamza Choudhury\n" +
                "22. Matty James\n" +
                "24. Nampalys Mendy\n" +
                "25. Wilfred Ndidi\n" +
                "26. Dennis Praet\n" +
                "\n" +
                "FORWARD:\n" +
                "9. Jamie Vardy\n" +
                "14. Kelechi Iheanacho\n" +
                "17. Ayoze Pérez\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewIdleicester);
        scrollView.addView(tv);
    }
}
