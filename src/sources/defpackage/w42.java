package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import su.happ.proxyutility.ui.foundation.component.HappEditText;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class w42 implements f91 {
    public final v5 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w42(v5 v5Var) {
        v5Var.getClass();
        this.X = v5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        RecyclerView recyclerView = this.X.p0;
        recyclerView.getClass();
        l lVarI = recyclerView.I(0);
        i52 i52Var = lVarI instanceof i52 ? (i52) lVarI : null;
        if (i52Var == null) {
            return false;
        }
        return ((HappEditText) ((zz2) i52Var.v.Y).Z).requestFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        v5 v5Var = this.X;
        v5Var.n0.setFocusableInTouchMode(true);
        v5Var.m0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        v5 v5Var = this.X;
        AppCompatEditText appCompatEditText = v5Var.n0;
        appCompatEditText.getClass();
        x97.U(appCompatEditText, new f52(this, (byte) 0));
        AppCompatImageButton appCompatImageButton = v5Var.m0;
        appCompatImageButton.getClass();
        x97.U(appCompatImageButton, new f52(this, (byte) 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
