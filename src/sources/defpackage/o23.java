package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o23 {
    public final int a;
    public final h23 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final m23 i;
    public final l23 j;
    public final n23 k;
    public final n23 l;
    public int m;
    public IOException n;

    public o23(int i, h23 h23Var, boolean z, boolean z2, nz2 nz2Var) {
        h23Var.getClass();
        this.a = i;
        this.b = h23Var;
        this.f = h23Var.s0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new m23(this, h23Var.r0.a(), z2);
        this.j = new l23(this, z);
        this.k = new n23(this);
        this.l = new n23(this);
        if (nz2Var == null) {
            if (f()) {
                return;
            }
            bt.i("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            bt.i("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(nz2Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zG;
        byte[] bArr = ks8.a;
        synchronized (this) {
            try {
                m23 m23Var = this.i;
                if (m23Var.Y || !m23Var.g0) {
                    z = false;
                } else {
                    l23 l23Var = this.j;
                    if (l23Var.X || l23Var.Z) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zG = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zG) {
                return;
            }
            this.b.m(this.a);
        }
    }

    public final void b() throws IOException {
        l23 l23Var = this.j;
        if (l23Var.Z) {
            u52.s("stream closed");
            return;
        }
        if (l23Var.X) {
            u52.s("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new el7(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            h23 h23Var = this.b;
            h23Var.getClass();
            h23Var.y0.D(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = ks8.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.Y && this.j.X) {
                return false;
            }
            this.b.m(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.D(this.a, i);
        }
    }

    public final boolean f() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean g() {
        try {
            if (this.m != 0) {
                return false;
            }
            m23 m23Var = this.i;
            if (m23Var.Y || m23Var.g0) {
                l23 l23Var = this.j;
                if ((l23Var.X || l23Var.Z) && this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(nz2 nz2Var, boolean z) {
        boolean zG;
        nz2Var.getClass();
        byte[] bArr = ks8.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(nz2Var);
                }
                if (z) {
                    this.i.Y = true;
                }
                zG = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zG) {
            return;
        }
        this.b.m(this.a);
    }
}
