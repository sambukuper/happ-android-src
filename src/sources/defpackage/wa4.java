package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wa4 extends AbstractSet {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ya4 Y;

    public /* synthetic */ wa4(ya4 ya4Var, byte b) {
        this.X = b;
        this.Y = ya4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.X;
        ya4 ya4Var = this.Y;
        switch (b) {
            case 0:
                ya4Var.clear();
                break;
            default:
                ya4Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        xa4 xa4VarA;
        byte b = this.X;
        ya4 ya4Var = this.Y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                xa4 xa4Var = null;
                if (key != null) {
                    try {
                        xa4VarA = ya4Var.a(key, false);
                    } catch (ClassCastException unused) {
                        xa4VarA = null;
                    }
                    break;
                } else {
                    xa4VarA = null;
                }
                if (xa4VarA != null && Objects.equals(xa4VarA.j0, entry.getValue())) {
                    xa4Var = xa4VarA;
                }
                return xa4Var != null;
            default:
                return ya4Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        ya4 ya4Var = this.Y;
        switch (b) {
            case 0:
                return new va4(ya4Var, (byte) 0);
            default:
                return new va4(ya4Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        xa4 xa4VarA;
        byte b = this.X;
        xa4 xa4VarA2 = null;
        ya4 ya4Var = this.Y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        xa4VarA = ya4Var.a(key, false);
                    } catch (ClassCastException unused) {
                        xa4VarA = null;
                    }
                    break;
                } else {
                    xa4VarA = null;
                }
                if (xa4VarA != null && Objects.equals(xa4VarA.j0, entry.getValue())) {
                    xa4VarA2 = xa4VarA;
                }
                if (xa4VarA2 == null) {
                    return false;
                }
                ya4Var.c(xa4VarA2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        xa4VarA2 = ya4Var.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (xa4VarA2 != null) {
                    ya4Var.c(xa4VarA2, true);
                }
                return xa4VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.X;
        ya4 ya4Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return ya4Var.f0;
    }
}
