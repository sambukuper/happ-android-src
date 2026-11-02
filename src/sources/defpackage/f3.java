package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements dn2 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ f3(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x091e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [j05] */
    /* JADX WARN: Type inference failed for: r13v6, types: [j05] */
    /* JADX WARN: Type inference failed for: r14v2, types: [i44] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [ex3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ho2, jd0, jo2, yg8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    @Override // defpackage.dn2
    public final Object invoke() {
        wi8 wi8VarD;
        wi8 wi8Var;
        List list;
        wi8 wi8Var2;
        Iterator it;
        wi8 wi8Var3;
        ?? r9;
        int iHashCode;
        Collection collection;
        byte b = this.X;
        d02 d02Var = d02.X;
        int i = 10;
        wi8 wi8Var4 = null;
        Object obj = this.Y;
        switch (b) {
            case 0:
                km1 km1Var = (km1) obj;
                sx4 sx4VarH0 = km1Var.H0();
                if (sx4VarH0 == null) {
                    return d02Var;
                }
                Collection collectionB = sx4VarH0.B();
                collectionB.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = collectionB.iterator();
                while (it2.hasNext()) {
                    gs0 gs0Var = (gs0) it2.next();
                    s18 s18Var = yg8.K0;
                    ve4 ve4Var = km1Var.i0;
                    gs0Var.getClass();
                    s18Var.getClass();
                    rm rmVar = oy1.f0;
                    ve4Var.getClass();
                    if (km1Var.H0() == null) {
                        wi8Var = wi8Var4;
                    } else {
                        wi8VarD = wi8.d(km1Var.I0());
                    }
                    if (wi8Var == null) {
                        wi8Var = wi8VarD;
                        it = it2;
                        wi8 wi8Var5 = wi8Var4;
                        wi8Var3 = wi8Var5;
                        r9 = wi8Var5;
                    } else {
                        wi8Var = wi8VarD;
                        gs0 gs0VarG = gs0Var.g(wi8Var);
                        if (gs0VarG == null) {
                            wi8Var = wi8VarD;
                            it = it2;
                            wi8 wi8Var6 = wi8Var4;
                            wi8Var3 = wi8Var6;
                            r9 = wi8Var6;
                        } else {
                            sm annotations = gs0Var.getAnnotations();
                            int iR = gs0Var.r();
                            if (iR == 0) {
                                throw wi8Var4;
                            }
                            ke7 source = km1Var.getSource();
                            source.getClass();
                            ?? yg8Var = new yg8(ve4Var, km1Var, gs0VarG, null, annotations, iR, source);
                            List listL = gs0Var.L();
                            if (listL == null) {
                                ?? r22 = wi8Var4;
                                jo2.B(28);
                                throw r22;
                            }
                            wi8 wi8Var7 = wi8Var;
                            ArrayList arrayListK0 = jo2.K0(yg8Var, listL, wi8Var7, false, false, null);
                            if (arrayListK0 == null) {
                                wi8Var = wi8VarD;
                                it = it2;
                                wi8 wi8Var8 = wi8Var4;
                                wi8Var3 = wi8Var8;
                                r9 = wi8Var8;
                            } else {
                                aa7 aa7VarD0 = jm4.d0(yn0.O(gs0VarG.k0.q0()), km1Var.X());
                                i44 i44Var = gs0Var.n0;
                                rt8 rt8Var = rt8.INVARIANT;
                                Object objX = i44Var != null ? z91.x(yg8Var, wi8Var7.f(i44Var.c(), rt8Var), rmVar) : wi8Var4;
                                sx4 sx4VarH1 = km1Var.H0();
                                if (sx4VarH1 != null) {
                                    List listY = gs0Var.Y();
                                    listY.getClass();
                                    ArrayList arrayList2 = new ArrayList(xv0.Z(listY, i));
                                    int i2 = 0;
                                    wi8 wi8Var9 = wi8Var4;
                                    for (Object obj2 : listY) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            ?? r23 = wi8Var9;
                                            i21.X();
                                            throw r23;
                                        }
                                        i44 i44Var2 = (i44) obj2;
                                        t14 t14VarF = wi8Var7.f(i44Var2.c(), rt8Var);
                                        i86 i86VarH0 = i44Var2.H0();
                                        i86VarH0.getClass();
                                        Iterator it3 = it2;
                                        g51 g51Var = new g51(sx4VarH1, t14VarF, ((g51) i86VarH0).F0());
                                        kc6 kc6Var = d25.a;
                                        arrayList2.add(new i44(sx4VarH1, g51Var, rmVar, v15.e(d25.b + '_' + i2)));
                                        it2 = it3;
                                        i2 = i3;
                                        wi8Var9 = wi8Var9;
                                    }
                                    list = arrayList2;
                                    wi8Var2 = wi8Var9;
                                } else {
                                    list = d02Var;
                                    wi8Var2 = wi8Var4;
                                }
                                it = it2;
                                wi8Var3 = wi8Var2;
                                yg8Var.L0(objX, null, list, km1Var.k0(), arrayListK0, aa7VarD0, fx4.Y, km1Var.j0);
                                r9 = yg8Var;
                            }
                        }
                    }
                    if (r9 != 0) {
                        arrayList.add(r9);
                    }
                    it2 = it;
                    wi8Var4 = wi8Var3;
                    i = 10;
                }
                return arrayList;
            case 1:
                return new h3(((i3) obj).a());
            case 2:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                c3 c3Var = (c3) obj;
                sb.append(((v15) c3Var.Y).b());
                return du7.b(sb.toString(), ((k3) c3Var.Z).getUpperBounds());
            case 3:
                int iHashCode2 = 0;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 4:
                ga0 ga0Var = (ga0) obj;
                return ga0Var.a.j(ga0Var.b).X();
            case 5:
                t14 t14VarB = ((ni8) obj).b();
                t14VarB.getClass();
                return t14VarB;
            case 6:
                return (Class) obj;
            case 7:
                Object obj3 = ((ea6) obj).X;
                if (obj3 != null) {
                    return (s97) obj3;
                }
                dh3.T("result");
                throw null;
            case 8:
                tb6 tb6Var = ((u1) obj).X;
                Type type = tb6Var != null ? (Type) tb6Var.invoke() : null;
                type.getClass();
                return ia6.c(type);
            case 9:
                kc8 kc8Var = ((ma7) obj).i;
                return new dw0(z51.E(kc8Var.a, kc8Var.b, yx1.c.a(0.0f)));
            case 10:
                return new hj1((ij1) obj);
            case 11:
                return new jj1((kj1) obj);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new lj1((mj1) obj);
            case 13:
                return new nj1((oj1) obj);
            case 14:
                return new hk1((ik1) obj);
            case 15:
                zk1 zk1Var = ((wk1) obj).a;
                zk1 zk1Var2 = new zk1();
                mj0 mj0Var = zk1Var.s;
                nw3[] nw3VarArr = zk1.Z;
                nw3 nw3Var = nw3VarArr[17];
                mj0Var.getClass();
                nw3Var.getClass();
                Boolean bool = (Boolean) mj0Var.Y;
                bool.booleanValue();
                zk1Var2.s.Y(nw3VarArr[17], bool);
                zk1Var2.O.Y(nw3VarArr[39], Boolean.valueOf(zk1Var.l()));
                wl wlVarM = zk1Var.m();
                wlVarM.getClass();
                zk1Var2.N.Y(nw3VarArr[38], wlVarM);
                mj0 mj0Var2 = zk1Var.M;
                nw3 nw3Var2 = nw3VarArr[37];
                mj0Var2.getClass();
                nw3Var2.getClass();
                zk1Var2.M.Y(nw3VarArr[37], (gn2) mj0Var2.Y);
                zk1Var2.X.Y(nw3VarArr[48], Boolean.valueOf(zk1Var.n()));
                mj0 mj0Var3 = zk1Var.i;
                nw3 nw3Var3 = nw3VarArr[7];
                mj0Var3.getClass();
                nw3Var3.getClass();
                Boolean bool2 = (Boolean) mj0Var3.Y;
                bool2.booleanValue();
                zk1Var2.i.Y(nw3VarArr[7], bool2);
                zk1Var2.j(zk1Var.o());
                zk1Var2.f(zk1Var.p());
                zk1Var2.z.Y(nw3VarArr[24], zk1Var.q());
                mj0 mj0Var4 = zk1Var.J;
                nw3 nw3Var4 = nw3VarArr[34];
                mj0Var4.getClass();
                nw3Var4.getClass();
                Boolean bool3 = (Boolean) mj0Var4.Y;
                bool3.booleanValue();
                zk1Var2.J.Y(nw3VarArr[34], bool3);
                zk1Var2.m.Y(nw3VarArr[11], Boolean.valueOf(zk1Var.r()));
                mj0 mj0Var5 = zk1Var.K;
                nw3 nw3Var5 = nw3VarArr[35];
                mj0Var5.getClass();
                nw3Var5.getClass();
                Set set = (Set) mj0Var5.Y;
                set.getClass();
                zk1Var2.K.Y(nw3VarArr[35], set);
                zk1Var2.F(zk1Var.s());
                zk1Var2.T.Y(nw3VarArr[44], Boolean.valueOf(zk1Var.t()));
                mj0 mj0Var6 = zk1Var.u;
                nw3 nw3Var6 = nw3VarArr[19];
                mj0Var6.getClass();
                nw3Var6.getClass();
                Boolean bool4 = (Boolean) mj0Var6.Y;
                bool4.booleanValue();
                zk1Var2.u.Y(nw3VarArr[19], bool4);
                mj0 mj0Var7 = zk1Var.Y;
                nw3 nw3Var7 = nw3VarArr[49];
                mj0Var7.getClass();
                nw3Var7.getClass();
                Boolean bool5 = (Boolean) mj0Var7.Y;
                bool5.booleanValue();
                zk1Var2.Y.Y(nw3VarArr[49], bool5);
                zk1Var2.b(zk1Var.u());
                mj0 mj0Var8 = zk1Var.n;
                nw3 nw3Var8 = nw3VarArr[12];
                mj0Var8.getClass();
                nw3Var8.getClass();
                Boolean bool6 = (Boolean) mj0Var8.Y;
                bool6.booleanValue();
                zk1Var2.n.Y(nw3VarArr[12], bool6);
                ff5 ff5VarV = zk1Var.v();
                ff5VarV.getClass();
                zk1Var2.B.Y(nw3VarArr[26], ff5VarV);
                mj0 mj0Var9 = zk1Var.E;
                nw3 nw3Var9 = nw3VarArr[29];
                mj0Var9.getClass();
                nw3Var9.getClass();
                zk1Var2.i((ah5) mj0Var9.Y);
                mj0 mj0Var10 = zk1Var.U;
                nw3 nw3Var10 = nw3VarArr[45];
                mj0Var10.getClass();
                nw3Var10.getClass();
                Boolean bool7 = (Boolean) mj0Var10.Y;
                bool7.booleanValue();
                zk1Var2.U.Y(nw3VarArr[45], bool7);
                mj0 mj0Var11 = zk1Var.W;
                nw3 nw3Var11 = nw3VarArr[47];
                mj0Var11.getClass();
                nw3Var11.getClass();
                Boolean bool8 = (Boolean) mj0Var11.Y;
                bool8.booleanValue();
                zk1Var2.W.Y(nw3VarArr[47], bool8);
                dx5 dx5VarW = zk1Var.w();
                dx5VarW.getClass();
                zk1Var2.H.Y(nw3VarArr[32], dx5VarW);
                mj0 mj0Var12 = zk1Var.v;
                nw3 nw3Var12 = nw3VarArr[20];
                mj0Var12.getClass();
                nw3Var12.getClass();
                zk1Var2.v.Y(nw3VarArr[20], (gn2) mj0Var12.Y);
                mj0 mj0Var13 = zk1Var.F;
                nw3 nw3Var13 = nw3VarArr[30];
                mj0Var13.getClass();
                nw3Var13.getClass();
                zk1Var2.h(((Boolean) mj0Var13.Y).booleanValue());
                mj0 mj0Var14 = zk1Var.S;
                nw3 nw3Var14 = nw3VarArr[43];
                mj0Var14.getClass();
                nw3Var14.getClass();
                Boolean bool9 = (Boolean) mj0Var14.Y;
                bool9.booleanValue();
                zk1Var2.S.Y(nw3VarArr[43], bool9);
                mj0 mj0Var15 = zk1Var.G;
                nw3 nw3Var15 = nw3VarArr[31];
                mj0Var15.getClass();
                nw3Var15.getClass();
                zk1Var2.g(((Boolean) mj0Var15.Y).booleanValue());
                mj0 mj0Var16 = zk1Var.q;
                nw3 nw3Var16 = nw3VarArr[15];
                mj0Var16.getClass();
                nw3Var16.getClass();
                Boolean bool10 = (Boolean) mj0Var16.Y;
                bool10.booleanValue();
                zk1Var2.q.Y(nw3VarArr[15], bool10);
                mj0 mj0Var17 = zk1Var.P;
                nw3 nw3Var17 = nw3VarArr[40];
                mj0Var17.getClass();
                nw3Var17.getClass();
                Boolean bool11 = (Boolean) mj0Var17.Y;
                bool11.booleanValue();
                zk1Var2.P.Y(nw3VarArr[40], bool11);
                mj0 mj0Var18 = zk1Var.I;
                nw3 nw3Var18 = nw3VarArr[33];
                mj0Var18.getClass();
                nw3Var18.getClass();
                Boolean bool12 = (Boolean) mj0Var18.Y;
                bool12.booleanValue();
                zk1Var2.I.Y(nw3VarArr[33], bool12);
                mj0 mj0Var19 = zk1Var.p;
                nw3 nw3Var19 = nw3VarArr[14];
                mj0Var19.getClass();
                nw3Var19.getClass();
                Boolean bool13 = (Boolean) mj0Var19.Y;
                bool13.booleanValue();
                zk1Var2.p.Y(nw3VarArr[14], bool13);
                zk1Var2.o.Y(nw3VarArr[13], Boolean.valueOf(zk1Var.x()));
                mj0 mj0Var20 = zk1Var.V;
                nw3 nw3Var20 = nw3VarArr[46];
                mj0Var20.getClass();
                nw3Var20.getClass();
                Boolean bool14 = (Boolean) mj0Var20.Y;
                bool14.getClass();
                zk1Var2.V.Y(nw3VarArr[46], bool14);
                mj0 mj0Var21 = zk1Var.r;
                nw3 nw3Var21 = nw3VarArr[16];
                mj0Var21.getClass();
                nw3Var21.getClass();
                Boolean bool15 = (Boolean) mj0Var21.Y;
                bool15.booleanValue();
                zk1Var2.r.Y(nw3VarArr[16], bool15);
                mj0 mj0Var22 = zk1Var.R;
                nw3 nw3Var22 = nw3VarArr[42];
                mj0Var22.getClass();
                nw3Var22.getClass();
                Boolean bool16 = (Boolean) mj0Var22.Y;
                bool16.booleanValue();
                zk1Var2.R.Y(nw3VarArr[42], bool16);
                mj0 mj0Var23 = zk1Var.Q;
                nw3 nw3Var23 = nw3VarArr[41];
                mj0Var23.getClass();
                nw3Var23.getClass();
                Boolean bool17 = (Boolean) mj0Var23.Y;
                bool17.booleanValue();
                zk1Var2.Q.Y(nw3VarArr[41], bool17);
                zk1Var2.A.Y(nw3VarArr[25], Boolean.valueOf(zk1Var.y()));
                zk1Var2.g.Y(nw3VarArr[5], Boolean.valueOf(zk1Var.z()));
                zk1Var2.a(zk1Var.A());
                zk1Var2.d(zk1Var.B());
                mj0 mj0Var24 = zk1Var.y;
                nw3 nw3Var24 = nw3VarArr[23];
                mj0Var24.getClass();
                nw3Var24.getClass();
                gn2 gn2Var = (gn2) mj0Var24.Y;
                gn2Var.getClass();
                zk1Var2.y.Y(nw3VarArr[23], gn2Var);
                mj0 mj0Var25 = zk1Var.t;
                nw3 nw3Var25 = nw3VarArr[18];
                mj0Var25.getClass();
                nw3Var25.getClass();
                Boolean bool18 = (Boolean) mj0Var25.Y;
                bool18.booleanValue();
                zk1Var2.t.Y(nw3VarArr[18], bool18);
                mj0 mj0Var26 = zk1Var.k;
                nw3 nw3Var26 = nw3VarArr[9];
                mj0Var26.getClass();
                nw3Var26.getClass();
                Boolean bool19 = (Boolean) mj0Var26.Y;
                bool19.booleanValue();
                zk1Var2.k.Y(nw3VarArr[9], bool19);
                sk1 sk1VarC = zk1Var.C();
                sk1VarC.getClass();
                zk1Var2.C.Y(nw3VarArr[27], sk1VarC);
                zk1Var2.j.Y(nw3VarArr[8], Boolean.valueOf(zk1Var.D()));
                mj0 mj0Var27 = zk1Var.c;
                nw3VarArr[1].getClass();
                zk1Var2.c(((Boolean) mj0Var27.Y).booleanValue());
                mj0 mj0Var28 = zk1Var.d;
                nw3VarArr[2].getClass();
                Boolean bool20 = (Boolean) mj0Var28.Y;
                bool20.booleanValue();
                zk1Var2.d.Y(nw3VarArr[2], bool20);
                mj0 mj0Var29 = zk1Var.l;
                nw3 nw3Var27 = nw3VarArr[10];
                mj0Var29.getClass();
                nw3Var27.getClass();
                Boolean bool21 = (Boolean) mj0Var29.Y;
                bool21.booleanValue();
                zk1Var2.l.Y(nw3VarArr[10], bool21);
                mj0 mj0Var30 = zk1Var.x;
                nw3 nw3Var28 = nw3VarArr[22];
                mj0Var30.getClass();
                nw3Var28.getClass();
                zk1Var2.e(((Boolean) mj0Var30.Y).booleanValue());
                zk1Var2.k(zk1Var.E());
                wk1 wk1Var = wk1.c;
                zk1Var2.F(q57.Z(zk1Var2.s(), i21.L(tg7.p, tg7.q)));
                zk1Var2.a = true;
                return new wk1(zk1Var2);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                pk1 pk1Var = pk1.m;
                et4.a.getClass();
                return ((tl1) obj).i(pk1Var, cl1.F0);
            case 17:
                HashSet hashSet = new HashSet();
                vl1 vl1Var = (vl1) ((z47) obj).g0;
                ul1 ul1Var = vl1Var.p0;
                jl1 jl1Var = vl1Var.n0;
                fy5 fy5Var = vl1Var.g0;
                Iterator it4 = ul1Var.c().iterator();
                while (it4.hasNext()) {
                    for (ed1 ed1Var : hi5.b0(((t14) it4.next()).K(), null, 3)) {
                        if ((ed1Var instanceof q97) || (ed1Var instanceof fx5)) {
                            hashSet.add(((ld0) ed1Var).getName());
                        }
                    }
                }
                List list2 = fy5Var.s0;
                list2.getClass();
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    hashSet.add(u70.S((w15) jl1Var.Y, ((vy5) it5.next()).h0));
                }
                List list3 = fy5Var.t0;
                list3.getClass();
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    hashSet.add(u70.S((w15) jl1Var.Y, ((cz5) it6.next()).h0));
                }
                return q57.Z(hashSet, hashSet);
            case 18:
                gm1 gm1Var = (gm1) obj;
                Set setN = gm1Var.n();
                if (setN == null) {
                    return null;
                }
                return q57.Z(q57.Z(gm1Var.m(), gm1Var.c.c.keySet()), setN);
            case 19:
                Set setKeySet = ((LinkedHashMap) ((oa0) obj).m0.g0).keySet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setKeySet) {
                    qs0 qs0Var = (qs0) obj4;
                    if (!qs0Var.g() && !os0.c.contains(qs0Var)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(((qs0) it7.next()).f());
                }
                return arrayList4;
            case 20:
                lm1 lm1Var = (lm1) obj;
                jl1 jl1Var2 = lm1Var.o0;
                return wv0.Y0(((hl1) jl1Var2.X).e.h(lm1Var.p0, (w15) jl1Var2.Y));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return (eo1) obj;
            case 22:
                return (fx8) ((f3) obj).invoke();
            case 23:
                p22 p22Var = (p22) obj;
                HashSet hashSet2 = new HashSet();
                for (v15 v15Var : (Set) p22Var.e.k0.invoke()) {
                    x45 x45Var = x45.h0;
                    hashSet2.addAll(p22Var.b(v15Var, x45Var));
                    hashSet2.addAll(p22Var.f(v15Var, x45Var));
                }
                return hashSet2;
            case 24:
                return (List) obj;
            case 25:
                ArrayList arrayList5 = ((op2) obj).a;
                s05 s05Var = new s05(arrayList5.size());
                int size = arrayList5.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ?? r6 = (ex3) arrayList5.get(i4);
                    Object obj5 = r6.b;
                    int i5 = r6.a;
                    Object tm3Var = obj5 != null ? new tm3(Integer.valueOf(i5), r6.b) : Integer.valueOf(i5);
                    int iF = s05Var.f(tm3Var);
                    boolean z = iF < 0;
                    Object obj6 = z ? null : s05Var.c[iF];
                    if (obj6 != null) {
                        if (obj6 instanceof j05) {
                            ?? r12 = (j05) obj6;
                            r12.a(r6);
                            r6 = r12;
                        } else {
                            Object[] objArr = h85.a;
                            ?? j05Var = new j05(2);
                            j05Var.a(obj6);
                            j05Var.a(r6);
                            r6 = j05Var;
                        }
                    }
                    if (z) {
                        int i6 = ~iF;
                        s05Var.b[i6] = tm3Var;
                        s05Var.c[i6] = r6;
                    } else {
                        s05Var.c[iF] = r6;
                    }
                }
                return new kz4(s05Var);
            case 26:
                xr2 xr2Var = (xr2) obj;
                List listH = xr2Var.h();
                ArrayList arrayList6 = new ArrayList(3);
                m0 m0Var = xr2Var.b;
                Collection collectionC = m0Var.l().c();
                collectionC.getClass();
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = collectionC.iterator();
                while (it8.hasNext()) {
                    bw0.d0(arrayList7, hi5.b0(((t14) it8.next()).K(), null, 3));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj7 : arrayList7) {
                    if (obj7 instanceof ld0) {
                        arrayList8.add(obj7);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj8 : arrayList8) {
                    v15 name = ((ld0) obj8).getName();
                    Object arrayList9 = linkedHashMap.get(name);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap.put(name, arrayList9);
                    }
                    ((List) arrayList9).add(obj8);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    key.getClass();
                    v15 v15Var2 = (v15) key;
                    List list4 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj9 : list4) {
                        Boolean boolValueOf = Boolean.valueOf(((ld0) obj9) instanceof ho2);
                        Object arrayList10 = linkedHashMap2.get(boolValueOf);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList10);
                        }
                        ((List) arrayList10).add(obj9);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list5 = (List) entry3.getValue();
                        hf5 hf5Var = hf5.c;
                        if (zBooleanValue) {
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj10 : listH) {
                                if (dh3.f(((fd1) ((ho2) obj10)).getName(), v15Var2)) {
                                    arrayList11.add(obj10);
                                }
                            }
                            collection = arrayList11;
                        } else {
                            collection = d02Var;
                        }
                        hf5Var.h(v15Var2, list5, collection, m0Var, new wr2(arrayList6, xr2Var));
                    }
                }
                return wv0.H0(listH, ys0.m(arrayList6));
            case 27:
                Type genericReturnType = ((sj3) obj).Y.getGenericReturnType();
                genericReturnType.getClass();
                return w51.Q(genericReturnType, e02.X, gi8.X, true, false, null, 24);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                qk3 qk3Var = (qk3) obj;
                return w51.R(qk3Var.U(), qk3Var);
            default:
                return new rk3((sk3) obj);
        }
    }
}
