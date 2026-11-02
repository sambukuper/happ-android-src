package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 implements yk1 {
    public static final /* synthetic */ nw3[] Z = {new p05(zk1.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new p05(zk1.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new p05(zk1.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new p05(zk1.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new p05(zk1.class, "startFromName", "getStartFromName()Z", 0), new p05(zk1.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new p05(zk1.class, "debugMode", "getDebugMode()Z", 0), new p05(zk1.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new p05(zk1.class, "verbose", "getVerbose()Z", 0), new p05(zk1.class, "unitReturnType", "getUnitReturnType()Z", 0), new p05(zk1.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new p05(zk1.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new p05(zk1.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new p05(zk1.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new p05(zk1.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new p05(zk1.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new p05(zk1.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new p05(zk1.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new p05(zk1.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new p05(zk1.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new p05(zk1.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new p05(zk1.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new p05(zk1.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new p05(zk1.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new p05(zk1.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new p05(zk1.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new p05(zk1.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new p05(zk1.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new p05(zk1.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new p05(zk1.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new p05(zk1.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new p05(zk1.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new p05(zk1.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new p05(zk1.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new p05(zk1.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new p05(zk1.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new p05(zk1.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new p05(zk1.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new p05(zk1.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new p05(zk1.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new p05(zk1.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new p05(zk1.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new p05(zk1.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new p05(zk1.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new p05(zk1.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new p05(zk1.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new p05(zk1.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new p05(zk1.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new p05(zk1.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new p05(zk1.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    public final mj0 A;
    public final mj0 B;
    public final mj0 C;
    public final mj0 D;
    public final mj0 E;
    public final mj0 F;
    public final mj0 G;
    public final mj0 H;
    public final mj0 I;
    public final mj0 J;
    public final mj0 K;
    public final mj0 L;
    public final mj0 M;
    public final mj0 N;
    public final mj0 O;
    public final mj0 P;
    public final mj0 Q;
    public final mj0 R;
    public final mj0 S;
    public final mj0 T;
    public final mj0 U;
    public final mj0 V;
    public final mj0 W;
    public final mj0 X;
    public final mj0 Y;
    public boolean a;
    public final mj0 b;
    public final mj0 c;
    public final mj0 d;
    public final mj0 e;
    public final mj0 f;
    public final mj0 g;
    public final mj0 h;
    public final mj0 i;
    public final mj0 j;
    public final mj0 k;
    public final mj0 l;
    public final mj0 m;
    public final mj0 n;
    public final mj0 o;
    public final mj0 p;
    public final mj0 q;
    public final mj0 r;
    public final mj0 s;
    public final mj0 t;
    public final mj0 u;
    public final mj0 v;
    public final mj0 w;
    public final mj0 x;
    public final mj0 y;
    public final mj0 z;

    public zk1() {
        byte b = 15;
        this.b = new mj0(qt0.d, this, b);
        Boolean bool = Boolean.TRUE;
        this.c = new mj0(bool, this, b);
        this.d = new mj0(bool, this, b);
        this.e = new mj0(xk1.Y, this, b);
        Boolean bool2 = Boolean.FALSE;
        this.f = new mj0(bool2, this, b);
        this.g = new mj0(bool2, this, b);
        this.h = new mj0(bool2, this, b);
        this.i = new mj0(bool2, this, b);
        this.j = new mj0(bool2, this, b);
        this.k = new mj0(bool, this, b);
        this.l = new mj0(bool2, this, b);
        this.m = new mj0(bool2, this, b);
        this.n = new mj0(bool2, this, b);
        this.o = new mj0(bool, this, b);
        this.p = new mj0(bool, this, b);
        this.q = new mj0(bool2, this, b);
        this.r = new mj0(bool2, this, b);
        this.s = new mj0(bool2, this, b);
        this.t = new mj0(bool2, this, b);
        this.u = new mj0(bool2, this, b);
        Object obj = null;
        this.v = new mj0(obj, this, b);
        this.w = new mj0(bool2, this, b);
        this.x = new mj0(bool2, this, b);
        this.y = new mj0(ag.F0, this, b);
        this.z = new mj0(ag.G0, this, b);
        this.A = new mj0(bool, this, b);
        this.B = new mj0(ff5.Y, this, b);
        this.C = new mj0(sk1.a, this, b);
        this.D = new mj0(ae6.X, this, b);
        this.E = new mj0(ah5.X, this, b);
        this.F = new mj0(bool2, this, b);
        this.G = new mj0(bool2, this, b);
        this.H = new mj0(dx5.X, this, b);
        this.I = new mj0(bool2, this, b);
        this.J = new mj0(bool2, this, b);
        this.K = new mj0(m02.X, this, b);
        this.L = new mj0(n52.a, this, b);
        this.M = new mj0(obj, this, b);
        this.N = new mj0(wl.NO_ARGUMENTS, this, b);
        this.O = new mj0(bool2, this, b);
        this.P = new mj0(bool, this, b);
        this.Q = new mj0(bool, this, b);
        this.R = new mj0(bool2, this, b);
        this.S = new mj0(bool2, this, b);
        this.T = new mj0(bool, this, b);
        this.U = new mj0(bool, this, b);
        this.V = new mj0(bool2, this, b);
        this.W = new mj0(bool2, this, b);
        this.X = new mj0(bool2, this, b);
        this.Y = new mj0(bool, this, b);
    }

    public final boolean A() {
        nw3 nw3Var = Z[4];
        mj0 mj0Var = this.f;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final ae6 B() {
        nw3 nw3Var = Z[28];
        mj0 mj0Var = this.D;
        mj0Var.getClass();
        nw3Var.getClass();
        return (ae6) mj0Var.Y;
    }

    public final sk1 C() {
        nw3 nw3Var = Z[27];
        mj0 mj0Var = this.C;
        mj0Var.getClass();
        nw3Var.getClass();
        return (sk1) mj0Var.Y;
    }

    public final boolean D() {
        nw3 nw3Var = Z[8];
        mj0 mj0Var = this.j;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final boolean E() {
        nw3 nw3Var = Z[21];
        mj0 mj0Var = this.w;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final void F(Set set) {
        set.getClass();
        this.L.Y(Z[36], set);
    }

    @Override // defpackage.yk1
    public final void a(boolean z) {
        this.f.Y(Z[4], Boolean.valueOf(z));
    }

    @Override // defpackage.yk1
    public final void b(Set set) {
        set.getClass();
        this.e.Y(Z[3], set);
    }

    @Override // defpackage.yk1
    public final void c(boolean z) {
        this.c.Y(Z[1], Boolean.valueOf(z));
    }

    @Override // defpackage.yk1
    public final void d(ae6 ae6Var) {
        ae6Var.getClass();
        this.D.Y(Z[28], ae6Var);
    }

    @Override // defpackage.yk1
    public final void e(boolean z) {
        this.x.Y(Z[22], Boolean.valueOf(z));
    }

    @Override // defpackage.yk1
    public final void f(boolean z) {
        this.h.Y(Z[6], Boolean.valueOf(z));
    }

    @Override // defpackage.yk1
    public final void g(boolean z) {
        this.G.Y(Z[31], Boolean.valueOf(z));
    }

    @Override // defpackage.yk1
    public final void h(boolean z) {
        this.F.Y(Z[30], Boolean.valueOf(z));
    }

    @Override // defpackage.yk1
    public final void i(ah5 ah5Var) {
        ah5Var.getClass();
        this.E.Y(Z[29], ah5Var);
    }

    @Override // defpackage.yk1
    public final void j(qt0 qt0Var) {
        qt0Var.getClass();
        this.b.Y(Z[0], qt0Var);
    }

    @Override // defpackage.yk1
    public final void k(boolean z) {
        this.w.Y(Z[21], Boolean.valueOf(z));
    }

    public final boolean l() {
        nw3 nw3Var = Z[39];
        mj0 mj0Var = this.O;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final wl m() {
        nw3 nw3Var = Z[38];
        mj0 mj0Var = this.N;
        mj0Var.getClass();
        nw3Var.getClass();
        return (wl) mj0Var.Y;
    }

    public final boolean n() {
        nw3 nw3Var = Z[48];
        mj0 mj0Var = this.X;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final qt0 o() {
        Z[0].getClass();
        return (qt0) this.b.Y;
    }

    public final boolean p() {
        nw3 nw3Var = Z[6];
        mj0 mj0Var = this.h;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final gn2 q() {
        nw3 nw3Var = Z[24];
        mj0 mj0Var = this.z;
        mj0Var.getClass();
        nw3Var.getClass();
        return (gn2) mj0Var.Y;
    }

    public final boolean r() {
        nw3 nw3Var = Z[11];
        mj0 mj0Var = this.m;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final Set s() {
        nw3 nw3Var = Z[36];
        mj0 mj0Var = this.L;
        mj0Var.getClass();
        nw3Var.getClass();
        return (Set) mj0Var.Y;
    }

    public final boolean t() {
        nw3 nw3Var = Z[44];
        mj0 mj0Var = this.T;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final Set u() {
        nw3 nw3Var = Z[3];
        mj0 mj0Var = this.e;
        mj0Var.getClass();
        nw3Var.getClass();
        return (Set) mj0Var.Y;
    }

    public final ff5 v() {
        nw3 nw3Var = Z[26];
        mj0 mj0Var = this.B;
        mj0Var.getClass();
        nw3Var.getClass();
        return (ff5) mj0Var.Y;
    }

    public final dx5 w() {
        nw3 nw3Var = Z[32];
        mj0 mj0Var = this.H;
        mj0Var.getClass();
        nw3Var.getClass();
        return (dx5) mj0Var.Y;
    }

    public final boolean x() {
        nw3 nw3Var = Z[13];
        mj0 mj0Var = this.o;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final boolean y() {
        nw3 nw3Var = Z[25];
        mj0 mj0Var = this.A;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }

    public final boolean z() {
        nw3 nw3Var = Z[5];
        mj0 mj0Var = this.g;
        mj0Var.getClass();
        nw3Var.getClass();
        return ((Boolean) mj0Var.Y).booleanValue();
    }
}
