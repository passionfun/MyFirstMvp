package mvp.model;

import com.passionfun.testmvp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/1/23.
 */

public class GirlModelImpl implements IGirlModel {
    @Override
    public void loadGirl(GirlOnLoadListener listener) {
        List<Girl> data = new ArrayList<>();
        data.add(new Girl(R.mipmap.ic_launcher,"五颗星","FIVESTARFIVESTARFIVESTARFIVESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"四颗星","FOURSTARFOURSTARFOURSTARFOURSTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"五颗星","FIVESTARFIVESTARFIVESTARFIVESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"三颗星","THREESTARTHREESTARTHREESTARTHREESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"二颗星","ONESTARONESTARONESTARONESTARONESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"一颗星","ONESTARONESTARONESTARONESTARONESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"二颗星","TWOSTARTWOSTARTWOSTARTWOSTARTWOSTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"三颗星","THREESTARTHREESTARTHREESTARTHREESTARTHREESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"一颗星","ONESTARONESTARONESTARONESTARONESTAR"));
        data.add(new Girl(R.mipmap.ic_launcher,"五颗星","FIVESTARFIVESTARFIVESTARFIVESTARFIVESTAR"));
        listener.onComplete(data);

    }
}
