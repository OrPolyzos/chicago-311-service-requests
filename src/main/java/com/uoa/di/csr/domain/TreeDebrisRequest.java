package com.uoa.di.csr.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "tree_debris_requests")
@DiscriminatorValue(value = "TreeDebrisRequest")
public class TreeDebrisRequest extends ServiceRequest implements SsaRequest, ActivityRequest {

    @Column(name = "where_is_located")
    private String whereIsTheDebrisLocated;

    @OneToOne
    private Activity activity;

    @OneToOne
    private SpecialServiceArea specialServiceArea;

    public String getWhereIsTheDebrisLocated() {
        return whereIsTheDebrisLocated;
    }

    public void setWhereIsTheDebrisLocated(String whereIsTheDebrisLocated) {
        this.whereIsTheDebrisLocated = whereIsTheDebrisLocated;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public SpecialServiceArea getSpecialServiceArea() {
        return specialServiceArea;
    }

    public void setSpecialServiceArea(SpecialServiceArea specialServiceArea) {
        this.specialServiceArea = specialServiceArea;
    }
}
