package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Collection Y;

    public /* synthetic */ i2(Collection collection, byte b) {
        this.X = b;
        this.Y = collection;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        boolean zContains;
        byte b = this.X;
        Collection<?> collection = this.Y;
        switch (b) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            case 2:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
