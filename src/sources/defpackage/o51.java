package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o51 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int iHashCode = context.getApplicationContext().hashCode();
        int i = Build.VERSION.SDK_INT;
        Context context2 = null;
        String str = String.format("%d-%d-%s", Integer.valueOf(iHashCode), Integer.valueOf(i >= 34 ? u3.k(context) : 0), i >= 30 ? b4.c(context) : null);
        synchronized (a) {
            try {
                HashMap map = b;
                WeakReference weakReference = (WeakReference) map.get(str);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        map.remove(str);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i >= 34) {
                    applicationContext = u3.b(applicationContext, u3.k(context));
                }
                if (i >= 30) {
                    String strC = b4.c(context);
                    if (!Objects.equals(strC, b4.c(applicationContext))) {
                        applicationContext = b4.a(applicationContext, strC);
                    }
                }
                map.put(str, new WeakReference(applicationContext));
                return applicationContext;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
