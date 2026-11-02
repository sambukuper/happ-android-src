package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fu8 extends hu8 implements Iterable, qv3 {
    public final String X;
    public final float Y;
    public final float Z;
    public final float f0;
    public final float g0;
    public final float h0;
    public final float i0;
    public final float j0;
    public final List k0;
    public final ArrayList l0;

    public fu8(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.X = str;
        this.Y = f;
        this.Z = f2;
        this.f0 = f3;
        this.g0 = f4;
        this.h0 = f5;
        this.i0 = f6;
        this.j0 = f7;
        this.k0 = list;
        this.l0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fu8)) {
            return false;
        }
        fu8 fu8Var = (fu8) obj;
        return dh3.f(this.X, fu8Var.X) && this.Y == fu8Var.Y && this.Z == fu8Var.Z && this.f0 == fu8Var.f0 && this.g0 == fu8Var.g0 && this.h0 == fu8Var.h0 && this.i0 == fu8Var.i0 && this.j0 == fu8Var.j0 && dh3.f(this.k0, fu8Var.k0) && this.l0.equals(fu8Var.l0);
    }

    public final int hashCode() {
        return this.l0.hashCode() + p61.f(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(this.X.hashCode() * 31, this.Y, 31), this.Z, 31), this.f0, 31), this.g0, 31), this.h0, 31), this.i0, 31), this.j0, 31), 31, this.k0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tl5(this);
    }
}
