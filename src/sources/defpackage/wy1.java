package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 implements Runnable {
    public final ArrayList X;
    public final byte Y;

    /* JADX WARN: Multi-variable type inference failed */
    public wy1(List list, int i, Throwable th) {
        mb6.r(list, "initCallbacks cannot be null");
        this.X = new ArrayList(list);
        this.Y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i = 0;
        if (this.Y != 1) {
            while (i < size) {
                ((vy1) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((vy1) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
