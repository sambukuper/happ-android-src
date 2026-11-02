package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cv3 extends nv3 {
    public static final /* synthetic */ nw3[] r = {new lx5(cv3.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new lx5(cv3.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new lx5(cv3.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new lx5(cv3.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new lx5(cv3.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new lx5(cv3.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new lx5(cv3.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new lx5(cv3.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new lx5(cv3.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new lx5(cv3.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new lx5(cv3.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new lx5(cv3.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new lx5(cv3.class, "fakeOverrideMembers", "getFakeOverrideMembers()Ljava/util/Map;", 0)};
    public final g44 c;
    public final tb6 d;
    public final tb6 e;
    public final tb6 f;
    public final tb6 g;
    public final tb6 h;
    public final tb6 i;
    public final tb6 j;
    public final tb6 k;
    public final g44 l;
    public final g44 m;
    public final tb6 n;
    public final tb6 o;
    public final tb6 p;
    public final /* synthetic */ ev3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv3(ev3 ev3Var) {
        super(ev3Var);
        this.q = ev3Var;
        bv3 bv3Var = new bv3(ev3Var, this, (byte) 0);
        w74 w74Var = w74.X;
        this.c = x97.P(w74Var, bv3Var);
        byte b = 2;
        this.d = zc1.X(null, new av3(ev3Var, b));
        byte b2 = 3;
        this.e = zc1.X(null, new av3(ev3Var, this, b2));
        byte b3 = 4;
        this.f = zc1.X(null, new av3(ev3Var, this, b3));
        byte b4 = 5;
        this.g = zc1.X(null, new av3(ev3Var, b4));
        this.h = zc1.X(null, new bv3(ev3Var, this, b4));
        zc1.X(null, new bv3(this, ev3Var, (byte) 6));
        x97.P(w74Var, new bv3(this, ev3Var, (byte) 7));
        this.i = zc1.X(null, new bv3(this, ev3Var, (byte) 8));
        this.j = zc1.X(null, new bv3(this, ev3Var, (byte) 9));
        byte b5 = 1;
        this.k = zc1.X(null, new bv3(ev3Var, this, b5));
        zc1.X(null, new bv3(ev3Var, this, b));
        this.l = x97.P(w74Var, new bv3(this, ev3Var, b2));
        this.m = x97.P(w74Var, new av3(ev3Var, b5));
        int i = 1;
        int i2 = 0;
        Class<gv3> cls = gv3.class;
        this.n = zc1.X(null, new ub(i2, ev3Var, cls, "computeDeclaredMembers", "computeDeclaredMembers(Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/util/Collection;", i, (byte) 17));
        this.o = zc1.X(null, new ub(i2, ev3Var, cls, "computeAllMembers", "computeAllMembers(Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/util/Collection;", i, (byte) 16));
        this.p = zc1.X(null, new bv3(ev3Var, this, b3));
    }

    public final Collection a() {
        nw3 nw3Var = r[10];
        Object objInvoke = this.n.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    public final sx4 b() {
        nw3 nw3Var = r[0];
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (sx4) objInvoke;
    }

    public final yy3 c() {
        return (yy3) this.c.getValue();
    }

    public final li8 d() {
        nw3 nw3Var = r[7];
        Object objInvoke = this.j.invoke();
        objInvoke.getClass();
        return (li8) objInvoke;
    }
}
