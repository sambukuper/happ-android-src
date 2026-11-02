package defpackage;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.s6;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.RealWebSocket;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fu6 implements ov8, vl, jm, ny6 {
    public static HashSet j0;
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;
    public Object i0;

    public fu6() {
        this.X = (byte) 3;
        this.Y = new int[]{r36.abc_textfield_search_default_mtrl_alpha, r36.abc_textfield_default_mtrl_alpha, r36.abc_ab_share_pack_mtrl_alpha};
        this.Z = new int[]{r36.abc_ic_commit_search_api_mtrl_alpha, r36.abc_seekbar_tick_mark_material, r36.abc_ic_menu_share_mtrl_alpha, r36.abc_ic_menu_copy_mtrl_am_alpha, r36.abc_ic_menu_cut_mtrl_alpha, r36.abc_ic_menu_selectall_mtrl_alpha, r36.abc_ic_menu_paste_mtrl_am_alpha};
        this.f0 = new int[]{r36.abc_textfield_activated_mtrl_alpha, r36.abc_textfield_search_activated_mtrl_alpha, r36.abc_cab_background_top_mtrl_alpha, r36.abc_text_cursor_material, r36.abc_text_select_handle_left_mtrl, r36.abc_text_select_handle_middle_mtrl, r36.abc_text_select_handle_right_mtrl};
        this.g0 = new int[]{r36.abc_popup_background_mtrl_mult, r36.abc_cab_background_internal_bg, r36.abc_menu_hardkey_panel_mtrl_mult};
        this.h0 = new int[]{r36.abc_tab_indicator_material, r36.abc_textfield_search_material};
        this.i0 = new int[]{r36.abc_btn_check_material, r36.abc_btn_radio_material, r36.abc_btn_check_material_anim, r36.abc_btn_radio_material_anim};
    }

    public static Typeface C(String str, Integer num, int i) {
        int i2;
        boolean z = i == 2;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int E(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static ColorStateList F(Context context, int i) {
        int iC = d98.c(context, w26.colorControlHighlight);
        int iB = d98.b(context, w26.colorButtonNormal);
        int[] iArr = d98.b;
        int[] iArr2 = d98.d;
        int iB2 = qw0.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, d98.c, d98.f}, new int[]{iB, iB2, qw0.b(iC, i), i});
    }

    public static void M(fs6 fs6Var, String str) {
        et6 et6VarY = fs6Var.a.y(str);
        if (et6VarY == null || !(et6VarY instanceof fs6) || et6VarY == fs6Var) {
            return;
        }
        fs6 fs6Var2 = (fs6) et6VarY;
        if (fs6Var.i == null) {
            fs6Var.i = fs6Var2.i;
        }
        if (fs6Var.j == null) {
            fs6Var.j = fs6Var2.j;
        }
        if (fs6Var.k == 0) {
            fs6Var.k = fs6Var2.k;
        }
        if (fs6Var.h.isEmpty()) {
            fs6Var.h = fs6Var2.h;
        }
        try {
            if (fs6Var instanceof ft6) {
                ft6 ft6Var = (ft6) fs6Var;
                ft6 ft6Var2 = (ft6) et6VarY;
                if (ft6Var.m == null) {
                    ft6Var.m = ft6Var2.m;
                }
                if (ft6Var.n == null) {
                    ft6Var.n = ft6Var2.n;
                }
                if (ft6Var.o == null) {
                    ft6Var.o = ft6Var2.o;
                }
                if (ft6Var.p == null) {
                    ft6Var.p = ft6Var2.p;
                }
            } else {
                N((jt6) fs6Var, (jt6) et6VarY);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = fs6Var2.l;
        if (str2 != null) {
            M(fs6Var, str2);
        }
    }

    public static void N(jt6 jt6Var, jt6 jt6Var2) {
        if (jt6Var.m == null) {
            jt6Var.m = jt6Var2.m;
        }
        if (jt6Var.n == null) {
            jt6Var.n = jt6Var2.n;
        }
        if (jt6Var.o == null) {
            jt6Var.o = jt6Var2.o;
        }
        if (jt6Var.p == null) {
            jt6Var.p = jt6Var2.p;
        }
        if (jt6Var.q == null) {
            jt6Var.q = jt6Var2.q;
        }
    }

    public static void O(ss6 ss6Var, String str) {
        et6 et6VarY = ss6Var.a.y(str);
        if (et6VarY == null || !(et6VarY instanceof ss6) || et6VarY == ss6Var) {
            return;
        }
        ss6 ss6Var2 = (ss6) et6VarY;
        if (ss6Var.p == null) {
            ss6Var.p = ss6Var2.p;
        }
        if (ss6Var.q == null) {
            ss6Var.q = ss6Var2.q;
        }
        if (ss6Var.r == null) {
            ss6Var.r = ss6Var2.r;
        }
        if (ss6Var.s == null) {
            ss6Var.s = ss6Var2.s;
        }
        if (ss6Var.t == null) {
            ss6Var.t = ss6Var2.t;
        }
        if (ss6Var.u == null) {
            ss6Var.u = ss6Var2.u;
        }
        if (ss6Var.v == null) {
            ss6Var.v = ss6Var2.v;
        }
        if (ss6Var.i.isEmpty()) {
            ss6Var.i = ss6Var2.i;
        }
        if (ss6Var.o == null) {
            ss6Var.o = ss6Var2.o;
        }
        if (ss6Var.n == null) {
            ss6Var.n = ss6Var2.n;
        }
        String str2 = ss6Var2.w;
        if (str2 != null) {
            O(ss6Var, str2);
        }
    }

    public static /* synthetic */ List Q(fu6 fu6Var, wb4 wb4Var, gt4 gt4Var, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return fu6Var.P(wb4Var, gt4Var, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static gt4 V(d2 d2Var, w15 w15Var, ux4 ux4Var, int i, boolean z) {
        w15Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (d2Var instanceof iy5) {
            r62 r62Var = mu3.a;
            lt3 lt3VarA = mu3.a((iy5) d2Var, w15Var, ux4Var);
            if (lt3VarA != null) {
                return gv3.u(lt3VarA);
            }
        } else if (d2Var instanceof vy5) {
            r62 r62Var2 = mu3.a;
            lt3 lt3VarC = mu3.c((vy5) d2Var, w15Var, ux4Var);
            if (lt3VarC != null) {
                return gv3.u(lt3VarC);
            }
        } else if (d2Var instanceof cz5) {
            aq2 aq2Var = lu3.d;
            aq2Var.getClass();
            fu3 fu3Var = (fu3) ch3.y((yp2) d2Var, aq2Var);
            if (fu3Var != null) {
                int iB = p61.B(i);
                if (iB == 1) {
                    return jb5.u((cz5) d2Var, w15Var, ux4Var, true, true, z);
                }
                if (iB != 2) {
                    if (iB != 3 || (fu3Var.Y & 8) != 8) {
                        return null;
                    }
                    du3 du3Var = fu3Var.h0;
                    du3Var.getClass();
                    return new gt4(w15Var.getString(du3Var.Z).concat(w15Var.getString(du3Var.f0)));
                }
                if (fu3Var.i()) {
                    du3 du3Var2 = fu3Var.g0;
                    du3Var2.getClass();
                    return new gt4(w15Var.getString(du3Var2.Z).concat(w15Var.getString(du3Var2.f0)));
                }
            }
        }
        return null;
    }

    public static LayerDrawable W(rf6 rf6Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = rf6Var.c(context, r36.abc_star_black_48dp);
        Drawable drawableC2 = rf6Var.c(context, r36.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static boolean Z(ys6 ys6Var, long j) {
        return (ys6Var.X & j) != 0;
    }

    public static Path h0(ts6 ts6Var) {
        Path path = new Path();
        float[] fArr = ts6Var.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = ts6Var.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (ts6Var instanceof us6) {
            path.close();
        }
        if (ts6Var.h == null) {
            ts6Var.h = x(path);
        }
        return path;
    }

    public static void t(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, rs6 rs6Var) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            rs6Var.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = d26 / dSqrt3;
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (d27 < -1.0d ? 3.141592653589793d : d27 > 1.0d ? 0.0d : Math.acos(d27));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d28 = dAcos2 % 6.283185307179586d;
        double d29 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
        double d30 = d28 / ((double) iCeil);
        double d31 = d30 / 2.0d;
        double dSin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d32 = d29;
            double d33 = (((double) i2) * d30) + d32;
            double dCos2 = Math.cos(d33);
            double dSin3 = Math.sin(d33);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d34 = d33 + d30;
            double dCos3 = Math.cos(d34);
            double dSin4 = Math.sin(d34);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d29 = d32;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            rs6Var.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static boolean u(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void v0(du6 du6Var, boolean z, ht6 ht6Var) {
        int i;
        ys6 ys6Var = du6Var.a;
        float fFloatValue = (z ? ys6Var.Z : ys6Var.g0).floatValue();
        if (ht6Var instanceof bs6) {
            i = ((bs6) ht6Var).X;
        } else if (!(ht6Var instanceof cs6)) {
            return;
        } else {
            i = du6Var.a.m0.X;
        }
        int iE = E(i, fFloatValue);
        if (z) {
            du6Var.d.setColor(iE);
        } else {
            du6Var.e.setColor(iE);
        }
    }

    public static void w0(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = aq.b;
        }
        drawableMutate.setColorFilter(aq.c(i, mode));
    }

    public static r05 x(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new r05(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix z(defpackage.r05 r9, defpackage.r05 r10, defpackage.zs5 r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            ys5 r1 = r11.a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            zs5 r6 = defpackage.zs5.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu6.z(r05, r05, zs5):android.graphics.Matrix");
    }

    public void A(dt6 dt6Var, r05 r05Var) {
        Path pathW;
        if (((du6) this.f0).a.z0 == null || (pathW = w(dt6Var, r05Var)) == null) {
            return;
        }
        ((Canvas) this.Y).clipPath(pathW);
    }

    public void A0(dt6 dt6Var) {
        if (dt6Var.b == null || dt6Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.i0).peek()).invert(matrix)) {
            r05 r05Var = dt6Var.h;
            float f = r05Var.b;
            float f2 = r05Var.c;
            float fC = r05Var.c();
            r05 r05Var2 = dt6Var.h;
            float f3 = r05Var2.c;
            float fC2 = r05Var2.c();
            float fD = dt6Var.h.d();
            r05 r05Var3 = dt6Var.h;
            float[] fArr = {f, f2, fC, f3, fC2, fD, r05Var3.b, r05Var3.d()};
            matrix.preConcat(((Canvas) this.Y).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            dt6 dt6Var2 = (dt6) ((Stack) this.h0).peek();
            r05 r05Var4 = dt6Var2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (r05Var4 == null) {
                dt6Var2.h = new r05(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < r05Var4.b) {
                r05Var4.b = f8;
            }
            if (f9 < r05Var4.c) {
                r05Var4.c = f9;
            }
            if (f8 + f10 > r05Var4.c()) {
                r05Var4.d = (f8 + f10) - r05Var4.b;
            }
            if (f9 + f11 > r05Var4.d()) {
                r05Var4.e = (f9 + f11) - r05Var4.c;
            }
        }
    }

    public void B(dt6 dt6Var) {
        ht6 ht6Var = ((du6) this.f0).a.Y;
        if (ht6Var instanceof ps6) {
            G(true, dt6Var.h, (ps6) ht6Var);
        }
        ht6 ht6Var2 = ((du6) this.f0).a.f0;
        if (ht6Var2 instanceof ps6) {
            G(false, dt6Var.h, (ps6) ht6Var2);
        }
    }

    public void B0(du6 du6Var, ys6 ys6Var) {
        if (Z(ys6Var, 4096L)) {
            du6Var.a.m0 = ys6Var.m0;
        }
        if (Z(ys6Var, 2048L)) {
            du6Var.a.l0 = ys6Var.l0;
        }
        boolean Z = Z(ys6Var, 1L);
        bs6 bs6Var = bs6.Z;
        if (Z) {
            du6Var.a.Y = ys6Var.Y;
            ht6 ht6Var = ys6Var.Y;
            du6Var.b = (ht6Var == null || ht6Var == bs6Var) ? false : true;
        }
        if (Z(ys6Var, 4L)) {
            du6Var.a.Z = ys6Var.Z;
        }
        if (Z(ys6Var, 6149L)) {
            v0(du6Var, true, du6Var.a.Y);
        }
        if (Z(ys6Var, 2L)) {
            du6Var.a.F0 = ys6Var.F0;
        }
        if (Z(ys6Var, 8L)) {
            du6Var.a.f0 = ys6Var.f0;
            ht6 ht6Var2 = ys6Var.f0;
            du6Var.c = (ht6Var2 == null || ht6Var2 == bs6Var) ? false : true;
        }
        if (Z(ys6Var, 16L)) {
            du6Var.a.g0 = ys6Var.g0;
        }
        if (Z(ys6Var, 6168L)) {
            v0(du6Var, false, du6Var.a.f0);
        }
        if (Z(ys6Var, 34359738368L)) {
            du6Var.a.N0 = ys6Var.N0;
        }
        if (Z(ys6Var, 32L)) {
            ys6 ys6Var2 = du6Var.a;
            ks6 ks6Var = ys6Var.h0;
            ys6Var2.h0 = ks6Var;
            du6Var.e.setStrokeWidth(ks6Var.b(this));
        }
        if (Z(ys6Var, 64L)) {
            ys6 ys6Var3 = du6Var.a;
            Paint paint = du6Var.e;
            ys6Var3.G0 = ys6Var.G0;
            int iB = p61.B(ys6Var.G0);
            if (iB == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iB == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iB == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Z(ys6Var, 128L)) {
            ys6 ys6Var4 = du6Var.a;
            Paint paint2 = du6Var.e;
            ys6Var4.H0 = ys6Var.H0;
            int iB2 = p61.B(ys6Var.H0);
            if (iB2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iB2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iB2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Z(ys6Var, 256L)) {
            du6Var.a.i0 = ys6Var.i0;
            du6Var.e.setStrokeMiter(ys6Var.i0.floatValue());
        }
        if (Z(ys6Var, 512L)) {
            du6Var.a.j0 = ys6Var.j0;
        }
        if (Z(ys6Var, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            du6Var.a.k0 = ys6Var.k0;
        }
        Typeface typefaceC = null;
        if (Z(ys6Var, 1536L)) {
            ys6 ys6Var5 = du6Var.a;
            Paint paint3 = du6Var.e;
            ks6[] ks6VarArr = ys6Var5.j0;
            if (ks6VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = ks6VarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fB = ys6Var5.j0[i2 % length].b(this);
                    fArr[i2] = fB;
                    f += fB;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = ys6Var5.k0.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (Z(ys6Var, Http2Stream.EMIT_BUFFER_SIZE)) {
            float textSize = ((du6) this.f0).d.getTextSize();
            du6Var.a.o0 = ys6Var.o0;
            du6Var.d.setTextSize(ys6Var.o0.c(this, textSize));
            du6Var.e.setTextSize(ys6Var.o0.c(this, textSize));
        }
        if (Z(ys6Var, 8192L)) {
            du6Var.a.n0 = ys6Var.n0;
        }
        if (Z(ys6Var, 32768L)) {
            if (ys6Var.p0.intValue() == -1 && du6Var.a.p0.intValue() > 100) {
                ys6 ys6Var6 = du6Var.a;
                ys6Var6.p0 = Integer.valueOf(ys6Var6.p0.intValue() - 100);
            } else if (ys6Var.p0.intValue() != 1 || du6Var.a.p0.intValue() >= 900) {
                du6Var.a.p0 = ys6Var.p0;
            } else {
                ys6 ys6Var7 = du6Var.a;
                ys6Var7.p0 = Integer.valueOf(ys6Var7.p0.intValue() + 100);
            }
        }
        if (Z(ys6Var, 65536L)) {
            du6Var.a.I0 = ys6Var.I0;
        }
        if (Z(ys6Var, 106496L)) {
            ys6 ys6Var8 = du6Var.a;
            ArrayList arrayList = ys6Var8.n0;
            if (arrayList != null && ((f63) this.Z) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceC = C((String) it.next(), ys6Var8.p0, ys6Var8.I0)) == null) {
                }
            }
            if (typefaceC == null) {
                typefaceC = C("serif", ys6Var8.p0, ys6Var8.I0);
            }
            du6Var.d.setTypeface(typefaceC);
            du6Var.e.setTypeface(typefaceC);
        }
        if (Z(ys6Var, 131072L)) {
            ys6 ys6Var9 = du6Var.a;
            Paint paint4 = du6Var.e;
            Paint paint5 = du6Var.d;
            ys6Var9.J0 = ys6Var.J0;
            paint5.setStrikeThruText(ys6Var.J0 == 4);
            paint5.setUnderlineText(ys6Var.J0 == 2);
            paint4.setStrikeThruText(ys6Var.J0 == 4);
            paint4.setUnderlineText(ys6Var.J0 == 2);
        }
        if (Z(ys6Var, 68719476736L)) {
            du6Var.a.K0 = ys6Var.K0;
        }
        if (Z(ys6Var, _HeadersCommonKt.HEADER_LIMIT)) {
            du6Var.a.L0 = ys6Var.L0;
        }
        if (Z(ys6Var, 524288L)) {
            du6Var.a.q0 = ys6Var.q0;
        }
        if (Z(ys6Var, 2097152L)) {
            du6Var.a.s0 = ys6Var.s0;
        }
        if (Z(ys6Var, 4194304L)) {
            du6Var.a.t0 = ys6Var.t0;
        }
        if (Z(ys6Var, 8388608L)) {
            du6Var.a.u0 = ys6Var.u0;
        }
        if (Z(ys6Var, 16777216L)) {
            du6Var.a.v0 = ys6Var.v0;
        }
        if (Z(ys6Var, 33554432L)) {
            du6Var.a.w0 = ys6Var.w0;
        }
        if (Z(ys6Var, s6.MAX_EVENT_SIZE_BYTES)) {
            du6Var.a.r0 = ys6Var.r0;
        }
        if (Z(ys6Var, 268435456L)) {
            du6Var.a.z0 = ys6Var.z0;
        }
        if (Z(ys6Var, 536870912L)) {
            du6Var.a.M0 = ys6Var.M0;
        }
        if (Z(ys6Var, 1073741824L)) {
            du6Var.a.A0 = ys6Var.A0;
        }
        if (Z(ys6Var, 67108864L)) {
            du6Var.a.x0 = ys6Var.x0;
        }
        if (Z(ys6Var, 134217728L)) {
            du6Var.a.y0 = ys6Var.y0;
        }
        if (Z(ys6Var, 8589934592L)) {
            du6Var.a.D0 = ys6Var.D0;
        }
        if (Z(ys6Var, 17179869184L)) {
            du6Var.a.E0 = ys6Var.E0;
        }
        if (Z(ys6Var, 137438953472L)) {
            du6Var.a.O0 = ys6Var.O0;
        }
    }

    public void C0(du6 du6Var, et6 et6Var) {
        boolean z = et6Var.b == null;
        ys6 ys6Var = du6Var.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        ys6Var.v0 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        ys6Var.q0 = bool;
        ys6Var.r0 = null;
        ys6Var.z0 = null;
        ys6Var.l0 = fValueOf;
        ys6Var.x0 = bs6.Y;
        ys6Var.y0 = fValueOf;
        ys6Var.A0 = null;
        ys6Var.B0 = null;
        ys6Var.C0 = fValueOf;
        ys6Var.D0 = null;
        ys6Var.E0 = fValueOf;
        ys6Var.N0 = 1;
        ys6 ys6Var2 = et6Var.e;
        if (ys6Var2 != null) {
            B0(du6Var, ys6Var2);
        }
        ArrayList arrayList = ((cc0) ((f63) this.Z).Z).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (bc0 bc0Var : ((cc0) ((f63) this.Z).Z).b) {
                if (fc0.k(bc0Var.a, et6Var)) {
                    B0(du6Var, bc0Var.b);
                }
            }
        }
        ys6 ys6Var3 = et6Var.f;
        if (ys6Var3 != null) {
            B0(du6Var, ys6Var3);
        }
    }

    public void D(Throwable th) {
        kt ktVar = (kt) this.i0;
        x90 x90Var = (x90) this.h0;
        if (x90Var.e(th, false)) {
            for (Object objQ = x90Var.q(); !(objQ instanceof tp0); objQ = x90Var.q()) {
                up0.b(objQ);
                ktVar.addLast(objQ);
            }
            if (ktVar.isEmpty()) {
                return;
            }
            ((gn2) this.Z).B(new ArrayList(ktVar));
            ktVar.clear();
        }
    }

    public void D0() {
        int iE;
        ys6 ys6Var = ((du6) this.f0).a;
        ht6 ht6Var = ys6Var.D0;
        if (ht6Var instanceof bs6) {
            iE = ((bs6) ht6Var).X;
        } else if (!(ht6Var instanceof cs6)) {
            return;
        } else {
            iE = ys6Var.m0.X;
        }
        Float f = ys6Var.E0;
        if (f != null) {
            iE = E(iE, f.floatValue());
        }
        ((Canvas) this.Y).drawColor(iE);
    }

    public boolean E0() {
        Boolean bool = ((du6) this.f0).a.w0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008b A[PHI: r11 r12 r15 r17
  0x008b: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:64:0x00bb, B:47:0x0084] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:64:0x00bb, B:47:0x0084] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:64:0x00bb, B:47:0x0084] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:64:0x00bb, B:47:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void G(boolean z, r05 r05Var, ps6 ps6Var) {
        float fC;
        float f;
        float fC2;
        float f2;
        float fC3;
        float fC4;
        float fC5;
        float fC6;
        et6 et6VarY = ((f63) this.Z).y(ps6Var.X);
        int i = 0;
        int i2 = 0;
        if (et6VarY == null) {
            ht6 ht6Var = ps6Var.Y;
            du6 du6Var = (du6) this.f0;
            if (ht6Var != null) {
                v0(du6Var, z, ht6Var);
                return;
            } else if (z) {
                du6Var.b = false;
                return;
            } else {
                du6Var.c = false;
                return;
            }
        }
        boolean z2 = et6VarY instanceof ft6;
        bs6 bs6Var = bs6.Y;
        if (z2) {
            ft6 ft6Var = (ft6) et6VarY;
            String str = ft6Var.l;
            if (str != null) {
                M(ft6Var, str);
            }
            Boolean bool = ft6Var.i;
            Object[] objArr = bool != null && bool.booleanValue();
            du6 du6Var2 = (du6) this.f0;
            Paint paint = z ? du6Var2.d : du6Var2.e;
            if (objArr == true) {
                r05 r05Var2 = du6Var2.g;
                if (r05Var2 == null) {
                    r05Var2 = du6Var2.f;
                }
                ks6 ks6Var = ft6Var.m;
                fC3 = ks6Var != null ? ks6Var.d(this) : 0.0f;
                ks6 ks6Var2 = ft6Var.n;
                fC4 = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
                f2 = 0.0f;
                ks6 ks6Var3 = ft6Var.o;
                fC5 = ks6Var3 != null ? ks6Var3.d(this) : r05Var2.d;
                ks6 ks6Var4 = ft6Var.p;
                if (ks6Var4 != null) {
                    fC6 = ks6Var4.e(this);
                } else {
                    fC6 = f2;
                }
            } else {
                f2 = 0.0f;
                ks6 ks6Var5 = ft6Var.m;
                fC3 = ks6Var5 != null ? ks6Var5.c(this, 1.0f) : 0.0f;
                ks6 ks6Var6 = ft6Var.n;
                fC4 = ks6Var6 != null ? ks6Var6.c(this, 1.0f) : 0.0f;
                ks6 ks6Var7 = ft6Var.o;
                fC5 = ks6Var7 != null ? ks6Var7.c(this, 1.0f) : 1.0f;
                ks6 ks6Var8 = ft6Var.p;
                if (ks6Var8 != null) {
                    fC6 = ks6Var8.c(this, 1.0f);
                } else {
                    fC6 = f2;
                }
            }
            float f3 = fC4;
            float f4 = fC5;
            float f5 = fC6;
            float f6 = fC3;
            y0();
            this.f0 = R(ft6Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(r05Var.b, r05Var.c);
                matrix.preScale(r05Var.d, r05Var.e);
            }
            Matrix matrix2 = ft6Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = ft6Var.h.size();
            if (size == 0) {
                x0();
                du6 du6Var3 = (du6) this.f0;
                if (z) {
                    du6Var3.b = false;
                    return;
                } else {
                    du6Var3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = ft6Var.h.iterator();
            int i3 = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                xs6 xs6Var = (xs6) ((gt6) it.next());
                Float f8 = xs6Var.h;
                float fFloatValue = f8 != null ? f8.floatValue() : f2;
                if (i3 == 0 || fFloatValue >= f7) {
                    fArr[i3] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i3] = f7;
                }
                y0();
                C0((du6) this.f0, xs6Var);
                ys6 ys6Var = ((du6) this.f0).a;
                bs6 bs6Var2 = (bs6) ys6Var.x0;
                if (bs6Var2 == null) {
                    bs6Var2 = bs6Var;
                }
                iArr[i3] = E(bs6Var2.X, ys6Var.y0.floatValue());
                i3++;
                x0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                x0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i4 = ft6Var.k;
            if (i4 != 0) {
                if (i4 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i4 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            x0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((du6) this.f0).a.Z.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i);
            return;
        }
        if (!(et6VarY instanceof jt6)) {
            if (et6VarY instanceof ws6) {
                ws6 ws6Var = (ws6) et6VarY;
                ys6 ys6Var2 = ws6Var.e;
                if (z) {
                    if (Z(ys6Var2, 2147483648L)) {
                        du6 du6Var4 = (du6) this.f0;
                        ys6 ys6Var3 = du6Var4.a;
                        ht6 ht6Var2 = ws6Var.e.B0;
                        ys6Var3.Y = ht6Var2;
                        du6Var4.b = ht6Var2 != null;
                    }
                    if (Z(ws6Var.e, 4294967296L)) {
                        ((du6) this.f0).a.Z = ws6Var.e.C0;
                    }
                    if (Z(ws6Var.e, 6442450944L)) {
                        du6 du6Var5 = (du6) this.f0;
                        v0(du6Var5, z, du6Var5.a.Y);
                        return;
                    }
                    return;
                }
                if (Z(ys6Var2, 2147483648L)) {
                    du6 du6Var6 = (du6) this.f0;
                    ys6 ys6Var4 = du6Var6.a;
                    ht6 ht6Var3 = ws6Var.e.B0;
                    ys6Var4.f0 = ht6Var3;
                    du6Var6.c = ht6Var3 != null;
                }
                if (Z(ws6Var.e, 4294967296L)) {
                    ((du6) this.f0).a.g0 = ws6Var.e.C0;
                }
                if (Z(ws6Var.e, 6442450944L)) {
                    du6 du6Var7 = (du6) this.f0;
                    v0(du6Var7, z, du6Var7.a.f0);
                    return;
                }
                return;
            }
            return;
        }
        jt6 jt6Var = (jt6) et6VarY;
        String str2 = jt6Var.l;
        if (str2 != null) {
            M(jt6Var, str2);
        }
        Boolean bool2 = jt6Var.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        du6 du6Var8 = (du6) this.f0;
        Paint paint2 = z ? du6Var8.d : du6Var8.e;
        if (objArr2 == true) {
            ks6 ks6Var9 = new ks6(9, 50.0f);
            ks6 ks6Var10 = jt6Var.m;
            float fD = ks6Var10 != null ? ks6Var10.d(this) : ks6Var9.d(this);
            ks6 ks6Var11 = jt6Var.n;
            fC = ks6Var11 != null ? ks6Var11.e(this) : ks6Var9.e(this);
            ks6 ks6Var12 = jt6Var.o;
            fC2 = ks6Var12 != null ? ks6Var12.b(this) : ks6Var9.b(this);
            f = fD;
        } else {
            ks6 ks6Var13 = jt6Var.m;
            float fC7 = ks6Var13 != null ? ks6Var13.c(this, 1.0f) : 0.5f;
            ks6 ks6Var14 = jt6Var.n;
            fC = ks6Var14 != null ? ks6Var14.c(this, 1.0f) : 0.5f;
            ks6 ks6Var15 = jt6Var.o;
            f = fC7;
            fC2 = ks6Var15 != null ? ks6Var15.c(this, 1.0f) : 0.5f;
        }
        float f9 = fC;
        y0();
        this.f0 = R(jt6Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(r05Var.b, r05Var.c);
            matrix3.preScale(r05Var.d, r05Var.e);
        }
        Matrix matrix4 = jt6Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = jt6Var.h.size();
        if (size2 == 0) {
            x0();
            du6 du6Var9 = (du6) this.f0;
            if (z) {
                du6Var9.b = false;
                return;
            } else {
                du6Var9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = jt6Var.h.iterator();
        int i5 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            xs6 xs6Var2 = (xs6) ((gt6) it2.next());
            Float f11 = xs6Var2.h;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i5 == 0 || fFloatValue2 >= f10) {
                fArr2[i5] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i5] = f10;
            }
            y0();
            C0((du6) this.f0, xs6Var2);
            ys6 ys6Var5 = ((du6) this.f0).a;
            bs6 bs6Var3 = (bs6) ys6Var5.x0;
            if (bs6Var3 == null) {
                bs6Var3 = bs6Var;
            }
            iArr2[i5] = E(bs6Var3.X, ys6Var5.y0.floatValue());
            i5++;
            x0();
        }
        if (fC2 == 0.0f || size2 == 1) {
            x0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i6 = jt6Var.k;
        if (i6 != 0) {
            if (i6 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i6 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        x0();
        RadialGradient radialGradient = new RadialGradient(f, f9, fC2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((du6) this.f0).a.Z.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i2 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i2);
    }

    public boolean H() {
        Boolean bool = ((du6) this.f0).a.v0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    public void I(dt6 dt6Var, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z;
        boolean z2;
        Canvas canvas = (Canvas) this.Y;
        ht6 ht6Var = ((du6) this.f0).a.Y;
        if (ht6Var instanceof ps6) {
            et6 et6VarY = ((f63) this.Z).y(((ps6) ht6Var).X);
            if (et6VarY instanceof ss6) {
                ss6 ss6Var = (ss6) et6VarY;
                Boolean bool = ss6Var.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = ss6Var.w;
                if (str != null) {
                    O(ss6Var, str);
                }
                ks6 ks6Var = ss6Var.s;
                if (z3) {
                    fD = ks6Var != null ? ks6Var.d(this) : 0.0f;
                    ks6 ks6Var2 = ss6Var.t;
                    fE2 = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
                    ks6 ks6Var3 = ss6Var.u;
                    fD2 = ks6Var3 != null ? ks6Var3.d(this) : 0.0f;
                    ks6 ks6Var4 = ss6Var.v;
                    fE = ks6Var4 != null ? ks6Var4.e(this) : 0.0f;
                } else {
                    float fC = ks6Var != null ? ks6Var.c(this, 1.0f) : 0.0f;
                    ks6 ks6Var5 = ss6Var.t;
                    float fC2 = ks6Var5 != null ? ks6Var5.c(this, 1.0f) : 0.0f;
                    ks6 ks6Var6 = ss6Var.u;
                    float fC3 = ks6Var6 != null ? ks6Var6.c(this, 1.0f) : 0.0f;
                    ks6 ks6Var7 = ss6Var.v;
                    float fC4 = ks6Var7 != null ? ks6Var7.c(this, 1.0f) : 0.0f;
                    r05 r05Var = dt6Var.h;
                    float f = r05Var.b;
                    float f2 = r05Var.d;
                    float f3 = (fC * f2) + f;
                    float f4 = r05Var.c;
                    float f5 = r05Var.e;
                    float f6 = fC3 * f2;
                    fE = fC4 * f5;
                    fD = f3;
                    fE2 = (fC2 * f5) + f4;
                    fD2 = f6;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                zs5 zs5Var = ss6Var.n;
                if (zs5Var == null) {
                    zs5Var = zs5.d;
                }
                y0();
                canvas.clipPath(path);
                du6 du6Var = new du6();
                B0(du6Var, ys6.a());
                du6Var.a.q0 = Boolean.FALSE;
                S(ss6Var, du6Var);
                this.f0 = du6Var;
                r05 r05Var2 = dt6Var.h;
                Matrix matrix = ss6Var.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (ss6Var.r.invert(matrix2)) {
                        r05 r05Var3 = dt6Var.h;
                        float f7 = r05Var3.b;
                        float f8 = r05Var3.c;
                        float fC5 = r05Var3.c();
                        z = true;
                        r05 r05Var4 = dt6Var.h;
                        z2 = false;
                        float f9 = r05Var4.c;
                        float fC6 = r05Var4.c();
                        float fD3 = dt6Var.h.d();
                        r05 r05Var5 = dt6Var.h;
                        float[] fArr = {f7, f8, fC5, f9, fC6, fD3, r05Var5.b, r05Var5.d()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            float f12 = fArr[i];
                            if (f12 < rectF.left) {
                                rectF.left = f12;
                            }
                            if (f12 > rectF.right) {
                                rectF.right = f12;
                            }
                            float f13 = fArr[i + 1];
                            if (f13 < rectF.top) {
                                rectF.top = f13;
                            }
                            if (f13 > rectF.bottom) {
                                rectF.bottom = f13;
                            }
                        }
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        r05Var2 = new r05(f14, f15, rectF.right - f14, rectF.bottom - f15);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((r05Var2.b - fD) / fD2)) * fD2) + fD;
                float fC7 = r05Var2.c();
                float fD4 = r05Var2.d();
                r05 r05Var6 = new r05(0.0f, 0.0f, fD2, fE);
                boolean zM0 = m0();
                for (float fFloor2 = (((float) Math.floor((r05Var2.c - fE2) / fE)) * fE) + fE2; fFloor2 < fD4; fFloor2 += fE) {
                    float f16 = fFloor;
                    while (f16 < fC7) {
                        r05Var6.b = f16;
                        r05Var6.c = fFloor2;
                        y0();
                        if (!((du6) this.f0).a.q0.booleanValue()) {
                            t0(r05Var6.b, r05Var6.c, r05Var6.d, r05Var6.e);
                        }
                        r05 r05Var7 = ss6Var.o;
                        if (r05Var7 != null) {
                            canvas.concat(z(r05Var6, r05Var7, zs5Var));
                        } else {
                            Boolean bool2 = ss6Var.q;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f16, fFloor2);
                            if (!z4) {
                                r05 r05Var8 = dt6Var.h;
                                canvas.scale(r05Var8.d, r05Var8.e);
                            }
                        }
                        Iterator it = ss6Var.i.iterator();
                        while (it.hasNext()) {
                            o0((gt6) it.next());
                        }
                        x0();
                        f16 += fD2;
                        fD4 = fD4;
                        fFloor = fFloor;
                    }
                }
                if (zM0) {
                    l0(ss6Var.h);
                }
                x0();
                return;
            }
        }
        canvas.drawPath(path, ((du6) this.f0).d);
    }

    public void J(Path path) {
        du6 du6Var = (du6) this.f0;
        int i = du6Var.a.N0;
        Canvas canvas = (Canvas) this.Y;
        if (i != 2) {
            canvas.drawPath(path, du6Var.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((du6) this.f0).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((du6) this.f0).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void K(rt6 rt6Var, jb5 jb5Var) {
        float f;
        float fE;
        float fD;
        int iU;
        et6 et6VarY;
        if (H()) {
            Iterator it = rt6Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                gt6 gt6Var = (gt6) it.next();
                if (gt6Var instanceof ut6) {
                    jb5Var.K(z0(((ut6) gt6Var).c, z, !it.hasNext()));
                } else if (jb5Var.r((rt6) gt6Var)) {
                    float fE2 = 0.0f;
                    if (gt6Var instanceof st6) {
                        y0();
                        st6 st6Var = (st6) gt6Var;
                        C0((du6) this.f0, st6Var);
                        if (H() && E0() && (et6VarY = st6Var.a.y(st6Var.n)) != null) {
                            qs6 qs6Var = (qs6) et6VarY;
                            zt6 zt6Var = new zt6(qs6Var.o);
                            Matrix matrix = qs6Var.n;
                            Path path = zt6Var.X;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            ks6 ks6Var = st6Var.o;
                            fE2 = ks6Var != null ? ks6Var.c(this, pathMeasure.getLength()) : 0.0f;
                            int iU2 = U();
                            if (iU2 != 1) {
                                float fY = y(st6Var);
                                if (iU2 == 2) {
                                    fY /= 2.0f;
                                }
                                fE2 -= fY;
                            }
                            B(st6Var.p);
                            boolean zM0 = m0();
                            K(st6Var, new au6(this, path, fE2));
                            if (zM0) {
                                l0(st6Var.h);
                            }
                        }
                        x0();
                    } else if (gt6Var instanceof ot6) {
                        y0();
                        ot6 ot6Var = (ot6) gt6Var;
                        C0((du6) this.f0, ot6Var);
                        if (H()) {
                            ArrayList arrayList = ot6Var.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = jb5Var instanceof bu6;
                            if (z3) {
                                float fD2 = !z2 ? ((bu6) jb5Var).l0 : ((ks6) ot6Var.n.get(0)).d(this);
                                ArrayList arrayList2 = ot6Var.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((bu6) jb5Var).m0 : ((ks6) ot6Var.o.get(0)).e(this);
                                ArrayList arrayList3 = ot6Var.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((ks6) ot6Var.p.get(0)).d(this);
                                ArrayList arrayList4 = ot6Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((ks6) ot6Var.q.get(0)).e(this);
                                }
                                float f2 = fD2;
                                f = fE2;
                                fE2 = f2;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z2 && (iU = U()) != 1) {
                                float fY2 = y(ot6Var);
                                if (iU == 2) {
                                    fY2 /= 2.0f;
                                }
                                fE2 -= fY2;
                            }
                            B(ot6Var.r);
                            if (z3) {
                                bu6 bu6Var = (bu6) jb5Var;
                                bu6Var.l0 = fE2 + fD;
                                bu6Var.m0 = fE + f;
                            }
                            boolean zM1 = m0();
                            K(ot6Var, jb5Var);
                            if (zM1) {
                                l0(ot6Var.h);
                            }
                        }
                        x0();
                    } else if (gt6Var instanceof nt6) {
                        y0();
                        nt6 nt6Var = (nt6) gt6Var;
                        C0((du6) this.f0, nt6Var);
                        if (H()) {
                            B(nt6Var.o);
                            et6 et6VarY2 = gt6Var.a.y(nt6Var.n);
                            if (et6VarY2 != null && (et6VarY2 instanceof rt6)) {
                                StringBuilder sb = new StringBuilder();
                                L((rt6) et6VarY2, sb);
                                if (sb.length() > 0) {
                                    jb5Var.K(sb.toString());
                                }
                            }
                        }
                        x0();
                    }
                }
                z = false;
            }
        }
    }

    public void L(rt6 rt6Var, StringBuilder sb) {
        Iterator it = rt6Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            gt6 gt6Var = (gt6) it.next();
            if (gt6Var instanceof rt6) {
                L((rt6) gt6Var, sb);
            } else if (gt6Var instanceof ut6) {
                sb.append(z0(((ut6) gt6Var).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public List P(wb4 wb4Var, gt4 gt4Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        qb6 qb6VarL = w45.L(wb4Var, z, z2, bool, z3, (y45) this.Y, (hv4) this.i0);
        if (qb6VarL == null) {
            if (wb4Var instanceof c06) {
                ke7 ke7Var = (ke7) ((c06) wb4Var).d;
                l04 l04Var = ke7Var instanceof l04 ? (l04) ke7Var : null;
                if (l04Var != null) {
                    qb6VarL = l04Var.X;
                } else {
                    qb6VarL = null;
                }
            } else {
                qb6VarL = null;
            }
        }
        return (qb6VarL == null || (list = (List) ((um) ((pe4) this.Z).B(qb6VarL)).a.get(gt4Var)) == null) ? d02.X : list;
    }

    public du6 R(gt6 gt6Var) {
        du6 du6Var = new du6();
        B0(du6Var, ys6.a());
        S(gt6Var, du6Var);
        return du6Var;
    }

    public void S(gt6 gt6Var, du6 du6Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (gt6Var instanceof et6) {
                arrayList.add(0, (et6) gt6Var);
            }
            Object obj = gt6Var.b;
            if (obj == null) {
                break;
            } else {
                gt6Var = (gt6) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0(du6Var, (et6) it.next());
        }
        du6 du6Var2 = (du6) this.f0;
        du6Var.g = du6Var2.g;
        du6Var.f = du6Var2.f;
    }

    public void T() {
        Messenger messenger;
        es4 es4Var = (es4) ((vk1) this.i0).Y;
        zz2 zz2Var = es4Var.f;
        if (zz2Var != null && (messenger = es4Var.g) != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = 1;
                messageObtain.setData(null);
                messageObtain.replyTo = messenger;
                ((Messenger) zz2Var.Y).send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
        es4Var.b.disconnect();
        ((BroadcastReceiver.PendingResult) this.h0).finish();
    }

    public int U() {
        int i;
        ys6 ys6Var = ((du6) this.f0).a;
        if (ys6Var.K0 == 1 || (i = ys6Var.L0) == 2) {
            return ys6Var.L0;
        }
        return i == 1 ? 3 : 1;
    }

    public ColorStateList X(Context context, int i) {
        if (i == r36.abc_edit_text_material) {
            return w79.v(context, e36.abc_tint_edittext);
        }
        if (i == r36.abc_switch_track_mtrl_alpha) {
            return w79.v(context, e36.abc_tint_switch_track);
        }
        if (i != r36.abc_switch_thumb_material) {
            if (i == r36.abc_btn_default_mtrl_shape) {
                return F(context, d98.c(context, w26.colorButtonNormal));
            }
            if (i == r36.abc_btn_borderless_material) {
                return F(context, 0);
            }
            if (i == r36.abc_btn_colored_material) {
                return F(context, d98.c(context, w26.colorAccent));
            }
            if (i == r36.abc_spinner_mtrl_am_alpha || i == r36.abc_spinner_textfield_background_material) {
                return w79.v(context, e36.abc_tint_spinner);
            }
            if (u((int[]) this.Z, i)) {
                return d98.d(context, w26.colorControlNormal);
            }
            if (u((int[]) this.h0, i)) {
                return w79.v(context, e36.abc_tint_default);
            }
            if (u((int[]) this.i0, i)) {
                return w79.v(context, e36.abc_tint_btn_checkable);
            }
            if (i == r36.abc_seekbar_thumb_material) {
                return w79.v(context, e36.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = d98.d(context, w26.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = d98.b;
            iArr2[0] = d98.b(context, w26.colorSwitchThumbNormal);
            iArr[1] = d98.e;
            iArr2[1] = d98.c(context, w26.colorControlActivated);
            iArr[2] = d98.f;
            iArr2[2] = d98.c(context, w26.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = d98.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = d98.e;
            iArr2[1] = d98.c(context, w26.colorControlActivated);
            iArr[2] = d98.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean Y(qs0 qs0Var) {
        qb6 qb6VarA;
        if (qs0Var.e() != null && dh3.f(qs0Var.f().b(), "Container") && (qb6VarA = w51.A((y45) this.Y, qs0Var, (hv4) this.i0)) != null) {
            LinkedHashSet linkedHashSet = gf7.a;
            Annotation[] declaredAnnotations = qb6VarA.a.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            boolean z = false;
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                if (ia6.a(zc1.M(zc1.K(annotation))).equals(js3.b)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jm
    public List a(wb4 wb4Var, d2 d2Var, int i) {
        int i2;
        if (i == 0) {
            throw null;
        }
        if (d2Var instanceof iy5) {
            i2 = ((iy5) d2Var).f0;
        } else if (d2Var instanceof vy5) {
            i2 = ((vy5) d2Var).f0;
        } else if (d2Var instanceof cz5) {
            cz5 cz5Var = (cz5) d2Var;
            int iB = p61.B(i);
            if (iB != 2) {
                i2 = (iB == 3 && (cz5Var.Z & 512) == 512) ? cz5Var.t0 : cz5Var.f0;
            } else {
                i2 = (cz5Var.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? cz5Var.s0 : cz5Var.f0;
            }
        } else {
            i2 = 0;
        }
        if (md2.c.e(i2).booleanValue()) {
            if (i == 2) {
                return e0(wb4Var, (cz5) d2Var, i0.X);
            }
            gt4 gt4VarV = V(d2Var, (w15) wb4Var.b, (ux4) wb4Var.c, i, false);
            if (gt4VarV != null) {
                return Q(this, wb4Var, gt4VarV, null, false, 60);
            }
        }
        return d02.X;
    }

    public fc8 a0(qs0 qs0Var, ke7 ke7Var, List list) {
        return new fc8(this, oc.o((wx4) this.f0, qs0Var, (z47) this.g0), qs0Var, list, ke7Var);
    }

    @Override // defpackage.ny6
    public boolean b() {
        return ((Boolean) ((rh5) this.g0).getValue()).booleanValue();
    }

    public fc8 b0(qs0 qs0Var, ga6 ga6Var, List list) {
        if (gf7.a.contains(qs0Var)) {
            return null;
        }
        return a0(qs0Var, ga6Var, list);
    }

    @Override // defpackage.vl
    public Object c(wb4 wb4Var, cz5 cz5Var, t14 t14Var) {
        return c0(wb4Var, cz5Var, 3, t14Var, g0.Y);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public Object c0(wb4 wb4Var, cz5 cz5Var, int i, t14 t14Var, rn2 rn2Var) {
        Object objK;
        qb6 qb6VarL = w45.L(wb4Var, true, true, md2.E.e(cz5Var.f0), mu3.d(cz5Var), (y45) this.Y, (hv4) this.i0);
        if (qb6VarL == null) {
            if (wb4Var instanceof c06) {
                ke7 ke7Var = (ke7) ((c06) wb4Var).d;
                l04 l04Var = ke7Var instanceof l04 ? (l04) ke7Var : null;
                if (l04Var != null) {
                    qb6VarL = l04Var.X;
                } else {
                    qb6VarL = null;
                }
            } else {
                qb6VarL = null;
            }
        }
        if (qb6VarL != null) {
            hv4 hv4Var = qb6VarL.b.b;
            hv4 hv4Var2 = zl1.e;
            hv4Var2.getClass();
            gt4 gt4VarV = V(cz5Var, (w15) wb4Var.b, (ux4) wb4Var.c, i, hv4Var.a(hv4Var2.b, hv4Var2.c, hv4Var2.d));
            if (gt4VarV != null && (objK = rn2Var.K(((pe4) this.Z).B(qb6VarL), gt4VarV)) != null) {
                if (ho8.a(t14Var)) {
                    objK = (s21) objK;
                    if (objK instanceof lb0) {
                        return new gk8(((Number) ((lb0) objK).a).byteValue());
                    }
                    if (objK instanceof t87) {
                        return new gk8(((Number) ((t87) objK).a).shortValue());
                    }
                    if (objK instanceof rf3) {
                        return new gk8(((Number) ((rf3) objK).a).intValue());
                    }
                    if (objK instanceof ri4) {
                        return new gk8(((Number) ((ri4) objK).a).longValue());
                    }
                }
                return objK;
            }
        }
        return null;
    }

    @Override // defpackage.vl
    public Object d(wb4 wb4Var, cz5 cz5Var, t14 t14Var) {
        return c0(wb4Var, cz5Var, 2, t14Var, g0.Z);
    }

    public List d0(wb4 wb4Var, d2 d2Var, int i, int i2) {
        gt4 gt4VarV = V(d2Var, (w15) wb4Var.b, (ux4) wb4Var.c, i, false);
        if (gt4VarV == null) {
            return d02.X;
        }
        return Q(this, wb4Var, new gt4(gt4VarV.a + '@' + i2), null, false, 60);
    }

    @Override // defpackage.jm
    public List e(wb4 wb4Var, d2 d2Var, int i) {
        int size;
        if (i == 0) {
            throw null;
        }
        if (d2Var instanceof vy5) {
            size = ((vy5) d2Var).q0.size();
        } else {
            size = d2Var instanceof cz5 ? ((cz5) d2Var).q0.size() : 0;
        }
        return d0(wb4Var, d2Var, i, size);
    }

    public List e0(wb4 wb4Var, cz5 cz5Var, i0 i0Var) {
        ux4 ux4Var = (ux4) wb4Var.c;
        Boolean boolL = md2.E.e(cz5Var.f0);
        boolean zD = mu3.d(cz5Var);
        w15 w15Var = (w15) wb4Var.b;
        if (i0Var == i0.X) {
            gt4 gt4VarU = jb5.u(cz5Var, w15Var, ux4Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (gt4VarU != null) {
                return Q(this, wb4Var, gt4VarU, boolL, zD, 8);
            }
        } else {
            gt4 gt4VarU2 = jb5.u(cz5Var, w15Var, ux4Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (gt4VarU2 != null) {
                if (fm7.d0(gt4VarU2.a, "$delegate", false) == (i0Var == i0.Z)) {
                    return P(wb4Var, gt4VarU2, true, true, boolL, zD);
                }
            }
        }
        return d02.X;
    }

    @Override // defpackage.jm
    public ArrayList f(nz5 nz5Var, w15 w15Var) {
        nz5Var.getClass();
        w15Var.getClass();
        List<cy5> list = nz5Var.t0;
        list.getClass();
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        for (cy5 cy5Var : list) {
            cy5Var.getClass();
            arrayList.add(((dq) this.h0).m(cy5Var, w15Var));
        }
        return arrayList;
    }

    public Path f0(zr6 zr6Var) {
        ks6 ks6Var = zr6Var.o;
        float fD = ks6Var != null ? ks6Var.d(this) : 0.0f;
        ks6 ks6Var2 = zr6Var.p;
        float fE = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
        float fB = zr6Var.q.b(this);
        float f = fD - fB;
        float f2 = fE - fB;
        float f3 = fD + fB;
        float f4 = fE + fB;
        if (zr6Var.h == null) {
            float f5 = 2.0f * fB;
            zr6Var.h = new r05(f, f2, f5, f5);
        }
        float f6 = fB * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f6;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f6;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    @Override // defpackage.jm
    public List g(wb4 wb4Var, d2 d2Var, int i, int i2, vz5 vz5Var) {
        if (i != 0) {
            return !md2.c.e(vz5Var != null ? vz5Var.f0 : 0).booleanValue() ? d02.X : d0(wb4Var, d2Var, i, i2);
        }
        throw null;
    }

    public Path g0(es6 es6Var) {
        ks6 ks6Var = es6Var.o;
        float fD = ks6Var != null ? ks6Var.d(this) : 0.0f;
        ks6 ks6Var2 = es6Var.p;
        float fE = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
        float fD2 = es6Var.q.d(this);
        float fE2 = es6Var.r.e(this);
        float f = fD - fD2;
        float f2 = fE - fE2;
        float f3 = fD + fD2;
        float f4 = fE + fE2;
        if (es6Var.h == null) {
            es6Var.h = new r05(f, f2, fD2 * 2.0f, 2.0f * fE2);
        }
        float f5 = fD2 * 0.5522848f;
        float f6 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f5;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f5;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    @Override // defpackage.ov8
    public View getRoot() {
        switch (this.X) {
            case 1:
                return (LinearLayout) this.Y;
            case 2:
                return (LinearLayout) this.Y;
            default:
                return (ConstraintLayout) this.Y;
        }
    }

    @Override // defpackage.jm
    public ArrayList h(sz5 sz5Var, w15 w15Var) {
        sz5Var.getClass();
        w15Var.getClass();
        List<cy5> list = sz5Var.m0;
        list.getClass();
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        for (cy5 cy5Var : list) {
            cy5Var.getClass();
            arrayList.add(((dq) this.h0).m(cy5Var, w15Var));
        }
        return arrayList;
    }

    @Override // defpackage.ny6
    public Object i(f15 f15Var, rn2 rn2Var, q51 q51Var) {
        Object objN = gv3.n(new r0((Object) this, (Object) f15Var, (Object) rn2Var, (q51) null, (byte) 14), q51Var);
        return objN == c71.X ? objN : dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public Path i0(vs6 vs6Var) {
        float fD;
        float fE;
        float fMin;
        ks6 ks6Var;
        float fD2;
        ks6 ks6Var2;
        float fE2;
        float fD3;
        float fE3;
        float f;
        float f2;
        Path path;
        ks6 ks6Var3 = vs6Var.s;
        if (ks6Var3 == null && vs6Var.t == null) {
            fD = 0.0f;
        } else {
            ks6 ks6Var4 = vs6Var.t;
            if (ks6Var3 != null) {
                if (ks6Var4 == null) {
                    fD = ks6Var3.d(this);
                } else {
                    fD = ks6Var3.d(this);
                    fE = vs6Var.t.e(this);
                }
                fMin = Math.min(fD, vs6Var.q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, vs6Var.r.e(this) / 2.0f);
                ks6Var = vs6Var.o;
                if (ks6Var != null) {
                    fD2 = ks6Var.d(this);
                } else {
                    fD2 = 0.0f;
                }
                ks6Var2 = vs6Var.p;
                if (ks6Var2 != null) {
                    fE2 = ks6Var2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = vs6Var.q.d(this);
                fE3 = vs6Var.r.e(this);
                if (vs6Var.h == null) {
                    vs6Var.h = new r05(fD2, fE2, fD3, fE3);
                }
                f = fD3 + fD2;
                f2 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f, fE2);
                    path.lineTo(f, f2);
                    path.lineTo(fD2, f2);
                    path.lineTo(fD2, fE2);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fE2 + fMin2;
                    path.moveTo(fD2, f5);
                    float f6 = f5 - f4;
                    float f7 = fD2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fD2, f6, f8, fE2, f7, fE2);
                    float f9 = f - fMin;
                    path.lineTo(f9, fE2);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fE2, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fD2;
                    path.cubicTo(f8, f2, f13, f12, fD2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fD = ks6Var4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, vs6Var.q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, vs6Var.r.e(this) / 2.0f);
        ks6Var = vs6Var.o;
        if (ks6Var != null) {
            fD2 = ks6Var.d(this);
        } else {
            fD2 = 0.0f;
        }
        ks6Var2 = vs6Var.p;
        if (ks6Var2 != null) {
            fE2 = ks6Var2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = vs6Var.q.d(this);
        fE3 = vs6Var.r.e(this);
        if (vs6Var.h == null) {
            vs6Var.h = new r05(fD2, fE2, fD3, fE3);
        }
        f = fD3 + fD2;
        f2 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public r05 j0(ks6 ks6Var, ks6 ks6Var2, ks6 ks6Var3, ks6 ks6Var4) {
        float fD = ks6Var != null ? ks6Var.d(this) : 0.0f;
        float fE = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
        du6 du6Var = (du6) this.f0;
        r05 r05Var = du6Var.g;
        if (r05Var == null) {
            r05Var = du6Var.f;
        }
        return new r05(fD, fE, ks6Var3 != null ? ks6Var3.d(this) : r05Var.d, ks6Var4 != null ? ks6Var4.e(this) : r05Var.e);
    }

    @Override // defpackage.jm
    public List k(wb4 wb4Var, d2 d2Var, int i, int i2, vz5 vz5Var) {
        if (i != 0) {
            return !md2.c.e(vz5Var.f0).booleanValue() ? d02.X : (List) new h0(this, wb4Var, d2Var, i, i2).invoke();
        }
        throw null;
    }

    public Path k0(dt6 dt6Var) {
        Path path;
        Path pathK0;
        Path pathW;
        ((Stack) this.g0).push((du6) this.f0);
        du6 du6Var = new du6((du6) this.f0);
        this.f0 = du6Var;
        C0(du6Var, dt6Var);
        if (!H() || !E0()) {
            this.f0 = (du6) ((Stack) this.g0).pop();
            return null;
        }
        if (dt6Var instanceof vt6) {
            vt6 vt6Var = (vt6) dt6Var;
            et6 et6VarY = dt6Var.a.y(vt6Var.o);
            if (et6VarY == null) {
                this.f0 = (du6) ((Stack) this.g0).pop();
                return null;
            }
            if (!(et6VarY instanceof dt6)) {
                this.f0 = (du6) ((Stack) this.g0).pop();
                return null;
            }
            pathK0 = k0((dt6) et6VarY);
            if (pathK0 != null) {
                if (vt6Var.h == null) {
                    vt6Var.h = x(pathK0);
                }
                Matrix matrix = vt6Var.n;
                if (matrix != null) {
                    pathK0.transform(matrix);
                }
                if (((du6) this.f0).a.z0 != null && (pathW = w(dt6Var, dt6Var.h)) != null) {
                    pathK0.op(pathW, Path.Op.INTERSECT);
                }
                this.f0 = (du6) ((Stack) this.g0).pop();
                return pathK0;
            }
            return null;
        }
        if (dt6Var instanceof gs6) {
            gs6 gs6Var = (gs6) dt6Var;
            if (dt6Var instanceof qs6) {
                zt6 zt6Var = new zt6(((qs6) dt6Var).o);
                r05 r05Var = dt6Var.h;
                Path path2 = zt6Var.X;
                if (r05Var == null) {
                    dt6Var.h = x(path2);
                }
                path = path2;
            } else if (dt6Var instanceof vs6) {
                path = i0((vs6) dt6Var);
            } else if (dt6Var instanceof zr6) {
                path = f0((zr6) dt6Var);
            } else if (dt6Var instanceof es6) {
                path = g0((es6) dt6Var);
            } else {
                path = dt6Var instanceof ts6 ? h0((ts6) dt6Var) : null;
            }
            if (path != null) {
                if (gs6Var.h == null) {
                    gs6Var.h = x(path);
                }
                Matrix matrix2 = gs6Var.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((du6) this.f0).a.M0;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                pathK0 = path;
            }
            return null;
        }
        if (dt6Var instanceof pt6) {
            pt6 pt6Var = (pt6) dt6Var;
            ArrayList arrayList = pt6Var.n;
            float fE = 0.0f;
            float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((ks6) pt6Var.n.get(0)).d(this);
            ArrayList arrayList2 = pt6Var.o;
            float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((ks6) pt6Var.o.get(0)).e(this);
            ArrayList arrayList3 = pt6Var.p;
            float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((ks6) pt6Var.p.get(0)).d(this);
            ArrayList arrayList4 = pt6Var.q;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fE = ((ks6) pt6Var.q.get(0)).e(this);
            }
            if (((du6) this.f0).a.L0 != 1) {
                float fY = y(pt6Var);
                if (((du6) this.f0).a.L0 == 2) {
                    fY /= 2.0f;
                }
                fD -= fY;
            }
            if (pt6Var.h == null) {
                cu6 cu6Var = new cu6(this, fD, fE2);
                K(pt6Var, cu6Var);
                Object obj = cu6Var.p0;
                RectF rectF = (RectF) obj;
                pt6Var.h = new r05(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
            }
            path = new Path();
            K(pt6Var, new cu6(this, fD + fD2, fE2 + fE, path));
            Matrix matrix3 = pt6Var.r;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            int i2 = ((du6) this.f0).a.M0;
            path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            pathK0 = path;
        }
        return null;
        if (((du6) this.f0).a.z0 != null) {
            pathK0.op(pathW, Path.Op.INTERSECT);
        }
        this.f0 = (du6) ((Stack) this.g0).pop();
        return pathK0;
    }

    @Override // defpackage.jm
    public List l(wb4 wb4Var, cz5 cz5Var) {
        return !md2.c.e(cz5Var.f0).booleanValue() ? d02.X : e0(wb4Var, cz5Var, i0.Y);
    }

    public void l0(r05 r05Var) {
        Canvas canvas = (Canvas) this.Y;
        if (((du6) this.f0).a.A0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            ns6 ns6Var = (ns6) ((f63) this.Z).y(((du6) this.f0).a.A0);
            s0(ns6Var, r05Var);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            s0(ns6Var, r05Var);
            canvas.restore();
            canvas.restore();
        }
        x0();
    }

    public boolean m0() {
        et6 et6VarY;
        int i = 0;
        if (((du6) this.f0).a.l0.floatValue() >= 1.0f && ((du6) this.f0).a.A0 == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.Y;
        int iFloatValue = (int) (((du6) this.f0).a.l0.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.g0).push((du6) this.f0);
        du6 du6Var = new du6((du6) this.f0);
        this.f0 = du6Var;
        String str = du6Var.a.A0;
        if (str != null && ((et6VarY = ((f63) this.Z).y(str)) == null || !(et6VarY instanceof ns6))) {
            ys6 ys6Var = ((du6) this.f0).a;
            String str2 = ys6Var.A0;
            ys6Var.A0 = null;
        }
        return true;
    }

    @Override // defpackage.ny6
    public float n(float f) {
        return ((Number) ((gn2) this.Y).B(Float.valueOf(f))).floatValue();
    }

    public void n0(zs6 zs6Var, r05 r05Var, r05 r05Var2, zs5 zs5Var) {
        if (r05Var.d == 0.0f || r05Var.e == 0.0f) {
            return;
        }
        if (zs5Var == null && (zs5Var = zs6Var.n) == null) {
            zs5Var = zs5.d;
        }
        C0((du6) this.f0, zs6Var);
        if (H()) {
            du6 du6Var = (du6) this.f0;
            du6Var.f = r05Var;
            if (!du6Var.a.q0.booleanValue()) {
                r05 r05Var3 = ((du6) this.f0).f;
                t0(r05Var3.b, r05Var3.c, r05Var3.d, r05Var3.e);
            }
            A(zs6Var, ((du6) this.f0).f);
            Canvas canvas = (Canvas) this.Y;
            du6 du6Var2 = (du6) this.f0;
            if (r05Var2 != null) {
                canvas.concat(z(du6Var2.f, r05Var2, zs5Var));
                ((du6) this.f0).g = zs6Var.o;
            } else {
                r05 r05Var4 = du6Var2.f;
                canvas.translate(r05Var4.b, r05Var4.c);
            }
            boolean zM0 = m0();
            D0();
            p0(zs6Var, true);
            if (zM0) {
                l0(zs6Var.h);
            }
            A0(zs6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o0(gt6 gt6Var) {
        ks6 ks6Var;
        String str;
        int iIndexOf;
        Set setA;
        ks6 ks6Var2;
        gt6 gt6VarY;
        Boolean bool;
        if (gt6Var instanceof os6) {
            return;
        }
        y0();
        if ((gt6Var instanceof et6) && (bool = ((et6) gt6Var).d) != null) {
            ((du6) this.f0).h = bool.booleanValue();
        }
        if (gt6Var instanceof zs6) {
            zs6 zs6Var = (zs6) gt6Var;
            n0(zs6Var, j0(zs6Var.p, zs6Var.q, zs6Var.r, zs6Var.s), zs6Var.o, zs6Var.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (gt6Var instanceof vt6) {
                vt6 vt6Var = (vt6) gt6Var;
                Canvas canvas = (Canvas) this.Y;
                ks6 ks6Var3 = vt6Var.r;
                if ((ks6Var3 == null || !ks6Var3.g()) && ((ks6Var2 = vt6Var.s) == null || !ks6Var2.g())) {
                    C0((du6) this.f0, vt6Var);
                    if (H() && (gt6VarY = vt6Var.a.y(vt6Var.o)) != null) {
                        Matrix matrix = vt6Var.n;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        ks6 ks6Var4 = vt6Var.p;
                        float fD = ks6Var4 != null ? ks6Var4.d(this) : 0.0f;
                        ks6 ks6Var5 = vt6Var.q;
                        canvas.translate(fD, ks6Var5 != null ? ks6Var5.e(this) : 0.0f);
                        A(vt6Var, vt6Var.h);
                        boolean zM0 = m0();
                        ((Stack) this.h0).push(vt6Var);
                        ((Stack) this.i0).push(((Canvas) this.Y).getMatrix());
                        if (gt6VarY instanceof zs6) {
                            zs6 zs6Var2 = (zs6) gt6VarY;
                            r05 r05VarJ0 = j0(null, null, vt6Var.r, vt6Var.s);
                            y0();
                            n0(zs6Var2, r05VarJ0, zs6Var2.o, zs6Var2.n);
                            x0();
                        } else if (gt6VarY instanceof mt6) {
                            ks6 ks6Var6 = vt6Var.r;
                            if (ks6Var6 == null) {
                                ks6Var6 = new ks6(9, 100.0f);
                            }
                            ks6 ks6Var7 = vt6Var.s;
                            if (ks6Var7 == null) {
                                ks6Var7 = new ks6(9, 100.0f);
                            }
                            r05 r05VarJ1 = j0(null, null, ks6Var6, ks6Var7);
                            y0();
                            mt6 mt6Var = (mt6) gt6VarY;
                            if (r05VarJ1.d != 0.0f && r05VarJ1.e != 0.0f) {
                                zs5 zs5Var = mt6Var.n;
                                if (zs5Var == null) {
                                    zs5Var = zs5.d;
                                }
                                C0((du6) this.f0, mt6Var);
                                du6 du6Var = (du6) this.f0;
                                du6Var.f = r05VarJ1;
                                if (!du6Var.a.q0.booleanValue()) {
                                    r05 r05Var = ((du6) this.f0).f;
                                    t0(r05Var.b, r05Var.c, r05Var.d, r05Var.e);
                                }
                                r05 r05Var2 = mt6Var.o;
                                du6 du6Var2 = (du6) this.f0;
                                if (r05Var2 != null) {
                                    canvas.concat(z(du6Var2.f, r05Var2, zs5Var));
                                    ((du6) this.f0).g = mt6Var.o;
                                } else {
                                    r05 r05Var3 = du6Var2.f;
                                    canvas.translate(r05Var3.b, r05Var3.c);
                                }
                                boolean zM1 = m0();
                                p0(mt6Var, true);
                                if (zM1) {
                                    l0(mt6Var.h);
                                }
                                A0(mt6Var);
                            }
                            x0();
                        } else {
                            o0(gt6VarY);
                        }
                        ((Stack) this.h0).pop();
                        ((Stack) this.i0).pop();
                        if (zM0) {
                            l0(vt6Var.h);
                        }
                        A0(vt6Var);
                    }
                }
            } else if (gt6Var instanceof lt6) {
                lt6 lt6Var = (lt6) gt6Var;
                C0((du6) this.f0, lt6Var);
                if (H()) {
                    Matrix matrix2 = lt6Var.n;
                    if (matrix2 != null) {
                        ((Canvas) this.Y).concat(matrix2);
                    }
                    A(lt6Var, lt6Var.h);
                    boolean zM2 = m0();
                    String language = Locale.getDefault().getLanguage();
                    for (gt6 gt6Var2 : lt6Var.i) {
                        if (gt6Var2 instanceof at6) {
                            at6 at6Var = (at6) gt6Var2;
                            if (at6Var.b() == null && ((setA = at6Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set setF = at6Var.f();
                                if (setF != null) {
                                    if (j0 == null) {
                                        synchronized (fu6.class) {
                                            HashSet hashSet = new HashSet();
                                            j0 = hashSet;
                                            hashSet.add("Structure");
                                            j0.add("BasicStructure");
                                            j0.add("ConditionalProcessing");
                                            j0.add("Image");
                                            j0.add("Style");
                                            j0.add("ViewportAttribute");
                                            j0.add("Shape");
                                            j0.add("BasicText");
                                            j0.add("PaintAttribute");
                                            j0.add("BasicPaintAttribute");
                                            j0.add("OpacityAttribute");
                                            j0.add("BasicGraphicsAttribute");
                                            j0.add("Marker");
                                            j0.add("Gradient");
                                            j0.add("Pattern");
                                            j0.add("Clip");
                                            j0.add("BasicClip");
                                            j0.add("Mask");
                                            j0.add("View");
                                        }
                                    }
                                    if (setF.isEmpty() || !j0.containsAll(setF)) {
                                    }
                                }
                                Set setM = at6Var.m();
                                if (setM == null) {
                                    Set setN = at6Var.n();
                                    if (setN == null) {
                                        o0(gt6Var2);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setM.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM2) {
                        l0(lt6Var.h);
                    }
                    A0(lt6Var);
                }
            } else if (gt6Var instanceof hs6) {
                hs6 hs6Var = (hs6) gt6Var;
                C0((du6) this.f0, hs6Var);
                if (H()) {
                    Matrix matrix3 = hs6Var.n;
                    if (matrix3 != null) {
                        ((Canvas) this.Y).concat(matrix3);
                    }
                    A(hs6Var, hs6Var.h);
                    boolean zM3 = m0();
                    p0(hs6Var, true);
                    if (zM3) {
                        l0(hs6Var.h);
                    }
                    A0(hs6Var);
                }
            } else if (gt6Var instanceof js6) {
                js6 js6Var = (js6) gt6Var;
                Canvas canvas2 = (Canvas) this.Y;
                ks6 ks6Var8 = js6Var.r;
                if (ks6Var8 != null && !ks6Var8.g() && (ks6Var = js6Var.s) != null && !ks6Var.g() && (str = js6Var.o) != null) {
                    zs5 zs5Var2 = js6Var.n;
                    if (zs5Var2 == null) {
                        zs5Var2 = zs5.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        r05 r05Var4 = new r05(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        C0((du6) this.f0, js6Var);
                        if (H() && E0()) {
                            Matrix matrix4 = js6Var.t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            ks6 ks6Var9 = js6Var.p;
                            float fD2 = ks6Var9 != null ? ks6Var9.d(this) : 0.0f;
                            ks6 ks6Var10 = js6Var.q;
                            float fE2 = ks6Var10 != null ? ks6Var10.e(this) : 0.0f;
                            float fD3 = js6Var.r.d(this);
                            float fD4 = js6Var.s.d(this);
                            du6 du6Var3 = (du6) this.f0;
                            du6Var3.f = new r05(fD2, fE2, fD3, fD4);
                            if (!du6Var3.a.q0.booleanValue()) {
                                r05 r05Var5 = ((du6) this.f0).f;
                                t0(r05Var5.b, r05Var5.c, r05Var5.d, r05Var5.e);
                            }
                            js6Var.h = ((du6) this.f0).f;
                            A0(js6Var);
                            A(js6Var, js6Var.h);
                            boolean zM4 = m0();
                            D0();
                            canvas2.save();
                            canvas2.concat(z(((du6) this.f0).f, r05Var4, zs5Var2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((du6) this.f0).a.O0 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zM4) {
                                l0(js6Var.h);
                            }
                        }
                    }
                }
            } else if (gt6Var instanceof qs6) {
                qs6 qs6Var = (qs6) gt6Var;
                if (qs6Var.o != null) {
                    C0((du6) this.f0, qs6Var);
                    if (H() && E0()) {
                        du6 du6Var4 = (du6) this.f0;
                        if (du6Var4.c || du6Var4.b) {
                            Matrix matrix5 = qs6Var.n;
                            if (matrix5 != null) {
                                ((Canvas) this.Y).concat(matrix5);
                            }
                            Path path = new zt6(qs6Var.o).X;
                            if (qs6Var.h == null) {
                                qs6Var.h = x(path);
                            }
                            A0(qs6Var);
                            B(qs6Var);
                            A(qs6Var, qs6Var.h);
                            boolean zM5 = m0();
                            du6 du6Var5 = (du6) this.f0;
                            if (du6Var5.b) {
                                int i = du6Var5.a.F0;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                I(qs6Var, path);
                            }
                            if (((du6) this.f0).c) {
                                J(path);
                            }
                            r0(qs6Var);
                            if (zM5) {
                                l0(qs6Var.h);
                            }
                        }
                    }
                }
            } else if (gt6Var instanceof vs6) {
                vs6 vs6Var = (vs6) gt6Var;
                ks6 ks6Var11 = vs6Var.q;
                if (ks6Var11 != null && vs6Var.r != null && !ks6Var11.g() && !vs6Var.r.g()) {
                    C0((du6) this.f0, vs6Var);
                    if (H() && E0()) {
                        Matrix matrix6 = vs6Var.n;
                        if (matrix6 != null) {
                            ((Canvas) this.Y).concat(matrix6);
                        }
                        Path pathI0 = i0(vs6Var);
                        A0(vs6Var);
                        B(vs6Var);
                        A(vs6Var, vs6Var.h);
                        boolean zM6 = m0();
                        if (((du6) this.f0).b) {
                            I(vs6Var, pathI0);
                        }
                        if (((du6) this.f0).c) {
                            J(pathI0);
                        }
                        if (zM6) {
                            l0(vs6Var.h);
                        }
                    }
                }
            } else if (gt6Var instanceof zr6) {
                zr6 zr6Var = (zr6) gt6Var;
                ks6 ks6Var12 = zr6Var.q;
                if (ks6Var12 != null && !ks6Var12.g()) {
                    C0((du6) this.f0, zr6Var);
                    if (H() && E0()) {
                        Matrix matrix7 = zr6Var.n;
                        if (matrix7 != null) {
                            ((Canvas) this.Y).concat(matrix7);
                        }
                        Path pathF0 = f0(zr6Var);
                        A0(zr6Var);
                        B(zr6Var);
                        A(zr6Var, zr6Var.h);
                        boolean zM7 = m0();
                        if (((du6) this.f0).b) {
                            I(zr6Var, pathF0);
                        }
                        if (((du6) this.f0).c) {
                            J(pathF0);
                        }
                        if (zM7) {
                            l0(zr6Var.h);
                        }
                    }
                }
            } else if (gt6Var instanceof es6) {
                es6 es6Var = (es6) gt6Var;
                ks6 ks6Var13 = es6Var.q;
                if (ks6Var13 != null && es6Var.r != null && !ks6Var13.g() && !es6Var.r.g()) {
                    C0((du6) this.f0, es6Var);
                    if (H() && E0()) {
                        Matrix matrix8 = es6Var.n;
                        if (matrix8 != null) {
                            ((Canvas) this.Y).concat(matrix8);
                        }
                        Path pathG0 = g0(es6Var);
                        A0(es6Var);
                        B(es6Var);
                        A(es6Var, es6Var.h);
                        boolean zM8 = m0();
                        if (((du6) this.f0).b) {
                            I(es6Var, pathG0);
                        }
                        if (((du6) this.f0).c) {
                            J(pathG0);
                        }
                        if (zM8) {
                            l0(es6Var.h);
                        }
                    }
                }
            } else if (gt6Var instanceof ls6) {
                ls6 ls6Var = (ls6) gt6Var;
                C0((du6) this.f0, ls6Var);
                if (H() && E0() && ((du6) this.f0).c) {
                    Matrix matrix9 = ls6Var.n;
                    if (matrix9 != null) {
                        ((Canvas) this.Y).concat(matrix9);
                    }
                    ks6 ks6Var14 = ls6Var.o;
                    float fD5 = ks6Var14 == null ? 0.0f : ks6Var14.d(this);
                    ks6 ks6Var15 = ls6Var.p;
                    float fE3 = ks6Var15 == null ? 0.0f : ks6Var15.e(this);
                    ks6 ks6Var16 = ls6Var.q;
                    float fD6 = ks6Var16 == null ? 0.0f : ks6Var16.d(this);
                    ks6 ks6Var17 = ls6Var.r;
                    fE = ks6Var17 != null ? ks6Var17.e(this) : 0.0f;
                    if (ls6Var.h == null) {
                        ls6Var.h = new r05(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    A0(ls6Var);
                    B(ls6Var);
                    A(ls6Var, ls6Var.h);
                    boolean zM9 = m0();
                    J(path2);
                    r0(ls6Var);
                    if (zM9) {
                        l0(ls6Var.h);
                    }
                }
            } else if (gt6Var instanceof us6) {
                us6 us6Var = (us6) gt6Var;
                C0((du6) this.f0, us6Var);
                if (H() && E0()) {
                    du6 du6Var6 = (du6) this.f0;
                    if (du6Var6.c || du6Var6.b) {
                        Matrix matrix10 = us6Var.n;
                        if (matrix10 != null) {
                            ((Canvas) this.Y).concat(matrix10);
                        }
                        if (us6Var.o.length >= 2) {
                            Path pathH0 = h0(us6Var);
                            A0(us6Var);
                            B(us6Var);
                            A(us6Var, us6Var.h);
                            boolean zM10 = m0();
                            if (((du6) this.f0).b) {
                                I(us6Var, pathH0);
                            }
                            if (((du6) this.f0).c) {
                                J(pathH0);
                            }
                            r0(us6Var);
                            if (zM10) {
                                l0(us6Var.h);
                            }
                        }
                    }
                }
            } else if (gt6Var instanceof ts6) {
                ts6 ts6Var = (ts6) gt6Var;
                C0((du6) this.f0, ts6Var);
                if (H() && E0()) {
                    du6 du6Var7 = (du6) this.f0;
                    if (du6Var7.c || du6Var7.b) {
                        Matrix matrix11 = ts6Var.n;
                        if (matrix11 != null) {
                            ((Canvas) this.Y).concat(matrix11);
                        }
                        if (ts6Var.o.length >= 2) {
                            Path pathH1 = h0(ts6Var);
                            A0(ts6Var);
                            int i2 = ((du6) this.f0).a.F0;
                            pathH1.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            B(ts6Var);
                            A(ts6Var, ts6Var.h);
                            boolean zM11 = m0();
                            if (((du6) this.f0).b) {
                                I(ts6Var, pathH1);
                            }
                            if (((du6) this.f0).c) {
                                J(pathH1);
                            }
                            r0(ts6Var);
                            if (zM11) {
                                l0(ts6Var.h);
                            }
                        }
                    }
                }
            } else if (gt6Var instanceof pt6) {
                pt6 pt6Var = (pt6) gt6Var;
                C0((du6) this.f0, pt6Var);
                if (H()) {
                    Matrix matrix12 = pt6Var.r;
                    if (matrix12 != null) {
                        ((Canvas) this.Y).concat(matrix12);
                    }
                    ArrayList arrayList = pt6Var.n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((ks6) pt6Var.n.get(0)).d(this);
                    ArrayList arrayList2 = pt6Var.o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((ks6) pt6Var.o.get(0)).e(this);
                    ArrayList arrayList3 = pt6Var.p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((ks6) pt6Var.p.get(0)).d(this);
                    ArrayList arrayList4 = pt6Var.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((ks6) pt6Var.q.get(0)).e(this);
                    }
                    int iU = U();
                    if (iU != 1) {
                        float fY = y(pt6Var);
                        if (iU == 2) {
                            fY /= 2.0f;
                        }
                        fD7 -= fY;
                    }
                    if (pt6Var.h == null) {
                        cu6 cu6Var = new cu6(this, fD7, fE4);
                        K(pt6Var, cu6Var);
                        RectF rectF = (RectF) cu6Var.p0;
                        pt6Var.h = new r05(rectF.left, rectF.top, rectF.width(), ((RectF) cu6Var.p0).height());
                    }
                    A0(pt6Var);
                    B(pt6Var);
                    A(pt6Var, pt6Var.h);
                    boolean zM12 = m0();
                    K(pt6Var, new bu6(this, fD7 + fD8, fE4 + fE));
                    if (zM12) {
                        l0(pt6Var.h);
                    }
                }
            }
        }
        x0();
    }

    @Override // defpackage.jm
    public List p(wb4 wb4Var, qy5 qy5Var) {
        wb4Var.getClass();
        return Q(this, wb4Var, new gt4(((w15) wb4Var.b).getString(qy5Var.f0) + '#' + zs0.b(((c06) wb4Var).g.b())), null, false, 60);
    }

    public void p0(ct6 ct6Var, boolean z) {
        if (z) {
            ((Stack) this.h0).push(ct6Var);
            ((Stack) this.i0).push(((Canvas) this.Y).getMatrix());
        }
        Iterator it = ct6Var.g().iterator();
        while (it.hasNext()) {
            o0((gt6) it.next());
        }
        if (z) {
            ((Stack) this.h0).pop();
            ((Stack) this.i0).pop();
        }
    }

    @Override // defpackage.jm
    public List q(c06 c06Var) throws InvocationTargetException {
        c06Var.getClass();
        if (!md2.c.e(c06Var.e.f0).booleanValue()) {
            return d02.X;
        }
        ke7 ke7Var = (ke7) c06Var.d;
        l04 l04Var = ke7Var instanceof l04 ? (l04) ke7Var : null;
        qb6 qb6Var = l04Var != null ? l04Var.X : null;
        if (qb6Var == null) {
            kp5.q(c06Var.g.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Annotation[] declaredAnnotations = qb6Var.a.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsM = zc1.M(zc1.K(annotation));
            fc8 fc8VarB0 = b0(ia6.a(clsM), new ga6(annotation), arrayList);
            if (fc8VarB0 != null) {
                yn0.V(fc8VarB0, annotation, clsM);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    public void q0(ms6 ms6Var, yt6 yt6Var) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.Y;
        y0();
        Float f4 = ms6Var.u;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = yt6Var.c;
            if (f6 == 0.0f && yt6Var.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(yt6Var.d, f6));
            }
        } else {
            fFloatValue = ms6Var.u.floatValue();
        }
        float fA = ms6Var.p ? 1.0f : ((du6) this.f0).a.h0.a();
        this.f0 = R(ms6Var);
        Matrix matrix = new Matrix();
        matrix.preTranslate(yt6Var.a, yt6Var.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fA, fA);
        ks6 ks6Var = ms6Var.q;
        float fD = ks6Var != null ? ks6Var.d(this) : 0.0f;
        ks6 ks6Var2 = ms6Var.r;
        float fE = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
        ks6 ks6Var3 = ms6Var.s;
        float fD2 = ks6Var3 != null ? ks6Var3.d(this) : 3.0f;
        ks6 ks6Var4 = ms6Var.t;
        float fE2 = ks6Var4 != null ? ks6Var4.e(this) : 3.0f;
        r05 r05Var = ms6Var.o;
        if (r05Var != null) {
            float fMax = fD2 / r05Var.d;
            float f7 = fE2 / r05Var.e;
            zs5 zs5Var = ms6Var.n;
            if (zs5Var == null) {
                zs5Var = zs5.d;
            }
            boolean zEquals = zs5Var.equals(zs5.c);
            ys5 ys5Var = zs5Var.a;
            if (!zEquals) {
                fMax = zs5Var.b == 2 ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f7);
            canvas.concat(matrix);
            r05 r05Var2 = ms6Var.o;
            float f8 = r05Var2.d * fMax;
            float f9 = r05Var2.e * f7;
            int iOrdinal = ys5Var.ordinal();
            if (iOrdinal == 2) {
                f = (fD2 - f8) / 2.0f;
                f2 = 0.0f - f;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                }
                            }
                        }
                    }
                    f = (fD2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                }
                f = fD2 - f8;
                f2 = 0.0f - f;
            }
            switch (ys5Var.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f3 = (fE2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!((du6) this.f0).a.q0.booleanValue()) {
                        t0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f3 = fE2 - f9;
                    f5 = 0.0f - f3;
                    if (!((du6) this.f0).a.q0.booleanValue()) {
                        t0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((du6) this.f0).a.q0.booleanValue()) {
                        t0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((du6) this.f0).a.q0.booleanValue()) {
                t0(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zM0 = m0();
        p0(ms6Var, false);
        if (zM0) {
            l0(ms6Var.h);
        }
        x0();
    }

    @Override // defpackage.jm
    public List r(wb4 wb4Var, cz5 cz5Var) {
        return !md2.c.e(cz5Var.f0).booleanValue() ? d02.X : e0(wb4Var, cz5Var, i0.Z);
    }

    public void r0(gs6 gs6Var) {
        ms6 ms6Var;
        ms6 ms6Var2;
        ms6 ms6Var3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        ys6 ys6Var = ((du6) this.f0).a;
        String str = ys6Var.s0;
        if (str == null && ys6Var.t0 == null && ys6Var.u0 == null) {
            return;
        }
        if (str == null) {
            ms6Var = null;
        } else {
            et6 et6VarY = gs6Var.a.y(str);
            if (et6VarY != null) {
                ms6Var = (ms6) et6VarY;
            } else {
                String str2 = ((du6) this.f0).a.s0;
                ms6Var = null;
            }
        }
        String str3 = ((du6) this.f0).a.t0;
        if (str3 == null) {
            ms6Var2 = null;
        } else {
            et6 et6VarY2 = gs6Var.a.y(str3);
            if (et6VarY2 != null) {
                ms6Var2 = (ms6) et6VarY2;
            } else {
                String str4 = ((du6) this.f0).a.t0;
                ms6Var2 = null;
            }
        }
        String str5 = ((du6) this.f0).a.u0;
        if (str5 == null) {
            ms6Var3 = null;
        } else {
            et6 et6VarY3 = gs6Var.a.y(str5);
            if (et6VarY3 != null) {
                ms6Var3 = (ms6) et6VarY3;
            } else {
                String str6 = ((du6) this.f0).a.u0;
                ms6Var3 = null;
            }
        }
        float f4 = 0.0f;
        if (gs6Var instanceof qs6) {
            arrayList = new xt6(this, ((qs6) gs6Var).o).X;
            f2 = 0.0f;
            i = 1;
        } else if (gs6Var instanceof ls6) {
            ls6 ls6Var = (ls6) gs6Var;
            ks6 ks6Var = ls6Var.o;
            float fD = ks6Var != null ? ks6Var.d(this) : 0.0f;
            ks6 ks6Var2 = ls6Var.p;
            float fE = ks6Var2 != null ? ks6Var2.e(this) : 0.0f;
            ks6 ks6Var3 = ls6Var.q;
            float fD2 = ks6Var3 != null ? ks6Var3.d(this) : 0.0f;
            ks6 ks6Var4 = ls6Var.r;
            float fE2 = ks6Var4 != null ? ks6Var4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fD2 - fD;
            i = 1;
            float f6 = fE2 - fE;
            arrayList2.add(new yt6(fD, fE, f5, f6));
            arrayList2.add(new yt6(fD2, fE2, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            ts6 ts6Var = (ts6) gs6Var;
            int length = ts6Var.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = ts6Var.o;
                yt6 yt6Var = new yt6(fArr[0], fArr[1], 0.0f, 0.0f);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = yt6Var.b;
                    f2 = f4;
                    f3 = yt6Var.a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = ts6Var.o;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    yt6Var.a(f9, f10);
                    arrayList3.add(yt6Var);
                    yt6Var = new yt6(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (ts6Var instanceof us6) {
                    float[] fArr3 = ts6Var.o;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            yt6Var.a(f11, f12);
                            arrayList3.add(yt6Var);
                            yt6 yt6Var2 = new yt6(f11, f12, f11 - f3, f12 - f);
                            yt6Var2.b((yt6) arrayList3.get(0));
                            arrayList3.add(yt6Var2);
                            arrayList3.set(0, yt6Var2);
                        }
                    }
                } else {
                    arrayList3.add(yt6Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ys6 ys6Var2 = ((du6) this.f0).a;
        ys6Var2.u0 = null;
        ys6Var2.t0 = null;
        ys6Var2.s0 = null;
        if (ms6Var != null) {
            q0(ms6Var, (yt6) arrayList.get(0));
        }
        if (ms6Var2 != null && arrayList.size() > 2) {
            yt6 yt6Var3 = (yt6) arrayList.get(0);
            yt6 yt6Var4 = (yt6) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                yt6 yt6Var5 = (yt6) arrayList.get(i3);
                if (yt6Var4.e) {
                    float f13 = yt6Var4.c;
                    float f14 = yt6Var4.d;
                    float f15 = yt6Var4.a;
                    float f16 = f15 - yt6Var3.a;
                    float f17 = yt6Var4.b;
                    float f18 = ((f17 - yt6Var3.b) * f14) + (f16 * f13);
                    if (f18 == f2) {
                        f18 = ((yt6Var5.a - f15) * f13) + ((yt6Var5.b - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        yt6Var4.c = -f13;
                        yt6Var4.d = -f14;
                    }
                }
                q0(ms6Var2, yt6Var4);
                yt6Var3 = yt6Var4;
                yt6Var4 = yt6Var5;
            }
        }
        if (ms6Var3 != null) {
            q0(ms6Var3, (yt6) arrayList.get(size - 1));
        }
    }

    public void s(String str, String str2) {
        HashMap map = (HashMap) this.i0;
        if (map != null) {
            map.put(str, str2);
        } else {
            bt.i("Property \"autoMetadata\" has not been set");
        }
    }

    public void s0(ns6 ns6Var, r05 r05Var) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.Y;
        Boolean bool = ns6Var.n;
        if (bool == null || !bool.booleanValue()) {
            ks6 ks6Var = ns6Var.p;
            float fC = ks6Var != null ? ks6Var.c(this, 1.0f) : 1.2f;
            ks6 ks6Var2 = ns6Var.q;
            float fC2 = ks6Var2 != null ? ks6Var2.c(this, 1.0f) : 1.2f;
            fD = fC * r05Var.d;
            fE = fC2 * r05Var.e;
        } else {
            ks6 ks6Var3 = ns6Var.p;
            fD = ks6Var3 != null ? ks6Var3.d(this) : r05Var.d;
            ks6 ks6Var4 = ns6Var.q;
            fE = ks6Var4 != null ? ks6Var4.e(this) : r05Var.e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        y0();
        du6 du6VarR = R(ns6Var);
        this.f0 = du6VarR;
        du6VarR.a.l0 = Float.valueOf(1.0f);
        boolean zM0 = m0();
        canvas.save();
        Boolean bool2 = ns6Var.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(r05Var.b, r05Var.c);
            canvas.scale(r05Var.d, r05Var.e);
        }
        p0(ns6Var, false);
        canvas.restore();
        if (zM0) {
            l0(r05Var);
        }
        x0();
    }

    public void t0(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float fE = f4 + f2;
        yr6 yr6Var = ((du6) this.f0).a.r0;
        if (yr6Var != null) {
            f += ((ks6) yr6Var.g0).d(this);
            f2 += ((ks6) ((du6) this.f0).a.r0.Y).e(this);
            fD -= ((ks6) ((du6) this.f0).a.r0.Z).d(this);
            fE -= ((ks6) ((du6) this.f0).a.r0.f0).e(this);
        }
        ((Canvas) this.Y).clipRect(f, f2, fD, fE);
    }

    public void u0(String str, Bundle bundle, boolean z) {
        String str2;
        String strEncodeToString;
        boolean zE;
        int i;
        char c;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        xa2 xa2Var = (xa2) this.Y;
        xa2Var.a();
        bundle.putString("gmp_app_id", xa2Var.c.b);
        bundle.putString("gmsv", Integer.toString(((r41) this.Z).h()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((r41) this.Z).f());
        r41 r41Var = (r41) this.Z;
        synchronized (r41Var) {
            try {
                if (((String) r41Var.f) == null) {
                    r41Var.j();
                }
                str2 = (String) r41Var.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("app_ver_name", str2);
        xa2 xa2Var2 = (xa2) this.Y;
        xa2Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(xa2Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        if (z) {
            xa2 xa2Var3 = (xa2) this.Y;
            xa2Var3.a();
            bundle.putString("Goog-Api-Key", xa2Var3.c.a);
        }
        try {
            String str3 = ((qy) g28.b(((mb2) ((nb2) this.i0)).d())).a;
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) g28.b(((mb2) ((nb2) this.i0)).c()));
        bundle.putString("cliv", "fcm-25.1.3");
        rz2 rz2Var = (rz2) ((w06) this.h0).get();
        rg1 rg1Var = (rg1) ((w06) this.g0).get();
        if (rz2Var == null || rg1Var == null) {
            return;
        }
        ue1 ue1Var = (ue1) rz2Var;
        synchronized (ue1Var) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            sz2 sz2Var = (sz2) ue1Var.a.get();
            synchronized (sz2Var) {
                zE = sz2Var.e(sz2.b, jCurrentTimeMillis);
            }
            i = 1;
            if (zE) {
                synchronized (sz2Var) {
                    sz2Var.a.a(new m40(sz2Var, sz2.b(System.currentTimeMillis())));
                }
                c = 3;
            } else {
                c = 1;
            }
        }
        if (c != 1) {
            if (c == 1) {
                i = 0;
            } else if (c != 2) {
                if (c != 3) {
                    throw null;
                }
                i = 2;
            }
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(i));
            bundle.putString("Firebase-Client", rg1Var.a());
        }
    }

    public jy v() {
        String strConcat = ((String) this.Y) == null ? " transportName" : _UrlKt.FRAGMENT_ENCODE_SET;
        if (((s02) this.f0) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.g0) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.h0) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.i0) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new jy((String) this.Y, (Integer) this.Z, (s02) this.f0, ((Long) this.g0).longValue(), ((Long) this.h0).longValue(), (HashMap) this.i0);
        }
        bt.i("Missing required properties:".concat(strConcat));
        return null;
    }

    public Path w(dt6 dt6Var, r05 r05Var) {
        Path pathK0;
        et6 et6VarY = dt6Var.a.y(((du6) this.f0).a.z0);
        if (et6VarY == null) {
            String str = ((du6) this.f0).a.z0;
            return null;
        }
        as6 as6Var = (as6) et6VarY;
        ((Stack) this.g0).push((du6) this.f0);
        this.f0 = R(as6Var);
        Boolean bool = as6Var.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(r05Var.b, r05Var.c);
            matrix.preScale(r05Var.d, r05Var.e);
        }
        Matrix matrix2 = as6Var.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (gt6 gt6Var : as6Var.i) {
            if ((gt6Var instanceof dt6) && (pathK0 = k0((dt6) gt6Var)) != null) {
                path.op(pathK0, Path.Op.UNION);
            }
        }
        if (((du6) this.f0).a.z0 != null) {
            r05 r05VarX = as6Var.h;
            if (r05VarX == null) {
                r05VarX = x(path);
                as6Var.h = r05VarX;
            }
            Path pathW = w(as6Var, r05VarX);
            if (pathW != null) {
                path.op(pathW, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f0 = (du6) ((Stack) this.g0).pop();
        return path;
    }

    public void x0() {
        ((Canvas) this.Y).restore();
        this.f0 = (du6) ((Stack) this.g0).pop();
    }

    public float y(rt6 rt6Var) {
        eu6 eu6Var = new eu6(this);
        K(rt6Var, eu6Var);
        return eu6Var.l0;
    }

    public void y0() {
        ((Canvas) this.Y).save();
        ((Stack) this.g0).push((du6) this.f0);
        this.f0 = new du6((du6) this.f0);
    }

    public String z0(String str, boolean z, boolean z2) {
        if (((du6) this.f0).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", _UrlKt.FRAGMENT_ENCODE_SET).replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", _UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", _UrlKt.FRAGMENT_ENCODE_SET);
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public /* synthetic */ fu6(ViewGroup viewGroup, TextView textView, ViewGroup viewGroup2, View view, View view2, View view3, byte b) {
        this.X = b;
        this.Y = viewGroup;
        this.Z = textView;
        this.f0 = viewGroup2;
        this.g0 = view;
        this.h0 = view2;
        this.i0 = view3;
    }

    public fu6(Set set, String str, String str2) {
        this.X = (byte) 8;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.Y = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f0 = str;
        this.g0 = str2;
        this.h0 = a97.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.Z = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw p61.k(it);
    }

    public fu6(wx4 wx4Var, z47 z47Var, ve4 ve4Var, y45 y45Var) {
        this.X = (byte) 5;
        this.X = (byte) 5;
        this.Y = y45Var;
        this.Z = ve4Var.b(new f0(this, (byte) 0));
        this.f0 = wx4Var;
        this.g0 = z47Var;
        this.h0 = new dq(wx4Var, z47Var);
        this.i0 = hv4.g;
    }

    public fu6(Context context, wx wxVar, rj0 rj0Var, dq dqVar, vh0 vh0Var, bm0 bm0Var) {
        this.X = (byte) 7;
        rj0Var.getClass();
        vh0Var.getClass();
        this.Y = context;
        this.Z = wxVar;
        this.f0 = rj0Var;
        this.g0 = dqVar;
        this.h0 = vh0Var;
        this.i0 = bm0Var;
    }

    public /* synthetic */ fu6(byte b) {
        this.X = b;
    }

    public fu6(al5 al5Var, jy2 jy2Var) {
        this.X = (byte) 15;
        zw5 zw5Var = new zw5((byte) 6);
        this.Y = al5Var;
        this.Z = zw5Var;
        this.f0 = jy2Var;
        this.g0 = nr4.e(false);
        this.h0 = gv3.b(Integer.MAX_VALUE, null, new t16((Object) this, (byte) 0), 2);
        this.i0 = new kt();
    }

    public fu6(re0 re0Var, ni0 ni0Var, hi0 hi0Var, it2 it2Var, cl7 cl7Var, yx7 yx7Var, re0 re0Var2) {
        this.X = (byte) 6;
        this.Y = ni0Var;
        this.Z = hi0Var;
        this.f0 = it2Var;
        this.g0 = cl7Var;
        this.h0 = yx7Var;
        this.i0 = re0Var2;
    }

    public fu6(xa2 xa2Var, r41 r41Var, w06 w06Var, w06 w06Var2, nb2 nb2Var) {
        this.X = (byte) 10;
        xa2Var.a();
        yq6 yq6Var = new yq6(xa2Var.a);
        this.Y = xa2Var;
        this.Z = r41Var;
        this.f0 = yq6Var;
        this.g0 = w06Var;
        this.h0 = w06Var2;
        this.i0 = nb2Var;
    }

    public fu6(gn2 gn2Var) {
        this.X = (byte) 9;
        this.Y = gn2Var;
        this.Z = new pf1(this);
        this.f0 = new m15();
        Boolean bool = Boolean.FALSE;
        this.g0 = z51.H(bool);
        this.h0 = z51.H(bool);
        this.i0 = z51.H(bool);
    }

    public fu6(f28 f28Var) {
        this.X = (byte) 11;
        f28Var.getClass();
        this.Y = f28Var;
        this.i0 = y13.a;
    }

    public fu6(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.X = (byte) 14;
        this.Y = new gs4(new q02((Object) this, (byte) 22));
        this.f0 = context;
        this.g0 = intent;
        this.h0 = pendingResult;
    }
}
