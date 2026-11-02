package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hm5 extends z2 implements c83 {
    public final /* synthetic */ byte X;
    public final dm5 Y;

    public /* synthetic */ hm5(dm5 dm5Var, byte b) {
        this.X = b;
        this.Y = dm5Var;
    }

    @Override // defpackage.z0
    public final int a() {
        byte b = this.X;
        dm5 dm5Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return dm5Var.Z.c();
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        dm5 dm5Var = this.Y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return z39.n(dm5Var, (Map.Entry) obj);
                }
                return false;
            default:
                return dm5Var.Z.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        dm5 dm5Var = this.Y;
        switch (b) {
            case 0:
                return new im5(dm5Var, (byte) 0);
            default:
                return new im5(dm5Var, (byte) 1);
        }
    }
}
