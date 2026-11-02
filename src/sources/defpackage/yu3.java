package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yu3 {
    public static final yu3 k;
    public final ww3 a;
    public final ex4 b;
    public final Boolean c;
    public final ov3 d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    static {
        d02 d02Var = d02.X;
        k = new yu3(null, null, null, null, d02Var, d02Var, false, false, false, false);
    }

    public yu3(ww3 ww3Var, ex4 ex4Var, Boolean bool, ov3 ov3Var, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = ww3Var;
        this.b = ex4Var;
        this.c = bool;
        this.d = ov3Var;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static yu3 a(yu3 yu3Var, ww3 ww3Var, ex4 ex4Var, Boolean bool, ov3 ov3Var, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            ww3Var = yu3Var.a;
        }
        ww3 ww3Var2 = ww3Var;
        if ((i & 2) != 0) {
            ex4Var = yu3Var.b;
        }
        ex4 ex4Var2 = ex4Var;
        if ((i & 4) != 0) {
            bool = yu3Var.c;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            ov3Var = yu3Var.d;
        }
        ov3 ov3Var2 = ov3Var;
        List list3 = (i & 16) != 0 ? yu3Var.e : list;
        List list4 = (i & 32) != 0 ? yu3Var.f : list2;
        boolean z5 = (i & 64) != 0 ? yu3Var.g : z;
        boolean z6 = (i & 128) != 0 ? yu3Var.h : z2;
        boolean z7 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? yu3Var.i : z3;
        boolean z8 = (i & 512) != 0 ? yu3Var.j : z4;
        yu3Var.getClass();
        list3.getClass();
        return new yu3(ww3Var2, ex4Var2, bool2, ov3Var2, list3, list4, z5, z6, z7, z8);
    }

    public final ww3 b(String str, List list) {
        ww3 ww3Var;
        list.getClass();
        str.getClass();
        ww3 ww3VarG = y72.g(this.e, list);
        ww3 ww3Var2 = this.a;
        if (ww3VarG != null) {
            ww3 ww3Var3 = ww3Var2 == null ? ww3.c : ww3Var2;
            Map map = ww3VarG.a;
            ww3Var3.getClass();
            Map map2 = ww3Var3.a;
            boolean z = ww3VarG.b || ww3Var3.b;
            if (map.isEmpty()) {
                ww3Var = ww3Var3.a(z);
            } else if (map2.isEmpty()) {
                ww3Var = ww3VarG.a(z);
            } else {
                LinkedHashSet linkedHashSetV0 = wv0.v0(map.keySet(), map2.keySet());
                if (!linkedHashSetV0.isEmpty()) {
                    kp5.h(p61.n(new StringBuilder("Substitutors must not have intersecting keys: "), wv0.y0(linkedHashSetV0, null, null, null, null, 63), ". Member: ", str));
                    return null;
                }
                ww3Var = new ww3(zp4.L(map, map2), z);
            }
            if (ww3Var != null) {
                return ww3Var;
            }
        }
        return ww3Var2 == null ? ww3.c : ww3Var2;
    }

    public final boolean c() {
        return this.d != null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    public final yu3 d(ww3 ww3Var) {
        ww3 ww3Var2;
        ww3Var.getClass();
        ww3 ww3Var3 = this.a;
        if (ww3Var3 != null) {
            Map map = ww3Var3.a;
            boolean z = ww3Var.b;
            Map map2 = ww3Var.a;
            if (!ww3Var3.b) {
                if (map.isEmpty()) {
                    ww3Var3 = ww3Var;
                } else if (map2.isEmpty()) {
                    ww3Var3 = ww3Var3.a(z);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(aq4.G(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        uw3 uw3VarB = (uw3) entry.getValue();
                        pw3 pw3Var = uw3VarB.b;
                        yw3 yw3Var = uw3VarB.a;
                        if (pw3Var != null && yw3Var != null) {
                            uw3VarB = ww3Var.b(pw3Var, yw3Var);
                        }
                        linkedHashMap.put(key, uw3VarB);
                    }
                    LinkedHashSet linkedHashSetV0 = wv0.v0(linkedHashMap.keySet(), map2.keySet());
                    if (!linkedHashSetV0.isEmpty()) {
                        xw3.s(linkedHashSetV0, "Substitutors must not have intersecting keys: ");
                        return null;
                    }
                    ww3Var3 = new ww3(zp4.L(linkedHashMap, map2), z);
                }
            }
            if (ww3Var3 == null) {
                ww3Var2 = ww3Var;
            } else {
                ww3Var2 = ww3Var3;
            }
        } else {
            ww3Var2 = ww3Var;
        }
        return a(this, ww3Var2, null, null, null, null, null, false, false, false, false, 1022);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu3)) {
            return false;
        }
        yu3 yu3Var = (yu3) obj;
        return dh3.f(this.a, yu3Var.a) && this.b == yu3Var.b && dh3.f(this.c, yu3Var.c) && dh3.f(this.d, yu3Var.d) && this.e.equals(yu3Var.e) && this.f.equals(yu3Var.f) && this.g == yu3Var.g && this.h == yu3Var.h && this.i == yu3Var.i && this.j == yu3Var.j;
    }

    public final int hashCode() {
        ww3 ww3Var = this.a;
        int iHashCode = (ww3Var == null ? 0 : ww3Var.hashCode()) * 31;
        ex4 ex4Var = this.b;
        int iHashCode2 = (iHashCode + (ex4Var == null ? 0 : ex4Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ov3 ov3Var = this.d;
        return Boolean.hashCode(this.j) + pc6.f(pc6.f(pc6.f(p61.f(p61.f((iHashCode3 + (ov3Var != null ? ov3Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "KCallableOverriddenStorage(classTypeParametersSubstitutor=" + this.a + ", modality=" + this.b + ", isStatic=" + this.c + ", originalContainerIfFakeOverride=" + this.d + ", originalCallableTypeParameters=" + this.e + ", overridden=" + this.f + ", forceIsExternal=" + this.g + ", forceIsOperator=" + this.h + ", forceIsInfix=" + this.i + ", forceIsInline=" + this.j + ')';
    }
}
