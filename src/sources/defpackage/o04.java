package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o04 implements dn2 {
    public final /* synthetic */ byte X;
    public final p04 Y;

    public /* synthetic */ o04(p04 p04Var, byte b) {
        this.X = b;
        this.Y = p04Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:1: B:39:0x011c->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:0x020b  */
    @Override // defpackage.dn2
    public final Object invoke() {
        GenericDeclaration genericDeclarationT;
        ne0 ne0VarU;
        List listL;
        Iterator it;
        GenericDeclaration genericDeclarationN;
        byte b = this.X;
        boolean z = false;
        p04 p04Var = this.Y;
        switch (b) {
            case 0:
                p04 p04Var2 = this.Y;
                return g33.o(p04Var2, p04Var2.V(), p04Var2.W(), p04Var2.Z(), p04Var2.Y(), true);
            case 1:
                p04 p04Var3 = this.Y;
                return mb6.K(p04Var3) ? g33.o(p04Var3, p04Var3.V(), p04Var3.W(), p04Var3.Z(), p04Var3.Y(), false) : p04Var3.l();
            case 2:
                boolean zL = mb6.L(p04Var);
                ov3 ov3Var = p04Var.Y;
                if (!zL && !(ov3Var instanceof ew3)) {
                    StringBuilder sb = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                    sb.append(ov3Var);
                    xw3.p(sb, p04Var.getName(), p04Var.Z);
                    return null;
                }
                pt3 pt3VarX = p04Var.X();
                String str = pt3VarX.e;
                if (mb6.L(p04Var)) {
                    if (ov3Var instanceof ev3) {
                        ev3 ev3Var = (ev3) ov3Var;
                        if (ev3Var.C()) {
                            yy3 yy3VarI0 = ev3Var.i0();
                            if ((yy3VarI0 != null ? yy3VarI0.m : null) != null) {
                                genericDeclarationT = ov3Var.T(pt3VarX.d, str);
                            }
                        }
                    }
                    if (mb6.J(p04Var)) {
                        Class clsT = ov3Var.t();
                        List listG = p04Var.g();
                        ArrayList arrayList = new ArrayList(xv0.Z(listG, 10));
                        Iterator it2 = listG.iterator();
                        while (it2.hasNext()) {
                            String name = ((ob6) it2.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new em(clsT, arrayList, cm.Y);
                    }
                    ov3Var.getClass();
                    str.getClass();
                    Class clsT2 = ov3Var.t();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) ms8.m(ia6.d(ov3Var.t()), str, false).Y).toArray(new Class[0]);
                        genericDeclarationT = clsT2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationT = null;
                    }
                    break;
                } else {
                    genericDeclarationT = ov3Var.T(pt3VarX.d, str);
                }
                if (genericDeclarationT instanceof Constructor) {
                    ne0VarU = p04Var.T((Constructor) genericDeclarationT, false);
                } else {
                    if (!(genericDeclarationT instanceof Method)) {
                        xw3.j(p04Var, "Could not compute caller for function: ");
                        return null;
                    }
                    ne0VarU = p04Var.U((Method) genericDeclarationT, false);
                }
                return a28.c(ne0VarU, p04Var, d02.X, false);
            default:
                boolean zL2 = mb6.L(p04Var);
                ov3 ov3Var2 = p04Var.Y;
                if (!zL2 && !(ov3Var2 instanceof ew3)) {
                    StringBuilder sb2 = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                    sb2.append(ov3Var2);
                    xw3.p(sb2, p04Var.getName(), p04Var.Z);
                    return null;
                }
                pt3 pt3VarX2 = p04Var.X();
                ArrayList arrayList2 = new ArrayList();
                if (mb6.L(p04Var)) {
                    if (ov3Var2 instanceof ev3) {
                        ev3 ev3Var2 = (ev3) ov3Var2;
                        if (ev3Var2.C()) {
                            yy3 yy3VarI1 = ev3Var2.i0();
                            if ((yy3VarI1 != null ? yy3VarI1.m : null) != null) {
                                mj0 mj0VarK = w51.K(p04Var, pt3VarX2.e);
                                arrayList2.addAll((Set) mj0VarK.Y);
                                String str2 = pt3VarX2.d;
                                String str3 = (String) mj0VarK.Z;
                                Member memberB = p04Var.r().b();
                                memberB.getClass();
                                boolean z2 = !Modifier.isStatic(memberB.getModifiers());
                                listL = p04Var.l();
                                if (listL != null) {
                                    it = listL.iterator();
                                    while (it.hasNext()) {
                                        if (((ob6) it.next()).x() == fw3.Z) {
                                            z = true;
                                        }
                                    }
                                } else {
                                    it = listL.iterator();
                                    while (it.hasNext()) {
                                        if (((ob6) it.next()).x() == fw3.Z) {
                                            z = true;
                                        }
                                    }
                                }
                                genericDeclarationN = ov3Var2.N(str2, str3, z2, z);
                            }
                        }
                    }
                    if (mb6.J(p04Var)) {
                        Class clsT3 = ov3Var2.t();
                        List listG2 = p04Var.g();
                        ArrayList arrayList3 = new ArrayList(xv0.Z(listG2, 10));
                        Iterator it3 = listG2.iterator();
                        while (it3.hasNext()) {
                            String name2 = ((ob6) it3.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        return new em(clsT3, arrayList3, cm.X);
                    }
                    mj0 mj0VarK2 = w51.K(p04Var, p04Var.X().e);
                    arrayList2.addAll((Set) mj0VarK2.Y);
                    String str4 = (String) mj0VarK2.Z;
                    ov3Var2.getClass();
                    str4.getClass();
                    Class clsT4 = ov3Var2.t();
                    ArrayList arrayList4 = new ArrayList();
                    ov3.G(arrayList4, (ArrayList) ms8.m(ia6.d(ov3Var2.t()), str4, false).Y, true, false);
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationN = clsT4.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationN = null;
                    }
                    break;
                } else {
                    mj0 mj0VarK3 = w51.K(p04Var, pt3VarX2.e);
                    arrayList2.addAll((Set) mj0VarK3.Y);
                    String str5 = pt3VarX2.d;
                    String str6 = (String) mj0VarK3.Z;
                    Member memberB2 = p04Var.r().b();
                    memberB2.getClass();
                    boolean z3 = !Modifier.isStatic(memberB2.getModifiers());
                    listL = p04Var.l();
                    if (listL != null || !listL.isEmpty()) {
                        it = listL.iterator();
                        while (it.hasNext()) {
                            if (((ob6) it.next()).x() == fw3.Z) {
                                z = true;
                            }
                        }
                    }
                    genericDeclarationN = ov3Var2.N(str5, str6, z3, z);
                }
                ne0 ne0VarT = genericDeclarationN instanceof Constructor ? p04Var.T((Constructor) genericDeclarationN, true) : genericDeclarationN instanceof Method ? p04Var.U((Method) genericDeclarationN, p04Var.r().c()) : null;
                if (ne0VarT != null) {
                    return a28.c(ne0VarT, p04Var, arrayList2, true);
                }
                return null;
        }
    }
}
