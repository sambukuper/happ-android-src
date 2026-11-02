package defpackage;

import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ir2 {
    public final GeoFileKey a;
    public final StateDownloadFileV2 b;
    public final String c;
    public final String d;
    public final String e;

    public ir2(GeoFileKey geoFileKey, StateDownloadFileV2 stateDownloadFileV2, String str, String str2) {
        stateDownloadFileV2.getClass();
        str.getClass();
        this.a = geoFileKey;
        this.b = stateDownloadFileV2;
        this.c = str;
        this.d = str2;
        this.e = geoFileKey.getGeoFileType().X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir2)) {
            return false;
        }
        ir2 ir2Var = (ir2) obj;
        return this.a.equals(ir2Var.a) && dh3.f(this.b, ir2Var.b) && dh3.f(this.c, ir2Var.c) && dh3.f(this.d, ir2Var.d);
    }

    public final int hashCode() {
        int iE = pc6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoFileProgressUiState(key=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", profileName=");
        return oi0.q(sb, this.c, ", subTitle=", this.d, ")");
    }
}
