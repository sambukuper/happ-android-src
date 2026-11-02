package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk implements Choreographer.FrameCallback {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ Object Y;

    public /* synthetic */ kk(c1 c1Var) {
        this.Y = c1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((c1) obj).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? en.g(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new kp((Context) obj, (byte) 1), new Random().nextInt(Math.max(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, 1)) + 5000);
                break;
        }
    }
}
