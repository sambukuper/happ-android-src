package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class nj4 implements j6, fa5 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nj4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Object obj) {
        Intent intent;
        String stringExtra;
        byte b = this.X;
        ComponentActivity componentActivity = this.Y;
        i6 i6Var = (i6) obj;
        switch (b) {
            case 0:
                int i = MainActivity.y1;
                i6Var.getClass();
                if (i6Var.X == -1) {
                    componentActivity.i0();
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                int i2 = MainActivity.y1;
                i6Var.getClass();
                if (i6Var.X == -1) {
                    jm4.Q(ys0.z(componentActivity.h()), (u61) null, new jy2(componentActivity, (q51) null, (byte) 11), 3);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                int i3 = MainActivity.y1;
                i6Var.getClass();
                if (i6Var.X == -1) {
                    jm4.Q(ys0.z(componentActivity.h()), (u61) null, new y9(componentActivity, (q51) null, (byte) 9), 3);
                }
                break;
            default:
                int i4 = MainActivity.y1;
                i6Var.getClass();
                if (i6Var.X == -1 && (intent = i6Var.Y) != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                    if (!cm4.a.d(stringExtra)) {
                        u84 u84VarZ = ys0.z(componentActivity.h());
                        nf1 nf1Var = tp1.a;
                        jm4.Q(u84VarZ, ye1.Z, new fk4(componentActivity, stringExtra, null, (byte) 5), 2);
                    } else {
                        ss8 ss8Var = ss8.a;
                        ss8.B(componentActivity, stringExtra);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(fb9 fb9Var) {
        jm4.Q(HappApplication.N0, (u61) null, new bv(fb9Var, this.Y, (q51) null, (byte) 7), 3);
    }
}
