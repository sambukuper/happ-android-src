package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ow {
    public static final dq A;
    public static final dq B;
    public static final dq C;
    public static final /* synthetic */ nw3[] a = {new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new p05(ow.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new p05(ow.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new p05(ow.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new p05(ow.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", 1), new p05(ow.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new p05(ow.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new p05(ow.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new p05(ow.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new p05(ow.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new p05(ow.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new p05(ow.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new p05(ow.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new p05(ow.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new p05(ow.class, "isStatic", "isStatic(Lkotlin/metadata/KmFunction;)Z", 1), new p05(ow.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new p05(ow.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new p05(ow.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new p05(ow.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new p05(ow.class, "isStatic", "isStatic(Lkotlin/metadata/KmProperty;)Z", 1), new p05(ow.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new p05(ow.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new p05(ow.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new p05(ow.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new p05(ow.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new p05(ow.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new p05(ow.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new p05(ow.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new p05(ow.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new p05(ow.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new p05(ow.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new p05(ow.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new p05(ow.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new p05(ow.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new p05(ow.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};
    public static final z47 b;
    public static final z47 c;
    public static final z47 d;
    public static final dq e;
    public static final dq f;
    public static final z47 g;
    public static final z47 h;
    public static final z47 i;
    public static final dq j;
    public static final dq k;
    public static final dq l;
    public static final dq m;
    public static final dq n;
    public static final dq o;
    public static final z47 p;
    public static final z47 q;
    public static final dq r;
    public static final dq s;
    public static final dq t;
    public static final z47 u;
    public static final z47 v;
    public static final dq w;
    public static final dq x;
    public static final dq y;
    public static final dq z;

    static {
        byte b2 = 0;
        jd2 jd2Var = md2.c;
        jd2Var.getClass();
        id2 id2Var = new id2(jd2Var, 1);
        bd2 bd2Var = bd2.X;
        if (id2Var.b != 1 || id2Var.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var, " was passed"));
            return;
        }
        id2 id2Var2 = new id2(jd2Var, 1);
        int i2 = cd2.X;
        if (id2Var2.b != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var2, " was passed"));
            return;
        }
        id2 id2Var3 = new id2(jd2Var, 1);
        dd2 dd2Var = dd2.X;
        if (id2Var3.b != 1 || id2Var3.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var3, " was passed"));
            return;
        }
        id2 id2Var4 = new id2(jd2Var, 1);
        fd2 fd2Var = fd2.X;
        if (id2Var4.b != 1 || id2Var4.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var4, " was passed"));
            return;
        }
        id2 id2Var5 = new id2(jd2Var, 1);
        ed2 ed2Var = ed2.X;
        if (id2Var5.b != 1 || id2Var5.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var5, " was passed"));
            return;
        }
        id2 id2Var6 = new id2(jd2Var, 1);
        hd2 hd2Var = hd2.X;
        if (id2Var6.b != 1 || id2Var6.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var6, " was passed"));
            return;
        }
        id2 id2Var7 = new id2(jd2Var, 1);
        int i3 = wv.g0;
        if (id2Var7.b != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var7, " was passed"));
            return;
        }
        b = pu.B(dw.X);
        c = pu.W(mw.X);
        zv zvVar = zv.X;
        kd2 kd2Var = md2.f;
        kd2Var.getClass();
        n22 n22Var = ts0.l0;
        ArrayList arrayList = new ArrayList(xv0.Z(n22Var, 10));
        w1 w1Var = new w1(n22Var, b2);
        while (w1Var.hasNext()) {
            arrayList.add(((ts0) w1Var.next()).X);
        }
        d = new z47(zvVar, kd2Var, n22Var, arrayList);
        jd2 jd2Var2 = md2.g;
        jd2Var2.getClass();
        id2 id2Var8 = new id2(jd2Var2, 1);
        bd2 bd2Var2 = bd2.X;
        e = new dq(bd2Var2, id2Var8);
        jd2 jd2Var3 = md2.h;
        jd2Var3.getClass();
        id2 id2Var9 = new id2(jd2Var3, 1);
        if (id2Var9.b != 1 || id2Var9.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var9, " was passed"));
            return;
        }
        jd2 jd2Var4 = md2.i;
        jd2Var4.getClass();
        id2 id2Var10 = new id2(jd2Var4, 1);
        if (id2Var10.b != 1 || id2Var10.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var10, " was passed"));
            return;
        }
        jd2 jd2Var5 = md2.j;
        jd2Var5.getClass();
        id2 id2Var11 = new id2(jd2Var5, 1);
        if (id2Var11.b != 1 || id2Var11.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var11, " was passed"));
            return;
        }
        jd2 jd2Var6 = md2.k;
        jd2Var6.getClass();
        f = new dq(bd2Var2, new id2(jd2Var6, 1));
        jd2 jd2Var7 = md2.l;
        jd2Var7.getClass();
        id2 id2Var12 = new id2(jd2Var7, 1);
        if (id2Var12.b != 1 || id2Var12.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var12, " was passed"));
            return;
        }
        jd2 jd2Var8 = md2.m;
        jd2Var8.getClass();
        id2 id2Var13 = new id2(jd2Var8, 1);
        if (id2Var13.b != 1 || id2Var13.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var13, " was passed"));
            return;
        }
        g = pu.W(nw.X);
        jd2 jd2Var9 = md2.n;
        jd2Var9.getClass();
        id2 id2Var14 = new id2(jd2Var9, 1);
        int i4 = cd2.X;
        if (id2Var14.b != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var14, " was passed"));
            return;
        }
        jd2 jd2Var10 = md2.o;
        jd2Var10.getClass();
        id2 id2Var15 = new id2(jd2Var10, 1);
        if (id2Var15.b != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var15, " was passed"));
            return;
        }
        gw gwVar = gw.X;
        kd2 kd2Var2 = md2.p;
        kd2Var2.getClass();
        pu.L(gwVar, kd2Var2);
        pu.A(aw.X);
        h = pu.W(iw.X);
        i = pu.B(ew.X);
        jd2 jd2Var11 = md2.r;
        jd2Var11.getClass();
        id2 id2Var16 = new id2(jd2Var11, 1);
        dd2 dd2Var2 = dd2.X;
        j = new dq(dd2Var2, id2Var16);
        jd2 jd2Var12 = md2.s;
        jd2Var12.getClass();
        k = new dq(dd2Var2, new id2(jd2Var12, 1));
        jd2 jd2Var13 = md2.t;
        jd2Var13.getClass();
        l = new dq(dd2Var2, new id2(jd2Var13, 1));
        jd2 jd2Var14 = md2.u;
        jd2Var14.getClass();
        id2 id2Var17 = new id2(jd2Var14, 1);
        if (id2Var17.b != 1 || id2Var17.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var17, " was passed"));
            return;
        }
        jd2 jd2Var15 = md2.v;
        jd2Var15.getClass();
        m = new dq(dd2Var2, new id2(jd2Var15, 1));
        jd2 jd2Var16 = md2.w;
        jd2Var16.getClass();
        n = new dq(dd2Var2, new id2(jd2Var16, 1));
        jd2 jd2Var17 = md2.x;
        jd2Var17.getClass();
        id2 id2Var18 = new id2(jd2Var17, 1);
        if (id2Var18.b != 1 || id2Var18.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var18, " was passed"));
            return;
        }
        jd2 jd2Var18 = md2.y;
        jd2Var18.getClass();
        id2 id2Var19 = new id2(jd2Var18, 1);
        if (id2Var19.b != 1 || id2Var19.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var19, " was passed"));
            return;
        }
        hw hwVar = hw.X;
        kd2 kd2Var3 = md2.z;
        kd2Var3.getClass();
        pu.L(hwVar, kd2Var3);
        jd2 jd2Var19 = md2.A;
        jd2Var19.getClass();
        o = new dq(dd2Var2, new id2(jd2Var19, 1));
        p = pu.W(jw.X);
        q = pu.B(bw.X);
        pu.A(yv.X);
        jd2 jd2Var20 = md2.B;
        jd2Var20.getClass();
        id2 id2Var20 = new id2(jd2Var20, 1);
        fd2 fd2Var2 = fd2.X;
        r = new dq(fd2Var2, id2Var20);
        jd2 jd2Var21 = md2.E;
        jd2Var21.getClass();
        id2 id2Var21 = new id2(jd2Var21, 1);
        if (id2Var21.b != 1 || id2Var21.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var21, " was passed"));
            return;
        }
        jd2 jd2Var22 = md2.F;
        jd2Var22.getClass();
        id2 id2Var22 = new id2(jd2Var22, 1);
        if (id2Var22.b != 1 || id2Var22.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var22, " was passed"));
            return;
        }
        jd2 jd2Var23 = md2.G;
        jd2Var23.getClass();
        id2 id2Var23 = new id2(jd2Var23, 1);
        if (id2Var23.b != 1 || id2Var23.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var23, " was passed"));
            return;
        }
        jd2 jd2Var24 = md2.H;
        jd2Var24.getClass();
        id2 id2Var24 = new id2(jd2Var24, 1);
        if (id2Var24.b != 1 || id2Var24.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var24, " was passed"));
            return;
        }
        jd2 jd2Var25 = md2.I;
        jd2Var25.getClass();
        s = new dq(fd2Var2, new id2(jd2Var25, 1));
        jd2 jd2Var26 = md2.J;
        jd2Var26.getClass();
        id2 id2Var25 = new id2(jd2Var26, 1);
        if (id2Var25.b != 1 || id2Var25.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var25, " was passed"));
            return;
        }
        fw fwVar = fw.X;
        kd2 kd2Var4 = md2.K;
        kd2Var4.getClass();
        pu.L(fwVar, kd2Var4);
        jd2 jd2Var27 = md2.L;
        jd2Var27.getClass();
        t = new dq(fd2Var2, new id2(jd2Var27, 1));
        u = pu.W(kw.X);
        v = pu.B(cw.X);
        jd2 jd2Var28 = md2.P;
        jd2Var28.getClass();
        id2 id2Var26 = new id2(jd2Var28, 1);
        ed2 ed2Var2 = ed2.X;
        if (id2Var26.b != 1 || id2Var26.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var26, " was passed"));
            return;
        }
        jd2 jd2Var29 = md2.Q;
        jd2Var29.getClass();
        w = new dq(ed2Var2, new id2(jd2Var29, 1));
        jd2 jd2Var30 = md2.R;
        jd2Var30.getClass();
        x = new dq(ed2Var2, new id2(jd2Var30, 1));
        id2 id2Var27 = new id2(0, 1, 1);
        gd2 gd2Var = gd2.X;
        y = new dq(gd2Var, id2Var27);
        jd2 jd2Var31 = md2.a;
        z = new dq(gd2Var, new id2(jd2Var31.b + 1, jd2Var31.c, 1));
        jd2 jd2Var32 = md2.b;
        A = new dq(gd2Var, new id2(jd2Var32.b + 1, jd2Var32.c, 1));
        B = new dq(xv.X, new id2(0, 1, 1));
        pu.W(lw.X);
        jd2 jd2Var33 = md2.M;
        jd2Var33.getClass();
        C = new dq(hd2.X, new id2(jd2Var33, 1));
        jd2 jd2Var34 = md2.N;
        jd2Var34.getClass();
        id2 id2Var28 = new id2(jd2Var34, 1);
        if (id2Var28.b != 1 || id2Var28.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var28, " was passed"));
            return;
        }
        jd2 jd2Var35 = md2.O;
        jd2Var35.getClass();
        id2 id2Var29 = new id2(jd2Var35, 1);
        if (id2Var29.b != 1 || id2Var29.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var29, " was passed"));
            return;
        }
        int i5 = wv.g0;
        jd2 jd2Var36 = md2.S;
        jd2Var36.getClass();
        id2 id2Var30 = new id2(jd2Var36, 1);
        if (id2Var30.b != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var30, " was passed"));
            return;
        }
        int i6 = wv.g0;
        jd2 jd2Var37 = md2.T;
        jd2Var37.getClass();
        id2 id2Var31 = new id2(jd2Var37, 1);
        if (id2Var31.b == 1) {
            return;
        }
        em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var31, " was passed"));
    }

    public static final ts0 a(yy3 yy3Var) {
        return (ts0) d.J(a[9], yy3Var);
    }

    public static final gz8 b(kz3 kz3Var) {
        kz3Var.getClass();
        return (gz8) p.J(a[34], kz3Var);
    }
}
