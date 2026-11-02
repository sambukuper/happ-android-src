package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.bz1;
import defpackage.d94;
import defpackage.g94;
import defpackage.lr;
import defpackage.pi2;
import defpackage.rc3;
import defpackage.yy1;
import defpackage.zy1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements rc3 {
    @Override // defpackage.rc3
    public final Object create(Context context) {
        Object objI;
        pi2 pi2Var = new pi2(new bz1(context, (byte) 0));
        pi2Var.b = true;
        if (yy1.k == null) {
            synchronized (yy1.j) {
                try {
                    if (yy1.k == null) {
                        yy1.k = new yy1(pi2Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        lr lrVarN = lr.n(context);
        lrVarN.getClass();
        synchronized (lr.h0) {
            try {
                objI = ((HashMap) lrVarN.Y).get(ProcessLifecycleInitializer.class);
                if (objI == null) {
                    objI = lrVarN.i(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g94 x = ((d94) objI).getX();
        x.a(new zy1(this, x));
        return Boolean.TRUE;
    }

    @Override // defpackage.rc3
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
