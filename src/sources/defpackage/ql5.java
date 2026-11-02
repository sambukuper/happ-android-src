package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ql5 extends nl5 {
    public final jl5 g0;
    public Object h0;
    public boolean i0;
    public int j0;

    public ql5(jl5 jl5Var, kf8[] kf8VarArr) {
        super(jl5Var.Y, kf8VarArr);
        this.g0 = jl5Var;
        this.j0 = jl5Var.f0;
    }

    public final void f(int i, jf8 jf8Var, Object obj, int i2) {
        kf8[] kf8VarArr = (kf8[]) this.f0;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int iE = 1 << ys7.e(i, i3);
            if (jf8Var.h(iE)) {
                kf8VarArr[i2].a(jf8Var.d, Integer.bitCount(jf8Var.a) * 2, jf8Var.f(iE));
                this.Y = i2;
                return;
            } else {
                int iT = jf8Var.t(iE);
                jf8 jf8VarS = jf8Var.s(iT);
                kf8VarArr[i2].a(jf8Var.d, Integer.bitCount(jf8Var.a) * 2, iT);
                f(i, jf8VarS, obj, i2 + 1);
                return;
            }
        }
        kf8 kf8Var = kf8VarArr[i2];
        Object[] objArr = jf8Var.d;
        kf8Var.a(objArr, objArr.length, 0);
        while (true) {
            kf8 kf8Var2 = kf8VarArr[i2];
            if (dh3.f(kf8Var2.Y[kf8Var2.f0], obj)) {
                this.Y = i2;
                return;
            } else {
                kf8VarArr[i2].f0 += 2;
            }
        }
    }

    @Override // defpackage.nl5, java.util.Iterator
    public final Object next() {
        if (this.g0.f0 != this.j0) {
            bt.c();
            return null;
        }
        if (!this.Z) {
            bt.n();
            return null;
        }
        kf8 kf8Var = ((kf8[]) this.f0)[this.Y];
        this.h0 = kf8Var.Y[kf8Var.f0];
        this.i0 = true;
        return super.next();
    }

    @Override // defpackage.nl5, java.util.Iterator
    public final void remove() {
        if (!this.i0) {
            c2.g();
            return;
        }
        boolean z = this.Z;
        jl5 jl5Var = this.g0;
        if (!z) {
            ci8.f(jl5Var).remove(this.h0);
        } else {
            if (!z) {
                bt.n();
                return;
            }
            kf8 kf8Var = ((kf8[]) this.f0)[this.Y];
            Object obj = kf8Var.Y[kf8Var.f0];
            ci8.f(jl5Var).remove(this.h0);
            f(obj != null ? obj.hashCode() : 0, jl5Var.Y, obj, 0);
        }
        this.h0 = null;
        this.i0 = false;
        this.j0 = jl5Var.f0;
    }
}
