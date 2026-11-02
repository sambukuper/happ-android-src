package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import defpackage.a85;
import defpackage.ch3;
import defpackage.dh3;
import defpackage.ec6;
import defpackage.eq3;
import defpackage.fr3;
import defpackage.hs3;
import defpackage.ic6;
import defpackage.jc6;
import defpackage.mj0;
import defpackage.p61;
import defpackage.rq3;
import defpackage.u52;
import defpackage.uo3;
import defpackage.vg8;
import defpackage.xw3;
import defpackage.yi8;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements vg8 {
    public final mj0 X;
    public final int Y;
    public final Excluder Z;
    public final JsonAdapterAnnotationTypeAdapterFactory f0;
    public final List g0;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    class AnonymousClass1 extends com.google.gson.b {
        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) throws IOException {
            rq3Var.v();
            return null;
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) throws IOException {
            hs3Var.u();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static abstract class Adapter<T, A> extends com.google.gson.b {
        public final jc6 a;

        public Adapter(jc6 jc6Var) {
            this.a = jc6Var;
        }

        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) throws IOException {
            if (rq3Var.c0() == 9) {
                rq3Var.X();
                return null;
            }
            Object objD = d();
            Map map = this.a.a;
            try {
                rq3Var.F0();
                while (rq3Var.hasNext()) {
                    ic6 ic6Var = (ic6) map.get(rq3Var.e0());
                    if (ic6Var == null) {
                        rq3Var.v();
                    } else {
                        f(objD, rq3Var, ic6Var);
                    }
                }
                rq3Var.j0();
                return e(objD);
            } catch (IllegalAccessException e) {
                dh3 dh3Var = ec6.a;
                xw3.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                return null;
            } catch (IllegalStateException e2) {
                throw new fr3(e2);
            }
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) throws IOException {
            if (obj == null) {
                hs3Var.u();
                return;
            }
            hs3Var.F0();
            try {
                Iterator it = this.a.b.iterator();
                while (it.hasNext()) {
                    ((ic6) it.next()).a(hs3Var, obj);
                }
                hs3Var.j0();
            } catch (IllegalAccessException e) {
                dh3 dh3Var = ec6.a;
                xw3.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, rq3 rq3Var, ic6 ic6Var);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        public static final HashMap e;
        public final Constructor b;
        public final Object[] c;
        public final HashMap d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            e = map;
        }

        public RecordAdapter(Class cls, jc6 jc6Var) {
            super(jc6Var);
            this.d = new HashMap();
            dh3 dh3Var = ec6.a;
            Constructor constructorU = dh3Var.u(cls);
            this.b = constructorU;
            ec6.f(constructorU);
            String[] strArrV = dh3Var.v(cls);
            for (int i = 0; i < strArrV.length; i++) {
                this.d.put(strArrV[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                dh3 dh3Var = ec6.a;
                xw3.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                return null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + ec6.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + ec6.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                xw3.o("Failed to invoke constructor '" + ec6.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
                return null;
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, rq3 rq3Var, ic6 ic6Var) {
            Object[] objArr = (Object[]) obj;
            String str = ic6Var.c;
            Integer num = (Integer) this.d.get(str);
            if (num == null) {
                u52.o("Could not find the index in the constructor '", ec6.b(this.b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                return;
            }
            int iIntValue = num.intValue();
            Object objB = ic6Var.f.b(rq3Var);
            if (objB != null || !ic6Var.g) {
                objArr[iIntValue] = objB;
            } else {
                StringBuilder sbP = p61.p("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                sbP.append(rq3Var.p());
                throw new eq3(sbP.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(mj0 mj0Var, int i, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.X = mj0Var;
        this.Y = i;
        this.Z = excluder;
        this.f0 = jsonAdapterAnnotationTypeAdapterFactory;
        this.g0 = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ec6.c(field) + " and " + ec6.c(field2) + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
    }

    @Override // defpackage.vg8
    public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
        Class cls = yi8Var.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        dh3 dh3Var = ec6.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new AnonymousClass1();
        }
        ch3.A(this.g0);
        return ec6.a.B(cls) ? new RecordAdapter(cls, c(aVar, yi8Var, cls, true)) : new FieldReflectionAdapter(this.X.P(yi8Var, true), c(aVar, yi8Var, cls, false));
    }

    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final defpackage.jc6 c(com.google.gson.a r30, defpackage.yi8 r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.a, yi8, java.lang.Class, boolean):jc6");
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.Z;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.b(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? excluder.X : excluder.Y;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        public final a85 b;

        public FieldReflectionAdapter(a85 a85Var, jc6 jc6Var) {
            super(jc6Var);
            this.b = a85Var;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.b.d();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, rq3 rq3Var, ic6 ic6Var) throws IllegalAccessException {
            Field field = ic6Var.b;
            Object objB = ic6Var.f.b(rq3Var);
            if (objB == null && ic6Var.g) {
                return;
            }
            if (ic6Var.h) {
                throw new uo3("Cannot set value of 'static final' ".concat(ec6.d(field, false)));
            }
            field.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }
    }
}
