package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cv4 implements q63, xj2 {
    public final Object X;
    public final yg0 Y;
    public int Z;
    public final o61 f0;
    public boolean g0;
    public final o8 h0;
    public p63 i0;
    public Executor j0;
    public final LongSparseArray k0;
    public final LongSparseArray l0;
    public int m0;
    public final ArrayList n0;
    public final ArrayList o0;

    public cv4(int i, int i2, int i3, int i4) {
        o8 o8Var = new o8(ImageReader.newInstance(i, i2, i3, i4));
        this.X = new Object();
        this.Y = new yg0(this);
        this.Z = 0;
        this.f0 = new o61(this, (byte) 18);
        this.g0 = false;
        this.k0 = new LongSparseArray();
        this.l0 = new LongSparseArray();
        this.o0 = new ArrayList();
        this.h0 = o8Var;
        this.m0 = 0;
        this.n0 = new ArrayList(s());
    }

    @Override // defpackage.q63
    public final int a() {
        int iA;
        synchronized (this.X) {
            iA = this.h0.a();
        }
        return iA;
    }

    @Override // defpackage.q63
    public final int b() {
        int iB;
        synchronized (this.X) {
            iB = this.h0.b();
        }
        return iB;
    }

    @Override // defpackage.xj2
    public final void c(yj2 yj2Var) {
        synchronized (this.X) {
            f(yj2Var);
        }
    }

    @Override // defpackage.q63
    public final void close() {
        synchronized (this.X) {
            try {
                if (this.g0) {
                    return;
                }
                Iterator it = new ArrayList(this.n0).iterator();
                while (it.hasNext()) {
                    ((n63) it.next()).close();
                }
                this.n0.clear();
                this.h0.close();
                this.g0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q63
    public final n63 d() {
        synchronized (this.X) {
            try {
                if (this.n0.isEmpty()) {
                    return null;
                }
                if (this.m0 >= this.n0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.n0.size() - 1; i++) {
                    if (!this.o0.contains(this.n0.get(i))) {
                        arrayList.add((n63) this.n0.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n63) it.next()).close();
                }
                int size = this.n0.size();
                ArrayList arrayList2 = this.n0;
                this.m0 = size;
                n63 n63Var = (n63) arrayList2.get(size - 1);
                this.o0.add(n63Var);
                return n63Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q63
    public final int e() {
        int iE;
        synchronized (this.X) {
            iE = this.h0.e();
        }
        return iE;
    }

    public final void f(yj2 yj2Var) {
        synchronized (this.X) {
            try {
                int iIndexOf = this.n0.indexOf(yj2Var);
                if (iIndexOf >= 0) {
                    this.n0.remove(iIndexOf);
                    int i = this.m0;
                    if (iIndexOf <= i) {
                        this.m0 = i - 1;
                    }
                }
                this.o0.remove(yj2Var);
                if (this.Z > 0) {
                    i(this.h0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(s57 s57Var) {
        p63 p63Var;
        Executor executor;
        synchronized (this.X) {
            try {
                if (this.n0.size() < s()) {
                    s57Var.g(this);
                    this.n0.add(s57Var);
                    p63Var = this.i0;
                    executor = this.j0;
                } else {
                    hi5.z0("TAG");
                    s57Var.close();
                    p63Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (p63Var != null) {
            if (executor != null) {
                executor.execute(new sc4(this, p63Var, (byte) 3));
            } else {
                p63Var.k(this);
            }
        }
    }

    @Override // defpackage.q63
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.X) {
            surface = this.h0.getSurface();
        }
        return surface;
    }

    @Override // defpackage.q63
    public final void h() {
        synchronized (this.X) {
            this.h0.h();
            this.i0 = null;
            this.j0 = null;
            this.Z = 0;
        }
    }

    public final void i(q63 q63Var) {
        n63 n63VarV;
        synchronized (this.X) {
            try {
                if (this.g0) {
                    return;
                }
                int size = this.l0.size() + this.n0.size();
                if (size >= q63Var.s()) {
                    hi5.z0("MetadataImageReader");
                    return;
                }
                do {
                    try {
                        n63VarV = q63Var.v();
                        if (n63VarV != null) {
                            this.Z--;
                            size++;
                            this.l0.put(n63VarV.r0().getTimestamp(), n63VarV);
                            j();
                        }
                    } catch (IllegalStateException unused) {
                        hi5.z0("MetadataImageReader");
                        n63VarV = null;
                    }
                    if (n63VarV == null || this.Z <= 0) {
                        break;
                    }
                } while (size < q63Var.s());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.X) {
            try {
                for (int size = this.k0.size() - 1; size >= 0; size--) {
                    d63 d63Var = (d63) this.k0.valueAt(size);
                    long timestamp = d63Var.getTimestamp();
                    n63 n63Var = (n63) this.l0.get(timestamp);
                    if (n63Var != null) {
                        this.l0.remove(timestamp);
                        this.k0.removeAt(size);
                        g(new s57(n63Var, null, d63Var));
                    }
                }
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.X) {
            try {
                if (this.l0.size() != 0 && this.k0.size() != 0) {
                    long jKeyAt = this.l0.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.k0.keyAt(0);
                    mb6.n(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.l0.size() - 1; size >= 0; size--) {
                            if (this.l0.keyAt(size) < jKeyAt2) {
                                ((n63) this.l0.valueAt(size)).close();
                                this.l0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.k0.size() - 1; size2 >= 0; size2--) {
                            if (this.k0.keyAt(size2) < jKeyAt) {
                                this.k0.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q63
    public final void p(p63 p63Var, Executor executor) {
        synchronized (this.X) {
            p63Var.getClass();
            this.i0 = p63Var;
            executor.getClass();
            this.j0 = executor;
            this.h0.p(this.f0, executor);
        }
    }

    @Override // defpackage.q63
    public final int s() {
        int iS;
        synchronized (this.X) {
            iS = this.h0.s();
        }
        return iS;
    }

    @Override // defpackage.q63
    public final n63 v() {
        synchronized (this.X) {
            try {
                if (this.n0.isEmpty()) {
                    return null;
                }
                if (this.m0 >= this.n0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.n0;
                int i = this.m0;
                this.m0 = i + 1;
                n63 n63Var = (n63) arrayList.get(i);
                this.o0.add(n63Var);
                return n63Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
