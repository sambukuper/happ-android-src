package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fx7 extends gx7 {
    public final zm2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx7(sm2 sm2Var, String str) {
        super(sm2Var, str);
        sm2Var.getClass();
        str.getClass();
        this.f0 = sm2Var.m(str);
    }

    @Override // defpackage.xr6
    public final boolean S0() {
        g();
        this.f0.Z.execute();
        return false;
    }

    @Override // defpackage.xr6
    public final void T(int i, String str) {
        str.getClass();
        g();
        this.f0.t(i, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f0.close();
        this.Z = true;
    }

    @Override // defpackage.xr6
    public final byte[] getBlob(int i) {
        g();
        nr4.T(21, "no row");
        throw null;
    }

    @Override // defpackage.xr6
    public final int getColumnCount() {
        g();
        return 0;
    }

    @Override // defpackage.xr6
    public final String getColumnName(int i) {
        g();
        nr4.T(21, "no row");
        throw null;
    }

    @Override // defpackage.xr6
    public final long getLong(int i) {
        g();
        nr4.T(21, "no row");
        throw null;
    }

    @Override // defpackage.xr6
    public final void h(int i, double d) {
        g();
        this.f0.h(i, d);
    }

    @Override // defpackage.xr6
    public final void i(int i, long j) {
        g();
        this.f0.i(i, j);
    }

    @Override // defpackage.xr6
    public final boolean isNull(int i) {
        g();
        nr4.T(21, "no row");
        throw null;
    }

    @Override // defpackage.xr6
    public final void j(int i, byte[] bArr) {
        g();
        this.f0.j(i, bArr);
    }

    @Override // defpackage.xr6
    public final void l(int i) {
        g();
        this.f0.l(i);
    }

    @Override // defpackage.xr6
    public final String p0(int i) {
        g();
        nr4.T(21, "no row");
        throw null;
    }

    @Override // defpackage.xr6
    public final void reset() {
    }
}
