package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class np implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wp Y;

    public /* synthetic */ np(wp wpVar, byte b) {
        this.X = b;
        this.Y = wpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.X;
        wp wpVar = this.Y;
        switch (b) {
            case 0:
                if ((wpVar.Z0 & 1) != 0) {
                    wpVar.u(0);
                }
                if ((wpVar.Z0 & 4096) != 0) {
                    wpVar.u(108);
                }
                wpVar.Y0 = false;
                wpVar.Z0 = 0;
                break;
            default:
                wpVar.x0.showAtLocation(wpVar.w0, 55, 0, 0);
                qx8 qx8Var = wpVar.z0;
                if (qx8Var != null) {
                    qx8Var.b();
                }
                if (wpVar.A0 && (viewGroup = wpVar.B0) != null && viewGroup.isLaidOut()) {
                    wpVar.w0.setAlpha(0.0f);
                    qx8 qx8VarA = cw8.a(wpVar.w0);
                    qx8VarA.a(1.0f);
                    wpVar.z0 = qx8VarA;
                    qx8VarA.d(new qp(this, (byte) 0));
                } else {
                    wpVar.w0.setAlpha(1.0f);
                    wpVar.w0.setVisibility(0);
                }
                break;
        }
    }
}
