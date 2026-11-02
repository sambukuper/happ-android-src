package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AndroidComposeView Y;

    public /* synthetic */ rb(AndroidComposeView androidComposeView, byte b) {
        this.X = b;
        this.Y = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        AndroidComposeView androidComposeView = this.Y;
        switch (b) {
            case 0:
                kt ktVar = androidComposeView.n0;
                Class cls = AndroidComposeView.J1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!ktVar.isEmpty()) {
                    try {
                        ((dn2) ktVar.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                androidComposeView.y1 = false;
                MotionEvent motionEvent = androidComposeView.o1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.F(motionEvent);
                    return;
                } else {
                    bt.i("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                AndroidComposeView.i(androidComposeView.getRoot());
                return;
            default:
                AndroidComposeView.i(androidComposeView.getRoot());
                return;
        }
    }
}
