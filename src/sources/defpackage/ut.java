package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ut implements Iterable, qv3 {
    public int a() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(int i, wm wmVar) {
        throw new IllegalStateException();
    }

    public Object get(int i) {
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new vz1();
    }
}
