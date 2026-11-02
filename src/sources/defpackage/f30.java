package defpackage;

import io.sentry.c2;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f30 extends os4 implements Serializable {
    public static final HashMap h0;
    public static final HashMap i0;
    public final s37 g0;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(String.class.getName(), new bb0((byte) 2));
        s75 s75Var = s75.h0;
        map2.put(StringBuffer.class.getName(), s75Var);
        map2.put(StringBuilder.class.getName(), s75Var);
        map2.put(Character.class.getName(), s75Var);
        map2.put(Character.TYPE.getName(), s75Var);
        byte b = 4;
        map2.put(Integer.class.getName(), new u75(Integer.class, b));
        Class cls = Integer.TYPE;
        map2.put(cls.getName(), new u75(cls, b));
        byte b2 = 5;
        map2.put(Long.class.getName(), new u75(Long.class, b2));
        Class cls2 = Long.TYPE;
        map2.put(cls2.getName(), new u75(cls2, b2));
        String name = Byte.class.getName();
        u75 u75Var = u75.h0;
        map2.put(name, u75Var);
        map2.put(Byte.TYPE.getName(), u75Var);
        String name2 = Short.class.getName();
        u75 u75Var2 = u75.i0;
        map2.put(name2, u75Var2);
        map2.put(Short.TYPE.getName(), u75Var2);
        byte b3 = 3;
        map2.put(Double.class.getName(), new u75(Double.class, b3));
        Class cls3 = Double.TYPE;
        map2.put(cls3.getName(), new u75(cls3, b3));
        String name3 = Float.class.getName();
        u75 u75Var3 = u75.g0;
        map2.put(name3, u75Var3);
        map2.put(Float.TYPE.getName(), u75Var3);
        map2.put(Boolean.TYPE.getName(), new t60((byte) 1, true));
        int i = 0;
        map2.put(Boolean.class.getName(), new t60((byte) 1, false));
        map2.put(BigInteger.class.getName(), new t75(BigInteger.class, (byte) 2));
        map2.put(BigDecimal.class.getName(), new t75(BigDecimal.class, (byte) 2));
        map2.put(Calendar.class.getName(), cd0.i0);
        map2.put(Date.class.getName(), xb1.i0);
        HashMap map3 = new HashMap();
        map3.put(URL.class, new s75(i, URL.class));
        map3.put(URI.class, new s75(i, URI.class));
        map3.put(Currency.class, new s75(i, Currency.class));
        map3.put(UUID.class, new il8(null));
        map3.put(Pattern.class, new s75(i, Pattern.class));
        map3.put(Locale.class, new s75(i, Locale.class));
        map3.put(AtomicBoolean.class, fj7.class);
        map3.put(AtomicInteger.class, gj7.class);
        map3.put(AtomicLong.class, hj7.class);
        map3.put(File.class, l92.class);
        map3.put(Class.class, et0.class);
        c75 c75Var = c75.f0;
        map3.put(Void.class, c75Var);
        map3.put(Void.TYPE, c75Var);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof ar3) {
                map2.put(((Class) entry.getKey()).getName(), (ar3) value);
            } else {
                map.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        map.put(jb8.class.getName(), kb8.class);
        h0 = map2;
        i0 = map;
    }

    public f30(s37 s37Var) {
        this.g0 = s37Var == null ? new s37(null, null, null) : s37Var;
    }

    public static ep3 X(t37 t37Var, z20 z20Var, dh8 dh8Var, Class cls) {
        md0 md0Var = t37Var.X.i0;
        ep3 ep3VarA = ep3.g0;
        m85 m85Var = z20Var.d;
        if (m85Var != null) {
            ep3VarA = ep3VarA.a(m85Var.x(z20Var.e));
        }
        Class cls2 = dh8Var.j0;
        return ep3VarA;
    }

    public static ar3 Z(t37 t37Var, vj8 vj8Var) {
        l37 l37Var = t37Var.X;
        Object objI = l37Var.d().I(vj8Var);
        if (objI == null) {
            return null;
        }
        ar3 ar3VarD = t37Var.D(vj8Var, objI);
        Object objE = l37Var.d().E(vj8Var);
        if (objE == null) {
            return ar3VarD;
        }
        t37Var.f(objE);
        return ar3VarD;
    }

    public final lj7 Y(t37 t37Var, dh8 dh8Var, z20 z20Var) {
        if (uq3.class.isAssignableFrom(dh8Var.j0)) {
            return c75.g0;
        }
        gl glVarC = z20Var.c();
        if (glVarC == null) {
            return null;
        }
        l37 l37Var = t37Var.X;
        l37Var.getClass();
        if (l37Var.f(xp4.q0)) {
            it0.d(glVarC.B0(), l37Var.f(xp4.r0));
        }
        dh8 dh8VarQ = glVarC.Q();
        ar3 ar3VarZ = Z(t37Var, glVarC);
        if (ar3VarZ == null) {
            ar3VarZ = (ar3) dh8VarQ.l0;
        }
        ri8 ri8VarM = (ri8) dh8VarQ.m0;
        if (ri8VarM == null) {
            ri8VarM = m(l37Var, dh8VarQ);
        }
        yo3 yo3VarV = l37Var.d().v(glVarC);
        Set set = yo3VarV.Z ? Collections.EMPTY_SET : yo3VarV.X;
        if (ar3VarZ != null && !set.isEmpty()) {
            ar3VarZ = ar3VarZ.i(set);
        }
        return new uv(glVarC, ri8VarM, ar3VarZ, set);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    @Override // defpackage.os4
    public final ar3 l(t37 t37Var, dh8 dh8Var) {
        ar3 ar3VarD;
        gl glVarC;
        ar3 ij7Var;
        Class cls;
        ar3 ij7Var2;
        l37 l37Var = t37Var.X;
        z20 z20VarI = l37Var.i(dh8Var);
        Class cls2 = dh8Var.j0;
        al alVar = z20VarI.e;
        s37 s37Var = this.g0;
        u37[] u37VarArr = s37Var.Y;
        if (u37VarArr.length > 0) {
            int i = 0;
            ar3VarD = null;
            while (i < u37VarArr.length) {
                if (i >= u37VarArr.length) {
                    bt.n();
                    return null;
                }
                int i2 = i + 1;
                ar3 ar3VarA = u37VarArr[i].a(dh8Var);
                if (ar3VarA != null) {
                    ar3VarD = ar3VarA;
                    break;
                }
                i = i2;
                ar3VarD = ar3VarA;
            }
        } else {
            ar3VarD = null;
        }
        if (ar3VarD == null) {
            Object objK = l37Var.d().k(alVar);
            ar3VarD = objK != null ? t37Var.D(alVar, objK) : null;
            if (ar3VarD == null) {
                if (cls2 == null || cls2 == Object.class) {
                    ar3VarD = new jj7();
                } else if (cls2 == String.class) {
                    ar3VarD = wl7.e;
                } else {
                    if (cls2.isPrimitive()) {
                        Annotation[] annotationArr = it0.a;
                        if (cls2 == Integer.TYPE) {
                            cls = Integer.class;
                        } else if (cls2 == Long.TYPE) {
                            cls = Long.class;
                        } else if (cls2 == Boolean.TYPE) {
                            cls = Boolean.class;
                        } else if (cls2 == Double.TYPE) {
                            cls = Double.class;
                        } else if (cls2 == Float.TYPE) {
                            cls = Float.class;
                        } else if (cls2 == Byte.TYPE) {
                            cls = Byte.class;
                        } else if (cls2 == Short.TYPE) {
                            cls = Short.class;
                        } else {
                            if (cls2 != Character.TYPE) {
                                u52.m("Class ", cls2.getName(), " is not a primitive type");
                                return null;
                            }
                            cls = Character.class;
                        }
                    } else {
                        cls = cls2;
                    }
                    if (cls == Integer.class) {
                        ij7Var2 = new ij7(5, cls);
                    } else if (cls == Long.class) {
                        ij7Var2 = new ij7(6, cls);
                    } else if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
                        ij7Var2 = new ij7(8, cls);
                    } else if (cls == Class.class) {
                        ij7Var2 = new ij7(3, cls);
                    } else if (Date.class.isAssignableFrom(cls)) {
                        ij7Var2 = new ij7(1, cls);
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        ij7Var2 = new ij7(2, cls);
                    } else if (cls == UUID.class) {
                        ij7Var2 = new ij7(8, cls);
                    } else if (cls == byte[].class) {
                        ij7Var2 = new ij7(7, cls);
                    } else {
                        ar3VarD = null;
                    }
                    ar3VarD = ij7Var2;
                }
                if (ar3VarD == null) {
                    pf5 pf5Var = z20VarI.b;
                    if (pf5Var != null) {
                        if (!pf5Var.i) {
                            pf5Var.i();
                        }
                        LinkedList linkedList = pf5Var.q;
                        if (linkedList == null) {
                            glVarC = null;
                        } else {
                            if (linkedList.size() > 1 && !pf5.g(pf5Var.q)) {
                                pf5Var.j("Multiple 'as-key' properties defined (%s vs %s)", pf5Var.q.get(0), pf5Var.q.get(1));
                                throw null;
                            }
                            glVarC = (gl) pf5Var.q.get(0);
                        }
                    } else {
                        glVarC = null;
                    }
                    if (glVarC == null) {
                        glVarC = z20VarI.c();
                    }
                    if (glVarC != null) {
                        ar3 ar3VarL = l(t37Var, glVarC.Q());
                        if (l37Var.f(xp4.q0)) {
                            it0.d(glVarC.B0(), l37Var.f(xp4.r0));
                        }
                        yo3 yo3VarV = l37Var.d().v(glVarC);
                        Set set = yo3VarV.Z ? Collections.EMPTY_SET : yo3VarV.X;
                        if (!set.isEmpty()) {
                            ar3VarL = ar3VarL.i(set);
                        }
                        ar3VarD = new uv(glVarC, null, ar3VarL, set);
                    } else if (cls2 == null) {
                        ij7Var = new ij7(8, cls2);
                        ar3VarD = ij7Var;
                    } else if (cls2 == Enum.class) {
                        ij7Var = new jj7();
                        ar3VarD = ij7Var;
                    } else {
                        Annotation[] annotationArr2 = it0.a;
                        if (Enum.class.isAssignableFrom(cls2)) {
                            zl zlVarF = zl.f(l37Var, alVar);
                            v22.t(l37Var, alVar);
                            ar3VarD = new kj7(cls2, zlVarF);
                        } else {
                            ij7Var = new ij7(8, cls2);
                            ar3VarD = ij7Var;
                        }
                    }
                }
            }
        }
        if (s37Var.a()) {
            lt ltVarB = s37Var.b();
            if (ltVarB.hasNext()) {
                ltVarB.next().getClass();
                c2.m();
                return null;
            }
        }
        return ar3VarD;
    }

    @Override // defpackage.os4
    public final si8 m(l37 l37Var, dh8 dh8Var) {
        ArrayList arrayList;
        dh8 dh8VarC = l37Var.c(dh8Var.j0);
        ((b30) l37Var.Y.Y).getClass();
        z20 z20VarE0 = b30.E0(l37Var, dh8VarC);
        if (z20VarE0 == null) {
            z20VarE0 = z20.d(l37Var, dh8VarC, bl.g(l37Var, dh8VarC, l37Var));
        }
        al alVar = z20VarE0.e;
        nj7 nj7VarL = l37Var.d().L(l37Var, alVar, dh8Var);
        if (nj7VarL == null) {
            arrayList = null;
            nj7VarL = null;
        } else {
            m85 m85VarD = l37Var.d();
            HashMap map = new HashMap();
            mj7.l(alVar, new f25(alVar.C0, null), l37Var, m85VarD, map);
            arrayList = new ArrayList(map.values());
        }
        if (nj7VarL == null) {
            return null;
        }
        return nj7VarL.a(l37Var, dh8Var, arrayList);
    }
}
