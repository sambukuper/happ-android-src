package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nd0 implements xu3, Serializable, h04 {
    public static final Object NO_RECEIVER = md0.Y;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient xu3 reflected;
    private final String signature;

    public nd0(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.wu3
    public final List Q() {
        return V().Q();
    }

    public abstract xu3 S();

    public final Object T() {
        return this.receiver;
    }

    public final mv3 U() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? yb6.a.c(cls) : yb6.a.b(cls);
    }

    public xu3 V() {
        xu3 xu3VarF = f();
        if (xu3VarF != this) {
            return xu3VarF;
        }
        throw new q14();
    }

    public final String a() {
        return this.signature;
    }

    public xu3 f() {
        xu3 xu3Var = this.reflected;
        if (xu3Var != null) {
            return xu3Var;
        }
        xu3 xu3VarS = S();
        this.reflected = xu3VarS;
        return xu3VarS;
    }

    @Override // defpackage.xu3
    public final List g() {
        return V().g();
    }

    @Override // defpackage.xu3
    public final String getName() {
        return this.name;
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return V().j();
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(U(), this.signature);
    }
}
