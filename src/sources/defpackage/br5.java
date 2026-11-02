package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class br5 implements ed8, o66 {
    public final e21 a;
    public final boolean b;
    public final kt c = new kt();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public br5(e21 e21Var, boolean z) {
        this.a = e21Var;
        this.b = z;
    }

    @Override // defpackage.ed8
    public final Object a(dd8 dd8Var, rn2 rn2Var, uy7 uy7Var) {
        if (this.d.get()) {
            nr4.T(21, "Connection is recycled");
            throw null;
        }
        s61 s61Var = uy7Var.Y;
        s61Var.getClass();
        s11 s11Var = (s11) s61Var.H0(s11.Y);
        if (s11Var != null && s11Var.X == this) {
            return g(dd8Var, rn2Var, uy7Var);
        }
        nr4.T(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.o66
    public final qr6 b() {
        return this.a;
    }

    @Override // defpackage.ed8
    public final Object c(uy7 uy7Var) {
        if (this.d.get()) {
            nr4.T(21, "Connection is recycled");
            throw null;
        }
        s61 s61Var = uy7Var.Y;
        s61Var.getClass();
        s11 s11Var = (s11) s61Var.H0(s11.Y);
        if (s11Var != null && s11Var.X == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        nr4.T(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.tq5
    public final Object d(String str, gn2 gn2Var, s51 s51Var) {
        ar5 ar5Var;
        e21 e21Var;
        if (s51Var instanceof ar5) {
            ar5Var = (ar5) s51Var;
            int i = ar5Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ar5Var.l0 = i - Integer.MIN_VALUE;
            } else {
                ar5Var = new ar5(this, s51Var);
            }
        } else {
            ar5Var = new ar5(this, s51Var);
        }
        Object obj = ar5Var.j0;
        int i2 = ar5Var.l0;
        if (i2 == 0) {
            w39.n0(obj);
            if (this.d.get()) {
                nr4.T(21, "Connection is recycled");
                throw null;
            }
            s61 s61Var = ar5Var.Y;
            s61Var.getClass();
            s11 s11Var = (s11) s61Var.H0(s11.Y);
            if (s11Var == null || s11Var.X != this) {
                nr4.T(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            ar5Var.f0 = this;
            ar5Var.g0 = str;
            ar5Var.h0 = gn2Var;
            e21Var = this.a;
            ar5Var.i0 = e21Var;
            ar5Var.l0 = 1;
            Object objG = e21Var.Y.g(ar5Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e21 e21Var2 = ar5Var.i0;
            gn2Var = ar5Var.h0;
            str = ar5Var.g0;
            br5 br5Var = ar5Var.f0;
            w39.n0(obj);
            e21Var = e21Var2;
            this = br5Var;
        }
        try {
            uq5 uq5Var = new uq5(this, this.a.X0(str));
            try {
                Object objB = gn2Var.B(uq5Var);
                u15.h(uq5Var, null);
                e21Var.m(null);
                return objB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(uq5Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            e21Var.m(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(dd8 dd8Var, s51 s51Var) {
        xq5 xq5Var;
        e21 e21Var;
        if (s51Var instanceof xq5) {
            xq5Var = (xq5) s51Var;
            int i = xq5Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                xq5Var.k0 = i - Integer.MIN_VALUE;
            } else {
                xq5Var = new xq5(this, s51Var);
            }
        } else {
            xq5Var = new xq5(this, s51Var);
        }
        Object obj = xq5Var.i0;
        int i2 = xq5Var.k0;
        if (i2 == 0) {
            w39.n0(obj);
            xq5Var.f0 = this;
            xq5Var.g0 = dd8Var;
            e21Var = this.a;
            xq5Var.h0 = e21Var;
            xq5Var.k0 = 1;
            Object objG = e21Var.Y.g(xq5Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e21 e21Var2 = xq5Var.h0;
            dd8Var = xq5Var.g0;
            br5 br5Var = xq5Var.f0;
            w39.n0(obj);
            e21Var = e21Var2;
            this = br5Var;
        }
        try {
            kt ktVar = this.c;
            e21 e21Var3 = this.a;
            int i3 = ktVar.Z;
            if (ktVar.isEmpty()) {
                int iOrdinal = dd8Var.ordinal();
                if (iOrdinal == 0) {
                    nr4.r(e21Var3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    nr4.r(e21Var3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new b55();
                    }
                    nr4.r(e21Var3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                nr4.r(e21Var3, "SAVEPOINT '" + i3 + '\'');
            }
            ktVar.addLast(new wq5(i3));
            dn8 dn8Var = dn8.a;
            e21Var.m(null);
            return dn8Var;
        } catch (Throwable th) {
            e21Var.m(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z, s51 s51Var) {
        yq5 yq5Var;
        e21 e21Var;
        if (s51Var instanceof yq5) {
            yq5Var = (yq5) s51Var;
            int i = yq5Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                yq5Var.k0 = i - Integer.MIN_VALUE;
            } else {
                yq5Var = new yq5(this, s51Var);
            }
        } else {
            yq5Var = new yq5(this, s51Var);
        }
        Object obj = yq5Var.i0;
        int i2 = yq5Var.k0;
        if (i2 == 0) {
            w39.n0(obj);
            yq5Var.f0 = this;
            e21Var = this.a;
            yq5Var.g0 = e21Var;
            yq5Var.h0 = z;
            yq5Var.k0 = 1;
            Object objG = e21Var.Y.g(yq5Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = yq5Var.h0;
            e21 e21Var2 = yq5Var.g0;
            br5 br5Var = yq5Var.f0;
            w39.n0(obj);
            e21Var = e21Var2;
            this = br5Var;
        }
        try {
            kt ktVar = this.c;
            e21 e21Var3 = this.a;
            if (ktVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            wq5 wq5Var = (wq5) bw0.j0(ktVar);
            if (z) {
                wq5Var.getClass();
                if (ktVar.isEmpty()) {
                    nr4.r(e21Var3, "END TRANSACTION");
                } else {
                    nr4.r(e21Var3, "RELEASE SAVEPOINT '" + wq5Var.a + '\'');
                }
            } else if (ktVar.isEmpty()) {
                nr4.r(e21Var3, "ROLLBACK TRANSACTION");
            } else {
                nr4.r(e21Var3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + wq5Var.a + '\'');
            }
            dn8 dn8Var = dn8.a;
            e21Var.m(null);
            return dn8Var;
        } catch (Throwable th) {
            e21Var.m(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    public final Object g(dd8 dd8Var, rn2 rn2Var, s51 s51Var) throws Throwable {
        zq5 zq5Var;
        SQLException e;
        Throwable th;
        ?? r10;
        br5 br5Var;
        if (s51Var instanceof zq5) {
            zq5Var = (zq5) s51Var;
            int i = zq5Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq5Var.k0 = i - Integer.MIN_VALUE;
            } else {
                zq5Var = new zq5(this, s51Var);
            }
        } else {
            zq5Var = new zq5(this, s51Var);
        }
        Object objK = zq5Var.i0;
        int i2 = zq5Var.k0;
        byte b = 0;
        boolean z = true;
        c71 c71Var = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(objK);
                if (dd8Var == null) {
                    dd8Var = dd8.X;
                }
                zq5Var.f0 = this;
                zq5Var.g0 = (Serializable) rn2Var;
                zq5Var.k0 = 1;
                Object objE = e(dd8Var, zq5Var);
                this = this;
                if (objE != c71Var) {
                }
                return c71Var;
            }
            if (i2 == 1) {
                rn2Var = (rn2) zq5Var.g0;
                br5 br5Var2 = (br5) zq5Var.f0;
                w39.n0(objK);
                r10 = br5Var2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        Object obj = zq5Var.f0;
                        w39.n0(objK);
                        return obj;
                    }
                    if (i2 != 5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) zq5Var.g0;
                    th = (Throwable) zq5Var.f0;
                    try {
                        w39.n0(objK);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        gv3.g(th, e);
                        throw th;
                    }
                }
                z = zq5Var.h0;
                br5 br5Var3 = (br5) zq5Var.f0;
                w39.n0(objK);
                br5Var = br5Var3;
            }
            zq5Var.f0 = objK;
            zq5Var.k0 = 3;
            this = br5Var.f(z, zq5Var);
            if (this != c71Var) {
                return c71Var;
            }
            return objK;
            vq5 vq5Var = new vq5(r10, b);
            zq5Var.f0 = r10;
            zq5Var.g0 = null;
            zq5Var.h0 = true;
            zq5Var.k0 = 2;
            objK = rn2Var.K(vq5Var, zq5Var);
            br5Var = r10;
            if (objK != c71Var) {
                zq5Var.f0 = objK;
                zq5Var.k0 = 3;
                this = br5Var.f(z, zq5Var);
                if (this != c71Var) {
                    return objK;
                }
            }
            return c71Var;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    zq5Var.f0 = th;
                    zq5Var.g0 = th3;
                    zq5Var.k0 = 5;
                    if (this.f(false, zq5Var) != c71Var) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    gv3.g(th, e);
                    throw th;
                }
            }
        }
    }
}
