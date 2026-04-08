package quocanh.ntu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerViewLandscape = findViewById(R.id.RecyclerLand);
        //---- dọc-----//
       // RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
       // recyclerViewLandscape.setLayoutManager(layoutLinear);

        //--- ngang---//
       // RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
       // recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        //---layout với số cột là 2--//
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);
        recylerViewDatas = getDataForRecyclerView();
        landScapeAdapter = new LandScapeAdapter(this, recylerViewDatas);
        recyclerViewLandscape.setAdapter(landScapeAdapter);

    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flag_tower", "Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("eiffel", "Tháp Effel"));
        dsDuLieu.add(new LandScape("buckingham", "Cung điện Buckingham"));
        dsDuLieu.add(new LandScape("statue_of_liberty", "Tượng nữ thần tự do"));
        return dsDuLieu;
    }
}