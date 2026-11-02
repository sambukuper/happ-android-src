package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class zp extends sn1 {
    @Override // defpackage.sn1
    public Dialog T(Bundle bundle) {
        return new yp(k(), S());
    }

    @Override // defpackage.sn1
    public final void W(Dialog dialog, int i) {
        if (!(dialog instanceof yp)) {
            super.W(dialog, i);
            return;
        }
        yp ypVar = (yp) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        ypVar.g().f(1);
    }
}
