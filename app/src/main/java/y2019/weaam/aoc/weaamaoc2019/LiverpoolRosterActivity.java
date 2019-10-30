package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class LiverpoolRosterActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liverpool_roster);

        TextView tv = new TextView(this);

        tv.setTextSize(25);
        tv.setText("\"GOALKEEPERS:\n" +
                "1. Alisson Becker\n" +
                "13. Adrian\n" +
                "22. Andy Lonergan\n" +
                "62. Caoimhin Kelleher\n" +
                "\n" +
                "DEFENDERS:\n" +
                "2.Nathaniel Clyne\n" +
                "4.Virgil van Dijk\n" +
                "6.Dejan Lovren\n" +
                "12.Joe Gomez\n" +
                "26.Andy Robertson\n" +
                "32.Joel Matip\n" +
                "51.Ki-Jana Hoever\n" +
                "66.Trent Alexander-Arnold\n" +
                "72.Sepp van den Berg\n" +
                "\n" +
                "MIDFIELDERS:\n" +
                "3.Fabihno\n" +
                "5.Georginio Wijnaldum\n" +
                "7.James Milner\n" +
                "8.Naby Keita\n" +
                "14.Jordan Henderson\n" +
                "15.Alex Oxlade-Chamberlain\n" +
                "20.Adam Lallana\n" +
                "23.Xherdan Shaqiri\n" +
                "48.Curtis Jones\n" +
                "67.Harvey Elliott\n" +
                "\n" +
                "FORWARD:\n" +
                "9.Roberto Firmino\n" +
                "10.Sadio Mane\n" +
                "11.Mohamed Salah\n" +
                "24.Rhian Brewster\n" +
                "27.Divock Origi\n" +
                "\"");

        ScrollView scrollView;

        scrollView = findViewById(R.id.scrollViewId);
        scrollView.addView(tv);
    }
}
