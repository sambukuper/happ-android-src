package com.google.gson.internal.bind;

import defpackage.bt;
import defpackage.hs3;
import defpackage.p37;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class EnumTypeAdapter<T extends Enum<T>> extends com.google.gson.b {
    public static final vg8 d = new vg8() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            Class superclass = yi8Var.a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new EnumTypeAdapter(superclass);
        }
    };
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int iCeil = (int) Math.ceil(i / 0.75f);
            this.a = new HashMap(iCeil);
            this.b = new HashMap(iCeil);
            this.c = new HashMap(iCeil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String strName = r5.name();
                String string = r5.toString();
                p37 p37Var = (p37) field2.getAnnotation(p37.class);
                if (p37Var != null) {
                    strName = p37Var.value();
                    for (String str : p37Var.alternate()) {
                        this.a.put(str, r5);
                    }
                }
                this.a.put(strName, r5);
                this.b.put(string, r5);
                this.c.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            bt.g(e);
            throw null;
        }
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        if (rq3Var.c0() == 9) {
            rq3Var.X();
            return null;
        }
        String strR = rq3Var.r();
        Enum r0 = (Enum) this.a.get(strR);
        return r0 == null ? (Enum) this.b.get(strR) : r0;
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        hs3Var.c0(r2 == null ? null : (String) this.c.get(r2));
    }
}
