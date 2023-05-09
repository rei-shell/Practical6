package sg.edu.np.mad.week2T01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    String title= "List Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView pic = (ImageView) findViewById(R.id.logo1);
        pic.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            new AlertDialog.Builder(this)
                    .setTitle("Profile")
                    .setMessage("MADness")
                    .setNegativeButton("close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setPositiveButton("View", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent goNext = new Intent(ListActivity.this, MainActivity.class);
                            int random = new Random().nextInt() ;
                            goNext.putExtra("random",random);
                            startActivity(goNext);

                        }
                    }).show();

        });
    }
}