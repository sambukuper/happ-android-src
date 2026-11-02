package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class au6 extends bu6 {
    public final Path o0;
    public final /* synthetic */ fu6 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au6(fu6 fu6Var, Path path, float f) {
        super(fu6Var, f, 0.0f);
        this.p0 = fu6Var;
        this.o0 = path;
    }

    @Override // defpackage.bu6, defpackage.jb5
    public final void K(String str) {
        fu6 fu6Var = this.p0;
        if (fu6Var.E0()) {
            du6 du6Var = (du6) fu6Var.f0;
            if (du6Var.b) {
                ((Canvas) fu6Var.Y).drawTextOnPath(str, this.o0, this.l0, this.m0, du6Var.d);
            }
            du6 du6Var2 = (du6) fu6Var.f0;
            if (du6Var2.c) {
                ((Canvas) fu6Var.Y).drawTextOnPath(str, this.o0, this.l0, this.m0, du6Var2.e);
            }
        }
        this.l0 = ((du6) fu6Var.f0).d.measureText(str) + this.l0;
    }
}
