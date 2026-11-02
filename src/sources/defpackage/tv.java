package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tv {
    public static final /* synthetic */ long b = iu.a.objectFieldOffset(tv.class.getDeclaredField("a"));
    public volatile Object a;

    public final boolean a(Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = b;
            tv tvVar = this;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(tvVar, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObjectVolatile(tvVar, j) != obj3) {
                return false;
            }
            this = tvVar;
            obj = obj3;
            obj2 = obj4;
        }
    }

    public final Object b(Object obj) {
        return iu.a.getAndSetObject(this, b, obj);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
