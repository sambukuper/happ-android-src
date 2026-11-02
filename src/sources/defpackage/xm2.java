package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xm2 implements ax7 {
    public final Context X;
    public final String Y;
    public final b8 Z;
    public final boolean f0;
    public final boolean g0;
    public final vz7 h0;
    public boolean i0;

    public xm2(Context context, String str, b8 b8Var, boolean z, boolean z2) {
        b8Var.getClass();
        this.X = context;
        this.Y = str;
        this.Z = b8Var;
        this.f0 = z;
        this.g0 = z2;
        this.h0 = new vz7(new tb2(this, (byte) 2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vz7 vz7Var = this.h0;
        if (vz7Var.d()) {
            ((wm2) vz7Var.getValue()).close();
        }
    }

    @Override // defpackage.ax7
    public final sm2 g0() {
        return ((wm2) this.h0.getValue()).g(true);
    }

    @Override // defpackage.ax7
    public final String getDatabaseName() {
        return this.Y;
    }

    @Override // defpackage.ax7
    public final void setWriteAheadLoggingEnabled(boolean z) {
        vz7 vz7Var = this.h0;
        if (vz7Var.d()) {
            ((wm2) vz7Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.i0 = z;
    }
}
