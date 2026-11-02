package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yc8 {
    public final long a;
    public final long b;
    public final boolean c;

    public yc8(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final yc8 a(yc8 yc8Var) {
        return new yc8(z85.f(this.a, yc8Var.a), Math.max(this.b, yc8Var.b), this.c || yc8Var.c);
    }
}
