package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q67 extends d90 {
    public rb8 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.d90
    public final void a(float f, long j, df dfVar) {
        rb8 rb8Var = this.a;
        if (rb8Var == null || !ua7.a(this.b, j)) {
            if (ua7.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                rb8Var = null;
            } else {
                rb8Var = this.a;
                if (rb8Var == null) {
                    rb8Var = new rb8((byte) 1, false);
                    this.a = rb8Var;
                }
                rb8Var.Y = b(j);
                this.a = rb8Var;
                this.b = j;
            }
        }
        long jA = dfVar.a();
        long j2 = dw0.b;
        if (!tk8.a(jA, j2)) {
            dfVar.f(j2);
        }
        if (!dh3.f(dfVar.c, rb8Var != null ? (Shader) rb8Var.Y : null)) {
            dfVar.i(rb8Var != null ? (Shader) rb8Var.Y : null);
        }
        if (dfVar.a.getAlpha() / 255.0f == f) {
            return;
        }
        dfVar.d(f);
    }

    public abstract Shader b(long j);
}
