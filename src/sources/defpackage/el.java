package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class el extends gl {
    public final transient Field D0;

    public el(pi8 pi8Var, Field field, yr2 yr2Var) {
        super(pi8Var, yr2Var);
        this.D0 = field;
    }

    @Override // defpackage.gl
    public final Member B0() {
        return this.D0;
    }

    @Override // defpackage.gl
    public final Object C0(Object obj) {
        try {
            return this.D0.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + A0() + ": " + e.getMessage(), e);
        }
    }

    @Override // defpackage.gl
    public final vj8 E0(yr2 yr2Var) {
        return new el(this.B0, this.D0, yr2Var);
    }

    @Override // defpackage.vj8
    public final int K() {
        return this.D0.getModifiers();
    }

    @Override // defpackage.vj8
    public final String L() {
        return this.D0.getName();
    }

    @Override // defpackage.vj8
    public final Class N() {
        return this.D0.getType();
    }

    @Override // defpackage.vj8
    public final dh8 Q() {
        return this.B0.d(this.D0.getGenericType());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (it0.o(el.class, obj)) {
            return this.D0.equals(((el) obj).D0);
        }
        return false;
    }

    public final int hashCode() {
        return this.D0.hashCode();
    }

    public final String toString() {
        return "[field " + A0() + "]";
    }

    @Override // defpackage.gl
    public final Class z0() {
        return this.D0.getDeclaringClass();
    }
}
