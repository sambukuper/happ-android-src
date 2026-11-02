package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fi3 {
    public final WorkDatabase_Impl a;
    public final xf8 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final ei3 e;
    public final ei3 f;
    public final Object g;

    public fi3(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = workDatabase_Impl;
        xf8 xf8Var = new xf8(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.j, new d0(1, this, fi3.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 16));
        this.b = xf8Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new ei3(this, (byte) 0);
        this.f = new ei3(this, (byte) 1);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        xf8Var.k = new tb2(this, (byte) 15);
    }

    public final Object a(uy7 uy7Var) {
        Object objF;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        return ((!workDatabase_Impl.j() || workDatabase_Impl.m()) && (objF = this.b.f(uy7Var)) == c71.X) ? objF : dn8.a;
    }
}
