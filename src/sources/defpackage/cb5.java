package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cb5 extends ut {
    public final wm X;
    public final int Y;

    public cb5(int i, wm wmVar) {
        this.X = wmVar;
        this.Y = i;
    }

    @Override // defpackage.ut
    public final int a() {
        return 1;
    }

    @Override // defpackage.ut
    public final void b(int i, wm wmVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.ut
    public final Object get(int i) {
        if (i == this.Y) {
            return this.X;
        }
        return null;
    }

    @Override // defpackage.ut, java.lang.Iterable
    public final Iterator iterator() {
        return new y27(this, (byte) 2);
    }
}
