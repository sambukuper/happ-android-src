package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.app.ComponentActivity;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class im4 implements zl8 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y42 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ im4(y42 y42Var, byte b) {
        this.X = b;
        this.Y = y42Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(int i) {
        MainActivity mainActivity;
        vj4 vj4Var;
        Bitmap rj6Var;
        byte b = this.X;
        Bitmap rj6Var2 = null;
        y42 y42Var = this.Y;
        switch (b) {
            case 0:
                dw7 dw7Var = (dw7) y42Var.p;
                pv7 pv7VarL = dw7Var.l(i);
                if (pv7VarL == null || (mainActivity = dw7Var.m) == null) {
                    return;
                }
                String guid = pv7VarL.a.getGuid();
                guid.getClass();
                u84 u84VarZ = ys0.z(((ComponentActivity) mainActivity).X);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new bv(mainActivity, guid, (q51) null, (byte) 8), 2);
                return;
            default:
                dw7 dw7Var2 = (dw7) y42Var.p;
                dw7Var2.getClass();
                try {
                    pv7 pv7VarL2 = dw7Var2.l(i);
                    if (pv7VarL2 == null) {
                        return;
                    }
                    vj4 vj4Var2 = dw7Var2.l;
                    if (vj4Var2 != null) {
                        ho1 ho1Var = ho1.Z;
                        kw2 kw2Var = kw2.a;
                        String guid2 = pv7VarL2.a.getGuid();
                        guid2.getClass();
                        try {
                            String strK = kw2.k(guid2);
                            if (!TextUtils.isEmpty(strK)) {
                                int i2 = a26.a;
                                rj6Var = a26.a(strK);
                                if (!(rj6Var instanceof rj6)) {
                                    rj6Var2 = rj6Var;
                                }
                                rj6Var2 = rj6Var2;
                            }
                        } catch (Throwable th) {
                            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                throw th;
                            }
                            rj6Var = new rj6(th);
                        }
                        SnackbarHostActivity snackbarHostActivity = vj4Var2.a;
                        ra.n(snackbarHostActivity, snackbarHostActivity.n(), ho1Var, rj6Var2, 48);
                        rj6Var2 = dn8.a;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                if (sj6.a(rj6Var2) == null || (vj4Var = dw7Var2.l) == null) {
                    return;
                }
                vj4.a(vj4Var, ho1.Y);
                return;
        }
    }
}
