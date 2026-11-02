package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g23 extends w18 {
    public final /* synthetic */ h23 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g23(String str, h23 h23Var, int i, long j) {
        super(str, true);
        this.e = h23Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.w18
    public final long a() {
        h23 h23Var = this.e;
        try {
            h23Var.y0.J(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            h23Var.g(2, 2, e);
            return -1L;
        }
    }
}
