package com.google.gson.internal.bind;

import defpackage.a85;
import defpackage.fr3;
import defpackage.hs3;
import defpackage.iq3;
import defpackage.k32;
import defpackage.mj0;
import defpackage.nr4;
import defpackage.oi0;
import defpackage.or3;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements vg8 {
    public final mj0 X;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public final class Adapter<K, V> extends com.google.gson.b {
        public final com.google.gson.b a;
        public final com.google.gson.b b;
        public final a85 c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, com.google.gson.b bVar, com.google.gson.b bVar2, a85 a85Var) {
            this.a = bVar;
            this.b = bVar2;
            this.c = a85Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) throws IOException {
            int iC0 = rq3Var.c0();
            if (iC0 == 9) {
                rq3Var.X();
                return null;
            }
            Map map = (Map) this.c.d();
            if (iC0 == 1) {
                rq3Var.Q0();
                while (rq3Var.hasNext()) {
                    rq3Var.Q0();
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) this.a).b.b(rq3Var);
                    Object objB2 = ((TypeAdapterRuntimeTypeWrapper) this.b).b.b(rq3Var);
                    if (map.containsKey(objB)) {
                        throw new fr3(oi0.k(objB, "duplicate key: "));
                    }
                    map.put(objB, objB2);
                    rq3Var.K0();
                }
                rq3Var.K0();
                return map;
            }
            rq3Var.F0();
            while (rq3Var.hasNext()) {
                k32.X.getClass();
                if (rq3Var instanceof or3) {
                    or3 or3Var = (or3) rq3Var;
                    or3Var.c1(5);
                    Map.Entry entry = (Map.Entry) ((Iterator) or3Var.g1()).next();
                    or3Var.i1(entry.getValue());
                    or3Var.i1(new iq3((String) entry.getKey()));
                } else {
                    int iK = rq3Var.i0;
                    if (iK == 0) {
                        iK = rq3Var.k();
                    }
                    if (iK == 13) {
                        rq3Var.i0 = 9;
                    } else if (iK == 12) {
                        rq3Var.i0 = 8;
                    } else {
                        if (iK != 14) {
                            throw rq3Var.a1("a name");
                        }
                        rq3Var.i0 = 10;
                    }
                }
                Object objB3 = ((TypeAdapterRuntimeTypeWrapper) this.a).b.b(rq3Var);
                Object objB4 = ((TypeAdapterRuntimeTypeWrapper) this.b).b.b(rq3Var);
                if (map.containsKey(objB3)) {
                    throw new fr3(oi0.k(objB3, "duplicate key: "));
                }
                map.put(objB3, objB4);
            }
            rq3Var.j0();
            return map;
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                hs3Var.u();
                return;
            }
            hs3Var.F0();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                hs3Var.m(String.valueOf(entry.getKey()));
                this.b.c(hs3Var, entry.getValue());
            }
            hs3Var.j0();
        }
    }

    public MapTypeAdapterFactory(mj0 mj0Var) {
        this.X = mj0Var;
    }

    @Override // defpackage.vg8
    public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
        Type[] actualTypeArguments;
        Type type = yi8Var.b;
        Class cls = yi8Var.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeB = nr4.B(type, cls, Map.class);
            actualTypeArguments = typeB instanceof ParameterizedType ? ((ParameterizedType) typeB).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(this, new TypeAdapterRuntimeTypeWrapper(aVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? b.c : aVar.e(new yi8(type2)), type2), new TypeAdapterRuntimeTypeWrapper(aVar, aVar.e(new yi8(type3)), type3), this.X.P(yi8Var, false));
    }
}
