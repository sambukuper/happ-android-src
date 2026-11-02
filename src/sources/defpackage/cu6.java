package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cu6 extends jb5 {
    public final /* synthetic */ byte l0;
    public float m0;
    public final float n0;
    public final /* synthetic */ fu6 o0;
    public final Object p0;

    public cu6(fu6 fu6Var, float f, float f2) {
        this.l0 = (byte) 1;
        this.o0 = fu6Var;
        this.p0 = new RectF();
        this.m0 = f;
        this.n0 = f2;
    }

    @Override // defpackage.jb5
    public final void K(String str) {
        String str2;
        byte b = this.l0;
        Object obj = this.p0;
        fu6 fu6Var = this.o0;
        switch (b) {
            case 0:
                if (fu6Var.E0()) {
                    Path path = new Path();
                    str2 = str;
                    ((du6) fu6Var.f0).d.getTextPath(str2, 0, str.length(), this.m0, this.n0, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.m0 = ((du6) fu6Var.f0).d.measureText(str2) + this.m0;
                break;
            default:
                if (fu6Var.E0()) {
                    Rect rect = new Rect();
                    ((du6) fu6Var.f0).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.m0, this.n0);
                    ((RectF) obj).union(rectF);
                }
                this.m0 = ((du6) fu6Var.f0).d.measureText(str) + this.m0;
                break;
        }
    }

    @Override // defpackage.jb5
    public final boolean r(rt6 rt6Var) {
        switch (this.l0) {
            case 0:
                return !(rt6Var instanceof st6);
            default:
                if (!(rt6Var instanceof st6)) {
                    return true;
                }
                et6 et6VarY = rt6Var.a.y(((st6) rt6Var).n);
                if (et6VarY == null) {
                    return false;
                }
                qs6 qs6Var = (qs6) et6VarY;
                zt6 zt6Var = new zt6(qs6Var.o);
                Matrix matrix = qs6Var.n;
                Path path = zt6Var.X;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.p0).union(rectF);
                return false;
        }
    }

    public cu6(fu6 fu6Var, float f, float f2, Path path) {
        this.l0 = (byte) 0;
        this.o0 = fu6Var;
        this.m0 = f;
        this.n0 = f2;
        this.p0 = path;
    }
}
