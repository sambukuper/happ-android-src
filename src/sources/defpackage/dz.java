package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dz {
    public final f08 a;
    public final HashMap b;

    public dz(f08 f08Var, HashMap map) {
        this.a = f08Var;
        this.b = map;
    }

    public final long a(fu5 fu5Var, long j, int i) {
        long j2 = j - this.a.j();
        ez ezVar = (ez) this.b.get(fu5Var);
        long j3 = ezVar.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j3 > 1 ? j3 : 2L) * ((long) i2)))), j2), ezVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return this.a.equals(dzVar.a) && this.b.equals(dzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
