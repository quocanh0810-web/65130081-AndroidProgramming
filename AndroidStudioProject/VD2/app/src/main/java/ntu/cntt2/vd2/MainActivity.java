package ntu.cntt2.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong gan voi dieu khien tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    // Xu ly cong
   public void XuLyCong(View v){

        //lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Tong = soA + soB;
        // Hien ket qua
        EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }

    //Xu ly tru
    public void XuLyTru(View v){

        //lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Hieu = soA - soB;
        // Hien ket qua
        EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Hieu);
        editTextKQ.setText(chuoiKQ);

    }

    //Xu ly nhan
    public void XuLyNhan(View v){

        //lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Tich = soA * soB;
        // Hien ket qua
        EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tich);
        editTextKQ.setText(chuoiKQ);

    }


    // xu ly chia
     public void XuLyChia(View v){

        //lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Thuong = soA / soB;
        // Hien ket qua
        String chuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(chuoiKQ);

    }
}