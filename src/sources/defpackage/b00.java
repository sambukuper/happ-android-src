package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b00 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(b00.class, "notCompletedCount$volatile");
    public final xg1[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public b00(xg1[] xg1VarArr) {
        this.a = xg1VarArr;
        this.notCompletedCount$volatile = xg1VarArr.length;
    }
}
