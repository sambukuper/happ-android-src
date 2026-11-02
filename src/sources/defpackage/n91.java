package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 {
    public final u06 A;
    public final u06 B;
    public final u06 C;
    public final u06 D;
    public final u06 E;
    public final u06 F;
    public final u06 G;
    public final u06 H;
    public final u06 I;
    public final jh0 a;
    public final xd6 b;
    public final l91 c;
    public final u06 d;
    public final u06 e;
    public final u06 f;
    public final u06 g;
    public final u06 h;
    public final u06 i;
    public final u06 j;
    public final u06 k;
    public final u06 l;
    public final u06 m;
    public final u06 n;
    public final u06 o;
    public final u06 p;
    public final u06 q;
    public final u06 r;
    public final u06 s;
    public final u06 t;
    public final u06 u;
    public final u06 v;
    public final u06 w;
    public final u06 x;
    public final u06 y;
    public final yr2 z = new yr2((byte) 23, false);

    /* JADX WARN: Multi-variable type inference failed */
    public n91(l91 l91Var, jh0 jh0Var, xd6 xd6Var) {
        this.c = l91Var;
        this.a = jh0Var;
        this.b = xd6Var;
        this.d = oi0.f(l91Var, this, 4);
        this.e = oi0.f(l91Var, this, 3);
        this.f = oi0.f(l91Var, this, 2);
        this.g = oi0.f(l91Var, this, 9);
        this.h = oi0.f(l91Var, this, 10);
        this.i = oi0.f(l91Var, this, 8);
        this.j = oi0.f(l91Var, this, 7);
        this.k = oi0.f(l91Var, this, 11);
        this.l = oi0.f(l91Var, this, 6);
        this.m = oi0.f(l91Var, this, 12);
        this.n = oi0.f(l91Var, this, 5);
        this.o = oi0.f(l91Var, this, 14);
        this.p = oi0.f(l91Var, this, 13);
        this.q = oi0.f(l91Var, this, 16);
        this.r = oi0.f(l91Var, this, 15);
        this.s = oi0.f(l91Var, this, 17);
        this.t = oi0.f(l91Var, this, 18);
        this.u = oi0.f(l91Var, this, 19);
        this.v = oi0.f(l91Var, this, 20);
        this.w = oi0.f(l91Var, this, 22);
        this.x = oi0.f(l91Var, this, 21);
        this.y = oi0.f(l91Var, this, 23);
        this.A = oi0.f(l91Var, this, 25);
        this.B = oi0.f(l91Var, this, 26);
        this.C = oi0.f(l91Var, this, 28);
        this.D = oi0.f(l91Var, this, 27);
        this.E = oi0.f(l91Var, this, 29);
        this.F = oi0.f(l91Var, this, 24);
        this.G = oi0.f(l91Var, this, 30);
        this.H = oi0.f(l91Var, this, 1);
        this.I = oi0.f(l91Var, this, 31);
        yr2.u(this.z, rs1.a(new m91(0 == true ? 1 : 0, 0 == true ? 1 : 0, l91Var, this)));
    }

    public final k28 a() {
        ik0 ik0Var = (ik0) this.j.get();
        ik0Var.getClass();
        i26 i26VarA = ik0Var.a();
        i26VarA.getClass();
        Iterator it = i26VarA.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                return new l28(i26VarA);
            }
        }
        if (!i26VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            return qe4.j0;
        }
        return new l28(i26VarA);
    }

    public final p79 b() {
        Range rangeE;
        qj0 qj0Var = (qj0) this.e.get();
        qj0Var.getClass();
        jj0 jj0Var = qj0Var.b;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = z45.X;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (hi5.m0()) {
                        Objects.toString(key);
                    }
                    key.getClass();
                    if (((lf0) jj0Var).c(key) == null) {
                        return new z45();
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (rangeE = b4.e(jj0Var)) != null) {
            return new fg(qj0Var, rangeE);
        }
        return new mj0(qj0Var);
    }
}
