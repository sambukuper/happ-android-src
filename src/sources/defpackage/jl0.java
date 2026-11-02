package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jl0 {
    public static final qv d = nr4.f(0);
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final il0 a(Surface surface) {
        il0 il0Var;
        List listY0;
        surface.getClass();
        if (!surface.isValid()) {
            surface.toString();
        }
        synchronized (this.a) {
            try {
                il0Var = new il0(this, surface);
                Integer num = (Integer) this.b.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.b.put(surface, Integer.valueOf(iIntValue));
                listY0 = iIntValue == 1 ? wv0.Y0(this.c) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listY0 != null) {
            Iterator it = listY0.iterator();
            while (it.hasNext()) {
                ((or8) it.next()).c(surface);
            }
        }
        return il0Var;
    }
}
