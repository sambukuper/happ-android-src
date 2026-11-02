package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ th b;

    public /* synthetic */ sh(int i, th thVar) {
        this.a = i;
        this.b = thVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.a;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            if (i >= uh.a[i3]) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        Thread threadNewThread = this.b.newThread(new rh(i, runnable));
        threadNewThread.setPriority(i2);
        return threadNewThread;
    }
}
