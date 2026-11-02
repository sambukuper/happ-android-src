package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pr {
    public final String a;
    public final Map b;
    public final Integer c;

    public pr(String str, Map map, Integer num) {
        str.getClass();
        this.a = str;
        this.b = map;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return dh3.f(this.a, prVar.a) && dh3.f(this.b, prVar.b) && dh3.f(this.c, prVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AppNetworkResponse(urlContent=" + this.a + ", headers=" + this.b + ", statusCode=" + this.c + ")";
    }
}
