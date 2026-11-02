package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 {
    public final String a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final el0 e;
    public final int f;
    public final Map g;
    public final int h;
    public final Map i;
    public final List j;
    public final List k;
    public final Map l;
    public final gv4 m;
    public final ji0 n;

    public hi0(String str, List list, List list2, ArrayList arrayList, el0 el0Var, int i, LinkedHashMap linkedHashMap, int i2, ip4 ip4Var, List list3, List list4, ji0 ji0Var) {
        gv4 gv4Var = new gv4();
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = el0Var;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = ip4Var;
        this.j = list3;
        this.k = list4;
        this.l = e02.X;
        this.m = gv4Var;
        this.n = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return dh3.f(this.a, hi0Var.a) && this.b.equals(hi0Var.b) && this.c.equals(hi0Var.c) && dh3.f(this.d, hi0Var.d) && dh3.f(this.e, hi0Var.e) && this.f == hi0Var.f && this.g.equals(hi0Var.g) && this.h == hi0Var.h && this.i.equals(hi0Var.i) && this.j.equals(hi0Var.j) && this.k.equals(hi0Var.k) && this.l.equals(hi0Var.l) && this.m.equals(hi0Var.m) && this.n.equals(hi0Var.n);
    }

    public final int hashCode() {
        int iF = p61.f(p61.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int iHashCode = (iF + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        el0 el0Var = this.e;
        return (this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + p61.f(p61.f((this.i.hashCode() + oi0.e(1, oi0.e(this.h, (this.g.hashCode() + oi0.e(this.f, (iHashCode + (el0Var != null ? el0Var.hashCode() : 0)) * 31, 31)) * 31, 31), 31)) * 31, 31, this.j), 31, this.k)) * 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) vi0.b(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) we6.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) wl7.g0(this.h)) + ", defaultTemplate=" + ((Object) we6.b(1)) + ", defaultParameters=" + this.i + ", defaultListeners=" + this.j + ", graphStateListeners=" + this.k + ", requiredParameters=" + this.l + ", cameraBackendId=null, customCameraBackend=null, metadataTransform=" + this.m + ", flags=" + this.n + ", sessionColorSpace=null)";
    }
}
