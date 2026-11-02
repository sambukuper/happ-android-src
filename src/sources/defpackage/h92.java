package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h92 implements d73 {
    public final oi5 X;
    public final s92 Y;
    public final String Z;
    public final AutoCloseable f0;
    public final Object g0 = new Object();
    public boolean h0;
    public j76 i0;

    public h92(oi5 oi5Var, s92 s92Var, String str, AutoCloseable autoCloseable) {
        this.X = oi5Var;
        this.Y = s92Var;
        this.Z = str;
        this.f0 = autoCloseable;
    }

    @Override // defpackage.d73
    public final oi5 G0() {
        oi5 oi5Var;
        synchronized (this.g0) {
            if (this.h0) {
                throw new IllegalStateException("closed");
            }
            oi5Var = this.X;
        }
        return oi5Var;
    }

    @Override // defpackage.d73
    public final ci8 N() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.g0) {
            this.h0 = true;
            j76 j76Var = this.i0;
            if (j76Var != null) {
                try {
                    j76Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.f0;
                if (autoCloseable != null) {
                    try {
                        pc6.v(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.f0;
                if (autoCloseable != null) {
                    pc6.v(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.d73
    public final s92 getFileSystem() {
        return this.Y;
    }

    @Override // defpackage.d73
    public final ba0 source() {
        synchronized (this.g0) {
            if (this.h0) {
                throw new IllegalStateException("closed");
            }
            j76 j76Var = this.i0;
            if (j76Var != null) {
                return j76Var;
            }
            j76 j76VarI = vr3.i(this.Y.source(this.X));
            this.i0 = j76VarI;
            return j76VarI;
        }
    }
}
