package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ky2 {
    public final q15 a = r15.a();
    public final rh5 b = z51.H((Object) null);
    public final rh5 c = z51.H(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(by2 by2Var) {
        this.b.setValue(by2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(by2 by2Var, q51 q51Var) {
        iy2 iy2Var;
        o15 o15Var;
        Throwable th;
        o15 o15Var2;
        if (q51Var instanceof iy2) {
            iy2Var = (iy2) q51Var;
            int i = iy2Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                iy2Var.j0 = i - Integer.MIN_VALUE;
            } else {
                iy2Var = new iy2(this, q51Var);
            }
        } else {
            iy2Var = new iy2(this, q51Var);
        }
        Object obj = iy2Var.h0;
        int i2 = iy2Var.j0;
        c71 c71Var = c71.X;
        try {
            try {
                if (i2 == 0) {
                    w39.n0(obj);
                    iy2Var.f0 = by2Var;
                    o15Var = this.a;
                    iy2Var.g0 = o15Var;
                    iy2Var.j0 = 1;
                    if (o15Var.g(iy2Var) != c71Var) {
                    }
                    return c71Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o15Var2 = iy2Var.g0;
                    try {
                        w39.n0(obj);
                    } catch (CancellationException unused) {
                    } catch (Throwable th2) {
                        th = th2;
                        a(null);
                        b(true);
                        throw th;
                    }
                    a(null);
                    b(true);
                    dn8 dn8Var = dn8.a;
                    o15Var2.m((Object) null);
                    return dn8Var;
                }
                o15 o15Var3 = iy2Var.g0;
                by2 by2Var2 = iy2Var.f0;
                w39.n0(obj);
                o15Var = o15Var3;
                by2Var = by2Var2;
                a(by2Var);
                b(false);
                jy2 jy2Var = new jy2(this, (q51) null, (byte) 0);
                iy2Var.f0 = null;
                iy2Var.g0 = o15Var;
                iy2Var.j0 = 2;
                if (gv3.n(jy2Var, iy2Var) != c71Var) {
                    o15Var2 = o15Var;
                    a(null);
                    b(true);
                    dn8 dn8Var2 = dn8.a;
                    o15Var2.m((Object) null);
                    return dn8Var2;
                }
                return c71Var;
            } catch (CancellationException unused2) {
                o15Var2 = o15Var;
            } catch (Throwable th3) {
                th = th3;
                a(null);
                b(true);
                throw th;
            }
        } catch (Throwable th4) {
            by2Var.m((Object) null);
            throw th4;
        }
    }
}
