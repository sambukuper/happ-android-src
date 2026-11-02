package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cl extends ul {
    public final Constructor E0;

    public cl(pi8 pi8Var, Constructor constructor, yr2 yr2Var, yr2[] yr2VarArr) {
        super(pi8Var, yr2Var, yr2VarArr);
        Objects.requireNonNull(constructor);
        this.E0 = constructor;
    }

    @Override // defpackage.gl
    public final Member B0() {
        return this.E0;
    }

    @Override // defpackage.gl
    public final Object C0(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(this.E0.getDeclaringClass().getName()));
    }

    @Override // defpackage.gl
    public final vj8 E0(yr2 yr2Var) {
        return new cl(this.B0, this.E0, yr2Var, this.D0);
    }

    @Override // defpackage.ul
    public final int G0() {
        return this.E0.getParameterCount();
    }

    @Override // defpackage.ul
    public final dh8 H0(int i) {
        Type[] genericParameterTypes = this.E0.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.B0.d(genericParameterTypes[i]);
    }

    @Override // defpackage.ul
    public final Class I0(int i) {
        Class<?>[] parameterTypes = this.E0.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // defpackage.vj8
    public final int K() {
        return this.E0.getModifiers();
    }

    @Override // defpackage.vj8
    public final String L() {
        return this.E0.getName();
    }

    @Override // defpackage.vj8
    public final Class N() {
        return this.E0.getDeclaringClass();
    }

    @Override // defpackage.vj8
    public final dh8 Q() {
        return this.B0.d(this.E0.getDeclaringClass());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (it0.o(cl.class, obj)) {
            return Objects.equals(this.E0, ((cl) obj).E0);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.E0);
    }

    public final String toString() {
        Constructor constructor = this.E0;
        int parameterCount = constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", it0.u(constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? _UrlKt.FRAGMENT_ENCODE_SET : "s", this.C0);
    }

    @Override // defpackage.gl
    public final Class z0() {
        return this.E0.getDeclaringClass();
    }
}
