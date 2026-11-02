package defpackage;

import androidx.compose.material.ripple.RippleNode;
import androidx.compose.material3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ te0(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, q51 q51Var) {
        dh7 dh7Var;
        if (q51Var instanceof dh7) {
            dh7Var = (dh7) q51Var;
            int i2 = dh7Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dh7Var.h0 = i2 - Integer.MIN_VALUE;
            } else {
                dh7Var = new dh7(this, q51Var);
            }
        } else {
            dh7Var = new dh7(this, q51Var);
        }
        Object obj = dh7Var.f0;
        int i3 = dh7Var.h0;
        dn8 dn8Var = dn8.a;
        if (i3 != 0) {
            if (i3 == 1) {
                w39.n0(obj);
                return dn8Var;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        if (i > 0) {
            aa6 aa6Var = (aa6) this.Y;
            if (!aa6Var.X) {
                aa6Var.X = true;
                ze2 ze2Var = (ze2) this.Z;
                dh7Var.h0 = 1;
                Object objL = ze2Var.l(g87.X, dh7Var);
                c71 c71Var = c71.X;
                if (objL == c71Var) {
                    return c71Var;
                }
            }
        }
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x0395  */
    /* JADX WARN: Code duplicated, block: B:176:0x039e  */
    /* JADX WARN: Code duplicated, block: B:232:0x0498  */
    /* JADX WARN: Code duplicated, block: B:248:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:270:0x0551  */
    /* JADX WARN: Code duplicated, block: B:290:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:309:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r5v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) throws Exception {
        pf2 pf2Var;
        rf2 rf2Var;
        ag2 ag2Var;
        bg2 bg2Var;
        cr2 cr2Var;
        to4 to4Var;
        Object next;
        pb3 pb3Var;
        Integer num;
        pb3 pb3Var2;
        en6 en6Var;
        bp6 bp6Var;
        byte b = 0;
        Integer num2 = 0;
        b83Var = null;
        b83 b83Var = null;
        switch (this.X) {
            case 0:
                String str = ((vi0) obj).a;
                dn8 dn8Var = dn8.a;
                if (dh3.f(str, (String) this.Y)) {
                    vi0.b(str);
                    Iterator it = ((we0) this.Z).Y.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        ((ux0) it.next()).V(dn8Var);
                    }
                }
                return dn8Var;
            case 1:
                mk0 mk0Var = (mk0) obj;
                if (!(mk0Var instanceof rk0)) {
                    if (mk0Var instanceof qk0) {
                        ((sn0) ((ea6) this.Y).X).n();
                    } else if (mk0Var instanceof pk0) {
                        ((sn0) ((ea6) this.Y).X).n();
                        ef0 ef0Var = (ef0) this.Z;
                        pk0 pk0Var = (pk0) mk0Var;
                        synchronized (ef0Var.q) {
                            try {
                                if (!ef0Var.c()) {
                                    ai0 ai0Var = pk0Var.i;
                                    if (ai0Var != null) {
                                        ef0Var.u = ai0Var;
                                        int i = ai0Var.a;
                                        if (i == 6 || i == 1 || i == 2) {
                                            ef0Var.s = sh0.l0;
                                            ef0Var.toString();
                                        } else {
                                            ef0Var.s = sh0.m0;
                                            ef0Var.toString();
                                            ai0.a(pk0Var.i.a);
                                        }
                                    } else {
                                        ef0Var.s = sh0.o0;
                                    }
                                    ef0Var.f.m();
                                    ef0Var.g();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    break;
                } else {
                    sn0 sn0Var = (sn0) ((ea6) this.Y).X;
                    yh0 yh0Var = ((rk0) mk0Var).a;
                    synchronized (sn0Var.k) {
                        on0 on0Var = sn0Var.u;
                        if (on0Var != on0.f0 && on0Var != on0.g0) {
                            sn0Var.q = yh0Var;
                            w51.G(sn0Var.i, null, null, new pn0(sn0Var, num2, b), 3);
                        }
                        break;
                    }
                }
                return dn8.a;
            case 2:
                if (q51Var instanceof pf2) {
                    pf2Var = (pf2) q51Var;
                    int i2 = pf2Var.h0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pf2Var.h0 = i2 - Integer.MIN_VALUE;
                    } else {
                        pf2Var = new pf2(this, q51Var);
                    }
                } else {
                    pf2Var = new pf2(this, q51Var);
                }
                Object obj2 = pf2Var.f0;
                c71 c71Var = c71.X;
                int i3 = pf2Var.h0;
                try {
                    if (i3 == 0) {
                        w39.n0(obj2);
                        ze2 ze2Var = (ze2) this.Y;
                        pf2Var.h0 = 1;
                        Object objL = ze2Var.l(obj, pf2Var);
                        this = objL;
                        if (objL == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (i3 != 1) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj2);
                        this = this;
                    }
                    return dn8.a;
                } catch (Throwable th2) {
                    ((ea6) this.Z).X = th2;
                    throw th2;
                }
            case 3:
                dn8 dn8Var2 = dn8.a;
                if (q51Var instanceof rf2) {
                    rf2Var = (rf2) q51Var;
                    int i4 = rf2Var.h0;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        rf2Var.h0 = i4 - Integer.MIN_VALUE;
                    } else {
                        rf2Var = new rf2(this, q51Var);
                    }
                } else {
                    rf2Var = new rf2(this, q51Var);
                }
                Object obj3 = rf2Var.f0;
                c71 c71Var2 = c71.X;
                int i5 = rf2Var.h0;
                if (i5 == 0) {
                    w39.n0(obj3);
                    ca6 ca6Var = (ca6) this.Y;
                    int i6 = ca6Var.X;
                    if (i6 >= 1) {
                        ze2 ze2Var2 = (ze2) this.Z;
                        rf2Var.h0 = 1;
                        if (ze2Var2.l(obj, rf2Var) == c71Var2) {
                            return c71Var2;
                        }
                    } else {
                        ca6Var.X = i6 + 1;
                    }
                } else {
                    if (i5 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj3);
                }
                return dn8Var2;
            case 4:
                if (q51Var instanceof ag2) {
                    ag2Var = (ag2) q51Var;
                    int i7 = ag2Var.g0;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ag2Var.g0 = i7 - Integer.MIN_VALUE;
                    } else {
                        ag2Var = new ag2(this, q51Var);
                    }
                } else {
                    ag2Var = new ag2(this, q51Var);
                }
                Object objX = ag2Var.f0;
                c71 c71Var3 = c71.X;
                int i8 = ag2Var.g0;
                if (i8 == 0) {
                    w39.n0(objX);
                    xq0 xq0Var = (xq0) this.Y;
                    ze2 ze2Var3 = (ze2) this.Z;
                    ag2Var.g0 = 1;
                    objX = xq0Var.x(ze2Var3, obj, ag2Var);
                    if (objX == c71Var3) {
                        return c71Var3;
                    }
                } else {
                    if (i8 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(objX);
                }
                if (((Boolean) objX).booleanValue()) {
                    return dn8.a;
                }
                throw new h(this);
            case 5:
                if (q51Var instanceof bg2) {
                    bg2Var = (bg2) q51Var;
                    int i9 = bg2Var.g0;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        bg2Var.g0 = i9 - Integer.MIN_VALUE;
                    } else {
                        bg2Var = new bg2(this, q51Var);
                    }
                } else {
                    bg2Var = new bg2(this, q51Var);
                }
                Object objK = bg2Var.f0;
                c71 c71Var4 = c71.X;
                int i10 = bg2Var.g0;
                if (i10 == 0) {
                    w39.n0(objK);
                    rn2 rn2Var = (rn2) this.Y;
                    bg2Var.g0 = 1;
                    objK = rn2Var.K(obj, bg2Var);
                    if (objK == c71Var4) {
                        return c71Var4;
                    }
                } else {
                    if (i10 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(objK);
                }
                boolean zBooleanValue = ((Boolean) objK).booleanValue();
                if (zBooleanValue) {
                    ((aa6) this.Z).X = true;
                }
                if (zBooleanValue) {
                    throw new h(this);
                }
                return dn8.a;
            case 6:
                if (q51Var instanceof cr2) {
                    cr2Var = (cr2) q51Var;
                    int i11 = cr2Var.g0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        cr2Var.g0 = i11 - Integer.MIN_VALUE;
                    } else {
                        cr2Var = new cr2(this, q51Var);
                    }
                } else {
                    cr2Var = new cr2(this, q51Var);
                }
                Object obj4 = cr2Var.f0;
                c71 c71Var5 = c71.X;
                int i12 = cr2Var.g0;
                if (i12 == 0) {
                    w39.n0(obj4);
                    ze2 ze2Var4 = (ze2) this.Y;
                    j2 j2VarE0 = mb6.e0(new la2(w27.m0(new hu(((b2) ((cm5) obj)).a(), (byte) 1), new f0((dr2) this.Z, (byte) 14)), true, cl1.j0));
                    cr2Var.g0 = 1;
                    if (ze2Var4.l(j2VarE0, cr2Var) == c71Var5) {
                        return c71Var5;
                    }
                } else {
                    if (i12 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj4);
                }
                return dn8.a;
            case 7:
                vf3 vf3Var = (vf3) obj;
                ArrayList arrayList = (ArrayList) this.Y;
                if (vf3Var instanceof yg2) {
                    arrayList.add(vf3Var);
                } else if (vf3Var instanceof zg2) {
                    arrayList.remove(((zg2) vf3Var).a);
                }
                boolean z = !arrayList.isEmpty();
                wb3 wb3Var = (wb3) this.Z;
                if (z != wb3Var.x0) {
                    wb3Var.x0 = z;
                    wb3Var.b1();
                }
                return dn8.a;
            case 8:
                vf3 vf3Var2 = (vf3) obj;
                qa4 qa4Var = (qa4) this.Z;
                j05 j05Var = (j05) this.Y;
                if ((vf3Var2 instanceof d13) || (vf3Var2 instanceof yg2) || (vf3Var2 instanceof ft5)) {
                    j05Var.a(vf3Var2);
                } else if (vf3Var2 instanceof e13) {
                    j05Var.k(((e13) vf3Var2).a);
                } else if (vf3Var2 instanceof zg2) {
                    j05Var.k(((zg2) vf3Var2).a);
                } else if (vf3Var2 instanceof gt5) {
                    j05Var.k(((gt5) vf3Var2).a);
                } else if (vf3Var2 instanceof et5) {
                    j05Var.k(((et5) vf3Var2).a);
                }
                Object[] objArr = j05Var.a;
                int i13 = j05Var.b;
                int i14 = 0;
                while (b < i13) {
                    vf3 vf3Var3 = (vf3) objArr[b];
                    if (vf3Var3 instanceof d13) {
                        qa4Var.getClass();
                        i14 |= 2;
                    } else if (vf3Var3 instanceof yg2) {
                        qa4Var.getClass();
                        i14 |= 1;
                    } else if (vf3Var3 instanceof ft5) {
                        qa4Var.getClass();
                        i14 |= 4;
                    }
                    b++;
                }
                qa4Var.b.m(i14);
                return dn8.a;
            case 9:
                if (q51Var instanceof to4) {
                    to4Var = (to4) q51Var;
                    int i15 = to4Var.g0;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        to4Var.g0 = i15 - Integer.MIN_VALUE;
                    } else {
                        to4Var = new to4(this, q51Var);
                    }
                } else {
                    to4Var = new to4(this, q51Var);
                }
                Object obj5 = to4Var.f0;
                c71 c71Var6 = c71.X;
                int i16 = to4Var.g0;
                if (i16 == 0) {
                    w39.n0(obj5);
                    ze2 ze2Var5 = (ze2) this.Y;
                    j2 j2Var = (j2) obj;
                    j2Var.getClass();
                    ArrayList arrayList2 = new ArrayList(j2Var.a());
                    ListIterator listIterator = j2Var.listIterator(0);
                    while (listIterator.hasNext()) {
                        ConfigGroupCache configGroupCache = (ConfigGroupCache) listIterator.next();
                        configGroupCache.getClass();
                        arrayList2.add(ConfigGroupCache.a(configGroupCache, configGroupCache.getSubscriptionItem(), zc1.Y(configGroupCache.getConfigs()), false, false, 25));
                    }
                    ak7 ak7Var = ((MainViewModel) this.Z).E;
                    ak7Var.getClass();
                    String string = ak7Var.a.getString("pinSubIdInStorage", null);
                    if (string != null) {
                        if (arrayList2.size() == 1) {
                            arrayList2.set(0, ConfigGroupCache.a((ConfigGroupCache) arrayList2.get(0), null, null, false, true, 15));
                        } else if (arrayList2.size() > 1) {
                            Iterator it2 = wv0.d1(arrayList2).iterator();
                            do {
                                rw1 rw1Var = (rw1) it2;
                                if (rw1Var.Y.hasNext()) {
                                    next = rw1Var.next();
                                    pb3Var2 = (pb3) next;
                                    int i17 = pb3Var2.a;
                                } else {
                                    next = null;
                                }
                                pb3Var = (pb3) next;
                                if (pb3Var != null) {
                                    num = new Integer(pb3Var.a);
                                }
                                if (num2 != 0) {
                                    num2 = num;
                                    int iIntValue = num2.intValue();
                                    ConfigGroupCache configGroupCacheA = ConfigGroupCache.a((ConfigGroupCache) arrayList2.get(iIntValue), null, null, false, true, 15);
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(configGroupCacheA);
                                    arrayList3.addAll(wv0.U0(arrayList2, iIntValue));
                                    arrayList3.addAll(wv0.o0(arrayList2, iIntValue + 1));
                                    arrayList2 = arrayList3;
                                }
                            } while (!dh3.f(((ConfigGroupCache) pb3Var2.b).getSubId(), string));
                            pb3Var = (pb3) next;
                            if (pb3Var != null) {
                                num = new Integer(pb3Var.a);
                            }
                            if (num2 != 0) {
                                num2 = num;
                                int iIntValue2 = num2.intValue();
                                ConfigGroupCache configGroupCacheA2 = ConfigGroupCache.a((ConfigGroupCache) arrayList2.get(iIntValue2), null, null, false, true, 15);
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(configGroupCacheA2);
                                arrayList4.addAll(wv0.U0(arrayList2, iIntValue2));
                                arrayList4.addAll(wv0.o0(arrayList2, iIntValue2 + 1));
                                arrayList2 = arrayList4;
                            }
                        }
                    }
                    num2 = num;
                    j2 j2VarF0 = mb6.f0(arrayList2);
                    to4Var.g0 = 1;
                    if (ze2Var5.l(j2VarF0, to4Var) == c71Var6) {
                        return c71Var6;
                    }
                } else {
                    if (i16 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj5);
                }
                return dn8.a;
            case 10:
                vf3 vf3Var4 = (vf3) obj;
                boolean z2 = vf3Var4 instanceof ht5;
                RippleNode rippleNode = (RippleNode) this.Y;
                if (!z2) {
                    b71 b71Var = (b71) this.Z;
                    wg wgVar = rippleNode.u0;
                    float f = 0.0f;
                    if (wgVar == null) {
                        boolean z3 = rippleNode.r0;
                        a aVar = rippleNode.t0;
                        wgVar = new wg();
                        wgVar.a = z3;
                        wgVar.b = aVar;
                        wgVar.c = z51.b(0.0f);
                        wgVar.d = new ArrayList();
                        z68.W(rippleNode);
                        rippleNode.u0 = wgVar;
                    }
                    ArrayList arrayList5 = (ArrayList) wgVar.d;
                    boolean z4 = vf3Var4 instanceof d13;
                    if (z4) {
                        arrayList5.add(vf3Var4);
                    } else if (vf3Var4 instanceof e13) {
                        arrayList5.remove(((e13) vf3Var4).a);
                    } else if (vf3Var4 instanceof yg2) {
                        arrayList5.add(vf3Var4);
                    } else if (vf3Var4 instanceof zg2) {
                        arrayList5.remove(((zg2) vf3Var4).a);
                    } else if (vf3Var4 instanceof zu1) {
                        arrayList5.add(vf3Var4);
                    } else if (vf3Var4 instanceof av1) {
                        arrayList5.remove(((av1) vf3Var4).a);
                    } else if (vf3Var4 instanceof yu1) {
                        arrayList5.remove(((yu1) vf3Var4).a);
                    }
                    vf3 vf3Var5 = (vf3) wv0.B0(arrayList5);
                    if (!dh3.f((vf3) wgVar.e, vf3Var5)) {
                        if (vf3Var5 != null) {
                            ((a) wgVar.b).invoke();
                            if (z4) {
                                f = 0.08f;
                            } else if (vf3Var4 instanceof yg2) {
                                f = 0.1f;
                            } else if (vf3Var4 instanceof zu1) {
                                f = 0.16f;
                            }
                            sg8 sg8Var = il6.a;
                            if (!(vf3Var5 instanceof d13) && ((vf3Var5 instanceof yg2) || (vf3Var5 instanceof zu1))) {
                                sg8Var = new sg8(45, yx1.d, 2);
                            }
                            w51.G(b71Var, null, null, new rh7(wgVar, f, sg8Var, null), 3);
                        } else {
                            vf3 vf3Var6 = (vf3) wgVar.e;
                            sg8 sg8Var2 = il6.a;
                            if (!(vf3Var6 instanceof d13) && !(vf3Var6 instanceof yg2) && (vf3Var6 instanceof zu1)) {
                                sg8Var2 = new sg8(150, yx1.d, 2);
                            }
                            w51.G(b71Var, null, null, new t17(wgVar, sg8Var2, num2, (byte) 7), 3);
                        }
                        wgVar.e = vf3Var5;
                    }
                } else if (rippleNode.x0) {
                    rippleNode.Y0((ht5) vf3Var4);
                } else {
                    rippleNode.y0.a(vf3Var4);
                }
                return dn8.a;
            case 11:
                if (q51Var instanceof en6) {
                    en6Var = (en6) q51Var;
                    int i18 = en6Var.g0;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        en6Var.g0 = i18 - Integer.MIN_VALUE;
                    } else {
                        en6Var = new en6(this, q51Var);
                    }
                } else {
                    en6Var = new en6(this, q51Var);
                }
                Object obj6 = en6Var.f0;
                c71 c71Var7 = c71.X;
                int i19 = en6Var.g0;
                if (i19 == 0) {
                    w39.n0(obj6);
                    ze2 ze2Var6 = (ze2) this.Y;
                    Object obj7 = ((cm5) obj).get((GeoFileKey) this.Z);
                    en6Var.g0 = 1;
                    if (ze2Var6.l(obj7, en6Var) == c71Var7) {
                        return c71Var7;
                    }
                } else {
                    if (i19 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj6);
                }
                return dn8.a;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ep6 ep6Var = (ep6) this.Z;
                if (q51Var instanceof bp6) {
                    bp6Var = (bp6) q51Var;
                    int i20 = bp6Var.g0;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        bp6Var.g0 = i20 - Integer.MIN_VALUE;
                    } else {
                        bp6Var = new bp6(this, q51Var);
                    }
                } else {
                    bp6Var = new bp6(this, q51Var);
                }
                Object obj8 = bp6Var.f0;
                c71 c71Var8 = c71.X;
                int i21 = bp6Var.g0;
                if (i21 == 0) {
                    w39.n0(obj8);
                    ze2 ze2Var7 = (ze2) this.Y;
                    Map map = (cm5) obj;
                    dm5 dm5Var = dm5.f0;
                    dm5Var.getClass();
                    em5 em5Var = new em5(dm5Var);
                    SubId.Companion.getClass();
                    b83 b83Var2 = (b83) map.get(new SubId(SubId.EMPTY));
                    if (b83Var2 != null && !b83Var2.isEmpty()) {
                        b83Var = b83Var2;
                    }
                    if (b83Var != null) {
                        String str2 = SubId.EMPTY;
                        ep6Var.getClass();
                        tn6 tn6VarG = ep6.g(str2);
                        j2 j2VarF = ep6Var.f(b83Var);
                        if (tn6VarG != null) {
                            em5Var.put(tn6VarG, j2VarF);
                        }
                    }
                    zp4.M(em5Var, w27.m0(new la2(wv0.l0(((b2) map).entrySet()), true, cd5.u0), new zo6(ep6Var, b)));
                    cm5 cm5VarF = em5Var.f();
                    bp6Var.g0 = 1;
                    if (ze2Var7.l(cm5VarF, bp6Var) == c71Var8) {
                        return c71Var8;
                    }
                } else {
                    if (i21 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj8);
                }
                return dn8.a;
            case 13:
                return a(((Number) obj).intValue(), q51Var);
            case 14:
                z85 z85Var = (z85) obj;
                long j = z85Var.a;
                dn8 dn8Var3 = dn8.a;
                a68 a68Var = (a68) this.Y;
                oi oiVar = a68Var.x0;
                if ((((z85) oiVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((z85) oiVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objE = oiVar.e(q51Var, z85Var);
                    return objE == c71.X ? objE : dn8Var3;
                }
                w51.G((b71) this.Z, null, null, new df0(a68Var, j, null, (byte) 2), 3);
                return dn8Var3;
            case 15:
                vf3 vf3Var7 = (vf3) obj;
                ca6 ca6Var2 = (ca6) this.Y;
                if (vf3Var7 instanceof ft5) {
                    ca6Var2.X++;
                } else if ((vf3Var7 instanceof gt5) || (vf3Var7 instanceof et5)) {
                    ca6Var2.X--;
                }
                boolean z5 = ca6Var2.X > 0;
                aa8 aa8Var = (aa8) this.Z;
                if (aa8Var.t0 != z5) {
                    aa8Var.t0 = z5;
                    nr4.E(aa8Var);
                }
                return dn8.a;
            default:
                ((ha5) this.Y).a((l49) this.Z, (x31) obj);
                return dn8.a;
        }
    }
}
