package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jf1 implements a94 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public jf1(c94 c94Var) {
        this.X = (byte) 5;
        this.Y = c94Var;
        lt0 lt0Var = lt0.c;
        Class<?> cls = c94Var.getClass();
        jt0 jt0Var = (jt0) lt0Var.a.get(cls);
        this.Z = jt0Var == null ? lt0Var.a(cls, null) : jt0Var;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        byte b = this.X;
        Object obj = this.Y;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
                switch (if1.a[n84Var.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(d94Var);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(d94Var);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(d94Var);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(d94Var);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(d94Var);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(d94Var);
                        break;
                    case 7:
                        bt.q("ON_ANY must not been send by anybody");
                        break;
                    default:
                        b61.c();
                        break;
                }
                a94 a94Var = (a94) obj2;
                if (a94Var != null) {
                    a94Var.k(d94Var, n84Var);
                }
                break;
            case 1:
                fm2 fm2Var = (fm2) obj;
                kk7 kk7Var = (kk7) obj2;
                if (!kk7Var.d.P()) {
                    d94Var.getH0().f(this);
                    if (((FrameLayout) fm2Var.a).isAttachedToWindow()) {
                        kk7Var.p(fm2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (n84Var == n84.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((xb) obj2);
                    d94Var.getH0().f(this);
                }
                break;
            case 3:
                if (n84Var == n84.ON_START) {
                    ((g94) obj).f(this);
                    ((xd6) obj2).H();
                }
                break;
            case 4:
                t95 t95Var = (t95) obj;
                int i = y95.a[n84Var.ordinal()];
                if (i == 1) {
                    t95Var.g(true);
                    break;
                } else if (i == 2) {
                    t95Var.g(false);
                    break;
                } else if (i == 3) {
                    t95Var.e();
                    ((g94) obj2).f(this);
                    break;
                }
                break;
            default:
                c94 c94Var = (c94) obj;
                HashMap map = ((jt0) obj2).a;
                jt0.a((List) map.get(n84Var), d94Var, n84Var, c94Var);
                jt0.a((List) map.get(n84.ON_ANY), d94Var, n84Var, c94Var);
                break;
        }
    }

    public /* synthetic */ jf1(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    public jf1(t95 t95Var, z95 z95Var, g94 g94Var) {
        this.X = (byte) 4;
        this.Y = t95Var;
        this.Z = g94Var;
    }

    public jf1(kk7 kk7Var, fm2 fm2Var) {
        this.X = (byte) 1;
        this.Z = kk7Var;
        this.Y = fm2Var;
    }
}
