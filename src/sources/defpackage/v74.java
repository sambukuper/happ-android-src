package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v74 extends sx4 {
    public final sx4 X;
    public final wi8 Y;
    public wi8 Z;
    public ArrayList f0;
    public ArrayList g0;
    public ft0 h0;

    public v74(sx4 sx4Var, wi8 wi8Var) {
        this.X = sx4Var;
        this.Y = wi8Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void z0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public final wi8 A0() {
        if (this.Z == null) {
            wi8 wi8Var = this.Y;
            if (wi8Var.a.e()) {
                this.Z = wi8Var;
            } else {
                List listG = this.X.l().g();
                ArrayList arrayList = new ArrayList(listG.size());
                this.f0 = arrayList;
                this.Z = dh3.R(listG, wi8Var.a, this, arrayList);
                ArrayList arrayList2 = this.f0;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((hi8) obj).U()) {
                        arrayList3.add(obj);
                    }
                }
                this.g0 = arrayList3;
            }
        }
        return this.Z;
    }

    @Override // defpackage.sx4
    public final Collection B() {
        Collection<gs0> collectionB = this.X.B();
        ArrayList arrayList = new ArrayList(collectionB.size());
        for (gs0 gs0Var : collectionB) {
            gs0Var.getClass();
            io2 io2VarM0 = gs0Var.M0(wi8.b);
            io2VarM0.g0 = gs0Var.a();
            io2VarM0.m(gs0Var.m());
            io2VarM0.k(gs0Var.e());
            io2VarM0.c(gs0Var.r());
            io2VarM0.o0 = false;
            arrayList.add(((gs0) io2VarM0.z0.J0(io2VarM0)).g(A0()));
        }
        return arrayList;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return this.X.C();
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.q(this, obj);
    }

    @Override // defpackage.sx4, defpackage.ot0
    public final aa7 X() {
        ch8 ch8VarK;
        List listD = cj8.d(l().g());
        sm annotations = getAnnotations();
        if (annotations.isEmpty()) {
            ch8.Y.getClass();
            ch8VarK = ch8.Z;
        } else {
            xd6 xd6Var = ch8.Y;
            List listK = i21.K(new wm(annotations));
            xd6Var.getClass();
            ch8VarK = xd6.k(listK);
        }
        return dh3.O(r0(), ch8VarK, l(), listD, false);
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        fl1 fl1VarE = this.X.e();
        if (fl1VarE != null) {
            return fl1VarE;
        }
        z0(27);
        throw null;
    }

    @Override // defpackage.sx4
    public final List f0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z0(17);
        throw null;
    }

    @Override // defpackage.ew7
    public final gd1 g(wi8 wi8Var) {
        if (wi8Var != null) {
            ui8 ui8Var = wi8Var.a;
            return ui8Var.e() ? this : new v74(this, wi8.e(ui8Var, A0().a));
        }
        z0(23);
        throw null;
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        us0 us0VarG0 = this.X.g0();
        if (us0VarG0 != null) {
            return us0VarG0;
        }
        z0(25);
        throw null;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        sm annotations = this.X.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        z0(19);
        throw null;
    }

    @Override // defpackage.ed1
    public final v15 getName() {
        v15 name = this.X.getName();
        if (name != null) {
            return name;
        }
        z0(20);
        throw null;
    }

    @Override // defpackage.gd1
    public final ke7 getSource() {
        return ke7.G;
    }

    @Override // defpackage.sx4
    public final boolean i() {
        return this.X.i();
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return this.X.j0();
    }

    @Override // defpackage.ts4
    public final boolean k() {
        return this.X.k();
    }

    @Override // defpackage.sx4, defpackage.pt0
    public final List k0() {
        A0();
        ArrayList arrayList = this.g0;
        if (arrayList != null) {
            return arrayList;
        }
        z0(30);
        throw null;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        lh8 lh8VarL = this.X.l();
        if (this.Y.a.e()) {
            if (lh8VarL != null) {
                return lh8VarL;
            }
            z0(0);
            throw null;
        }
        ft0 ft0Var = this.h0;
        if (ft0Var != null) {
            return ft0Var;
        }
        wi8 wi8VarA0 = A0();
        Collection collectionC = lh8VarL.c();
        ArrayList arrayList = new ArrayList(collectionC.size());
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(wi8VarA0.h((t14) it.next(), rt8.INVARIANT));
        }
        ft0 ft0Var2 = new ft0(this, this.f0, arrayList, ve4.e);
        this.h0 = ft0Var2;
        return ft0Var2;
    }

    @Override // defpackage.sx4
    public final et4 l0(ui8 ui8Var) {
        el1.h(bl1.c(this));
        return m0(ui8Var, z14.t);
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        fx4 fx4VarM = this.X.m();
        if (fx4VarM != null) {
            return fx4VarM;
        }
        z0(26);
        throw null;
    }

    @Override // defpackage.sx4
    public final et4 m0(ui8 ui8Var, z14 z14Var) {
        et4 et4VarM0 = this.X.m0(ui8Var, z14Var);
        if (!this.Y.a.e()) {
            return new fw7(et4VarM0, A0());
        }
        if (et4VarM0 != null) {
            return et4VarM0;
        }
        z0(7);
        throw null;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return this.X.n();
    }

    @Override // defpackage.ed1
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final sx4 a() {
        sx4 sx4VarA = this.X.a();
        if (sx4VarA != null) {
            return sx4VarA;
        }
        z0(21);
        throw null;
    }

    @Override // defpackage.sx4
    public final et4 o0() {
        et4 et4VarO0 = this.X.o0();
        if (et4VarO0 != null) {
            return et4VarO0;
        }
        z0(15);
        throw null;
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        ed1 ed1VarP = this.X.p();
        if (ed1VarP != null) {
            return ed1VarP;
        }
        z0(22);
        throw null;
    }

    @Override // defpackage.sx4
    public final et4 q0() {
        et4 et4VarQ0 = this.X.q0();
        if (et4VarQ0 != null) {
            return et4VarQ0;
        }
        z0(28);
        throw null;
    }

    @Override // defpackage.sx4
    public final et4 r0() {
        el1.h(bl1.c(this.X));
        return s0(z14.t);
    }

    @Override // defpackage.sx4
    public final et4 s0(z14 z14Var) {
        et4 et4VarS0 = this.X.s0(z14Var);
        if (!this.Y.a.e()) {
            return new fw7(et4VarS0, A0());
        }
        if (et4VarS0 != null) {
            return et4VarS0;
        }
        z0(14);
        throw null;
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return this.X.t0();
    }

    @Override // defpackage.sx4
    public final ft8 u0() {
        ft8 ft8VarU0 = this.X.u0();
        ArrayList arrayList = null;
        if (ft8VarU0 == null) {
            return null;
        }
        boolean z = ft8VarU0 instanceof ad3;
        rt8 rt8Var = rt8.INVARIANT;
        wi8 wi8Var = this.Y;
        if (z) {
            ad3 ad3Var = (ad3) ft8VarU0;
            v15 v15Var = ad3Var.a;
            aa7 aa7Var = (aa7) ad3Var.b;
            if (aa7Var != null && !wi8Var.a.e()) {
                aa7Var = (aa7) A0().h(aa7Var, rt8Var);
            }
            return new ad3(v15Var, aa7Var);
        }
        if (!(ft8VarU0 instanceof an2)) {
            b61.c();
            return null;
        }
        List<qg5> list = ((an2) ft8VarU0).a;
        if (list != null) {
            arrayList = new ArrayList(xv0.Z(list, 10));
            for (qg5 qg5Var : list) {
                v15 v15Var2 = (v15) qg5Var.X;
                aa7 aa7Var2 = (aa7) ((zk6) qg5Var.Y);
                if (aa7Var2 != null && !wi8Var.a.e()) {
                    aa7Var2 = (aa7) A0().h(aa7Var2, rt8Var);
                }
                arrayList.add(new qg5(v15Var2, aa7Var2));
            }
        }
        return new an2(arrayList);
    }

    @Override // defpackage.sx4
    public final boolean v0() {
        return this.X.v0();
    }

    @Override // defpackage.sx4
    public final boolean w0() {
        return this.X.w0();
    }

    @Override // defpackage.sx4
    public final boolean x0() {
        return this.X.x0();
    }

    @Override // defpackage.sx4
    public final boolean y0() {
        return this.X.y0();
    }
}
