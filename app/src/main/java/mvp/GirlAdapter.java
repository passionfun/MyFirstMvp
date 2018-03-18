package mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.passionfun.testmvp.R;

import java.util.List;

import mvp.model.Girl;

/**
 * Created by lenovo on 2018/1/23.
 */

class GirlAdater extends BaseAdapter {
    Context mContext;
    List<Girl> girls;
    LayoutInflater inflater;
    public GirlAdater(Context mContext, List<Girl> girls){
        this.mContext = mContext;
        this.girls = girls;
        inflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int position) {
        return girls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder holder = null;
        Girl girl = girls.get(position);
       if(convertView == null){
           convertView = inflater.inflate(R.layout.item_show_info,parent,false);
           holder = new MyHolder(convertView);
           convertView.setTag(holder);
       }else{
           holder = (MyHolder) convertView.getTag();
       }
       holder.iv.setImageResource(girl.getImgID());
       holder.tv_star.setText(girl.getStarNum());
       holder.tv_desc.setText(girl.getDesc());
        return convertView;
    }
    public static class MyHolder{
        ImageView iv;
        TextView tv_star;
        TextView tv_desc;
        public MyHolder(View view){
            iv = view.findViewById(R.id.iv_show);
            tv_star = view.findViewById(R.id.tv_star);
            tv_desc = view.findViewById(R.id.tv_desc);
        }
    }
}
