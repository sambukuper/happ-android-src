package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yy2 implements gn2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ be7 Y;
    public final /* synthetic */ y05 Z;
    public final /* synthetic */ y05 f0;

    public yy2(boolean z, be7 be7Var, y05 y05Var, y05 y05Var2) {
        this.X = z;
        this.Y = be7Var;
        this.Z = y05Var;
        this.f0 = y05Var2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        boolean z;
        KeyEvent keyEvent = ((cx3) obj).a;
        keyEvent.getClass();
        if (this.X && ((Boolean) this.Z.getValue()).booleanValue() && ax3.a(pu.d(keyEvent.getKeyCode()), ax3.h)) {
            if (w39.S(keyEvent) == 2) {
                this.f0.setValue(Boolean.TRUE);
                be7 be7Var = this.Y;
                if (be7Var != null) {
                    ((ai1) be7Var).a();
                }
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
