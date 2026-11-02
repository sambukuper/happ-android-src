package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import androidx.leanback.widget.PagingIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap0(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((as0) obj).h);
            case 6:
                return Float.valueOf(((as0) obj).i);
            case 7:
                return Float.valueOf(((cs0) obj).h);
            case 8:
                return Float.valueOf(((cs0) obj).i);
            case 9:
                return Float.valueOf(((fw1) obj).b());
            case 10:
                return Float.valueOf(((fa4) obj).h);
            case 11:
                return Float.valueOf(((ha4) obj).i);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Float.valueOf(((ng5) obj).a);
            case 13:
                return Float.valueOf(((ng5) obj).e);
            case 14:
                return Float.valueOf(((ng5) obj).c);
            case 15:
                return Float.valueOf(((SwitchCompat) obj).E0);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return Float.valueOf(by8.a.e((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                dp0 dp0Var = (dp0) obj;
                PointF pointF = (PointF) obj2;
                dp0Var.getClass();
                dp0Var.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                dp0Var.b = iRound;
                int i = dp0Var.f + 1;
                dp0Var.f = i;
                if (i == dp0Var.g) {
                    by8.a(dp0Var.e, dp0Var.a, iRound, dp0Var.c, dp0Var.d);
                    dp0Var.f = 0;
                    dp0Var.g = 0;
                }
                break;
            case 1:
                dp0 dp0Var2 = (dp0) obj;
                PointF pointF2 = (PointF) obj2;
                dp0Var2.getClass();
                dp0Var2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                dp0Var2.d = iRound2;
                int i2 = dp0Var2.g + 1;
                dp0Var2.g = i2;
                if (dp0Var2.f == i2) {
                    by8.a(dp0Var2.e, dp0Var2.a, dp0Var2.b, dp0Var2.c, iRound2);
                    dp0Var2.f = 0;
                    dp0Var2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                by8.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                by8.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                by8.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                as0 as0Var = (as0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                as0Var.h = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                c82 c82Var = as0Var.e;
                ArrayList arrayList = (ArrayList) as0Var.b;
                kw1 kw1Var = (kw1) arrayList.get(0);
                float f = as0Var.h * 1520.0f;
                kw1Var.a = (-20.0f) + f;
                kw1Var.b = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    kw1Var.b = (c82Var.getInterpolation(v3.j(i3, as0.k[i4], 667)) * 250.0f) + kw1Var.b;
                    kw1Var.a = (c82Var.getInterpolation(v3.j(i3, as0.l[i4], 667)) * 250.0f) + kw1Var.a;
                }
                float f2 = kw1Var.a;
                float f3 = kw1Var.b;
                kw1Var.a = (((f3 - f2) * as0Var.i) + f2) / 360.0f;
                kw1Var.b = f3 / 360.0f;
                for (int i5 = 0; i5 < 4; i5++) {
                    float fJ = v3.j(i3, as0.m[i5], 333);
                    if (fJ > 0.0f && fJ < 1.0f) {
                        int i6 = i5 + as0Var.g;
                        int[] iArr = as0Var.f.e;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        ((kw1) arrayList.get(0)).c = zs.a(c82Var.getInterpolation(fJ), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        ((lb3) as0Var.a).invalidateSelf();
                    }
                    break;
                }
                ((lb3) as0Var.a).invalidateSelf();
                break;
            case 6:
                ((as0) obj).i = ((Float) obj2).floatValue();
                break;
            case 7:
                cs0 cs0Var = (cs0) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                cs0Var.h = fFloatValue2;
                int i7 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = cs0Var.e;
                ArrayList arrayList2 = (ArrayList) cs0Var.b;
                kw1 kw1Var2 = (kw1) arrayList2.get(0);
                float f4 = cs0Var.h * 1080.0f;
                int[] iArr2 = cs0.l;
                float interpolation = 0.0f;
                for (int i8 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(v3.j(i7, i8, 500)) * 90.0f;
                }
                kw1Var2.g = f4 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(v3.j(i7, 0, 3000)) - timeInterpolator.getInterpolation(v3.j(i7, 3000, 3000));
                kw1Var2.a = 0.0f;
                float[] fArr = cs0.m;
                float fD = z51.D(fArr[0], fArr[1], interpolation2);
                kw1Var2.b = fD;
                float f5 = cs0Var.i;
                if (f5 > 0.0f) {
                    kw1Var2.b = (1.0f - f5) * fD;
                }
                for (int i9 = 0; i9 < iArr2.length; i9++) {
                    float fJ2 = v3.j(i7, iArr2[i9], 100);
                    if (fJ2 >= 0.0f && fJ2 <= 1.0f) {
                        int i10 = i9 + cs0Var.g;
                        int[] iArr3 = cs0Var.f.e;
                        int length3 = i10 % iArr3.length;
                        int length4 = (length3 + 1) % iArr3.length;
                        ((kw1) arrayList2.get(0)).c = zs.a(timeInterpolator.getInterpolation(fJ2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        ((lb3) cs0Var.a).invalidateSelf();
                    }
                    break;
                }
                ((lb3) cs0Var.a).invalidateSelf();
                break;
            case 8:
                ((cs0) obj).i = ((Float) obj2).floatValue();
                break;
            case 9:
                fw1 fw1Var = (fw1) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (fw1Var.k0 != fFloatValue3) {
                    fw1Var.k0 = fFloatValue3;
                    fw1Var.invalidateSelf();
                }
                break;
            case 10:
                fa4 fa4Var = (fa4) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                fa4Var.h = fFloatValue4;
                ArrayList arrayList3 = (ArrayList) fa4Var.b;
                ((kw1) arrayList3.get(0)).a = 0.0f;
                float fJ3 = v3.j((int) (fFloatValue4 * 333.0f), 0, 667);
                kw1 kw1Var3 = (kw1) arrayList3.get(0);
                kw1 kw1Var4 = (kw1) arrayList3.get(1);
                c82 c82Var2 = fa4Var.d;
                float interpolation3 = c82Var2.getInterpolation(fJ3);
                kw1Var4.a = interpolation3;
                kw1Var3.b = interpolation3;
                kw1 kw1Var5 = (kw1) arrayList3.get(1);
                kw1 kw1Var6 = (kw1) arrayList3.get(2);
                float interpolation4 = c82Var2.getInterpolation(fJ3 + 0.49925038f);
                kw1Var6.a = interpolation4;
                kw1Var5.b = interpolation4;
                ((kw1) arrayList3.get(2)).b = 1.0f;
                if (fa4Var.g && ((kw1) arrayList3.get(1)).b < 1.0f) {
                    ((kw1) arrayList3.get(2)).c = ((kw1) arrayList3.get(1)).c;
                    ((kw1) arrayList3.get(1)).c = ((kw1) arrayList3.get(0)).c;
                    ((kw1) arrayList3.get(0)).c = fa4Var.e.e[fa4Var.f];
                    fa4Var.g = false;
                }
                ((lb3) fa4Var.a).invalidateSelf();
                break;
            case 11:
                ha4 ha4Var = (ha4) obj;
                float fFloatValue5 = ((Float) obj2).floatValue();
                ha4Var.i = fFloatValue5;
                int i11 = (int) (fFloatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = ha4Var.e;
                ArrayList arrayList4 = (ArrayList) ha4Var.b;
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    kw1 kw1Var7 = (kw1) arrayList4.get(i12);
                    int[] iArr4 = ha4.l;
                    int i13 = i12 * 2;
                    int i14 = iArr4[i13];
                    int[] iArr5 = ha4.k;
                    kw1Var7.a = z91.l(interpolatorArr[i13].getInterpolation(v3.j(i11, i14, iArr5[i13])), 0.0f, 1.0f);
                    int i15 = i13 + 1;
                    kw1Var7.b = z91.l(interpolatorArr[i15].getInterpolation(v3.j(i11, iArr4[i15], iArr5[i15])), 0.0f, 1.0f);
                }
                if (ha4Var.h) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((kw1) it.next()).c = ha4Var.f.e[ha4Var.g];
                    }
                    ha4Var.h = false;
                }
                ((lb3) ha4Var.a).invalidateSelf();
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ng5 ng5Var = (ng5) obj;
                ng5Var.a = ((Float) obj2).floatValue();
                ng5Var.a();
                ng5Var.j.invalidate();
                break;
            case 13:
                ng5 ng5Var2 = (ng5) obj;
                float fFloatValue6 = ((Float) obj2).floatValue();
                ng5Var2.e = fFloatValue6;
                float f6 = fFloatValue6 / 2.0f;
                ng5Var2.f = f6;
                PagingIndicator pagingIndicator = ng5Var2.j;
                ng5Var2.g = f6 * pagingIndicator.A0;
                pagingIndicator.invalidate();
                break;
            case 14:
                ng5 ng5Var3 = (ng5) obj;
                ng5Var3.c = ((Float) obj2).floatValue() * ng5Var3.h * ng5Var3.i;
                ng5Var3.j.invalidate();
                break;
            case 15:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                by8.a.f((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
