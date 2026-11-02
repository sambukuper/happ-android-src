package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n59 {
    public static final n59 b;
    public bz1 a;

    static {
        n59 n59Var = new n59();
        n59Var.a = null;
        b = n59Var;
    }

    public static bz1 a(Context context) {
        bz1 bz1Var;
        n59 n59Var = b;
        synchronized (n59Var) {
            try {
                bz1Var = n59Var.a;
                if (bz1Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bz1Var = new bz1(context, (byte) 1);
                    n59Var.a = bz1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bz1Var;
    }
}
