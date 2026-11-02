package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bm5 extends z0 implements x73 {
    public final /* synthetic */ byte X;
    public final b2 Y;

    public /* synthetic */ bm5(b2 b2Var, byte b) {
        this.X = b;
        this.Y = b2Var;
    }

    @Override // defpackage.z0
    public final int a() {
        byte b = this.X;
        b2 b2Var = this.Y;
        switch (b) {
            case 0:
                return ((ll5) b2Var).Y;
            default:
                return ((dm5) b2Var).Z.c();
        }
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        b2 b2Var = this.Y;
        switch (b) {
            case 0:
                return ((ll5) b2Var).containsValue(obj);
            default:
                return ((dm5) b2Var).containsValue(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.X;
        b2 b2Var = this.Y;
        switch (b) {
            case 0:
                if8 if8Var = ((ll5) b2Var).X;
                if8Var.getClass();
                kf8[] kf8VarArr = new kf8[8];
                for (int i = 0; i < 8; i++) {
                    kf8VarArr[i] = new lf8((byte) 2);
                }
                return new zl5(if8Var, kf8VarArr);
            default:
                return new im5((dm5) b2Var, (byte) 2);
        }
    }
}
