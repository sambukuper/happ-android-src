package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.inputmethod.BaseInputConnection;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.work.Worker;
import java.util.concurrent.Executor;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.feature.ui_settings.UISettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v38 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ v38(b8 b8Var, wj0 wj0Var) {
        this.X = (byte) 5;
        this.Y = wj0Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj = this.Y;
        switch (b) {
            case 0:
                w38 w38Var = (w38) obj;
                return w38Var.p0 ? p38.b(w38Var) : g38.b;
            case 1:
                a68 a68Var = (a68) obj;
                return new z85(bs7.b(a68Var.s0, a68Var.t0, a68Var.u0, ((pf3) a68Var.w0.getValue()).a));
            case 2:
                return new BaseInputConnection(((q78) obj).a, false);
            case 3:
                return new hf3(((lf3) obj).c());
            case 4:
                l88 l88Var = (l88) obj;
                l88Var.B0 = null;
                ch3.I(l88Var);
                nr4.E(l88Var);
                z68.W(l88Var);
                return Boolean.TRUE;
            case 5:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", -3);
                handlerThread.start();
                ((wj0) obj).a(uj0.Z, new fl6((Object) handlerThread, (byte) 14));
                return new Handler(handlerThread.getLooper());
            case 6:
                return (Executor) ((f98) obj).invoke();
            case 7:
                hb8 hb8Var = (hb8) obj;
                hb8Var.P0.B(Boolean.valueOf(!hb8Var.O0));
                return dn8Var;
            case 8:
                y5 y5Var = ((UISettingsActivity) obj).Q0;
                if (y5Var != null) {
                    return new pl8(y5Var);
                }
                dh3.T("binding");
                throw null;
            case 9:
                return Boolean.valueOf(((ik0) ((lr5) obj).Y).a().a(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 10:
                ((VectorPainter) obj).k0.setValue(dn8Var);
                return dn8Var;
            case 11:
                q12.a((l39) obj);
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((Worker) obj).e();
            default:
                jj0 jj0Var = ((u79) obj).a;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                key.getClass();
                Object objC = ((lf0) jj0Var).c(key);
                if (objC != null) {
                    return (StreamConfigurationMap) objC;
                }
                bt.i("Required value was null.");
                return null;
        }
    }

    public /* synthetic */ v38(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
