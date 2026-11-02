package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class op5 implements ip5 {
    public final s61 a;
    public final Context b;
    public final zz6 c;
    public final ge4 d;
    public TextClassifier f;
    public final q15 e = r15.a();
    public final rh5 g = z51.H(null);
    public final Object h = new Object();

    public op5(s61 s61Var, Context context, zz6 zz6Var, ge4 ge4Var) {
        this.a = s61Var;
        this.b = context;
        this.c = zz6Var;
        this.d = ge4Var;
    }

    public final void a(e38 e38Var, CharSequence charSequence, long j, v28 v28Var) {
        q15 q15Var = this.e;
        d38 d38Var = null;
        if (q15Var.d()) {
            d38 d38Var2 = (d38) this.g.getValue();
            if (d38Var2 == null || !f88.a(j, d38Var2.b) || !dh3.f(charSequence, d38Var2.a)) {
                d38Var2 = null;
            }
            q15Var.m(null);
            d38Var = d38Var2;
        }
        if (d38Var == null) {
            v28Var.B(e38Var);
            return;
        }
        ArrayList arrayList = d38Var.d;
        TextClassification textClassification = d38Var.c;
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            e38Var.a.a(new u38(obj, textClassification, 0, (Drawable) arrayList.get(0)));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            e38Var.a.a(new u38(obj, textClassification, -1, textClassification.getIcon()));
        }
        v28Var.B(e38Var);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                e38Var.a.a(new u38(obj, textClassification, i, (Drawable) arrayList.get(i)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(CharSequence charSequence, long j, TextClassifier textClassifier, s51 s51Var) throws Throwable {
        jp5 jp5Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        q15 q15Var;
        Object obj;
        Object obj2;
        d38 d38VarC;
        Object obj3;
        o15 o15Var;
        if (s51Var instanceof jp5) {
            jp5Var = (jp5) s51Var;
            int i = jp5Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp5Var.l0 = i - Integer.MIN_VALUE;
            } else {
                jp5Var = new jp5(this, s51Var);
            }
        } else {
            jp5Var = new jp5(this, s51Var);
        }
        Object obj4 = jp5Var.j0;
        int i2 = jp5Var.l0;
        rh5 rh5Var = this.g;
        dn8 dn8Var = dn8.a;
        q15 q15Var2 = this.e;
        c71 c71Var = c71.X;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = jp5Var.i0;
                        q15 q15Var3 = jp5Var.h0;
                        textClassifier2 = (TextClassifier) jp5Var.g0;
                        charSequence2 = (CharSequence) jp5Var.f0;
                        w39.n0(obj4);
                        q15Var = q15Var3;
                    } else {
                        if (i2 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o15 o15Var2 = (o15) jp5Var.g0;
                        d38VarC = (d38) jp5Var.f0;
                        w39.n0(obj4);
                        obj3 = null;
                        o15Var = o15Var2;
                    }
                    rh5Var.setValue(d38VarC);
                    return dn8Var;
                }
                w39.n0(obj4);
                jp5Var.f0 = charSequence;
                jp5Var.g0 = textClassifier;
                jp5Var.h0 = q15Var2;
                j2 = j;
                jp5Var.i0 = j2;
                jp5Var.l0 = 1;
                if (q15Var2.g(jp5Var) == c71Var) {
                    return c71Var;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                q15Var = q15Var2;
                rh5Var.setValue(d38VarC);
                return dn8Var;
            } finally {
                o15Var.m(obj3);
            }
            d38 d38Var = (d38) rh5Var.getValue();
            if (d38Var != null) {
                try {
                    if (f88.a(j2, d38Var.b) && dh3.f(charSequence2, d38Var.a)) {
                        q15Var.m(null);
                        return dn8Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    q15Var.m(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            q15Var.m(obj2);
            d38VarC = c(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, f88.d(j2), f88.c(j2)).setDefaultLocales(d()).build()));
            jp5Var.f0 = d38VarC;
            jp5Var.g0 = q15Var2;
            obj3 = null;
            jp5Var.h0 = null;
            jp5Var.l0 = 2;
            Object objG = q15Var2.g(jp5Var);
            o15Var = q15Var2;
            if (objG == c71Var) {
                return c71Var;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final d38 c(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteActionA = xw3.a(remoteAction);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionA.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteActionA2 = xw3.a(remoteAction);
            if (remoteActionA2 != null && (icon = remoteActionA2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new d38(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList d() {
        ge4 ge4Var = this.d;
        if (ge4Var == null) {
            return new LocaleList(((ce4) uo5.a.l().X.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(xv0.Z(ge4Var, 10));
        Iterator it = ge4Var.X.iterator();
        while (it.hasNext()) {
            arrayList.add(((ce4) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
