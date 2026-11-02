package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rl5 extends h2 {
    public final /* synthetic */ byte X;
    public final g2 Y;

    public /* synthetic */ rl5(g2 g2Var, byte b) {
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
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                ((Map.Entry) obj).getClass();
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
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                return z39.n((ol5) g2Var, entry);
            default:
                return z39.n((em5) g2Var, entry);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                return new tl5((ol5) g2Var);
            default:
                return new fm5((em5) g2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        byte b = this.X;
        g2 g2Var = this.Y;
        switch (b) {
            case 0:
                return ((ol5) g2Var).remove(entry.getKey(), entry.getValue());
            default:
                return ((em5) g2Var).remove(entry.getKey(), entry.getValue());
        }
    }
}
