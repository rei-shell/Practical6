package sg.edu.np.mad.week2T01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";
User user = new User("Name","Description", 01, true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView change = findViewById(R.id.helloworld);
        change.setText("MAD " + getRandomNumber());

        Button followButton = (Button) findViewById(R.id.userfollow);
        followButton.setText(user.followed ? "Follow" : "Unfollow");

        followButton.setOnClickListener(view -> {
            Button followButton1 = (Button) view;
            if (user.followed = !user.followed){
                followButton1.setText(user.followed ? "Unfollow" : "Follow");
                Toast.makeText(getApplicationContext(),"Followed",Toast.LENGTH_SHORT).show();
            }
            else{
                followButton1.setText(user.followed ? "Unfollow" : "Follow");
                Toast.makeText(getApplicationContext(),"Unfollowed",Toast.LENGTH_SHORT).show();
            }
        });
        Button message = (Button) findViewById(R.id.usermsg);
        message.setOnClickListener(view -> {
            Intent messagepage = new Intent (MainActivity.this, MessageGroup.class);
            startActivity(messagepage);
                }

        );
    }
    private int getRandomNumber(){
        Random ran = new Random();
        int myRandomValue = ran.nextInt(100000);
        return myRandomValue;
    }
}