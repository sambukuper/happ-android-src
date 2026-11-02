package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r25 extends x05 {
    public final x05 o;
    public boolean p;

    public r25(long j, id7 id7Var, gn2 gn2Var, gn2 gn2Var2, x05 x05Var) {
        super(j, id7Var, gn2Var, gn2Var2);
        this.o = x05Var;
        x05Var.k();
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.x05
    public final ys0 w() {
        r25 r25Var;
        x05 x05Var = this.o;
        if (x05Var.m || x05Var.c) {
            return new fd7(this);
        }
        t05 t05Var = this.h;
        long j = this.b;
        HashMap mapM = t05Var != null ? kd7.m(x05Var.g(), this, this.o.d()) : null;
        Object obj = kd7.c;
        synchronized (obj) {
            try {
                kd7.v(this);
                if (t05Var == null || t05Var.d == 0) {
                    r25Var = this;
                    r25Var.a();
                } else {
                    r25Var = this;
                    ys0 ys0VarZ = r25Var.z(this.o.g(), t05Var, mapM, this.o.d());
                    if (!ys0VarZ.equals(gd7.w0)) {
                        return ys0VarZ;
                    }
                    t05 t05VarX = r25Var.o.x();
                    if (t05VarX != null) {
                        t05VarX.j(t05Var);
                    } else {
                        r25Var.o.B(t05Var);
                        r25Var.h = null;
                    }
                }
                if (dh3.l(r25Var.o.g(), j) < 0) {
                    r25Var.o.v();
                }
                x05 x05Var2 = r25Var.o;
                x05Var2.r(x05Var2.d().b(j).a(r25Var.j));
                r25Var.o.A(j);
                x05 x05Var3 = r25Var.o;
                int i = r25Var.d;
                r25Var.d = -1;
                if (i >= 0) {
                    int[] iArr = x05Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    x05Var3.k = iArrCopyOf;
                } else {
                    x05Var3.getClass();
                }
                x05 x05Var4 = r25Var.o;
                id7 id7Var = r25Var.j;
                x05Var4.getClass();
                synchronized (obj) {
                    x05Var4.j = x05Var4.j.e(id7Var);
                    x05 x05Var5 = r25Var.o;
                    int[] iArr2 = r25Var.k;
                    x05Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = x05Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        x05Var5.k = iArr2;
                    }
                }
                r25Var.m = true;
                if (!r25Var.p) {
                    r25Var.p = true;
                    r25Var.o.l();
                }
                return gd7.w0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
