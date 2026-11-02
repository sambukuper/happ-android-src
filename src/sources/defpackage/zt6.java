package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zt6 implements rs6 {
    public final Path X = new Path();
    public float Y;
    public float Z;

    public zt6(nv0 nv0Var) {
        if (nv0Var == null) {
            return;
        }
        nv0Var.x(this);
    }

    @Override // defpackage.rs6
    public final void a(float f, float f2, float f3, float f4) {
        this.X.quadTo(f, f2, f3, f4);
        this.Y = f3;
        this.Z = f4;
    }

    @Override // defpackage.rs6
    public final void b(float f, float f2) {
        this.X.moveTo(f, f2);
        this.Y = f;
        this.Z = f2;
    }

    @Override // defpackage.rs6
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.X.cubicTo(f, f2, f3, f4, f5, f6);
        this.Y = f5;
        this.Z = f6;
    }

    @Override // defpackage.rs6
    public final void close() {
        this.X.close();
    }

    @Override // defpackage.rs6
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        fu6.t(this.Y, this.Z, f, f2, f3, z, z2, f4, f5, this);
        this.Y = f4;
        this.Z = f5;
    }

    @Override // defpackage.rs6
    public final void e(float f, float f2) {
        this.X.lineTo(f, f2);
        this.Y = f;
        this.Z = f2;
    }
}
