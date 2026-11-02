package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lm5 extends z2 implements Set, Collection, qv3 {
    public static final lm5 f0;
    public final Object X;
    public final Object Y;
    public final ml5 Z;

    static {
        oy1 oy1Var = oy1.w0;
        f0 = new lm5(oy1Var, oy1Var, ml5.Z);
    }

    public lm5(Object obj, Object obj2, ml5 ml5Var) {
        this.X = obj;
        this.Y = obj2;
        this.Z = ml5Var;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z.Y;
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        return this.Z.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jm5(this.X, this.Z, (byte) 2);
    }
}
