package quocanh.ntu.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        // chuản bị nguồn dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", R.drawable.imagesct, "Mô tả ở đây", 25000));
        dsMonAn.add(new MonAn("Cơm tấm sườn trứng", R.drawable.imagesctst, "Mô tả ở đây", 27000));
        dsMonAn.add(new MonAn("Cơm gà sối mỡ", R.drawable.imagescgsm, "Mô tả ở đây", 30000));
        dsMonAn.add(new MonAn("Cơm tấm sườn bì chả", R.drawable.imagesctsbc, "Mô tả ở đây", 32000));
        dsMonAn.add(new MonAn("Cơm tấm đặc biệt", R.drawable.imagesctdb, "Mô tả ở đây", 35000));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        // xử lý sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                // lấy phần tử được chọn
                MonAn monAnChon = dsMonAn.get(i);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_LONG).show();
            }
        });

    }
}