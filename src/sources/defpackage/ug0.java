package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.m;
import io.sentry.android.replay.d0;
import io.sentry.protocol.w;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ ug0(ol0 ol0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.Z = ol0Var;
        this.f0 = cameraCaptureSession;
        this.g0 = captureRequest;
        this.h0 = surface;
        this.Y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Object obj = this.h0;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                long j = this.Y;
                ((ol0) obj4).a.onCaptureBufferLost((CameraCaptureSession) obj3, (CaptureRequest) obj2, (Surface) obj, j);
                break;
            default:
                m mVar = (m) obj4;
                w wVar = (w) obj3;
                d0 d0Var = (d0) obj2;
                gn2 gn2Var = (gn2) obj;
                Date date = (Date) mVar.j.a(c.u[1], mVar);
                if (date != null) {
                    gn2Var.B(c.c(mVar, this.Y - date.getTime(), date, wVar, mVar.e(), d0Var.b, d0Var.a, d0Var.e, d0Var.f));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ug0(m mVar, long j, w wVar, d0 d0Var, gn2 gn2Var) {
        this.Z = mVar;
        this.Y = j;
        this.f0 = wVar;
        this.g0 = d0Var;
        this.h0 = gn2Var;
    }
}
