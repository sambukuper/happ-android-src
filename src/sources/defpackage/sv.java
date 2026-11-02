package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sv {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(sv.class, "a");
    public static final /* synthetic */ long c = iu.a.objectFieldOffset(sv.class.getDeclaredField("a"));
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}
