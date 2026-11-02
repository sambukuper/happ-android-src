package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mx7 {
    public final s18 A;
    public final o8 B;
    public final l03 C;
    public final jj0 a;
    public final w02 b;
    public final m82 c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public nz v;
    public final ArrayList w;
    public final vk7 x;
    public final wp1 y;
    public final sr4 z;

    public mx7(Context context, jj0 jj0Var, w02 w02Var, m82 m82Var) {
        qx7 qx7Var = qx7.g0;
        context.getClass();
        jj0Var.getClass();
        w02Var.getClass();
        this.a = jj0Var;
        this.b = w02Var;
        this.c = m82Var;
        lf0 lf0Var = (lf0) jj0Var;
        String str = lf0Var.X;
        this.d = str;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) lf0Var.c(key);
        int iIntValue = num != null ? num.intValue() : 2;
        this.e = iIntValue;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.h = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.i = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.j = arrayList5;
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        this.m = arrayList6;
        this.n = new ArrayList();
        jj0.h.getClass();
        boolean zB = ij0.b(jj0Var);
        this.t = zB;
        this.w = new ArrayList();
        this.x = j();
        i26 i26Var = um1.a;
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) um1.a().b(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.y = wp1.g.i(context);
        this.z = new sr4((byte) 1);
        this.A = new s18((byte) 0);
        o8 o8Var = new o8(jj0Var);
        this.B = o8Var;
        this.C = new l03(jj0Var);
        CameraCharacteristics.Key key2 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key2.getClass();
        int[] iArr = (int[]) lf0Var.c(key2);
        if (iArr != null) {
            this.o = eu.a0(iArr, 3);
            this.p = eu.a0(iArr, 6);
            this.s = eu.a0(iArr, 16);
            this.u = eu.a0(iArr, 1);
        }
        boolean z = this.o;
        boolean z2 = this.p;
        vz7 vz7Var = xu2.a;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        nx7 nx7Var = new nx7();
        jl7 jl7Var = rx7.e;
        qx7 qx7Var2 = qx7.X;
        ox7 ox7Var = ox7.MAXIMUM;
        jl7 jl7Var2 = rx7.e;
        nx7Var.a(we5.f(qx7Var2, ox7Var, jl7Var2));
        arrayList8.add(nx7Var);
        nx7 nx7Var2 = new nx7();
        qx7 qx7Var3 = qx7.Z;
        nx7Var2.a(we5.f(qx7Var3, ox7Var, jl7Var2));
        arrayList8.add(nx7Var2);
        nx7 nx7Var3 = new nx7();
        qx7 qx7Var4 = qx7.Y;
        nx7Var3.a(we5.f(qx7Var4, ox7Var, jl7Var2));
        arrayList8.add(nx7Var3);
        nx7 nx7Var4 = new nx7();
        ox7 ox7Var2 = ox7.PREVIEW;
        ie2.o(nx7Var4, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var3, ox7Var, jl7Var2);
        nx7 nx7VarE = ie2.e(arrayList8, nx7Var4);
        ie2.o(nx7VarE, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var3, ox7Var, jl7Var2);
        nx7 nx7VarE2 = ie2.e(arrayList8, nx7VarE);
        ie2.o(nx7VarE2, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var2, jl7Var2);
        nx7 nx7VarE3 = ie2.e(arrayList8, nx7VarE2);
        ie2.o(nx7VarE3, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var2, jl7Var2);
        nx7 nx7VarE4 = ie2.e(arrayList8, nx7VarE3);
        ie2.o(nx7VarE4, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var2, jl7Var2);
        nx7VarE4.a(we5.f(qx7Var3, ox7Var, jl7Var2));
        arrayList8.add(nx7VarE4);
        arrayList7.addAll(arrayList8);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3 || iIntValue == 4) {
            ArrayList arrayList9 = new ArrayList();
            nx7 nx7Var5 = new nx7();
            nx7Var5.a(we5.f(qx7Var2, ox7Var2, jl7Var2));
            ox7 ox7Var3 = ox7.RECORD;
            nx7Var5.a(we5.f(qx7Var2, ox7Var3, jl7Var2));
            arrayList9.add(nx7Var5);
            nx7 nx7Var6 = new nx7();
            ie2.o(nx7Var6, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var3, jl7Var2);
            nx7 nx7VarE5 = ie2.e(arrayList9, nx7Var6);
            ie2.o(nx7VarE5, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var4, ox7Var3, jl7Var2);
            nx7 nx7VarE6 = ie2.e(arrayList9, nx7VarE5);
            ie2.o(nx7VarE6, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var3, jl7Var2);
            nx7VarE6.a(we5.f(qx7Var3, ox7Var3, jl7Var2));
            arrayList9.add(nx7VarE6);
            nx7 nx7Var7 = new nx7();
            ie2.o(nx7Var7, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var3, jl7Var2);
            nx7Var7.a(we5.f(qx7Var3, ox7Var3, jl7Var2));
            arrayList9.add(nx7Var7);
            nx7 nx7Var8 = new nx7();
            ie2.o(nx7Var8, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var4, ox7Var2, jl7Var2);
            nx7Var8.a(we5.f(qx7Var3, ox7Var, jl7Var2));
            arrayList9.add(nx7Var8);
            arrayList7.addAll(arrayList9);
        }
        if (iIntValue == 1 || iIntValue == 3) {
            ArrayList arrayList10 = new ArrayList();
            nx7 nx7Var9 = new nx7();
            ie2.o(nx7Var9, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var, jl7Var2);
            nx7 nx7VarE7 = ie2.e(arrayList10, nx7Var9);
            ie2.o(nx7VarE7, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var, jl7Var2);
            nx7 nx7VarE8 = ie2.e(arrayList10, nx7VarE7);
            ie2.o(nx7VarE8, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var4, ox7Var, jl7Var2);
            nx7 nx7VarE9 = ie2.e(arrayList10, nx7VarE8);
            ie2.o(nx7VarE9, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var2, jl7Var2);
            nx7VarE9.a(we5.f(qx7Var3, ox7Var, jl7Var2));
            arrayList10.add(nx7VarE9);
            nx7 nx7Var10 = new nx7();
            ox7 ox7Var4 = ox7.VGA;
            ie2.o(nx7Var10, we5.f(qx7Var4, ox7Var4, jl7Var2), qx7Var2, ox7Var2, jl7Var2);
            nx7Var10.a(we5.f(qx7Var4, ox7Var, jl7Var2));
            arrayList10.add(nx7Var10);
            nx7 nx7Var11 = new nx7();
            ie2.o(nx7Var11, we5.f(qx7Var4, ox7Var4, jl7Var2), qx7Var4, ox7Var2, jl7Var2);
            nx7Var11.a(we5.f(qx7Var4, ox7Var, jl7Var2));
            arrayList10.add(nx7Var11);
            arrayList7.addAll(arrayList10);
        }
        if (z) {
            ArrayList arrayList11 = new ArrayList();
            nx7 nx7Var12 = new nx7();
            nx7Var12.a(we5.f(qx7Var, ox7Var, jl7Var2));
            arrayList11.add(nx7Var12);
            nx7 nx7Var13 = new nx7();
            ie2.o(nx7Var13, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var, ox7Var, jl7Var2);
            nx7 nx7VarE10 = ie2.e(arrayList11, nx7Var13);
            ie2.o(nx7VarE10, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var, ox7Var, jl7Var2);
            nx7 nx7VarE11 = ie2.e(arrayList11, nx7VarE10);
            ie2.o(nx7VarE11, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var2, jl7Var2);
            nx7VarE11.a(we5.f(qx7Var, ox7Var, jl7Var2));
            arrayList11.add(nx7VarE11);
            nx7 nx7Var14 = new nx7();
            ie2.o(nx7Var14, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var2, jl7Var2);
            nx7Var14.a(we5.f(qx7Var, ox7Var, jl7Var2));
            arrayList11.add(nx7Var14);
            nx7 nx7Var15 = new nx7();
            ie2.o(nx7Var15, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var4, ox7Var2, jl7Var2);
            nx7Var15.a(we5.f(qx7Var, ox7Var, jl7Var2));
            arrayList11.add(nx7Var15);
            nx7 nx7Var16 = new nx7();
            ie2.o(nx7Var16, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var3, ox7Var, jl7Var2);
            nx7Var16.a(we5.f(qx7Var, ox7Var, jl7Var2));
            arrayList11.add(nx7Var16);
            nx7 nx7Var17 = new nx7();
            ie2.o(nx7Var17, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var3, ox7Var, jl7Var2);
            nx7Var17.a(we5.f(qx7Var, ox7Var, jl7Var2));
            arrayList11.add(nx7Var17);
            arrayList7.addAll(arrayList11);
        }
        if (z2 && iIntValue == 0) {
            ArrayList arrayList12 = new ArrayList();
            nx7 nx7Var18 = new nx7();
            ie2.o(nx7Var18, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var, jl7Var2);
            nx7 nx7VarE12 = ie2.e(arrayList12, nx7Var18);
            ie2.o(nx7VarE12, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var4, ox7Var, jl7Var2);
            nx7 nx7VarE13 = ie2.e(arrayList12, nx7VarE12);
            ie2.o(nx7VarE13, we5.f(qx7Var4, ox7Var2, jl7Var2), qx7Var4, ox7Var, jl7Var2);
            arrayList12.add(nx7VarE13);
            arrayList7.addAll(arrayList12);
        }
        if (iIntValue == 3) {
            ArrayList arrayList13 = new ArrayList();
            nx7 nx7Var19 = new nx7();
            nx7Var19.a(we5.f(qx7Var2, ox7Var2, jl7Var2));
            ox7 ox7Var5 = ox7.VGA;
            pc6.u(qx7Var2, ox7Var5, nx7Var19, qx7Var4, ox7Var);
            nx7Var19.a(we5.f(qx7Var, ox7Var, rx7.e));
            arrayList13.add(nx7Var19);
            nx7 nx7Var20 = new nx7();
            pc6.u(qx7Var2, ox7Var2, nx7Var20, qx7Var2, ox7Var5);
            pc6.u(qx7Var3, ox7Var, nx7Var20, qx7Var, ox7Var);
            arrayList13.add(nx7Var20);
            arrayList7.addAll(arrayList13);
        }
        arrayList2.addAll(arrayList7);
        d02 d02Var = d02.X;
        str.getClass();
        List listK = d02Var;
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            nx7 nx7Var21 = ExtraSupportedSurfaceCombinationsQuirk.a;
            String str2 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                ArrayList arrayList14 = new ArrayList();
                listK = arrayList14;
                if (dh3.f(str, "1")) {
                    arrayList14.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                    listK = arrayList14;
                }
            } else if (wl7.W() || wl7.X()) {
                listK = d02Var;
                listK = i21.K(ExtraSupportedSurfaceCombinationsQuirk.b);
            }
        }
        listK = d02Var;
        arrayList2.addAll(listK);
        if (this.s) {
            ArrayList arrayList15 = new ArrayList();
            nx7 nx7Var22 = new nx7();
            ox7 ox7Var6 = ox7.ULTRA_MAXIMUM;
            pc6.u(qx7Var4, ox7Var6, nx7Var22, qx7Var2, ox7Var2);
            ox7 ox7Var7 = ox7.RECORD;
            nx7Var22.a(we5.f(qx7Var2, ox7Var7, rx7.e));
            arrayList15.add(nx7Var22);
            nx7 nx7Var23 = new nx7();
            pc6.u(qx7Var3, ox7Var6, nx7Var23, qx7Var2, ox7Var2);
            nx7Var23.a(we5.f(qx7Var2, ox7Var7, rx7.e));
            arrayList15.add(nx7Var23);
            nx7 nx7Var24 = new nx7();
            pc6.u(qx7Var, ox7Var6, nx7Var24, qx7Var2, ox7Var2);
            nx7Var24.a(we5.f(qx7Var2, ox7Var7, rx7.e));
            arrayList15.add(nx7Var24);
            nx7 nx7Var25 = new nx7();
            pc6.u(qx7Var4, ox7Var6, nx7Var25, qx7Var2, ox7Var2);
            nx7Var25.a(we5.f(qx7Var3, ox7Var, rx7.e));
            arrayList15.add(nx7Var25);
            nx7 nx7Var26 = new nx7();
            pc6.u(qx7Var3, ox7Var6, nx7Var26, qx7Var2, ox7Var2);
            nx7Var26.a(we5.f(qx7Var3, ox7Var, rx7.e));
            arrayList15.add(nx7Var26);
            nx7 nx7Var27 = new nx7();
            pc6.u(qx7Var, ox7Var6, nx7Var27, qx7Var2, ox7Var2);
            nx7Var27.a(we5.f(qx7Var3, ox7Var, rx7.e));
            arrayList15.add(nx7Var27);
            nx7 nx7Var28 = new nx7();
            pc6.u(qx7Var4, ox7Var6, nx7Var28, qx7Var2, ox7Var2);
            nx7Var28.a(we5.f(qx7Var4, ox7Var, rx7.e));
            arrayList15.add(nx7Var28);
            nx7 nx7Var29 = new nx7();
            pc6.u(qx7Var3, ox7Var6, nx7Var29, qx7Var2, ox7Var2);
            nx7Var29.a(we5.f(qx7Var4, ox7Var, rx7.e));
            arrayList15.add(nx7Var29);
            nx7 nx7Var30 = new nx7();
            pc6.u(qx7Var, ox7Var6, nx7Var30, qx7Var2, ox7Var2);
            nx7Var30.a(we5.f(qx7Var4, ox7Var, rx7.e));
            arrayList15.add(nx7Var30);
            nx7 nx7Var31 = new nx7();
            pc6.u(qx7Var4, ox7Var6, nx7Var31, qx7Var2, ox7Var2);
            nx7Var31.a(we5.f(qx7Var, ox7Var, rx7.e));
            arrayList15.add(nx7Var31);
            nx7 nx7Var32 = new nx7();
            pc6.u(qx7Var3, ox7Var6, nx7Var32, qx7Var2, ox7Var2);
            nx7Var32.a(we5.f(qx7Var, ox7Var, rx7.e));
            arrayList15.add(nx7Var32);
            nx7 nx7Var33 = new nx7();
            pc6.u(qx7Var, ox7Var6, nx7Var33, qx7Var2, ox7Var2);
            nx7Var33.a(we5.f(qx7Var, ox7Var, rx7.e));
            arrayList15.add(nx7Var33);
            arrayList4.addAll(arrayList15);
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.q = zHasSystemFeature;
        if (zHasSystemFeature) {
            ArrayList arrayList16 = new ArrayList();
            nx7 nx7Var34 = new nx7();
            ox7 ox7Var8 = ox7.S1440P_4_3;
            nx7Var34.a(we5.f(qx7Var4, ox7Var8, rx7.e));
            arrayList16.add(nx7Var34);
            nx7 nx7Var35 = new nx7();
            nx7Var35.a(we5.f(qx7Var2, ox7Var8, rx7.e));
            arrayList16.add(nx7Var35);
            nx7 nx7Var36 = new nx7();
            nx7Var36.a(we5.f(qx7Var3, ox7Var8, rx7.e));
            arrayList16.add(nx7Var36);
            nx7 nx7Var37 = new nx7();
            ox7 ox7Var9 = ox7.S720P_16_9;
            pc6.u(qx7Var4, ox7Var9, nx7Var37, qx7Var3, ox7Var8);
            nx7 nx7VarE14 = ie2.e(arrayList16, nx7Var37);
            pc6.u(qx7Var2, ox7Var9, nx7VarE14, qx7Var3, ox7Var8);
            nx7 nx7VarE15 = ie2.e(arrayList16, nx7VarE14);
            pc6.u(qx7Var4, ox7Var9, nx7VarE15, qx7Var4, ox7Var8);
            nx7 nx7VarE16 = ie2.e(arrayList16, nx7VarE15);
            pc6.u(qx7Var4, ox7Var9, nx7VarE16, qx7Var2, ox7Var8);
            nx7 nx7VarE17 = ie2.e(arrayList16, nx7VarE16);
            pc6.u(qx7Var2, ox7Var9, nx7VarE17, qx7Var4, ox7Var8);
            nx7 nx7VarE18 = ie2.e(arrayList16, nx7VarE17);
            pc6.u(qx7Var2, ox7Var9, nx7VarE18, qx7Var2, ox7Var8);
            arrayList16.add(nx7VarE18);
            arrayList.addAll(arrayList16);
        }
        if (o8Var.Y) {
            nx7 nx7Var38 = new nx7();
            nx7Var38.a(we5.f(qx7Var2, ox7Var, rx7.e));
            nx7 nx7Var39 = new nx7();
            nx7Var39.a(we5.f(qx7Var4, ox7Var, rx7.e));
            nx7 nx7Var40 = new nx7();
            nx7Var40.a(we5.f(qx7Var2, ox7Var2, rx7.e));
            nx7Var40.a(we5.f(qx7Var3, ox7Var, rx7.e));
            nx7 nx7Var41 = new nx7();
            nx7Var41.a(we5.f(qx7Var2, ox7Var2, rx7.e));
            nx7Var41.a(we5.f(qx7Var4, ox7Var, rx7.e));
            nx7 nx7Var42 = new nx7();
            nx7Var42.a(we5.f(qx7Var4, ox7Var2, rx7.e));
            nx7Var42.a(we5.f(qx7Var4, ox7Var, rx7.e));
            nx7 nx7Var43 = new nx7();
            nx7Var43.a(we5.f(qx7Var2, ox7Var2, rx7.e));
            ox7 ox7Var10 = ox7.RECORD;
            nx7Var43.a(we5.f(qx7Var2, ox7Var10, rx7.e));
            nx7 nx7Var44 = new nx7();
            pc6.u(qx7Var2, ox7Var2, nx7Var44, qx7Var2, ox7Var10);
            nx7Var44.a(we5.f(qx7Var4, ox7Var10, rx7.e));
            nx7 nx7Var45 = new nx7();
            pc6.u(qx7Var2, ox7Var2, nx7Var45, qx7Var2, ox7Var10);
            nx7Var45.a(we5.f(qx7Var3, ox7Var10, rx7.e));
            arrayList6.addAll(i21.L(nx7Var38, nx7Var39, nx7Var40, nx7Var41, nx7Var42, nx7Var43, nx7Var44, nx7Var45));
        }
        if (zB) {
            ArrayList arrayList17 = new ArrayList();
            nx7 nx7Var46 = new nx7();
            ox7 ox7Var11 = ox7.S1440P_4_3;
            nx7Var46.a(we5.f(qx7Var2, ox7Var11, rx7.e));
            arrayList17.add(nx7Var46);
            nx7 nx7Var47 = new nx7();
            nx7Var47.a(we5.f(qx7Var4, ox7Var11, rx7.e));
            arrayList17.add(nx7Var47);
            nx7 nx7Var48 = new nx7();
            pc6.u(qx7Var2, ox7Var11, nx7Var48, qx7Var3, ox7Var);
            nx7 nx7VarE19 = ie2.e(arrayList17, nx7Var48);
            pc6.u(qx7Var4, ox7Var11, nx7VarE19, qx7Var3, ox7Var);
            nx7 nx7VarE20 = ie2.e(arrayList17, nx7VarE19);
            pc6.u(qx7Var2, ox7Var11, nx7VarE20, qx7Var4, ox7Var);
            nx7 nx7VarE21 = ie2.e(arrayList17, nx7VarE20);
            pc6.u(qx7Var4, ox7Var11, nx7VarE21, qx7Var4, ox7Var);
            nx7 nx7VarE22 = ie2.e(arrayList17, nx7VarE21);
            pc6.u(qx7Var2, ox7Var2, nx7VarE22, qx7Var2, ox7Var11);
            nx7 nx7VarE23 = ie2.e(arrayList17, nx7VarE22);
            pc6.u(qx7Var4, ox7Var2, nx7VarE23, qx7Var2, ox7Var11);
            nx7 nx7VarE24 = ie2.e(arrayList17, nx7VarE23);
            pc6.u(qx7Var2, ox7Var2, nx7VarE24, qx7Var4, ox7Var11);
            nx7 nx7VarE25 = ie2.e(arrayList17, nx7VarE24);
            pc6.u(qx7Var4, ox7Var2, nx7VarE25, qx7Var4, ox7Var11);
            arrayList17.add(nx7VarE25);
            arrayList5.addAll(arrayList17);
        }
        boolean zD = kl7.d(jj0Var);
        this.r = zD;
        if (zD && Build.VERSION.SDK_INT >= 33) {
            nx7 nx7Var49 = new nx7();
            ox7 ox7Var12 = ox7.S1440P_4_3;
            jl7 jl7Var3 = jl7.PREVIEW_VIDEO_STILL;
            nx7Var49.a(we5.f(qx7Var2, ox7Var12, jl7Var3));
            nx7 nx7Var50 = new nx7();
            nx7Var50.a(we5.f(qx7Var4, ox7Var12, jl7Var3));
            nx7 nx7Var51 = new nx7();
            ox7 ox7Var13 = ox7.RECORD;
            jl7 jl7Var4 = jl7.VIDEO_RECORD;
            nx7Var51.a(we5.f(qx7Var2, ox7Var13, jl7Var4));
            nx7 nx7Var52 = new nx7();
            nx7Var52.a(we5.f(qx7Var4, ox7Var13, jl7Var4));
            nx7 nx7Var53 = new nx7();
            jl7 jl7Var5 = jl7.STILL_CAPTURE;
            nx7Var53.a(we5.f(qx7Var3, ox7Var, jl7Var5));
            nx7 nx7Var54 = new nx7();
            nx7Var54.a(we5.f(qx7Var4, ox7Var, jl7Var5));
            nx7 nx7Var55 = new nx7();
            jl7 jl7Var6 = jl7.PREVIEW;
            nx7Var55.a(we5.f(qx7Var2, ox7Var2, jl7Var6));
            nx7Var55.a(we5.f(qx7Var3, ox7Var, jl7Var5));
            nx7 nx7Var56 = new nx7();
            nx7Var56.a(we5.f(qx7Var2, ox7Var2, jl7Var6));
            nx7Var56.a(we5.f(qx7Var4, ox7Var, jl7Var5));
            nx7 nx7Var57 = new nx7();
            nx7Var57.a(we5.f(qx7Var2, ox7Var2, jl7Var6));
            nx7Var57.a(we5.f(qx7Var2, ox7Var13, jl7Var4));
            nx7 nx7Var58 = new nx7();
            nx7Var58.a(we5.f(qx7Var2, ox7Var2, jl7Var6));
            nx7Var58.a(we5.f(qx7Var4, ox7Var13, jl7Var4));
            nx7 nx7Var59 = new nx7();
            nx7Var59.a(we5.f(qx7Var2, ox7Var2, jl7Var6));
            nx7Var59.a(we5.f(qx7Var4, ox7Var2, jl7Var6));
            nx7 nx7Var60 = new nx7();
            ie2.o(nx7Var60, we5.f(qx7Var2, ox7Var2, jl7Var6), qx7Var2, ox7Var13, jl7Var4);
            nx7Var60.a(we5.f(qx7Var3, ox7Var13, jl7Var5));
            nx7 nx7Var61 = new nx7();
            ie2.o(nx7Var61, we5.f(qx7Var2, ox7Var2, jl7Var6), qx7Var4, ox7Var13, jl7Var4);
            nx7Var61.a(we5.f(qx7Var3, ox7Var13, jl7Var5));
            nx7 nx7Var62 = new nx7();
            ie2.o(nx7Var62, we5.f(qx7Var2, ox7Var2, jl7Var6), qx7Var4, ox7Var2, jl7Var6);
            nx7Var62.a(we5.f(qx7Var3, ox7Var, jl7Var5));
            arrayList3.addAll(i21.L(nx7Var49, nx7Var50, nx7Var51, nx7Var52, nx7Var53, nx7Var54, nx7Var55, nx7Var56, nx7Var57, nx7Var58, nx7Var59, nx7Var60, nx7Var61, nx7Var62));
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    public static Range c(Range range, int i, Range[] rangeArr) {
        Range range2 = iz.h;
        if (dh3.f(range, range2)) {
            range2.getClass();
            return range2;
        }
        if (rangeArr == null) {
            range2.getClass();
            return range2;
        }
        Object lower = range.getLower();
        lower.getClass();
        Integer numValueOf = Integer.valueOf(Math.min(((Number) lower).intValue(), i));
        Object upper = range.getUpper();
        upper.getClass();
        Range range3 = new Range(numValueOf, Integer.valueOf(Math.min(((Number) upper).intValue(), i)));
        int iH = 0;
        for (Range range4 : rangeArr) {
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (dh3.f(range2, iz.h)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    range2 = range4;
                    break;
                }
                try {
                    Range rangeIntersect = range4.intersect(range3);
                    rangeIntersect.getClass();
                    int iH2 = h(rangeIntersect);
                    if (iH == 0) {
                        range2 = range4;
                        iH = iH2;
                    } else if (iH2 >= iH) {
                        range2.getClass();
                        Range rangeIntersect2 = range2.intersect(range3);
                        rangeIntersect2.getClass();
                        double dH = h(rangeIntersect2);
                        Range rangeIntersect3 = range4.intersect(range3);
                        rangeIntersect3.getClass();
                        double dH2 = h(rangeIntersect3);
                        double dH3 = dH2 / ((double) h(range4));
                        double dH4 = dH / ((double) h(range2));
                        if (dH2 > dH) {
                            if (dH3 >= 0.5d || dH3 >= dH4) {
                                range2 = range4;
                            }
                        } else if (dH2 == dH) {
                            if (dH3 > dH4 || (dH3 == dH4 && ((Number) range4.getLower()).intValue() > ((Number) range2.getLower()).intValue())) {
                                range2 = range4;
                            }
                        } else if (dH4 < 0.5d && dH3 > dH4) {
                            range2 = range4;
                        }
                        Range rangeIntersect4 = range3.intersect(range2);
                        rangeIntersect4.getClass();
                        iH = h(rangeIntersect4);
                    }
                } catch (IllegalArgumentException unused) {
                    if (iH == 0) {
                        int iG = g(range4, range3);
                        range2.getClass();
                        if (iG < g(range2, range3) || (g(range4, range3) == g(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || h(range4) < h(range2)))) {
                            range2 = range4;
                        }
                    }
                }
            }
        }
        range2.getClass();
        return range2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static Size e(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object rj6Var;
        Object outputSizes;
        try {
            if (i == 34) {
                if (streamConfigurationMap != null) {
                    outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                } else {
                    outputSizes = null;
                }
            } else if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(i);
            } else {
                outputSizes = null;
            }
            rj6Var = outputSizes;
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        Size[] sizeArr = (Size[]) rj6Var;
        if (sizeArr == null) {
            sizeArr = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (ru.a(rational, size)) {
                    arrayList.add(size);
                }
            }
            sizeArr = (Size[]) arrayList.toArray(new Size[0]);
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        rx0 rx0Var = new rx0(false);
        List listAsList = Arrays.asList(sizeArr);
        listAsList.getClass();
        Size size2 = (Size) Collections.max(listAsList, rx0Var);
        Size size3 = cb7.a;
        if (z) {
            Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                List listAsList2 = Arrays.asList(highResolutionOutputSizes);
                listAsList2.getClass();
                size3 = (Size) Collections.max(listAsList2, rx0Var);
            }
        }
        return (Size) Collections.max(i21.L(size2, size3), rx0Var);
    }

    public static int g(Range range, Range range2) {
        if (range.contains(range2.getUpper()) || range.contains(range2.getLower())) {
            bt.q("Ranges must not intersect");
            return 0;
        }
        if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
            int iIntValue = ((Number) range.getLower()).intValue();
            Object upper = range2.getUpper();
            upper.getClass();
            return iIntValue - ((Number) upper).intValue();
        }
        int iIntValue2 = ((Number) range2.getLower()).intValue();
        Object upper2 = range.getUpper();
        upper2.getClass();
        return iIntValue2 - ((Number) upper2).intValue();
    }

    public static int h(Range range) {
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        lower.getClass();
        return (iIntValue - ((Number) lower).intValue()) + 1;
    }

    public static Range n(Range range, Range range2, boolean z) {
        Range range3 = iz.h;
        if (dh3.f(range2, range3) && dh3.f(range, range3)) {
            range3.getClass();
            return range3;
        }
        if (dh3.f(range2, range3)) {
            return range;
        }
        if (!dh3.f(range, range3)) {
            if (z) {
                mb6.s("All targetFrameRate should be the same if strict fps is required", dh3.f(range, range2));
                return range;
            }
            try {
                Range rangeIntersect = range2.intersect(range);
                rangeIntersect.getClass();
                return rangeIntersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final boolean a(lx7 lx7Var, ArrayList arrayList, Map map, List list, List list2) {
        ArrayList arrayList2;
        List list3;
        boolean z;
        Size size;
        qr8 qr8Var;
        Integer num;
        Integer num2 = 2;
        lv8 lv8Var = lx7Var.d;
        boolean z2 = lx7Var.h;
        LinkedHashMap linkedHashMap = this.l;
        boolean zContainsKey = linkedHashMap.containsKey(lx7Var);
        lv8 lv8Var2 = lv8.g0;
        if (zContainsKey) {
            Object obj = linkedHashMap.get(lx7Var);
            obj.getClass();
            list3 = (List) obj;
            num2 = num2;
            z2 = z2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i = lx7Var.a;
            if (z2) {
                vz7 vz7Var = xu2.a;
                arrayList3.addAll(xu2.b(this.a, lv8Var));
                num2 = num2;
                z2 = z2;
            } else if (lx7Var.e) {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    vz7 vz7Var2 = xu2.a;
                    ArrayList arrayList5 = new ArrayList();
                    nx7 nx7Var = new nx7();
                    jl7 jl7Var = rx7.e;
                    ox7 ox7Var = ox7.MAXIMUM;
                    jl7 jl7Var2 = rx7.e;
                    qx7 qx7Var = qx7.f0;
                    nx7Var.a(we5.f(qx7Var, ox7Var, jl7Var2));
                    arrayList5.add(nx7Var);
                    nx7 nx7Var2 = new nx7();
                    ie2.o(nx7Var2, we5.f(qx7.X, ox7.PREVIEW, jl7Var2), qx7Var, ox7Var, jl7Var2);
                    arrayList5.add(nx7Var2);
                    arrayList4.addAll(arrayList5);
                }
                if (i == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                num2 = num2;
                z2 = z2;
                if (lx7Var.f) {
                    ArrayList arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        l03 l03Var = this.C;
                        if (((Boolean) l03Var.b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) l03Var.c.getValue();
                            if (size2 != null) {
                                nz nzVarM = m(34);
                                vz7 vz7Var3 = xu2.a;
                                ArrayList arrayList7 = new ArrayList();
                                jl7 jl7Var3 = rx7.e;
                                rx7 rx7VarP = we5.p(34, size2, nzVarM, 0, px7.Y, rx7.e);
                                nx7 nx7Var3 = new nx7();
                                nx7Var3.a(rx7VarP);
                                arrayList7.add(nx7Var3);
                                nx7 nx7Var4 = new nx7();
                                nx7Var4.a(rx7VarP);
                                nx7Var4.a(rx7VarP);
                                arrayList7.add(nx7Var4);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    int i2 = lx7Var.b;
                    if (i2 == 8) {
                        if (i != 1) {
                            ArrayList arrayList8 = this.g;
                            if (i != 2) {
                                if (lv8Var == lv8Var2) {
                                    arrayList8 = this.j;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.i);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.f;
                        }
                        linkedHashMap.put(lx7Var, arrayList2);
                        list3 = arrayList2;
                    } else if (i2 == 10 && i == 0) {
                        arrayList3.addAll(this.m);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(lx7Var, arrayList2);
            list3 = arrayList2;
        }
        if (list3 != null && list3.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((nx7) it.next()).c(arrayList) != null) {
                z = true;
                break;
            }
        }
        if (!z || !z2) {
            return z;
        }
        e57 e57Var = new e57();
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                i21.X();
                throw null;
            }
            rx7 rx7Var = (rx7) next;
            nz nzVarM2 = m(rx7Var.d);
            LinkedHashMap linkedHashMap2 = nzVarM2.f;
            int i5 = rx7Var.d;
            ox7 ox7Var2 = rx7Var.b;
            int iOrdinal = ox7Var2.ordinal();
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        size = nzVarM2.e;
                        break;
                    case 10:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 11:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 13:
                        size = (Size) nzVarM2.i.get(Integer.valueOf(i5));
                        break;
                    case 14:
                        bt.i("Not supported config size");
                        return false;
                    default:
                        size = ox7Var2.Y;
                        break;
                }
            } else {
                size = nzVarM2.c;
            }
            size.getClass();
            er8 er8Var = (er8) list.get(((Number) list2.get(i3)).intValue());
            Object obj2 = map.get(rx7Var);
            if (obj2 == null) {
                bt.q("Required value was null.");
                return false;
            }
            px1 px1Var = (px1) obj2;
            er8Var.getClass();
            Iterator it3 = it2;
            l82 l82Var = new l82(er8Var.n(), size);
            qr8.Y.getClass();
            int iOrdinal2 = er8Var.s().ordinal();
            if (iOrdinal2 == 0) {
                qr8Var = qr8.IMAGE_CAPTURE;
            } else if (iOrdinal2 == 1) {
                qr8Var = qr8.PREVIEW;
            } else if (iOrdinal2 == 2) {
                qr8Var = qr8.IMAGE_ANALYSIS;
            } else if (iOrdinal2 != 3) {
                qr8Var = iOrdinal2 != 4 ? qr8.UNDEFINED : qr8.STREAM_SHARING;
            } else {
                qr8Var = qr8.VIDEO_CAPTURE;
            }
            Class cls = qr8Var.X;
            if (cls != null) {
                l82Var.j = cls;
            }
            b57 b57VarD = b57.d(er8Var, size);
            xm0 xm0Var = b57VarD.b;
            b57VarD.b(l82Var, px1Var, -1);
            Range range = lx7Var.i;
            Range range2 = !dh3.f(range, iz.h) ? range : null;
            if (range2 == null) {
                range2 = ek2.d;
            }
            ((k05) xm0Var.g0).o(ym0.f, range2);
            if (lv8Var == lv8Var2) {
                num = num2;
                ((k05) xm0Var.g0).o(er8.a0, num);
            } else {
                num = num2;
                if (lv8Var == lv8.f0) {
                    ((k05) xm0Var.g0).o(er8.b0, num);
                }
            }
            e57Var.a(b57VarD.c());
            boolean zC = e57Var.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(er8Var);
            sb.append(" with ");
            sb.append(rx7Var);
            sb.append(" due to [");
            sb.append(!e57Var.m ? "Template is not set" : e57Var.l.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(lx7Var);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            mb6.s(sb.toString(), zC);
            num2 = num;
            it2 = it3;
            i3 = i4;
        }
        f57 f57VarB = e57Var.b();
        boolean zC2 = this.c.c(f57VarB);
        List listB = f57VarB.b();
        listB.getClass();
        Iterator it4 = listB.iterator();
        while (it4.hasNext()) {
            ((wg1) it4.next()).a();
        }
        return zC2;
    }

    public final void b() {
        Object rj6Var;
        Object outputSizes;
        Size sizeI;
        Size sizeC = this.y.c();
        try {
            Integer.parseInt(this.d);
            sizeI = i();
            if (sizeI == null) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.x.c.X;
                if (streamConfigurationMap != null) {
                    try {
                        outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                    } catch (Throwable th) {
                        rj6Var = new rj6(th);
                    }
                } else {
                    outputSizes = null;
                }
                rj6Var = outputSizes;
                if (rj6Var instanceof rj6) {
                    rj6Var = null;
                }
                Size[] sizeArr = (Size[]) rj6Var;
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new rx0(true));
                    int length = sizeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            sizeI = null;
                            break;
                        }
                        Size size = sizeArr[i];
                        int width = size.getWidth();
                        Size size2 = cb7.e;
                        if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                            sizeI = size;
                            break;
                        }
                        i++;
                    }
                } else {
                    sizeI = null;
                    break;
                }
                if (sizeI == null) {
                    sizeI = cb7.c;
                    sizeI.getClass();
                }
            }
        } catch (NumberFormatException unused) {
        }
        this.v = new nz(cb7.b, new LinkedHashMap(), sizeC, new LinkedHashMap(), sizeI, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public final int d(int i, Size size, boolean z, int i2) {
        long jF;
        int iIntValue = 0;
        if (!z) {
            vk7 vk7VarJ = j();
            size.getClass();
            try {
                jF = vk7VarJ.c.F(i, size);
            } catch (RuntimeException unused) {
                if (hi5.m0()) {
                    size.toString();
                }
                jF = 0;
            }
            if (jF > 0) {
                iIntValue = (int) (1.0E9d / jF);
            } else if (!this.u) {
                iIntValue = Integer.MAX_VALUE;
            } else if (hi5.m0()) {
                size.toString();
            }
        } else {
            if (i != 34) {
                bt.i("Check failed.");
                return 0;
            }
            l03 l03Var = this.C;
            l03Var.getClass();
            size.getClass();
            List listC = l03Var.c(size);
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                size.toString();
                hi5.z0("HighSpeedResolver");
            } else {
                Iterator it = listC.iterator();
                if (!it.hasNext()) {
                    bt.n();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                iIntValue = num.intValue();
            }
        }
        return Math.min(i2, iIntValue);
    }

    public final List f(lx7 lx7Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        List list;
        zx zxVar = kl7.a;
        if (lx7Var.a == 0 && lx7Var.b == 8 && !lx7Var.f) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List listC = ((nx7) it.next()).c(arrayList);
                if (listC != null) {
                    zx zxVar2 = kl7.a;
                    int size = listC.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long j = ((rx7) listC.get(i)).c.X;
                        boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                        gr8 gr8Var = gr8.g0;
                        if (zContainsKey) {
                            rx rxVar = (rx) linkedHashMap.get(Integer.valueOf(i));
                            rxVar.getClass();
                            List list2 = rxVar.e;
                            if (list2.size() == 1) {
                                gr8Var = (gr8) list2.get(0);
                            }
                            gr8Var.getClass();
                            if (!kl7.c(gr8Var, j, list2)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                                bt.g("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            Object obj = linkedHashMap2.get(Integer.valueOf(i));
                            obj.getClass();
                            er8 er8Var = (er8) obj;
                            gr8 gr8VarS = er8Var.s();
                            gr8VarS.getClass();
                            if (er8Var.s() == gr8Var) {
                                list = (List) ((hl7) er8Var).d(hl7.Y);
                                list.getClass();
                            } else {
                                list = d02.X;
                            }
                            if (!kl7.c(gr8VarS, j, list)) {
                                break;
                            }
                            i++;
                        }
                    }
                    vz7 vz7Var = new vz7(new a23((Object) this, (Object) listC, (byte) 24));
                    if (z && ((Boolean) vz7Var.getValue()).booleanValue()) {
                        return listC;
                    }
                }
            }
        }
        return null;
    }

    public final Size i() {
        gy gyVarB;
        Iterator it = i21.L(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            w02 w02Var = this.b;
            if (w02Var.a(iIntValue) && (gyVarB = w02Var.b(iIntValue)) != null) {
                List list = gyVarB.d;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    obj.getClass();
                    hy hyVar = (hy) obj;
                    return new Size(hyVar.e, hyVar.f);
                }
            }
        }
        return null;
    }

    public final vk7 j() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        jj0 jj0Var = this.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) jj0Var).c(key);
        if (streamConfigurationMap != null) {
            return new vk7(streamConfigurationMap, new ue5(jj0Var));
        }
        bt.q("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList k(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rx rxVar = (rx) it.next();
            arrayList3.add(rxVar.a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), rxVar);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            er8 er8Var = (er8) list2.get(((Number) arrayList2.get(i2)).intValue());
            int iN = er8Var.n();
            jl7 jl7VarR = er8Var.r();
            jl7 jl7Var = rx7.e;
            arrayList3.add(we5.p(iN, size, m(iN), i, z ? px7.X : px7.Y, jl7VarR));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), er8Var);
            i2 = i3;
        }
        return arrayList3;
    }

    public final nz l() {
        nz nzVar = this.v;
        if (nzVar != null) {
            return nzVar;
        }
        dh3.T("surfaceSizeDefinition");
        throw null;
    }

    public final nz m(int i) {
        Size sizeE;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(numValueOf)) {
            LinkedHashMap linkedHashMap = l().b;
            Size size = cb7.d;
            size.getClass();
            r(linkedHashMap, size, i);
            LinkedHashMap linkedHashMap2 = l().d;
            Size size2 = cb7.f;
            size2.getClass();
            r(linkedHashMap2, size2, i);
            q(l().f, i, null);
            q(l().g, i, ru.a);
            q(l().h, i, ru.c);
            LinkedHashMap linkedHashMap3 = l().i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) this.a).c(key);
                if (streamConfigurationMap != null && (sizeE = e(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap3.put(Integer.valueOf(i), sizeE);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return l();
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0613 A[PHI: r14 r22 r27
  0x0613: PHI (r14v20 int) = (r14v19 int), (r14v19 int), (r14v27 int), (r14v29 int) binds: [B:194:0x05e8, B:196:0x05f4, B:202:0x0601, B:205:0x060e] A[DONT_GENERATE, DONT_INLINE]
  0x0613: PHI (r22v4 boolean) = (r22v3 boolean), (r22v3 boolean), (r22v3 boolean), (r22v5 boolean) binds: [B:194:0x05e8, B:196:0x05f4, B:202:0x0601, B:205:0x060e] A[DONT_GENERATE, DONT_INLINE]
  0x0613: PHI (r27v3 java.util.List) = (r27v2 java.util.List), (r27v2 java.util.List), (r27v5 java.util.List), (r27v6 java.util.List) binds: [B:194:0x05e8, B:196:0x05f4, B:202:0x0601, B:205:0x060e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x0615 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0660  */
    /* JADX WARN: Code duplicated, block: B:300:0x0839  */
    /* JADX WARN: Code duplicated, block: B:302:0x0840  */
    /* JADX WARN: Code duplicated, block: B:304:0x0858  */
    /* JADX WARN: Code duplicated, block: B:306:0x0874  */
    /* JADX WARN: Code duplicated, block: B:308:0x0886  */
    /* JADX WARN: Code duplicated, block: B:310:0x088c  */
    /* JADX WARN: Code duplicated, block: B:316:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:318:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:320:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:378:0x08a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x089a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x08ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x08e2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [int] */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.util.LinkedHashMap] */
    public final iy7 o(lx7 lx7Var, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        mx7 mx7Var;
        jj0 jj0Var;
        LinkedHashMap linkedHashMap2;
        boolean z;
        ?? r29;
        boolean z2;
        lx7 lx7Var2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List listF;
        int i;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List list2;
        ?? r35;
        List list3;
        int i2;
        List list4;
        List list5;
        mx7 mx7Var2;
        int size;
        int i3;
        long j;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        er8 er8Var;
        iz izVar;
        gg0 gg0VarB;
        rx rxVar;
        gg0 gg0VarB2;
        xy0 xy0VarA;
        Range range;
        px1 px1Var;
        Range[] rangeArrB;
        px1 px1Var2;
        ?? arrayList5;
        Size size2;
        ArrayList<Size> arrayList6;
        Size sizeB;
        mx7 mx7Var3 = this;
        lx7 lx7Var3 = lx7Var;
        Map map2 = map;
        boolean z3 = lx7Var3.f;
        String str5 = "CXCP";
        if (hi5.i0("CXCP")) {
            Objects.toString(lx7Var3);
        }
        boolean z4 = lx7Var3.g;
        Range range2 = lx7Var3.i;
        d02 d02Var = d02.X;
        px7 px7Var = px7.Y;
        String str6 = mx7Var3.d;
        boolean z5 = false;
        if (z4) {
            str = ". New configs: ";
            str2 = "CXCP";
            str3 = str6;
            str4 = "No supported surface combination is found for camera device - Id : ";
            mx7Var = mx7Var3;
        } else {
            ArrayList arrayList7 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList7.add(((rx) it.next()).a);
            }
            rx0 rx0Var = new rx0(false);
            mx7 mx7Var4 = mx7Var3;
            for (er8 er8Var2 : map2.keySet()) {
                String str7 = str6;
                List list6 = (List) map2.get(er8Var2);
                if (list6 == null || list6.isEmpty()) {
                    u52.f(46, er8Var2, "No available output size is found for ");
                    return null;
                }
                Size size3 = (Size) Collections.min(list6, rx0Var);
                rx0 rx0Var2 = rx0Var;
                int iN = er8Var2.n();
                jl7 jl7VarR = er8Var2.r();
                jl7 jl7Var = rx7.e;
                size3.getClass();
                arrayList7.add(we5.p(iN, size3, mx7Var4.m(iN), lx7Var3.a, px7Var, jl7VarR));
                z5 = false;
                rx0Var = rx0Var2;
                str6 = str7;
                str5 = str5;
                mx7Var4 = this;
            }
            str2 = str5;
            str4 = "No supported surface combination is found for camera device - Id : ";
            str = ". New configs: ";
            str3 = str6;
            mx7 mx7Var5 = this;
            boolean zA = mx7Var5.a(lx7Var3, arrayList7, e02.X, d02Var, d02Var);
            mx7Var = mx7Var5;
            if (!zA) {
                throw new IllegalArgumentException((str4 + str3 + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + str + list + ". GroupableFeature settings: " + lx7Var3 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            er8 er8Var3 = (er8) it2.next();
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = it2;
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            Object obj = map2.get(er8Var3);
            obj.getClass();
            for (Size size4 : (List) obj) {
                d02 d02Var2 = d02Var;
                int iN2 = er8Var3.n();
                int iV = er8Var3.v(size4);
                jl7 jl7VarR2 = er8Var3.r();
                jl7 jl7Var2 = rx7.e;
                String str8 = str;
                ox7 ox7Var = we5.p(iN2, size4, mx7Var.m(iN2), lx7Var3.a, lx7Var3.h ? px7.X : px7Var, jl7VarR2).b;
                String str9 = str4;
                Range range3 = iz.h;
                int iD = dh3.f(range2, range3) ? Integer.MAX_VALUE : mx7Var.d(iN2, size4, z3, iV);
                if (!z4 || (ox7Var != ox7.NOT_SUPPORT && (dh3.f(range2, range3) || iD >= ((Number) range2.getUpper()).intValue()))) {
                    Set linkedHashSet = (Set) linkedHashMap8.get(ox7Var);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap8.put(ox7Var, linkedHashSet);
                    }
                    if (!linkedHashSet.contains(Integer.valueOf(iD))) {
                        arrayList8.add(size4);
                        linkedHashSet.add(Integer.valueOf(iD));
                    }
                }
                str = str8;
                str4 = str9;
                d02Var = d02Var2;
            }
            linkedHashMap7.put(er8Var3, arrayList8);
            map2 = map;
            it2 = it3;
        }
        d02 d02Var3 = d02Var;
        String str10 = str4;
        String str11 = str;
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            jj0Var = mx7Var.a;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it4.next()).intValue();
            Object obj2 = linkedHashMap7.get(list.get(iIntValue));
            obj2.getClass();
            List<Size> list7 = (List) obj2;
            int iN3 = ((er8) list.get(iIntValue)).n();
            mx7Var.A.getClass();
            jj0Var.getClass();
            vk7 vk7Var = mx7Var.x;
            vk7Var.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) um1.a().b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new ik0(jj0Var, vk7Var).a().b(AspectRatioLegacyApi21Quirk.class)) == null) || (size2 = (Size) mx7Var.m(PSKKeyManager.MAX_KEY_LENGTH_BYTES).f.get(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES))) == null) ? null : new Rational(size2.getWidth(), size2.getHeight());
            if (rational == null) {
                arrayList6 = new ArrayList(list7);
            } else {
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                for (Size size5 : list7) {
                    if (ru.a(rational, size5)) {
                        arrayList10.add(size5);
                    } else {
                        arrayList11.add(size5);
                    }
                }
                arrayList11.addAll(0, arrayList10);
                arrayList6 = arrayList11;
            }
            jl7 jl7Var3 = rx7.e;
            qx7 qx7Var = (qx7) rx7.h.get(Integer.valueOf(iN3));
            if (qx7Var == null) {
                qx7Var = qx7.X;
            }
            sr4 sr4Var = mx7Var.z;
            sr4Var.getClass();
            if (sr4Var.a != null && (sizeB = ExtraCroppingQuirk.b(qx7Var)) != null) {
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(sizeB);
                for (Size size6 : arrayList6) {
                    if (!dh3.f(size6, sizeB)) {
                        arrayList12.add(size6);
                    }
                }
                arrayList6 = arrayList12;
            }
            arrayList9.add(arrayList6);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        l03 l03Var = mx7Var.C;
        if (z3) {
            l03Var.getClass();
            if (arrayList9.isEmpty()) {
                arrayList5 = d02Var3;
            } else {
                List listA = l03.a(arrayList9);
                arrayList5 = new ArrayList(xv0.Z(listA, 10));
                Iterator it5 = listA.iterator();
                while (it5.hasNext()) {
                    Size size7 = (Size) it5.next();
                    int size8 = arrayList9.size();
                    Iterator it6 = it5;
                    ArrayList arrayList13 = new ArrayList(size8);
                    LinkedHashMap linkedHashMap11 = linkedHashMap9;
                    for (int i4 = 0; i4 < size8; i4++) {
                        arrayList13.add(size7);
                    }
                    arrayList5.add(arrayList13);
                    it5 = it6;
                    linkedHashMap9 = linkedHashMap11;
                }
            }
            linkedHashMap2 = linkedHashMap9;
            z = true;
            r29 = arrayList5;
        } else {
            linkedHashMap2 = linkedHashMap9;
            z = true;
            Iterator it7 = arrayList9.iterator();
            int size9 = 1;
            while (it7.hasNext()) {
                size9 *= ((List) it7.next()).size();
            }
            if (size9 == 0) {
                bt.q("Failed to find supported resolutions.");
                return null;
            }
            ArrayList arrayList14 = new ArrayList();
            for (int i5 = 0; i5 < size9; i5++) {
                arrayList14.add(new ArrayList());
            }
            int size10 = size9 / ((List) arrayList9.get(0)).size();
            int size11 = arrayList9.size();
            int i6 = size9;
            int i7 = 0;
            while (i7 < size11) {
                int i8 = size10;
                List list8 = (List) arrayList9.get(i7);
                int i9 = size11;
                int i10 = 0;
                while (i10 < size9) {
                    ((List) arrayList14.get(i10)).add(list8.get((i10 % i6) / i8));
                    i10++;
                    arrayList14 = arrayList14;
                    size9 = size9;
                }
                ArrayList arrayList15 = arrayList14;
                int i11 = size9;
                if (i7 < arrayList9.size() - 1) {
                    size10 = i8 / ((List) arrayList9.get(i7 + 1)).size();
                    i6 = i8;
                } else {
                    size10 = i8;
                }
                i7++;
                size11 = i9;
                arrayList14 = arrayList15;
                size9 = i11;
            }
            r29 = arrayList14;
        }
        zx zxVar = kl7.a;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z2 = false;
                        break;
                    }
                    er8 er8Var4 = (er8) it9.next();
                    gr8 gr8VarS = er8Var4.s();
                    gr8VarS.getClass();
                    if (kl7.e(er8Var4, gr8VarS)) {
                    }
                }
            } else {
                rx rxVar2 = (rx) it8.next();
                gr8 gr8Var = (gr8) rxVar2.e.get(0);
                l11 l11Var = rxVar2.f;
                l11Var.getClass();
                gr8Var.getClass();
                if (kl7.e(l11Var, gr8Var)) {
                }
            }
            z2 = z;
            break;
        }
        if (!mx7Var.r || z2) {
            lx7Var2 = lx7Var3;
            linkedHashMap3 = linkedHashMap10;
            linkedHashMap4 = linkedHashMap2;
            listF = null;
        } else {
            Iterator it10 = r29.iterator();
            listF = null;
            while (true) {
                if (!it10.hasNext()) {
                    lx7Var2 = lx7Var3;
                    linkedHashMap3 = linkedHashMap10;
                    linkedHashMap4 = linkedHashMap2;
                    break;
                }
                lx7 lx7Var4 = lx7Var3;
                lx7Var2 = lx7Var4;
                LinkedHashMap linkedHashMap12 = linkedHashMap2;
                linkedHashMap4 = linkedHashMap12;
                linkedHashMap3 = linkedHashMap10;
                listF = mx7Var.f(lx7Var2, mx7Var.k(lx7Var4.a, arrayList, (List) it10.next(), list, arrayList2, linkedHashMap12, linkedHashMap10, false), linkedHashMap4, linkedHashMap3);
                if (listF != null) {
                    break;
                }
                linkedHashMap4.clear();
                linkedHashMap3.clear();
                linkedHashMap2 = linkedHashMap4;
                linkedHashMap10 = linkedHashMap3;
                lx7Var3 = lx7Var2;
            }
            if (hi5.i0(str2)) {
                Objects.toString(listF);
            }
        }
        Iterator it11 = arrayList.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it11.hasNext()) {
            rx rxVar3 = (rx) it11.next();
            iMin = Math.min(iMin, mx7Var.d(rxVar3.b, rxVar3.c, z3, rxVar3.j));
        }
        Iterator it12 = r29.iterator();
        List list9 = null;
        List list10 = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        boolean z6 = false;
        boolean z7 = false;
        mx7 mx7Var6 = mx7Var;
        boolean z8 = z3;
        while (true) {
            if (!it12.hasNext()) {
                lx7 lx7Var5 = lx7Var2;
                i = i12;
                lx7Var2 = lx7Var5;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                list2 = listF;
                linkedHashMap4 = linkedHashMap4;
                linkedHashMap3 = linkedHashMap3;
                r35 = z8;
                jj0Var = jj0Var;
                l03Var = l03Var;
                str3 = str3;
                list3 = list;
                i2 = i13;
                list4 = list9;
                list5 = list10;
                mx7Var2 = mx7Var6;
                break;
            }
            List list11 = (List) it12.next();
            int i14 = i13;
            LinkedHashMap linkedHashMap13 = new LinkedHashMap();
            LinkedHashMap linkedHashMap14 = new LinkedHashMap();
            int i15 = i12;
            int i16 = lx7Var2.a;
            boolean z9 = lx7Var2.h;
            linkedHashMap3 = linkedHashMap3;
            linkedHashMap4 = linkedHashMap4;
            i = i15;
            List list12 = list;
            jj0Var = jj0Var;
            str3 = str3;
            int i17 = iMin;
            l03Var = l03Var;
            List list13 = listF;
            ArrayList arrayListK = mx7Var6.k(i16, arrayList, list11, list12, arrayList2, linkedHashMap13, linkedHashMap14, z9);
            Iterator it13 = list11.iterator();
            int iMin2 = i17;
            int i18 = 0;
            while (it13.hasNext()) {
                int i19 = i18 + 1;
                Iterator it14 = it13;
                Size size12 = (Size) it13.next();
                er8 er8Var5 = (er8) list12.get(((Number) arrayList2.get(i18)).intValue());
                iMin2 = Math.min(iMin2, mx7Var6.d(er8Var5.n(), size12, z8, er8Var5.v(size12)));
                list12 = list;
                i18 = i19;
                it13 = it14;
            }
            boolean z10 = (dh3.f(range2, iz.h) || iMin2 >= i17 || iMin2 >= ((Number) range2.getUpper()).intValue()) ? z : false;
            LinkedHashMap linkedHashMap15 = new LinkedHashMap();
            Iterator it15 = arrayListK.iterator();
            int i20 = 0;
            while (it15.hasNext()) {
                Object next = it15.next();
                int i21 = i20 + 1;
                if (i20 < 0) {
                    i21.X();
                    throw null;
                }
                rx7 rx7Var = (rx7) next;
                Iterator it16 = it15;
                rx rxVar4 = (rx) linkedHashMap13.get(Integer.valueOf(i20));
                if (rxVar4 == null || (px1Var2 = rxVar4.d) == null) {
                    Object obj3 = linkedHashMap.get(linkedHashMap14.get(Integer.valueOf(i20)));
                    if (obj3 == null) {
                        bt.q("Required value was null.");
                        return null;
                    }
                    px1Var2 = (px1) obj3;
                }
                linkedHashMap15.put(rx7Var, px1Var2);
                it15 = it16;
                i20 = i21;
            }
            int i22 = iMin2;
            list2 = list13;
            arrayList3 = arrayList;
            boolean z11 = z8;
            wc6 wc6Var = new wc6(this, lx7Var, arrayListK, linkedHashMap15, list, arrayList2, (byte) 1);
            mx7 mx7Var7 = this;
            lx7Var2 = lx7Var;
            list3 = list;
            arrayList4 = arrayList2;
            g44 g44VarP = x97.P(w74.Y, wc6Var);
            if (z6 || !((Boolean) g44VarP.getValue()).booleanValue()) {
                if (list2 != null || z7 || mx7Var7.f(lx7Var2, arrayListK, linkedHashMap13, linkedHashMap14) == null) {
                    i12 = i;
                    i13 = i14;
                } else {
                    if (i14 != Integer.MAX_VALUE && i14 >= i22) {
                        i13 = i14;
                    } else {
                        i13 = i22;
                        list10 = list11;
                    }
                    if (!z10) {
                        i12 = i;
                    } else {
                        if (z6) {
                            i2 = i22;
                            list4 = list9;
                            list5 = list11;
                            mx7Var2 = mx7Var7;
                            r35 = z11;
                            break;
                        }
                        int i23 = i;
                        lx7Var2 = lx7Var2;
                        i12 = i23;
                        z7 = z;
                        i13 = i22;
                        list10 = list11;
                    }
                    iMin = i17;
                    listF = list2;
                    mx7Var6 = mx7Var7;
                    z8 = z11;
                }
                iMin = i17;
                listF = list2;
                mx7Var6 = mx7Var7;
                z8 = z11;
            } else {
                if (i == Integer.MAX_VALUE || i < i22) {
                    i = i22;
                    list9 = list11;
                }
                if (!z10) {
                    if (list2 != null) {
                        i12 = i;
                        i13 = i14;
                    } else {
                        i12 = i;
                        i13 = i14;
                    }
                    iMin = i17;
                    listF = list2;
                    mx7Var6 = mx7Var7;
                    z8 = z11;
                } else {
                    if (z7) {
                        i2 = i14;
                        i = i22;
                        list5 = list10;
                        list4 = list11;
                        mx7Var2 = mx7Var7;
                        r35 = z11;
                        break;
                    }
                    z6 = z;
                    i = i22;
                    list9 = list11;
                    if (list2 != null) {
                        i12 = i;
                        i13 = i14;
                    } else {
                        i12 = i;
                        i13 = i14;
                    }
                    iMin = i17;
                    listF = list2;
                    mx7Var6 = mx7Var7;
                    z8 = z11;
                }
            }
        }
        jx7 jx7Var = (list4 != null && (z4 == 0 || dh3.f(range2, iz.h) || (i != Integer.MAX_VALUE && i >= ((Number) range2.getUpper()).intValue()))) ? new jx7(list4, list5, i, i2, Integer.MAX_VALUE) : null;
        if (jx7Var == null) {
            StringBuilder sbP = p61.p(str10, str3, " and Hardware level: ");
            sbP.append(mx7Var2.e);
            sbP.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sbP.append(arrayList3);
            sbP.append(str11);
            sbP.append(list3);
            sbP.append('.');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        int i24 = jx7Var.c;
        List list14 = jx7Var.a;
        if (hi5.i0(str2)) {
            Objects.toString(jx7Var);
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        Range rangeC = iz.h;
        if (dh3.f(range2, rangeC)) {
            l03 l03Var2 = l03Var;
            if (r35 != 0) {
                rangeC = c(l03.f, i24, l03Var2.b(list14));
            }
        } else {
            if (r35 != 0) {
                rangeArrB = l03Var.b(list14);
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                key.getClass();
                rangeArrB = (Range[]) ((lf0) jj0Var).c(key);
            }
            Range rangeC2 = c(range2, i24, rangeArrB);
            if ((z4 != 0 || lx7Var2.j) && !rangeC2.equals(range2)) {
                StringBuilder sb = new StringBuilder("Target FPS range ");
                sb.append(range2);
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(i24);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(rangeC2);
                String string = Arrays.toString(rangeArrB);
                string.getClass();
                sb.append(". Device supported FPS ranges: ");
                sb.append(string);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            rangeC = rangeC2;
        }
        Iterator it17 = list3.iterator();
        int i25 = 0;
        while (it17.hasNext()) {
            int i26 = i25 + 1;
            er8 er8Var6 = (er8) it17.next();
            xy0 xy0VarA2 = iz.a((Size) list14.get(arrayList4.indexOf(Integer.valueOf(i25))));
            xy0VarA2.g0 = Integer.valueOf((int) r35);
            Object obj4 = linkedHashMap.get(er8Var6);
            if (obj4 == null) {
                bt.i("Required value was null.");
                return null;
            }
            xy0VarA2.f0 = (px1) obj4;
            zx zxVar2 = kl7.a;
            er8Var6.getClass();
            k05 k05VarJ = k05.j();
            zx zxVar3 = gg0.n0;
            Iterator it18 = it17;
            if (er8Var6.h(zxVar3)) {
                k05VarJ.o(zxVar3, er8Var6.d(zxVar3));
            }
            zx zxVar4 = er8.U;
            if (er8Var6.h(zxVar4)) {
                k05VarJ.o(zxVar4, er8Var6.d(zxVar4));
            }
            zx zxVar5 = y53.Y;
            if (er8Var6.h(zxVar5)) {
                k05VarJ.o(zxVar5, er8Var6.d(zxVar5));
            }
            zx zxVar6 = e63.p;
            if (er8Var6.h(zxVar6)) {
                k05VarJ.o(zxVar6, er8Var6.d(zxVar6));
            }
            xy0VarA2.i0 = new gg0(k05VarJ, (byte) 18);
            xy0VarA2.j0 = Boolean.valueOf(lx7Var2.c);
            if (!dh3.f(rangeC, iz.h)) {
                if (rangeC == null) {
                    b61.i("Null expectedFrameRateRange");
                    return null;
                }
                xy0VarA2.h0 = rangeC;
            }
            linkedHashMap16.put(er8Var6, xy0VarA2.b());
            it17 = it18;
            i25 = i26;
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        if (list2 != null) {
            List list15 = jx7Var.b;
            if (i24 == jx7Var.d) {
                int size13 = list14.size();
                list15.getClass();
                if (size13 == list15.size()) {
                    ArrayList<qg5> arrayListE1 = wv0.e1(list14, list15);
                    if (!arrayListE1.isEmpty()) {
                        for (qg5 qg5Var : arrayListE1) {
                            if (!dh3.f(qg5Var.X, qg5Var.Y)) {
                            }
                        }
                        if (!kl7.f(jj0Var, arrayList3, linkedHashMap16, linkedHashMap17)) {
                            size = list2.size();
                            i3 = 0;
                            while (i3 < size) {
                                List list16 = list2;
                                j = ((rx7) list16.get(i3)).c.X;
                                linkedHashMap5 = linkedHashMap4;
                                if (linkedHashMap5.containsKey(Integer.valueOf(i3))) {
                                    rxVar = (rx) linkedHashMap5.get(Integer.valueOf(i3));
                                    rxVar.getClass();
                                    l11 l11Var2 = rxVar.f;
                                    l11Var2.getClass();
                                    gg0VarB2 = kl7.b(l11Var2, Long.valueOf(j));
                                    if (gg0VarB2 != null) {
                                        xy0VarA = iz.a(rxVar.c);
                                        xy0VarA.g0 = Integer.valueOf(rxVar.g);
                                        range = rxVar.h;
                                        if (range != null) {
                                            b61.i("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        xy0VarA.h0 = range;
                                        px1Var = rxVar.d;
                                        if (px1Var != null) {
                                            b61.i("Null dynamicRange");
                                            return null;
                                        }
                                        xy0VarA.f0 = px1Var;
                                        xy0VarA.i0 = gg0VarB2;
                                        linkedHashMap17.put(rxVar, xy0VarA.b());
                                    }
                                    linkedHashMap6 = linkedHashMap3;
                                } else {
                                    linkedHashMap6 = linkedHashMap3;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i3))) {
                                        bt.g("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    Object obj5 = linkedHashMap6.get(Integer.valueOf(i3));
                                    obj5.getClass();
                                    er8Var = (er8) obj5;
                                    izVar = (iz) linkedHashMap16.get(er8Var);
                                    izVar.getClass();
                                    l11 l11Var3 = izVar.f;
                                    l11Var3.getClass();
                                    gg0VarB = kl7.b(l11Var3, Long.valueOf(j));
                                    if (gg0VarB != null) {
                                        xy0 xy0VarB = izVar.b();
                                        xy0VarB.i0 = gg0VarB;
                                        linkedHashMap16.put(er8Var, xy0VarB.b());
                                    }
                                }
                                i3++;
                                linkedHashMap4 = linkedHashMap5;
                                linkedHashMap3 = linkedHashMap6;
                                list2 = list16;
                            }
                        }
                    } else if (!kl7.f(jj0Var, arrayList3, linkedHashMap16, linkedHashMap17)) {
                        size = list2.size();
                        i3 = 0;
                        while (i3 < size) {
                            List list17 = list2;
                            j = ((rx7) list17.get(i3)).c.X;
                            linkedHashMap5 = linkedHashMap4;
                            if (linkedHashMap5.containsKey(Integer.valueOf(i3))) {
                                rxVar = (rx) linkedHashMap5.get(Integer.valueOf(i3));
                                rxVar.getClass();
                                l11 l11Var4 = rxVar.f;
                                l11Var4.getClass();
                                gg0VarB2 = kl7.b(l11Var4, Long.valueOf(j));
                                if (gg0VarB2 != null) {
                                    xy0VarA = iz.a(rxVar.c);
                                    xy0VarA.g0 = Integer.valueOf(rxVar.g);
                                    range = rxVar.h;
                                    if (range != null) {
                                        b61.i("Null expectedFrameRateRange");
                                        return null;
                                    }
                                    xy0VarA.h0 = range;
                                    px1Var = rxVar.d;
                                    if (px1Var != null) {
                                        b61.i("Null dynamicRange");
                                        return null;
                                    }
                                    xy0VarA.f0 = px1Var;
                                    xy0VarA.i0 = gg0VarB2;
                                    linkedHashMap17.put(rxVar, xy0VarA.b());
                                }
                                linkedHashMap6 = linkedHashMap3;
                            } else {
                                linkedHashMap6 = linkedHashMap3;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i3))) {
                                    bt.g("SurfaceConfig does not map to any use case");
                                    return null;
                                }
                                Object obj6 = linkedHashMap6.get(Integer.valueOf(i3));
                                obj6.getClass();
                                er8Var = (er8) obj6;
                                izVar = (iz) linkedHashMap16.get(er8Var);
                                izVar.getClass();
                                l11 l11Var5 = izVar.f;
                                l11Var5.getClass();
                                gg0VarB = kl7.b(l11Var5, Long.valueOf(j));
                                if (gg0VarB != null) {
                                    xy0 xy0VarB2 = izVar.b();
                                    xy0VarB2.i0 = gg0VarB;
                                    linkedHashMap16.put(er8Var, xy0VarB2.b());
                                }
                            }
                            i3++;
                            linkedHashMap4 = linkedHashMap5;
                            linkedHashMap3 = linkedHashMap6;
                            list2 = list17;
                        }
                    }
                }
            }
        }
        return new iy7(linkedHashMap16, linkedHashMap17, jx7Var.e);
    }

    public final rx7 p(int i, int i2, Size size, jl7 jl7Var) {
        size.getClass();
        jl7 jl7Var2 = rx7.e;
        return we5.p(i2, size, m(i2), i, px7.Y, jl7Var);
    }

    public final void q(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size sizeE = e((StreamConfigurationMap) this.x.c.X, i, true, rational);
        if (sizeE != null) {
            linkedHashMap.put(Integer.valueOf(i), sizeE);
        }
    }

    public final void r(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.q) {
            Size sizeE = e((StreamConfigurationMap) this.x.c.X, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeE != null) {
                size = (Size) Collections.min(i21.L(size, sizeE), new rx0(false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void s(lx7 lx7Var) {
        int i = lx7Var.a;
        boolean z = lx7Var.g;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.d;
        if (i != 0 && lx7Var.e) {
            StringBuilder sbP = p61.p("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            em7.c(oi0.p(sbP, str, " camera mode."));
            return;
        }
        if (i != 0 && lx7Var.b == 10) {
            StringBuilder sbP2 = p61.p("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            em7.c(oi0.p(sbP2, str, " camera mode."));
            return;
        }
        if (i != 0 && z) {
            StringBuilder sbP3 = p61.p("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            em7.c(oi0.p(sbP3, str, " camera mode."));
            return;
        }
        boolean z2 = lx7Var.f;
        if (z2 && z) {
            bt.q("High-speed session is not supported with feature combination");
        } else {
            if (!z2 || ((Boolean) this.C.b.getValue()).booleanValue()) {
                return;
            }
            bt.q("High-speed session is not supported on this device.");
        }
    }
}
