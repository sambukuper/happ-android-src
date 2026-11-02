package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uq5 implements xr6 {
    public final xr6 X;
    public final long Y;
    public final /* synthetic */ br5 Z;

    public uq5(br5 br5Var, xr6 xr6Var) {
        xr6Var.getClass();
        this.Z = br5Var;
        this.X = xr6Var;
        this.Y = pw7.e();
    }

    @Override // defpackage.xr6
    public final boolean S0() {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.S0();
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final void T(int i, String str) {
        str.getClass();
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.T(i, str);
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.close();
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.xr6
    public final byte[] getBlob(int i) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.getBlob(i);
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final int getColumnCount() {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.getColumnCount();
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final String getColumnName(int i) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.getColumnName(i);
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final long getLong(int i) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.getLong(i);
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final void h(int i, double d) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.h(i, d);
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.xr6
    public final void i(int i, long j) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.i(i, j);
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.xr6
    public final boolean isNull(int i) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.isNull(i);
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final void j(int i, byte[] bArr) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.j(i, bArr);
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.xr6
    public final void l(int i) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.l(i);
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.xr6
    public final String p0(int i) {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            return this.X.p0(i);
        }
        nr4.T(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.xr6
    public final void reset() {
        if (this.Z.d.get()) {
            nr4.T(21, "Statement is recycled");
            throw null;
        }
        if (this.Y == pw7.e()) {
            this.X.reset();
        } else {
            nr4.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
