package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final gj1 Y;

    public /* synthetic */ fj1(gj1 gj1Var, byte b) {
        this.X = b;
        this.Y = gj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0298  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dn2
    public final Object invoke() {
        ne0 ne0VarX;
        GenericDeclaration declaredConstructor;
        ne0 ne0VarX2;
        zu3 zu3Var;
        Object next;
        nb6 nb6Var;
        byte b = this.X;
        gj1 gj1Var = this.Y;
        Object objT = null;
        switch (b) {
            case 0:
                qs0 qs0Var = ir6.a;
                ho2 ho2VarV = gj1Var.V();
                ov3 ov3Var = gj1Var.i0;
                dh3 dh3VarC = ir6.c(ho2VarV);
                boolean z = dh3VarC instanceof it3;
                cm cmVar = cm.Y;
                if (z) {
                    if (mb6.J(gj1Var)) {
                        Class clsT = ov3Var.t();
                        List listG = gj1Var.g();
                        ArrayList arrayList = new ArrayList(xv0.Z(listG, 10));
                        Iterator it = listG.iterator();
                        while (it.hasNext()) {
                            String name = ((ob6) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new em(clsT, arrayList, cmVar);
                    }
                    String str = ((it3) dh3VarC).g.m;
                    ov3Var.getClass();
                    str.getClass();
                    Class clsT2 = ov3Var.t();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) ms8.m(ia6.d(ov3Var.t()), str, false).Y).toArray(new Class[0]);
                        objT = clsT2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (dh3VarC instanceof jt3) {
                    lt3 lt3Var = ((jt3) dh3VarC).g;
                    objT = ov3Var.T(lt3Var.l, lt3Var.m);
                } else if (dh3VarC instanceof ht3) {
                    objT = ((ht3) dh3VarC).g;
                } else {
                    if (!(dh3VarC instanceof gt3)) {
                        if (!(dh3VarC instanceof ft3)) {
                            b61.c();
                            return null;
                        }
                        List list = ((ft3) dh3VarC).g;
                        Class clsT3 = ov3Var.t();
                        ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new em(clsT3, arrayList2, cmVar, dm.X, list);
                    }
                    objT = ((gt3) dh3VarC).g;
                }
                if (objT instanceof Constructor) {
                    ne0VarX = gj1Var.W((Constructor) objT, gj1Var.V(), false);
                } else {
                    if (!(objT instanceof Method)) {
                        throw new p14("Could not compute caller for function: " + gj1Var.V() + " (member = " + objT + ')');
                    }
                    Method method = (Method) objT;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        ne0VarX = mb6.K(gj1Var) ? new je0(method, mb6.C(gj1Var)) : new me0(method, false, 6, (byte) 0);
                    } else if (((cw0) gj1Var.V()).getAnnotations().p(ms8.a) != null) {
                        ne0VarX = mb6.K(gj1Var) ? new ke0(method, false, 4) : new me0(method, true, 4, (byte) 1);
                    } else {
                        ne0VarX = gj1Var.X(method, false);
                    }
                }
                return a28.c(ne0VarX, gj1Var, d02.X, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                qs0 qs0Var2 = ir6.a;
                ho2 ho2VarV2 = gj1Var.V();
                ov3 ov3Var2 = gj1Var.i0;
                dh3 dh3VarC2 = ir6.c(ho2VarV2);
                if (!(dh3VarC2 instanceof jt3)) {
                    boolean z2 = dh3VarC2 instanceof it3;
                    cm cmVar2 = cm.X;
                    if (z2) {
                        if (mb6.J(gj1Var)) {
                            Class clsT4 = ov3Var2.t();
                            List listG2 = gj1Var.g();
                            ArrayList arrayList4 = new ArrayList(xv0.Z(listG2, 10));
                            Iterator it3 = listG2.iterator();
                            while (it3.hasNext()) {
                                String name2 = ((ob6) it3.next()).getName();
                                name2.getClass();
                                arrayList4.add(name2);
                            }
                            return new em(clsT4, arrayList4, cmVar2);
                        }
                        mj0 mj0VarK = w51.K(gj1Var, ((it3) dh3VarC2).g.m);
                        arrayList3.addAll((Set) mj0VarK.Y);
                        String str2 = (String) mj0VarK.Z;
                        ov3Var2.getClass();
                        str2.getClass();
                        Class clsT5 = ov3Var2.t();
                        ArrayList arrayList5 = new ArrayList();
                        ov3.G(arrayList5, (ArrayList) ms8.m(ia6.d(ov3Var2.t()), str2, false).Y, true, false);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList5.toArray(new Class[0]);
                            declaredConstructor = clsT5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (dh3VarC2 instanceof ft3) {
                        List list2 = ((ft3) dh3VarC2).g;
                        Class clsT6 = ov3Var2.t();
                        ArrayList arrayList6 = new ArrayList(xv0.Z(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new em(clsT6, arrayList6, cmVar2, dm.X, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    ArrayList arrayListC = nr4.C(gj1Var);
                    if (arrayListC.isEmpty()) {
                        if (ov3Var2 instanceof zu3) {
                            zu3Var = (zu3) ov3Var2;
                        } else {
                            zu3Var = null;
                        }
                        if (zu3Var == null && zu3Var.C()) {
                            Member memberB = gj1Var.r().b();
                            memberB.getClass();
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                Collection collectionQ = gj1Var.V().q();
                                collectionQ.getClass();
                                Collection<ho2> collection = collectionQ;
                                ArrayList arrayList7 = new ArrayList(xv0.Z(collection, 10));
                                for (ho2 ho2Var : collection) {
                                    ed1 ed1VarP = ho2Var.p();
                                    ed1VarP.getClass();
                                    Class clsQ = ms8.q((sx4) ed1VarP);
                                    if (clsQ == null) {
                                        xw3.j(gj1Var, "Unknown container class for overridden function: ");
                                        return null;
                                    }
                                    arrayList7.add(new gj1((ev3) yb6.a.b(clsQ), ho2Var));
                                }
                                Iterator it5 = arrayList7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        ArrayList arrayListC2 = nr4.C((nb6) next);
                                        if (!arrayListC2.isEmpty()) {
                                            Iterator it6 = arrayListC2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    ob6 ob6Var = (ob6) it6.next();
                                                    if (ob6Var == null) {
                                                        ob6Var = null;
                                                    }
                                                    if (ob6Var == null || !ob6Var.t()) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                nb6Var = (nb6) next;
                            } else {
                                nb6Var = null;
                            }
                        } else {
                            nb6Var = null;
                        }
                    } else {
                        Iterator it7 = arrayListC.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                ob6 ob6Var2 = (ob6) it7.next();
                                if (ob6Var2 == null) {
                                    ob6Var2 = null;
                                }
                                if (ob6Var2 == null || !ob6Var2.t()) {
                                }
                            } else {
                                if (ov3Var2 instanceof zu3) {
                                    zu3Var = (zu3) ov3Var2;
                                } else {
                                    zu3Var = null;
                                }
                                if (zu3Var == null) {
                                }
                            }
                            nb6Var = null;
                        }
                    }
                    if (nb6Var != null) {
                        String strM0 = fm7.M0('(', nb6Var.a());
                        mj0 mj0VarK2 = w51.K(nb6Var, nb6Var.a().substring(strM0.length()));
                        arrayList3.addAll((Set) mj0VarK2.Y);
                        declaredConstructor = ov3Var2.N(strM0, (String) mj0VarK2.Z, true, gj1Var.V().S() != null);
                    } else {
                        lt3 lt3Var2 = ((jt3) dh3VarC2).g;
                        mj0 mj0VarK3 = w51.K(gj1Var, lt3Var2.m);
                        arrayList3.addAll((Set) mj0VarK3.Y);
                        String str3 = lt3Var2.l;
                        String str4 = (String) mj0VarK3.Z;
                        Member memberB2 = gj1Var.r().b();
                        memberB2.getClass();
                        declaredConstructor = ov3Var2.N(str3, str4, !Modifier.isStatic(memberB2.getModifiers()), gj1Var.V().S() != null);
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    ne0VarX2 = gj1Var.W((Constructor) declaredConstructor, gj1Var.V(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    ne0VarX2 = null;
                } else if (((cw0) gj1Var.V()).getAnnotations().p(ms8.a) != null) {
                    ed1 ed1VarP2 = gj1Var.V().p();
                    ed1VarP2.getClass();
                    if (((sx4) ed1VarP2).v0()) {
                        ne0VarX2 = gj1Var.X((Method) declaredConstructor, gj1Var.r().c());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        ne0VarX2 = mb6.K(gj1Var) ? new ke0(method2, false, 4) : new me0(method2, true, 4, (byte) 1);
                    }
                } else {
                    ne0VarX2 = gj1Var.X((Method) declaredConstructor, gj1Var.r().c());
                }
                if (ne0VarX2 != null) {
                    return a28.c(ne0VarX2, gj1Var, arrayList3, true);
                }
                return null;
            default:
                Type typeX = w51.x(gj1Var);
                return typeX == null ? gj1Var.r().j() : typeX;
        }
    }
}
