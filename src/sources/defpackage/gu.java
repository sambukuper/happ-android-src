package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gu implements Iterable, qv3 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ gu(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return zc1.W((Object[]) obj);
            case 1:
                return new rw1((Iterator) ((dn2) obj).invoke());
            case 2:
                return ((u27) obj).iterator();
            default:
                return new w1((k22) obj);
        }
    }
}
