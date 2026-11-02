package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qc0 extends rc0 {
    public volatile SoftReference b;

    @Override // defpackage.rc0
    public final Object a() {
        return this.b.get();
    }

    @Override // defpackage.rc0
    public final synchronized Object b(Object obj) {
        Object obj2 = this.b.get();
        if (obj2 != null) {
            return obj2;
        }
        this.b = new SoftReference(obj);
        return obj;
    }
}
