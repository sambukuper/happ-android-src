package defpackage;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z76 implements q63 {
    public int X;
    public boolean Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;
    public final Object i0;

    public z76(q63 q63Var) {
        this.Z = new Object();
        this.X = 0;
        this.Y = false;
        this.i0 = new p53(this, (byte) 1);
        this.f0 = q63Var;
        this.g0 = q63Var.getSurface();
    }

    @Override // defpackage.q63
    public int a() {
        int iA;
        synchronized (this.Z) {
            iA = ((q63) this.f0).a();
        }
        return iA;
    }

    @Override // defpackage.q63
    public int b() {
        int iB;
        synchronized (this.Z) {
            iB = ((q63) this.f0).b();
        }
        return iB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public Object c(s51 s51Var) throws Throwable {
        x76 x76Var;
        n12 n12Var;
        v63 v63Var = (v63) this.Z;
        int i = this.X;
        if (s51Var instanceof x76) {
            x76Var = (x76) s51Var;
            int i2 = x76Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x76Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                x76Var = new x76(this, s51Var);
            }
        } else {
            x76Var = new x76(this, s51Var);
        }
        x76 x76Var2 = x76Var;
        Object objD = x76Var2.g0;
        int i3 = x76Var2.i0;
        if (i3 == 0) {
            w39.n0(objD);
            n12 n12Var2 = (n12) ((List) this.g0).get(i);
            z76 z76Var = new z76(v63Var, (List) this.g0, i + 1, (v63) this.f0, (ta7) this.h0, (oy1) this.i0, this.Y);
            x76Var2.f0 = n12Var2;
            x76Var2.i0 = 1;
            objD = n12Var2.d(z76Var, x76Var2);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
            n12Var = n12Var2;
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n12Var = x76Var2.f0;
            w39.n0(objD);
        }
        c73 c73Var = (c73) objD;
        v63 request = c73Var.getRequest();
        if (request.a != v63Var.a) {
            om0.l("Interceptor '", n12Var, "' cannot modify the request's context.");
            return null;
        }
        if (request.b == a75.a) {
            om0.l("Interceptor '", n12Var, "' cannot set the request's data to null.");
            return null;
        }
        if (request.c != v63Var.c) {
            om0.l("Interceptor '", n12Var, "' cannot modify the request's target.");
            return null;
        }
        if (request.o == v63Var.o) {
            return c73Var;
        }
        om0.l("Interceptor '", n12Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        return null;
    }

    @Override // defpackage.q63
    public void close() {
        synchronized (this.Z) {
            try {
                Surface surface = (Surface) this.g0;
                if (surface != null) {
                    surface.release();
                }
                ((q63) this.f0).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q63
    public n63 d() {
        q53 q53Var;
        synchronized (this.Z) {
            n63 n63VarD = ((q63) this.f0).d();
            if (n63VarD != null) {
                this.X++;
                q53Var = new q53(n63VarD);
                q53Var.g((p53) this.i0);
            } else {
                q53Var = null;
            }
        }
        return q53Var;
    }

    @Override // defpackage.q63
    public int e() {
        int iE;
        synchronized (this.Z) {
            iE = ((q63) this.f0).e();
        }
        return iE;
    }

    public void f() {
        synchronized (this.Z) {
            try {
                this.Y = true;
                ((q63) this.f0).h();
                if (this.X == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q63
    public Surface getSurface() {
        Surface surface;
        synchronized (this.Z) {
            surface = ((q63) this.f0).getSurface();
        }
        return surface;
    }

    @Override // defpackage.q63
    public void h() {
        synchronized (this.Z) {
            ((q63) this.f0).h();
        }
    }

    @Override // defpackage.q63
    public void p(p63 p63Var, Executor executor) {
        synchronized (this.Z) {
            ((q63) this.f0).p(new jn0(this, p63Var, (byte) 12), executor);
        }
    }

    @Override // defpackage.q63
    public int s() {
        int iS;
        synchronized (this.Z) {
            iS = ((q63) this.f0).s();
        }
        return iS;
    }

    @Override // defpackage.q63
    public n63 v() {
        q53 q53Var;
        synchronized (this.Z) {
            n63 n63VarV = ((q63) this.f0).v();
            if (n63VarV != null) {
                this.X++;
                q53Var = new q53(n63VarV);
                q53Var.g((p53) this.i0);
            } else {
                q53Var = null;
            }
        }
        return q53Var;
    }

    public z76(v63 v63Var, List list, int i, v63 v63Var2, ta7 ta7Var, oy1 oy1Var, boolean z) {
        this.Z = v63Var;
        this.g0 = list;
        this.X = i;
        this.f0 = v63Var2;
        this.h0 = ta7Var;
        this.i0 = oy1Var;
        this.Y = z;
    }

    public z76(Object obj, gr3 gr3Var) {
        this.Z = obj;
        this.g0 = null;
        this.i0 = gr3Var;
    }
}
