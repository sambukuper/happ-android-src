package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u88 {
    public static final f08 i = new f08((byte) 3);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final f48 h;

    public u88(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            bt.q("Either pre or post text must not be empty");
            throw null;
        }
        this.h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? f48.Z : f48.Y : f48.X;
    }

    public final a48 a() {
        f48 f48Var = this.h;
        f48 f48Var2 = f48.Y;
        a48 a48Var = a48.f0;
        if (f48Var != f48Var2) {
            return a48Var;
        }
        long j = this.e;
        if (!f88.b(j)) {
            return a48Var;
        }
        long j2 = this.d;
        if (f88.b(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? a48.X : a48.Y;
        }
        int i2 = (int) (j2 >> 32);
        return (i2 == ((int) (j >> 32)) && i2 == this.a) ? a48.Z : a48Var;
    }
}
