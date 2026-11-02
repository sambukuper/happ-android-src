package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rn1 extends vj8 {
    public final /* synthetic */ mk2 B0;
    public final /* synthetic */ sn1 C0;

    public rn1(sn1 sn1Var, mk2 mk2Var) {
        this.C0 = sn1Var;
        this.B0 = mk2Var;
    }

    @Override // defpackage.vj8
    public final View W(int i) {
        mk2 mk2Var = this.B0;
        if (mk2Var.X()) {
            return mk2Var.W(i);
        }
        Dialog dialog = this.C0.o1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.vj8
    public final boolean X() {
        return this.B0.X() || this.C0.s1;
    }
}
