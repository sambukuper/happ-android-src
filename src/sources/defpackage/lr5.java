package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Region;
import android.os.Build;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.enums.EConfigObservatoryType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.ServerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lr5 implements lt4, i04, bd6, k71, tx6, v17, rr6, xo2, vs, fa5, k5, rr8, xk, mu8, u4 {
    public final /* synthetic */ byte X;
    public Object Y;

    public lr5(long[] jArr) {
        zz4 zz4Var;
        this.X = (byte) 14;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            zz4Var = new zz4(jArrCopyOf.length);
            int i = zz4Var.b;
            if (i < 0) {
                kp5.k(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                zz4Var.c(jArrCopyOf.length + i);
                long[] jArr2 = zz4Var.a;
                int i2 = zz4Var.b;
                if (i != i2) {
                    eu.f0(jArr2, jArr2, jArrCopyOf.length + i, i, i2);
                }
                eu.f0(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                zz4Var.b += jArrCopyOf.length;
            }
        } else {
            zz4Var = new zz4();
        }
        this.Y = zz4Var;
    }

    public static boolean y(String str) {
        boolean z = false;
        for (String str2 : u15.x()) {
            String strO = pc6.o(str2, str);
            if (new File(str2, str).exists()) {
                strO.concat(" binary detected!");
                u15.y();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ju8
    public wk A(wk wkVar, wk wkVar2, wk wkVar3) {
        return ((yr6) this.Y).A(wkVar, wkVar2, wkVar3);
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0361  */
    /* JADX WARN: Code duplicated, block: B:160:0x036c  */
    /* JADX WARN: Code duplicated, block: B:187:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:191:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:210:0x052b  */
    /* JADX WARN: Code duplicated, block: B:212:0x052f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x0531  */
    /* JADX WARN: Code duplicated, block: B:240:0x05c9 A[Catch: fr0 | oj2 -> 0x0662, TryCatch #2 {fr0 | oj2 -> 0x0662, blocks: (B:237:0x05af, B:238:0x05c5, B:240:0x05c9, B:241:0x05cc, B:243:0x05d0, B:245:0x05da, B:246:0x05e0, B:248:0x05e5), top: B:285:0x05af }] */
    /* JADX WARN: Code duplicated, block: B:243:0x05d0 A[Catch: fr0 | oj2 -> 0x0662, TryCatch #2 {fr0 | oj2 -> 0x0662, blocks: (B:237:0x05af, B:238:0x05c5, B:240:0x05c9, B:241:0x05cc, B:243:0x05d0, B:245:0x05da, B:246:0x05e0, B:248:0x05e5), top: B:285:0x05af }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05da A[Catch: fr0 | oj2 -> 0x0662, TryCatch #2 {fr0 | oj2 -> 0x0662, blocks: (B:237:0x05af, B:238:0x05c5, B:240:0x05c9, B:241:0x05cc, B:243:0x05d0, B:245:0x05da, B:246:0x05e0, B:248:0x05e5), top: B:285:0x05af }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0537 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x05e0 A[SYNTHETIC] */
    public vj6 B(dq dqVar) throws f65, fr0, oj2 {
        qa2 qa2Var;
        qa2 qa2Var2;
        qa2 qa2Var3;
        float f;
        float f2;
        w8 w8VarM;
        float f3;
        float f4;
        float f5;
        float f6;
        byte b;
        xj6[] xj6VarArr;
        fr0 fr0Var;
        w50 w50Var;
        int i;
        v67 v67VarM;
        int i2;
        int i3;
        boolean z;
        double d;
        int i4;
        int i5;
        int iAbs;
        wl6 wl6Var = (wl6) this.Y;
        w50 w50VarT = dqVar.t();
        yr2 yr2Var = new yr2((Object) w50VarT, (byte) 26);
        int i6 = 0;
        sa2 sa2Var = new sa2(w50VarT, (byte) 0);
        ArrayList arrayList = (ArrayList) sa2Var.c;
        int i7 = w50VarT.Y;
        int i8 = w50VarT.X;
        int i9 = (i7 * 3) / 388;
        int i10 = 3;
        if (i9 < 3) {
            i9 = 3;
        }
        char c = 5;
        int[] iArr = new int[5];
        int i11 = i9 - 1;
        boolean zG = false;
        while (true) {
            char c2 = c;
            int i12 = 1;
            int i13 = 4;
            if (i11 >= i7 || zG) {
                break;
            }
            Arrays.fill(iArr, i6);
            int i14 = i10;
            int i15 = i6;
            while (i15 < i8) {
                if (w50VarT.b(i15, i11)) {
                    if ((i6 & 1) == i12) {
                        i6++;
                    }
                    iArr[i6] = iArr[i6] + i12;
                    i4 = i13;
                } else if ((i6 & 1) != 0) {
                    i4 = i13;
                    iArr[i6] = iArr[i6] + 1;
                } else if (i6 == i13) {
                    if (!sa2.e(iArr)) {
                        int i16 = i12;
                        i4 = i13;
                        iArr[0] = iArr[2];
                        iArr[i16] = iArr[i14];
                        iArr[2] = iArr[i4];
                        iArr[i14] = i16;
                        iArr[i4] = 0;
                    } else if (sa2Var.f(i11, i15, iArr)) {
                        if (sa2Var.b) {
                            zG = sa2Var.g();
                            i4 = i13;
                            i5 = 2;
                        } else {
                            if (arrayList.size() > i12) {
                                Iterator it = arrayList.iterator();
                                qa2 qa2Var4 = null;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i4 = i13;
                                        i5 = 2;
                                        iAbs = 0;
                                        break;
                                    }
                                    qa2 qa2Var5 = (qa2) it.next();
                                    i4 = i13;
                                    if (qa2Var5.d >= 2) {
                                        if (qa2Var4 != null) {
                                            sa2Var.b = true;
                                            i5 = 2;
                                            iAbs = ((int) (Math.abs(qa2Var4.a - qa2Var5.a) - Math.abs(qa2Var4.b - qa2Var5.b))) / 2;
                                            break;
                                        }
                                        qa2Var4 = qa2Var5;
                                    }
                                    i13 = i4;
                                }
                            } else {
                                i4 = i13;
                                iAbs = 0;
                                i5 = 2;
                            }
                            int i17 = iArr[i5];
                            if (iAbs > i17) {
                                i11 += (iAbs - i17) - 2;
                                i15 = i8 - 1;
                            }
                        }
                        i6 = 0;
                        Arrays.fill(iArr, 0);
                        i9 = i5;
                    } else {
                        i4 = i13;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i14];
                        iArr[2] = iArr[i4];
                        iArr[i14] = 1;
                        iArr[i4] = 0;
                    }
                    i6 = i14;
                } else {
                    i4 = i13;
                    i6++;
                    iArr[i6] = iArr[i6] + 1;
                }
                i15++;
                i13 = i4;
                i12 = 1;
            }
            if (sa2.e(iArr) && sa2Var.f(i11, i8, iArr)) {
                int i18 = iArr[0];
                if (sa2Var.b) {
                    zG = sa2Var.g();
                }
                i9 = i18;
            }
            i11 += i9;
            c = c2;
            i10 = i14;
            i6 = 0;
        }
        if (arrayList.size() < i10) {
            throw f65.a();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((qa2) it2.next()).d < 2) {
                it2.remove();
            }
        }
        Collections.sort(arrayList, sa2.e);
        qa2[] qa2VarArr = new qa2[3];
        int i19 = 0;
        double d2 = Double.MAX_VALUE;
        for (int i20 = 2; i19 < arrayList.size() - i20; i20 = 2) {
            qa2 qa2Var6 = (qa2) arrayList.get(i19);
            float f7 = qa2Var6.c;
            i19++;
            int i21 = i19;
            while (i21 < arrayList.size() - 1) {
                qa2 qa2Var7 = (qa2) arrayList.get(i21);
                double dM = sa2.m(qa2Var6, qa2Var7);
                i21++;
                int i22 = i21;
                while (i22 < arrayList.size()) {
                    qa2 qa2Var8 = (qa2) arrayList.get(i22);
                    qa2[] qa2VarArr2 = qa2VarArr;
                    if (qa2Var8.c <= 1.4f * f7) {
                        double dM2 = sa2.m(qa2Var7, qa2Var8);
                        double dM3 = sa2.m(qa2Var6, qa2Var8);
                        if (dM < dM2) {
                            if (dM2 <= dM3) {
                                dM3 = dM2;
                                dM2 = dM3;
                            } else if (dM >= dM3) {
                                d = dM3;
                                dM3 = dM;
                            }
                            d = dM;
                        } else {
                            if (dM2 >= dM3) {
                                d = dM3;
                                dM3 = dM2;
                            } else if (dM < dM3) {
                                d = dM2;
                                dM2 = dM3;
                                dM3 = dM;
                            } else {
                                d = dM2;
                            }
                            dM2 = dM;
                        }
                        double dAbs = Math.abs(dM2 - (d * 2.0d)) + Math.abs(dM2 - (dM3 * 2.0d));
                        if (dAbs < d2) {
                            qa2VarArr2[0] = qa2Var6;
                            qa2VarArr2[1] = qa2Var7;
                            qa2VarArr2[2] = qa2Var8;
                            d2 = dAbs;
                        }
                    }
                    i22++;
                    qa2VarArr = qa2VarArr2;
                }
            }
        }
        qa2[] qa2VarArr3 = qa2VarArr;
        if (d2 == Double.MAX_VALUE) {
            throw f65.a();
        }
        float fA = xj6.a(qa2VarArr3[0], qa2VarArr3[1]);
        float fA2 = xj6.a(qa2VarArr3[1], qa2VarArr3[2]);
        float fA3 = xj6.a(qa2VarArr3[0], qa2VarArr3[2]);
        if (fA2 >= fA && fA2 >= fA3) {
            qa2Var = qa2VarArr3[0];
            qa2Var2 = qa2VarArr3[1];
            qa2Var3 = qa2VarArr3[2];
        } else if (fA3 < fA2 || fA3 < fA) {
            qa2Var = qa2VarArr3[2];
            qa2Var2 = qa2VarArr3[0];
            qa2Var3 = qa2VarArr3[1];
        } else {
            qa2Var = qa2VarArr3[1];
            qa2Var2 = qa2VarArr3[0];
            qa2Var3 = qa2VarArr3[2];
        }
        float f8 = qa2Var.a;
        float f9 = qa2Var.b;
        if (((qa2Var2.b - f9) * (qa2Var3.a - f8)) - ((qa2Var2.a - f8) * (qa2Var3.b - f9)) < 0.0f) {
            qa2 qa2Var9 = qa2Var3;
            qa2Var3 = qa2Var2;
            qa2Var2 = qa2Var9;
        }
        qa2VarArr3[0] = qa2Var2;
        qa2VarArr3[1] = qa2Var;
        qa2VarArr3[2] = qa2Var3;
        float fH = yr2Var.h(qa2Var, qa2Var3);
        float f10 = qa2Var.a;
        float f11 = qa2Var3.b;
        float f12 = qa2Var3.a;
        float fH2 = yr2Var.h(qa2Var, qa2Var2);
        float f13 = qa2Var2.b;
        float f14 = qa2Var2.a;
        float f15 = (fH2 + fH) / 2.0f;
        if (f15 < 1.0f) {
            throw f65.a();
        }
        float fA4 = xj6.a(qa2Var, qa2Var3) / f15;
        int i23 = (int) (fA4 + (fA4 < 0.0f ? -0.5f : 0.5f));
        float fA5 = xj6.a(qa2Var, qa2Var2) / f15;
        int i24 = (((int) (fA5 + (fA5 >= 0.0f ? 0.5f : -0.5f))) + i23) / 2;
        int i25 = i24 + 7;
        int i26 = i25 & 3;
        if (i26 == 0) {
            i25 = i24 + 8;
        } else if (i26 == 2) {
            i25 = i24 + 6;
        } else if (i26 == 3) {
            i25 = i24 + 5;
        }
        int i27 = i25;
        int[] iArr2 = av8.e;
        if (i27 % 4 != 1) {
            throw oj2.a();
        }
        try {
            av8 av8VarC = av8.c((i27 - 17) / 4);
            int i28 = (av8VarC.a * 4) + 10;
            if (av8VarC.b.length > 0) {
                float f16 = (f12 - f10) + f14;
                f2 = f12;
                float f17 = (f11 - f9) + f13;
                float f18 = 1.0f - (3.0f / i28);
                int iE = (int) p61.e(f16, f10, f18, f10);
                int iE2 = (int) p61.e(f17, f9, f18, f9);
                f = f9;
                int i29 = 4;
                while (true) {
                    if (i29 <= 16) {
                        try {
                            w8VarM = yr2Var.m(f15, i29, iE, iE2);
                            break;
                        } catch (f65 unused) {
                            i29 <<= 1;
                        }
                    }
                }
                f3 = i27 - 3.5f;
                if (w8VarM != null) {
                    f4 = w8VarM.a;
                    f5 = w8VarM.b;
                    f6 = f3 - 3.0f;
                } else {
                    f4 = (f2 - f10) + f14;
                    f5 = (f11 - f) + f13;
                    f6 = f3;
                }
                float f19 = f5;
                float f20 = qa2Var.a;
                float f21 = qa2Var.b;
                float f22 = qa2Var3.a;
                float f23 = qa2Var3.b;
                float f24 = qa2Var2.a;
                float f25 = qa2Var2.b;
                w8 w8Var = w8VarM;
                wm5 wm5VarA = wm5.a(3.5f, 3.5f, f3, 3.5f, f6, f6, 3.5f, f3);
                qa2 qa2Var10 = qa2Var;
                float f26 = wm5VarA.e;
                float f27 = wm5VarA.i;
                float f28 = f26 * f27;
                float f29 = wm5VarA.f;
                float f30 = wm5VarA.h;
                float f31 = f28 - (f29 * f30);
                float f32 = wm5VarA.g;
                float f33 = f29 * f32;
                float f34 = wm5VarA.d;
                float f35 = f33 - (f34 * f27);
                float f36 = (f34 * f30) - (f26 * f32);
                float f37 = wm5VarA.c;
                float f38 = f37 * f30;
                float f39 = wm5VarA.b;
                float f40 = f38 - (f39 * f27);
                float f41 = wm5VarA.a;
                float f42 = (f27 * f41) - (f37 * f32);
                float f43 = (f32 * f39) - (f30 * f41);
                float f44 = (f39 * f29) - (f37 * f26);
                float f45 = (f37 * f34) - (f29 * f41);
                float f46 = (f41 * f26) - (f39 * f34);
                wm5 wm5VarA2 = wm5.a(f20, f21, f22, f23, f4, f19, f24, f25);
                float f47 = wm5VarA2.a;
                float f48 = wm5VarA2.d;
                float f49 = wm5VarA2.g;
                float f50 = (f49 * f44) + (f48 * f40) + (f47 * f31);
                float f51 = (f49 * f45) + (f48 * f42) + (f47 * f35);
                float f52 = (f49 * f46) + (f48 * f43) + (f47 * f36);
                float f53 = wm5VarA2.b;
                float f54 = wm5VarA2.e;
                float f55 = wm5VarA2.h;
                float f56 = (f55 * f44) + (f54 * f40) + (f53 * f31);
                float f57 = (f55 * f45) + (f54 * f42) + (f53 * f35);
                float f58 = (f55 * f46) + (f54 * f43) + (f53 * f36);
                float f59 = wm5VarA2.c;
                float f60 = wm5VarA2.f;
                float f61 = wm5VarA2.i;
                float f62 = (f44 * f61) + (f40 * f60) + (f31 * f59);
                float f63 = (f45 * f61) + (f42 * f60) + (f35 * f59);
                float f64 = (f61 * f46) + (f60 * f43) + (f59 * f36);
                if (i27 > 0 || i27 <= 0) {
                    throw f65.a();
                }
                w50 w50Var2 = new w50(i27, i27);
                int i30 = i27 * 2;
                float[] fArr = new float[i30];
                int i31 = 0;
                while (i31 < i27) {
                    qa2 qa2Var11 = qa2Var2;
                    float f65 = i31 + 0.5f;
                    int i32 = i31;
                    int i33 = 0;
                    while (i33 < i30) {
                        int i34 = i33;
                        fArr[i34] = (i34 / 2) + 0.5f;
                        fArr[i34 + 1] = f65;
                        i33 = i34 + 2;
                    }
                    int i35 = i30 - 1;
                    for (int i36 = 0; i36 < i35; i36 += 2) {
                        float f66 = fArr[i36];
                        int i37 = i36 + 1;
                        float f67 = fArr[i37];
                        float f68 = (f63 * f67) + (f62 * f66) + f64;
                        fArr[i36] = (((f51 * f67) + (f50 * f66)) + f52) / f68;
                        fArr[i37] = (((f67 * f57) + (f66 * f56)) + f58) / f68;
                    }
                    qa2 qa2Var12 = qa2Var3;
                    int i38 = 0;
                    boolean z2 = true;
                    while (i38 < i35 && z2) {
                        int i39 = (int) fArr[i38];
                        int i40 = i38 + 1;
                        int i41 = i35;
                        int i42 = (int) fArr[i40];
                        int i43 = i38;
                        if (i39 < -1 || i39 > i8 || i42 < -1 || i42 > i7) {
                            throw f65.a();
                        }
                        if (i39 == -1) {
                            fArr[i43] = 0.0f;
                        } else {
                            if (i39 == i8) {
                                fArr[i43] = i8 - 1;
                            } else {
                                z = false;
                            }
                            if (i42 == -1) {
                                fArr[i40] = 0.0f;
                            } else {
                                if (i42 == i7) {
                                    fArr[i40] = i7 - 1;
                                } else {
                                    z2 = z;
                                }
                                i38 = i43 + 2;
                                i35 = i41;
                            }
                            z2 = true;
                            i38 = i43 + 2;
                            i35 = i41;
                        }
                        z = true;
                        if (i42 == -1) {
                            fArr[i40] = 0.0f;
                        } else {
                            if (i42 == i7) {
                                fArr[i40] = i7 - 1;
                            } else {
                                z2 = z;
                            }
                            i38 = i43 + 2;
                            i35 = i41;
                        }
                        z2 = true;
                        i38 = i43 + 2;
                        i35 = i41;
                    }
                    int i44 = i30 - 2;
                    boolean z3 = true;
                    while (i44 >= 0 && z3) {
                        int i45 = (int) fArr[i44];
                        int i46 = i44 + 1;
                        int i47 = i44;
                        int i48 = (int) fArr[i46];
                        if (i45 < -1 || i45 > i8 || i48 < -1 || i48 > i7) {
                            throw f65.a();
                        }
                        if (i45 == -1) {
                            fArr[i47] = 0.0f;
                        } else {
                            if (i45 == i8) {
                                fArr[i47] = i8 - 1;
                            } else {
                                z3 = false;
                            }
                            if (i48 == -1) {
                                fArr[i46] = 0.0f;
                            } else {
                                if (i48 == i7) {
                                    fArr[i46] = i7 - 1;
                                }
                                i44 = i47 - 2;
                            }
                            z3 = true;
                            i44 = i47 - 2;
                        }
                        z3 = true;
                        if (i48 == -1) {
                            fArr[i46] = 0.0f;
                        } else {
                            if (i48 == i7) {
                                fArr[i46] = i7 - 1;
                            }
                            i44 = i47 - 2;
                        }
                        z3 = true;
                        i44 = i47 - 2;
                    }
                    for (int i49 = 0; i49 < i30; i49 += 2) {
                        try {
                            if (w50VarT.b((int) fArr[i49], (int) fArr[i49 + 1])) {
                                int i50 = i49 / 2;
                                int i51 = (i50 / 32) + (w50Var2.Z * i32);
                                int[] iArr3 = w50Var2.f0;
                                iArr3[i51] = iArr3[i51] | (1 << (i50 & 31));
                            }
                        } catch (ArrayIndexOutOfBoundsException unused2) {
                            throw f65.a();
                        }
                    }
                    i31 = i32 + 1;
                    qa2Var2 = qa2Var11;
                    qa2Var3 = qa2Var12;
                }
                qa2 qa2Var13 = qa2Var2;
                qa2 qa2Var14 = qa2Var3;
                if (w8Var == null) {
                    b = 1;
                    xj6VarArr = new xj6[]{qa2Var13, qa2Var10, qa2Var14};
                } else {
                    b = 1;
                    xj6VarArr = new xj6[]{qa2Var13, qa2Var10, qa2Var14, w8Var};
                }
                sa2 sa2Var2 = new sa2(w50Var2, b);
                try {
                    v67VarM = wl6Var.M(sa2Var2);
                } catch (fr0 e) {
                    fr0Var = e;
                    e = null;
                    try {
                        sa2Var2.l();
                        sa2Var2.c = null;
                        sa2Var2.d = null;
                        sa2Var2.b = true;
                        sa2Var2.k();
                        sa2Var2.j();
                        w50Var = (w50) sa2Var2.a;
                        i = 0;
                        while (i < w50Var.X) {
                            int i52 = i + 1;
                            for (i2 = i52; i2 < w50Var.Y; i2++) {
                                if (w50Var.b(i, i2) != w50Var.b(i2, i)) {
                                    w50Var.a(i2, i);
                                    w50Var.a(i, i2);
                                }
                            }
                            i = i52;
                        }
                        v67 v67VarM2 = wl6Var.M(sa2Var2);
                        v67VarM2.h = new g55((byte) 9);
                        v67VarM = v67VarM2;
                    } catch (fr0 | oj2 unused3) {
                        if (e != null) {
                            throw e;
                        }
                        throw fr0Var;
                    }
                } catch (oj2 e2) {
                    e = e2;
                    fr0Var = null;
                    sa2Var2.l();
                    sa2Var2.c = null;
                    sa2Var2.d = null;
                    sa2Var2.b = true;
                    sa2Var2.k();
                    sa2Var2.j();
                    w50Var = (w50) sa2Var2.a;
                    i = 0;
                    while (i < w50Var.X) {
                        int i53 = i + 1;
                        while (i2 < w50Var.Y) {
                            if (w50Var.b(i, i2) != w50Var.b(i2, i)) {
                                w50Var.a(i2, i);
                                w50Var.a(i, i2);
                            }
                        }
                        i = i53;
                    }
                    v67 v67VarM3 = wl6Var.M(sa2Var2);
                    v67VarM3.h = new g55((byte) 9);
                    v67VarM = v67VarM3;
                }
                int i54 = v67VarM.a;
                if (((g55) v67VarM.h) != null && xj6VarArr.length >= 3) {
                    xj6 xj6Var = xj6VarArr[0];
                    xj6VarArr[0] = xj6VarArr[2];
                    xj6VarArr[2] = xj6Var;
                }
                vj6 vj6Var = new vj6((String) v67VarM.d);
                List list = (List) v67VarM.e;
                if (list != null) {
                    vj6Var.a(wj6.X, list);
                }
                String str = (String) v67VarM.f;
                if (str != null) {
                    vj6Var.a(wj6.Y, str);
                }
                if (i54 >= 0 && (i3 = v67VarM.b) >= 0) {
                    vj6Var.a(wj6.f0, Integer.valueOf(i3));
                    vj6Var.a(wj6.g0, Integer.valueOf(i54));
                }
                vj6Var.a(wj6.Z, (Integer) v67VarM.g);
                vj6Var.a(wj6.h0, "]Q" + v67VarM.c);
                return vj6Var;
            }
            f = f9;
            f2 = f12;
            w8VarM = null;
            f3 = i27 - 3.5f;
            if (w8VarM != null) {
                f4 = w8VarM.a;
                f5 = w8VarM.b;
                f6 = f3 - 3.0f;
            } else {
                f4 = (f2 - f10) + f14;
                f5 = (f11 - f) + f13;
                f6 = f3;
            }
            float f110 = f5;
            float f210 = qa2Var.a;
            float f211 = qa2Var.b;
            float f212 = qa2Var3.a;
            float f213 = qa2Var3.b;
            float f214 = qa2Var2.a;
            float f215 = qa2Var2.b;
            w8 w8Var2 = w8VarM;
            wm5 wm5VarA3 = wm5.a(3.5f, 3.5f, f3, 3.5f, f6, f6, 3.5f, f3);
            qa2 qa2Var15 = qa2Var;
            float f216 = wm5VarA3.e;
            float f217 = wm5VarA3.i;
            float f218 = f216 * f217;
            float f219 = wm5VarA3.f;
            float f310 = wm5VarA3.h;
            float f311 = f218 - (f219 * f310);
            float f312 = wm5VarA3.g;
            float f313 = f219 * f312;
            float f314 = wm5VarA3.d;
            float f315 = f313 - (f314 * f217);
            float f316 = (f314 * f310) - (f216 * f312);
            float f317 = wm5VarA3.c;
            float f318 = f317 * f310;
            float f319 = wm5VarA3.b;
            float f410 = f318 - (f319 * f217);
            float f411 = wm5VarA3.a;
            float f412 = (f217 * f411) - (f317 * f312);
            float f413 = (f312 * f319) - (f310 * f411);
            float f414 = (f319 * f219) - (f317 * f216);
            float f415 = (f317 * f314) - (f219 * f411);
            float f416 = (f411 * f216) - (f319 * f314);
            wm5 wm5VarA4 = wm5.a(f210, f211, f212, f213, f4, f110, f214, f215);
            float f417 = wm5VarA4.a;
            float f418 = wm5VarA4.d;
            float f419 = wm5VarA4.g;
            float f510 = (f419 * f414) + (f418 * f410) + (f417 * f311);
            float f511 = (f419 * f415) + (f418 * f412) + (f417 * f315);
            float f512 = (f419 * f416) + (f418 * f413) + (f417 * f316);
            float f513 = wm5VarA4.b;
            float f514 = wm5VarA4.e;
            float f515 = wm5VarA4.h;
            float f516 = (f515 * f414) + (f514 * f410) + (f513 * f311);
            float f517 = (f515 * f415) + (f514 * f412) + (f513 * f315);
            float f518 = (f515 * f416) + (f514 * f413) + (f513 * f316);
            float f519 = wm5VarA4.c;
            float f69 = wm5VarA4.f;
            float f610 = wm5VarA4.i;
            float f611 = (f414 * f610) + (f410 * f69) + (f311 * f519);
            float f612 = (f415 * f610) + (f412 * f69) + (f315 * f519);
            float f613 = (f610 * f416) + (f69 * f413) + (f519 * f316);
            if (i27 > 0) {
            }
            throw f65.a();
        } catch (IllegalArgumentException unused4) {
            throw oj2.a();
        }
    }

    public boolean C(ArrayList arrayList) {
        PackageManager packageManager = ((HappApplication) this.Y).getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                u15.k(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    public boolean E() {
        boolean z;
        String[] strArrSplit;
        boolean z2;
        String[] strArrSplit2;
        boolean z3;
        String str;
        Process processExec;
        boolean z4;
        if (C(new ArrayList(Arrays.asList(u15.a)))) {
            z = true;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(u15.b));
            if (C(arrayList) || y("su")) {
                z = true;
            } else {
                HashMap map = new HashMap();
                map.put("ro.debuggable", "1");
                map.put("ro.secure", "0");
                try {
                    InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
                    strArrSplit = inputStream == null ? null : new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                } catch (IOException | NoSuchElementException e) {
                    e.printStackTrace();
                }
                if (strArrSplit == null) {
                    z2 = false;
                } else {
                    z2 = false;
                    for (String str2 : strArrSplit) {
                        for (String str3 : map.keySet()) {
                            if (str2.contains(str3)) {
                                String strP = pc6.p("[", (String) map.get(str3), "]");
                                if (str2.contains(strP)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str3);
                                    sb.append(" = ");
                                    sb.append(strP);
                                    sb.append(" detected!");
                                    u15.y();
                                    z2 = true;
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    try {
                        InputStream inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
                        strArrSplit2 = inputStream2 == null ? null : new Scanner(inputStream2).useDelimiter("\\A").next().split("\n");
                    } catch (IOException | NoSuchElementException e2) {
                        e2.printStackTrace();
                    }
                    if (strArrSplit2 == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                        for (String str4 : strArrSplit2) {
                            String[] strArrSplit3 = str4.split(" ");
                            if (strArrSplit3.length < 6) {
                                u15.k("Error formatting mount line: ".concat(str4));
                            } else {
                                String str5 = strArrSplit3[2];
                                String strReplace = strArrSplit3[5];
                                String[] strArr = u15.d;
                                for (int i = 0; i < 7; i++) {
                                    String str6 = strArr[i];
                                    if (str5.equalsIgnoreCase(str6)) {
                                        strReplace = strReplace.replace("(", _UrlKt.FRAGMENT_ENCODE_SET).replace(")", _UrlKt.FRAGMENT_ENCODE_SET);
                                        for (String str7 : strReplace.split(",")) {
                                            if (str7.equalsIgnoreCase("rw")) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str6);
                                                sb2.append(" path is mounted with rw permissions! ");
                                                sb2.append(str4);
                                                u15.y();
                                                z3 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z3 || ((str = Build.TAGS) != null && str.contains("test-keys"))) {
                        z = true;
                    } else {
                        try {
                            processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                            try {
                                z4 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                                processExec.destroy();
                            } catch (Throwable unused) {
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                                z4 = false;
                            }
                        } catch (Throwable unused2) {
                            processExec = null;
                        }
                        if (z4) {
                            z = true;
                        } else {
                            if (RootBeerNative.a) {
                                String[] strArrX = u15.x();
                                int length = strArrX.length;
                                String[] strArr2 = new String[length];
                                for (int i2 = 0; i2 < length; i2++) {
                                    strArr2[i2] = oi0.p(new StringBuilder(), strArrX[i2], "su");
                                }
                                RootBeerNative rootBeerNative = new RootBeerNative();
                                z = true;
                                try {
                                    rootBeerNative.setLogDebugMessages(true);
                                    if (rootBeerNative.checkForRoot(strArr2) <= 0) {
                                    }
                                } catch (UnsatisfiedLinkError unused3) {
                                }
                            } else {
                                u15.k("We could not load the native library to test for root");
                                z = true;
                            }
                            if (!y("magisk")) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public void F(lf3 lf3Var) {
        ((Region) this.Y).set(lf3Var.a, lf3Var.b, lf3Var.c, lf3Var.d);
    }

    @Override // defpackage.bd6
    public void K(Object obj, ed6 ed6Var) {
        switch (this.X) {
            case 6:
                d43 d43Var = (d43) obj;
                d43Var.getClass();
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) this.Y;
                String strA = remoteListenableDelegatingWorker.b.b.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                if (strA == null) {
                    bt.q("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                } else {
                    byte[] bArrK = w79.K(new kh5(strA, remoteListenableDelegatingWorker.f));
                    bArrK.getClass();
                    d43Var.h(ed6Var, bArrK);
                }
                break;
            default:
                l39 l39Var = (l39) this.Y;
                uh5 uh5Var = new uh5();
                uh5Var.X = new th5(l39Var);
                ((p43) obj).m(ed6Var, w79.K(uh5Var));
                break;
        }
    }

    @Override // defpackage.mu8, defpackage.ju8
    public boolean a() {
        return false;
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        ((sx7) this.Y).run();
    }

    @Override // defpackage.ju8
    public long d(wk wkVar, wk wkVar2, wk wkVar3) {
        return ((yr6) this.Y).d(wkVar, wkVar2, wkVar3);
    }

    @Override // defpackage.tx6
    public int e() {
        ay6 ay6Var = (ay6) this.Y;
        oh5 oh5Var = ay6Var.X;
        return ((Boolean) ay6Var.f0.getValue()).booleanValue() ? ay6Var.h0.l() - oh5Var.l() : oh5Var.l();
    }

    @Override // defpackage.u4
    public boolean f(View view) {
        yr6 yr6Var = (yr6) this.Y;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) yr6Var.g0;
        if (viewPager2.w0) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    @Override // defpackage.i04
    public void g(v15 v15Var, Object obj) {
        x66 x66Var = (x66) this.Y;
        String strB = v15Var.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                x66Var.X = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            x66Var.Y = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // defpackage.xk
    public ne2 get(int i) {
        return (te2) this.Y;
    }

    @Override // defpackage.vs
    public Object h(xx6 xx6Var, Float f, Float f2, gn2 gn2Var, wc7 wc7Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objV = u70.v(xx6Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, z68.b(0.0f, fFloatValue2, 28), (pk) this.Y, gn2Var, wc7Var);
        return objV == c71.X ? objV : (mk) objV;
    }

    @Override // defpackage.fa5
    public void i(fb9 fb9Var) {
        Exception excF = fb9Var.f();
        if (excF != null) {
            ((mm0) this.Y).f(new rj6(excF));
            return;
        }
        boolean z = fb9Var.d;
        mm0 mm0Var = (mm0) this.Y;
        if (z) {
            mm0Var.z(null);
        } else {
            mm0Var.f(fb9Var.g());
        }
    }

    @Override // defpackage.k71
    public Object j(j71 j71Var) {
        return ((uh3) this.Y).B(j71Var);
    }

    @Override // defpackage.v17
    public void k() {
        uu7 uu7Var = ((wu7) this.Y).w1;
        if (uu7Var != null) {
            MainActivity mainActivity = (MainActivity) uu7Var;
            u84 u84VarZ = ys0.z(mainActivity.X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, dm4.a, new nk4(mainActivity, null, (byte) 2), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lt4
    public boolean l(nt4 nt4Var, MenuItem menuItem) {
        jn0 jn0Var = (jn0) ((f63) this.Y).f0;
        if (jn0Var == null) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) jn0Var.Y;
        String str = (String) jn0Var.Z;
        int i = MainActivity.y1;
        int itemId = menuItem.getItemId();
        String str2 = null;
        if (itemId == e46.import_sub) {
            mainActivity.G().w(null);
            ((kr7) mainActivity.j1.getValue()).f(new zq7(str2));
            return true;
        }
        if (itemId == e46.import_clipboard) {
            mainActivity.N();
            return true;
        }
        if (itemId == e46.import_qrcode) {
            mainActivity.R();
            return true;
        }
        if (itemId == e46.import_manually) {
            mainActivity.startActivity(new Intent().setClass(mainActivity, ServerActivity.class));
            return true;
        }
        if (itemId == e46.import_json_clipboard) {
            try {
                ss8 ss8Var = ss8.a;
                String strG = ss8.g(mainActivity);
                if (TextUtils.isEmpty(strG)) {
                    mainActivity.J(m83.a, true);
                    return true;
                }
                mainActivity.Q(strG, true);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        } else if (itemId == e46.export_json_clipboard) {
            if (str != null) {
                kw2 kw2Var = kw2.a;
                if (kw2.l(mainActivity, str) == 0) {
                    pu.Q(mainActivity, y46.toast_success);
                    return true;
                }
                pu.M(mainActivity, y46.toast_failure);
                return true;
            }
        } else {
            if (itemId != e46.config_group) {
                if (itemId != e46.dialog_test) {
                    if (!dh3.f(menuItem.getTitle(), mainActivity.getString(y46.share_tv))) {
                        return false;
                    }
                    mainActivity.Z();
                    return true;
                }
                u84 u84VarZ = ys0.z(mainActivity.getX());
                nf1 nf1Var = tp1.a;
                w51.G(u84VarZ, ye1.Z, null, new nk4(mainActivity, null == true ? 1 : 0, (byte) 4), 2);
                return true;
            }
            nn1 nn1Var = new nn1(t46.dialog_create_group_config, 26, 17, null);
            nn1Var.C1 = _UrlKt.FRAGMENT_ENCODE_SET;
            nn1Var.F1 = EConfigObservatoryType.LEAST_PING;
            nn1Var.G1 = new h80((byte) 12);
            d8.a0(mainActivity, nn1Var, "DialogCreateConfigGroup");
            nn1Var.E1 = str;
            nn1Var.G1 = new zw2(nn1Var, mainActivity, (byte) 14);
            String strP = nn1Var.p(y46.create_config_group_title);
            strP.getClass();
            nn1Var.C1 = strP;
            TextView textView = nn1Var.z1;
            if (textView != null) {
                textView.setText(strP);
            }
        }
        return true;
    }

    @Override // defpackage.ju8
    public wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return ((yr6) this.Y).m(j, wkVar, wkVar2, wkVar3);
    }

    @Override // defpackage.rr6
    public qr6 o(String str) {
        str.getClass();
        return new ww7(((ax7) this.Y).g0());
    }

    @Override // defpackage.tx6
    public int p() {
        return ((ay6) this.Y).Z.l();
    }

    @Override // defpackage.v17
    public void q(String str) {
        str.getClass();
        uu7 uu7Var = ((wu7) this.Y).w1;
        if (uu7Var != null) {
            MainActivity mainActivity = (MainActivity) uu7Var;
            u84 u84VarZ = ys0.z(mainActivity.X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, ye1.Z, new fk4(mainActivity, str, null, (byte) 4), 2);
        }
    }

    @Override // defpackage.i04
    public j04 r(v15 v15Var) {
        String strB = v15Var.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new w66(this, (byte) 0);
        }
        if ("strings".equals(strB)) {
            return new w66(this, (byte) 1);
        }
        return null;
    }

    @Override // defpackage.tx6
    public int s() {
        return ((ay6) this.Y).Y.l();
    }

    @Override // defpackage.i04
    public i04 w(qs0 qs0Var, v15 v15Var) {
        return null;
    }

    @Override // defpackage.ju8
    public wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return ((yr6) this.Y).z(j, wkVar, wkVar2, wkVar3);
    }

    @Override // defpackage.i04
    public void c() {
    }

    @Override // defpackage.lt4
    public void D(nt4 nt4Var) {
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
    }

    @Override // defpackage.i04
    public void n(v15 v15Var, vs0 vs0Var) {
    }

    public /* synthetic */ lr5(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public lr5(float f, float f2, wk wkVar) {
        xk lr5Var;
        this.X = (byte) 27;
        int[] iArr = ku8.a;
        if (wkVar == null && f == 1.0f && f2 == 1500.0f) {
            lr5Var = gg1.X;
        } else if (wkVar != null) {
            lr5Var = new rb8(f, f2, wkVar);
        } else {
            lr5Var = new lr5(f, f2);
        }
        this.Y = new yr6(lr5Var);
    }

    public lr5(ax7 ax7Var) {
        this.X = (byte) 19;
        ax7Var.getClass();
        this.Y = ax7Var;
    }

    public lr5(byte b) {
        this.X = b;
        switch (b) {
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                this.Y = new Region();
                break;
            default:
                this.Y = new wl6((byte) 26);
                break;
        }
    }

    public lr5(View view) {
        this.X = (byte) 15;
        if (Build.VERSION.SDK_INT >= 30) {
            ee7 ee7Var = new ee7(view);
            ee7Var.Y = view;
            this.Y = ee7Var;
            return;
        }
        this.Y = new y45(view);
    }

    public lr5(ik0 ik0Var, zh0 zh0Var, bh3 bh3Var) {
        this.X = (byte) 25;
        this.Y = ik0Var;
        new vz7(new v38((Object) this, (byte) 9));
    }

    @Override // defpackage.i04
    public void t(v15 v15Var, qs0 qs0Var, v15 v15Var2) {
    }

    public /* synthetic */ lr5(byte b, boolean z) {
        this.X = b;
    }

    public lr5(float f, float f2) {
        this.X = (byte) 26;
        this.Y = new te2(f, f2);
    }
}
