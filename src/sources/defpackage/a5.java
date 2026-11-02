package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ActionBarOverlayLayout Y;

    public /* synthetic */ a5(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.X = b;
        this.Y = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
        switch (b) {
            case 0:
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.E0 = actionBarOverlayLayout.i0.animate().translationY(0.0f).setListener(actionBarOverlayLayout.F0);
                break;
            default:
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.E0 = actionBarOverlayLayout.i0.animate().translationY(-actionBarOverlayLayout.i0.getHeight()).setListener(actionBarOverlayLayout.F0);
                break;
        }
    }
}
