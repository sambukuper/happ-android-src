package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xx8 implements re6, DefaultLifecycleObserver {
    public final v76 X;
    public final v63 Y;
    public final lq2 Z;
    public final g94 f0;
    public final bm3 g0;

    public xx8(v76 v76Var, v63 v63Var, lq2 lq2Var, g94 g94Var, bm3 bm3Var) {
        this.X = v76Var;
        this.Y = v63Var;
        this.Z = lq2Var;
        this.f0 = g94Var;
        this.g0 = bm3Var;
    }

    @Override // defpackage.re6
    public final Object a(u76 u76Var) {
        g94 g94Var = this.f0;
        return g94Var != null ? w51.k(g94Var, u76Var) : dn8.a;
    }

    @Override // defpackage.re6
    public final void b() {
        lq2 lq2Var = this.Z;
        if (lq2Var.getView().isAttachedToWindow()) {
            return;
        }
        yx8 yx8VarD = bs7.d(lq2Var.getView());
        xx8 xx8Var = yx8VarD.Z;
        if (xx8Var != null) {
            g94 g94Var = xx8Var.f0;
            xx8Var.g0.m(null);
            lq2 lq2Var2 = xx8Var.Z;
            if (lq2Var2 != null && g94Var != null) {
                g94Var.f(lq2Var2);
            }
            if (g94Var != null) {
                g94Var.f(xx8Var);
            }
        }
        yx8VarD.Z = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(d94 d94Var) {
        yx8 yx8VarD = bs7.d(this.Z.getView());
        synchronized (yx8VarD) {
            try {
                og7 og7Var = yx8VarD.Y;
                q51 q51Var = null;
                if (og7Var != null) {
                    og7Var.m(null);
                }
                cs2 cs2Var = cs2.X;
                nf1 nf1Var = tp1.a;
                yx8VarD.Y = w51.G(cs2Var, dm4.a.h0, null, new l40((Object) yx8VarD, q51Var, (byte) 19), 2);
                yx8VarD.X = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.re6
    public final void start() {
        g94 g94Var = this.f0;
        if (g94Var != null) {
            g94Var.a(this);
        }
        lq2 lq2Var = this.Z;
        if (lq2Var != null && g94Var != null) {
            g94Var.f(lq2Var);
            g94Var.a(lq2Var);
        }
        yx8 yx8VarD = bs7.d(lq2Var.getView());
        xx8 xx8Var = yx8VarD.Z;
        if (xx8Var != null) {
            g94 g94Var2 = xx8Var.f0;
            xx8Var.g0.m(null);
            lq2 lq2Var2 = xx8Var.Z;
            if (lq2Var2 != null && g94Var2 != null) {
                g94Var2.f(lq2Var2);
            }
            if (g94Var2 != null) {
                g94Var2.f(xx8Var);
            }
        }
        yx8VarD.Z = this;
    }
}
