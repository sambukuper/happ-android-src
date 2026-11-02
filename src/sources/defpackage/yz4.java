package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class yz4 extends qc4 {
    public final void k(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == qc4.k;
            this.f = obj;
        }
        if (z) {
            ys ysVarY = ys.y();
            xb xbVar = this.j;
            kg1 kg1Var = ysVarY.a;
            if (kg1Var.c == null) {
                synchronized (kg1Var.a) {
                    try {
                        if (kg1Var.c == null) {
                            kg1Var.c = kg1.y(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            kg1Var.c.post(xbVar);
        }
    }
}
