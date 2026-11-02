package defpackage;

import android.os.SystemClock;
import com.google.android.material.progressindicator.a;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ a Y;

    public /* synthetic */ h20(a aVar, byte b) {
        this.X = b;
        this.Y = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        a aVar = this.Y;
        switch (b) {
            case 0:
                if (aVar.j0 > 0) {
                    aVar.k0 = SystemClock.uptimeMillis();
                }
                aVar.setVisibility(0);
                break;
            default:
                ((fw1) aVar.getCurrentDrawable()).d(false, false, true);
                if ((aVar.getProgressDrawable() == null || !aVar.getProgressDrawable().isVisible()) && (aVar.getIndeterminateDrawable() == null || !aVar.getIndeterminateDrawable().isVisible())) {
                    aVar.setVisibility(4);
                }
                aVar.k0 = -1L;
                break;
        }
    }
}
