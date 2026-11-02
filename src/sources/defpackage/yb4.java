package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AtomicBoolean Y;

    public /* synthetic */ yb4(AtomicBoolean atomicBoolean, byte b) {
        this.X = b;
        this.Y = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        AtomicBoolean atomicBoolean = this.Y;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
