package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cx7 implements ed8, o66 {
    public final ww7 a;

    public cx7(ww7 ww7Var) {
        this.a = ww7Var;
    }

    @Override // defpackage.ed8
    public final Object a(dd8 dd8Var, rn2 rn2Var, uy7 uy7Var) {
        return e(dd8Var, rn2Var, uy7Var);
    }

    @Override // defpackage.o66
    public final qr6 b() {
        return this.a;
    }

    @Override // defpackage.ed8
    public final Object c(uy7 uy7Var) {
        return Boolean.valueOf(this.a.X.D());
    }

    @Override // defpackage.tq5
    public final Object d(String str, gn2 gn2Var, s51 s51Var) {
        gx7 gx7VarX0 = this.a.X0(str);
        try {
            Object objB = gn2Var.B(gx7VarX0);
            u15.h(gx7VarX0, null);
            return objB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(gx7VarX0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(dd8 dd8Var, rn2 rn2Var, s51 s51Var) throws Throwable {
        bx7 bx7Var;
        cx7 cx7Var;
        sm2 sm2Var;
        if (s51Var instanceof bx7) {
            bx7Var = (bx7) s51Var;
            int i = bx7Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                bx7Var.j0 = i - Integer.MIN_VALUE;
            } else {
                bx7Var = new bx7(this, s51Var);
            }
        } else {
            bx7Var = new bx7(this, s51Var);
        }
        Object obj = bx7Var.h0;
        int i2 = bx7Var.j0;
        if (i2 == 0) {
            w39.n0(obj);
            sm2 sm2Var2 = this.a.X;
            sm2Var2.D();
            int iOrdinal = dd8Var.ordinal();
            if (iOrdinal == 0) {
                SQLiteDatabase sQLiteDatabase = sm2Var2.X;
                g44 g44Var = sm2.g0;
                if (((Method) g44Var.getValue()) != null) {
                    g44 g44Var2 = sm2.f0;
                    if (((Method) g44Var2.getValue()) != null) {
                        Method method = (Method) g44Var.getValue();
                        method.getClass();
                        Method method2 = (Method) g44Var2.getValue();
                        method2.getClass();
                        Object objInvoke = method2.invoke(sQLiteDatabase, null);
                        if (objInvoke != null) {
                            method.invoke(objInvoke, 0, null, 0, null);
                        } else {
                            bt.i("Required value was null.");
                        }
                    } else {
                        sm2Var2.g();
                    }
                } else {
                    sm2Var2.g();
                }
            } else if (iOrdinal == 1) {
                sm2Var2.k();
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                sm2Var2.g();
            }
            try {
                Object vq5Var = new vq5(this, (byte) 1);
                bx7Var.f0 = this;
                bx7Var.g0 = sm2Var2;
                bx7Var.j0 = 1;
                Object objK = rn2Var.K(vq5Var, bx7Var);
                Object obj2 = c71.X;
                if (objK == obj2) {
                    return obj2;
                }
                cx7Var = this;
                sm2Var = sm2Var2;
                obj = objK;
            } catch (Throwable th) {
                th = th;
                cx7Var = this;
                sm2Var = sm2Var2;
                sm2Var.p();
                if (!sm2Var.D()) {
                    cx7Var.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sm2Var = bx7Var.g0;
            cx7Var = bx7Var.f0;
            try {
                w39.n0(obj);
            } catch (Throwable th2) {
                th = th2;
                sm2Var.p();
                if (!sm2Var.D()) {
                    cx7Var.getClass();
                }
                throw th;
            }
        }
        sm2Var.J();
        sm2Var.p();
        if (!sm2Var.D()) {
            cx7Var.getClass();
        }
        return obj;
    }
}
