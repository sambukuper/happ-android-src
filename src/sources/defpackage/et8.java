package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class et8 implements wd0 {
    public final wd0 a;
    public final boolean b;
    public final zv7 c;

    /* JADX WARN: Code duplicated, block: B:102:0x017e  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:135:0x020e A[LOOP:2: B:133:0x0208->B:135:0x020e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x023f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0241  */
    /* JADX WARN: Code duplicated, block: B:149:0x024e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0258  */
    /* JADX WARN: Code duplicated, block: B:168:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0178 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:4: B:88:0x0145->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[LOOP:5: B:39:0x009b->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[EDGE_INSN: B:32:0x0088->B:57:0x00cf BREAK  A[LOOP:5: B:39:0x009b->B:180:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:74:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0173  */
    public et8(wd0 wd0Var, kb6 kb6Var, List list, boolean z) {
        Class clsV;
        Method declaredMethod;
        boolean z2;
        fw3 fw3Var;
        int i;
        List listG;
        Iterator it;
        ov3 ov3VarD;
        ev3 ev3Var;
        yy3 yy3VarI0;
        String str;
        ArrayList arrayList;
        fs0 fs0VarD;
        boolean z3;
        List listL;
        Iterator it2;
        int size;
        List<Type> listA;
        int i2;
        int i3;
        int i4;
        int size2;
        boolean z4;
        kf3 kf3VarA0;
        Method[] methodArr;
        int i5;
        Iterator it3;
        zv7 zv7Var;
        Member memberB;
        Class<?> declaringClass;
        boolean z5;
        Method methodF;
        Class clsV2;
        zu3 zu3Var;
        zu3 zu3Var2;
        pw3 pw3VarS;
        this.a = wd0Var;
        this.b = z;
        pw3 pw3VarJ = kb6Var.j();
        boolean z6 = kb6Var instanceof nb6;
        if ((z6 && ((nb6) kb6Var).h() && (pw3VarS = ms8.s(pw3VarJ)) != null && a28.n(pw3VarS)) || (clsV = a28.v(pw3VarJ)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsV.getDeclaredMethod("box-impl", a28.f(clsV, kb6Var).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                om0.h("No box method found in inline class: ", clsV, " (calling ", kb6Var);
                throw null;
            }
        }
        if (kb6Var instanceof hw3) {
            nw3 nw3VarF = ((hw3) kb6Var).f();
            nw3VarF.getClass();
            if (a28.o((pb6) nw3VarF)) {
                zv7Var = new zv7(kf3.f0, new Method[0], declaredMethod);
            } else {
                z2 = wd0Var instanceof le0;
                fw3Var = fw3.X;
                i = -1;
                if (z2 || ((le0) wd0Var).f) {
                    if (!mb6.L(kb6Var)) {
                        listG = kb6Var.g();
                        if (listG != null || !listG.isEmpty()) {
                            it = listG.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ob6) it.next()).x() == fw3Var) {
                                        ov3VarD = kb6Var.D();
                                        if (ov3VarD instanceof ev3) {
                                            ev3Var = (ev3) ov3VarD;
                                        } else {
                                            ev3Var = null;
                                        }
                                        if (ev3Var != null && ev3Var.C()) {
                                            yy3VarI0 = ev3Var.i0();
                                            if (yy3VarI0 != null) {
                                                str = yy3VarI0.m;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                break;
                                            }
                                        }
                                        i = 1;
                                        break;
                                    }
                                }
                                i = 0;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                    if (!(wd0Var instanceof y70)) {
                        i = 0;
                        break;
                    }
                }
                this.a.b();
                arrayList = new ArrayList();
                fs0VarD = kb6Var.D();
                if (!mb6.L(kb6Var) && (fs0VarD instanceof zu3)) {
                    zu3Var2 = (zu3) fs0VarD;
                    if (zu3Var2.C()) {
                        arrayList.add(u15.j(zu3Var2));
                    }
                }
                if (mb6.L(kb6Var)) {
                    if (fs0VarD instanceof zu3) {
                        zu3Var = (zu3) fs0VarD;
                    } else {
                        zu3Var = null;
                    }
                    if (zu3Var == null && zu3Var.n()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                for (ob6 ob6Var : kb6Var.l()) {
                    if (ob6Var.x() == fw3Var || z3) {
                        arrayList.add(ob6Var.B());
                    }
                }
                listL = kb6Var.l();
                if (listL == null && listL.isEmpty()) {
                    size = arrayList.size();
                    break;
                }
                it2 = listL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ob6) it2.next()).x() == fw3.Z) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
                listA = this.a.a();
                if (listA == null && listA.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (Type type : listA) {
                        if (!(type instanceof Class) && ((Class) type).getName().equals(nu3.a.a.a) && (i2 = i2 + 1) < 0) {
                            i21.W();
                            throw null;
                        }
                    }
                }
                if (this.b) {
                    i3 = (((size + i2) + 31) / 32) + 1;
                } else {
                    i3 = 0;
                }
                if (z6 || !((nb6) kb6Var).h()) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                size2 = arrayList.size() + i + i3 + i4 + i2;
                z4 = this.b;
                if (a().size() == size2) {
                    StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                    sb.append(this.a.a().size());
                    sb.append(" != ");
                    sb.append(size2);
                    sb.append("\nCalling: ");
                    sb.append(kb6Var);
                    List listA2 = this.a.a();
                    sb.append("\nParameter types: ");
                    sb.append(listA2);
                    sb.append(")\nDefault: ");
                    sb.append(z4);
                    throw new p14(sb.toString());
                }
                kf3VarA0 = x97.a0(Math.max(i, 0), arrayList.size() + i);
                methodArr = new Method[size2];
                for (i5 = 0; i5 < size2; i5++) {
                    int i6 = kf3VarA0.X;
                    if (i5 <= kf3VarA0.Y || i6 > i5 || (clsV2 = a28.v((pw3) arrayList.get(i5 - i))) == null) {
                        methodF = null;
                    } else {
                        methodF = a28.f(clsV2, kb6Var);
                    }
                    methodArr[i5] = methodF;
                }
                it3 = list.iterator();
                while (it3.hasNext()) {
                    methodArr[((Number) it3.next()).intValue()] = null;
                }
                fs0 fs0VarD2 = kb6Var.D();
                if (!mb6.L(kb6Var) && (fs0VarD2 instanceof zu3) && ((zu3) fs0VarD2).C() && (memberB = this.a.b()) != null) {
                    declaringClass = memberB.getDeclaringClass();
                    if (declaringClass == null) {
                        z5 = false;
                    } else {
                        z5 = !yb6.a.b(declaringClass).C();
                    }
                    if (z5) {
                        methodArr[0] = null;
                    }
                }
                zv7Var = new zv7(kf3VarA0, methodArr, declaredMethod);
            }
        } else {
            z2 = wd0Var instanceof le0;
            fw3Var = fw3.X;
            i = -1;
            if (z2) {
                if (!mb6.L(kb6Var)) {
                    listG = kb6Var.g();
                    if (listG != null) {
                        it = listG.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((ob6) it.next()).x() == fw3Var) {
                                    ov3VarD = kb6Var.D();
                                    if (ov3VarD instanceof ev3) {
                                        ev3Var = (ev3) ov3VarD;
                                    } else {
                                        ev3Var = null;
                                    }
                                    if (ev3Var != null) {
                                        yy3VarI0 = ev3Var.i0();
                                        if (yy3VarI0 != null) {
                                            str = yy3VarI0.m;
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            break;
                                        }
                                    }
                                    i = 1;
                                    break;
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    it = listG.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ob6) it.next()).x() == fw3Var) {
                                ov3VarD = kb6Var.D();
                                if (ov3VarD instanceof ev3) {
                                    ev3Var = (ev3) ov3VarD;
                                } else {
                                    ev3Var = null;
                                }
                                if (ev3Var != null) {
                                    yy3VarI0 = ev3Var.i0();
                                    if (yy3VarI0 != null) {
                                        str = yy3VarI0.m;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        break;
                                    }
                                }
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if (!(wd0Var instanceof y70)) {
                    i = 0;
                    break;
                }
            } else {
                if (!mb6.L(kb6Var)) {
                    listG = kb6Var.g();
                    if (listG != null) {
                        it = listG.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((ob6) it.next()).x() == fw3Var) {
                                    ov3VarD = kb6Var.D();
                                    if (ov3VarD instanceof ev3) {
                                        ev3Var = (ev3) ov3VarD;
                                    } else {
                                        ev3Var = null;
                                    }
                                    if (ev3Var != null) {
                                        yy3VarI0 = ev3Var.i0();
                                        if (yy3VarI0 != null) {
                                            str = yy3VarI0.m;
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            break;
                                        }
                                    }
                                    i = 1;
                                    break;
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    it = listG.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ob6) it.next()).x() == fw3Var) {
                                ov3VarD = kb6Var.D();
                                if (ov3VarD instanceof ev3) {
                                    ev3Var = (ev3) ov3VarD;
                                } else {
                                    ev3Var = null;
                                }
                                if (ev3Var != null) {
                                    yy3VarI0 = ev3Var.i0();
                                    if (yy3VarI0 != null) {
                                        str = yy3VarI0.m;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        break;
                                    }
                                }
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if (!(wd0Var instanceof y70)) {
                    i = 0;
                    break;
                }
            }
            this.a.b();
            arrayList = new ArrayList();
            fs0VarD = kb6Var.D();
            if (!mb6.L(kb6Var)) {
                zu3Var2 = (zu3) fs0VarD;
                if (zu3Var2.C()) {
                    arrayList.add(u15.j(zu3Var2));
                }
            }
            if (mb6.L(kb6Var)) {
                z3 = false;
            } else {
                if (fs0VarD instanceof zu3) {
                    zu3Var = (zu3) fs0VarD;
                } else {
                    zu3Var = null;
                }
                if (zu3Var == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
            }
            while (r7.hasNext()) {
                if (ob6Var.x() == fw3Var) {
                }
                arrayList.add(ob6Var.B());
            }
            listL = kb6Var.l();
            if (listL == null) {
                it2 = listL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ob6) it2.next()).x() == fw3.Z) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            } else {
                it2 = listL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ob6) it2.next()).x() == fw3.Z) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            }
            listA = this.a.a();
            if (listA == null) {
                i2 = 0;
                while (r5.hasNext()) {
                    if (!(type instanceof Class)) {
                    }
                }
            } else {
                i2 = 0;
                while (r5.hasNext()) {
                    if (!(type instanceof Class)) {
                    }
                }
            }
            if (this.b) {
                i3 = (((size + i2) + 31) / 32) + 1;
            } else {
                i3 = 0;
            }
            if (z6) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            size2 = arrayList.size() + i + i3 + i4 + i2;
            z4 = this.b;
            if (a().size() == size2) {
                StringBuilder sb2 = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb2.append(this.a.a().size());
                sb2.append(" != ");
                sb2.append(size2);
                sb2.append("\nCalling: ");
                sb2.append(kb6Var);
                List listA3 = this.a.a();
                sb2.append("\nParameter types: ");
                sb2.append(listA3);
                sb2.append(")\nDefault: ");
                sb2.append(z4);
                throw new p14(sb2.toString());
            }
            kf3VarA0 = x97.a0(Math.max(i, 0), arrayList.size() + i);
            methodArr = new Method[size2];
            while (i5 < size2) {
                int i7 = kf3VarA0.X;
                if (i5 <= kf3VarA0.Y) {
                    methodF = null;
                } else {
                    methodF = null;
                }
                methodArr[i5] = methodF;
            }
            it3 = list.iterator();
            while (it3.hasNext()) {
                methodArr[((Number) it3.next()).intValue()] = null;
            }
            fs0 fs0VarD3 = kb6Var.D();
            if (!mb6.L(kb6Var)) {
                declaringClass = memberB.getDeclaringClass();
                if (declaringClass == null) {
                    z5 = false;
                } else {
                    z5 = !yb6.a.b(declaringClass).C();
                }
                if (z5) {
                    methodArr[0] = null;
                }
            }
            zv7Var = new zv7(kf3VarA0, methodArr, declaredMethod);
        }
        this.c = zv7Var;
    }

    @Override // defpackage.wd0
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.wd0
    public final Member b() {
        return this.a.b();
    }

    @Override // defpackage.wd0
    public final boolean c() {
        return this.a instanceof je0;
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method;
        zv7 zv7Var = this.c;
        kf3 kf3Var = (kf3) zv7Var.X;
        Method[] methodArr = (Method[]) zv7Var.Y;
        Method method2 = (Method) zv7Var.Z;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objF = objArr[i];
            int i2 = kf3Var.X;
            if (i <= kf3Var.Y && i2 <= i && (method = methodArr[i]) != null) {
                if (objF != null) {
                    objF = method.invoke(objF, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objF = ms8.f(returnType);
                }
            }
            objArr2[i] = objF;
        }
        Object objD = this.a.d(objArr2);
        return (objD == c71.X || method2 == null || (objInvoke = method2.invoke(null, objD)) == null) ? objD : objInvoke;
    }

    @Override // defpackage.wd0
    public final Type j() {
        return this.a.j();
    }
}
