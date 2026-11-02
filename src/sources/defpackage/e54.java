package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e54 {
    public final t14 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public e54(t14 t14Var, List list, ArrayList arrayList, List list2) {
        this.a = t14Var;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e54)) {
            return false;
        }
        e54 e54Var = (e54) obj;
        return this.a.equals(e54Var.a) && this.b.equals(e54Var.b) && this.c.equals(e54Var.c) && this.d.equals(e54Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pc6.f((this.c.hashCode() + p61.f(this.a.hashCode() * 961, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
