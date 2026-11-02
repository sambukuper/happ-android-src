package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b42 implements bq7, y16 {
    public final HashMap a;
    public ArrayDeque b;

    public b42() {
        nl8 nl8Var = nl8.X;
        this.a = new HashMap();
        this.b = new ArrayDeque();
    }

    public final void a(u52 u52Var) {
        nl8 nl8Var = nl8.X;
        synchronized (this) {
            try {
                if (!this.a.containsKey(z91.class)) {
                    this.a.put(z91.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(z91.class)).put(u52Var, nl8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
