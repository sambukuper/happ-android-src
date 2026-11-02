package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vz0 implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ xz0 Y;
    public final /* synthetic */ AndroidComposeView Z;
    public final /* synthetic */ zy0 f0;

    public /* synthetic */ vz0(xz0 xz0Var, AndroidComposeView androidComposeView, zy0 zy0Var, int i) {
        this.Y = xz0Var;
        this.Z = androidComposeView;
        this.f0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        zy0 zy0Var = this.f0;
        AndroidComposeView androidComposeView = this.Z;
        xz0 xz0Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    lp2Var.W(866651995);
                    y01.a(androidComposeView, xz0Var.l, zy0Var, lp2Var, 0);
                    lp2Var.p(false);
                }
                break;
            default:
                num.getClass();
                xz0Var.a(androidComposeView, zy0Var, lp2Var, w79.P(1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ vz0(AndroidComposeView androidComposeView, xz0 xz0Var, zy0 zy0Var) {
        this.Z = androidComposeView;
        this.Y = xz0Var;
        this.f0 = zy0Var;
    }
}
