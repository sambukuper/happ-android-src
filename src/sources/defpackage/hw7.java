package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hw7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    public static li8 a(ArrayList arrayList, li8 li8Var, sw3 sw3Var, ClassLoader classLoader) {
        sw3 sw3VarH0;
        arrayList.getClass();
        ArrayList<rw3> arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oz3 oz3Var = (oz3) it.next();
            kb6 kb6Var = sw3Var instanceof kb6 ? (kb6) sw3Var : null;
            if (kb6Var == null || (sw3VarH0 = mb6.h0(kb6Var)) == null) {
                sw3VarH0 = sw3Var;
            }
            String str = oz3Var.b;
            yw3 yw3VarB0 = ys0.b0(oz3Var.d);
            ow.B.x(ow.a[54], oz3Var);
            str.getClass();
            arrayList2.add(new rw3(null, sw3VarH0, str, yw3VarB0));
        }
        gu guVarD1 = wv0.d1(arrayList);
        int iG = aq4.G(xv0.Z(guVarD1, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        Iterator it2 = guVarD1.iterator();
        while (true) {
            rw1 rw1Var = (rw1) it2;
            if (!rw1Var.Y.hasNext()) {
                break;
            }
            pb3 pb3Var = (pb3) rw1Var.next();
            linkedHashMap.put(Integer.valueOf(((oz3) pb3Var.b).c), arrayList2.get(pb3Var.a));
        }
        li8 li8Var2 = new li8(arrayList2, linkedHashMap, li8Var);
        int i = 0;
        for (rw3 rw3Var : arrayList2) {
            int i2 = i + 1;
            ArrayList arrayList3 = ((oz3) arrayList.get(i)).e;
            ?? arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(ys0.a0((mz3) it3.next(), classLoader, li8Var2, null, 8));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = i21.K(rg7.b);
            }
            rw3Var.getClass();
            rw3Var.i0 = arrayList4;
            i = i2;
        }
        return li8Var2;
    }

    public static c29 b(lp2 lp2Var) {
        View view = (View) lp2Var.j(pc.f);
        c29 c29VarC = c(view);
        boolean zH = lp2Var.h(c29VarC) | lp2Var.h(view);
        Object objK = lp2Var.K();
        if (zH || objK == zz0.a) {
            objK = new gq6(c29VarC, view, (byte) 23);
            lp2Var.g0(objK);
        }
        u70.a(c29VarC, (gn2) objK, lp2Var);
        return c29VarC;
    }

    public static c29 c(View view) {
        c29 c29Var;
        WeakHashMap weakHashMap = c29.w;
        synchronized (weakHashMap) {
            try {
                Object c29Var2 = weakHashMap.get(view);
                if (c29Var2 == null) {
                    c29Var2 = new c29(view);
                    weakHashMap.put(view, c29Var2);
                }
                c29Var = (c29) c29Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c29Var;
    }

    public static ur5 d(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new ur5(en.F(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(en.q(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new ur5(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(pe7 pe7Var, s51 s51Var) {
        ws8 ws8Var;
        pe7 pe7Var2;
        Throwable th;
        i90 i90Var;
        if (s51Var instanceof ws8) {
            ws8Var = (ws8) s51Var;
            int i = ws8Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ws8Var.i0 = i - Integer.MIN_VALUE;
            } else {
                ws8Var = new ws8(s51Var);
            }
        } else {
            ws8Var = new ws8(s51Var);
        }
        Object obj = ws8Var.h0;
        int i2 = ws8Var.i0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i90Var = ws8Var.g0;
            pe7Var2 = ws8Var.f0;
            try {
                w39.n0(obj);
                u15.h(pe7Var2, null);
                return i90Var;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    u15.h(pe7Var2, th);
                    throw th3;
                }
            }
        }
        w39.n0(obj);
        try {
            i90 i90Var2 = new i90();
            ws8Var.f0 = pe7Var;
            ws8Var.g0 = i90Var2;
            ws8Var.i0 = 1;
            pe7Var.X.Z(i90Var2);
            dn8 dn8Var = dn8.a;
            c71 c71Var = c71.X;
            if (dn8Var == c71Var) {
                return c71Var;
            }
            pe7Var2 = pe7Var;
            i90Var = i90Var2;
            u15.h(pe7Var2, null);
            return i90Var;
        } catch (Throwable th4) {
            pe7Var2 = pe7Var;
            th = th4;
            throw th;
        }
    }

    public static void f(TextView textView, int i) {
        mb6.q(i);
        if (Build.VERSION.SDK_INT >= 28) {
            en.S(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void g(TextView textView, int i) {
        mb6.q(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void h(TextView textView, int i) {
        mb6.q(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static ActionMode.Callback i(ActionMode.Callback callback) {
        return (!(callback instanceof x88) || Build.VERSION.SDK_INT < 26) ? callback : ((x88) callback).a;
    }

    public static kt8 j(int i, String str) {
        return new kt8(new pe3(0, 0, 0, 0), str);
    }

    public static ActionMode.Callback k(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof x88) || callback == null) ? callback : new x88(callback, textView);
    }
}
