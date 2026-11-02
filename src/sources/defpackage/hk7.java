package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hk7 implements View.OnTouchListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ok7 Y;

    public /* synthetic */ hk7(ok7 ok7Var, byte b) {
        this.X = b;
        this.Y = ok7Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.X;
        ok7 ok7Var = this.Y;
        switch (b) {
            case 0:
                int action = motionEvent.getAction();
                if (action == 0) {
                    ok7Var.v1 = motionEvent.getRawX();
                } else if (action == 1) {
                    float f = ok7Var.w1 - ok7Var.v1;
                    ok7Var.v1 = 0.0f;
                    ok7Var.w1 = 0.0f;
                    if (f > 100.0f) {
                        ok7Var.R(false, false);
                    }
                } else if (action == 2) {
                    ok7Var.w1 = motionEvent.getRawX();
                }
                return false;
            default:
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    wk2 wk2Var = ok7Var.t1;
                    if (wk2Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    wk2Var.s0.b();
                } else {
                    if (action2 != 1) {
                        return false;
                    }
                    wk2 wk2Var2 = ok7Var.t1;
                    if (wk2Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    wk2Var2.s0.c();
                }
                return true;
        }
    }
}
