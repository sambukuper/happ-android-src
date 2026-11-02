package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cj4 implements me6 {
    public final /* synthetic */ dj4 X;

    public cj4(dj4 dj4Var) {
        this.X = dj4Var;
    }

    @Override // defpackage.me6
    public final void J(te6 te6Var, long j, de deVar) {
        if (Build.VERSION.SDK_INT >= 35) {
            dj4 dj4Var = this.X;
            if (dj4Var.c == null || !dj4Var.e) {
                return;
            }
            ee eeVar = (ee) deVar.Z;
            CaptureResult.Key key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
            key.getClass();
            eeVar.getClass();
            Integer num = (Integer) eeVar.X.get(key);
            if (num != null) {
                dj4Var.c(dj4Var.f, num.intValue() != 1 ? 0 : 1);
            }
        }
    }
}
