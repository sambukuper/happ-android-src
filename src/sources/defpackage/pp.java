package defpackage;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pp implements k41, hu4 {
    public final /* synthetic */ wp X;

    public /* synthetic */ pp(wp wpVar) {
        this.X = wpVar;
    }

    @Override // defpackage.hu4
    public boolean N(nt4 nt4Var) {
        Window.Callback callback;
        if (nt4Var != nt4Var.k()) {
            return true;
        }
        wp wpVar = this.X;
        if (!wpVar.F0 || (callback = wpVar.n0.getCallback()) == null || wpVar.Q0) {
            return true;
        }
        callback.onMenuOpened(108, nt4Var);
        return true;
    }

    @Override // defpackage.hu4
    public void b(nt4 nt4Var, boolean z) {
        vp vpVar;
        nt4 nt4VarK = nt4Var.k();
        int i = 0;
        boolean z2 = nt4VarK != nt4Var;
        if (z2) {
            nt4Var = nt4VarK;
        }
        wp wpVar = this.X;
        vp[] vpVarArr = wpVar.L0;
        int length = vpVarArr != null ? vpVarArr.length : 0;
        while (true) {
            if (i < length) {
                vpVar = vpVarArr[i];
                if (vpVar != null && vpVar.h == nt4Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                vpVar = null;
                break;
            }
        }
        if (vpVar != null) {
            if (!z2) {
                wpVar.r(vpVar, z);
            } else {
                wpVar.p(vpVar.a, vpVar, nt4VarK);
                wpVar.r(vpVar, true);
            }
        }
    }
}
