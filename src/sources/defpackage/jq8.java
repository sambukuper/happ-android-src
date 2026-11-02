package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jq8 {
    public final gn2 a;
    public final st2 b;
    public final h57 c;
    public final g44 d;

    public jq8(gn2 gn2Var, st2 st2Var, h57 h57Var, g44 g44Var) {
        gn2Var.getClass();
        this.a = gn2Var;
        this.b = st2Var;
        this.c = h57Var;
        this.d = g44Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jq8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        jq8 jq8Var = (jq8) obj;
        return this.c == jq8Var.c && this.b == jq8Var.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.a + ", graphStateToCameraStateAdapter=" + this.b + ", sessionConfigAdapter=" + this.c + ", sessionProcessor=null, lazyCreationResult=" + this.d + ')';
    }
}
