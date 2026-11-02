package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i57 {
    public final int a;
    public final List b;
    public final ArrayList c;
    public final Executor d;
    public final sn0 e;
    public final int f;
    public final Map g;

    public i57(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, sn0 sn0Var, int i2, Map map) {
        executor.getClass();
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = sn0Var;
        this.f = i2;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i57) {
            i57 i57Var = (i57) obj;
            if (this.a == i57Var.a && dh3.f(this.b, i57Var.b) && this.c.equals(i57Var.c) && dh3.f(this.d, i57Var.d) && this.e == i57Var.e && this.f == i57Var.f && this.g.equals(i57Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return (this.g.hashCode() + oi0.e(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31, 31)) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=null)";
    }
}
