package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends View.DragShadowBuilder {
    public final ii1 a;
    public final long b;
    public final gn2 c;

    public hz0(ii1 ii1Var, long j, gn2 gn2Var) {
        this.a = ii1Var;
        this.b = j;
        this.c = gn2Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        um0 um0Var = new um0();
        Canvas canvas2 = fb.a;
        eb ebVar = new eb();
        ebVar.a = canvas;
        tm0 tm0Var = um0Var.X;
        fi1 fi1Var = tm0Var.a;
        z24 z24Var = tm0Var.b;
        sm0 sm0Var = tm0Var.c;
        long j = tm0Var.d;
        tm0Var.a = this.a;
        tm0Var.b = z24.X;
        tm0Var.c = ebVar;
        tm0Var.d = this.b;
        ebVar.g();
        this.c.B(um0Var);
        ebVar.p();
        tm0Var.a = fi1Var;
        tm0Var.b = z24Var;
        tm0Var.c = sm0Var;
        tm0Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        ii1 ii1Var = this.a;
        point.set(ii1Var.x0(fIntBitsToFloat / ii1Var.getDensity()), ii1Var.x0(Float.intBitsToFloat((int) (j & 4294967295L)) / ii1Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
