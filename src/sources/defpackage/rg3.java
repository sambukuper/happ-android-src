package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rg3 {
    public final int a;
    public final int b;
    public final f63 c;

    public rg3(int i, int i2, f63 f63Var) {
        this.a = i;
        this.b = i2;
        this.c = f63Var;
        if (i < 0) {
            zc3.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        zc3.a("size should be > 0");
    }
}
