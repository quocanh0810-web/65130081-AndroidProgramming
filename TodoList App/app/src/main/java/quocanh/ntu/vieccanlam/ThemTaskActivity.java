package quocanh.ntu.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lâý dữ liệu
                EditText editTextName = findViewById(R.id.editTextTenCV);
                EditText editTextMess = findViewById(R.id.editTextMessage);
                EditText editTextDate = findViewById(R.id.editTextDate);
                EditText editTextPrio = findViewById(R.id.editTextPrio);

                String tenCV = editTextName.getText().toString();
                String mess = editTextName.getText().toString();
                String dat = editTextName.getText().toString();
                String pri = editTextName.getText().toString();
                //
                TASKS task = new TASKS(tenCV,dat, mess, pri);
                // Kết nối DB
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("TASKS");
                String key = databaseReference.push().getKey();
                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put(key, task.toFirebaseObject());

                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null) finish();
                    }
                });


            }
        });
    }
}
