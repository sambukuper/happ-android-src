package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class o implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xe2 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o(xe2 xe2Var, byte b) {
        this.X = b;
        this.Y = xe2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:109:0x0195  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0249  */
    /* JADX WARN: Code duplicated, block: B:173:0x0285  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:205:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:221:0x0339  */
    /* JADX WARN: Code duplicated, block: B:237:0x0375  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:269:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:285:0x0429  */
    /* JADX WARN: Code duplicated, block: B:301:0x0465  */
    /* JADX WARN: Code duplicated, block: B:325:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:341:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:357:0x0537  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object a(ze2 ze2Var, q51 q51Var) {
        l lVar;
        a52 a52Var;
        c52 c52Var;
        t93 t93Var;
        w93 w93Var;
        zk4 zk4Var;
        fl4 fl4Var;
        hl4 hl4Var;
        jl4 jl4Var;
        ll4 ll4Var;
        nl4 nl4Var;
        sl4 sl4Var;
        zn4 zn4Var;
        vj5 vj5Var;
        zj5 zj5Var;
        bk5 bk5Var;
        rk5 rk5Var;
        tk5 tk5Var;
        vk5 vk5Var;
        x57 x57Var;
        mk7 mk7Var;
        lp8 lp8Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        xe2 xe2Var = this.Y;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                if (q51Var instanceof l) {
                    lVar = (l) q51Var;
                    int i = lVar.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lVar.g0 = i - Integer.MIN_VALUE;
                    } else {
                        lVar = new l(this, q51Var);
                    }
                } else {
                    lVar = new l(this, q51Var);
                }
                Object obj = lVar.f0;
                int i2 = lVar.g0;
                if (i2 == 0) {
                    w39.n0(obj);
                    n nVar = new n(ze2Var, (byte) 0);
                    lVar.g0 = 1;
                    if (xe2Var.a(nVar, lVar) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                if (q51Var instanceof a52) {
                    a52Var = (a52) q51Var;
                    int i3 = a52Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a52Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        a52Var = new a52(this, q51Var);
                    }
                } else {
                    a52Var = new a52(this, q51Var);
                }
                Object obj2 = a52Var.f0;
                int i4 = a52Var.g0;
                if (i4 == 0) {
                    w39.n0(obj2);
                    n nVar2 = new n(ze2Var, (byte) 4);
                    a52Var.g0 = 1;
                    if (xe2Var.a(nVar2, a52Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i4 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj2);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                if (q51Var instanceof c52) {
                    c52Var = (c52) q51Var;
                    int i5 = c52Var.g0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c52Var.g0 = i5 - Integer.MIN_VALUE;
                    } else {
                        c52Var = new c52(this, q51Var);
                    }
                } else {
                    c52Var = new c52(this, q51Var);
                }
                Object obj3 = c52Var.f0;
                int i6 = c52Var.g0;
                if (i6 == 0) {
                    w39.n0(obj3);
                    n nVar3 = new n(ze2Var, (byte) 5);
                    c52Var.g0 = 1;
                    if (xe2Var.a(nVar3, c52Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i6 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj3);
                }
                return dn8Var;
            case 3:
                Object objA = xe2Var.a(new te0(new ca6(), ze2Var, (byte) 3), q51Var);
                return objA == c71Var ? objA : dn8Var;
            case 4:
                Object objA2 = xe2Var.a(new n(ze2Var, (byte) 7), q51Var);
                return objA2 == c71Var ? objA2 : dn8Var;
            case 5:
                if (q51Var instanceof t93) {
                    t93Var = (t93) q51Var;
                    int i7 = t93Var.g0;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        t93Var.g0 = i7 - Integer.MIN_VALUE;
                    } else {
                        t93Var = new t93(this, q51Var);
                    }
                } else {
                    t93Var = new t93(this, q51Var);
                }
                Object obj4 = t93Var.f0;
                int i8 = t93Var.g0;
                if (i8 == 0) {
                    w39.n0(obj4);
                    n nVar4 = new n(ze2Var, (byte) 8);
                    t93Var.g0 = 1;
                    if (xe2Var.a(nVar4, t93Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i8 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj4);
                }
                return dn8Var;
            case 6:
                if (q51Var instanceof w93) {
                    w93Var = (w93) q51Var;
                    int i9 = w93Var.g0;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        w93Var.g0 = i9 - Integer.MIN_VALUE;
                    } else {
                        w93Var = new w93(this, q51Var);
                    }
                } else {
                    w93Var = new w93(this, q51Var);
                }
                Object obj5 = w93Var.f0;
                int i10 = w93Var.g0;
                if (i10 == 0) {
                    w39.n0(obj5);
                    n nVar5 = new n(ze2Var, (byte) 9);
                    w93Var.g0 = 1;
                    if (xe2Var.a(nVar5, w93Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i10 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj5);
                }
                return dn8Var;
            case 7:
                if (q51Var instanceof zk4) {
                    zk4Var = (zk4) q51Var;
                    int i11 = zk4Var.g0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        zk4Var.g0 = i11 - Integer.MIN_VALUE;
                    } else {
                        zk4Var = new zk4(this, q51Var);
                    }
                } else {
                    zk4Var = new zk4(this, q51Var);
                }
                Object obj6 = zk4Var.f0;
                int i12 = zk4Var.g0;
                if (i12 == 0) {
                    w39.n0(obj6);
                    n nVar6 = new n(ze2Var, (byte) 10);
                    zk4Var.g0 = 1;
                    if (xe2Var.a(nVar6, zk4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i12 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj6);
                }
                return dn8Var;
            case 8:
                if (q51Var instanceof fl4) {
                    fl4Var = (fl4) q51Var;
                    int i13 = fl4Var.g0;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        fl4Var.g0 = i13 - Integer.MIN_VALUE;
                    } else {
                        fl4Var = new fl4(this, q51Var);
                    }
                } else {
                    fl4Var = new fl4(this, q51Var);
                }
                Object obj7 = fl4Var.f0;
                int i14 = fl4Var.g0;
                if (i14 == 0) {
                    w39.n0(obj7);
                    n nVar7 = new n(ze2Var, (byte) 11);
                    fl4Var.g0 = 1;
                    if (xe2Var.a(nVar7, fl4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i14 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj7);
                }
                return dn8Var;
            case 9:
                if (q51Var instanceof hl4) {
                    hl4Var = (hl4) q51Var;
                    int i15 = hl4Var.g0;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        hl4Var.g0 = i15 - Integer.MIN_VALUE;
                    } else {
                        hl4Var = new hl4(this, q51Var);
                    }
                } else {
                    hl4Var = new hl4(this, q51Var);
                }
                Object obj8 = hl4Var.f0;
                int i16 = hl4Var.g0;
                if (i16 == 0) {
                    w39.n0(obj8);
                    n nVar8 = new n(ze2Var, (byte) 12);
                    hl4Var.g0 = 1;
                    if (xe2Var.a(nVar8, hl4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i16 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj8);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                if (q51Var instanceof jl4) {
                    jl4Var = (jl4) q51Var;
                    int i17 = jl4Var.g0;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        jl4Var.g0 = i17 - Integer.MIN_VALUE;
                    } else {
                        jl4Var = new jl4(this, q51Var);
                    }
                } else {
                    jl4Var = new jl4(this, q51Var);
                }
                Object obj9 = jl4Var.f0;
                int i18 = jl4Var.g0;
                if (i18 == 0) {
                    w39.n0(obj9);
                    n nVar9 = new n(ze2Var, (byte) 13);
                    jl4Var.g0 = 1;
                    if (xe2Var.a(nVar9, jl4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i18 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj9);
                }
                return dn8Var;
            case 11:
                if (q51Var instanceof ll4) {
                    ll4Var = (ll4) q51Var;
                    int i19 = ll4Var.g0;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ll4Var.g0 = i19 - Integer.MIN_VALUE;
                    } else {
                        ll4Var = new ll4(this, q51Var);
                    }
                } else {
                    ll4Var = new ll4(this, q51Var);
                }
                Object obj10 = ll4Var.f0;
                int i20 = ll4Var.g0;
                if (i20 == 0) {
                    w39.n0(obj10);
                    n nVar10 = new n(ze2Var, (byte) 14);
                    ll4Var.g0 = 1;
                    if (xe2Var.a(nVar10, ll4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i20 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj10);
                }
                return dn8Var;
            case 12:
                if (q51Var instanceof nl4) {
                    nl4Var = (nl4) q51Var;
                    int i21 = nl4Var.g0;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        nl4Var.g0 = i21 - Integer.MIN_VALUE;
                    } else {
                        nl4Var = new nl4(this, q51Var);
                    }
                } else {
                    nl4Var = new nl4(this, q51Var);
                }
                Object obj11 = nl4Var.f0;
                int i22 = nl4Var.g0;
                if (i22 == 0) {
                    w39.n0(obj11);
                    n nVar11 = new n(ze2Var, (byte) 15);
                    nl4Var.g0 = 1;
                    if (xe2Var.a(nVar11, nl4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i22 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj11);
                }
                return dn8Var;
            case 13:
                if (q51Var instanceof sl4) {
                    sl4Var = (sl4) q51Var;
                    int i23 = sl4Var.g0;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        sl4Var.g0 = i23 - Integer.MIN_VALUE;
                    } else {
                        sl4Var = new sl4(this, q51Var);
                    }
                } else {
                    sl4Var = new sl4(this, q51Var);
                }
                Object obj12 = sl4Var.f0;
                int i24 = sl4Var.g0;
                if (i24 == 0) {
                    w39.n0(obj12);
                    n nVar12 = new n(ze2Var, (byte) 17);
                    sl4Var.g0 = 1;
                    if (xe2Var.a(nVar12, sl4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i24 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj12);
                }
                return dn8Var;
            case 14:
                if (q51Var instanceof zn4) {
                    zn4Var = (zn4) q51Var;
                    int i25 = zn4Var.g0;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        zn4Var.g0 = i25 - Integer.MIN_VALUE;
                    } else {
                        zn4Var = new zn4(this, q51Var);
                    }
                } else {
                    zn4Var = new zn4(this, q51Var);
                }
                Object obj13 = zn4Var.f0;
                int i26 = zn4Var.g0;
                if (i26 == 0) {
                    w39.n0(obj13);
                    n nVar13 = new n(ze2Var, (byte) 18);
                    zn4Var.g0 = 1;
                    if (xe2Var.a(nVar13, zn4Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i26 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj13);
                }
                return dn8Var;
            case 15:
                if (q51Var instanceof vj5) {
                    vj5Var = (vj5) q51Var;
                    int i27 = vj5Var.g0;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        vj5Var.g0 = i27 - Integer.MIN_VALUE;
                    } else {
                        vj5Var = new vj5(this, q51Var);
                    }
                } else {
                    vj5Var = new vj5(this, q51Var);
                }
                Object obj14 = vj5Var.f0;
                int i28 = vj5Var.g0;
                if (i28 == 0) {
                    w39.n0(obj14);
                    n nVar14 = new n(ze2Var, (byte) 22);
                    vj5Var.g0 = 1;
                    if (xe2Var.a(nVar14, vj5Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i28 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj14);
                }
                return dn8Var;
            case 16:
                if (q51Var instanceof zj5) {
                    zj5Var = (zj5) q51Var;
                    int i29 = zj5Var.g0;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        zj5Var.g0 = i29 - Integer.MIN_VALUE;
                    } else {
                        zj5Var = new zj5(this, q51Var);
                    }
                } else {
                    zj5Var = new zj5(this, q51Var);
                }
                Object obj15 = zj5Var.f0;
                int i30 = zj5Var.g0;
                if (i30 == 0) {
                    w39.n0(obj15);
                    n nVar15 = new n(ze2Var, (byte) 23);
                    zj5Var.g0 = 1;
                    if (xe2Var.a(nVar15, zj5Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i30 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj15);
                }
                return dn8Var;
            case 17:
                if (q51Var instanceof bk5) {
                    bk5Var = (bk5) q51Var;
                    int i31 = bk5Var.g0;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        bk5Var.g0 = i31 - Integer.MIN_VALUE;
                    } else {
                        bk5Var = new bk5(this, q51Var);
                    }
                } else {
                    bk5Var = new bk5(this, q51Var);
                }
                Object obj16 = bk5Var.f0;
                int i32 = bk5Var.g0;
                if (i32 == 0) {
                    w39.n0(obj16);
                    n nVar16 = new n(ze2Var, (byte) 24);
                    bk5Var.g0 = 1;
                    if (xe2Var.a(nVar16, bk5Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i32 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj16);
                }
                return dn8Var;
            case 18:
                if (q51Var instanceof rk5) {
                    rk5Var = (rk5) q51Var;
                    int i33 = rk5Var.g0;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        rk5Var.g0 = i33 - Integer.MIN_VALUE;
                    } else {
                        rk5Var = new rk5(this, q51Var);
                    }
                } else {
                    rk5Var = new rk5(this, q51Var);
                }
                Object obj17 = rk5Var.f0;
                int i34 = rk5Var.g0;
                if (i34 == 0) {
                    w39.n0(obj17);
                    n nVar17 = new n(ze2Var, (byte) 25);
                    rk5Var.g0 = 1;
                    if (xe2Var.a(nVar17, rk5Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i34 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj17);
                }
                return dn8Var;
            case 19:
                if (q51Var instanceof tk5) {
                    tk5Var = (tk5) q51Var;
                    int i35 = tk5Var.g0;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        tk5Var.g0 = i35 - Integer.MIN_VALUE;
                    } else {
                        tk5Var = new tk5(this, q51Var);
                    }
                } else {
                    tk5Var = new tk5(this, q51Var);
                }
                Object obj18 = tk5Var.f0;
                int i36 = tk5Var.g0;
                if (i36 == 0) {
                    w39.n0(obj18);
                    n nVar18 = new n(ze2Var, (byte) 26);
                    tk5Var.g0 = 1;
                    if (xe2Var.a(nVar18, tk5Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i36 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj18);
                }
                return dn8Var;
            case 20:
                if (q51Var instanceof vk5) {
                    vk5Var = (vk5) q51Var;
                    int i37 = vk5Var.g0;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        vk5Var.g0 = i37 - Integer.MIN_VALUE;
                    } else {
                        vk5Var = new vk5(this, q51Var);
                    }
                } else {
                    vk5Var = new vk5(this, q51Var);
                }
                Object obj19 = vk5Var.f0;
                int i38 = vk5Var.g0;
                if (i38 == 0) {
                    w39.n0(obj19);
                    n nVar19 = new n(ze2Var, (byte) 27);
                    vk5Var.g0 = 1;
                    if (xe2Var.a(nVar19, vk5Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i38 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj19);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                Object objA3 = xe2Var.a(new n(ze2Var, (byte) 28), q51Var);
                return objA3 == c71Var ? objA3 : dn8Var;
            case 22:
                if (q51Var instanceof x57) {
                    x57Var = (x57) q51Var;
                    int i39 = x57Var.g0;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        x57Var.g0 = i39 - Integer.MIN_VALUE;
                    } else {
                        x57Var = new x57(this, q51Var);
                    }
                } else {
                    x57Var = new x57(this, q51Var);
                }
                Object obj20 = x57Var.f0;
                int i40 = x57Var.g0;
                if (i40 == 0) {
                    w39.n0(obj20);
                    c27 c27Var = new c27(ze2Var, (byte) 1);
                    x57Var.g0 = 1;
                    if (xe2Var.a(c27Var, x57Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i40 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj20);
                }
                return dn8Var;
            case 23:
                if (q51Var instanceof mk7) {
                    mk7Var = (mk7) q51Var;
                    int i41 = mk7Var.g0;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        mk7Var.g0 = i41 - Integer.MIN_VALUE;
                    } else {
                        mk7Var = new mk7(this, q51Var);
                    }
                } else {
                    mk7Var = new mk7(this, q51Var);
                }
                Object obj21 = mk7Var.f0;
                int i42 = mk7Var.g0;
                if (i42 == 0) {
                    w39.n0(obj21);
                    c27 c27Var2 = new c27(ze2Var, (byte) 2);
                    mk7Var.g0 = 1;
                    if (xe2Var.a(c27Var2, mk7Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i42 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj21);
                }
                return dn8Var;
            default:
                if (q51Var instanceof lp8) {
                    lp8Var = (lp8) q51Var;
                    int i43 = lp8Var.g0;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        lp8Var.g0 = i43 - Integer.MIN_VALUE;
                    } else {
                        lp8Var = new lp8(this, q51Var);
                    }
                } else {
                    lp8Var = new lp8(this, q51Var);
                }
                Object obj22 = lp8Var.f0;
                int i44 = lp8Var.g0;
                if (i44 == 0) {
                    w39.n0(obj22);
                    c27 c27Var3 = new c27(ze2Var, (byte) 3);
                    lp8Var.g0 = 1;
                    if (xe2Var.a(c27Var3, lp8Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i44 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj22);
                }
                return dn8Var;
        }
    }
}
