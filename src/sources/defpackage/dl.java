package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dl extends cw0 {
    public final boolean f0;
    public final Object g0;
    public Object h0;

    public dl(m85 m85Var, uh8 uh8Var, rs0 rs0Var, boolean z) {
        super(m85Var);
        this.g0 = uh8Var;
        this.h0 = m85Var == null ? null : rs0Var;
        this.f0 = z;
    }

    public Map F0(pi8 pi8Var, dh8 dh8Var) {
        rs0 rs0Var;
        Class clsA;
        fl flVar;
        dh8 dh8VarE0 = dh8Var.E0();
        if (dh8VarE0 == null) {
            return null;
        }
        Class cls = dh8Var.j0;
        Map mapF0 = F0(new xd6((uh8) this.g0, dh8VarE0.y0(), (byte) 20), dh8VarE0);
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() || (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers()))) {
                if (mapF0 == null) {
                    mapF0 = new LinkedHashMap();
                }
                fl flVar2 = new fl(pi8Var, field);
                if (this.f0) {
                    flVar2.c = l0(xl.i, field.getDeclaredAnnotations());
                }
                mapF0.put(field.getName(), flVar2);
            }
        }
        if (mapF0 != null && (rs0Var = (rs0) this.h0) != null && (clsA = rs0Var.a(cls)) != null) {
            Iterator it = it0.j(clsA, cls, true).iterator();
            while (it.hasNext()) {
                for (Field field2 : ((Class) it.next()).getDeclaredFields()) {
                    if ((field2.isEnumConstant() || (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()))) && (flVar = (fl) mapF0.get(field2.getName())) != null) {
                        flVar.c = l0(flVar.c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapF0;
    }

    public yr2 G0(gt0 gt0Var, gt0 gt0Var2) {
        if (!this.f0) {
            return new yr2((byte) 5, false);
        }
        Annotation[] declaredAnnotations = gt0Var.b;
        if (declaredAnnotations == null) {
            declaredAnnotations = gt0Var.a.getDeclaredAnnotations();
            gt0Var.b = declaredAnnotations;
        }
        ch3 ch3VarM0 = m0(declaredAnnotations);
        if (gt0Var2 != null) {
            Annotation[] declaredAnnotations2 = gt0Var2.b;
            if (declaredAnnotations2 == null) {
                declaredAnnotations2 = gt0Var2.a.getDeclaredAnnotations();
                gt0Var2.b = declaredAnnotations2;
            }
            ch3VarM0 = l0(ch3VarM0, declaredAnnotations2);
        }
        return ch3VarM0.i();
    }

    public yr2[] H0(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f0) {
            return cw0.Y;
        }
        int length = annotationArr.length;
        yr2[] yr2VarArr = new yr2[length];
        for (int i = 0; i < length; i++) {
            ch3 ch3VarL0 = l0(xl.i, annotationArr[i]);
            if (annotationArr2 != null) {
                ch3VarL0 = l0(ch3VarL0, annotationArr2[i]);
            }
            yr2VarArr[i] = ch3VarL0.i();
        }
        return yr2VarArr;
    }

    public hl I0(Method method, pi8 pi8Var, Method method2) {
        int length = method.getParameterTypes().length;
        m85 m85Var = (m85) this.X;
        yr2[] yr2VarArr = cw0.Y;
        if (m85Var == null) {
            yr2 yr2Var = new yr2((byte) 5, false);
            if (length != 0) {
                yr2VarArr = new yr2[length];
                for (int i = 0; i < length; i++) {
                    yr2VarArr[i] = new yr2((byte) 5, false);
                }
            }
            return new hl(pi8Var, method, yr2Var, yr2VarArr);
        }
        if (length == 0) {
            ch3 ch3VarM0 = m0(method.getDeclaredAnnotations());
            if (method2 != null) {
                ch3VarM0 = l0(ch3VarM0, method2.getDeclaredAnnotations());
            }
            return new hl(pi8Var, method, ch3VarM0.i(), yr2VarArr);
        }
        ch3 ch3VarM1 = m0(method.getDeclaredAnnotations());
        if (method2 != null) {
            ch3VarM1 = l0(ch3VarM1, method2.getDeclaredAnnotations());
        }
        return new hl(pi8Var, method, ch3VarM1.i(), H0(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    public cl J0(gt0 gt0Var, gt0 gt0Var2) {
        Annotation[][] annotationArr;
        al alVar = (al) this.g0;
        int iA = gt0Var.a();
        Constructor constructor = gt0Var.a;
        m85 m85Var = (m85) this.X;
        yr2[] yr2VarArr = cw0.Y;
        if (m85Var == null) {
            yr2 yr2Var = new yr2((byte) 5, false);
            if (iA != 0) {
                yr2VarArr = new yr2[iA];
                for (int i = 0; i < iA; i++) {
                    yr2VarArr[i] = new yr2((byte) 5, false);
                }
            }
            return new cl(alVar, constructor, yr2Var, yr2VarArr);
        }
        if (iA == 0) {
            return new cl(alVar, constructor, G0(gt0Var, gt0Var2), yr2VarArr);
        }
        Annotation[][] parameterAnnotations = gt0Var.c;
        if (parameterAnnotations == null) {
            parameterAnnotations = constructor.getParameterAnnotations();
            gt0Var.c = parameterAnnotations;
        }
        Annotation[][] annotationArr2 = null;
        yr2VarArrH0 = null;
        yr2[] yr2VarArrH0 = null;
        if (iA != parameterAnnotations.length) {
            Class declaringClass = constructor.getDeclaringClass();
            Annotation[] annotationArr3 = it0.a;
            if (Enum.class.isAssignableFrom(declaringClass) && iA == parameterAnnotations.length + 2) {
                annotationArr = new Annotation[parameterAnnotations.length + 2][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 2, parameterAnnotations.length);
                yr2VarArrH0 = H0(annotationArr, null);
            } else {
                if (declaringClass.isMemberClass() && iA == parameterAnnotations.length + 1) {
                    annotationArr = new Annotation[parameterAnnotations.length + 1][];
                    System.arraycopy(parameterAnnotations, 0, annotationArr, 1, parameterAnnotations.length);
                    annotationArr[0] = cw0.Z;
                    yr2VarArrH0 = H0(annotationArr, null);
                }
                if (yr2VarArrH0 == null) {
                    throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", constructor.getDeclaringClass().getName(), Integer.valueOf(iA), Integer.valueOf(parameterAnnotations.length)));
                }
            }
            parameterAnnotations = annotationArr;
            if (yr2VarArrH0 == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", constructor.getDeclaringClass().getName(), Integer.valueOf(iA), Integer.valueOf(parameterAnnotations.length)));
            }
        } else {
            if (gt0Var2 != null) {
                Annotation[][] parameterAnnotations2 = gt0Var2.c;
                if (parameterAnnotations2 == null) {
                    parameterAnnotations2 = gt0Var2.a.getParameterAnnotations();
                    gt0Var2.c = parameterAnnotations2;
                }
                annotationArr2 = parameterAnnotations2;
            }
            yr2VarArrH0 = H0(parameterAnnotations, annotationArr2);
        }
        return new cl(alVar, constructor, G0(gt0Var, gt0Var2), yr2VarArrH0);
    }

    public dl(m85 m85Var, al alVar, boolean z) {
        super(m85Var);
        this.g0 = alVar;
        this.f0 = z;
    }
}
