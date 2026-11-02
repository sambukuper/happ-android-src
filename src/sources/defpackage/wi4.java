package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wi4 extends do5 {
    public final /* synthetic */ byte Y;
    public final Object Z;

    public /* synthetic */ wi4(Object obj, byte b) {
        this.Y = b;
        this.Z = obj;
    }

    @Override // defpackage.do5
    public float a(w03 w03Var) {
        gn2 gn2Var;
        int iV0;
        of5 snapshotObserver;
        int iV1;
        switch (this.Y) {
            case 0:
                rn2 rn2Var = w03Var.a;
                if (rn2Var != null) {
                    return ((Number) rn2Var.K(this, Float.valueOf(Float.NaN))).floatValue();
                }
                vi4 vi4Var = (vi4) this.Z;
                if (vi4Var.q0) {
                    return Float.NaN;
                }
                ea6 ea6Var = new ea6();
                ea6Var.X = vi4Var;
                while (true) {
                    d7 d7Var = ((vi4) ea6Var.X).s0;
                    float f = (d7Var == null || (iV1 = eu.v0(w03Var, (w03[]) d7Var.c)) < 0) ? Float.NaN : ((float[]) d7Var.d)[iV1];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = ea6Var.X;
                    if (!zIsNaN) {
                        ((vi4) obj).a0(vi4Var.r0(), w03Var);
                        return w03Var.a(f, ((vi4) ea6Var.X).m0(), vi4Var.m0());
                    }
                    vi4 vi4Var2 = (vi4) obj;
                    rn2 rn2Var2 = vi4Var2.j0;
                    if (rn2Var2 != null && (gn2Var = vi4Var2.k0) != null && ((Boolean) gn2Var.B(w03Var)).booleanValue()) {
                        vi4 vi4Var3 = (vi4) ea6Var.X;
                        s05 s05Var = vi4Var3.m0;
                        if (s05Var == null) {
                            long[] jArr = uw6.a;
                            s05Var = new s05();
                            vi4Var3.m0 = s05Var;
                        }
                        Object objG = s05Var.g(w03Var);
                        if (objG == null) {
                            objG = new go5(vi4Var3.s0(), vi4Var3, w03Var);
                            s05Var.l(w03Var, objG);
                        }
                        go5 go5Var = (go5) objG;
                        go5Var.X = vi4Var3.s0();
                        mf5 mf5Var = vi4Var.r0().q0;
                        if (mf5Var != null && (snapshotObserver = mf5Var.getSnapshotObserver()) != null) {
                            snapshotObserver.a.c(go5Var, vi4.v0, new g00((Object) rn2Var2, (Object) ea6Var, (Object) w03Var, (byte) 11));
                        }
                        ((vi4) ea6Var.X).a0(vi4Var.r0(), w03Var);
                        d7 d7Var2 = ((vi4) ea6Var.X).s0;
                        float f2 = (d7Var2 == null || (iV0 = eu.v0(w03Var, (w03[]) d7Var2.c)) < 0) ? Float.NaN : ((float[]) d7Var2.d)[iV0];
                        if (!Float.isNaN(f2)) {
                            return w03Var.a(f2, ((vi4) ea6Var.X).m0(), vi4Var.m0());
                        }
                    }
                    vi4 vi4VarT0 = ((vi4) ea6Var.X).t0();
                    if (vi4VarT0 == null) {
                        ((vi4) ea6Var.X).a0(vi4Var.r0(), w03Var);
                        return Float.NaN;
                    }
                    ea6Var.X = vi4VarT0;
                }
                break;
            default:
                return super.a(w03Var);
        }
    }

    @Override // defpackage.do5
    public final z24 b() {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return ((vi4) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.fi1
    public final float b0() {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return ((vi4) obj).b0();
            default:
                return ((AndroidComposeView) obj).getDensity().b0();
        }
    }

    @Override // defpackage.do5
    public final int c() {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return ((vi4) obj).P();
            default:
                return ((AndroidComposeView) obj).getRoot().z();
        }
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return ((vi4) obj).getDensity();
            default:
                return ((AndroidComposeView) obj).getDensity().getDensity();
        }
    }
}
