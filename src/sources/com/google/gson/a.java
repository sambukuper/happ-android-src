package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonElementTypeAdapter;
import defpackage.bo3;
import defpackage.cp4;
import defpackage.fr3;
import defpackage.hs3;
import defpackage.mj0;
import defpackage.or3;
import defpackage.qr3;
import defpackage.rl7;
import defpackage.rq3;
import defpackage.sj2;
import defpackage.su2;
import defpackage.u52;
import defpackage.uo3;
import defpackage.vg8;
import defpackage.wm3;
import defpackage.xp3;
import defpackage.yi8;
import defpackage.z68;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final mj0 c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;
    public final boolean f;
    public final sj2 g;
    public final int h;

    public a(su2 su2Var) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        Excluder excluder = su2Var.a;
        HashMap map = new HashMap(su2Var.b);
        this.f = su2Var.e;
        this.g = su2Var.f;
        this.h = su2Var.i;
        su2.b(su2Var.c);
        su2.b(su2Var.d);
        List listB = su2.b(su2Var.g);
        if (su2Var == su2.o) {
            this.c = su2.m;
            this.d = su2.n;
            this.e = su2.p;
        } else {
            mj0 mj0Var = new mj0((byte) 9, map, listB, false);
            this.c = mj0Var;
            JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(mj0Var);
            this.d = jsonAdapterAnnotationTypeAdapterFactory;
            this.e = su2Var.a(mj0Var, jsonAdapterAnnotationTypeAdapterFactory);
        }
    }

    public final Object a(bo3 bo3Var, Type type) {
        yi8 yi8Var = new yi8(type);
        or3 or3Var = new or3(or3.v0);
        or3Var.r0 = new Object[32];
        or3Var.s0 = 0;
        or3Var.t0 = new String[32];
        or3Var.u0 = new int[32];
        or3Var.i1(bo3Var);
        return b(or3Var, yi8Var);
    }

    public final Object b(rq3 rq3Var, yi8 yi8Var) {
        int i = rq3Var.q0;
        boolean z = true;
        int i2 = this.h;
        if (i2 != 0) {
            rq3Var.C0(i2);
        } else if (i == 2) {
            rq3Var.q0 = 1;
        }
        try {
            try {
                try {
                    rq3Var.c0();
                    z = false;
                    b bVarE = e(yi8Var);
                    Class cls = yi8Var.a;
                    Object objB = bVarE.b(rq3Var);
                    Class clsP0 = z68.P0(cls);
                    if (objB != null && !clsP0.isInstance(objB)) {
                        throw new ClassCastException("Type adapter '" + bVarE + "' returned wrong type; requested " + cls + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    rq3Var.C0(i);
                    return objB;
                } catch (EOFException e) {
                    if (!z) {
                        throw new fr3(e);
                    }
                    rq3Var.C0(i);
                    return null;
                } catch (IllegalStateException e2) {
                    throw new fr3(e2);
                }
            } catch (IOException e3) {
                throw new fr3(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            rq3Var.C0(i);
            throw th;
        }
    }

    public final Object c(String str, yi8 yi8Var) {
        if (str == null) {
            return null;
        }
        rq3 rq3Var = new rq3(new StringReader(str));
        int i = this.h;
        if (i == 0) {
            i = 2;
        }
        rq3Var.C0(i);
        Object objB = b(rq3Var, yi8Var);
        if (objB != null) {
            try {
                if (rq3Var.c0() != 10) {
                    throw new fr3("JSON document was not fully consumed.");
                }
            } catch (cp4 e) {
                throw new fr3(e);
            } catch (IOException e2) {
                throw new uo3(e2);
            }
        }
        return objB;
    }

    public final Object d(String str, Type type) {
        return c(str, new yi8(type));
    }

    public final b e(yi8 yi8Var) {
        boolean z;
        Objects.requireNonNull(yi8Var, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        b bVar = (b) concurrentHashMap.get(yi8Var);
        if (bVar != null) {
            return bVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            b bVar2 = (b) map.get(yi8Var);
            if (bVar2 != null) {
                return bVar2;
            }
            z = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(yi8Var, gson$FutureTypeAdapter);
            Iterator it = this.e.iterator();
            b bVarA = null;
            while (it.hasNext()) {
                bVarA = ((vg8) it.next()).a(this, yi8Var);
                if (bVarA != null) {
                    if (gson$FutureTypeAdapter.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter.a = bVarA;
                    map.put(yi8Var, bVarA);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (bVarA == null) {
                u52.j(yi8Var, "GSON (2.14.0) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return bVarA;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    public final b f(vg8 vg8Var, yi8 yi8Var) {
        Objects.requireNonNull(vg8Var, "skipPast must not be null");
        Objects.requireNonNull(yi8Var, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.d;
        jsonAdapterAnnotationTypeAdapterFactory.getClass();
        ConcurrentHashMap concurrentHashMap = jsonAdapterAnnotationTypeAdapterFactory.Y;
        if (vg8Var == JsonAdapterAnnotationTypeAdapterFactory.Z) {
            vg8Var = jsonAdapterAnnotationTypeAdapterFactory;
        } else {
            Class cls = yi8Var.a;
            vg8 vg8Var2 = (vg8) concurrentHashMap.get(cls);
            if (vg8Var2 == null) {
                wm3 wm3Var = (wm3) cls.getAnnotation(wm3.class);
                if (wm3Var != null) {
                    Class clsValue = wm3Var.value();
                    if (vg8.class.isAssignableFrom(clsValue)) {
                        vg8 vg8Var3 = (vg8) jsonAdapterAnnotationTypeAdapterFactory.X.P(new yi8(clsValue), true).d();
                        vg8 vg8Var4 = (vg8) concurrentHashMap.putIfAbsent(cls, vg8Var3);
                        if (vg8Var4 != null) {
                            vg8Var3 = vg8Var4;
                        }
                        if (vg8Var3 == vg8Var) {
                            vg8Var = jsonAdapterAnnotationTypeAdapterFactory;
                        }
                    }
                }
            } else if (vg8Var2 == vg8Var) {
                vg8Var = jsonAdapterAnnotationTypeAdapterFactory;
            }
        }
        boolean z = false;
        for (vg8 vg8Var5 : this.e) {
            if (z) {
                b bVarA = vg8Var5.a(this, yi8Var);
                if (bVarA != null) {
                    return bVarA;
                }
            } else if (vg8Var5 == vg8Var) {
                z = true;
            }
        }
        if (!z) {
            return e(yi8Var);
        }
        u52.j(yi8Var, "GSON cannot serialize or deserialize ");
        return null;
    }

    public final String g(bo3 bo3Var) {
        StringBuilder sb = new StringBuilder();
        try {
            hs3 hs3Var = new hs3(new rl7(sb));
            hs3Var.D(this.g);
            hs3Var.k0 = this.f;
            int i = this.h;
            if (i == 0) {
                i = 2;
            }
            hs3Var.J(i);
            hs3Var.m0 = false;
            i(bo3Var, hs3Var);
            return sb.toString();
        } catch (IOException e) {
            throw new uo3(e);
        }
    }

    public final String h(Object obj) {
        if (obj == null) {
            return g(xp3.X);
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            hs3 hs3Var = new hs3(new rl7(sb));
            hs3Var.D(this.g);
            hs3Var.k0 = this.f;
            int i = this.h;
            if (i == 0) {
                i = 2;
            }
            hs3Var.J(i);
            hs3Var.m0 = false;
            j(obj, cls, hs3Var);
            return sb.toString();
        } catch (IOException e) {
            throw new uo3(e);
        }
    }

    public final void i(bo3 bo3Var, hs3 hs3Var) {
        int i = hs3Var.j0;
        boolean z = hs3Var.k0;
        boolean z2 = hs3Var.m0;
        hs3Var.k0 = this.f;
        hs3Var.m0 = false;
        int i2 = this.h;
        if (i2 != 0) {
            hs3Var.J(i2);
        } else if (i == 2) {
            hs3Var.j0 = 1;
        }
        try {
            try {
                try {
                    JsonElementTypeAdapter.a.getClass();
                    JsonElementTypeAdapter.f(bo3Var, hs3Var);
                    hs3Var.J(i);
                    hs3Var.k0 = z;
                    hs3Var.m0 = z2;
                } catch (IOException e) {
                    throw new uo3(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            hs3Var.J(i);
            hs3Var.k0 = z;
            hs3Var.m0 = z2;
            throw th;
        }
    }

    public final void j(Object obj, Class cls, hs3 hs3Var) {
        b bVarE = e(new yi8(cls));
        int i = hs3Var.j0;
        int i2 = this.h;
        if (i2 != 0) {
            hs3Var.J(i2);
        } else if (i == 2) {
            hs3Var.j0 = 1;
        }
        boolean z = hs3Var.k0;
        boolean z2 = hs3Var.m0;
        hs3Var.k0 = this.f;
        hs3Var.m0 = false;
        try {
            try {
                bVarE.c(hs3Var, obj);
                hs3Var.J(i);
                hs3Var.k0 = z;
                hs3Var.m0 = z2;
            } catch (IOException e) {
                throw new uo3(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            hs3Var.J(i);
            hs3Var.k0 = z;
            hs3Var.m0 = z2;
            throw th;
        }
    }

    public final bo3 k(Object obj) {
        Class cls = obj.getClass();
        qr3 qr3Var = new qr3();
        j(obj, cls, qr3Var);
        ArrayList arrayList = qr3Var.q0;
        if (arrayList.isEmpty()) {
            return qr3Var.s0;
        }
        u52.r(arrayList, "Expected one JSON element but was ");
        return null;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public a() {
        this(su2.o);
    }
}
