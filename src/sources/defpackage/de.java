package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class de implements bo8, dh0 {
    public final /* synthetic */ byte X = 0;
    public final Object Y;
    public final bo8 Z;

    public de(TotalCaptureResult totalCaptureResult, String str, te6 te6Var) {
        Map mapW;
        str.getClass();
        te6Var.getClass();
        this.Y = totalCaptureResult;
        this.Z = new ee(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                mapW = tc.m(totalCaptureResult);
                mapW.getClass();
            } else {
                mapW = i >= 28 ? en.w(totalCaptureResult) : e02.X;
            }
            if (mapW != null && !mapW.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(mapW.size());
                for (Map.Entry entry : mapW.entrySet()) {
                    String str2 = (String) entry.getKey();
                    vi0.a(str2);
                    arrayMap.put(new vi0(str2), new ee((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        switch (this.X) {
            case 0:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.Y;
                zu3Var.getClass();
                zb6 zb6Var = yb6.a;
                if (zu3Var.equals(zb6Var.b(CaptureResult.class)) || zu3Var.equals(zb6Var.b(TotalCaptureResult.class))) {
                    return totalCaptureResult;
                }
                return null;
            default:
                zu3Var.getClass();
                boolean zEquals = zu3Var.equals(yb6.a.b(de.class));
                de deVar = (de) this.Z;
                return zEquals ? deVar : deVar.C0(zu3Var);
        }
    }

    @Override // defpackage.dh0
    public d18 a() {
        return (d18) ((te6) this.Y).a(e18.a, d18.b);
    }

    @Override // defpackage.dh0
    public int b() {
        ee eeVarF = ((de) this.Z).f();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        eeVarF.getClass();
        CaptureResult captureResult = eeVarF.X;
        Integer num = (Integer) captureResult.get(key);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && hi5.i0("CXCP")) {
                    mm2.a(captureResult.getFrameNumber());
                }
                return 1;
            }
        }
        return i;
    }

    @Override // defpackage.dh0
    public ch0 c() {
        ee eeVarF = ((de) this.Z).f();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        eeVarF.getClass();
        CaptureResult captureResult = eeVarF.X;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return ch0.Y;
        }
        if (num != null && num.intValue() == 1) {
            return ch0.Z;
        }
        if (num != null && num.intValue() == 2) {
            return ch0.f0;
        }
        if (num != null && num.intValue() == 3) {
            return ch0.g0;
        }
        ch0 ch0Var = ch0.X;
        if (num != null && hi5.i0("CXCP")) {
            mm2.a(captureResult.getFrameNumber());
        }
        return ch0Var;
    }

    @Override // defpackage.dh0
    public ah0 d() {
        ee eeVarF = ((de) this.Z).f();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        eeVarF.getClass();
        CaptureResult captureResult = eeVarF.X;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return ah0.Y;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return ah0.Z;
        }
        if (num != null && num.intValue() == 4) {
            return ah0.f0;
        }
        if (num != null && num.intValue() == 2) {
            return ah0.g0;
        }
        if (num != null && num.intValue() == 3) {
            return ah0.h0;
        }
        ah0 ah0Var = ah0.X;
        if (num != null && hi5.i0("CXCP")) {
            mm2.a(captureResult.getFrameNumber());
        }
        return ah0Var;
    }

    @Override // defpackage.dh0
    public bh0 e() {
        ee eeVarF = ((de) this.Z).f();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        eeVarF.getClass();
        CaptureResult captureResult = eeVarF.X;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return bh0.Y;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return bh0.Z;
        }
        if (num != null && num.intValue() == 4) {
            return bh0.h0;
        }
        if (num != null && num.intValue() == 5) {
            return bh0.i0;
        }
        if (num != null && num.intValue() == 2) {
            return bh0.f0;
        }
        if (num != null && num.intValue() == 6) {
            return bh0.g0;
        }
        bh0 bh0Var = bh0.X;
        if (num != null && hi5.i0("CXCP")) {
            mm2.a(captureResult.getFrameNumber());
        }
        return bh0Var;
    }

    public ee f() {
        return (ee) this.Z;
    }

    @Override // defpackage.dh0
    public long getTimestamp() {
        ee eeVarF = ((de) this.Z).f();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        eeVarF.getClass();
        Object obj = eeVarF.X.get(key);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    public String toString() {
        switch (this.X) {
            case 0:
                StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
                ee eeVar = (ee) this.Z;
                sb.append((Object) vi0.b(eeVar.Y));
                sb.append(", frameNumber: ");
                sb.append(eeVar.X.getFrameNumber());
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public de(te6 te6Var, de deVar) {
        te6Var.getClass();
        this.Y = te6Var;
        this.Z = deVar;
    }
}
