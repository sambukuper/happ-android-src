package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n22 extends z1 implements l22, RandomAccess, Serializable {
    public final Enum[] X;

    public n22(Enum[] enumArr) {
        enumArr.getClass();
        this.X = enumArr;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.X.length;
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) eu.u0(r3.ordinal(), this.X)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.X;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        kp5.k(pc6.m("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.z1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) eu.u0(iOrdinal, this.X)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.z1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) eu.u0(iOrdinal, this.X)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
