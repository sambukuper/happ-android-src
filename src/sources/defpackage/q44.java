package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q44 implements dn2 {
    public final /* synthetic */ byte X = 0;
    public final z47 Y;
    public final t44 Z;

    public q44(t44 t44Var, z47 z47Var) {
        this.Z = t44Var;
        this.Y = z47Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [gs0, jo2, yj3] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [t44] */
    /* JADX WARN: Type inference failed for: r8v6, types: [t44] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.dn2
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        ta6 ta6Var;
        sx4 sx4Var;
        Class cls;
        ArrayList arrayList;
        zi8 zi8Var;
        List listM;
        ?? arrayList2;
        ?? r9;
        ?? r8;
        qg5 qg5Var;
        List listD;
        byte b = this.X;
        z47 z47Var = this.Y;
        switch (b) {
            case 0:
                rm rmVar = oy1.f0;
                t44 t44Var = this.Z;
                ta6 ta6Var2 = t44Var.o;
                z47 z47Var2 = t44Var.b;
                sx4 sx4Var2 = t44Var.n;
                Constructor<?>[] declaredConstructors = ta6Var2.a.getDeclaredConstructors();
                declaredConstructors.getClass();
                boolean z = false;
                List<wa6> listN0 = w27.n0(w27.l0(new la2(eu.Y(declaredConstructors), false, oa6.X), pa6.X));
                ArrayList arrayList3 = new ArrayList(listN0.size());
                for (wa6 wa6Var : listN0) {
                    yj3 yj3VarX0 = yj3.X0(sx4Var2, hi5.w0(z47Var2, wa6Var), z, lh4.Z0(wa6Var));
                    z47 z47Var3 = new z47((c6) z47Var2.Y, new xm0(z47Var2, yj3VarX0, wa6Var, sx4Var2.k0().size()), (g44) z47Var2.f0);
                    Constructor constructor = wa6Var.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listD = d02.X;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) eu.k0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            u52.r(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) eu.k0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = wa6Var.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    fj2 fj2VarU = f54.u(z47Var3, yj3VarX0, listD);
                    List listK0 = sx4Var2.k0();
                    listK0.getClass();
                    ArrayList typeParameters = wa6Var.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(xv0.Z(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        t44 t44Var2 = t44Var;
                        hi8 hi8VarM = ((ki8) z47Var3.Z).M((hb6) it.next());
                        hi8VarM.getClass();
                        arrayList4.add(hi8VarM);
                        t44Var = t44Var2;
                    }
                    yj3VarX0.V0(fj2VarU.a, s08.k(wa6Var.e()), wv0.H0(listK0, arrayList4));
                    yj3VarX0.N0(false);
                    yj3VarX0.O0(fj2VarU.b);
                    yj3VarX0.P0(sx4Var2.X());
                    arrayList3.add(yj3VarX0);
                    t44Var = t44Var;
                    z = false;
                }
                t44 t44Var3 = t44Var;
                boolean zG = ta6Var2.g();
                Class cls2 = ta6Var2.a;
                zi8 zi8Var2 = zi8.Y;
                if (zG) {
                    Object obj = z47Var2.Y;
                    yj3 yj3VarX1 = yj3.X0(sx4Var2, rmVar, true, lh4.Z0(ta6Var2));
                    ArrayList<fb6> arrayListF = ta6Var2.f();
                    ArrayList arrayList5 = new ArrayList(arrayListF.size());
                    boolean z2 = false;
                    Object obj2 = null;
                    nl3 nl3VarU = pu.U(zi8Var2, false, null, 6);
                    int i = 0;
                    for (fb6 fb6Var : arrayListF) {
                        ArrayList arrayList6 = arrayList5;
                        Class cls3 = cls2;
                        yj3 yj3Var = yj3VarX1;
                        arrayList6.add(new ot8(yj3Var, null, i, rmVar, fb6Var.c(), ((f63) z47Var2.g0).C(fb6Var.f(), nl3VarU), false, false, false, null, lh4.Z0(fb6Var)));
                        arrayList3 = arrayList3;
                        arrayList5 = arrayList6;
                        yj3VarX1 = yj3Var;
                        i++;
                        ta6Var2 = ta6Var2;
                        cls2 = cls3;
                        nl3VarU = nl3VarU;
                        sx4Var2 = sx4Var2;
                        zi8Var2 = zi8Var2;
                        z2 = false;
                        obj2 = null;
                    }
                    ta6Var = ta6Var2;
                    sx4Var = sx4Var2;
                    cls = cls2;
                    zi8Var = zi8Var2;
                    ArrayList arrayList7 = arrayList5;
                    gs0 gs0Var = yj3VarX1;
                    arrayList = arrayList3;
                    gs0Var.O0(z2);
                    fl1 fl1VarE = sx4Var.e();
                    fl1VarE.getClass();
                    if (fl1VarE.equals(ek3.b)) {
                        fl1VarE = ek3.c;
                        fl1VarE.getClass();
                    }
                    gs0Var.U0(arrayList7, fl1VarE);
                    gs0Var.N0(z2);
                    gs0Var.P0(sx4Var.X());
                    String strY = w45.y(gs0Var, 2);
                    if (arrayList.isEmpty()) {
                        arrayList.add(gs0Var);
                        Object obj3 = z47Var.Y;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(gs0Var);
                                Object obj4 = z47Var.Y;
                            }
                        } while (!w45.y((gs0) it2.next(), 2).equals(strY));
                    }
                } else {
                    ta6Var = ta6Var2;
                    sx4Var = sx4Var2;
                    cls = cls2;
                    arrayList = arrayList3;
                    zi8Var = zi8Var2;
                }
                sx4Var.getClass();
                z47Var.getClass();
                we5 we5Var = (we5) ((c6) z47Var.Y).q0;
                if (arrayList.isEmpty()) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        Object obj5 = z47Var2.Y;
                        f63 f63Var = (f63) z47Var2.g0;
                        sx4 sx4Var3 = sx4Var;
                        ?? X0 = yj3.X0(sx4Var3, rmVar, true, lh4.Z0(ta6Var));
                        if (zIsAnnotation) {
                            List listD2 = ta6Var.d();
                            arrayList2 = new ArrayList(listD2.size());
                            nl3 nl3VarU2 = pu.U(zi8Var, true, null, 6);
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList<cb6> arrayList9 = new ArrayList();
                            for (Object obj6 : listD2) {
                                if (dh3.f(((cb6) obj6).c(), ks3.b)) {
                                    arrayList8.add(obj6);
                                } else {
                                    arrayList9.add(obj6);
                                }
                            }
                            arrayList8.size();
                            cb6 cb6Var = (cb6) wv0.t0(arrayList8);
                            if (cb6Var != null) {
                                gb6 gb6VarF = cb6Var.f();
                                if (gb6VarF instanceof na6) {
                                    na6 na6Var = (na6) gb6VarF;
                                    qg5Var = new qg5(f63Var.B(na6Var, nl3VarU2, true), f63Var.C(na6Var.b, nl3VarU2));
                                } else {
                                    qg5Var = new qg5(f63Var.C(gb6VarF, nl3VarU2), null);
                                }
                                ?? r10 = t44Var3;
                                r10.v(arrayList2, X0, 0, cb6Var, (t14) qg5Var.X, (t14) qg5Var.Y);
                                r8 = r10;
                            } else {
                                r8 = t44Var3;
                            }
                            int i2 = cb6Var != null ? 1 : 0;
                            int i3 = 0;
                            for (cb6 cb6Var2 : arrayList9) {
                                r8.v(arrayList2, X0, i3 + i2, cb6Var2, f63Var.C(cb6Var2.f(), nl3VarU2), null);
                                i3++;
                            }
                        } else {
                            arrayList2 = Collections.EMPTY_LIST;
                        }
                        X0.O0(false);
                        fl1 fl1VarE2 = sx4Var3.e();
                        fl1VarE2.getClass();
                        if (fl1VarE2.equals(ek3.b)) {
                            fl1VarE2 = ek3.c;
                            fl1VarE2.getClass();
                        }
                        X0.U0(arrayList2, fl1VarE2);
                        X0.N0(true);
                        X0.P0(sx4Var3.X());
                        r9 = X0;
                    } else {
                        r9 = 0;
                    }
                    listM = i21.M(r9);
                } else {
                    listM = arrayList;
                }
                return wv0.Y0(we5Var.k(z47Var, listM));
            default:
                this.Z.n.getClass();
                z47Var.getClass();
                return wv0.c1(new ArrayList());
        }
    }

    public q44(z47 z47Var, t44 t44Var) {
        this.Y = z47Var;
        this.Z = t44Var;
    }
}
