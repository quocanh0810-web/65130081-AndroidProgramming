package thigk2.lequocanh.thigiuaki;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ChucNang1Fragment extends Fragment {

    EditText editText_Vnd;
    EditText editText_DoLa;
    Button btnChuyen;
    public ChucNang1Fragment() {
        // Required empty public constructor
    }


    public static ChucNang1Fragment newInstance(String param1, String param2) {
        ChucNang1Fragment fragment = new ChucNang1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_chuc_nang1, container, false);
        // Tìm điều khiển trong view này
        editText_Vnd = viewCau1.findViewById(R.id.editTienVN);
        editText_DoLa = viewCau1.findViewById(R.id.editTienDL);
        btnChuyen = viewCau1.findViewById(R.id.btnDoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuVnd = editText_Vnd.getText().toString();
                String duLieuDola = editText_DoLa.getText().toString();
                //
                if(!duLieuVnd.isEmpty())
                {
                    Toast.makeText(viewCau1.getContext(),"vnd->dola",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(viewCau1.getContext(),"dola->vnd",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewCau1;
    }
}