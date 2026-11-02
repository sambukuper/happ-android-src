package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i0 {
    public final /* synthetic */ byte a;
    public final Map b;
    public final s6 c;

    public s(s6 s6Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = s6Var;
                break;
            default:
                this.b = Collections.synchronizedMap(new HashMap());
                this.c = s6Var;
                break;
        }
    }

    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, n0 n0Var) {
        io.sentry.protocol.v vVarF;
        String str;
        Long l;
        byte b = this.a;
        s6 s6Var = this.c;
        Map map = this.b;
        switch (b) {
            case 0:
                if (!p7.class.isInstance(n0Var.b("sentry:typeCheckHint")) || (vVarF = j5Var.f()) == null || (str = vVarF.X) == null || (l = vVarF.f0) == null) {
                    return j5Var;
                }
                Long l2 = (Long) map.get(str);
                if (l2 == null || l2.equals(l)) {
                    map.put(str, l);
                    return j5Var;
                }
                s6Var.getLogger().h(s5.INFO, "Event %s has been dropped due to multi-threaded deduplication", j5Var.X);
                n0Var.d(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                return null;
            default:
                if (!s6Var.isEnableDeduplication()) {
                    s6Var.getLogger().h(s5.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return j5Var;
                }
                Throwable thA = j5Var.a();
                if (thA == null) {
                    return j5Var;
                }
                if (!map.containsKey(thA)) {
                    ArrayList arrayList = new ArrayList();
                    Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    setNewSetFromMap.add(thA);
                    for (Throwable cause = thA.getCause(); cause != null && setNewSetFromMap.add(cause); cause = cause.getCause()) {
                        arrayList.add(cause);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map.containsKey(it.next())) {
                        }
                    }
                    map.put(thA, null);
                    return j5Var;
                }
                s6Var.getLogger().h(s5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", j5Var.X);
                return null;
        }
    }
}
