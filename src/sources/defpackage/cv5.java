package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class cv5 extends db7 {
    public final a05 f0;
    public volatile p98 g0;
    public volatile p98 h0;

    public cv5(o02 o02Var, int i, String str) {
        super(o02Var, nx0.a.incrementAndGet());
        int i2 = fi4.a;
        this.f0 = new a05(6);
        new s05();
    }

    public p98 k(long j, String str, long j2) {
        p98 p98Var;
        synchronized (this.f0) {
            try {
                a05 a05Var = this.f0;
                Object objD = a05Var.d(j);
                if (objD == null) {
                    p98 p98Var2 = new p98(j, j2, str, this);
                    a05Var.g(j, p98Var2);
                    objD = p98Var2;
                }
                p98Var = (p98) objD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p98Var;
    }
}
