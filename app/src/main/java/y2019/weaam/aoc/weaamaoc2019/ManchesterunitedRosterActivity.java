package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class ManchesterunitedRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchesterunited_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. David De Gea\n" +
                "13. Lee Grant\n" +
                "22. Sergio Romero\n" +
                "40. Joel Pereira\n" +
                "\n" +
                "DEFENDERS:\n" +
                "2.Victor Lindelof\n" +
                "3.Eric Bailly\n" +
                "4.Phil Jones\n" +
                "5.Harry Maguire\n" +
                "12.Chris Smalling\n" +
                "16.Marcos Rojo\n" +
                "18.Ashley Young\n" +
                "20.Diogo Dalot\n" +
                "23.Luke Shaw\n" +
                "24.Tim Fosu-Mensah\n" +
                "29.Aaron Wan-Bissaka\n" +
                "38.Axel Tuanzebe\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "6.Paul Pogba\n" +
                "8.Juan Mata\n" +
                "14.Jesse Lingard\n" +
                "15.Andreas Pereira\n" +
                "17.Fred\n" +
                "21.Daniel James\n" +
                "28.Angel Gomes\n" +
                "31.Nemanja Matic\n" +
                "37.James Garner\n" +
                "39.Scott Mctominay\n" +
                "\n" +
                "FORWARD:\n" +
                "7.Alexis Sanchez\n" +
                "9.Anthony Martial\n" +
                "10.Marcus Rashford\n" +
                "26.Mason Greenwood\n" +
                "44.Tahith Chong\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewIdmanu);
        scrollView.addView(tv);
    }
}
