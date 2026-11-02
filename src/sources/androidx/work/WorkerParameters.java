package androidx.work;

import defpackage.lj2;
import defpackage.s61;
import defpackage.u61;
import defpackage.u91;
import defpackage.y5;
import defpackage.zv7;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final u91 b;
    public final HashSet c;
    public final zv7 d;
    public final int e;
    public final Executor f;
    public final s61 g;
    public final y5 h;
    public final lj2 i;
    public final int j;

    public WorkerParameters(UUID uuid, u91 u91Var, AbstractCollection abstractCollection, zv7 zv7Var, int i, int i2, Executor executor, u61 u61Var, y5 y5Var, lj2 lj2Var) {
        this.a = uuid;
        this.b = u91Var;
        this.c = new HashSet(abstractCollection);
        this.d = zv7Var;
        this.e = i;
        this.j = i2;
        this.f = executor;
        this.g = u61Var;
        this.h = y5Var;
        this.i = lj2Var;
    }
}
