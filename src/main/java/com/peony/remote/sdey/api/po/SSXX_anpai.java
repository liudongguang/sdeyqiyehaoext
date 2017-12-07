package com.peony.remote.sdey.api.po;

import java.util.Date;

public class SSXX_anpai {
    private Date ssrq;//安排手术日期
    private String ssfj;//手术分级
    private String brks;//病人科室

    public Date getSsrq() {
        return ssrq;
    }

    public void setSsrq(Date ssrq) {
        this.ssrq = ssrq;
    }

    public String getSsfj() {
        return ssfj;
    }

    public void setSsfj(String ssfj) {
        this.ssfj = ssfj;
    }

    public String getBrks() {
        return brks;
    }

    public void setBrks(String brks) {
        this.brks = brks;
    }
}
