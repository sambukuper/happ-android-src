package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r95 implements OnBackAnimationCallback {
    public final /* synthetic */ s95 a;

    public r95(s95 s95Var) {
        this.a = s95Var;
    }

    public final void onBackCancelled() {
        s95 s95Var = this.a;
        z47 z47Var = s95Var.a;
        if (z47Var == null) {
            bt.i("This input is not added to any dispatcher.");
            return;
        }
        if (!s95Var.b) {
            z47Var.s(s95Var, null);
        }
        n25 n25Var = (n25) z47Var.Z;
        if (s95Var.equals(n25Var.h) && -1 == n25Var.g) {
            k25 k25VarC = n25Var.f;
            if (k25VarC == null) {
                k25VarC = n25Var.c(-1);
            }
            n25Var.f = null;
            n25Var.g = 0;
            n25Var.h = null;
            if (k25VarC != null) {
                k25VarC.a();
            }
            n25Var.a.n(null, o25.i0);
        }
        s95Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        i25 i25VarA = d4.a(backEvent);
        s95 s95Var = this.a;
        z47 z47Var = s95Var.a;
        if (z47Var == null) {
            bt.i("This input is not added to any dispatcher.");
            return;
        }
        if (s95Var.b) {
            n25 n25Var = (n25) z47Var.Z;
            if (s95Var.equals(n25Var.h) && -1 == n25Var.g) {
                k25 k25VarC = n25Var.f;
                if (k25VarC == null) {
                    k25VarC = n25Var.c(-1);
                }
                if (k25VarC != null) {
                    k25VarC.c(i25VarA);
                }
                n25Var.a.n(null, new p25(i25VarA));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        i25 i25VarA = d4.a(backEvent);
        s95 s95Var = this.a;
        z47 z47Var = s95Var.a;
        if (z47Var == null) {
            bt.i("This input is not added to any dispatcher.");
        } else {
            if (s95Var.b) {
                return;
            }
            z47Var.s(s95Var, i25VarA);
            s95Var.b = true;
        }
    }
}
