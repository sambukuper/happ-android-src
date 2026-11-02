package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p53 implements xj2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ p53(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.xj2
    public final void c(yj2 yj2Var) {
        g18 g18Var;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                r53 r53Var = (r53) ((WeakReference) ((q53) obj).g0).get();
                if (r53Var != null) {
                    r53Var.x0.execute(new c1(r53Var, (byte) 22));
                    return;
                }
                return;
            default:
                z76 z76Var = (z76) obj;
                synchronized (z76Var.Z) {
                    try {
                        int i = z76Var.X - 1;
                        z76Var.X = i;
                        if (z76Var.Y && i == 0) {
                            z76Var.close();
                        }
                        g18Var = (g18) z76Var.h0;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (g18Var != null) {
                    g18Var.c(yj2Var);
                    return;
                }
                return;
        }
    }
}
