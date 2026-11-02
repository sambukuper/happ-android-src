package defpackage;

import io.sentry.c2;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fj3 extends m85 {
    public static final Class[] Z = {xq3.class, yq3.class, es3.class, oo3.class, xr3.class, qq3.class, as3.class, jn3.class, mp3.class};
    public static final Class[] f0 = {wn3.class, xn3.class, es3.class, oo3.class, xr3.class, as3.class, jn3.class, mp3.class, qp3.class};
    public transient c24 X;
    public boolean Y;

    static {
        try {
            int i = pj3.a;
        } catch (Throwable th) {
            ue3.J(th);
        }
    }

    public static Class d0(Class cls) {
        if (cls == null || it0.p(cls)) {
            return null;
        }
        return cls;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    public static nj7 e0(vp4 vp4Var, vj8 vj8Var) {
        nj7 nj7Var;
        sr3 sr3Var;
        tr3 tr3Var;
        Class cls;
        tr3 tr3Var2;
        xr3 xr3Var = (xr3) vj8Var.C(xr3.class);
        vh8 vh8Var = null;
        wr3 wr3VarA = xr3Var == null ? null : wr3.a(xr3Var.use(), xr3Var.include(), xr3Var.property(), xr3Var.defaultImpl(), xr3Var.visible(), xr3Var.requireTypeIdForSubtypes().a(), xr3Var.writeTypeIdForDefaultImpl().a());
        zr3 zr3Var = (zr3) vj8Var.C(zr3.class);
        if (zr3Var != null) {
            if (wr3VarA != null) {
                Class clsValue = zr3Var.value();
                vp4Var.getClass();
                nj7Var = (nj7) it0.g(clsValue, vp4Var.f(xp4.q0));
                sr3Var = (sr3) vj8Var.C(sr3.class);
                if (sr3Var != null) {
                    Class clsValue2 = sr3Var.value();
                    vp4Var.getClass();
                    vh8Var = (vh8) it0.g(clsValue2, vp4Var.f(xp4.q0));
                }
                tr3Var = wr3VarA.Y;
                if (tr3Var == tr3.f0 && (vj8Var instanceof al) && (tr3Var2 = tr3.X) != tr3Var) {
                    wr3VarA = new wr3(wr3VarA.X, tr3Var2, wr3VarA.Z, wr3VarA.f0, wr3VarA.g0, wr3VarA.h0, wr3VarA.i0);
                }
                cls = wr3VarA.f0;
                if (cls != null && cls != vr3.class) {
                    cls.isAnnotation();
                }
                nj7Var.d = vh8Var;
                nj7Var.b(wr3VarA);
                return nj7Var;
            }
            return null;
        }
        if (wr3VarA != null) {
            ur3 ur3Var = wr3VarA.X;
            ur3 ur3Var2 = ur3.NONE;
            if (ur3Var == ur3Var2) {
                wr3 wr3VarA2 = wr3.a(ur3Var2, null, null, null, false, null, null);
                nj7 nj7Var2 = new nj7();
                nj7Var2.b(wr3VarA2);
                return nj7Var2;
            }
            nj7Var = new nj7();
            nj7Var.b(wr3VarA);
            sr3Var = (sr3) vj8Var.C(sr3.class);
            if (sr3Var != null) {
                Class clsValue3 = sr3Var.value();
                vp4Var.getClass();
                vh8Var = (vh8) it0.g(clsValue3, vp4Var.f(xp4.q0));
            }
            tr3Var = wr3VarA.Y;
            if (tr3Var == tr3.f0) {
                wr3VarA = new wr3(wr3VarA.X, tr3Var2, wr3VarA.Z, wr3VarA.f0, wr3VarA.g0, wr3VarA.h0, wr3VarA.i0);
            }
            cls = wr3VarA.f0;
            if (cls != null) {
                cls.isAnnotation();
            }
            nj7Var.d = vh8Var;
            nj7Var.b(wr3VarA);
            return nj7Var;
        }
        return null;
    }

    public static boolean f0(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            return cls == it0.v(cls2);
        }
        return cls2.isPrimitive() && cls2 == it0.v(cls);
    }

    @Override // defpackage.m85
    public final nj7 A(vp4 vp4Var, gl glVar, dh8 dh8Var) {
        if (dh8Var.I0() || dh8Var.M()) {
            return null;
        }
        return e0(vp4Var, glVar);
    }

    @Override // defpackage.m85
    public final r75 B(gl glVar) {
        mp3 mp3Var = (mp3) glVar.C(mp3.class);
        if (mp3Var != null) {
            mp3Var.value();
            return new r75((byte) 1, 1);
        }
        jn3 jn3Var = (jn3) glVar.C(jn3.class);
        if (jn3Var == null) {
            return null;
        }
        jn3Var.value();
        return new r75((byte) 1, 2);
    }

    @Override // defpackage.m85
    public final jx5 C(al alVar) {
        tq3 tq3Var = (tq3) alVar.K0.a(tq3.class);
        if (tq3Var == null) {
            return null;
        }
        String strNamespace = tq3Var.namespace();
        return jx5.b(tq3Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // defpackage.m85
    public final Object D(gl glVar) {
        Class clsD0;
        xq3 xq3Var = (xq3) glVar.C(xq3.class);
        if (xq3Var == null || (clsD0 = d0(xq3Var.contentConverter())) == null || clsD0 == z51.class) {
            return null;
        }
        return clsD0;
    }

    @Override // defpackage.m85
    public final Object E(vj8 vj8Var) {
        Class clsD0;
        xq3 xq3Var = (xq3) vj8Var.C(xq3.class);
        if (xq3Var == null || (clsD0 = d0(xq3Var.converter())) == null || clsD0 == z51.class) {
            return null;
        }
        return clsD0;
    }

    @Override // defpackage.m85
    public final String[] F(al alVar) {
        pq3 pq3Var = (pq3) alVar.K0.a(pq3.class);
        if (pq3Var == null) {
            return null;
        }
        return pq3Var.value();
    }

    @Override // defpackage.m85
    public final Boolean G(vj8 vj8Var) {
        pq3 pq3Var = (pq3) vj8Var.C(pq3.class);
        if (pq3Var == null || !pq3Var.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.m85
    public final wq3 H(vj8 vj8Var) {
        xq3 xq3Var = (xq3) vj8Var.C(xq3.class);
        if (xq3Var == null) {
            return null;
        }
        return xq3Var.typing();
    }

    @Override // defpackage.m85
    public final Object I(vj8 vj8Var) {
        Class clsUsing;
        xq3 xq3Var = (xq3) vj8Var.C(xq3.class);
        if (xq3Var != null && (clsUsing = xq3Var.using()) != zq3.class) {
            return clsUsing;
        }
        qq3 qq3Var = (qq3) vj8Var.C(qq3.class);
        if (qq3Var == null || !qq3Var.value()) {
            return null;
        }
        return new c75(vj8Var.N(), 0, (byte) 5);
    }

    @Override // defpackage.m85
    public final List J(vj8 vj8Var) {
        er3 er3Var = (er3) vj8Var.C(er3.class);
        List list = null;
        if (er3Var == null) {
            return null;
        }
        dr3[] dr3VarArrValue = er3Var.value();
        if (!er3Var.failOnRepeatedNames()) {
            ArrayList arrayList = new ArrayList(dr3VarArrValue.length);
            for (dr3 dr3Var : dr3VarArrValue) {
                arrayList.add(new f25(dr3Var.value(), dr3Var.name()));
                for (String str : dr3Var.names()) {
                    arrayList.add(new f25(dr3Var.value(), str));
                }
            }
            return arrayList;
        }
        String strL = vj8Var.L();
        ArrayList arrayList2 = new ArrayList(dr3VarArrValue.length);
        HashSet hashSet = new HashSet();
        int length = dr3VarArrValue.length;
        int i = 0;
        while (i < length) {
            dr3 dr3Var2 = dr3VarArrValue[i];
            String strName = dr3Var2.name();
            if (!strName.isEmpty() && hashSet.contains(strName)) {
                bt.q(pc6.q("Annotated type [", strL, "] got repeated subtype name [", strName, "]"));
                return list;
            }
            hashSet.add(strName);
            arrayList2.add(new f25(dr3Var2.value(), strName));
            String[] strArrNames = dr3Var2.names();
            int length2 = strArrNames.length;
            int i2 = 0;
            while (i2 < length2) {
                String str2 = strArrNames[i2];
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    bt.q(pc6.q("Annotated type [", strL, "] got repeated subtype name [", str2, "]"));
                    return list;
                }
                hashSet.add(str2);
                arrayList2.add(new f25(dr3Var2.value(), str2));
                i2++;
                list = null;
            }
            i++;
            list = null;
        }
        return arrayList2;
    }

    @Override // defpackage.m85
    public final String K(al alVar) {
        yr3 yr3Var = (yr3) alVar.K0.a(yr3.class);
        if (yr3Var == null) {
            return null;
        }
        return yr3Var.value();
    }

    @Override // defpackage.m85
    public final nj7 L(l37 l37Var, al alVar, dh8 dh8Var) {
        return e0(l37Var, alVar);
    }

    @Override // defpackage.m85
    public final c25 M(gl glVar) {
        as3 as3Var = (as3) glVar.C(as3.class);
        if (as3Var == null || !as3Var.enabled()) {
            return null;
        }
        String strPrefix = as3Var.prefix();
        String strSuffix = as3Var.suffix();
        boolean z = (strPrefix == null || strPrefix.isEmpty()) ? false : true;
        boolean z2 = (strSuffix == null || strSuffix.isEmpty()) ? false : true;
        if (z) {
            return z2 ? new y15(strPrefix, strSuffix) : new z15(strPrefix, (byte) 0);
        }
        return z2 ? new z15(strSuffix, (byte) 1) : c25.X;
    }

    @Override // defpackage.m85
    public final Class[] N(vj8 vj8Var) {
        es3 es3Var = (es3) vj8Var.C(es3.class);
        if (es3Var == null) {
            return null;
        }
        return es3Var.value();
    }

    @Override // defpackage.m85
    public final Boolean O(gl glVar) {
        xm3 xm3Var = (xm3) glVar.C(xm3.class);
        if (xm3Var == null) {
            return null;
        }
        return Boolean.valueOf(xm3Var.enabled());
    }

    @Override // defpackage.m85
    public final boolean P(hl hlVar) {
        HashMap map;
        yr2 yr2Var = hlVar.C0;
        if (yr2Var == null || (map = (HashMap) yr2Var.Y) == null) {
            return false;
        }
        return map.containsKey(xm3.class);
    }

    @Override // defpackage.m85
    public final Boolean Q(gl glVar) {
        ym3 ym3Var = (ym3) glVar.C(ym3.class);
        if (ym3Var == null) {
            return null;
        }
        return Boolean.valueOf(ym3Var.enabled());
    }

    @Override // defpackage.m85
    public final Boolean R(gl glVar) {
        ip3 ip3Var = (ip3) glVar.C(ip3.class);
        if (ip3Var == null) {
            return null;
        }
        return Boolean.valueOf(ip3Var.value());
    }

    @Override // defpackage.m85
    public final Boolean S(gl glVar) {
        bs3 bs3Var = (bs3) glVar.C(bs3.class);
        if (bs3Var == null) {
            return null;
        }
        return Boolean.valueOf(bs3Var.value());
    }

    @Override // defpackage.m85
    public final boolean T(hl hlVar) {
        bs3 bs3Var = (bs3) hlVar.C(bs3.class);
        return bs3Var != null && bs3Var.value();
    }

    @Override // defpackage.m85
    public final boolean U(gl glVar) {
        xo3 xo3Var = (xo3) glVar.C(xo3.class);
        if (xo3Var != null) {
            return xo3Var.value();
        }
        return false;
    }

    @Override // defpackage.m85
    public final Boolean V(gl glVar) {
        nq3 nq3Var = (nq3) glVar.C(nq3.class);
        if (nq3Var == null) {
            return null;
        }
        jd5 jd5VarIsRequired = nq3Var.isRequired();
        return jd5VarIsRequired != jd5.Y ? jd5VarIsRequired.a() : Boolean.valueOf(nq3Var.required());
    }

    @Override // defpackage.m85
    public final boolean W(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        String name = clsAnnotationType.getName();
        c24 c24Var = this.X;
        Boolean bool = (Boolean) ((wu5) c24Var.X).get(name);
        if (bool == null) {
            Boolean boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(gj3.class) != null);
            ((wu5) c24Var.X).g(name, boolValueOf, true);
            bool = boolValueOf;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.m85
    public final Boolean X(al alVar) {
        ap3 ap3Var = (ap3) alVar.K0.a(ap3.class);
        if (ap3Var == null) {
            return null;
        }
        return Boolean.valueOf(ap3Var.value());
    }

    @Override // defpackage.m85
    public final Boolean Z(gl glVar) {
        HashMap map;
        yr2 yr2Var = glVar.C0;
        boolean zContainsKey = false;
        if (yr2Var != null && (map = (HashMap) yr2Var.Y) != null) {
            zContainsKey = map.containsKey(rr3.class);
        }
        return Boolean.valueOf(zContainsKey);
    }

    @Override // defpackage.m85
    public final void a(vp4 vp4Var, al alVar, ArrayList arrayList) {
        dp3 dp3Var;
        jx5 jx5VarA;
        ep3 ep3Var;
        jx5 jx5VarA2;
        ep3 ep3Var2;
        tm tmVar = alVar.K0;
        Class cls = alVar.C0;
        bn3 bn3Var = (bn3) tmVar.a(bn3.class);
        if (bn3Var == null) {
            return;
        }
        boolean zPrepend = bn3Var.prepend();
        zm3[] zm3VarArrAttrs = bn3Var.attrs();
        int length = zm3VarArrAttrs.length;
        dh8 dh8VarC = null;
        int i = 0;
        while (true) {
            dp3Var = dp3.g0;
            if (i >= length) {
                break;
            }
            if (dh8VarC == null) {
                dh8VarC = vp4Var.c(Object.class);
            }
            zm3 zm3Var = zm3VarArrAttrs[i];
            ix5 ix5Var = zm3Var.required() ? ix5.h0 : ix5.i0;
            String strValue = zm3Var.value();
            String strPropName = zm3Var.propName();
            String strPropNamespace = zm3Var.propNamespace();
            if (strPropName.isEmpty()) {
                jx5VarA2 = jx5.f0;
            } else {
                jx5VarA2 = (strPropNamespace == null || strPropNamespace.isEmpty()) ? jx5.a(strPropName) : jx5.b(strPropName, strPropNamespace);
            }
            if (jx5VarA2.X.isEmpty()) {
                jx5VarA2 = jx5.a(strValue);
            }
            jx5 jx5Var = jx5VarA2;
            my8 my8Var = new my8(alVar, cls, strValue, dh8VarC);
            dp3 dp3VarInclude = zm3Var.include();
            int i2 = m97.h0;
            if (dp3VarInclude == null || dp3VarInclude == dp3Var) {
                ep3Var2 = e50.X;
            } else {
                ep3 ep3Var3 = ep3.g0;
                ep3Var2 = dp3VarInclude != dp3Var ? new ep3(dp3VarInclude, null, null, null) : ep3.g0;
            }
            vv vvVar = new vv(strValue, new m97(vp4Var.d(), my8Var, jx5Var, ix5Var, ep3Var2), alVar.K0, dh8VarC);
            if (zPrepend) {
                arrayList.add(i, vvVar);
            } else {
                arrayList.add(vvVar);
            }
            i++;
        }
        an3[] an3VarArrProps = bn3Var.props();
        if (an3VarArrProps.length > 0) {
            an3 an3Var = an3VarArrProps[0];
            ix5 ix5Var2 = an3Var.required() ? ix5.h0 : ix5.i0;
            String strName = an3Var.name();
            String strNamespace = an3Var.namespace();
            if (strName.isEmpty()) {
                jx5VarA = jx5.f0;
            } else {
                jx5VarA = (strNamespace == null || strNamespace.isEmpty()) ? jx5.a(strName) : jx5.b(strName, strNamespace);
            }
            my8 my8Var2 = new my8(alVar, cls, jx5VarA.X, vp4Var.c(an3Var.type()));
            dp3 dp3VarInclude2 = an3Var.include();
            int i3 = m97.h0;
            if (dp3VarInclude2 == null || dp3VarInclude2 == dp3Var) {
                ep3Var = e50.X;
            } else {
                ep3 ep3Var4 = ep3.g0;
                ep3Var = dp3VarInclude2 != dp3Var ? new ep3(dp3VarInclude2, null, null, null) : ep3.g0;
            }
            new m97(vp4Var.d(), my8Var2, jx5VarA, ix5Var2, ep3Var);
            ((vv) it0.g(an3Var.value(), vp4Var.f(xp4.q0))).getClass();
            bt.i("Should not be called on this type");
        }
    }

    @Override // defpackage.m85
    public final dh8 a0(vp4 vp4Var, vj8 vj8Var, dh8 dh8Var) throws pp3 {
        dh8 dh8VarR0;
        dh8 dh8VarR1;
        dh8 tp4Var = dh8Var;
        uh8 uh8Var = vp4Var.Y.X;
        xq3 xq3Var = (xq3) vj8Var.C(xq3.class);
        yq3 yq3Var = (yq3) vj8Var.C(yq3.class);
        Class clsD0 = xq3Var == null ? null : d0(xq3Var.as());
        if (clsD0 == null && yq3Var != null) {
            clsD0 = d0(yq3Var.value());
        }
        if (clsD0 != null) {
            if (tp4Var.H0(clsD0)) {
                tp4Var = tp4Var.R0();
            } else {
                Class<?> cls = tp4Var.j0;
                try {
                    if (clsD0.isAssignableFrom(cls)) {
                        uh8Var.getClass();
                        tp4Var = uh8.f(tp4Var, clsD0);
                    } else if (cls.isAssignableFrom(clsD0)) {
                        tp4Var = uh8Var.g(tp4Var, clsD0, false);
                    } else {
                        if (!f0(cls, clsD0)) {
                            throw new pp3(null, String.format("Cannot refine serialization type %s into %s; types not related", tp4Var, clsD0.getName()));
                        }
                        tp4Var = tp4Var.R0();
                    }
                } catch (IllegalArgumentException e) {
                    throw new pp3(null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", tp4Var, clsD0.getName(), vj8Var.L(), e.getMessage()), e);
                }
            }
        }
        tp4Var.getClass();
        if (tp4Var instanceof tp4) {
            tp4 tp4Var2 = (tp4) tp4Var;
            dh8 dh8Var2 = tp4Var2.s0;
            Class<?> clsD1 = xq3Var == null ? null : d0(xq3Var.keyAs());
            if (clsD1 == null && yq3Var != null) {
                clsD1 = d0(yq3Var.key());
            }
            if (clsD1 != null) {
                if (dh8Var2.H0(clsD1)) {
                    dh8VarR1 = dh8Var2.R0();
                } else {
                    Class<?> cls2 = dh8Var2.j0;
                    try {
                        if (clsD1.isAssignableFrom(cls2)) {
                            uh8Var.getClass();
                            dh8VarR1 = uh8.f(dh8Var2, clsD1);
                        } else if (cls2.isAssignableFrom(clsD1)) {
                            dh8VarR1 = uh8Var.g(dh8Var2, clsD1, false);
                        } else {
                            if (!f0(cls2, clsD1)) {
                                throw new pp3(null, String.format("Cannot refine serialization key type %s into %s; types not related", dh8Var2, clsD1.getName()));
                            }
                            dh8VarR1 = dh8Var2.R0();
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new pp3(null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", tp4Var, clsD1.getName(), vj8Var.L(), e2.getMessage()), e2);
                    }
                }
                dh8 dh8Var3 = dh8VarR1;
                tp4Var = dh8Var3 == dh8Var2 ? tp4Var2 : new tp4(tp4Var2.j0, tp4Var2.q0, tp4Var2.o0, tp4Var2.p0, dh8Var3, tp4Var2.t0, tp4Var2.l0, tp4Var2.m0, tp4Var2.n0);
            }
        }
        dh8 dh8VarZ0 = tp4Var.z0();
        if (dh8VarZ0 != null) {
            Class<?> clsD2 = xq3Var == null ? null : d0(xq3Var.contentAs());
            if (clsD2 == null && yq3Var != null) {
                clsD2 = d0(yq3Var.content());
            }
            if (clsD2 != null) {
                if (dh8VarZ0.H0(clsD2)) {
                    dh8VarR0 = dh8VarZ0.R0();
                } else {
                    Class<?> cls3 = dh8VarZ0.j0;
                    try {
                        if (clsD2.isAssignableFrom(cls3)) {
                            uh8Var.getClass();
                            dh8VarR0 = uh8.f(dh8VarZ0, clsD2);
                        } else if (cls3.isAssignableFrom(clsD2)) {
                            dh8VarR0 = uh8Var.g(dh8VarZ0, clsD2, false);
                        } else {
                            if (!f0(cls3, clsD2)) {
                                throw new pp3(null, String.format("Cannot refine serialization content type %s into %s; types not related", dh8VarZ0, clsD2.getName()));
                            }
                            dh8VarR0 = dh8VarZ0.R0();
                        }
                    } catch (IllegalArgumentException e3) {
                        throw new pp3(null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", tp4Var, clsD2.getName(), vj8Var.L(), e3.getMessage()), e3);
                    }
                }
                return tp4Var.O0(dh8VarR0);
            }
        }
        return tp4Var;
    }

    @Override // defpackage.m85
    public final hz8 b(al alVar, hz8 hz8Var) {
        in3 in3Var = (in3) alVar.K0.a(in3.class);
        if (in3Var == null) {
            return hz8Var;
        }
        hn3 hn3Var = hz8Var.X;
        hn3 hn3Var2 = hz8Var.g0;
        hn3 hn3Var3 = hz8Var.f0;
        hn3 hn3Var4 = hz8Var.Z;
        hn3 hn3Var5 = hz8Var.Y;
        hn3 hn3Var6 = in3Var.getterVisibility();
        hn3 hn3Var7 = hn3.f0;
        hn3 hn3Var8 = hn3Var6 == hn3Var7 ? hn3Var : hn3Var6;
        hn3 hn3VarIsGetterVisibility = in3Var.isGetterVisibility();
        hn3 hn3Var9 = hn3VarIsGetterVisibility == hn3Var7 ? hn3Var5 : hn3VarIsGetterVisibility;
        hn3 hn3Var10 = in3Var.setterVisibility();
        hn3 hn3Var11 = hn3Var10 == hn3Var7 ? hn3Var4 : hn3Var10;
        hn3 hn3VarCreatorVisibility = in3Var.creatorVisibility();
        hn3 hn3Var12 = hn3VarCreatorVisibility == hn3Var7 ? hn3Var3 : hn3VarCreatorVisibility;
        hn3 hn3VarFieldVisibility = in3Var.fieldVisibility();
        hn3 hn3Var13 = hn3VarFieldVisibility == hn3Var7 ? hn3Var2 : hn3VarFieldVisibility;
        return (hn3Var8 == hz8Var.X && hn3Var9 == hn3Var5 && hn3Var11 == hn3Var4 && hn3Var12 == hn3Var3 && hn3Var13 == hn3Var2) ? hz8Var : new hz8(hn3Var8, hn3Var9, hn3Var11, hn3Var12, hn3Var13);
    }

    @Override // defpackage.m85
    public final hl b0(hl hlVar, hl hlVar2) {
        Class clsI0 = hlVar.I0(0);
        Class clsI1 = hlVar2.I0(0);
        if (!clsI0.isPrimitive()) {
            if (!clsI1.isPrimitive()) {
                if (clsI0 == String.class) {
                    if (clsI1 == String.class) {
                        return null;
                    }
                } else if (clsI1 != String.class) {
                    return null;
                }
            }
            return hlVar2;
        }
        if (clsI1.isPrimitive()) {
            return null;
        }
        return hlVar;
    }

    @Override // defpackage.m85
    public final Object c(vj8 vj8Var) {
        Class clsContentUsing;
        xq3 xq3Var = (xq3) vj8Var.C(xq3.class);
        if (xq3Var == null || (clsContentUsing = xq3Var.contentUsing()) == zq3.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // defpackage.m85
    public final nn3 d(l37 l37Var, ul ulVar) {
        nn3 nn3VarMode;
        on3 on3Var = (on3) ulVar.C(on3.class);
        if (on3Var == null) {
            nn3VarMode = null;
        } else {
            nn3VarMode = on3Var.mode();
            if (nn3VarMode != nn3.X) {
                return nn3VarMode;
            }
        }
        if (this.Y) {
            l37Var.f(xp4.n0);
        }
        return nn3VarMode;
    }

    @Override // defpackage.m85
    public final Object e(al alVar) {
        s22 s22Var = (s22) alVar.K0.a(s22.class);
        if (s22Var == null) {
            return null;
        }
        return s22Var.value();
    }

    @Override // defpackage.m85
    public final String[] f(al alVar, Enum[] enumArr, String[] strArr) {
        String strValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (el elVar : alVar.A0()) {
            nq3 nq3Var = (nq3) elVar.C(nq3.class);
            if (nq3Var != null && (strValue = nq3Var.value()) != null) {
                linkedHashMap.put(elVar.D0.getName(), strValue);
            }
        }
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            String str = (String) linkedHashMap.get(enumArr[i].name());
            if (str != null) {
                strArr[i] = str;
            }
        }
        return strArr;
    }

    @Override // defpackage.m85
    public final Object g(vj8 vj8Var) {
        jo3 jo3Var = (jo3) vj8Var.C(jo3.class);
        if (jo3Var == null) {
            return null;
        }
        String strValue = jo3Var.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // defpackage.m85
    public final no3 h(vj8 vj8Var) {
        oo3 oo3Var = (oo3) vj8Var.C(oo3.class);
        if (oo3Var == null) {
            return null;
        }
        String strPattern = oo3Var.pattern();
        mo3 mo3VarShape = oo3Var.shape();
        String strLocale = oo3Var.locale();
        String strTimezone = oo3Var.timezone();
        ko3[] ko3VarArrWith = oo3Var.with();
        ko3[] ko3VarArrWithout = oo3Var.without();
        int iOrdinal = 0;
        for (ko3 ko3Var : ko3VarArrWith) {
            iOrdinal |= 1 << ko3Var.ordinal();
        }
        int iOrdinal2 = 0;
        for (ko3 ko3Var2 : ko3VarArrWithout) {
            iOrdinal2 |= 1 << ko3Var2.ordinal();
        }
        return new no3(strPattern, mo3VarShape, strLocale, strTimezone, new lo3(iOrdinal, iOrdinal2), oo3Var.lenient().a(), oo3Var.radix());
    }

    @Override // defpackage.m85
    public final jj3 i(gl glVar) {
        String name;
        kj3 kj3Var = (kj3) glVar.C(kj3.class);
        if (kj3Var == null) {
            return null;
        }
        String strValue = kj3Var.value();
        Boolean boolA = kj3Var.useInput().a();
        Boolean boolA2 = kj3Var.optional().a();
        String str = _UrlKt.FRAGMENT_ENCODE_SET.equals(strValue) ? null : strValue;
        jj3 jj3Var = (str == null && boolA == null && boolA2 == null) ? jj3.f0 : new jj3(str, boolA, boolA2);
        Object obj = jj3Var.X;
        if (obj == null) {
            if (glVar instanceof hl) {
                hl hlVar = (hl) glVar;
                name = hlVar.G0() == 0 ? hlVar.E0.getReturnType().getName() : hlVar.I0(0).getName();
            } else {
                name = glVar.N().getName();
            }
            if (!name.equals(obj)) {
                return new jj3(name, jj3Var.Y, jj3Var.Z);
            }
        }
        return jj3Var;
    }

    @Override // defpackage.m85
    public final Object j(gl glVar) {
        jj3 jj3VarI = i(glVar);
        if (jj3VarI == null) {
            return null;
        }
        return jj3VarI.X;
    }

    @Override // defpackage.m85
    public final Object k(vj8 vj8Var) {
        Class clsKeyUsing;
        xq3 xq3Var = (xq3) vj8Var.C(xq3.class);
        if (xq3Var == null || (clsKeyUsing = xq3Var.keyUsing()) == zq3.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // defpackage.m85
    public final jx5 l(gl glVar) {
        boolean z;
        br3 br3Var = (br3) glVar.C(br3.class);
        if (br3Var != null) {
            String strValue = br3Var.value();
            if (!strValue.isEmpty()) {
                return jx5.a(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        nq3 nq3Var = (nq3) glVar.C(nq3.class);
        if (nq3Var != null) {
            String strNamespace = nq3Var.namespace();
            return jx5.b(nq3Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || glVar.D0(f0)) {
            return jx5.f0;
        }
        return null;
    }

    @Override // defpackage.m85
    public final jx5 m(gl glVar) {
        boolean z;
        to3 to3Var = (to3) glVar.C(to3.class);
        if (to3Var != null) {
            String strValue = to3Var.value();
            if (!strValue.isEmpty()) {
                return jx5.a(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        nq3 nq3Var = (nq3) glVar.C(nq3.class);
        if (nq3Var != null) {
            String strNamespace = nq3Var.namespace();
            return jx5.b(nq3Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || glVar.D0(Z)) {
            return jx5.f0;
        }
        return null;
    }

    @Override // defpackage.m85
    public final Object n(al alVar) {
        tp3 tp3Var = (tp3) alVar.K0.a(tp3.class);
        if (tp3Var == null) {
            return null;
        }
        return tp3Var.value();
    }

    @Override // defpackage.m85
    public final Object o(gl glVar) {
        Class clsNullsUsing;
        xq3 xq3Var = (xq3) glVar.C(xq3.class);
        if (xq3Var == null || (clsNullsUsing = xq3Var.nullsUsing()) == zq3.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // defpackage.m85
    public final f85 p(vj8 vj8Var) {
        vo3 vo3Var = (vo3) vj8Var.C(vo3.class);
        if (vo3Var == null || vo3Var.generator() == e85.class) {
            return null;
        }
        return new f85(jx5.a(vo3Var.property()), vo3Var.scope(), vo3Var.generator(), false, vo3Var.resolver());
    }

    @Override // defpackage.m85
    public final f85 q(vj8 vj8Var, f85 f85Var) {
        wo3 wo3Var = (wo3) vj8Var.C(wo3.class);
        if (wo3Var == null) {
            return f85Var;
        }
        if (f85Var == null) {
            f85Var = f85.f;
        }
        boolean zAlwaysAsId = wo3Var.alwaysAsId();
        return f85Var.e == zAlwaysAsId ? f85Var : new f85(f85Var.a, f85Var.d, f85Var.b, zAlwaysAsId, f85Var.c);
    }

    @Override // defpackage.m85
    public final mq3 r(vj8 vj8Var) {
        nq3 nq3Var = (nq3) vj8Var.C(nq3.class);
        if (nq3Var != null) {
            return nq3Var.access();
        }
        return null;
    }

    @Override // defpackage.m85
    public final nj7 s(vp4 vp4Var, gl glVar, dh8 dh8Var) {
        if (dh8Var.z0() != null) {
            return e0(vp4Var, glVar);
        }
        c2.j("Must call method with a container or reference type (got ", dh8Var, ")");
        return null;
    }

    @Override // defpackage.m85
    public final String t(gl glVar) {
        nq3 nq3Var = (nq3) glVar.C(nq3.class);
        if (nq3Var != null) {
            String strDefaultValue = nq3Var.defaultValue();
            if (!strDefaultValue.isEmpty()) {
                return strDefaultValue;
            }
        }
        return null;
    }

    @Override // defpackage.m85
    public final String u(gl glVar) {
        oq3 oq3Var = (oq3) glVar.C(oq3.class);
        if (oq3Var == null) {
            return null;
        }
        return oq3Var.value();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    @Override // defpackage.m85
    public final yo3 v(vj8 vj8Var) {
        ?? hashSet;
        zo3 zo3Var = (zo3) vj8Var.C(zo3.class);
        if (zo3Var == null) {
            return yo3.h0;
        }
        yo3 yo3Var = yo3.h0;
        String[] strArrValue = zo3Var.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        ?? r1 = hashSet;
        boolean zIgnoreUnknown = zo3Var.ignoreUnknown();
        boolean zAllowGetters = zo3Var.allowGetters();
        boolean zAllowSetters = zo3Var.allowSetters();
        yo3 yo3Var2 = yo3.h0;
        return (zIgnoreUnknown == yo3Var2.Y && zAllowGetters == yo3Var2.Z && zAllowSetters == yo3Var2.f0 && !yo3Var2.g0 && (r1 == 0 || r1.size() == 0)) ? yo3Var2 : new yo3(r1, zIgnoreUnknown, zAllowGetters, zAllowSetters, false);
    }

    @Override // defpackage.m85
    public final yo3 w(vj8 vj8Var) {
        return v(vj8Var);
    }

    @Override // defpackage.m85
    public final ep3 x(vj8 vj8Var) {
        ep3 ep3Var;
        xq3 xq3Var;
        fp3 fp3Var = (fp3) vj8Var.C(fp3.class);
        dp3 dp3Var = dp3.g0;
        if (fp3Var == null) {
            ep3Var = ep3.g0;
        } else {
            ep3 ep3Var2 = ep3.g0;
            dp3 dp3VarValue = fp3Var.value();
            dp3 dp3VarContent = fp3Var.content();
            if (dp3VarValue == dp3Var && dp3VarContent == dp3Var) {
                ep3Var = ep3Var2;
            } else {
                Class clsValueFilter = fp3Var.valueFilter();
                if (clsValueFilter == Void.class) {
                    clsValueFilter = null;
                }
                Class clsContentFilter = fp3Var.contentFilter();
                ep3Var = new ep3(dp3VarValue, dp3VarContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
            }
        }
        if (ep3Var.X != dp3Var || (xq3Var = (xq3) vj8Var.C(xq3.class)) == null) {
            return ep3Var;
        }
        int iOrdinal = xq3Var.include().ordinal();
        if (iOrdinal == 0) {
            return ep3Var.b(dp3.X);
        }
        if (iOrdinal == 1) {
            return ep3Var.b(dp3.Y);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? ep3Var : ep3Var.b(dp3.Z);
        }
        return ep3Var.b(dp3.f0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashSet] */
    @Override // defpackage.m85
    public final gp3 y(vj8 vj8Var) {
        ?? hashSet;
        hp3 hp3Var = (hp3) vj8Var.C(hp3.class);
        if (hp3Var == null) {
            return gp3.Z;
        }
        String[] strArrValue = hp3Var.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        return new gp3(hashSet, hp3Var.order().a());
    }

    @Override // defpackage.m85
    public final Integer z(gl glVar) {
        int iIndex;
        nq3 nq3Var = (nq3) glVar.C(nq3.class);
        if (nq3Var == null || (iIndex = nq3Var.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }
}
