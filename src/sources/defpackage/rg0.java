package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ rg0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Object obj = this.g0;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                ((ol0) obj4).a.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                break;
            case 1:
                ((ol0) obj4).a.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                break;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) obj4;
                s39 s39Var = (s39) obj3;
                List list = (List) obj2;
                xy0 xy0Var = (xy0) obj;
                n49 n49VarX = workDatabase.x();
                String str = s39Var.a;
                n49VarX.getClass();
                str.getClass();
                if (!((Boolean) u15.G(n49VarX.a, true, false, new nm7(str, (byte) 13))).booleanValue()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((xw6) it.next()).d(s39Var.a);
                    }
                    ax6.b(xy0Var, workDatabase, list);
                    break;
                }
                break;
            default:
                b98 b98Var = (b98) obj4;
                Surface surface = (Surface) obj3;
                ud0 ud0Var = (ud0) obj2;
                hy7 hy7Var = (hy7) obj;
                hi5.z0("TextureViewImpl");
                mf1 mf1Var = b98Var.l;
                if (mf1Var != null) {
                    mf1Var.c();
                    b98Var.l = null;
                }
                surface.release();
                if (b98Var.g == ud0Var) {
                    b98Var.g = null;
                }
                if (b98Var.h == hy7Var) {
                    b98Var.h = null;
                }
                break;
        }
    }
}
