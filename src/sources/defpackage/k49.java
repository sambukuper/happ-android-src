package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k49 {
    public final String a;
    public final u39 b;
    public final u91 c;
    public final long d;
    public final long e;
    public final long f;
    public final p31 g;
    public final int h;
    public final z00 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final String q;
    public final List r;

    public k49(String str, u39 u39Var, u91 u91Var, long j, long j2, long j3, p31 p31Var, int i, z00 z00Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, String str2, List list2) {
        str.getClass();
        u91Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = u39Var;
        this.c = u91Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = p31Var;
        this.h = i;
        this.i = z00Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = str2;
        this.r = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k49)) {
            return false;
        }
        k49 k49Var = (k49) obj;
        return dh3.f(this.a, k49Var.a) && this.b == k49Var.b && dh3.f(this.c, k49Var.c) && this.d == k49Var.d && this.e == k49Var.e && this.f == k49Var.f && this.g.equals(k49Var.g) && this.h == k49Var.h && this.i == k49Var.i && this.j == k49Var.j && this.k == k49Var.k && this.l == k49Var.l && this.m == k49Var.m && this.n == k49Var.n && this.o == k49Var.o && this.p.equals(k49Var.p) && dh3.f(this.q, k49Var.q) && this.r.equals(k49Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + pc6.e(p61.f(oi0.e(this.o, p61.g(oi0.e(this.m, oi0.e(this.l, p61.g(p61.g((this.i.hashCode() + oi0.e(this.h, (this.g.hashCode() + p61.g(p61.g(p61.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31), this.e, 31), this.f, 31)) * 31, 31)) * 31, this.j, 31), this.k, 31), 31), 31), this.n, 31), 31), 31, this.p), 31, this.q);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", workerClassName=" + this.q + ", progress=" + this.r + ")";
    }
}
