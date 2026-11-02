package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class np5 extends uy7 implements rn2 {
    public q15 g0;
    public op5 h0;
    public long i0;
    public byte j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ CharSequence l0;
    public final /* synthetic */ long m0;
    public final /* synthetic */ op5 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np5(long j, q51 q51Var, op5 op5Var, CharSequence charSequence) {
        super(2, q51Var);
        this.l0 = charSequence;
        this.m0 = j;
        this.n0 = op5Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((np5) n((q51) obj2, kp5.d(obj))).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        np5 np5Var = new np5(this.m0, q51Var, this.n0, this.l0);
        np5Var.k0 = obj;
        return np5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        long j;
        q15 q15Var;
        op5 op5Var;
        d38 d38Var;
        byte b = this.j0;
        if (b == 0) {
            w39.n0(obj);
            TextClassifier textClassifierD = kp5.d(this.k0);
            long j2 = this.m0;
            int iD = f88.d(j2);
            int iC = f88.c(j2);
            CharSequence charSequence = this.l0;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iD, iC);
            op5 op5Var2 = this.n0;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(op5Var2.d());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierD.suggestSelection(defaultLocales.build());
            long jC = ct7.c(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            c71 c71Var = c71.X;
            if (i < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.i0 = jC;
                this.j0 = (byte) 2;
                if (this.n0.b(this.l0, jC, textClassifierD, this) != c71Var) {
                    j = jC;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                d38 d38VarC = op5Var2.c(charSequence, jC, textClassification);
                q15Var = op5Var2.e;
                this.k0 = d38VarC;
                this.g0 = q15Var;
                this.h0 = op5Var2;
                this.i0 = jC;
                this.j0 = (byte) 1;
                if (q15Var.g(this) != c71Var) {
                    op5Var = op5Var2;
                    d38Var = d38VarC;
                    j = jC;
                    op5Var.g.setValue(d38Var);
                }
            }
            return c71Var;
        }
        if (b == 1) {
            j = this.i0;
            op5Var = this.h0;
            q15Var = this.g0;
            d38Var = (d38) this.k0;
            w39.n0(obj);
            try {
                op5Var.g.setValue(d38Var);
            } finally {
                q15Var.m(null);
            }
        } else {
            if (b != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.i0;
            w39.n0(obj);
        }
        return new f88(j);
    }
}
