package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pc7 extends h2 {
    public static final /* synthetic */ int Z = 0;
    public Object X;
    public int Y;

    @Override // defpackage.h2
    public final int a() {
        return this.Y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.Y;
        if (i == 0) {
            this.X = obj;
        } else {
            Object obj3 = this.X;
            if (i == 1) {
                if (dh3.f(obj3, obj)) {
                    return false;
                }
                this.X = new Object[]{this.X, obj};
            } else if (i < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (eu.Z(obj, objArr)) {
                    return false;
                }
                int i2 = this.Y;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(aq4.G(objArrCopyOf.length));
                    eu.I0(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.X = obj2;
            } else {
                obj3.getClass();
                if (!ci8.g(obj3).add(obj)) {
                    return false;
                }
            }
        }
        this.Y++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.X = null;
        this.Y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return dh3.f(this.X, obj);
        }
        int iA = a();
        Object obj2 = this.X;
        if (iA < 5) {
            obj2.getClass();
            return eu.Z(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.Y;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.X;
        if (i == 1) {
            return new y27(obj, (byte) 1);
        }
        if (i < 5) {
            obj.getClass();
            return new tl5((Object[]) obj);
        }
        obj.getClass();
        return ci8.g(obj).iterator();
    }
}
