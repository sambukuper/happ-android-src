package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nx5 extends nd0 implements nw3 {
    private final boolean syntheticJavaProperty;

    public nx5(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.nd0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final nw3 V() {
        if (!this.syntheticJavaProperty) {
            return (nw3) super.V();
        }
        u52.k("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx5) {
            nx5 nx5Var = (nx5) obj;
            return U().equals(nx5Var.U()) && getName().equals(nx5Var.getName()) && a().equals(nx5Var.a()) && dh3.f(this.receiver, nx5Var.receiver);
        }
        if (obj instanceof nw3) {
            return obj.equals(f());
        }
        return false;
    }

    @Override // defpackage.nd0
    public final xu3 f() {
        return this.syntheticJavaProperty ? this : super.f();
    }

    public final int hashCode() {
        return a().hashCode() + ((getName().hashCode() + (U().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xu3 xu3VarF = f();
        if (xu3VarF != this) {
            return xu3VarF.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
