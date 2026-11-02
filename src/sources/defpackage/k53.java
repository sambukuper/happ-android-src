package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k53 extends hq8 {
    public static final i53 z = new i53();
    public final Object q;
    public m53 r;
    public Executor s;
    public zz2 t;
    public Rect u;
    public Matrix v;
    public b57 w;
    public v73 x;
    public c57 y;

    public k53(o53 o53Var) {
        super(o53Var);
        this.q = new Object();
    }

    @Override // defpackage.hq8
    public final iz A(iz izVar, iz izVar2) {
        Objects.toString(izVar);
        Objects.toString(izVar2);
        hi5.z0("ImageAnalysis");
        o53 o53Var = (o53) this.h;
        f();
        b57 b57VarI = I(o53Var, izVar);
        this.w = b57VarI;
        Object[] objArr = {b57VarI.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        return izVar;
    }

    @Override // defpackage.hq8
    public final void B() {
        s08.b();
        c57 c57Var = this.y;
        if (c57Var != null) {
            c57Var.b();
            this.y = null;
        }
        v73 v73Var = this.x;
        if (v73Var != null) {
            v73Var.a();
            this.x = null;
        }
        synchronized (this.q) {
            m53 m53Var = this.r;
            m53Var.w0 = false;
            m53Var.c();
            this.r = null;
        }
    }

    @Override // defpackage.hq8
    public final void C(Matrix matrix) {
        super.C(matrix);
        synchronized (this.q) {
            try {
                m53 m53Var = this.r;
                if (m53Var != null) {
                    m53Var.h(matrix);
                }
                this.v = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hq8
    public final void E(Rect rect) {
        this.k = rect;
        synchronized (this.q) {
            try {
                m53 m53Var = this.r;
                if (m53Var != null) {
                    m53Var.i(rect);
                }
                this.u = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    public final b57 I(o53 o53Var, iz izVar) {
        m53 m53Var;
        boolean z2;
        s08.b();
        Size size = izVar.a;
        Executor executor = (Executor) o53Var.a(e98.K, j03.a());
        executor.getClass();
        int iIntValue = ((Integer) ((o53) this.h).a(o53.Y, 0)).intValue() == 1 ? ((Integer) ((o53) this.h).a(o53.Z, 6)).intValue() : 4;
        z76 z76Var = null;
        if (o53Var.a(o53.f0, null) != null) {
            c2.m();
            return null;
        }
        z76 z76Var2 = new z76(z68.x(size.getWidth(), size.getHeight(), this.h.n(), iIntValue));
        synchronized (this.q) {
            K();
            m53Var = this.r;
        }
        if (d() != null) {
            cj0 cj0VarD = d();
            if (!((Boolean) ((o53) this.h).a(o53.i0, Boolean.FALSE)).booleanValue() || i(cj0VarD, false) % 180 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        int height = z2 ? size.getHeight() : size.getWidth();
        int width = z2 ? size.getWidth() : size.getHeight();
        int i = J() == 2 ? 1 : 35;
        boolean z3 = this.h.n() == 35 && J() == 2;
        boolean z4 = this.h.n() == 35 && J() == 3;
        boolean z5 = this.h.n() == 35 && (!(d() == null || i(d(), false) == 0) || Boolean.TRUE.equals((Boolean) ((o53) this.h).a(o53.h0, null)));
        if (z3 || (z5 && !z4)) {
            z76Var = new z76(z68.x(height, width, i, z76Var2.s()));
        }
        if (z76Var != null) {
            synchronized (m53Var.v0) {
                m53Var.j0 = z76Var;
            }
        }
        L();
        z76Var2.p(m53Var, executor);
        b57 b57VarD = b57.d(o53Var, izVar.a);
        l11 l11Var = izVar.f;
        if (l11Var != null) {
            b57VarD.b.d(l11Var);
        }
        v73 v73Var = this.x;
        if (v73Var != null) {
            v73Var.a();
        }
        v73 v73Var2 = new v73(z76Var2.getSurface(), size, this.h.n());
        this.x = v73Var2;
        vr3.P(v73Var2.e).a(new sc(z76Var2, z76Var, (byte) 26), km4.J());
        b57VarD.h = izVar.d;
        a(b57VarD, izVar);
        b57VarD.b(this.x, izVar.c, -1);
        c57 c57Var = this.y;
        if (c57Var != null) {
            c57Var.b();
        }
        c57 c57Var2 = new c57(new e53(this, m53Var, (byte) 0));
        this.y = c57Var2;
        b57VarD.f = c57Var2;
        return b57VarD;
    }

    public final int J() {
        return ((Integer) ((o53) this.h).a(o53.g0, 1)).intValue();
    }

    public final void K() {
        m53 n53Var;
        zz2 zz2Var;
        synchronized (this.q) {
            try {
                o53 o53Var = (o53) this.h;
                if (((Integer) o53Var.a(o53.Y, 0)).intValue() == 1) {
                    n53Var = new n53();
                    this.r = n53Var;
                } else {
                    r53 r53Var = new r53((Executor) o53Var.a(e98.K, j03.a()));
                    this.r = r53Var;
                    n53Var = r53Var;
                }
                n53Var.f0 = J();
                this.r.g0 = ((Boolean) ((o53) this.h).a(o53.i0, Boolean.FALSE)).booleanValue();
                cj0 cj0VarD = d();
                Boolean bool = (Boolean) ((o53) this.h).a(o53.h0, null);
                boolean zA = cj0VarD != null ? cj0VarD.s().s().a(OnePixelShiftQuirk.class) : false;
                m53 m53Var = this.r;
                if (bool != null) {
                    zA = bool.booleanValue();
                }
                m53Var.h0 = zA;
                if (cj0VarD != null) {
                    this.r.Y = i(cj0VarD, false);
                }
                Rect rect = this.u;
                if (rect != null) {
                    this.r.i(rect);
                }
                Matrix matrix = this.v;
                if (matrix != null) {
                    this.r.h(matrix);
                }
                Executor executor = this.s;
                if (executor != null && (zz2Var = this.t) != null) {
                    m53 m53Var2 = this.r;
                    synchronized (m53Var2.v0) {
                        m53Var2.X = zz2Var;
                        m53Var2.i0 = executor;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void L() {
        synchronized (this.q) {
            try {
                cj0 cj0VarD = d();
                if (cj0VarD != null) {
                    this.r.Y = i(cj0VarD, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hq8
    public final er8 g(boolean z2, hr8 hr8Var) {
        z.getClass();
        o53 o53Var = i53.a;
        l11 l11VarA = hr8Var.a(o53Var.s(), 1);
        if (z2) {
            l11VarA = l11.q(l11VarA, o53Var);
        }
        if (l11VarA == null) {
            return null;
        }
        return new o53(qd5.c(((h53) m(l11VarA)).Y));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(h());
    }

    @Override // defpackage.hq8
    public final er8 v(aj0 aj0Var, dr8 dr8Var) {
        synchronized (this.q) {
        }
        return dr8Var.d();
    }

    @Override // defpackage.hq8
    public final void w(int i) {
        if (D(i)) {
            L();
        }
    }

    @Override // defpackage.hq8
    public final iz z(l11 l11Var) {
        this.w.a(l11Var);
        Object[] objArr = {this.w.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        xy0 xy0VarB = this.i.b();
        xy0VarB.i0 = l11Var;
        return xy0VarB.b();
    }
}
