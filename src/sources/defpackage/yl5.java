package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yl5 extends z2 {
    public final /* synthetic */ byte X;
    public final ml5 Y;

    public /* synthetic */ yl5(ml5 ml5Var, byte b) {
        this.X = b;
        this.Y = ml5Var;
    }

    @Override // defpackage.z0
    public final int a() {
        byte b = this.X;
        ml5 ml5Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return ml5Var.Y;
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        ml5 ml5Var = this.Y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = ml5Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && ml5Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return ml5Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        ml5 ml5Var = this.Y;
        switch (b) {
            case 0:
                jf8 jf8Var = ml5Var.X;
                kf8[] kf8VarArr = new kf8[8];
                for (int i = 0; i < 8; i++) {
                    kf8VarArr[i] = new mf8((byte) 0);
                }
                return new am5(jf8Var, kf8VarArr);
            default:
                jf8 jf8Var2 = ml5Var.X;
                kf8[] kf8VarArr2 = new kf8[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    kf8VarArr2[i2] = new mf8((byte) 1);
                }
                return new am5(jf8Var2, kf8VarArr2);
        }
    }
}
