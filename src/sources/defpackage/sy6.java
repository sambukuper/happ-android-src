package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sy6 {
    public ny6 a;
    public td b;
    public he2 c;
    public sd5 d;
    public boolean e;
    public z47 f;
    public final my6 g;
    public final ly6 h;
    public boolean i;
    public byte j = 1;
    public xx6 k = iy6.a;
    public final ry6 l = new ry6(this);
    public final t16 m = new t16((Object) this, (byte) 13);

    public sy6(ny6 ny6Var, td tdVar, he2 he2Var, sd5 sd5Var, boolean z, z47 z47Var, my6 my6Var, ly6 ly6Var) {
        this.a = ny6Var;
        this.b = tdVar;
        this.c = he2Var;
        this.d = sd5Var;
        this.e = z;
        this.f = z47Var;
        this.g = my6Var;
        this.h = ly6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, s51 s51Var) throws Throwable {
        py6 py6Var;
        sy6 sy6Var;
        Throwable th;
        da6 da6Var;
        if (s51Var instanceof py6) {
            py6Var = (py6) s51Var;
            int i = py6Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                py6Var.i0 = i - Integer.MIN_VALUE;
            } else {
                py6Var = new py6(this, s51Var);
            }
        } else {
            py6Var = new py6(this, s51Var);
        }
        Object obj = py6Var.g0;
        int i2 = py6Var.i0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            da6Var = py6Var.f0;
            try {
                w39.n0(obj);
                sy6Var = this;
                sy6Var.i = false;
                return new tu8(da6Var.X);
            } catch (Throwable th2) {
                th = th2;
                sy6Var = this;
                sy6Var.i = false;
                throw th;
            }
        }
        w39.n0(obj);
        da6 da6Var2 = new da6();
        da6Var2.X = j;
        this.i = true;
        try {
            f15 f15Var = f15.X;
            sy6Var = this;
            try {
                qy6 qy6Var = new qy6(sy6Var, da6Var2, j, null);
                py6Var.f0 = da6Var2;
                py6Var.i0 = 1;
                Object objG = sy6Var.g(f15Var, qy6Var, py6Var);
                c71 c71Var = c71.X;
                if (objG == c71Var) {
                    return c71Var;
                }
                da6Var = da6Var2;
                sy6Var.i = false;
                return new tu8(da6Var.X);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                sy6Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            sy6Var = this;
        }
    }

    public final boolean b() {
        td tdVar;
        return this.a.m() || this.a.j() || ((tdVar = this.b) != null && tdVar.e());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object c(long j, boolean z, uy7 uy7Var) {
        int i;
        long jA;
        eo4 eo4Var;
        td tdVar;
        c71 c71Var;
        Object objQ;
        dn8 dn8Var = dn8.a;
        if (z) {
            he2 he2Var = this.c;
            ey6 ey6Var = iy6.a;
            if (!(he2Var instanceof pe1)) {
                if (this.d == sd5.Y) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = tu8.a(j, 0.0f, 0.0f, i);
                eo4Var = new eo4(this, (q51) null);
                tdVar = this.b;
                c71Var = c71.X;
                if (tdVar == null && b()) {
                    Object objB = tdVar.b(jA, eo4Var, uy7Var);
                    if (objB == c71Var) {
                        return objB;
                    }
                } else {
                    eo4 eo4Var2 = new eo4((sy6) eo4Var.k0, uy7Var);
                    eo4Var2.j0 = jA;
                    objQ = eo4Var2.q(dn8Var);
                    if (objQ == c71Var) {
                        return objQ;
                    }
                }
            }
        } else {
            if (this.d == sd5.Y) {
                i = 1;
            } else {
                i = 2;
            }
            jA = tu8.a(j, 0.0f, 0.0f, i);
            eo4Var = new eo4(this, (q51) null);
            tdVar = this.b;
            c71Var = c71.X;
            if (tdVar == null) {
                eo4 eo4Var3 = new eo4((sy6) eo4Var.k0, uy7Var);
                eo4Var3.j0 = jA;
                objQ = eo4Var3.q(dn8Var);
                if (objQ == c71Var) {
                    return objQ;
                }
            } else {
                eo4 eo4Var4 = new eo4((sy6) eo4Var.k0, uy7Var);
                eo4Var4.j0 = jA;
                objQ = eo4Var4.q(dn8Var);
                if (objQ == c71Var) {
                    return objQ;
                }
            }
        }
        return dn8Var;
    }

    public final long d(xx6 xx6Var, long j, int i) {
        z25 z25Var = (z25) this.f.Y;
        z25 z25VarZ0 = z25Var != null ? z25Var.Z0() : null;
        long jN = z25VarZ0 != null ? z25VarZ0.N(i, j) : 0L;
        long jE = z85.e(j, jN);
        long jF = f(i(xx6Var.a(h(f(this.d == sd5.Y ? z85.a(0.0f, 1, jE) : z85.a(0.0f, 2, jE))))));
        my6 my6Var = this.g;
        if (my6Var.p0) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) yn0.a0(my6Var)).getViewTreeObserver();
            try {
                Method declaredMethod = AndroidComposeView.O1;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.O1 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jE2 = z85.e(jE, jF);
        z25 z25Var2 = (z25) this.f.Y;
        z25 z25VarZ1 = z25Var2 != null ? z25Var2.Z0() : null;
        return z85.f(z85.f(jN, jF), z25VarZ1 != null ? z25VarZ1.s0(i, jF, jE2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? z85.g(-1.0f, j) : j;
    }

    public final Object g(f15 f15Var, rn2 rn2Var, s51 s51Var) {
        Object objI = this.a.i(f15Var, new qk4((Object) this, (Object) rn2Var, (q51) null, (byte) 17), s51Var);
        return objI == c71.X ? objI : dn8.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == sd5.Y ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == sd5.Y) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        sd5 sd5Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (sd5Var == sd5.X) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (sd5Var == sd5.Y) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
