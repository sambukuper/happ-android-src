package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ul5 extends h2 {
    public final /* synthetic */ byte X;
    public final g2 Y;

    public /* synthetic */ ul5(g2 g2Var, byte b) {
        this.X = b;
        this.Y = g2Var;
    }

    @Override // defpackage.h2
    public final int a() {
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                return ((ol5) g2Var).i0;
            default:
                return ((em5) g2Var).f0.c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                ((ol5) g2Var).clear();
                break;
            default:
                ((em5) g2Var).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                return ((ol5) g2Var).containsKey(obj);
            default:
                return ((em5) g2Var).f0.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                ol5 ol5Var = (ol5) g2Var;
                kf8[] kf8VarArr = new kf8[8];
                for (int i = 0; i < 8; i++) {
                    kf8VarArr[i] = new lf8((byte) 1);
                }
                return new vl5(ol5Var, kf8VarArr);
            default:
                return new fm5((em5) g2Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                ol5 ol5Var = (ol5) g2Var;
                if (!ol5Var.containsKey(obj)) {
                    return false;
                }
                ol5Var.remove(obj);
                return true;
            default:
                em5 em5Var = (em5) g2Var;
                if (!em5Var.f0.containsKey(obj)) {
                    return false;
                }
                em5Var.remove(obj);
                return true;
        }
    }
}
