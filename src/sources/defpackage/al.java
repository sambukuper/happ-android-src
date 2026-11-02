package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class al extends vj8 implements pi8 {
    public static final lr P0;
    public final dh8 B0;
    public final Class C0;
    public final gh8 D0;
    public final List E0;
    public final m85 F0;
    public final uh8 G0;
    public final rs0 H0;
    public final Class I0;
    public final boolean J0;
    public final tm K0;
    public lr L0;
    public kl M0;
    public List N0;
    public transient Boolean O0;

    static {
        List list = Collections.EMPTY_LIST;
        P0 = new lr((Object) null, (Object) list, (Object) list, (byte) 9);
    }

    public al(Class cls) {
        this.B0 = null;
        this.C0 = cls;
        this.E0 = Collections.EMPTY_LIST;
        this.I0 = null;
        this.K0 = ch3.a;
        this.D0 = gh8.i0;
        this.F0 = null;
        this.H0 = null;
        this.G0 = null;
        this.J0 = false;
    }

    public final List A0() {
        Map mapF0;
        List list = this.N0;
        if (list == null) {
            dh8 dh8Var = this.B0;
            if (dh8Var == null || (mapF0 = new dl(this.F0, this.G0, this.H0, this.J0).F0(this, dh8Var)) == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList(mapF0.size());
                for (fl flVar : mapF0.values()) {
                    arrayList.add(new el(flVar.a, flVar.b, flVar.c.i()));
                }
                list = arrayList;
            }
            this.N0 = list;
        }
        return list;
    }

    public final kl B0() {
        rs0 rs0Var;
        Class clsA;
        kl klVar = this.M0;
        if (klVar == null) {
            dh8 dh8Var = this.B0;
            if (dh8Var == null) {
                klVar = new kl();
            } else {
                Class cls = dh8Var.j0;
                jl jlVar = new jl(this.F0, this.H0, this.J0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                jlVar.F0(this, cls, linkedHashMap, this.I0);
                Iterator it = this.E0.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    rs0Var = jlVar.f0;
                    Class clsA2 = null;
                    if (!zHasNext) {
                        break;
                    }
                    dh8 dh8Var2 = (dh8) it.next();
                    if (rs0Var != null) {
                        clsA2 = rs0Var.a(dh8Var2.j0);
                    }
                    jlVar.F0(new xd6(this.G0, dh8Var2.y0(), (byte) 20), dh8Var2.j0, linkedHashMap, clsA2);
                }
                if (rs0Var != null && (clsA = rs0Var.a(Object.class)) != null) {
                    jlVar.G0(this, cls, linkedHashMap, clsA);
                    if (((m85) jlVar.X) != null && !linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            zs4 zs4Var = (zs4) entry.getKey();
                            if ("hashCode".equals(zs4Var.a) && zs4Var.b.length == 0) {
                                try {
                                    Method declaredMethod = Object.class.getDeclaredMethod(zs4Var.a, null);
                                    il ilVar = (il) entry.getValue();
                                    ilVar.c = jlVar.n0(ilVar.c, declaredMethod.getDeclaredAnnotations());
                                    ilVar.b = declaredMethod;
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    klVar = new kl();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        il ilVar2 = (il) entry2.getValue();
                        Method method = ilVar2.b;
                        hl hlVar = method == null ? null : new hl(ilVar2.a, method, ilVar2.c.i(), null);
                        if (hlVar != null) {
                            linkedHashMap2.put(entry2.getKey(), hlVar);
                        }
                    }
                    kl klVar2 = new kl();
                    klVar2.X = linkedHashMap2;
                    klVar = klVar2;
                }
            }
            this.M0 = klVar;
        }
        return klVar;
    }

    @Override // defpackage.vj8
    public final Annotation C(Class cls) {
        return this.K0.a(cls);
    }

    @Override // defpackage.vj8
    public final int K() {
        return this.C0.getModifiers();
    }

    @Override // defpackage.vj8
    public final String L() {
        return this.C0.getName();
    }

    @Override // defpackage.vj8
    public final Class N() {
        return this.C0;
    }

    @Override // defpackage.vj8
    public final dh8 Q() {
        return this.B0;
    }

    @Override // defpackage.pi8
    public final dh8 d(Type type) {
        return this.G0.b(null, type, this.D0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return it0.o(al.class, obj) && ((al) obj).C0 == this.C0;
    }

    public final int hashCode() {
        return this.C0.hashCode();
    }

    public final String toString() {
        return "[AnnotedClass " + this.C0.getName() + "]";
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e3 A[LOOP:7: B:101:0x01cb->B:105:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x020d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0218  */
    /* JADX WARN: Code duplicated, block: B:142:0x026f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0275  */
    /* JADX WARN: Code duplicated, block: B:147:0x0284 A[LOOP:10: B:143:0x0273->B:147:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x028e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0298  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a3 A[LOOP:11: B:152:0x0296->B:156:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:184:0x031f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0322  */
    /* JADX WARN: Code duplicated, block: B:188:0x0334  */
    /* JADX WARN: Code duplicated, block: B:193:0x0349  */
    /* JADX WARN: Code duplicated, block: B:201:0x0362  */
    /* JADX WARN: Code duplicated, block: B:207:0x037c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0372 A[EDGE_INSN: B:220:0x0372->B:204:0x0372 BREAK  A[LOOP:2: B:199:0x035c->B:222:0x035c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x038c A[EDGE_INSN: B:226:0x038c->B:210:0x038c BREAK  A[LOOP:3: B:205:0x0378->B:227:0x0378], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x028b A[EDGE_INSN: B:252:0x028b->B:149:0x028b BREAK  A[LOOP:10: B:143:0x0273->B:147:0x0284], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x017b A[LOOP:4: B:85:0x0179->B:86:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x019b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad A[LOOP:6: B:98:0x01ab->B:99:0x01ad, LOOP_END] */
    public final lr z0() {
        gt0 gt0Var;
        ArrayList arrayList;
        int i;
        List list;
        dh8 dh8Var;
        Class cls;
        dh8 dh8Var2;
        int i2;
        Class cls2;
        ArrayList arrayList2;
        int i3;
        int size;
        ArrayList arrayList3;
        int i4;
        int i5;
        List list2;
        int i6;
        ArrayList arrayList4;
        Class cls3;
        TypeVariable<Method>[] typeParameters;
        gh8 gh8Var;
        pi8 xd6Var;
        TypeVariable<Method>[] typeVariableArr;
        dh8 dh8Var3;
        int length;
        int i7;
        TypeVariable<Method> typeVariable;
        Type[] bounds;
        int length2;
        int i8;
        int iIndexOf;
        dh8 dh8Var4;
        boolean zL0;
        boolean zL1;
        int i9;
        int i10;
        Method[] declaredMethods;
        int length3;
        zs4[] zs4VarArr;
        int i11;
        Method method;
        boolean z;
        Method[] methodArr;
        zs4 zs4Var;
        int i12;
        int i13;
        cl clVar;
        int size2;
        int size3;
        boolean z2;
        lr lrVar = this.L0;
        if (lrVar == null) {
            dh8 dh8Var5 = this.B0;
            if (dh8Var5 == null) {
                lrVar = P0;
            } else {
                Class cls4 = this.I0;
                boolean z3 = (cls4 != null) | this.J0;
                m85 m85Var = this.F0;
                dl dlVar = new dl(m85Var, this, z3);
                al alVar = (al) dlVar.g0;
                boolean zJ0 = dh8Var5.J0();
                Class cls5 = dh8Var5.j0;
                if (zJ0) {
                    gt0Var = null;
                    arrayList = null;
                } else {
                    gt0Var = null;
                    arrayList = null;
                    for (gt0 gt0Var2 : it0.l(cls5)) {
                        if (!gt0Var2.a.isSynthetic()) {
                            if (gt0Var2.a() == 0) {
                                gt0Var = gt0Var2;
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(gt0Var2);
                            }
                        }
                    }
                }
                if (arrayList == null) {
                    list = Collections.EMPTY_LIST;
                    if (gt0Var == null) {
                        dh8Var = dh8Var5;
                        cls = cls4;
                    } else {
                        i = 0;
                    }
                    arrayList2 = null;
                    for (Method method2 : it0.k(cls5)) {
                        if (Modifier.isStatic(method2.getModifiers())) {
                            z2 = !method2.isSynthetic();
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(method2);
                        }
                    }
                    if (arrayList2 == null) {
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        size = arrayList2.size();
                        arrayList3 = new ArrayList(size);
                        for (i4 = 0; i4 < size; i4++) {
                            arrayList3.add(null);
                        }
                        if (cls != null) {
                            declaredMethods = cls.getDeclaredMethods();
                            length3 = declaredMethods.length;
                            zs4VarArr = null;
                            i11 = 0;
                            while (i11 < length3) {
                                method = declaredMethods[i11];
                                if (Modifier.isStatic(method.getModifiers())) {
                                    z = !method.isSynthetic();
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (zs4VarArr == null) {
                                        zs4VarArr = new zs4[size];
                                        i13 = 0;
                                        while (i13 < size) {
                                            zs4VarArr[i13] = new zs4((Method) arrayList2.get(i13));
                                            i13++;
                                            declaredMethods = declaredMethods;
                                        }
                                    }
                                    methodArr = declaredMethods;
                                    zs4Var = new zs4(method);
                                    for (i12 = 0; i12 < size; i12++) {
                                        if (zs4Var.equals(zs4VarArr[i12])) {
                                            arrayList3.set(i12, dlVar.I0((Method) arrayList2.get(i12), alVar, method));
                                            break;
                                        }
                                    }
                                } else {
                                    methodArr = declaredMethods;
                                }
                                i11++;
                                declaredMethods = methodArr;
                            }
                        }
                        i5 = 0;
                        while (i5 < size) {
                            if (((hl) arrayList3.get(i5)) == null) {
                                Method method3 = (Method) arrayList2.get(i5);
                                typeParameters = method3.getTypeParameters();
                                if (typeParameters.length != 0 || dh8Var.y0().f()) {
                                    i6 = size;
                                } else {
                                    Type genericReturnType = method3.getGenericReturnType();
                                    if (genericReturnType instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
                                        if (cls5.equals(parameterizedType.getRawType())) {
                                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                            ArrayList arrayList5 = new ArrayList(typeParameters.length);
                                            ArrayList arrayList6 = new ArrayList(typeParameters.length);
                                            i6 = size;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < actualTypeArguments.length) {
                                                    TypeVariable typeVariableF = u15.F(actualTypeArguments[i14]);
                                                    if (typeVariableF != null) {
                                                        String name = typeVariableF.getName();
                                                        if (name != null) {
                                                            arrayList4 = arrayList2;
                                                            gh8 gh8VarY0 = dh8Var.y0();
                                                            if (i14 >= 0) {
                                                                dh8[] dh8VarArr = gh8VarY0.Y;
                                                                cls3 = cls5;
                                                                if (i14 < dh8VarArr.length) {
                                                                    dh8Var3 = dh8VarArr[i14];
                                                                }
                                                                if (dh8Var3 == null) {
                                                                    length = typeParameters.length;
                                                                    typeVariableArr = typeParameters;
                                                                    i7 = 0;
                                                                    while (true) {
                                                                        if (i7 < length) {
                                                                            typeVariable = null;
                                                                            break;
                                                                        }
                                                                        typeVariable = typeVariableArr[i7];
                                                                        i10 = length;
                                                                        if (name.equals(typeVariable.getName())) {
                                                                            break;
                                                                        }
                                                                        i7++;
                                                                        length = i10;
                                                                    }
                                                                    if (typeVariable == null) {
                                                                        bounds = typeVariable.getBounds();
                                                                        length2 = bounds.length;
                                                                        i8 = 0;
                                                                        while (true) {
                                                                            if (i8 >= length2) {
                                                                                iIndexOf = arrayList5.indexOf(name);
                                                                                if (iIndexOf != -1) {
                                                                                    dh8Var4 = (dh8) arrayList6.get(iIndexOf);
                                                                                    if (dh8Var3.equals(dh8Var4)) {
                                                                                        continue;
                                                                                    } else {
                                                                                        zL0 = dh8Var4.L0(dh8Var3.j0);
                                                                                        zL1 = dh8Var3.L0(dh8Var4.j0);
                                                                                        if (!zL0 || zL1) {
                                                                                            if (!(zL0 ^ zL1) && zL1) {
                                                                                                arrayList6.set(iIndexOf, dh8Var3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList5.add(name);
                                                                                    arrayList6.add(dh8Var3);
                                                                                }
                                                                            } else {
                                                                                i9 = i8;
                                                                                if (!u15.J(alVar, dh8Var3, bounds[i9])) {
                                                                                    i8 = i9 + 1;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cls3 = cls5;
                                                                gh8VarY0.getClass();
                                                            }
                                                            dh8Var3 = null;
                                                            if (dh8Var3 == null) {
                                                                length = typeParameters.length;
                                                                typeVariableArr = typeParameters;
                                                                i7 = 0;
                                                                while (true) {
                                                                    if (i7 < length) {
                                                                        typeVariable = null;
                                                                        break;
                                                                    }
                                                                    typeVariable = typeVariableArr[i7];
                                                                    i10 = length;
                                                                    if (name.equals(typeVariable.getName())) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i7++;
                                                                    length = i10;
                                                                }
                                                                if (typeVariable == null) {
                                                                    bounds = typeVariable.getBounds();
                                                                    length2 = bounds.length;
                                                                    i8 = 0;
                                                                    while (true) {
                                                                        if (i8 >= length2) {
                                                                            iIndexOf = arrayList5.indexOf(name);
                                                                            if (iIndexOf != -1) {
                                                                                dh8Var4 = (dh8) arrayList6.get(iIndexOf);
                                                                                if (dh8Var3.equals(dh8Var4)) {
                                                                                    continue;
                                                                                } else {
                                                                                    zL0 = dh8Var4.L0(dh8Var3.j0);
                                                                                    zL1 = dh8Var3.L0(dh8Var4.j0);
                                                                                    if (!zL0) {
                                                                                    }
                                                                                    if (!(zL0 ^ zL1)) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList5.add(name);
                                                                                arrayList6.add(dh8Var3);
                                                                            }
                                                                        } else {
                                                                            i9 = i8;
                                                                            if (!u15.J(alVar, dh8Var3, bounds[i9])) {
                                                                                i8 = i9 + 1;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        arrayList4 = arrayList2;
                                                        cls3 = cls5;
                                                        typeVariableArr = typeParameters;
                                                    }
                                                    i14++;
                                                    arrayList2 = arrayList4;
                                                    cls5 = cls3;
                                                    typeParameters = typeVariableArr;
                                                } else {
                                                    arrayList4 = arrayList2;
                                                    cls3 = cls5;
                                                    if (!arrayList5.isEmpty()) {
                                                        gh8Var = (arrayList5.isEmpty() || arrayList6.isEmpty()) ? gh8.i0 : new gh8((String[]) arrayList5.toArray(gh8.g0), (dh8[]) arrayList6.toArray(gh8.h0), null);
                                                    }
                                                }
                                                gh8Var = null;
                                            }
                                        } else {
                                            i6 = size;
                                        }
                                    } else {
                                        i6 = size;
                                    }
                                    if (gh8Var == null) {
                                        xd6Var = alVar;
                                    } else {
                                        xd6Var = new xd6(this.G0, gh8Var, (byte) 20);
                                    }
                                    arrayList3.set(i5, dlVar.I0(method3, xd6Var, null));
                                }
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                                gh8Var = null;
                                if (gh8Var == null) {
                                    xd6Var = alVar;
                                } else {
                                    xd6Var = new xd6(this.G0, gh8Var, (byte) 20);
                                }
                                arrayList3.set(i5, dlVar.I0(method3, xd6Var, null));
                            } else {
                                i6 = size;
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                            }
                            i5++;
                            size = i6;
                            arrayList2 = arrayList4;
                            cls5 = cls3;
                        }
                        list2 = arrayList3;
                    }
                    if (dlVar.f0) {
                        clVar = (cl) dlVar.h0;
                        if (clVar != null && m85Var.U(clVar)) {
                            dlVar.h0 = null;
                        }
                        size2 = list.size();
                        while (true) {
                            size2--;
                            if (size2 >= 0) {
                                break;
                            }
                            if (m85Var.U((gl) list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        size3 = list2.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0) {
                                break;
                            }
                            if (m85Var.U((gl) list2.get(size3))) {
                                list2.remove(size3);
                            }
                        }
                    }
                    lrVar = new lr(dlVar.h0, (Object) list, (Object) list2, (byte) 9);
                } else {
                    int size4 = arrayList.size();
                    ArrayList arrayList7 = new ArrayList(size4);
                    for (int i15 = 0; i15 < size4; i15++) {
                        arrayList7.add(null);
                    }
                    i = size4;
                    list = arrayList7;
                }
                yr2[] yr2VarArr = cw0.Y;
                if (cls4 != null) {
                    gt0[] gt0VarArrL = it0.l(cls4);
                    int length4 = gt0VarArrL.length;
                    zs4[] zs4VarArr2 = null;
                    int i16 = 0;
                    while (i16 < length4) {
                        gt0 gt0Var3 = gt0VarArrL[i16];
                        if (gt0Var3.a() != 0) {
                            dh8Var2 = dh8Var5;
                            i2 = i16;
                            if (arrayList == null) {
                                cls2 = cls4;
                                break;
                                break;
                            }
                            if (zs4VarArr2 == null) {
                                zs4[] zs4VarArr3 = new zs4[i];
                                int i17 = 0;
                                while (true) {
                                    zs4VarArr2 = zs4VarArr3;
                                    if (i17 >= i) {
                                        break;
                                    }
                                    int i18 = i17;
                                    zs4VarArr2[i18] = new zs4(((gt0) arrayList.get(i17)).a);
                                    i17 = i18 + 1;
                                    zs4VarArr3 = zs4VarArr2;
                                }
                            }
                            zs4 zs4Var2 = new zs4(gt0Var3.a);
                            int i19 = 0;
                            while (true) {
                                if (i19 >= i) {
                                    cls2 = cls4;
                                    break;
                                    break;
                                }
                                cls2 = cls4;
                                if (zs4Var2.equals(zs4VarArr2[i19])) {
                                    list.set(i19, dlVar.J0((gt0) arrayList.get(i19), gt0Var3));
                                    break;
                                }
                                i19++;
                                cls4 = cls2;
                            }
                        } else {
                            dh8Var2 = dh8Var5;
                            if (gt0Var == null) {
                                i2 = i16;
                                cls2 = cls4;
                                break;
                            }
                            i2 = i16;
                            dlVar.h0 = new cl(alVar, gt0Var.a, dlVar.G0(gt0Var, gt0Var3), yr2VarArr);
                            cls2 = cls4;
                            gt0Var = null;
                        }
                        i16 = i2 + 1;
                        dh8Var5 = dh8Var2;
                        cls4 = cls2;
                    }
                }
                dh8Var = dh8Var5;
                cls = cls4;
                if (gt0Var != null) {
                    dlVar.h0 = new cl(alVar, gt0Var.a, dlVar.G0(gt0Var, null), yr2VarArr);
                }
                for (int i20 = 0; i20 < i; i20++) {
                    if (((cl) list.get(i20)) == null) {
                        list.set(i20, dlVar.J0((gt0) arrayList.get(i20), null));
                    }
                }
                arrayList2 = null;
                while (i3 < r3) {
                    if (Modifier.isStatic(method2.getModifiers())) {
                        z2 = false;
                    } else {
                        z2 = !method2.isSynthetic();
                    }
                    if (z2) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(method2);
                    }
                }
                if (arrayList2 == null) {
                    list2 = Collections.EMPTY_LIST;
                } else {
                    size = arrayList2.size();
                    arrayList3 = new ArrayList(size);
                    while (i4 < size) {
                        arrayList3.add(null);
                    }
                    if (cls != null) {
                        declaredMethods = cls.getDeclaredMethods();
                        length3 = declaredMethods.length;
                        zs4VarArr = null;
                        i11 = 0;
                        while (i11 < length3) {
                            method = declaredMethods[i11];
                            if (Modifier.isStatic(method.getModifiers())) {
                                z = false;
                            } else {
                                z = !method.isSynthetic();
                            }
                            if (z) {
                                methodArr = declaredMethods;
                            } else {
                                if (zs4VarArr == null) {
                                    zs4VarArr = new zs4[size];
                                    i13 = 0;
                                    while (i13 < size) {
                                        zs4VarArr[i13] = new zs4((Method) arrayList2.get(i13));
                                        i13++;
                                        declaredMethods = declaredMethods;
                                    }
                                }
                                methodArr = declaredMethods;
                                zs4Var = new zs4(method);
                                while (i12 < size) {
                                    if (zs4Var.equals(zs4VarArr[i12])) {
                                        arrayList3.set(i12, dlVar.I0((Method) arrayList2.get(i12), alVar, method));
                                        break;
                                        break;
                                    }
                                }
                            }
                            i11++;
                            declaredMethods = methodArr;
                        }
                    }
                    i5 = 0;
                    while (i5 < size) {
                        if (((hl) arrayList3.get(i5)) == null) {
                            Method method4 = (Method) arrayList2.get(i5);
                            typeParameters = method4.getTypeParameters();
                            if (typeParameters.length != 0) {
                                i6 = size;
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                                gh8Var = null;
                            } else {
                                i6 = size;
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                                gh8Var = null;
                            }
                            if (gh8Var == null) {
                                xd6Var = alVar;
                            } else {
                                xd6Var = new xd6(this.G0, gh8Var, (byte) 20);
                            }
                            arrayList3.set(i5, dlVar.I0(method4, xd6Var, null));
                        } else {
                            i6 = size;
                            arrayList4 = arrayList2;
                            cls3 = cls5;
                        }
                        i5++;
                        size = i6;
                        arrayList2 = arrayList4;
                        cls5 = cls3;
                    }
                    list2 = arrayList3;
                }
                if (dlVar.f0) {
                    clVar = (cl) dlVar.h0;
                    if (clVar != null) {
                        dlVar.h0 = null;
                    }
                    size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            break;
                            break;
                        }
                        if (m85Var.U((gl) list.get(size2))) {
                            list.remove(size2);
                        }
                    }
                    size3 = list2.size();
                    while (true) {
                        size3--;
                        if (size3 >= 0) {
                            break;
                            break;
                        }
                        if (m85Var.U((gl) list2.get(size3))) {
                            list2.remove(size3);
                        }
                    }
                }
                lrVar = new lr(dlVar.h0, (Object) list, (Object) list2, (byte) 9);
            }
            this.L0 = lrVar;
        }
        return lrVar;
    }

    public al(dh8 dh8Var, Class cls, List list, Class cls2, tm tmVar, gh8 gh8Var, m85 m85Var, rs0 rs0Var, uh8 uh8Var, boolean z) {
        this.B0 = dh8Var;
        this.C0 = cls;
        this.E0 = list;
        this.I0 = cls2;
        this.K0 = tmVar;
        this.D0 = gh8Var;
        this.F0 = m85Var;
        this.H0 = rs0Var;
        this.G0 = uh8Var;
        this.J0 = z;
    }
}
