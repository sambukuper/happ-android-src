package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wh7 extends bi7 {
    public k2 c;
    public int d;
    public int e;

    public wh7(long j, k2 k2Var) {
        super(j);
        this.c = k2Var;
    }

    @Override // defpackage.bi7
    public final void a(bi7 bi7Var) {
        synchronized (hi5.Z) {
            bi7Var.getClass();
            this.c = ((wh7) bi7Var).c;
            this.d = ((wh7) bi7Var).d;
            this.e = ((wh7) bi7Var).e;
        }
    }

    @Override // defpackage.bi7
    public final bi7 b() {
        return c(kd7.h().g());
    }

    @Override // defpackage.bi7
    public final bi7 c(long j) {
        return new wh7(j, this.c);
    }
}
