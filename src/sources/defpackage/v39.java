package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v39 {
    public final UUID a;
    public final u39 b;
    public final HashSet c;
    public final u91 d;
    public final u91 e;
    public final int f;
    public final int g;
    public final p31 h;
    public final long i;
    public final t39 j;
    public final long k;
    public final int l;
    public final String m;

    public v39(UUID uuid, u39 u39Var, HashSet hashSet, u91 u91Var, u91 u91Var2, int i, int i2, p31 p31Var, long j, t39 t39Var, long j2, int i3, String str) {
        uuid.getClass();
        u91Var.getClass();
        u91Var2.getClass();
        this.a = uuid;
        this.b = u39Var;
        this.c = hashSet;
        this.d = u91Var;
        this.e = u91Var2;
        this.f = i;
        this.g = i2;
        this.h = p31Var;
        this.i = j;
        this.j = t39Var;
        this.k = j2;
        this.l = i3;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !v39.class.equals(obj.getClass())) {
            return false;
        }
        v39 v39Var = (v39) obj;
        if (this.f == v39Var.f && this.g == v39Var.g && dh3.f(this.a, v39Var.a) && this.b == v39Var.b && dh3.f(this.d, v39Var.d) && this.h.equals(v39Var.h) && this.i == v39Var.i && dh3.f(this.j, v39Var.j) && this.k == v39Var.k && this.l == v39Var.l && dh3.f(this.m, v39Var.m) && this.c.equals(v39Var.c)) {
            return dh3.f(this.e, v39Var.e);
        }
        return false;
    }

    public final int hashCode() {
        int iG = p61.g((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, this.i, 31);
        t39 t39Var = this.j;
        int iE = oi0.e(this.l, p61.g((iG + (t39Var != null ? t39Var.hashCode() : 0)) * 31, this.k, 31), 31);
        String str = this.m;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l + ", workerClassName=" + this.m;
    }
}
