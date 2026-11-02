package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hv2 extends u61 implements kh1 {
    public final Handler Z;
    public final String f0;
    public final boolean g0;
    public final hv2 h0;

    public hv2(Handler handler, String str, boolean z) {
        this.Z = handler;
        this.f0 = str;
        this.g0 = z;
        this.h0 = z ? this : new hv2(handler, str, true);
    }

    @Override // defpackage.kh1
    public final gq1 X(long j, final Runnable runnable, s61 s61Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.Z.postDelayed(runnable, j)) {
            return new gq1() { // from class: gv2
                @Override // defpackage.gq1
                public final void a() {
                    this.X.Z.removeCallbacks(runnable);
                }
            };
        }
        d1(s61Var, runnable);
        return t55.X;
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        if (this.Z.post(runnable)) {
            return;
        }
        d1(s61Var, runnable);
    }

    @Override // defpackage.u61
    public final boolean b1(s61 s61Var) {
        return (this.g0 && dh3.f(Looper.myLooper(), this.Z.getLooper())) ? false : true;
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        z51.r(i);
        return this;
    }

    public final void d1(s61 s61Var, Runnable runnable) {
        u70.x(s61Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        nf1 nf1Var = tp1.a;
        ye1.Z.Z0(s61Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hv2)) {
            return false;
        }
        hv2 hv2Var = (hv2) obj;
        return hv2Var.Z == this.Z && hv2Var.g0 == this.g0;
    }

    public final int hashCode() {
        return (this.g0 ? 1231 : 1237) ^ System.identityHashCode(this.Z);
    }

    @Override // defpackage.u61
    public final String toString() {
        hv2 hv2Var;
        String str;
        nf1 nf1Var = tp1.a;
        hv2 hv2Var2 = dm4.a;
        if (this == hv2Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                hv2Var = hv2Var2.h0;
            } catch (UnsupportedOperationException unused) {
                hv2Var = null;
            }
            str = this == hv2Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f0;
        if (string == null) {
            string = this.Z.toString();
        }
        return this.g0 ? pc6.o(string, ".immediate") : string;
    }

    @Override // defpackage.kh1
    public final void u0(long j, mm0 mm0Var) {
        sc scVar = new sc(mm0Var, this, (byte) 25);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.Z.postDelayed(scVar, j)) {
            mm0Var.u(new p0(this, scVar, (byte) 26));
        } else {
            d1(mm0Var.g0, scVar);
        }
    }

    public hv2(Handler handler) {
        this(handler, null, false);
    }
}
