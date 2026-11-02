package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class r70 extends zp {
    @Override // defpackage.zp, defpackage.sn1
    public final Dialog T(Bundle bundle) {
        Context contextK = k();
        int iS = S();
        if (iS == 0) {
            TypedValue typedValue = new TypedValue();
            iS = contextK.getTheme().resolveAttribute(u26.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : o56.Theme_Design_Light_BottomSheetDialog;
        }
        q70 q70Var = new q70(contextK, iS);
        q70Var.m0 = true;
        q70Var.n0 = true;
        q70Var.s0 = new o70(q70Var, (byte) 0);
        q70Var.g().f(1);
        TypedArray typedArrayObtainStyledAttributes = q70Var.getContext().getTheme().obtainStyledAttributes(new int[]{u26.enableEdgeToEdge});
        q70Var.q0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return q70Var;
    }

    public final void Y() {
        Dialog dialog = this.o1;
        if (dialog instanceof q70) {
            q70 q70Var = (q70) dialog;
            if (q70Var.i0 == null) {
                q70Var.j();
            }
            boolean z = q70Var.i0.J;
        }
        R(false, false);
    }
}
