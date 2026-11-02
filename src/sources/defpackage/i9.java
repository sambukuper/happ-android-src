package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i9 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ i9(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:389:0x08f5  */
    private final Object c(Object obj, Object obj2) {
        z64 z64Var;
        ne neVar;
        int iMin;
        int i;
        uz4 uz4Var;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int iA;
        int i7;
        float f;
        ArrayList arrayList;
        int i8;
        int i9;
        List arrayList2;
        i64 i64Var;
        float f2;
        int i10;
        i64 i64Var2;
        float f3;
        int i11;
        boolean z;
        List list;
        Integer numValueOf;
        List list2;
        e74 e74Var;
        wp7 wp7Var;
        int i12;
        uz4 uz4Var2;
        int i13;
        int i14;
        Object obj3;
        int i15;
        int iMax;
        int i16;
        int iC;
        int i17;
        f64 f64Var = (f64) this.Y;
        d74 d74Var = (d74) this.Z;
        wp7 wp7Var2 = (wp7) obj;
        i64 i64Var3 = new i64(f64Var, wp7Var2);
        long j2 = ((q31) obj2).a;
        d74Var.getClass();
        gt gtVar = d74Var.d;
        gg5 gg5Var = d74Var.b;
        j74 j74Var = d74Var.a;
        y05 y05Var = j74Var.v0;
        wg wgVar = j74Var.g0;
        y05Var.getValue();
        boolean z2 = j74Var.Y || wp7Var2.c0();
        sd5 sd5Var = sd5.X;
        os4.j(j2, sd5Var);
        int iX0 = wp7Var2.x0(gg5Var.b(wp7Var2.getLayoutDirection()));
        int iX1 = wp7Var2.x0(gg5Var.c(wp7Var2.getLayoutDirection()));
        int iX2 = wp7Var2.x0(gg5Var.d());
        int iX3 = wp7Var2.x0(gg5Var.a()) + iX2;
        int i18 = iX1 + iX0;
        int i19 = iX3 - iX2;
        long jI = s31.i(-i18, j2, -iX3);
        z64 z64Var2 = (z64) d74Var.c.invoke();
        k44 k44Var = z64Var2.c;
        int iH = q31.h(jI);
        int iG = q31.g(jI);
        k44Var.a.m(iH);
        k44Var.b.m(iG);
        if (gtVar == null) {
            throw ie2.d("null verticalArrangement when isVertical == true");
        }
        int iX4 = wp7Var2.x0(gtVar.a());
        int iC2 = z64Var2.c();
        int iG2 = q31.g(j2) - iX3;
        int i20 = iX2;
        c74 c74Var = new c74(jI, z64Var2, i64Var3, iC2, iX4, d74Var.h, i20, i19, (((long) iX2) & 4294967295L) | (((long) iX0) << 32), d74Var.a);
        z64 z64Var3 = c74Var.b;
        ne neVar2 = z64Var3.d;
        dd7 dd7VarD = yn0.D();
        Integer numValueOf2 = null;
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            int iC3 = j74Var.c();
            int iZ = z68.z(iC3, z64Var2, wgVar.d);
            if (iC3 != iZ) {
                neVar = neVar2;
                ((oh5) wgVar.b).m(iZ);
                j64 j64Var = (j64) wgVar.e;
                z64Var = z64Var3;
                if (iC3 != j64Var.Y) {
                    j64Var.Y = iC3;
                    int i21 = (iC3 / 30) * 30;
                    j64Var.X.setValue(x97.a0(Math.max(i21 - 100, 0), i21 + 130));
                }
            } else {
                z64Var = z64Var3;
                neVar = neVar2;
            }
            int iL = ((oh5) wgVar.c).l();
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            m64 m64Var = j74Var.u0;
            vk1 vk1Var = j74Var.q0;
            k2 k2Var = hi5.c0(m64Var.X).c;
            c15 c15Var = (c15) vk1Var.Y;
            if ((c15Var.Z != 0) || !k2Var.isEmpty()) {
                uz4 uz4Var3 = new uz4();
                if (((c15) vk1Var.Y).Z != 0) {
                    int i22 = c15Var.Z;
                    if (i22 == 0) {
                        em7.g("MutableVector is empty.");
                        return null;
                    }
                    Object[] objArr = c15Var.X;
                    int i23 = ((r54) objArr[0]).a;
                    int i24 = 0;
                    while (i24 < i22) {
                        int i25 = i22;
                        int i26 = ((r54) objArr[i24]).a;
                        if (i26 < i23) {
                            i23 = i26;
                        }
                        i24++;
                        i22 = i25;
                    }
                    if (i23 < 0) {
                        zc3.a("negative minIndex");
                    }
                    int i27 = c15Var.Z;
                    if (i27 == 0) {
                        em7.g("MutableVector is empty.");
                        return null;
                    }
                    Object[] objArr2 = c15Var.X;
                    int i28 = ((r54) objArr2[0]).b;
                    int i29 = 0;
                    while (i29 < i27) {
                        int i30 = i27;
                        int i31 = ((r54) objArr2[i29]).b;
                        if (i31 > i28) {
                            i28 = i31;
                        }
                        i29++;
                        i27 = i30;
                    }
                    i = i23;
                    iMin = Math.min(i28, z64Var2.c() - 1);
                } else {
                    iMin = 0;
                    i = 1;
                }
                int iA2 = k2Var.a();
                int i32 = 0;
                while (i32 < iA2) {
                    k64 k64Var = (k64) k2Var.get(i32);
                    k2 k2Var2 = k2Var;
                    int iZ2 = z68.z(k64Var.c, z64Var2, k64Var.a);
                    if ((i > iZ2 || iZ2 > iMin) && iZ2 >= 0 && iZ2 < z64Var2.c()) {
                        uz4Var3.a(iZ2);
                    }
                    i32++;
                    k2Var = k2Var2;
                }
                if (i <= iMin) {
                    while (true) {
                        uz4Var3.a(i);
                        if (i == iMin) {
                            break;
                        }
                        i++;
                    }
                }
                int i33 = uz4Var3.b;
                if (i33 != 0) {
                    int[] iArr = uz4Var3.a;
                    iArr.getClass();
                    Arrays.sort(iArr, 0, i33);
                }
                uz4Var = uz4Var3;
            } else {
                uz4Var = ef3.a;
                iL = iL;
            }
            float fFloatValue = (wp7Var2.c0() || !z2) ? j74Var.j0 : ((Number) ((qk) j74Var.z0.Z).Y.getValue()).floatValue();
            d64 d64Var = j74Var.p0;
            boolean zC0 = wp7Var2.c0();
            b71 b71Var = d74Var.e;
            y05 y05Var2 = j74Var.y0;
            vt2 vt2Var = d74Var.f;
            we5 we5Var = d74Var.g;
            if (i20 < 0) {
                zc3.a("invalid beforeContentPadding");
            }
            if (r5 < 0) {
                zc3.a("invalid afterContentPadding");
            }
            e02 e02Var = e02.X;
            d02 d02Var = d02.X;
            if (r9 <= 0) {
                int iJ = q31.j(jI);
                int i34 = q31.i(jI);
                d64Var.c(0, iJ, i34, new ArrayList(), neVar, c74Var, zC0, z2, 0, 0, b71Var, vt2Var);
                if (!zC0) {
                    long jA = d64Var.a();
                    if (!pf3.a(jA, 0L)) {
                        iJ = s31.g((int) (jA >> 32), jI);
                        i34 = s31.f((int) (jA & 4294967295L), jI);
                    }
                }
                wp7Var = wp7Var2;
                e74Var = new e74(null, 0, false, 0.0f, wp7Var.g0(s31.g(iJ + i18, j2), s31.f(i34 + iX3, j2), e02Var, new uh3((byte) 5)), 0.0f, false, b71Var, i64Var3, c74Var.d, 0, d02Var, -i20, iG2 + r5, 0, sd5Var, i19, iX4);
            } else {
                if (iZ >= iC2) {
                    i2 = iC2 - 1;
                    i3 = 0;
                } else {
                    i2 = iZ;
                    i3 = iL;
                }
                int iRound = Math.round(fFloatValue);
                int i35 = i3 - iRound;
                if (i2 == 0 && i35 < 0) {
                    iRound += i35;
                    i35 = 0;
                }
                float f4 = fFloatValue;
                kt ktVar = new kt();
                int i36 = i35;
                int i37 = -i20;
                int i38 = i37 + (iX4 < 0 ? iX4 : 0);
                int iA3 = i36 + i38;
                int iMax2 = 0;
                while (true) {
                    j = c74Var.d;
                    if (iA3 >= 0 || i2 <= 0) {
                        break;
                    }
                    y05 y05Var3 = y05Var2;
                    int i39 = i2 - 1;
                    f74 f74VarA = c74Var.a(i39, j);
                    ktVar.add(0, f74VarA);
                    iMax2 = Math.max(iMax2, f74VarA.q);
                    iA3 += f74VarA.a();
                    i2 = i39;
                    y05Var2 = y05Var3;
                }
                y05 y05Var4 = y05Var2;
                if (iA3 < i38) {
                    iRound -= i38 - iA3;
                    iA3 = i38;
                }
                int i40 = iRound;
                int i41 = iA3 - i38;
                int i42 = iG2 + r5;
                int i43 = iMax2;
                int i44 = i42 < 0 ? 0 : i42;
                int i45 = i37;
                int i46 = -i41;
                int iA4 = i41;
                int i47 = i2;
                int i48 = 0;
                boolean z3 = false;
                while (i48 < ktVar.Z) {
                    if (i46 >= i44) {
                        ktVar.b(i48);
                        z3 = true;
                    } else {
                        i47++;
                        int iA5 = ((f74) ktVar.get(i48)).a() + i46;
                        i48++;
                        i46 = iA5;
                    }
                }
                int iMax3 = i43;
                int i49 = i47;
                while (i49 < iC2 && (i46 < i44 || i46 <= 0 || ktVar.isEmpty())) {
                    int i50 = i44;
                    f74 f74VarA2 = c74Var.a(i49, j);
                    int iA6 = f74VarA2.a() + i46;
                    if (iA6 <= i38) {
                        i17 = iA6;
                        if (i49 != iC2 - 1) {
                            iA4 -= f74VarA2.a();
                            z3 = true;
                            i2 = i49 + 1;
                        }
                        i49++;
                        i44 = i50;
                        i46 = i17;
                    } else {
                        i17 = iA6;
                    }
                    iMax3 = Math.max(iMax3, f74VarA2.q);
                    ktVar.addLast(f74VarA2);
                    i49++;
                    i44 = i50;
                    i46 = i17;
                }
                if (i46 < iG2) {
                    int i51 = iG2 - i46;
                    i46 += i51;
                    iA = iA4 - i51;
                    while (iA < i20 && i2 > 0) {
                        int i52 = i51;
                        int i53 = i2 - 1;
                        int i54 = i20;
                        f74 f74VarA3 = c74Var.a(i53, j);
                        i2 = i53;
                        ktVar.add(0, f74VarA3);
                        iMax3 = Math.max(iMax3, f74VarA3.q);
                        iA += f74VarA3.a();
                        i51 = i52;
                        i20 = i54;
                    }
                    i4 = i20;
                    i5 = i40 + i51;
                    if (iA < 0) {
                        i5 += iA;
                        i46 += iA;
                        i6 = i2;
                        iA = 0;
                    } else {
                        i6 = i2;
                    }
                } else {
                    i4 = i20;
                    i5 = i40;
                    i6 = i2;
                    iA = iA4;
                }
                int i55 = iMax3;
                float f5 = (Integer.signum(Math.round(f4)) != Integer.signum(i5) || Math.abs(Math.round(f4)) < Math.abs(i5)) ? f4 : i5;
                float f6 = f4 - f5;
                float f7 = 0.0f;
                if (zC0 && i5 > i40 && f6 <= 0.0f) {
                    f7 = (i5 - i40) + f6;
                }
                float f8 = f7;
                if (iA < 0) {
                    zc3.a("negative currentFirstItemScrollOffset");
                }
                int i56 = -iA;
                f74 f74Var = (f74) ktVar.first();
                if (i4 > 0 || iX4 < 0) {
                    int iA7 = ktVar.a();
                    f74 f74Var2 = f74Var;
                    int i57 = iA;
                    int i58 = 0;
                    while (i58 < iA7) {
                        int i59 = iA7;
                        int iA8 = ((f74) ktVar.get(i58)).a();
                        if (i57 == 0 || iA8 > i57 || i58 == ktVar.a() - 1) {
                            break;
                        }
                        i57 -= iA8;
                        i58++;
                        f74Var2 = (f74) ktVar.get(i58);
                        iA7 = i59;
                    }
                    i7 = i57;
                    f74Var = f74Var2;
                } else {
                    i7 = iA;
                }
                int iMax4 = Math.max(0, i6);
                int i60 = i6 - 1;
                if (iMax4 <= i60) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        f = f8;
                        arrayList.add(c74Var.a(i60, j));
                        if (i60 == iMax4) {
                            break;
                        }
                        i60--;
                        f8 = f;
                    }
                } else {
                    f = f8;
                    arrayList = null;
                }
                int[] iArr2 = uz4Var.a;
                int i61 = uz4Var.b - 1;
                ArrayList arrayList3 = arrayList;
                while (-1 < i61) {
                    int i62 = iArr2[i61];
                    if (i62 < iMax4) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(c74Var.a(i62, j));
                        arrayList3 = arrayList4;
                    }
                    i61--;
                    iArr2 = iArr2;
                }
                List list3 = arrayList3 == null ? d02Var : arrayList3;
                int size = list3.size();
                int iMax5 = i55;
                for (int i63 = 0; i63 < size; i63++) {
                    iMax5 = Math.max(iMax5, ((f74) list3.get(i63)).q);
                }
                int iMin2 = Math.min(((f74) wv0.A0(ktVar)).a, iC2 - 1);
                int i64 = ((f74) wv0.A0(ktVar)).a + 1;
                if (i64 <= iMin2) {
                    List arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i8 = i49;
                        i9 = iMax5;
                        arrayList2 = arrayList5;
                        arrayList2.add(c74Var.a(i64, j));
                        if (i64 == iMin2) {
                            break;
                        }
                        i64++;
                        arrayList5 = arrayList2;
                        iMax5 = i9;
                        i49 = i8;
                    }
                } else {
                    i8 = i49;
                    i9 = iMax5;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((f74) wv0.A0(arrayList2)).a > iMin2) {
                    iMin2 = ((f74) wv0.A0(arrayList2)).a;
                }
                int[] iArr3 = uz4Var.a;
                int i65 = uz4Var.b;
                int i66 = 0;
                while (i66 < i65) {
                    int i67 = i65;
                    int i68 = iArr3[i66];
                    if (i68 > iMin2) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c74Var.a(i68, j));
                    }
                    i66++;
                    i65 = i67;
                }
                if (arrayList2 == null) {
                    arrayList2 = d02Var;
                }
                int size2 = arrayList2.size();
                int iMax6 = i9;
                for (int i69 = 0; i69 < size2; i69++) {
                    iMax6 = Math.max(iMax6, ((f74) arrayList2.get(i69)).q);
                }
                boolean z4 = dh3.f(f74Var, ktVar.first()) && list3.isEmpty() && arrayList2.isEmpty();
                int iG3 = s31.g(iMax6, jI);
                int iF = s31.f(i46, jI);
                boolean z5 = i46 < Math.min(iF, iG2);
                if (z5 && i56 != 0) {
                    zc3.c("non-zero itemsScrollOffset");
                }
                boolean z6 = z4;
                f74 f74Var3 = f74Var;
                ArrayList arrayList6 = new ArrayList(arrayList2.size() + list3.size() + ktVar.a());
                if (z5) {
                    if (!list3.isEmpty() || !arrayList2.isEmpty()) {
                        zc3.a("no extra items");
                    }
                    int iA9 = ktVar.a();
                    int[] iArr4 = new int[iA9];
                    for (int i70 = 0; i70 < iA9; i70++) {
                        iArr4[i70] = ((f74) ktVar.get(i70)).n;
                    }
                    int[] iArr5 = new int[iA9];
                    if (gtVar == null) {
                        throw ie2.d("null verticalArrangement when isVertical == true");
                    }
                    gtVar.e(iF, i64Var3, iArr4, iArr5);
                    kf3 kf3Var = new kf3(0, iA9 - 1, 1);
                    int i71 = kf3Var.Y;
                    int i72 = kf3Var.Z;
                    if ((i72 > 0 && i71 >= 0) || (i72 < 0 && i71 <= 0)) {
                        int i73 = 0;
                        while (true) {
                            int i74 = iArr5[i73];
                            int i75 = i72;
                            f74 f74Var4 = (f74) ktVar.get(i73);
                            f74Var4.d(i74, iG3, iF);
                            arrayList6.add(f74Var4);
                            if (i73 == i71) {
                                break;
                            }
                            i73 += i75;
                            i72 = i75;
                        }
                    }
                    i64Var = i64Var3;
                } else {
                    int size3 = list3.size();
                    int i76 = i56;
                    int i77 = 0;
                    while (i77 < size3) {
                        i64Var = i64Var3;
                        int i78 = size3;
                        f74 f74Var5 = (f74) list3.get(i77);
                        List list4 = list3;
                        int iA10 = i76 - f74Var5.a();
                        f74Var5.d(iA10, iG3, iF);
                        arrayList6.add(f74Var5);
                        i77++;
                        i76 = iA10;
                        size3 = i78;
                        list3 = list4;
                    }
                    i64Var = i64Var3;
                    int iA11 = ktVar.a();
                    int iA12 = i56;
                    int i79 = 0;
                    while (i79 < iA11) {
                        int i80 = iA11;
                        f74 f74Var6 = (f74) ktVar.get(i79);
                        f74Var6.d(iA12, iG3, iF);
                        arrayList6.add(f74Var6);
                        iA12 += f74Var6.a();
                        i79++;
                        iA11 = i80;
                    }
                    int size4 = arrayList2.size();
                    int iA13 = iA12;
                    int i81 = 0;
                    while (i81 < size4) {
                        int i82 = size4;
                        f74 f74Var7 = (f74) arrayList2.get(i81);
                        f74Var7.d(iA13, iG3, iF);
                        arrayList6.add(f74Var7);
                        iA13 += f74Var7.a();
                        i81++;
                        size4 = i82;
                    }
                }
                int i83 = i46;
                d64Var.c((int) f5, iG3, iF, arrayList6, neVar, c74Var, zC0, z2, i7, i83, b71Var, vt2Var);
                if (zC0) {
                    f2 = f5;
                    i10 = i83;
                    i64Var2 = i64Var;
                } else {
                    i64Var2 = i64Var;
                    long jA2 = d64Var.a();
                    f2 = f5;
                    i10 = i83;
                    if (!pf3.a(jA2, 0L)) {
                        iG3 = s31.g(Math.max(iG3, (int) (jA2 >> 32)), jI);
                        int iF2 = s31.f(Math.max(iF, (int) (jA2 & 4294967295L)), jI);
                        if (iF2 != iF) {
                            int size5 = arrayList6.size();
                            for (int i84 = 0; i84 < size5; i84++) {
                                f74 f74Var8 = (f74) arrayList6.get(i84);
                                f74Var8.s = iF2;
                                f74Var8.u = f74Var8.f + iF2;
                            }
                        }
                        iF = iF2;
                    }
                }
                f74 f74Var9 = (f74) (ktVar.isEmpty() ? null : ktVar.Y[ktVar.X]);
                int i85 = f74Var9 != null ? f74Var9.a : 0;
                f74 f74Var10 = (f74) ktVar.h();
                int i86 = f74Var10 != null ? f74Var10.a : 0;
                z64Var.b.getClass();
                uz4 uz4Var4 = ef3.a;
                if (we5Var == null || arrayList6.isEmpty() || (i12 = uz4Var4.b) == 0) {
                    f3 = f2;
                    i11 = i45;
                    z = true;
                    list = d02Var;
                } else {
                    if (i86 - i85 < 0 || i12 == 0) {
                        uz4Var2 = uz4Var4;
                    } else {
                        kf3 kf3VarA0 = x97.a0(0, i12);
                        int i87 = kf3VarA0.X;
                        int i88 = kf3VarA0.Y;
                        if (i87 <= i88) {
                            iC = -1;
                            while (uz4Var4.c(i87) <= i85) {
                                iC = uz4Var4.c(i87);
                                if (i87 == i88) {
                                    break;
                                }
                                i87++;
                            }
                            i16 = -1;
                        } else {
                            i16 = -1;
                            iC = -1;
                        }
                        if (iC == i16) {
                            uz4Var2 = ef3.a;
                        } else {
                            uz4Var2 = new uz4(1);
                            uz4Var2.a(iC);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList(arrayList6.size());
                    int size6 = arrayList6.size();
                    int i89 = 0;
                    while (i89 < size6) {
                        int i90 = size6;
                        Object obj4 = arrayList6.get(i89);
                        int i91 = i89;
                        int i92 = ((f74) obj4).a;
                        float f9 = f2;
                        int[] iArr6 = uz4Var4.a;
                        int i93 = uz4Var4.b;
                        uz4 uz4Var5 = uz4Var4;
                        int i94 = 0;
                        while (i94 < i93) {
                            int i95 = i94;
                            if (iArr6[i95] == i92) {
                                arrayList8.add(obj4);
                                break;
                            }
                            i94 = i95 + 1;
                        }
                        i89 = i91 + 1;
                        size6 = i90;
                        f2 = f9;
                        uz4Var4 = uz4Var5;
                    }
                    f3 = f2;
                    int[] iArr7 = uz4Var2.a;
                    int i96 = uz4Var2.b;
                    int i97 = 0;
                    while (i97 < i96) {
                        int i98 = iArr7[i97];
                        Iterator it = arrayList6.iterator();
                        int i99 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i13 = i96;
                                i14 = -1;
                                break;
                            }
                            i13 = i96;
                            if (((f74) it.next()).a == i98) {
                                i14 = i99;
                                break;
                            }
                            i99++;
                            i96 = i13;
                        }
                        f74 f74VarA4 = i14 == -1 ? c74Var.a(i98, j) : (f74) arrayList6.remove(i14);
                        int iB = z39.B(f74VarA4);
                        long j3 = j;
                        int iB2 = i14 == -1 ? Integer.MIN_VALUE : (int) (f74VarA4.b(0) & 4294967295L);
                        int size7 = arrayList8.size();
                        int i100 = 0;
                        while (true) {
                            if (i100 >= size7) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList8.get(i100);
                            if (((f74) obj3).a != i98) {
                                break;
                            }
                            i100++;
                        }
                        f74 f74Var11 = (f74) obj3;
                        int iB3 = f74Var11 != null ? (int) (f74Var11.b(0) & 4294967295L) : Integer.MIN_VALUE;
                        if (iB2 == Integer.MIN_VALUE) {
                            iMax = i45;
                            i15 = iMax;
                        } else {
                            i15 = i45;
                            iMax = Math.max(i15, iB2);
                        }
                        if (iB3 != Integer.MIN_VALUE) {
                            iMax = Math.min(iMax, iB3 - iB);
                        }
                        f74VarA4.r = true;
                        f74VarA4.d(iMax, iG3, iF);
                        arrayList7.add(f74VarA4);
                        i97++;
                        arrayList8 = arrayList8;
                        iArr7 = iArr7;
                        i45 = i15;
                        i96 = i13;
                        j = j3;
                    }
                    i11 = i45;
                    z = true;
                    list = arrayList7;
                }
                if (z6) {
                    f74 f74Var12 = (f74) wv0.t0(arrayList6);
                    if (f74Var12 != null) {
                        numValueOf = Integer.valueOf(f74Var12.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    f74 f74Var13 = (f74) (ktVar.isEmpty() ? null : ktVar.Y[ktVar.X]);
                    if (f74Var13 != null) {
                        numValueOf = Integer.valueOf(f74Var13.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z6) {
                    f74 f74Var14 = (f74) wv0.B0(arrayList6);
                    if (f74Var14 != null) {
                        numValueOf2 = Integer.valueOf(f74Var14.a);
                    }
                } else {
                    f74 f74Var15 = (f74) ktVar.h();
                    if (f74Var15 != null) {
                        numValueOf2 = Integer.valueOf(f74Var15.a);
                    }
                }
                if (i8 >= iC2 && i10 <= iG2) {
                    z = false;
                }
                yr4 yr4VarG0 = wp7Var2.g0(s31.g(iG3 + i18, j2), s31.f(iF + iX3, j2), e02Var, new kg(y05Var4, arrayList6, list, zC0));
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                if (arrayList6.isEmpty()) {
                    list2 = d02Var;
                } else {
                    ArrayList arrayList9 = new ArrayList(list);
                    int size8 = arrayList6.size();
                    for (int i101 = 0; i101 < size8; i101++) {
                        f74 f74Var16 = (f74) arrayList6.get(i101);
                        int i102 = f74Var16.a;
                        if (iIntValue <= i102 && i102 <= iIntValue2) {
                            arrayList9.add(f74Var16);
                        }
                    }
                    aw0.c0(arrayList9, z39.f0);
                    list2 = arrayList9;
                }
                int size9 = list.size();
                int i103 = 0;
                for (int i104 = 0; i104 < size9; i104++) {
                    i103 += ((f74) list.get(i104)).n;
                }
                wp7Var = wp7Var2;
                e74Var = new e74(f74Var3, i7, z, f3, yr4VarG0, f, z3, b71Var, i64Var2, c74Var.d, i103, list2, i11, i42, iC2, sd5Var, r5, iX4);
            }
            j74Var.a(e74Var, wp7Var.c0(), false);
            return e74Var;
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        boolean z;
        lp2 lp2Var;
        byte b = this.X;
        byte b2 = 10;
        be beVar = zz0.a;
        byte b3 = 1;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((ia) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((ba6) obj3).X = fFloatValue;
                return dn8Var;
            case 1:
                vc vcVar = (vc) obj3;
                int iIntValue = ((Integer) obj).intValue();
                y07 y07Var = (y07) obj2;
                if (!((z07) obj4).b.b(y07Var.f)) {
                    vcVar.h(iIntValue, y07Var);
                    vcVar.i0.b(dn8Var);
                }
                return dn8Var;
            case 2:
                ((Integer) obj2).getClass();
                jm4.e((kx4) obj4, (rn2) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
            case 3:
                ((Integer) obj2).getClass();
                ((oy1) obj4).j((zy0) obj3, (lp2) obj, w79.P(7));
                return dn8Var;
            case 4:
                ((Integer) obj2).getClass();
                ((i51) obj4).a((h51) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
            case 5:
                ((Integer) obj2).getClass();
                ((de1) obj4).a((lr) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
            case 6:
                ((Integer) obj2).getClass();
                ((vf1) obj4).a((ma7) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
            case 7:
                h38 h38Var = (h38) obj4;
                h30 h30Var = (h30) obj3;
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF = lp2Var2.f(h38Var);
                    Object objK = lp2Var2.K();
                    if (zF || objK == beVar) {
                        objK = rd7.b(new ub(0, h38Var, h38.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 1));
                        lp2Var2.g0(objK);
                    }
                    ng1.a(h30Var, (g38) ((lh7) objK).getValue(), lp2Var2, 0);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 8:
                ((Integer) obj2).getClass();
                ng1.a((h30) obj4, (g38) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
            case 9:
                p91 p91Var = (p91) obj4;
                bc7 bc7Var = (bc7) obj3;
                int iIntValue3 = ((Integer) obj).intValue();
                if (obj2 instanceof jz0) {
                    ((c15) p91Var.f).b((jz0) obj2);
                } else if (!(obj2 instanceof ok6)) {
                    if (obj2 instanceof pp2) {
                        gv3.S(bc7Var, iIntValue3, obj2);
                        p91Var.f((pp2) obj2);
                    } else if (obj2 instanceof j86) {
                        gv3.S(bc7Var, iIntValue3, obj2);
                        ((j86) obj2).c();
                    }
                }
                return dn8Var;
            case 10:
                ((Integer) obj2).getClass();
                gr2.e((StateDownloadFileV2) obj4, (kx4) obj3, (lp2) obj, w79.P(49));
                return dn8Var;
            case 11:
                ((Integer) obj2).getClass();
                gr2.d((StateDownloadFileV2.Loading) obj4, (kx4) obj3, (lp2) obj, w79.P(49));
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                dn2 dn2Var = (dn2) obj4;
                Activity activity = (Activity) obj3;
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (lp2Var3.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF2 = lp2Var3.f(dn2Var) | lp2Var3.h(activity);
                    Object objK2 = lp2Var3.K();
                    if (zF2 || objK2 == beVar) {
                        objK2 = new p5(dn2Var, activity, (byte) 26);
                        lp2Var3.g0(objK2);
                    }
                    w45.c((dn2) objK2, null, false, null, null, null, z39.Y, lp2Var3, 1572864, 62);
                } else {
                    lp2Var3.Q();
                }
                return dn8Var;
            case 13:
                g73 g73Var = (g73) obj4;
                mw2 mw2Var = (mw2) obj3;
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (lp2Var4.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    os4.a(g73Var, null, mw2Var.a, ((dp) lp2Var4.j(ep.z)).h.a, lp2Var4, 0, 2);
                } else {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 14:
                ((Integer) obj2).getClass();
                yn0.g((ky2) obj4, (kx4) obj3, (lp2) obj, w79.P(7));
                return dn8Var;
            case 15:
                ((Integer) obj2).getClass();
                z91.e((y68) obj4, (kx4) obj3, (lp2) obj, w79.P(49));
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                t34 t34Var = (t34) obj4;
                rn2 rn2Var = (rn2) obj3;
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (lp2Var5.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Boolean bool = (Boolean) t34Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    lp2Var5.Y(bool);
                    boolean zG = lp2Var5.g(zBooleanValue);
                    if (zBooleanValue) {
                        rn2Var.K(lp2Var5, 0);
                    } else {
                        if (lp2Var5.l != 0) {
                            d01.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!lp2Var5.S) {
                            if (zG) {
                                xb7 xb7Var = lp2Var5.G;
                                int i = xb7Var.g;
                                int i2 = xb7Var.h;
                                a01 a01Var = lp2Var5.M;
                                a01Var.getClass();
                                a01Var.d(false);
                                a01Var.b.i0.b0(qb5.d);
                                gv3.T(i, i2, lp2Var5.s);
                                lp2Var5.G.t();
                            } else {
                                lp2Var5.P();
                            }
                        }
                    }
                    if (lp2Var5.y && lp2Var5.G.i == lp2Var5.z) {
                        lp2Var5.z = -1;
                        z = false;
                        lp2Var5.y = false;
                    } else {
                        z = false;
                    }
                    lp2Var5.p(z);
                } else {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 17:
                f64 f64Var = (f64) obj4;
                e64 e64Var = (e64) obj3;
                Object obj5 = e64Var.a;
                lp2 lp2Var6 = (lp2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (lp2Var6.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    z64 z64Var = (z64) f64Var.b.invoke();
                    int iE = e64Var.c;
                    if ((iE >= z64Var.c() || !z64Var.d(iE).equals(obj5)) && (iE = z64Var.d.e(obj5)) != -1) {
                        e64Var.c = iE;
                    }
                    if (iE != -1) {
                        lp2Var6.W(-1664741271);
                        wl7.k(z64Var, f64Var.a, iE, obj5, lp2Var6, 0);
                        lp2Var = lp2Var6;
                        lp2Var.p(false);
                    } else {
                        lp2Var = lp2Var6;
                        lp2Var.W(-1664505826);
                        lp2Var.p(false);
                    }
                    boolean zH = lp2Var.h(e64Var);
                    Object objK3 = lp2Var.K();
                    if (zH || objK3 == beVar) {
                        objK3 = new vj2(e64Var, b2);
                        lp2Var.g0(objK3);
                    }
                    u70.a(obj5, (gn2) objK3, lp2Var);
                } else {
                    lp2Var6.Q();
                }
                return dn8Var;
            case 18:
                return c(obj, obj2);
            case 19:
                zy0 zy0Var = (zy0) obj4;
                o74 o74Var = (o74) obj3;
                lp2 lp2Var7 = (lp2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (lp2Var7.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    zy0Var.x(o74Var, lp2Var7, 0);
                } else {
                    lp2Var7.Q();
                }
                return dn8Var;
            case 20:
                ((Integer) obj2).getClass();
                x97.b((th4) obj4, (kx4) obj3, (lp2) obj, w79.P(57));
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                lg4 lg4Var = (lg4) obj4;
                pv3 pv3Var = (pv3) obj3;
                lp2 lp2Var8 = (lp2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (lp2Var8.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    u15.b(lg4Var, (gn2) pv3Var, ch3.u(b.a), lp2Var8, 384);
                } else {
                    lp2Var8.Q();
                }
                return dn8Var;
            case 22:
                ((Integer) obj2).getClass();
                wl7.f((ci4) obj4, (kx4) obj3, (lp2) obj, w79.P(57));
                return dn8Var;
            case 23:
                i55 i55Var = (i55) obj4;
                e55 e55Var = (e55) obj3;
                sm0 sm0Var = (sm0) obj;
                xt2 xt2Var = (xt2) obj2;
                LayoutNode layoutNode = i55Var.w0;
                if (layoutNode.L()) {
                    i55Var.R0 = sm0Var;
                    i55Var.Q0 = xt2Var;
                    q34.a(layoutNode).getSnapshotObserver().a.c(i55Var, i55.Y0, e55Var);
                    i55Var.U0 = false;
                } else {
                    i55Var.U0 = true;
                }
                return dn8Var;
            case 24:
                ((Integer) obj2).getClass();
                ((de5) obj4).j((zy0) obj3, (lp2) obj, w79.P(7));
                return dn8Var;
            case 25:
                dn2 dn2Var2 = (dn2) obj4;
                dn2 dn2Var3 = (dn2) obj3;
                lp2 lp2Var9 = (lp2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (lp2Var9.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var9, 54);
                    int iHashCode = Long.hashCode(lp2Var9.T);
                    kl5 kl5VarL = lp2Var9.l();
                    kx4 kx4VarQ = w45.Q(lp2Var9, hx4.X);
                    uz0.j.getClass();
                    lp2Var9.Z();
                    if (lp2Var9.S) {
                        lp2Var9.k();
                    } else {
                        lp2Var9.j0();
                    }
                    pn7.m(pz2.B0, lp2Var9, wq6VarA);
                    pn7.m(pz2.A0, lp2Var9, kl5VarL);
                    pn7.m(pz2.C0, lp2Var9, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var9);
                    pn7.m(pz2.z0, lp2Var9, kx4VarQ);
                    String strJ0 = vj8.j0(y46.no, lp2Var9);
                    ox1 ox1Var = es.a;
                    o88 o88Var = ((ds) lp2Var9.j(ox1Var)).c;
                    ox1 ox1Var2 = ep.z;
                    long j = ((dp) lp2Var9.j(ox1Var2)).c.a;
                    dj2 dj2Var = dj2.f0;
                    z51.g(strJ0, null, false, o88.a(o88Var, j, 0L, dj2Var, null, 0L, 0L, null, 16777210), 0, 0, 1, 0, false, null, null, dn2Var2, lp2Var9, 1572864, 4022);
                    String strJ1 = vj8.j0(y46.yes, lp2Var9);
                    o88 o88VarA = o88.a(((ds) lp2Var9.j(ox1Var)).c, ((dp) lp2Var9.j(ox1Var2)).a, 0L, dj2Var, null, 0L, 0L, null, 16777210);
                    boolean zF3 = lp2Var9.f(dn2Var3) | lp2Var9.f(dn2Var2);
                    Object objK4 = lp2Var9.K();
                    if (zF3 || objK4 == beVar) {
                        objK4 = new a23((Object) dn2Var3, (Object) dn2Var2, (byte) 13);
                        lp2Var9.g0(objK4);
                    }
                    z51.g(strJ1, null, false, o88VarA, 0, 0, 1, 0, false, null, null, (dn2) objK4, lp2Var9, 1572864, 4022);
                    lp2Var9.p(true);
                } else {
                    lp2Var9.Q();
                }
                return dn8Var;
            case 26:
                y68 y68Var = (y68) obj4;
                y05 y05Var = (y05) obj3;
                lp2 lp2Var10 = (lp2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (lp2Var10.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    FillElement fillElement = b.a;
                    tw0 tw0VarA = rw0.a(new ft(4.0f, new bt()), pz2.q0, lp2Var10, 6);
                    int iHashCode2 = Long.hashCode(lp2Var10.T);
                    kl5 kl5VarL2 = lp2Var10.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var10, fillElement);
                    uz0.j.getClass();
                    lp2Var10.Z();
                    if (lp2Var10.S) {
                        lp2Var10.k();
                    } else {
                        lp2Var10.j0();
                    }
                    pn7.m(pz2.B0, lp2Var10, tw0VarA);
                    pn7.m(pz2.A0, lp2Var10, kl5VarL2);
                    pn7.m(pz2.C0, lp2Var10, Integer.valueOf(iHashCode2));
                    pn7.l(lp2Var10);
                    pn7.m(pz2.z0, lp2Var10, kx4VarQ2);
                    boolean zBooleanValue2 = ((Boolean) y05Var.getValue()).booleanValue();
                    String strJ2 = vj8.j0(y46.routing_settings_title_name, lp2Var10);
                    ox1 ox1Var3 = es.a;
                    o88 o88Var2 = ((ds) lp2Var10.j(ox1Var3)).c;
                    ox1 ox1Var4 = ep.z;
                    o88 o88VarA2 = o88.a(o88Var2, ((dp) lp2Var10.j(ox1Var4)).c.b, 0L, null, null, 0L, 0L, null, 16777214);
                    ha2 ha2Var = new ha2(new rr4(128));
                    Object objK5 = lp2Var10.K();
                    if (objK5 == beVar) {
                        objK5 = new gh(y05Var, b2);
                        lp2Var10.g0(objK5);
                    }
                    x97.a(strJ2, (gn2) objK5, fillElement, y68Var, o88VarA2, zBooleanValue2, null, null, ha2Var, lp2Var10, 432);
                    zc1.g(y68Var.c().Z.length() + "/128", fillElement.y(new r03(pz2.s0)), o88.a(((ds) lp2Var10.j(ox1Var3)).d, ((dp) lp2Var10.j(ox1Var4)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 6, 0, 1, 0, false, null, lp2Var10, 196608, 464);
                    lp2Var10.p(true);
                } else {
                    lp2Var10.Q();
                }
                return dn8Var;
            case 27:
                sn6 sn6Var = (sn6) obj4;
                gn2 gn2Var = (gn2) obj3;
                lp2 lp2Var11 = (lp2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (lp2Var11.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    FillElement fillElement2 = b.a;
                    String strJ3 = vj8.j0(y46.settings_profile_use_custom_ua_dropdown, lp2Var11);
                    int i3 = sn6Var.j;
                    lp2Var11.W(-729906085);
                    String[] stringArray = ((Resources) lp2Var11.j(pc.c)).getStringArray(m26.settings_profile_custom_ua);
                    qm5 qm5VarC = ec7.Y.c();
                    int length = stringArray.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        String str = stringArray[i4];
                        int i6 = i5 + 1;
                        boolean zF4 = lp2Var11.f(gn2Var) | lp2Var11.d(i5);
                        Object objK6 = lp2Var11.K();
                        if (zF4 || objK6 == beVar) {
                            objK6 = new lx2(gn2Var, i5, b3);
                            lp2Var11.g0(objK6);
                        }
                        qm5VarC.add(new mw2(str, null, (dn2) objK6));
                        i4++;
                        i5 = i6;
                        b3 = b3;
                    }
                    j2 j2VarC = qm5VarC.c();
                    lp2Var11.p(false);
                    ys0.g(strJ3, j2VarC, fillElement2, i3, null, lp2Var11, 384, 48);
                } else {
                    lp2Var11.Q();
                }
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((Integer) obj2).getClass();
                z51.i((vo6) obj4, (kx4) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
            default:
                ((Integer) obj2).getClass();
                g33.d((tn6) obj4, (kx4) obj3, (lp2) obj, w79.P(1));
                return dn8Var;
        }
    }

    public /* synthetic */ i9(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }
}
