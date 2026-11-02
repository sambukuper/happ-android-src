package defpackage;

import android.content.ClipData;
import android.view.DragEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d58 implements xt1 {
    public final /* synthetic */ t48 X;
    public final /* synthetic */ u48 Y;
    public final /* synthetic */ t48 Z;
    public final /* synthetic */ t48 f0;
    public final /* synthetic */ t48 g0;
    public final /* synthetic */ t48 h0;

    public d58(t48 t48Var, u48 u48Var, t48 t48Var2, t48 t48Var3, t48 t48Var4, t48 t48Var5) {
        this.X = t48Var;
        this.Y = u48Var;
        this.Z = t48Var2;
        this.f0 = t48Var3;
        this.g0 = t48Var4;
        this.h0 = t48Var5;
    }

    @Override // defpackage.xt1
    public final void C(pt1 pt1Var) {
        this.h0.B(pt1Var);
    }

    @Override // defpackage.xt1
    public final boolean K0(pt1 pt1Var) {
        String string;
        this.X.B(pt1Var);
        DragEvent dragEvent = pt1Var.a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        y48 y48Var = this.Y.Y;
        y48Var.d1();
        y48Var.u0.b();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        pu.w(y48Var);
        if (string != null) {
            kd8.h(y48Var.s0, string, false, false, 30);
        }
        return true;
    }

    @Override // defpackage.xt1
    public final void j0(pt1 pt1Var) {
        this.g0.B(pt1Var);
    }

    @Override // defpackage.xt1
    public final void s(pt1 pt1Var) {
        this.Z.B(pt1Var);
    }

    @Override // defpackage.xt1
    public final void t0(pt1 pt1Var) {
        DragEvent dragEvent = pt1Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        y48 y48Var = this.f0.Y;
        y24 y24VarB = y48Var.t0.b();
        if (y24VarB != null && y24VarB.g()) {
            jFloatToRawIntBits = y24VarB.p(jFloatToRawIntBits);
        }
        int iD = y48Var.t0.d(jFloatToRawIntBits, true);
        if (iD >= 0) {
            y48Var.s0.j(ct7.c(iD, iD));
        }
        y48Var.u0.B(ev2.X, jFloatToRawIntBits);
    }

    @Override // defpackage.xt1
    public final void r0(pt1 pt1Var) {
    }
}
