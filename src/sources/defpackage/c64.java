package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c64 implements Comparator {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ne Y;

    public /* synthetic */ c64(ne neVar, byte b) {
        this.X = b;
        this.Y = neVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.X;
        ne neVar = this.Y;
        switch (b) {
            case 0:
                return Integer.valueOf(neVar.e(((f74) obj).i)).compareTo(Integer.valueOf(neVar.e(((f74) obj2).i)));
            case 1:
                return Integer.valueOf(neVar.e(((f74) obj).i)).compareTo(Integer.valueOf(neVar.e(((f74) obj2).i)));
            case 2:
                return Integer.valueOf(neVar.e(((f74) obj2).i)).compareTo(Integer.valueOf(neVar.e(((f74) obj).i)));
            default:
                return Integer.valueOf(neVar.e(((f74) obj2).i)).compareTo(Integer.valueOf(neVar.e(((f74) obj).i)));
        }
    }
}
