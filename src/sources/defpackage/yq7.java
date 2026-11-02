package defpackage;

import android.content.Context;
import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yq7 implements ze2 {
    public final /* synthetic */ dn2 X;
    public final /* synthetic */ tn2 Y;
    public final /* synthetic */ ky2 Z;
    public final /* synthetic */ Context f0;
    public final /* synthetic */ rn2 g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yq7(dn2 dn2Var, tn2 tn2Var, ky2 ky2Var, Context context, rn2 rn2Var) {
        this.X = dn2Var;
        this.Y = tn2Var;
        this.Z = ky2Var;
        this.f0 = context;
        this.g0 = rn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object l(Object obj, q51 q51Var) {
        xq7 xq7Var = (xq7) obj;
        boolean z = xq7Var instanceof tq7;
        dn2 dn2Var = this.X;
        dn8 dn8Var = dn8.a;
        if (z) {
            tq7 tq7Var = (tq7) xq7Var;
            this.Y.F(tq7Var.a, tq7Var.b, tq7Var.c, tq7Var.d);
            dn2Var.invoke();
            return dn8Var;
        }
        boolean z2 = xq7Var instanceof uq7;
        c71 c71Var = c71.X;
        Context context = this.f0;
        ky2 ky2Var = this.Z;
        if (z2) {
            String string = context.getString(y46.toast_failure);
            string.getClass();
            Object objC = ky2Var.c(new by2(string, my2.Y), q51Var);
            if (objC == c71Var) {
                return objC;
            }
        } else {
            if (!(xq7Var instanceof vq7)) {
                if (!(xq7Var instanceof wq7)) {
                    b61.c();
                    return null;
                }
                wq7 wq7Var = (wq7) xq7Var;
                this.g0.K(new SubId(wq7Var.a), Boolean.valueOf(wq7Var.b));
                dn2Var.invoke();
                return dn8Var;
            }
            String string2 = context.getString(y46.toast_success);
            string2.getClass();
            Object objC2 = ky2Var.c(new by2(string2, my2.X), q51Var);
            if (objC2 == c71Var) {
                return objC2;
            }
        }
        return dn8Var;
    }
}
