package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m21 {
    public static final vz4 a;

    static {
        wk6 wk6Var = nw0.e;
        int i = wk6Var.c;
        j21 j21Var = new j21(wk6Var, wk6Var, 1);
        int i2 = wk6Var.c;
        n95 n95Var = nw0.x;
        int i3 = (n95Var.c << 6) | i2;
        l21 l21Var = new l21(wk6Var, n95Var, 0);
        int i4 = (i2 << 6) | n95Var.c;
        l21 l21Var2 = new l21(n95Var, wk6Var, 0);
        vz4 vz4Var = gf3.a;
        vz4 vz4Var2 = new vz4();
        vz4Var2.h(i | (i << 6), j21Var);
        vz4Var2.h(i3, l21Var);
        vz4Var2.h(i4, l21Var2);
        a = vz4Var2;
    }
}
