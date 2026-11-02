package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lv4 extends hq8 {
    public final qj0 q;
    public final wp1 r;
    public final Size s;
    public final Object t;
    public c57 u;
    public v73 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    public lv4(qj0 qj0Var, kv4 kv4Var, wp1 wp1Var) {
        Size[] outputSizes;
        Size[] sizeArr;
        super(kv4Var);
        qj0Var.getClass();
        wp1Var.getClass();
        this.q = qj0Var;
        this.r = wp1Var;
        Size size = nv4.a;
        jj0 jj0Var = qj0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) jj0Var).c(key);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            hi5.j0();
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = ix7.a;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) um1.a().b(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (ix7.b.compare(size4, ix7.a) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length == 0) {
                hi5.m0();
            } else {
                outputSizes = sizeArr;
            }
            if (outputSizes.length > 1) {
                mv4 mv4Var = new mv4((byte) 0);
                if (outputSizes.length > 1) {
                    Arrays.sort(outputSizes, mv4Var);
                }
            }
            Size sizeC = wp1Var.c();
            long jMin = Math.min(307200L, ((long) sizeC.getWidth()) * ((long) sizeC.getHeight()));
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Size size5 = outputSizes[i];
                    long width = ((long) size5.getWidth()) * ((long) size5.getHeight());
                    if (width == jMin) {
                        size = size5;
                    } else if (width <= jMin) {
                        i++;
                        size2 = size5;
                    } else if (size2 != null) {
                        size = size2;
                    }
                }
                if (size2 == null) {
                    size = outputSizes[0];
                } else {
                    size = size2;
                }
            }
        }
        this.s = size;
        this.t = new Object();
    }

    @Override // defpackage.hq8
    public final iz A(iz izVar, iz izVar2) {
        Size size = this.s;
        G(i21.K(J(size).c()));
        xy0 xy0VarB = izVar.b();
        xy0VarB.Y = size;
        return xy0VarB.b();
    }

    @Override // defpackage.hq8
    public final void B() {
        c57 c57Var = this.u;
        if (c57Var != null) {
            c57Var.b();
        }
        this.u = null;
        synchronized (this.t) {
            try {
                v73 v73Var = this.v;
                if (v73Var != null) {
                    v73Var.a();
                }
                this.v = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v73 I(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        v73 v73Var = this.v;
        if (v73Var != null) {
            v73Var.a();
        }
        v73 v73Var2 = new v73(surface, size, this.h.n());
        this.v = v73Var2;
        vr3.P(v73Var2.e).a(new sc4(surface, surfaceTexture, (byte) 4), dp1.a());
        return v73Var2;
    }

    public final b57 J(Size size) {
        v73 v73VarI;
        synchronized (this.t) {
            v73VarI = I(size);
        }
        c57 c57Var = this.u;
        if (c57Var != null) {
            c57Var.b();
        }
        c57 c57Var2 = new c57(new e53(this, size, (byte) 1));
        this.u = c57Var2;
        b57 b57VarD = b57.d(new kv4(), size);
        b57VarD.b.Y = 1;
        b57VarD.b(v73VarI, px1.d, -1);
        b57VarD.f = c57Var2;
        return b57VarD;
    }

    @Override // defpackage.hq8
    public final er8 g(boolean z, hr8 hr8Var) {
        hr8Var.getClass();
        this.q.getClass();
        this.r.getClass();
        return new kv4();
    }

    @Override // defpackage.hq8
    public final dr8 m(l11 l11Var) {
        l11Var.getClass();
        this.q.getClass();
        this.r.getClass();
        return new k42();
    }
}
