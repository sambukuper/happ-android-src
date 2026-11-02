package defpackage;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ev {
    public static final ev a = new ev();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v76 v76Var, v63 v63Var, s51 s51Var) {
        dv dvVar;
        if (s51Var instanceof dv) {
            dvVar = (dv) s51Var;
            int i = dvVar.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvVar.i0 = i - Integer.MIN_VALUE;
            } else {
                dvVar = new dv(this, s51Var);
            }
        } else {
            dvVar = new dv(this, s51Var);
        }
        Object objB = dvVar.g0;
        int i2 = dvVar.i0;
        if (i2 == 0) {
            w39.n0(objB);
            dvVar.f0 = v63Var;
            dvVar.i0 = 1;
            objB = v76Var.b(v63Var, dvVar);
            Object obj = c71.X;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v63Var = dvVar.f0;
            w39.n0(objB);
        }
        c73 c73Var = (c73) objB;
        if (c73Var instanceof jw7) {
            jw7 jw7Var = (jw7) c73Var;
            return new AsyncImagePainter$State$Success(wl7.m(jw7Var.a, v63Var.a), jw7Var);
        }
        if (!(c73Var instanceof m32)) {
            b61.c();
            return null;
        }
        m32 m32Var = (m32) c73Var;
        d53 d53Var = m32Var.a;
        return new AsyncImagePainter$State$Error(d53Var != null ? wl7.m(d53Var, v63Var.a) : null, m32Var);
    }
}
