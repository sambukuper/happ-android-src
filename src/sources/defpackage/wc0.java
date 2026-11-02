package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final gl7 f;
    public final hq8 g;
    public final HashMap h;
    public final il7 i;
    public final il7 j;

    public wc0(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, gl7 gl7Var, hq8 hq8Var, HashMap map, il7 il7Var, il7 il7Var2) {
        il7Var.getClass();
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = gl7Var;
        this.g = hq8Var;
        this.h = map;
        this.i = il7Var;
        this.j = il7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc0)) {
            return false;
        }
        wc0 wc0Var = (wc0) obj;
        return this.a.equals(wc0Var.a) && this.b.equals(wc0Var.b) && this.c.equals(wc0Var.c) && this.d.equals(wc0Var.d) && this.e.equals(wc0Var.e) && dh3.f(this.f, wc0Var.f) && dh3.f(this.g, wc0Var.g) && this.h.equals(wc0Var.h) && dh3.f(this.i, wc0Var.i) && dh3.f(this.j, wc0Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        gl7 gl7Var = this.f;
        int iHashCode2 = (iHashCode + (gl7Var == null ? 0 : gl7Var.hashCode())) * 31;
        hq8 hq8Var = this.g;
        int iHashCode3 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode2 + (hq8Var == null ? 0 : hq8Var.hashCode())) * 31)) * 31)) * 31;
        il7 il7Var = this.j;
        return iHashCode3 + (il7Var != null ? il7Var.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
