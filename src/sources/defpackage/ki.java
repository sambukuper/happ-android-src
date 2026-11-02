package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ki extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki(Object obj, Object obj2, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.h0 = obj;
        this.i0 = obj2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                ((ki) m(q51Var)).q(dn8Var);
                break;
            case 1:
                ((ki) m(q51Var)).q(dn8Var);
                break;
            case 2:
                ((ki) m(q51Var)).q(dn8Var);
                break;
            default:
                ((ki) m(q51Var)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.i0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                return new ki((oi) obj2, obj, q51Var, (byte) 0);
            case 1:
                return new ki((CameraDevice) obj2, (aa6) obj, q51Var, (byte) 1);
            case 2:
                return new ki((sn0) obj2, (nn0) obj, q51Var, (byte) 2);
            default:
                return new ki((sn0) obj2, (xm0) obj, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        switch (this.g0) {
            case 0:
                w39.n0(obj);
                oi oiVar = (oi) this.h0;
                oiVar.c();
                Object objB = oiVar.b(this.i0);
                oiVar.c.Y.setValue(objB);
                oiVar.e.setValue(objB);
                return dn8.a;
            case 1:
                w39.n0(obj);
                CameraDevice cameraDevice = (CameraDevice) this.h0;
                if (cameraDevice != null) {
                    cameraDevice.getId();
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                            break;
                        } catch (NullPointerException unused) {
                        }
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    } catch (Throwable th) {
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                        throw th;
                    }
                }
                ((aa6) this.i0).X = true;
                return dn8.a;
            case 2:
                w39.n0(obj);
                StringBuilder sb = new StringBuilder();
                sn0 sn0Var = (sn0) this.h0;
                sb.append(sn0Var);
                sb.append(" CameraCaptureSessionWrapper#close");
                String string = sb.toString();
                nn0 nn0Var = (nn0) this.i0;
                try {
                    Trace.beginSection(string);
                    Objects.toString(sn0Var);
                    p61.z(nn0Var.a);
                    return dn8.a;
                } finally {
                    Trace.endSection();
                }
            default:
                w39.n0(obj);
                StringBuilder sb2 = new StringBuilder();
                sn0 sn0Var2 = (sn0) this.h0;
                sb2.append(sn0Var2);
                sb2.append(" stopRepeating");
                String string2 = sb2.toString();
                xm0 xm0Var = (xm0) this.i0;
                try {
                    Trace.beginSection(string2);
                    sf0 sf0Var = (sf0) xm0Var.f0;
                    synchronized (sf0Var.i) {
                        sf0Var.toString();
                        sf0Var.a.A0();
                    }
                    Trace.endSection();
                    try {
                        Trace.beginSection(sn0Var2 + " abortCaptures");
                        xm0Var.a();
                        return dn8.a;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
