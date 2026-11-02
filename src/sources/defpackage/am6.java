package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class am6 extends OrientationEventListener {
    public final /* synthetic */ dm6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am6(Context context, dm6 dm6Var) {
        super(context);
        this.a = dm6Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        List listY0;
        if (i == -1) {
            return;
        }
        dm6 dm6Var = this.a;
        int i2 = 1;
        if (dm6Var.d == -1) {
            if (i >= 0 && i < 45) {
                i2 = 0;
            } else if (45 <= i && i < 135) {
                i2 = 3;
            } else if (135 <= i && i < 225) {
                i2 = 2;
            } else if (225 > i || i >= 315) {
                i2 = 0;
            }
        } else if ((i >= 0 && i < 40) || (320 <= i && i < 360)) {
            i2 = 0;
        } else if (50 <= i && i < 130) {
            i2 = 3;
        } else if (140 <= i && i < 220) {
            i2 = 2;
        } else if (230 > i || i >= 310) {
            i2 = dm6Var.d;
        }
        dm6 dm6Var2 = this.a;
        if (dm6Var2.d != i2) {
            dm6Var2.d = i2;
            synchronized (dm6Var2.a) {
                listY0 = wv0.Y0(dm6Var2.c.values());
            }
            Iterator it = listY0.iterator();
            if (it.hasNext()) {
                ((cm6) it.next()).getClass();
                throw null;
            }
        }
    }
}
