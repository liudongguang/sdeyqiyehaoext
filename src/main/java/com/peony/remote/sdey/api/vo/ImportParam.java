package com.peony.remote.sdey.api.vo;



import com.peony.base.api.util.DateUtil;

import java.util.Date;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public class ImportParam {
    private Date starte;
    private Date end;
    private Integer delFyState;//删除已有费用
    private String starteStr;
    private String endStr;
    public void initStr(){
        if(starte!=null){
            this.starteStr= DateUtil.yyyy_MM_ddFormat.format(starte);
        }
        if(end!=null){
            this.endStr=DateUtil.yyyy_MM_ddFormat.format(end);
        }
    }

    public Date getStarte() {
        return starte;
    }

    public void setStarte(Date starte) {
        this.starte = starte;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        if(end!=null){
            this.end = DateUtil.getDayLastTime(end);
        }
    }

    public String getStarteStr() {

        return starteStr;
    }

    public void setStarteStr(String starteStr) {
        this.starteStr = starteStr;
    }

    public String getEndStr() {

        return endStr;
    }

    public void setEndStr(String endStr) {
        this.endStr = endStr;
    }

    public Integer getDelFyState() {
        return delFyState;
    }

    public void setDelFyState(Integer delFyState) {
        this.delFyState = delFyState;
    }

    @Override
    public String toString() {
        return "ImportParam{" +
                "starte=" + starte +
                ", end=" + end +
                ", delFyState=" + delFyState +
                ", starteStr='" + starteStr + '\'' +
                ", endStr='" + endStr + '\'' +
                '}';
    }
}
