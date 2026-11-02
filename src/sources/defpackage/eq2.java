package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eq2 extends ro3 {
    public static final int j0 = (qo3.k0.Y | qo3.j0.Y) | qo3.m0.Y;
    public final z75 Y;
    public int Z;
    public final k43 f0;
    public boolean g0;
    public fs3 h0;
    public boolean i0;

    public eq2(int i, k43 k43Var, z75 z75Var) {
        this.Z = i;
        this.Y = z75Var;
        this.f0 = k43Var;
        this.h0 = new fs3(0, null, qo3.m0.a(i) ? new z47(this) : null);
        this.g0 = qo3.k0.a(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.i0) {
            return;
        }
        this.f0.close();
        this.i0 = true;
    }

    public final String g1(BigDecimal bigDecimal) {
        if (!qo3.l0.a(this.Z)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        g(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public abstract void h1(String str);

    @Override // defpackage.ro3
    public final void m(Object obj) {
        fs3 fs3Var = this.h0;
        if (fs3Var != null) {
            fs3Var.h = obj;
        }
    }

    @Override // defpackage.ro3
    public final boolean p(qo3 qo3Var) {
        return (this.Z & qo3Var.Y) != 0;
    }
}
