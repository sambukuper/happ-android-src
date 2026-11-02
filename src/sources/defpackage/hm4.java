package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.app.ComponentActivity;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class hm4 implements zl8 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y42 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hm4(y42 y42Var, byte b) {
        this.X = b;
        this.Y = y42Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    public final void y(int i) {
        MainActivity mainActivity;
        vj4 vj4Var;
        rj6 rj6Var;
        vj4 vj4Var2;
        byte b = this.X;
        rj6 rj6Var2 = dn8.a;
        ho1 ho1Var = ho1.X;
        ho1 ho1Var2 = ho1.Y;
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
                jm4.Q(u84VarZ, ye1.Z, new bk4(mainActivity, guid, null, (byte) 1), 2);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                dw7 dw7Var2 = (dw7) y42Var.p;
                HappApplication happApplication = HappApplication.M0;
                Activity activity = (Activity) k32.i().L0.Y;
                if (activity == null) {
                    bt.q("Required value was null.");
                    return;
                }
                dw7Var2.getClass();
                pv7 pv7VarL2 = dw7Var2.l(i);
                if (pv7VarL2 == null) {
                    return;
                }
                try {
                    kw2 kw2Var = kw2.a;
                    String guid2 = pv7VarL2.a.getGuid();
                    guid2.getClass();
                    byte b2 = -1;
                    try {
                        String strK = kw2.k(guid2);
                        if (!TextUtils.isEmpty(strK)) {
                            ss8.E(activity, strK);
                            rj6Var = rj6Var2;
                            if (sj6.a(rj6Var) == null) {
                                b2 = 0;
                            }
                        }
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    vj4 vj4Var3 = dw7Var2.l;
                    if (b2 == 0) {
                        if (vj4Var3 != null) {
                            vj4.a(vj4Var3, ho1Var);
                        } else {
                            rj6Var2 = null;
                        }
                    } else if (vj4Var3 != null) {
                        vj4.a(vj4Var3, ho1Var2);
                    } else {
                        rj6Var2 = null;
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
                vj4.a(vj4Var, ho1Var2);
                return;
            default:
                dw7 dw7Var3 = (dw7) y42Var.p;
                dw7Var3.getClass();
                try {
                    pv7 pv7VarL3 = dw7Var3.l(i);
                    if (pv7VarL3 == null) {
                        return;
                    }
                    vj4 vj4Var4 = dw7Var3.l;
                    if (vj4Var4 != null) {
                        SnackbarHostActivity snackbarHostActivity = vj4Var4.a;
                        String guid3 = pv7VarL3.a.getGuid();
                        guid3.getClass();
                        kw2 kw2Var2 = kw2.a;
                        if (kw2.l(snackbarHostActivity, guid3) == 0) {
                            ra.n(snackbarHostActivity, snackbarHostActivity.n(), ho1Var, (Bitmap) null, 56);
                        } else {
                            ra.n(snackbarHostActivity, snackbarHostActivity.n(), ho1Var2, (Bitmap) null, 56);
                        }
                    } else {
                        rj6Var2 = null;
                    }
                    break;
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    rj6Var2 = new rj6(th3);
                }
                if (sj6.a(rj6Var2) == null || (vj4Var2 = dw7Var3.l) == null) {
                    return;
                }
                vj4.a(vj4Var2, ho1Var2);
                return;
        }
    }
}
