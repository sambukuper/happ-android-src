package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yu {
    public final v76 a;
    public final v63 b;
    public final xu c;

    public yu(xu xuVar, v63 v63Var, v76 v76Var) {
        this.a = v76Var;
        this.b = v63Var;
        this.c = xuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        if (this.a != yuVar.a) {
            return false;
        }
        xu xuVar = yuVar.c;
        xu xuVar2 = this.c;
        return dh3.f(xuVar2, xuVar) && xuVar2.a(this.b, yuVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xu xuVar = this.c;
        return xuVar.b(this.b) + ((xuVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
