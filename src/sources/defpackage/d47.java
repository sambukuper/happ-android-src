package defpackage;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class d47 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ yv7 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d47(yv7 yv7Var, byte b) {
        this.X = b;
        this.Y = yv7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        yv7 yv7Var = this.Y;
        switch (b) {
            case 0:
                ((RelativeLayout) yv7Var.u.n0).performClick();
                break;
            default:
                ((RelativeLayout) yv7Var.u.f0).performClick();
                break;
        }
    }
}
