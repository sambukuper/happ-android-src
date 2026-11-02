package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y32 implements me6 {
    public final /* synthetic */ ux0 X;

    public y32(ux0 ux0Var) {
        this.X = ux0Var;
    }

    @Override // defpackage.me6
    public final void Y(te6 te6Var, long j, de deVar) {
        ee eeVar = (ee) deVar.Z;
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        eeVar.getClass();
        Integer num = (Integer) eeVar.X.get(key);
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
        key2.getClass();
        eeVar.getClass();
        Integer num2 = (Integer) eeVar.X.get(key2);
        ux0 ux0Var = this.X;
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != 0) {
                return;
            }
            ux0Var.V(0);
            return;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
            ux0Var.V(0);
        }
    }
}
