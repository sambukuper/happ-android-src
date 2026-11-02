package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lk {
    public static final ThreadLocal i = new ThreadLocal();
    public final dq e;
    public jk h;
    public final l97 a = new l97(0);
    public final ArrayList b = new ArrayList();
    public final wl6 c = new wl6((Object) this, (byte) 7);
    public final c1 d = new c1(this, 5);
    public boolean f = false;
    public float g = 1.0f;

    public lk(dq dqVar) {
        this.e = dqVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, ik] */
    public final void a(tf7 tf7Var) {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.Y).postFrameCallback(new kk(this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                final jk jkVar = this.h;
                if (jkVar == null) {
                    jkVar = new jk(this);
                    this.h = jkVar;
                }
                if (jkVar.a == null) {
                    ?? r4 = new ValueAnimator.DurationScaleChangeListener() { // from class: ik
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            jkVar.b.g = f;
                        }
                    };
                    jkVar.a = r4;
                    ValueAnimator.registerDurationScaleChangeListener(r4);
                }
            }
        }
        if (arrayList.contains(tf7Var)) {
            return;
        }
        arrayList.add(tf7Var);
    }

    public final boolean b() {
        return Thread.currentThread() == ((Looper) this.e.Z).getThread();
    }
}
