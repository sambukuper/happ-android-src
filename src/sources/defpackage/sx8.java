package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sx8 {
    public Interpolator c;
    public tx8 d;
    public boolean e;
    public long b = -1;
    public final rx8 f = new rx8(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((qx8) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (qx8 qx8Var : this.a) {
            long j = this.b;
            if (j >= 0) {
                qx8Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) qx8Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                qx8Var.d(this.f);
            }
            View view2 = (View) qx8Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
