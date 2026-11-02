package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa7 {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    public static final v76 a(Context context) {
        v76 v76Var;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        v76 v76VarA = null;
        v76 v76Var2 = obj instanceof v76 ? (v76) obj : null;
        if (v76Var2 != null) {
            return v76Var2;
        }
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof v76) {
                v76Var = v76VarA;
                v76VarA = (v76) obj2;
            } else {
                if (v76VarA == null) {
                    Context applicationContext = context.getApplicationContext();
                    f4 f4Var = ra7.a;
                    v76VarA = qa7.a(applicationContext);
                }
                v76Var = v76VarA;
            }
            while (!atomicReference.compareAndSet(obj2, v76VarA)) {
                if (atomicReference.get() != obj2) {
                    v76VarA = v76Var;
                }
            }
            return v76VarA;
        }
    }
}
