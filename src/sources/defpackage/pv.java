package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pv {
    public static final /* synthetic */ long b = iu.a.objectFieldOffset(pv.class.getDeclaredField("a"));
    public volatile int a;

    public final boolean a() {
        return iu.a.compareAndSwapInt(this, b, 0, 1);
    }

    public final boolean b() {
        return this.a != 0;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
