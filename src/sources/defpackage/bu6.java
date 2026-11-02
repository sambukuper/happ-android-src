package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class bu6 extends jb5 {
    public float l0;
    public float m0;
    public final /* synthetic */ fu6 n0;

    public bu6(fu6 fu6Var, float f, float f2) {
        this.n0 = fu6Var;
        this.l0 = f;
        this.m0 = f2;
    }

    @Override // defpackage.jb5
    public void K(String str) {
        fu6 fu6Var = this.n0;
        Canvas canvas = (Canvas) fu6Var.Y;
        if (fu6Var.E0()) {
            du6 du6Var = (du6) fu6Var.f0;
            if (du6Var.b) {
                canvas.drawText(str, this.l0, this.m0, du6Var.d);
            }
            du6 du6Var2 = (du6) fu6Var.f0;
            if (du6Var2.c) {
                canvas.drawText(str, this.l0, this.m0, du6Var2.e);
            }
        }
        this.l0 = ((du6) fu6Var.f0).d.measureText(str) + this.l0;
    }
}
