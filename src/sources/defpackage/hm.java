package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hm implements gm {
    public final t14 a;
    public final Map b;
    public final ke7 c;

    public hm(aa7 aa7Var, Map map, ke7 ke7Var) {
        if (aa7Var == null) {
            a(0);
            throw null;
        }
        this.a = aa7Var;
        this.b = map;
        this.c = ke7Var;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.gm
    public final t14 c() {
        t14 t14Var = this.a;
        if (t14Var != null) {
            return t14Var;
        }
        a(3);
        throw null;
    }

    @Override // defpackage.gm
    public final fk2 d() {
        sx4 sx4VarD = el1.d(this);
        if (sx4VarD != null) {
            if (u32.f(sx4VarD)) {
                sx4VarD = null;
            }
            if (sx4VarD != null) {
                return el1.c(sx4VarD);
            }
        }
        return null;
    }

    @Override // defpackage.gm
    public final Map e() {
        return this.b;
    }

    @Override // defpackage.gm
    public final ke7 getSource() {
        return this.c;
    }

    public final String toString() {
        return wk1.c.o(this, null);
    }
}
