package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class oi7 {
    public final long a;
    public final long b;
    public final Map c;
    public final Map d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oi7(long j, long j2, Map map, LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = j;
        this.b = j2;
        this.c = map;
        this.d = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi7)) {
            return false;
        }
        oi7 oi7Var = (oi7) obj;
        return this.a == oi7Var.a && this.b == oi7Var.b && this.c.equals(oi7Var.c) && this.d.equals(oi7Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + p61.g(Long.hashCode(this.a) * 31, this.b, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbS = pc6.s(this.a, "StatisticsData(passedTime=", ", currentTime=");
        sbS.append(this.b);
        sbS.append(", dataPassed=");
        sbS.append(this.c);
        sbS.append(", dataAll=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}
