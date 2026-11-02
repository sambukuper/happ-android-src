package defpackage;

import android.widget.LinearLayout;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import su.happ.proxyutility.ui.foundation.component.HappInputField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class k81 implements f91 {
    public final fu6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k81(fu6 fu6Var) {
        fu6Var.getClass();
        this.X = fu6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        fu6 fu6Var = this.X;
        ((HappInputField) fu6Var.f0).setFocusableInTouchMode(zY);
        ((LinearLayout) fu6Var.g0).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        fu6 fu6Var = this.X;
        x97.U((HappInputField) fu6Var.f0, new i81(this, (byte) 0));
        x97.U((TextProcessor) fu6Var.Z, new j81(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
