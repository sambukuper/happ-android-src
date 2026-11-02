package io.sentry.android.replay;

import defpackage.ea6;
import defpackage.fm7;
import io.sentry.g1;
import io.sentry.l4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements l4 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ea6 Y;

    public /* synthetic */ n(ea6 ea6Var, byte b) {
        this.X = b;
        this.Y = ea6Var;
    }

    @Override // io.sentry.l4
    public final void h(g1 g1Var) {
        byte b = this.X;
        ea6 ea6Var = this.Y;
        switch (b) {
            case 0:
                int i = ReplayIntegration.r0;
                g1Var.getClass();
                String strC = g1Var.C();
                ea6Var.X = strC != null ? fm7.K0('.', strC, strC) : null;
                break;
            default:
                g1Var.getClass();
                ea6Var.X = new ArrayList(g1Var.q());
                break;
        }
    }
}
