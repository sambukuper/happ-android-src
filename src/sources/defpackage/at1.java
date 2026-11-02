package defpackage;

import java.util.List;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class at1 {
    public final String a;
    public final String b;
    public final mr2 c;
    public StateDownloadFile d;
    public transient bm3 e;
    public final transient List f;

    public at1(String str, String str2, mr2 mr2Var, StateDownloadFile stateDownloadFile, bm3 bm3Var, List list) {
        str.getClass();
        str2.getClass();
        mr2Var.getClass();
        stateDownloadFile.getClass();
        this.a = str;
        this.b = str2;
        this.c = mr2Var;
        this.d = stateDownloadFile;
        this.e = bm3Var;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at1)) {
            return false;
        }
        at1 at1Var = (at1) obj;
        return dh3.f(this.a, at1Var.a) && dh3.f(this.b, at1Var.b) && this.c == at1Var.c && this.d == at1Var.d && dh3.f(this.e, at1Var.e) && dh3.f(this.f, at1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + pc6.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        bm3 bm3Var = this.e;
        int iHashCode2 = (iHashCode + (bm3Var == null ? 0 : bm3Var.hashCode())) * 31;
        List list = this.f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StateDownloadFile stateDownloadFile = this.d;
        bm3 bm3Var = this.e;
        StringBuilder sbT = oi0.t("DataDownloadGeoFile(profileId=", this.a, ", subId=", this.b, ", geoFileType=");
        sbT.append(this.c);
        sbT.append(", state=");
        sbT.append(stateDownloadFile);
        sbT.append(", job=");
        sbT.append(bm3Var);
        sbT.append(", listeners=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
