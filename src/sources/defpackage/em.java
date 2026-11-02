package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class em implements wd0 {
    public final Class a;
    public final ArrayList b;
    public final cm c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public em(Class cls, ArrayList arrayList, cm cmVar, dm dmVar, List list) {
        cls.getClass();
        list.getClass();
        this.a = cls;
        this.b = arrayList;
        this.c = cmVar;
        this.d = list;
        ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(xv0.Z(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> clsE = ia6.e(returnType);
            if (clsE != null) {
                returnType = clsE;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list3 = this.d;
        ArrayList arrayList4 = new ArrayList(xv0.Z(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == cm.Y && dmVar == dm.X && !wv0.D0(this.b, "value").isEmpty()) {
            u52.k("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // defpackage.wd0
    public final List a() {
        return this.e;
    }

    @Override // defpackage.wd0
    public final Member b() {
        return null;
    }

    @Override // defpackage.wd0
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a A[LOOP:0: B:5:0x0017->B:52:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x008c A[SYNTHETIC] */
    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        Object obj;
        Class cls;
        zu3 zu3VarB;
        zb6 zb6Var;
        String strP;
        int length = objArr.length;
        ArrayList arrayList = this.e;
        if (arrayList.size() != length) {
            bt.d(arrayList.size(), length);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(objArr.length);
        int length2 = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.b;
            if (i >= length2) {
                return w39.p(this.a, zp4.P(wv0.e1(arrayList3, arrayList2)), this.d);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList4 = this.f;
            if (array == null && this.c == cm.X) {
                array = this.g.get(i2);
            } else {
                Class cls2 = (Class) arrayList4.get(i2);
                if (!(array instanceof Class)) {
                    if (array instanceof zu3) {
                        array = zc1.M((zu3) array);
                    } else {
                        if (array instanceof Object[]) {
                            Object[] objArr2 = (Object[]) array;
                            if (!(objArr2 instanceof Class[])) {
                                if (objArr2 instanceof zu3[]) {
                                    zu3[] zu3VarArr = (zu3[]) array;
                                    ArrayList arrayList5 = new ArrayList(zu3VarArr.length);
                                    for (zu3 zu3Var : zu3VarArr) {
                                        arrayList5.add(zc1.M(zu3Var));
                                    }
                                    obj = null;
                                    array = arrayList5.toArray(new Class[0]);
                                } else {
                                    obj = null;
                                    array = objArr2;
                                }
                            }
                        }
                        if (!cls2.isInstance(array)) {
                            array = obj;
                        }
                        if (array == null) {
                            String str = (String) arrayList3.get(i2);
                            cls = (Class) arrayList4.get(i2);
                            if (dh3.f(cls, Class.class)) {
                                zb6Var = yb6.a;
                                zu3VarB = zb6Var.b(zu3.class);
                            } else if (cls.isArray() || !dh3.f(cls.getComponentType(), Class.class)) {
                                zb6 zb6Var2 = yb6.a;
                                zu3VarB = zb6Var2.b(cls);
                                zb6Var = zb6Var2;
                            } else {
                                zb6Var = yb6.a;
                                zu3VarB = zb6Var.b(zu3[].class);
                            }
                            if (dh3.f(zu3VarB.p(), zb6Var.b(Object[].class).p())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(zu3VarB.p());
                                sb.append('<');
                                Class<?> componentType = zc1.M(zu3VarB).getComponentType();
                                componentType.getClass();
                                sb.append(zb6Var.b(componentType).p());
                                sb.append('>');
                                strP = sb.toString();
                            } else {
                                strP = zu3VarB.p();
                            }
                            throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strP);
                        }
                        arrayList2.add(array);
                        i++;
                        i2 = i3;
                    }
                    obj = null;
                    if (!cls2.isInstance(array)) {
                        array = obj;
                    }
                    if (array == null) {
                        String str2 = (String) arrayList3.get(i2);
                        cls = (Class) arrayList4.get(i2);
                        if (dh3.f(cls, Class.class)) {
                            zb6Var = yb6.a;
                            zu3VarB = zb6Var.b(zu3.class);
                        } else if (cls.isArray()) {
                            zb6 zb6Var3 = yb6.a;
                            zu3VarB = zb6Var3.b(cls);
                            zb6Var = zb6Var3;
                        } else {
                            zb6 zb6Var4 = yb6.a;
                            zu3VarB = zb6Var4.b(cls);
                            zb6Var = zb6Var4;
                        }
                        if (dh3.f(zu3VarB.p(), zb6Var.b(Object[].class).p())) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(zu3VarB.p());
                            sb2.append('<');
                            Class<?> componentType2 = zc1.M(zu3VarB).getComponentType();
                            componentType2.getClass();
                            sb2.append(zb6Var.b(componentType2).p());
                            sb2.append('>');
                            strP = sb2.toString();
                        } else {
                            strP = zu3VarB.p();
                        }
                        throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + strP);
                    }
                    arrayList2.add(array);
                    i++;
                    i2 = i3;
                }
                array = null;
            }
            if (array == null) {
                String str3 = (String) arrayList3.get(i2);
                cls = (Class) arrayList4.get(i2);
                if (dh3.f(cls, Class.class)) {
                    zb6Var = yb6.a;
                    zu3VarB = zb6Var.b(zu3.class);
                } else if (cls.isArray()) {
                    zb6 zb6Var5 = yb6.a;
                    zu3VarB = zb6Var5.b(cls);
                    zb6Var = zb6Var5;
                } else {
                    zb6 zb6Var6 = yb6.a;
                    zu3VarB = zb6Var6.b(cls);
                    zb6Var = zb6Var6;
                }
                if (dh3.f(zu3VarB.p(), zb6Var.b(Object[].class).p())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(zu3VarB.p());
                    sb3.append('<');
                    Class<?> componentType3 = zc1.M(zu3VarB).getComponentType();
                    componentType3.getClass();
                    sb3.append(zb6Var.b(componentType3).p());
                    sb3.append('>');
                    strP = sb3.toString();
                } else {
                    strP = zu3VarB.p();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str3 + " is not of the required type " + strP);
            }
            arrayList2.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.wd0
    public final Type j() {
        return this.a;
    }

    public /* synthetic */ em(Class cls, ArrayList arrayList, cm cmVar) {
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, cmVar, dm.Y, arrayList2);
    }
}
