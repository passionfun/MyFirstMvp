package mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;
import android.widget.Toast;

import com.passionfun.testmvp.R;
import com.passionfun.testmvp.mvp.view.BaseActivity;

import java.util.List;

import mvp.model.Girl;
import mvp.presenter.GirlPresenter;
import mvp.view.IGirlView;

/**
 * Created by lenovo on 2018/1/23.
 */

public class TestMvpActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView{
    ListView lv;
//    GirlPresenter girlPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        lv = findViewById(R.id.lv_showImg);
//        girlPresenter = new GirlPresenter();
//        girlPresenter.attachView(this);
        girlPresenter.fetch();
//        new GirlPresenter<>(this).fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }


    @Override
    public void showLoading() {
        Toast.makeText(this,"正在加载", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        GirlAdater adapter = new GirlAdater(this,girls);
        lv.setAdapter(adapter);
    }
}
