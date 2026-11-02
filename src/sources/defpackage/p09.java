package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p09 extends ux8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s09 b;

    public /* synthetic */ p09(s09 s09Var, byte b) {
        this.a = b;
        this.b = s09Var;
    }

    @Override // defpackage.tx8
    public final void c() {
        View view;
        byte b = this.a;
        s09 s09Var = this.b;
        switch (b) {
            case 0:
                if (s09Var.u && (view = s09Var.m) != null) {
                    view.setTranslationY(0.0f);
                    s09Var.j.setTranslationY(0.0f);
                }
                s09Var.j.setVisibility(8);
                s09Var.j.setTransitioning(false);
                s09Var.y = null;
                dq dqVar = s09Var.q;
                if (dqVar != null) {
                    dqVar.F(s09Var.p);
                    s09Var.p = null;
                    s09Var.q = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = s09Var.i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = cw8.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                s09Var.y = null;
                s09Var.j.requestLayout();
                break;
        }
    }
}
