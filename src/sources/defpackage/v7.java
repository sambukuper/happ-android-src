package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ byte X;

    public /* synthetic */ v7(ck0 ck0Var, Set set) {
        this.X = (byte) 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                j05 j05Var = AndroidComposeView.M1;
                synchronized (j05Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = j05Var.a;
                        int i3 = j05Var.b;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i4];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.J1;
                                androidComposeView.setShowLayoutBounds(ch3.B());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new rb(androidComposeView, (byte) 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i4];
                                androidComposeView2.post(new rb(androidComposeView2, (byte) 3));
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                return;
        }
    }

    public /* synthetic */ v7(byte b) {
        this.X = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
