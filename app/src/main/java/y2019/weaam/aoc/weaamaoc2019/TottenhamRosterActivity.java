package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class TottenhamRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tottenham_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. Hugo Lloris\n" +
                "22. Paulo Gazzaniga\n" +
                "13. Michel Vorm\n" +
                "\n" +
                "DEFENDERS:\n" +
                "3. Danny Rose\n" +
                "4. Toby Alderweilerd\n" +
                "5. Jan Vertonghen\n" +
                "6. Davidson Sanchez\n" +
                "16. Kyle Walker-Peters\n" +
                "21. Jaun Foyth\n" +
                "24. Serge Aurier\n" +
                "33. Ben Davies\n" +
                "39. Japhet Tanganga\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "8. Harry Winks\n" +
                "11. Eric Lamela\n" +
                "12. Victor Wanyama\n" +
                "15. Eric Dier\n" +
                "17. Moussa Sissoko\n" +
                "20. Dele Alli\n" +
                "23. Christian Eriksen\n" +
                "27. Lucas Moura\n" +
                "28. Tanguy Ndombele\n" +
                "29. Oliver Skipp\n" +
                "18. Giovani Lo Celso\n" +
                "19. Ryan Sessegnon\n" +
                "\n" +
                "FORWARD:\n" +
                "7. Son Heung-Min\n" +
                "10. Harry Kane\n" +
                "52. Troy Parrot\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewIdtott);
        scrollView.addView(tv);
    }
}
