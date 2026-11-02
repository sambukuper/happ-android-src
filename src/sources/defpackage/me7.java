package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class me7 implements d73 {
    public final s92 X;
    public final ci8 Y;
    public final Object Z = new Object();
    public boolean f0;
    public final ba0 g0;

    public me7(ba0 ba0Var, s92 s92Var, ci8 ci8Var) {
        this.X = s92Var;
        this.Y = ci8Var;
        this.g0 = ba0Var;
    }

    @Override // defpackage.d73
    public final oi5 G0() {
        synchronized (this.Z) {
            if (this.f0) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.d73
    public final ci8 N() {
        return this.Y;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.Z) {
            this.f0 = true;
            ba0 ba0Var = this.g0;
            if (ba0Var != null) {
                try {
                    ba0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.d73
    public final s92 getFileSystem() {
        return this.X;
    }

    @Override // defpackage.d73
    public final ba0 source() {
        ba0 ba0Var;
        synchronized (this.Z) {
            try {
                if (this.f0) {
                    throw new IllegalStateException("closed");
                }
                ba0Var = this.g0;
                if (ba0Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ba0Var;
    }
}
