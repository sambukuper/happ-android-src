package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf6 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wf6(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        byte b2 = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                ((wl7) obj).S(b2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                int i = SideSheetBehavior.x;
                WeakReference weakReference = sideSheetBehavior.p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.y(view, b2, false);
                }
                break;
        }
    }
}
