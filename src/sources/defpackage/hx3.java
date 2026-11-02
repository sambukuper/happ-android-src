package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hx3 extends jx4 implements gx3 {
    public gn2 q0;
    public gn2 r0;

    @Override // defpackage.gx3
    public final boolean F(KeyEvent keyEvent) {
        gn2 gn2Var = this.q0;
        if (gn2Var != null) {
            return ((Boolean) gn2Var.B(new cx3(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.gx3
    public final boolean l(KeyEvent keyEvent) {
        gn2 gn2Var = this.r0;
        if (gn2Var != null) {
            return ((Boolean) gn2Var.B(new cx3(keyEvent))).booleanValue();
        }
        return false;
    }
}
