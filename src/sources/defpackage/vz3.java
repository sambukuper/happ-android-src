package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vz3 {
    public final int a;
    public final Integer b;
    public final Set c;
    public final ei3 d;

    public vz3(Set set, ei3 ei3Var) {
        set.getClass();
        this.a = 398591036;
        this.b = 5;
        this.c = set;
        this.d = ei3Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vz3) && ((long) this.a) == ((long) ((vz3) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        Integer num = this.b;
        if (num == null) {
            return j + " without alias";
        }
        return j + " with alias " + num.intValue();
    }
}
