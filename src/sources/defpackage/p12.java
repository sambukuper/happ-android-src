package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p12 implements gm {
    public static final p12 a = new p12();

    @Override // defpackage.gm
    public final t14 c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
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
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.gm
    public final ke7 getSource() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
