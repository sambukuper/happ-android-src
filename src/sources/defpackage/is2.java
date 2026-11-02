package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class is2 extends u10 {
    public final Set y;

    public is2(Context context, Looper looper, int i, fu6 fu6Var, ps2 ps2Var, qs2 qs2Var) {
        ya9 ya9Var;
        synchronized (ya9.g) {
            try {
                ya9 ya9Var2 = ya9.h;
                if (ya9Var2 == null) {
                    ya9Var2 = new ya9(context.getApplicationContext(), context.getMainLooper());
                    ya9.h = ya9Var2;
                }
                ya9Var = ya9Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object obj = ns2.c;
        w45.s(ps2Var);
        w45.s(qs2Var);
        super(context, looper, ya9Var, i, new rb8((Object) ps2Var, (byte) 9), new q09(qs2Var), (String) fu6Var.g0);
        Set set = (Set) fu6Var.Z;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                bt.i("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.y = set;
    }
}
