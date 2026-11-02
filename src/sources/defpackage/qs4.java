package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qs4 implements v85 {
    public final yz4 a;
    public final bm4 b;
    public int c = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qs4(yz4 yz4Var, bm4 bm4Var) {
        this.a = yz4Var;
        this.b = bm4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj) throws Exception {
        int i = this.c;
        int i2 = ((qc4) this.a).g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}
