package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd7 extends bi7 {
    public Object c;

    public pd7(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.bi7
    public final void a(bi7 bi7Var) {
        bi7Var.getClass();
        this.c = ((pd7) bi7Var).c;
    }

    @Override // defpackage.bi7
    public final bi7 b() {
        return new pd7(kd7.h().g(), this.c);
    }

    @Override // defpackage.bi7
    public final bi7 c(long j) {
        return new pd7(j, this.c);
    }
}
