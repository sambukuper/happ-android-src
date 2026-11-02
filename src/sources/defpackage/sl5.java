package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sl5 extends h2 {
    public final /* synthetic */ byte X;
    public final jl5 Y;

    public /* synthetic */ sl5(jl5 jl5Var, byte b) {
        this.X = b;
        this.Y = jl5Var;
    }

    @Override // defpackage.h2
    public final int a() {
        byte b = this.X;
        jl5 jl5Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return jl5Var.g0;
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
        jl5 jl5Var = this.Y;
        switch (b) {
            case 0:
                jl5Var.clear();
                break;
            default:
                jl5Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.X) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    jl5 jl5Var = this.Y;
                    Object obj2 = jl5Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && jl5Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.Y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        jl5 jl5Var = this.Y;
        switch (b) {
            case 0:
                return new tl5(jl5Var);
            default:
                kf8[] kf8VarArr = new kf8[8];
                for (int i = 0; i < 8; i++) {
                    kf8VarArr[i] = new mf8((byte) 1);
                }
                return new wl5(jl5Var, kf8VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.X) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.Y.remove(entry.getKey(), entry.getValue());
            default:
                jl5 jl5Var = this.Y;
                if (!jl5Var.containsKey(obj)) {
                    return false;
                }
                jl5Var.remove(obj);
                return true;
        }
    }
}
