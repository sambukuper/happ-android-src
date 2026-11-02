package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fb {
    public static final Canvas a = new Canvas();

    public static final eb a(je jeVar) {
        eb ebVar = new eb();
        ebVar.a = new Canvas(ue3.c(jeVar));
        return ebVar;
    }

    public static final Canvas b(sm0 sm0Var) {
        sm0Var.getClass();
        return ((eb) sm0Var).a;
    }
}
