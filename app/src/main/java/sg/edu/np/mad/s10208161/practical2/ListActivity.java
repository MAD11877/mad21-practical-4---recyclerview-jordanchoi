package sg.edu.np.mad.s10208161.practical2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // boilerplate codes in the next two lines
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Week 4 - 1.1) Create User List
        ArrayList<User> userList = new ArrayList<User>();

        // Week 4 - 1.2) Create 20 User Objects and add to the userList.
        for (int i = 0; i < 20; i++)
        {
            Random rd = new Random();
            int randomIntForName = rd.nextInt(10000000);
            int randomIntForDesc = rd.nextInt(10000000);
            boolean randBool = rd.nextBoolean();
            User u = new User("Name" + randomIntForName, "Description" + randomIntForDesc, i, randBool);
            userList.add(u);
        }

        // Search center *image* by ID 'imageClick' and assign to var 'centerImg'
//        ImageView centerImg = findViewById(R.id.imageClick);

        // Build a new AlertDialog on this activity
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // onClickListener for the centerImg for the click event.
//        centerImg.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View V)
//            {
//                // method chaining to set the properties(?) for the alertdialog created previously.
//                builder.setTitle("Profile").setMessage("MADness").setCancelable(false).setPositiveButton("View", new DialogInterface.OnClickListener()
//                {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int id) {
//                        // generate a random integer by calling the random library/class/interface.
//                        Random rd = new Random();
//                        // the bound is the maximum number the number will be generate - by 1
//                        int randomInt = rd.nextInt(1000000);
//                        // Creates the MainActivity Intent.
//                        Intent mainActivity = new Intent(ListActivity.this, MainActivity.class);
//                        // Pass the generated randomized number to the MainActivity through the intent.
//                        mainActivity.putExtra("random", randomInt);
//                        // Move to the MainActivity using the intent created.
//                        startActivity(mainActivity);
//                    }
//                }).setNegativeButton("Close", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int id) {
//                        // Cancels the dialog.
//                        dialogInterface.cancel();
//                    }
//                });
//                // Finalize(?) and creates the dialog from the above properties and displays it.
//                AlertDialog alert = builder.create();
//                alert.show();
//            }
//        });

        RecyclerView rv = findViewById(R.id.userRv);
        UsersAdapter adapter = new UsersAdapter(this, userList);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}