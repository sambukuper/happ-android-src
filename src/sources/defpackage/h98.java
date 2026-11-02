package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h98 {
    public static final c20 a;

    static {
        c20 c20Var = new c20();
        new ReentrantLock();
        c20Var.a = new ConcurrentHashMap();
        c20Var.b = new ReferenceQueue();
        a = c20Var;
    }
}
