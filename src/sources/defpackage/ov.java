package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ov implements k06 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ov(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return k06.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k06)) {
            return false;
        }
        k06 k06Var = (k06) obj;
        return this.a == k06Var.tag() && j06.X.equals(k06Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (j06.X.hashCode() ^ 2041407134);
    }

    @Override // defpackage.k06
    public final j06 intEncoding() {
        return j06.X;
    }

    @Override // defpackage.k06
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + j06.X + ')';
    }
}
