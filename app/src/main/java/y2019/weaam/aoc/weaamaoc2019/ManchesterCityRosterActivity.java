package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class ManchesterCityRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchester_city_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. Claudio Bravo\n" +
                "31. Ederson\n" +
                "32. Daniel Grimshaw\n" +
                "33. Scott Carson\n" +
                "49. Arijanet Muric\n" +
                "\n" +
                "DEFENDERS:\n" +
                "2. Kyle Walker\n" +
                "5. John Stones\n" +
                "12. Angelino\n" +
                "14. Aymeric Laporte\n" +
                "22. Benjamin Mendy\n" +
                "27. Joao Cancelo\n" +
                "30. Nicolas Otamendi\n" +
                "34. Phillippe Sandler\n" +
                "50. Eric Garcia\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "8. Ilkay Gundogan\n" +
                "11. Oleksander Zincheko\n" +
                "16. Rodrigo\n" +
                "17. Kevin De Bruyne\n" +
                "20. Bernando Silva\n" +
                "21. David Silva\n" +
                "25. Fernandinho\n" +
                "26. Riyad Mahrez\n" +
                "48. Phil Foden\n" +
                "NoNumber. Patrick Roberts\n" +
                "\n" +
                "FORWARD:\n" +
                "7. Raheem Streling\n" +
                "9. Gabriel Jesus\n" +
                "10. Sergio Aguero\n" +
                "19. Leroy Sane\n" +
                "83. Ian Carlo Poveda\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewIdmanc);
        scrollView.addView(tv);
    }
}
