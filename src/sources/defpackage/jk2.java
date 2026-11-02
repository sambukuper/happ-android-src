package defpackage;

import android.os.Bundle;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jk2 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ qk2 Y;

    public /* synthetic */ jk2(qk2 qk2Var, byte b) {
        this.X = b;
        this.Y = qk2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        qk2 qk2Var = this.Y;
        switch (b) {
            case 0:
                qk2Var.U0.a(n84.ON_STOP);
                break;
            case 1:
                qk2Var.S0.d(n84.ON_PAUSE);
                break;
            case 2:
                qk2Var.D();
                break;
            case 3:
                qk2Var.S0.d(n84.ON_DESTROY);
                break;
            case 4:
                qk2Var.H0 = true;
                break;
            case 5:
                qk2Var.B();
                break;
            case 6:
                qk2Var.E();
                break;
            case 7:
                qk2Var.S0.d(n84.ON_RESUME);
                break;
            case 8:
                qk2Var.U0.a(n84.ON_RESUME);
                break;
            case 9:
                qk2Var.U0.a(n84.ON_DESTROY);
                break;
            case 10:
                qk2Var.S0.d(n84.ON_STOP);
                break;
            case 11:
                qk2Var.A();
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                qk2Var.S0.d(n84.ON_CREATE);
                break;
            case 13:
                gm2 gm2Var = qk2Var.U0;
                gm2Var.h0.x(qk2Var.f0);
                qk2Var.f0 = null;
                break;
            case 14:
                qk2Var.U0.a(n84.ON_CREATE);
                break;
            case 15:
                qk2Var.H();
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                qk2Var.v();
                break;
            case 17:
                qk2Var.I(qk2Var.J0);
                break;
            case 18:
                qk2Var.G();
                break;
            case 19:
                qk2Var.S0.d(n84.ON_START);
                break;
            case 20:
                qk2Var.U0.a(n84.ON_START);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                qk2Var.x(qk2Var.w0.C0);
                break;
            default:
                qk2Var.U0.a(n84.ON_PAUSE);
                break;
        }
    }

    public /* synthetic */ jk2(qk2 qk2Var, Bundle bundle, byte b) {
        this.X = b;
        this.Y = qk2Var;
    }
}
