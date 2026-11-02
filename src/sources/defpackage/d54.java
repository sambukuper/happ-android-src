package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d54 implements gn2 {
    public final /* synthetic */ byte X;
    public final f54 Y;

    public /* synthetic */ d54(f54 f54Var, byte b) {
        this.X = b;
        this.Y = f54Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:91:0x0244  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        gb6 na6Var;
        gb6 eb6Var;
        byte b = this.X;
        f54 f54Var = this.Y;
        v15 v15Var = (v15) obj;
        switch (b) {
            case 0:
                v15Var.getClass();
                f54 f54Var2 = f54Var.c;
                if (f54Var2 != null) {
                    return (Collection) f54Var2.f.B(v15Var);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ld1) f54Var.e.invoke()).c(v15Var).iterator();
                while (it.hasNext()) {
                    dl3 dl3VarT = f54Var.t((cb6) it.next());
                    if (f54Var.r(dl3VarT)) {
                        Object obj2 = f54Var.b.Y;
                        arrayList.add(dl3VarT);
                    }
                }
                f54Var.j(v15Var, arrayList);
                return arrayList;
            case 1:
                v15Var.getClass();
                f54 f54Var3 = f54Var.c;
                if (f54Var3 != null) {
                    return (fx5) f54Var3.g.B(v15Var);
                }
                za6 za6VarD = ((ld1) f54Var.e.invoke()).d(v15Var);
                if (za6VarD != null) {
                    Field field = za6VarD.a;
                    if (!field.isEnumConstant()) {
                        ea6 ea6Var = new ea6();
                        boolean z = !Modifier.isFinal(((Field) za6VarD.b()).getModifiers());
                        z47 z47Var = f54Var.b;
                        gl3 gl3VarP0 = gl3.P0(f54Var.q(), hi5.w0(z47Var, za6VarD), s08.k(za6VarD.e()), z, za6VarD.c(), lh4.Z0(za6VarD), Modifier.isFinal(((Field) za6VarD.b()).getModifiers()) && Modifier.isStatic(((Field) za6VarD.b()).getModifiers()));
                        ea6Var.X = gl3VarP0;
                        gl3VarP0.L0(null, null, null, null);
                        f63 f63Var = (f63) z47Var.g0;
                        Type genericType = field.getGenericType();
                        genericType.getClass();
                        boolean z2 = genericType instanceof Class;
                        if (z2) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                eb6Var = new eb6(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z2 && ((Class) genericType).isArray())) {
                                    na6Var = new na6(genericType);
                                } else {
                                    na6Var = genericType instanceof WildcardType ? new jb6((WildcardType) genericType) : new va6(genericType);
                                }
                                eb6Var = na6Var;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                na6Var = new na6(genericType);
                            } else {
                                na6Var = new na6(genericType);
                            }
                            eb6Var = na6Var;
                        }
                        t14 t14VarC = f63Var.C(eb6Var, pu.U(zi8.Y, false, null, 7));
                        if ((zz3.H(t14VarC) || zz3.I(t14VarC)) && Modifier.isFinal(((Field) za6VarD.b()).getModifiers())) {
                            Modifier.isStatic(((Field) za6VarD.b()).getModifiers());
                        }
                        gx5 gx5Var = (gx5) ea6Var.X;
                        i44 i44VarP = f54Var.p();
                        d02 d02Var = d02.X;
                        gx5Var.O0(t14VarC, d02Var, i44VarP, null, d02Var);
                        ed1 ed1VarQ = f54Var.q();
                        if ((ed1VarQ instanceof sx4 ? (sx4) ed1VarQ : null) != null) {
                            gx5 gx5Var2 = (gx5) ea6Var.X;
                            gx5Var2.getClass();
                            ea6Var.X = gx5Var2;
                        }
                        Object obj3 = ea6Var.X;
                        pt8 pt8Var = (pt8) obj3;
                        t14 t14VarC2 = ((gx5) obj3).c();
                        if (pt8Var == null) {
                            bl1.a(65);
                            throw null;
                        }
                        if (t14VarC2 == null) {
                            bl1.a(66);
                            throw null;
                        }
                        int i = bl1.a;
                        if (!pt8Var.R() && !vr3.J(t14VarC2)) {
                            if (cj8.b(t14VarC2)) {
                                ((gx5) ea6Var.X).M0(null, new em1(f54Var, za6VarD, ea6Var, (byte) 3));
                            } else {
                                zz3 zz3VarE = el1.e(pt8Var);
                                if (zz3.H(t14VarC2)) {
                                    ((gx5) ea6Var.X).M0(null, new em1(f54Var, za6VarD, ea6Var, (byte) 3));
                                } else {
                                    q45 q45Var = v14.a;
                                    if (q45Var.a(zz3VarE.v(), t14VarC2) || q45Var.a(zz3VarE.k("Number").X(), t14VarC2) || q45Var.a(zz3VarE.e(), t14VarC2) || ho8.a(t14VarC2)) {
                                        ((gx5) ea6Var.X).M0(null, new em1(f54Var, za6VarD, ea6Var, (byte) 3));
                                    }
                                }
                            }
                        }
                        Object obj4 = ea6Var.X;
                        if (((fx5) obj4) != null) {
                            return (fx5) obj4;
                        }
                        oc.a(6);
                        throw null;
                    }
                }
                return null;
            case 2:
                v15Var.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) f54Var.f.B(v15Var));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : linkedHashSet) {
                    String strY = w45.y((q97) obj5, 2);
                    Object arrayList2 = linkedHashMap.get(strY);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strY, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionE0 = z68.E0(list, cl1.B0);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionE0);
                    }
                }
                f54Var.m(linkedHashSet, v15Var);
                z47 z47Var2 = f54Var.b;
                return wv0.Y0(((we5) ((c6) z47Var2.Y).q0).k(z47Var2, linkedHashSet));
            default:
                v15Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Object objB = f54Var.g.B(v15Var);
                if (objB != null) {
                    arrayList3.add(objB);
                }
                f54Var.n(v15Var, arrayList3);
                ed1 ed1VarQ2 = f54Var.q();
                int i2 = bl1.a;
                if (bl1.l(ed1VarQ2, us0.g0)) {
                    return wv0.Y0(arrayList3);
                }
                z47 z47Var3 = f54Var.b;
                return wv0.Y0(((we5) ((c6) z47Var3.Y).q0).k(z47Var3, arrayList3));
        }
    }
}
