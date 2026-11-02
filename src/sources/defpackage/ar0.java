package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.CheckSubscriptionExtraResult;
import su.happ.proxyutility.dto.HashedDomain;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionExtraStatus;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.TypeCheck;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 {
    public final vz7 a = new vz7(new w60((byte) 7));
    public final vz7 b = new vz7(new w60((byte) 8));
    public final vz7 c = new vz7(new w60((byte) 9));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        vq0 vq0Var;
        Iterator it;
        if (s51Var instanceof vq0) {
            vq0Var = (vq0) s51Var;
            int i = vq0Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq0Var.i0 = i - Integer.MIN_VALUE;
            } else {
                vq0Var = new vq0(this, s51Var);
            }
        } else {
            vq0Var = new vq0(this, s51Var);
        }
        Object obj = vq0Var.g0;
        int i2 = vq0Var.i0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            kw4 kw4Var = kw4.a;
            List listD = kw4.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listD) {
                SubscriptionItem subscriptionItem = (SubscriptionItem) ((qg5) obj2).Y;
                if (subscriptionItem.getProviderId() != null && (subscriptionItem.d0() || subscriptionItem.c0())) {
                    arrayList.add(obj2);
                }
            }
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = vq0Var.f0;
            w39.n0(obj);
        }
        while (it.hasNext()) {
            qg5 qg5Var = (qg5) it.next();
            String value = ((SubId) qg5Var.X).getValue();
            j31 j31Var = new j31(new pi(new j31(x97.a0(0, 3), (byte) 3), new xq0(this, (SubscriptionItem) qg5Var.Y, value, null), q51Var, (byte) 8), (byte) 7);
            q5 q5Var = new q5(2, q51Var, (byte) 4);
            vq0Var.f0 = it;
            vq0Var.i0 = 1;
            Object objF = vr3.f(j31Var, q5Var, vq0Var);
            c71 c71Var = c71.X;
            if (objF == c71Var) {
                return c71Var;
            }
        }
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ac -> B:33:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.rn2 r11, defpackage.s51 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.yq0
            if (r0 == 0) goto L13
            r0 = r12
            yq0 r0 = (defpackage.yq0) r0
            int r1 = r0.k0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k0 = r1
            goto L18
        L13:
            yq0 r0 = new yq0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.i0
            int r1 = r0.k0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L31
            java.lang.String r11 = r0.h0
            java.util.Iterator r1 = r0.g0
            rn2 r4 = r0.f0
            defpackage.w39.n0(r12)
            r6 = r11
            r9 = r0
            r11 = r4
            r4 = r10
            goto Laf
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r10)
            return r3
        L37:
            defpackage.w39.n0(r12)
            kw4 r12 = defpackage.kw4.a
            java.util.List r12 = defpackage.kw4.d()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        L49:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r12.next()
            r5 = r4
            qg5 r5 = (defpackage.qg5) r5
            java.lang.Object r5 = r5.Y
            su.happ.proxyutility.dto.SubscriptionItem r5 = (su.happ.proxyutility.dto.SubscriptionItem) r5
            java.lang.String r6 = r5.getProviderId()
            if (r6 == 0) goto L49
            boolean r5 = r5.d0()
            if (r5 == 0) goto L49
            r1.add(r4)
            goto L49
        L6a:
            java.util.Iterator r12 = r1.iterator()
            r1 = r12
            r9 = r0
        L70:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto Lc3
            java.lang.Object r12 = r1.next()
            qg5 r12 = (defpackage.qg5) r12
            java.lang.Object r0 = r12.X
            su.happ.proxyutility.domain.sub.SubId r0 = (su.happ.proxyutility.domain.sub.SubId) r0
            java.lang.String r6 = r0.getValue()
            java.lang.Object r12 = r12.Y
            r7 = r12
            su.happ.proxyutility.dto.SubscriptionItem r7 = (su.happ.proxyutility.dto.SubscriptionItem) r7
            java.lang.String r12 = r7.getProviderId()
            if (r12 == 0) goto L95
            su.happ.proxyutility.dto.ProviderId r0 = new su.happ.proxyutility.dto.ProviderId
            r0.<init>(r12)
            goto L96
        L95:
            r0 = r3
        L96:
            if (r0 == 0) goto Lbd
            java.lang.String r5 = r0.getValue()
            r9.f0 = r11
            r9.g0 = r1
            r9.h0 = r6
            r9.k0 = r2
            r8 = 0
            r4 = r10
            java.lang.Object r12 = r4.c(r5, r6, r7, r8, r9)
            c71 r10 = defpackage.c71.X
            if (r12 != r10) goto Laf
            return r10
        Laf:
            su.happ.proxyutility.dto.SubscriptionExtraStatus r12 = (su.happ.proxyutility.dto.SubscriptionExtraStatus) r12
            if (r12 == 0) goto Lbb
            su.happ.proxyutility.domain.sub.SubId r10 = new su.happ.proxyutility.domain.sub.SubId
            r10.<init>(r6)
            r11.K(r10, r12)
        Lbb:
            r10 = r4
            goto L70
        Lbd:
            java.lang.String r10 = "Required value was null."
            defpackage.bt.q(r10)
            return r3
        Lc3:
            dn8 r10 = defpackage.dn8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar0.b(rn2, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013d  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x0191 A[PHI: r1 r2 r3 r4 r5 r23
  0x0191: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v11 java.lang.String) binds: [B:59:0x018e, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v8 java.lang.String) binds: [B:59:0x018e, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r3v1 su.happ.proxyutility.dto.SubscriptionItem) = (r3v0 su.happ.proxyutility.dto.SubscriptionItem), (r3v5 su.happ.proxyutility.dto.SubscriptionItem) binds: [B:59:0x018e, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r4v1 boolean) = (r4v0 boolean), (r4v5 boolean) binds: [B:59:0x018e, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r5v13 java.lang.Object) = (r5v9 java.lang.Object), (r5v1 java.lang.Object) binds: [B:59:0x018e, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r23v5 java.lang.Boolean) = (r23v2 java.lang.Boolean), (r23v10 java.lang.Boolean) binds: [B:59:0x018e, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, String str2, SubscriptionItem subscriptionItem, boolean z, s51 s51Var) {
        zq0 zq0Var;
        String providerId;
        Boolean bool;
        Boolean boolValueOf;
        CheckSubscriptionExtraResult checkSubscriptionExtraResult;
        SubscriptionItem subscriptionItem2;
        CheckSubscriptionExtraResult checkSubscriptionExtraResult2;
        MetaParams metaParams;
        Boolean reset;
        SubscriptionItem.Status statusA;
        String str3 = str;
        String str4 = str2;
        SubscriptionItem subscriptionItem3 = subscriptionItem;
        boolean z2 = z;
        if (s51Var instanceof zq0) {
            zq0Var = (zq0) s51Var;
            int i = zq0Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq0Var.l0 = i - Integer.MIN_VALUE;
            } else {
                zq0Var = new zq0(this, s51Var);
            }
        } else {
            zq0Var = new zq0(this, s51Var);
        }
        Object objH = zq0Var.j0;
        int i2 = zq0Var.l0;
        int i3 = 3;
        int i4 = 2;
        String str5 = null;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objH);
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem3, (byte) 0));
            vz7 vz7Var = this.b;
            if (z2) {
                qo qoVar = (qo) vz7Var.getValue();
                zq0Var.f0 = str3;
                zq0Var.g0 = str4;
                zq0Var.h0 = subscriptionItem3;
                zq0Var.i0 = z2;
                zq0Var.l0 = 1;
                objH = qoVar.h(subscriptionItem3, str3, zq0Var);
                if (objH != c71Var) {
                    subscriptionItem2 = subscriptionItem3;
                    checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                    bool = null;
                }
            } else {
                p72 p72Var = (p72) this.a.getValue();
                p72Var.getClass();
                subscriptionItem3.getClass();
                ss8 ss8Var = ss8.a;
                Object objQ = ss8.q(subscriptionItem3);
                if (objQ instanceof rj6) {
                    objQ = null;
                }
                HashedDomain hashedDomain = (HashedDomain) objQ;
                String value = hashedDomain != null ? hashedDomain.getValue() : null;
                if (value == null) {
                    checkSubscriptionExtraResult = new CheckSubscriptionExtraResult(str5, TypeCheck.FILE, i3);
                } else {
                    if (str3 == null) {
                        providerId = subscriptionItem3.getProviderId();
                        if (providerId == null) {
                            checkSubscriptionExtraResult = new CheckSubscriptionExtraResult(value, TypeCheck.FILE, i4);
                        }
                        if (checkSubscriptionExtraResult == null) {
                            metaParams = subscriptionItem3.getMetaParams();
                            if (metaParams != null) {
                                reset = metaParams.getReset();
                            } else {
                                reset = bool;
                            }
                            if (reset != null) {
                                return bool;
                            }
                            qo qoVar2 = (qo) vz7Var.getValue();
                            zq0Var.f0 = str3;
                            zq0Var.g0 = str4;
                            zq0Var.h0 = subscriptionItem3;
                            zq0Var.i0 = z2;
                            zq0Var.l0 = 2;
                            objH = qoVar2.h(subscriptionItem3, str3, zq0Var);
                            if (objH != c71Var) {
                                if (!((CheckSubscriptionExtraResult) objH).getIsExtra()) {
                                    objH = bool;
                                }
                                checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                                if (checkSubscriptionExtraResult2 == null) {
                                    vr1 vr1Var = (vr1) this.c.getValue();
                                    zq0Var.f0 = str3;
                                    zq0Var.g0 = str4;
                                    zq0Var.h0 = subscriptionItem3;
                                    zq0Var.i0 = z2;
                                    zq0Var.l0 = 3;
                                    objH = vr1Var.b(subscriptionItem3, str3, zq0Var);
                                    if (objH != c71Var) {
                                        subscriptionItem2 = subscriptionItem3;
                                        checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                                    }
                                } else {
                                    subscriptionItem2 = subscriptionItem3;
                                }
                            }
                        } else {
                            subscriptionItem2 = subscriptionItem3;
                            checkSubscriptionExtraResult2 = checkSubscriptionExtraResult;
                        }
                    } else {
                        providerId = str3;
                    }
                    l72 l72VarC = p72Var.c();
                    l72VarC.getClass();
                    bool = null;
                    List list = (List) ((Map) l72VarC.c.X.getValue()).get(providerId);
                    k32.i().d().h(new p0(providerId, list, (byte) 20));
                    if (list != null) {
                        boolean zContains = list.contains(value);
                        k32.i().d().h(new zs1(zContains, (Object) l72VarC, (byte) 1));
                        boolValueOf = Boolean.valueOf(zContains);
                        if (l72VarC.f()) {
                            boolValueOf = null;
                        }
                    } else {
                        boolValueOf = null;
                    }
                    k32.i().d().h(new p0(boolValueOf, p72Var, (byte) 21));
                    checkSubscriptionExtraResult = (boolValueOf == null || !boolValueOf.booleanValue()) ? null : new CheckSubscriptionExtraResult(value, new SubscriptionExtraStatus(), TypeCheck.FILE);
                    if (checkSubscriptionExtraResult == null) {
                        metaParams = subscriptionItem3.getMetaParams();
                        if (metaParams != null) {
                            reset = metaParams.getReset();
                        } else {
                            reset = bool;
                        }
                        if (reset != null) {
                            return bool;
                        }
                        qo qoVar3 = (qo) vz7Var.getValue();
                        zq0Var.f0 = str3;
                        zq0Var.g0 = str4;
                        zq0Var.h0 = subscriptionItem3;
                        zq0Var.i0 = z2;
                        zq0Var.l0 = 2;
                        objH = qoVar3.h(subscriptionItem3, str3, zq0Var);
                        if (objH != c71Var) {
                            if (!((CheckSubscriptionExtraResult) objH).getIsExtra()) {
                                objH = bool;
                            }
                            checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                            if (checkSubscriptionExtraResult2 == null) {
                                vr1 vr1Var2 = (vr1) this.c.getValue();
                                zq0Var.f0 = str3;
                                zq0Var.g0 = str4;
                                zq0Var.h0 = subscriptionItem3;
                                zq0Var.i0 = z2;
                                zq0Var.l0 = 3;
                                objH = vr1Var2.b(subscriptionItem3, str3, zq0Var);
                                if (objH != c71Var) {
                                    subscriptionItem2 = subscriptionItem3;
                                    checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                                }
                            } else {
                                subscriptionItem2 = subscriptionItem3;
                            }
                        }
                    } else {
                        subscriptionItem2 = subscriptionItem3;
                        checkSubscriptionExtraResult2 = checkSubscriptionExtraResult;
                    }
                }
                bool = null;
                if (checkSubscriptionExtraResult == null) {
                    metaParams = subscriptionItem3.getMetaParams();
                    if (metaParams != null) {
                        reset = metaParams.getReset();
                    } else {
                        reset = bool;
                    }
                    if (reset != null) {
                        return bool;
                    }
                    qo qoVar4 = (qo) vz7Var.getValue();
                    zq0Var.f0 = str3;
                    zq0Var.g0 = str4;
                    zq0Var.h0 = subscriptionItem3;
                    zq0Var.i0 = z2;
                    zq0Var.l0 = 2;
                    objH = qoVar4.h(subscriptionItem3, str3, zq0Var);
                    if (objH != c71Var) {
                        if (!((CheckSubscriptionExtraResult) objH).getIsExtra()) {
                            objH = bool;
                        }
                        checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                        if (checkSubscriptionExtraResult2 == null) {
                            vr1 vr1Var3 = (vr1) this.c.getValue();
                            zq0Var.f0 = str3;
                            zq0Var.g0 = str4;
                            zq0Var.h0 = subscriptionItem3;
                            zq0Var.i0 = z2;
                            zq0Var.l0 = 3;
                            objH = vr1Var3.b(subscriptionItem3, str3, zq0Var);
                            if (objH != c71Var) {
                                subscriptionItem2 = subscriptionItem3;
                                checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                            }
                        } else {
                            subscriptionItem2 = subscriptionItem3;
                        }
                    }
                } else {
                    subscriptionItem2 = subscriptionItem3;
                    checkSubscriptionExtraResult2 = checkSubscriptionExtraResult;
                }
            }
            return c71Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                boolean z3 = zq0Var.i0;
                SubscriptionItem subscriptionItem4 = zq0Var.h0;
                String str6 = zq0Var.g0;
                String str7 = zq0Var.f0;
                w39.n0(objH);
                z2 = z3;
                str3 = str7;
                subscriptionItem3 = subscriptionItem4;
                str4 = str6;
                bool = null;
                if (!((CheckSubscriptionExtraResult) objH).getIsExtra()) {
                    objH = bool;
                }
                checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
                if (checkSubscriptionExtraResult2 == null) {
                    vr1 vr1Var4 = (vr1) this.c.getValue();
                    zq0Var.f0 = str3;
                    zq0Var.g0 = str4;
                    zq0Var.h0 = subscriptionItem3;
                    zq0Var.i0 = z2;
                    zq0Var.l0 = 3;
                    objH = vr1Var4.b(subscriptionItem3, str3, zq0Var);
                    if (objH != c71Var) {
                        subscriptionItem2 = subscriptionItem3;
                    }
                    return c71Var;
                }
                subscriptionItem2 = subscriptionItem3;
            } else {
                if (i2 != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                subscriptionItem2 = zq0Var.h0;
                String str8 = zq0Var.g0;
                String str9 = zq0Var.f0;
                w39.n0(objH);
                str4 = str8;
                str3 = str9;
                bool = null;
            }
            checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
        } else {
            subscriptionItem2 = zq0Var.h0;
            String str10 = zq0Var.g0;
            String str11 = zq0Var.f0;
            w39.n0(objH);
            str4 = str10;
            str3 = str11;
            checkSubscriptionExtraResult2 = (CheckSubscriptionExtraResult) objH;
            bool = null;
        }
        String hashedDomain2 = checkSubscriptionExtraResult2.getHashedDomain();
        SubscriptionExtraStatus extraResult = checkSubscriptionExtraResult2.getExtraResult();
        TypeCheck typeCheck = checkSubscriptionExtraResult2.getTypeCheck();
        subscriptionItem2.t0(str3, hashedDomain2);
        if (extraResult != null) {
            int status = extraResult.getStatus();
            SubscriptionItem.INSTANCE.getClass();
            statusA = SubscriptionItem.Companion.a(status);
        } else {
            statusA = bool;
        }
        SubscriptionItem.u0(subscriptionItem2, statusA, typeCheck, 2);
        if (extraResult != null) {
            subscriptionItem2.m0(new Long(System.currentTimeMillis()));
        }
        kw4 kw4Var = kw4.a;
        kw4.u(subscriptionItem2, str4);
        return extraResult;
    }
}
