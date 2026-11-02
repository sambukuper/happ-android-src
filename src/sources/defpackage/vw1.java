package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw1 implements View.OnTouchListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ vw1(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                yw1 yw1Var = (yw1) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - yw1Var.o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        yw1Var.m = false;
                    }
                    yw1Var.t();
                    yw1Var.m = true;
                    yw1Var.o = SystemClock.uptimeMillis();
                }
                return false;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                int i = MainActivity.y1;
                int action = motionEvent.getAction();
                if (action == 0) {
                    view.getClass();
                    MainActivity.U(view);
                    b6 b6Var = mainActivity.Q0;
                    if (b6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    MainActivity.U(b6Var.l0);
                    b6 b6Var2 = mainActivity.Q0;
                    if (b6Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    MainActivity.U(b6Var2.k0);
                } else if (action == 1 || action == 3) {
                    view.getClass();
                    MainActivity.V(view);
                    b6 b6Var3 = mainActivity.Q0;
                    if (b6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    MainActivity.V(b6Var3.l0);
                    b6 b6Var4 = mainActivity.Q0;
                    if (b6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    MainActivity.V(b6Var4.k0);
                }
                return false;
        }
    }
}
