package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bl7 {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final bf5 e;
    public final af5 f;
    public final cf5 g;
    public final lh4 h;
    public final df5 i;
    public fl0 j;

    public bl7(int i, int i2, lh4 lh4Var, af5 af5Var, bf5 bf5Var, cf5 cf5Var, df5 df5Var, Size size, String str) {
        size.getClass();
        str.getClass();
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = bf5Var;
        this.f = af5Var;
        this.g = cf5Var;
        this.h = lh4Var;
        this.i = df5Var;
    }

    public final boolean a() {
        df5 df5Var;
        cf5 cf5Var = this.g;
        if (cf5Var == null) {
            return true;
        }
        long j = cf5Var.a;
        if (cf5.a(j, 0L) || cf5.a(j, 1L) || cf5.a(j, 3L) || (df5Var = this.i) == null) {
            return true;
        }
        long j2 = df5Var.a;
        return df5.a(j2, 0L) || df5.a(j2, 1L);
    }

    public final String toString() {
        return pc6.j(this.a, "Output-");
    }
}
