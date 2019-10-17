package y2019.weaam.aoc.weaamaoc2019;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener
{

    //components
    ListView lvClubs;
    CustomAdapter2 adapter;
    ArrayList<Club> arrClubs=new ArrayList<Club>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrClubs.add(new Club("Liverpool", R.drawable.liverpoolicon, R.drawable.favoriteicon));
        arrClubs.add(new Club("Manchester United F.C.", R.drawable.muicon, R.drawable.favoriteicon));
        arrClubs.add(new Club("Chelsea", R.drawable.chelsea, R.drawable.favoriteicon));
        arrClubs.add(new Club("Arsenal", R.drawable.arsenallogo, R.drawable.favoriteicon));
        arrClubs.add(new Club("Leicester City F.C.", R.drawable.lclogo, R.drawable.favoriteicon));
        arrClubs.add(new Club("Manchester City F.C", R.drawable.mcitylogo, R.drawable.favoriteicon));
        arrClubs.add(new Club("Tottenham", R.drawable.tottenhamlogo, R.drawable.favoriteicon));

        lvClubs=(ListView) findViewById(R.id.lvClubs);
        adapter = new CustomAdapter2(this, R.layout.clubs_item, arrClubs);
        lvClubs.setAdapter(adapter);



        //creating objects for components


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.addgame:
                Intent i=new Intent(this,AddGameActivity.class);
                startActivity(i);
                break;

            case R.id.gamelist:
                i = new Intent(this,GamelistActivity.class);
                startActivity(i);
                break;

            case R.id.logout:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you want to quit?");
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent c = new Intent(MainActivity.this,LoginActivity.class);
                        startActivity(c);
                    }
                });
                builder.setNegativeButton("No", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                break;







        }
        return true;

    }







    @Override
    public boolean onLongClick(View v) {
        return false;
    }


    @Override
    public void onClick(View v) {

    }


    }

