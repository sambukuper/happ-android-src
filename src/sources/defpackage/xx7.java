package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xx7 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final iz g;
    public int h;
    public int i;
    public hy7 k;
    public wx7 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public xx7(int i, int i2, iz izVar, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = izVar;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new wx7(i2, izVar.a);
    }

    public final void a() {
        mb6.s("Edge is already closed.", !this.n);
    }

    public final void b() {
        s08.b();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final hy7 c(cj0 cj0Var, boolean z) {
        s08.b();
        a();
        iz izVar = this.g;
        Size size = izVar.a;
        px1 px1Var = izVar.c;
        byte b = 0;
        hy7 hy7Var = new hy7(size, cj0Var, z, px1Var, new sx7(this, b));
        try {
            v73 v73Var = hy7Var.k;
            wx7 wx7Var = this.l;
            if (wx7Var.g(v73Var, new tx7(wx7Var, b))) {
                vr3.P(wx7Var.e).a(new tg1((wg1) v73Var, (byte) 1), dp1.a());
            }
            this.k = hy7Var;
            e();
            return hy7Var;
        } catch (RuntimeException e) {
            hy7Var.c();
            throw e;
        } catch (ug1 e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        }
    }

    public final void d() {
        boolean z;
        s08.b();
        a();
        wx7 wx7Var = this.l;
        s08.b();
        if (wx7Var.p == null) {
            synchronized (wx7Var.a) {
                z = wx7Var.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new wx7(this.a, this.g.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        gy7 gy7Var;
        Executor executor;
        s08.b();
        mz mzVar = new mz(this.d, this.i, this.h, this.c, this.b, this.e);
        hy7 hy7Var = this.k;
        if (hy7Var != null) {
            synchronized (hy7Var.a) {
                hy7Var.l = mzVar;
                gy7Var = hy7Var.m;
                executor = hy7Var.n;
            }
            if (gy7Var != null && executor != null) {
                executor.execute(new dy7(gy7Var, mzVar, (byte) 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((d41) it.next()).accept(mzVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(hd8.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(hd8.e(matrix));
        sb.append(", isClosed=");
        sb.append(this.n);
        sb.append('}');
        return sb.toString();
    }
}
