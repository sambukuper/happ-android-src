package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xl5 extends z2 implements c83 {
    public final /* synthetic */ byte X;
    public final ll5 Y;

    public /* synthetic */ xl5(ll5 ll5Var, byte b) {
        this.X = b;
        this.Y = ll5Var;
    }

    @Override // defpackage.z0
    public final int a() {
        byte b = this.X;
        ll5 ll5Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return ll5Var.Y;
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        ll5 ll5Var = this.Y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return z39.n(ll5Var, (Map.Entry) obj);
                }
                return false;
            default:
                return ll5Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        ll5 ll5Var = this.Y;
        switch (b) {
            case 0:
                if8 if8Var = ll5Var.X;
                if8Var.getClass();
                kf8[] kf8VarArr = new kf8[8];
                for (int i = 0; i < 8; i++) {
                    kf8VarArr[i] = new lf8((byte) 0);
                }
                return new zl5(if8Var, kf8VarArr);
            default:
                if8 if8Var2 = ll5Var.X;
                if8Var2.getClass();
                kf8[] kf8VarArr2 = new kf8[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    kf8VarArr2[i2] = new lf8((byte) 1);
                }
                return new zl5(if8Var2, kf8VarArr2);
        }
    }
}
