package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w62 {
    public final ArrayList a;
    public final hv b;
    public final sn0 c;
    public final int d;
    public final Map e;
    public final Integer f;
    public final x62 g;
    public final af h;

    public w62(ArrayList arrayList, hv hvVar, sn0 sn0Var, int i, Map map, Integer num, x62 x62Var, af afVar) {
        this.a = arrayList;
        this.b = hvVar;
        this.c = sn0Var;
        this.d = i;
        this.e = map;
        this.f = num;
        this.g = x62Var;
        this.h = afVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w62) {
            w62 w62Var = (w62) obj;
            if (this.a.equals(w62Var.a) && this.b == w62Var.b && this.c == w62Var.c && this.d == w62Var.d && this.e.equals(w62Var.e) && this.f.equals(w62Var.f) && this.g == w62Var.g && dh3.f(this.h, w62Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + oi0.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (Integer.hashCode(2) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        af afVar = this.h;
        return iHashCode + (afVar == null ? 0 : afVar.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
