package mvp.model;

/**
 * Created by lenovo on 2018/1/23.
 */

public class Girl {
    private int imgID;
    private String starNum;
    private String desc;

    public Girl(int imgID, String starNum, String desc) {
        this.imgID = imgID;
        this.starNum = starNum;
        this.desc = desc;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getStarNum() {
        return starNum;
    }

    public void setStarNum(String starNum) {
        this.starNum = starNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
