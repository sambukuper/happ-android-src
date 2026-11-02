package defpackage;

import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sq3 implements Serializable {
    public static final sq3 Y = new sq3(0);
    public static final sq3 Z = new sq3(1);
    public final /* synthetic */ byte X;

    public /* synthetic */ sq3(byte b) {
        this.X = b;
    }

    public final m90 a() {
        SoftReference softReference;
        switch (this.X) {
            case 0:
                return new m90();
            default:
                ThreadLocal threadLocal = n90.b;
                SoftReference softReference2 = (SoftReference) threadLocal.get();
                m90 m90Var = softReference2 == null ? null : (m90) softReference2.get();
                if (m90Var == null) {
                    m90Var = new m90();
                    c20 c20Var = n90.a;
                    if (c20Var != null) {
                        ReferenceQueue referenceQueue = c20Var.b;
                        softReference = new SoftReference(m90Var, referenceQueue);
                        ConcurrentHashMap concurrentHashMap = c20Var.a;
                        concurrentHashMap.put(softReference, Boolean.TRUE);
                        while (true) {
                            SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                            if (softReference3 != null) {
                                concurrentHashMap.remove(softReference3);
                            }
                        }
                    } else {
                        softReference = new SoftReference(m90Var);
                    }
                    threadLocal.set(softReference);
                }
                return m90Var;
        }
    }
}
