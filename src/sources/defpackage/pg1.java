package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 implements x67 {
    public final long a;

    public pg1(long j) {
        this.a = j;
    }

    @Override // defpackage.x67
    public final mb6 a(long j, z24 z24Var, fi1 fi1Var) {
        lf lfVarA = nf.a();
        long j2 = this.a;
        float fH0 = fi1Var.h0(nt1.b(j2));
        float fH1 = fi1Var.h0(nt1.a(j2));
        Path path = lfVarA.a;
        path.moveTo(0.0f, 0.0f);
        lfVarA.e(fH0 / 2.0f, 0.0f);
        lfVarA.e(0.0f, fH1);
        lfVarA.e((-fH0) / 2.0f, 0.0f);
        path.close();
        return new zd5(lfVarA);
    }
}
