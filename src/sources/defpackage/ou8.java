package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ou8 {
    public final wk a;
    public final xx1 b;

    public ou8(wk wkVar, xx1 xx1Var) {
        this.a = wkVar;
        this.b = xx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou8)) {
            return false;
        }
        ou8 ou8Var = (ou8) obj;
        return dh3.f(this.a, ou8Var.a) && dh3.f(this.b, ou8Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
