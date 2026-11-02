package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u31 implements ab7, ix4 {
    public long X;
    public ArrayList Y;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ab7
    public final Object a(q51 q51Var) throws Throwable {
        t31 t31Var;
        ea6 ea6Var;
        Throwable th;
        yo1 wo1Var;
        if (q51Var instanceof t31) {
            t31Var = (t31) q51Var;
            int i = t31Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                t31Var.i0 = i - Integer.MIN_VALUE;
            } else {
                t31Var = new t31(this, (s51) q51Var);
            }
        } else {
            t31Var = new t31(this, (s51) q51Var);
        }
        Object obj = t31Var.g0;
        int i2 = t31Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            if (q31.k(this.X)) {
                ea6 ea6Var2 = new ea6();
                try {
                    t31Var.f0 = ea6Var2;
                    t31Var.i0 = 1;
                    mm0 mm0Var = new mm0(1, mb6.H(t31Var));
                    mm0Var.s();
                    ea6Var2.X = mm0Var;
                    this.Y.add(mm0Var);
                    Object objQ = mm0Var.q();
                    c71 c71Var = c71.X;
                    if (objQ == c71Var) {
                        return c71Var;
                    }
                    ea6Var = ea6Var2;
                    ArrayList arrayList = this.Y;
                    ci8.d(arrayList).remove(ea6Var.X);
                } catch (Throwable th2) {
                    ea6Var = ea6Var2;
                    th = th2;
                    ArrayList arrayList2 = this.Y;
                    ci8.d(arrayList2).remove(ea6Var.X);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var = t31Var.f0;
            try {
                w39.n0(obj);
                ArrayList arrayList3 = this.Y;
                ci8.d(arrayList3).remove(ea6Var.X);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.Y;
                ci8.d(arrayList4).remove(ea6Var.X);
                throw th;
            }
        }
        long j = this.X;
        int iH = q31.h(j);
        yo1 wo1Var2 = xo1.a;
        if (iH != Integer.MAX_VALUE) {
            wo1.a(iH);
            wo1Var = new wo1(iH);
        } else {
            wo1Var = wo1Var2;
        }
        int iG = q31.g(j);
        if (iG != Integer.MAX_VALUE) {
            wo1.a(iG);
            wo1Var2 = new wo1(iG);
        }
        return new ta7(wo1Var, wo1Var2);
    }

    public final yr4 c(zr4 zr4Var, tr4 tr4Var, long j) {
        e(j);
        eo5 eo5VarO = tr4Var.o(j);
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 3));
    }

    public final void e(long j) {
        this.X = j;
        if (q31.k(j)) {
            return;
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return;
        }
        this.Y = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q51) it.next()).f(dn8.a);
        }
    }
}
