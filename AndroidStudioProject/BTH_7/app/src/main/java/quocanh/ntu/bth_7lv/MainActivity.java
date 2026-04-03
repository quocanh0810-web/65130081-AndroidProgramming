package quocanh.ntu.bth_7lv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsVatLieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        dsVatLieu = new ArrayList<String>();
        // them du lieu o day
        dsVatLieu.add("Xi Măng");
        dsVatLieu.add("Gạch");
        dsVatLieu.add("Đá ốp lát");
        dsVatLieu.add("Ống nhựa");
        dsVatLieu.add("Sơn chống thấm");
        // tạo adapter
        ArrayAdapter<String> adapterVatLieu;
        adapterVatLieu = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsVatLieu);
        // gắn vào điều khiển hiển thị listview
            // tìm
        ListView lvTenVatLieu = findViewById(R.id.lvDanhSachVL);
            // Gắn
        lvTenVatLieu.setAdapter(adapterVatLieu);
            // lắng nghe và xử lý sự kiện user tương tác
        lvTenVatLieu.setOnItemClickListener(BoLangNghevaXuLy);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // vd: BoLangNghevaXuLy
    AdapterView.OnItemClickListener BoLangNghevaXuLy = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strTenVatLieuChon = dsVatLieu.get(i);
            Toast.makeText(MainActivity.this,
                            strTenVatLieuChon,
                            Toast.LENGTH_LONG
                    ).show();
                }
            };
}