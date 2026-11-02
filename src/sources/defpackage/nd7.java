package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nd7 extends bi7 {
    public long c;

    public nd7(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.bi7
    public final void a(bi7 bi7Var) {
        bi7Var.getClass();
        this.c = ((nd7) bi7Var).c;
    }

    @Override // defpackage.bi7
    public final bi7 b() {
        return c(kd7.h().g());
    }

    @Override // defpackage.bi7
    public final bi7 c(long j) {
        return new nd7(j, this.c);
    }
}
