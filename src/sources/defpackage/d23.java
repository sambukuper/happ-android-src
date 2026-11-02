package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d23 extends w18 {
    public final /* synthetic */ h23 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ i90 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d23(String str, h23 h23Var, int i, i90 i90Var, int i2, boolean z) {
        super(str, true);
        this.e = h23Var;
        this.f = i;
        this.g = i90Var;
        this.h = i2;
    }

    @Override // defpackage.w18
    public final long a() {
        try {
            qe4 qe4Var = this.e.m0;
            i90 i90Var = this.g;
            int i = this.h;
            qe4Var.getClass();
            i90Var.skip(i);
            this.e.y0.D(this.f, 9);
            synchronized (this.e) {
                this.e.A0.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
