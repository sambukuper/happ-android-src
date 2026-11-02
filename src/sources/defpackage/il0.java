package defpackage;

import android.view.Surface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class il0 implements AutoCloseable {
    public final Surface X;
    public final int Y;
    public final pv Z;
    public final /* synthetic */ jl0 f0;

    public il0(jl0 jl0Var, Surface surface) {
        surface.getClass();
        this.f0 = jl0Var;
        this.X = surface;
        qv qvVar = jl0.d;
        qvVar.getClass();
        this.Y = qv.b.incrementAndGet(qvVar);
        this.Z = nr4.e(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<or8> listY0;
        if (this.Z.a()) {
            jl0 jl0Var = this.f0;
            synchronized (jl0Var.a) {
                surface = this.X;
                Integer num = (Integer) jl0Var.b.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                jl0Var.b.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listY0 = wv0.Y0(jl0Var.c);
                    jl0Var.b.remove(surface);
                } else {
                    listY0 = null;
                }
            }
            if (listY0 != null) {
                for (or8 or8Var : listY0) {
                    or8Var.getClass();
                    surface.getClass();
                    synchronized (or8Var.e) {
                        try {
                            wg1 wg1Var = (wg1) or8Var.g.remove(surface);
                            if (wg1Var != null) {
                                if (hi5.i0("CXCP")) {
                                    wg1Var.toString();
                                }
                                or8Var.c.c0(wg1Var);
                                try {
                                    wg1Var.b();
                                } catch (IllegalStateException unused) {
                                    if (hi5.m0()) {
                                        surface.toString();
                                    }
                                }
                                or8Var.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.Y;
    }
}
