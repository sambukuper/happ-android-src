package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xt6 implements rs6 {
    public final ArrayList X;
    public float Y;
    public float Z;
    public yt6 f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public boolean j0;

    public xt6(fu6 fu6Var, nv0 nv0Var) {
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.f0 = null;
        this.g0 = false;
        this.h0 = true;
        this.i0 = -1;
        if (nv0Var == null) {
            return;
        }
        nv0Var.x(this);
        if (this.j0) {
            this.f0.b((yt6) arrayList.get(this.i0));
            arrayList.set(this.i0, this.f0);
            this.j0 = false;
        }
        yt6 yt6Var = this.f0;
        if (yt6Var != null) {
            arrayList.add(yt6Var);
        }
    }

    @Override // defpackage.rs6
    public final void a(float f, float f2, float f3, float f4) {
        this.f0.a(f, f2);
        this.X.add(this.f0);
        this.f0 = new yt6(f3, f4, f3 - f, f4 - f2);
        this.j0 = false;
    }

    @Override // defpackage.rs6
    public final void b(float f, float f2) {
        boolean z = this.j0;
        ArrayList arrayList = this.X;
        if (z) {
            this.f0.b((yt6) arrayList.get(this.i0));
            arrayList.set(this.i0, this.f0);
            this.j0 = false;
        }
        yt6 yt6Var = this.f0;
        if (yt6Var != null) {
            arrayList.add(yt6Var);
        }
        this.Y = f;
        this.Z = f2;
        this.f0 = new yt6(f, f2, 0.0f, 0.0f);
        this.i0 = arrayList.size();
    }

    @Override // defpackage.rs6
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.h0 || this.g0) {
            this.f0.a(f, f2);
            this.X.add(this.f0);
            this.g0 = false;
        }
        this.f0 = new yt6(f5, f6, f5 - f3, f6 - f4);
        this.j0 = false;
    }

    @Override // defpackage.rs6
    public final void close() {
        this.X.add(this.f0);
        e(this.Y, this.Z);
        this.j0 = true;
    }

    @Override // defpackage.rs6
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.g0 = true;
        this.h0 = false;
        yt6 yt6Var = this.f0;
        fu6.t(yt6Var.a, yt6Var.b, f, f2, f3, z, z2, f4, f5, this);
        this.h0 = true;
        this.j0 = false;
    }

    @Override // defpackage.rs6
    public final void e(float f, float f2) {
        this.f0.a(f, f2);
        this.X.add(this.f0);
        yt6 yt6Var = this.f0;
        this.f0 = new yt6(f, f2, f - yt6Var.a, f2 - yt6Var.b);
        this.j0 = false;
    }
}
