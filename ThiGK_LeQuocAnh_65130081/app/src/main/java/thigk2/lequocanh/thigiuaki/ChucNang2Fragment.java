package thigk2.lequocanh.thigiuaki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ChucNang2Fragment extends Fragment {
    private ListView lvCaKhuc;
    private ArrayList<String> dsCaKhuc;

    public ChucNang2Fragment() {
        // Required empty public constructor
    }

    public static ChucNang2Fragment newInstance() {
        return new ChucNang2Fragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Ánh xạ layout cho Fragment
        View view = inflater.inflate(R.layout.fragment_chuc_nang2, container, false);

        // 1. Ánh xạ ListView từ XML
        lvCaKhuc = view.findViewById(R.id.lv_ca_khuc);

        // 2. Khởi tạo danh sách 10 ca khúc
        dsCaKhuc = new ArrayList<>();
        dsCaKhuc.add("Tiến Quân Ca");
        dsCaKhuc.add("Giải Phóng Điện Biên");
        dsCaKhuc.add("Cô Gái Vót Chông");
        dsCaKhuc.add("Hành Khúc Giải Phóng Miền Nam");
        dsCaKhuc.add("Lên Đàng");
        dsCaKhuc.add("Tự Nguyện");
        dsCaKhuc.add("Hát Cho Dân Tôi Nghe");
        dsCaKhuc.add("Nối Vòng Tay Lớn");
        dsCaKhuc.add("Trường Sơn Đông Trường Sơn Tây");
        dsCaKhuc.add("Bài Ca Đặc Biệt: Lê Quốc Anh");

        // 3. Tạo Adapter
        if (getContext() != null) {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    getContext(),
                    android.R.layout.simple_list_item_1,
                    dsCaKhuc
            );
            // 4. Đổ dữ liệu lên ListView
            lvCaKhuc.setAdapter(adapter);
        }

        return view;
    }
}