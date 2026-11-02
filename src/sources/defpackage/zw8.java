package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zw8 {
    public static final g55 a = new g55((byte) 28);

    public static final tu0 a(xw8 xw8Var) {
        tu0 tu0Var;
        xw8Var.getClass();
        synchronized (a) {
            tu0Var = (tu0) xw8Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (tu0Var == null) {
                s61 s61Var = b02.X;
                try {
                    nf1 nf1Var = tp1.a;
                    s61Var = dm4.a.h0;
                } catch (g65 | IllegalStateException unused) {
                }
                tu0 tu0Var2 = new tu0(s61Var.B0(pw7.b()));
                xw8Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", tu0Var2);
                tu0Var = tu0Var2;
            }
        }
        return tu0Var;
    }
}
