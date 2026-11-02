package defpackage;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class av3 implements dn2 {
    public final /* synthetic */ byte X;
    public final ev3 Y;

    public /* synthetic */ av3(ev3 ev3Var, byte b) {
        this.X = b;
        this.Y = ev3Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    @Override // defpackage.dn2
    public final Object invoke() throws InvocationTargetException {
        sx4 sx4VarM;
        ?? arrayList;
        zu3 zu3VarK;
        Class cls;
        byte b = this.X;
        boolean z = true;
        ev3 ev3Var = this.Y;
        switch (b) {
            case 0:
                return new cv3(ev3Var);
            case 1:
                Class cls2 = ev3Var.Y;
                if (!Iterable.class.isAssignableFrom(cls2) && !Map.class.isAssignableFrom(cls2) && !CharSequence.class.isAssignableFrom(cls2) && !Number.class.isAssignableFrom(cls2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                qs0 qs0VarF0 = ev3Var.f0();
                Class cls3 = ev3Var.Y;
                tb6 tb6Var = ((cv3) ev3Var.Z.getValue()).a;
                nw3 nw3Var = nv3.b[0];
                Object objInvoke = tb6Var.invoke();
                objInvoke.getClass();
                gr6 gr6Var = (gr6) objInvoke;
                hl1 hl1Var = gr6Var.a;
                vx4 vx4Var = hl1Var.b;
                if (qs0VarF0.c && cls3.isAnnotationPresent(Metadata.class)) {
                    os0 os0Var = hl1Var.t;
                    Set set = os0.c;
                    sx4VarM = os0Var.a(qs0VarF0, null);
                } else {
                    sx4VarM = oc.m(vx4Var, qs0VarF0);
                }
                if (sx4VarM != null) {
                    return sx4VarM;
                }
                if (cls3.isSynthetic()) {
                    return ev3.e0(qs0VarF0, gr6Var);
                }
                qb6 qb6VarO = z91.o(cls3);
                a04 a04Var = qb6VarO != null ? qb6VarO.b.a : null;
                switch (a04Var != null ? dv3.a[a04Var.ordinal()] : -1) {
                    case -1:
                    case 6:
                        om0.h("Unresolved class: ", cls3, " (kind = ", a04Var);
                        return null;
                    case 0:
                    default:
                        b61.c();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return ev3.e0(qs0VarF0, gr6Var);
                    case 5:
                        om0.h("Unknown class: ", cls3, " (kind = ", a04Var);
                        return null;
                }
            case 3:
                Class cls4 = ev3Var.Y;
                Annotation[] annotations = cls4.getAnnotations();
                if (annotations.length != cls4.getDeclaredAnnotations().length) {
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Class superclass = cls4;
                    do {
                        Annotation[] declaredAnnotations = superclass.getDeclaredAnnotations();
                        for (int length = declaredAnnotations.length - 1; -1 < length; length--) {
                            Annotation annotation = declaredAnnotations[length];
                            if (!ev3.f0.contains(zc1.M(zc1.K(annotation)).getName())) {
                                if (superclass != cls4) {
                                    fk2 fk2Var = ms8.a;
                                    if (zc1.M(zc1.K(annotation)).getAnnotation(Inherited.class) != null) {
                                        if (ms8.j(zc1.K(annotation))) {
                                            Class<?> componentType = zc1.M(zc1.K(annotation)).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                            componentType.getClass();
                                            if (zc1.M(yb6.a.b(componentType)).getAnnotation(Inherited.class) != null) {
                                                fk2 fk2Var2 = ms8.a;
                                                zu3VarK = zc1.K(annotation);
                                                if (ms8.j(zu3VarK)) {
                                                    Class<?> componentType2 = zc1.M(zu3VarK).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                    componentType2.getClass();
                                                    zu3VarK = yb6.a.b(componentType2);
                                                }
                                                cls = (Class) linkedHashMap.get(zu3VarK);
                                                if (cls == null) {
                                                    linkedHashMap.put(zu3VarK, superclass);
                                                }
                                                if (cls != null || cls.equals(superclass)) {
                                                    arrayList2.add(annotation);
                                                }
                                            }
                                        } else {
                                            fk2 fk2Var3 = ms8.a;
                                            zu3VarK = zc1.K(annotation);
                                            if (ms8.j(zu3VarK)) {
                                                Class<?> componentType3 = zc1.M(zu3VarK).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                componentType3.getClass();
                                                zu3VarK = yb6.a.b(componentType3);
                                            }
                                            cls = (Class) linkedHashMap.get(zu3VarK);
                                            if (cls == null) {
                                                linkedHashMap.put(zu3VarK, superclass);
                                            }
                                            if (cls != null) {
                                                arrayList2.add(annotation);
                                            } else {
                                                arrayList2.add(annotation);
                                            }
                                        }
                                    }
                                } else {
                                    fk2 fk2Var4 = ms8.a;
                                    zu3VarK = zc1.K(annotation);
                                    if (ms8.j(zu3VarK)) {
                                        Class<?> componentType4 = zc1.M(zu3VarK).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                        componentType4.getClass();
                                        zu3VarK = yb6.a.b(componentType4);
                                    }
                                    cls = (Class) linkedHashMap.get(zu3VarK);
                                    if (cls == null) {
                                        linkedHashMap.put(zu3VarK, superclass);
                                    }
                                    if (cls != null) {
                                        arrayList2.add(annotation);
                                    } else {
                                        arrayList2.add(annotation);
                                    }
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    } while (superclass != null);
                    arrayList = wv0.M0(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    for (Annotation annotation2 : annotations) {
                        if (!ev3.f0.contains(zc1.M(zc1.K(annotation2)).getName())) {
                            arrayList.add(annotation2);
                        }
                    }
                }
                return ms8.t(arrayList);
            case 4:
                Class cls5 = ev3Var.Y;
                if (cls5.isAnonymousClass()) {
                    return null;
                }
                qs0 qs0VarF1 = ev3Var.f0();
                if (!qs0VarF1.c) {
                    String strB = qs0VarF1.f().b();
                    strB.getClass();
                    return strB;
                }
                String simpleName = cls5.getSimpleName();
                Method enclosingMethod = cls5.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return fm7.J0(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls5.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    int iL0 = fm7.l0(simpleName, '$', 0, 6);
                    return iL0 == -1 ? simpleName : simpleName.substring(iL0 + 1, simpleName.length());
                }
                return fm7.J0(simpleName, enclosingConstructor.getName() + '$');
            default:
                if (ev3Var.Y.isAnonymousClass()) {
                    return null;
                }
                qs0 qs0VarF2 = ev3Var.f0();
                if (qs0VarF2.c) {
                    return null;
                }
                return qs0VarF2.a().a.a;
        }
    }

    public /* synthetic */ av3(ev3 ev3Var, cv3 cv3Var, byte b) {
        this.X = b;
        this.Y = ev3Var;
    }
}
