package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ug4 implements ze2 {
    public final /* synthetic */ Context X;
    public final /* synthetic */ ky2 Y;
    public final /* synthetic */ Resources Z;
    public final /* synthetic */ Activity f0;
    public final /* synthetic */ ng4 g0;
    public final /* synthetic */ j74 h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ug4(Context context, ky2 ky2Var, Resources resources, Activity activity, ng4 ng4Var, j74 j74Var) {
        this.X = context;
        this.Y = ky2Var;
        this.Z = resources;
        this.f0 = activity;
        this.g0 = ng4Var;
        this.h0 = j74Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    public final Object l(Object obj, q51 q51Var) {
        Object objF;
        j2 j2Var;
        tg4 tg4Var = (tg4) obj;
        boolean z = tg4Var instanceof og4;
        c71 c71Var = c71.X;
        Resources resources = this.Z;
        ky2 ky2Var = this.Y;
        dn8 dn8Var = dn8.a;
        if (z) {
            ss8 ss8Var = ss8.a;
            ss8.E(this.X, ((og4) tg4Var).a);
            String string = resources.getString(y46.toast_copied_to_clipboard);
            string.getClass();
            Object objC = ky2Var.c(new by2(string, my2.X), q51Var);
            if (objC == c71Var) {
                return objC;
            }
        } else if (tg4Var instanceof qg4) {
            Object objB = jb5.B(this.f0, resources, ky2Var, ((qg4) tg4Var).a, q51Var);
            if (objB == c71Var) {
                return objB;
            }
        } else if (tg4Var instanceof rg4) {
            String string2 = resources.getString(y46.logs_view_warning_encrypted);
            string2.getClass();
            Object objC2 = ky2Var.c(new by2(string2, my2.Z), q51Var);
            if (objC2 == c71Var) {
                return objC2;
            }
        } else if (tg4Var instanceof sg4) {
            String string3 = resources.getString(y46.toast_failure);
            string3.getClass();
            Object objC3 = ky2Var.c(new by2(string3, my2.Y), q51Var);
            if (objC3 == c71Var) {
                return objC3;
            }
        } else {
            if (!(tg4Var instanceof pg4)) {
                b61.c();
                return null;
            }
            ng4 ng4Var = this.g0;
            lg4 lg4Var = ng4Var instanceof lg4 ? (lg4) ng4Var : null;
            if (lg4Var == null || (j2Var = lg4Var.e) == null) {
                objF = dn8Var;
            } else {
                objF = j74.f(this.h0, j2Var.a() - 1, q51Var);
                if (objF != c71Var) {
                    objF = dn8Var;
                }
            }
            if (objF == c71Var) {
                return objF;
            }
        }
        return dn8Var;
    }
}
