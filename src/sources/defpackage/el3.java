package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class el3 {
    public static final fk2 a;
    public static final fk2[] b;
    public static final zz2 c;
    public static final fl3 d;

    static {
        fk2 fk2Var = new fk2("org.jspecify.nullness");
        fk2 fk2Var2 = new fk2("org.jspecify.annotations");
        a = fk2Var2;
        fk2 fk2Var3 = new fk2("io.reactivex.rxjava3.annotations");
        fk2 fk2Var4 = new fk2("org.checkerframework.checker.nullness.compatqual");
        String str = fk2Var3.a.a;
        b = new fk2[]{new fk2(pc6.o(str, ".Nullable")), new fk2(pc6.o(str, ".NonNull"))};
        fk2 fk2Var5 = new fk2("org.jetbrains.annotations");
        fl3 fl3Var = fl3.d;
        qg5 qg5Var = new qg5(fk2Var5, fl3Var);
        qg5 qg5Var2 = new qg5(new fk2("kotlin.annotations.jvm"), fl3Var);
        qg5 qg5Var3 = new qg5(new fk2("androidx.annotation"), fl3Var);
        qg5 qg5Var4 = new qg5(new fk2("android.support.annotation"), fl3Var);
        qg5 qg5Var5 = new qg5(new fk2("android.annotation"), fl3Var);
        qg5 qg5Var6 = new qg5(new fk2("com.android.annotations"), fl3Var);
        qg5 qg5Var7 = new qg5(new fk2("org.eclipse.jdt.annotation"), fl3Var);
        qg5 qg5Var8 = new qg5(new fk2("org.checkerframework.checker.nullness.qual"), fl3Var);
        qg5 qg5Var9 = new qg5(fk2Var4, fl3Var);
        qg5 qg5Var10 = new qg5(new fk2("javax.annotation"), fl3Var);
        qg5 qg5Var11 = new qg5(new fk2("edu.umd.cs.findbugs.annotations"), fl3Var);
        qg5 qg5Var12 = new qg5(new fk2("io.reactivex.annotations"), fl3Var);
        fk2 fk2Var6 = new fk2("androidx.annotation.RecentlyNullable");
        je6 je6Var = je6.WARN;
        qg5 qg5Var13 = new qg5(fk2Var6, new fl3(je6Var, 4));
        qg5 qg5Var14 = new qg5(new fk2("androidx.annotation.RecentlyNonNull"), new fl3(je6Var, 4));
        qg5 qg5Var15 = new qg5(new fk2("lombok"), fl3Var);
        b24 b24Var = new b24(2, 1, 0);
        je6 je6Var2 = je6.STRICT;
        c = new zz2(zp4.J(qg5Var, qg5Var2, qg5Var3, qg5Var4, qg5Var5, qg5Var6, qg5Var7, qg5Var8, qg5Var9, qg5Var10, qg5Var11, qg5Var12, qg5Var13, qg5Var14, qg5Var15, new qg5(fk2Var, new fl3(je6Var, b24Var, je6Var2)), new qg5(fk2Var2, new fl3(je6Var, new b24(2, 1, 0), je6Var2)), new qg5(fk2Var3, new fl3(je6Var, new b24(1, 8, 0), je6Var2)), new qg5(new fk2("jakarta.annotation"), new fl3(je6Var, new b24(2, 4, 0), je6Var2)), new qg5(ks3.l, new fl3(je6Var, new b24(2, 5, 0), je6Var2)), new qg5(ks3.m, new fl3(je6Var, new b24(2, 5, 0), je6Var2)), new qg5(new fk2("io.vertx.codegen.annotations"), new fl3(je6Var, new b24(2, 5, 0), je6Var2))));
        d = new fl3(je6Var, 4);
    }
}
