package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends wz implements u07, ch2 {
    public final mo5 X;
    public final b17 Y;
    public final AndroidComposeView Z;
    public final u86 f0;
    public final String g0;
    public final Rect h0 = new Rect();
    public final AutofillId i0;
    public final wz4 j0;
    public boolean k0;

    public ua(mo5 mo5Var, b17 b17Var, AndroidComposeView androidComposeView, u86 u86Var, String str) {
        this.X = mo5Var;
        this.Y = b17Var;
        this.Z = androidComposeView;
        this.f0 = u86Var;
        this.g0 = str;
        androidComposeView.setImportantForAutofill(1);
        vz vzVarE = mn7.e(androidComposeView);
        AutofillId autofillId = vzVarE != null ? (AutofillId) vzVarE.a : null;
        if (autofillId == null) {
            throw p61.j("Required value was null.");
        }
        this.i0 = autofillId;
        this.j0 = new wz4();
    }

    @Override // defpackage.ch2
    public final void a(ai2 ai2Var, ai2 ai2Var2) {
        LayoutNode layoutNodeZ;
        t07 t07VarY;
        LayoutNode layoutNodeZ2;
        t07 t07VarY2;
        AndroidComposeView androidComposeView = this.Z;
        mo5 mo5Var = this.X;
        if (ai2Var != null && (layoutNodeZ2 = yn0.Z(ai2Var)) != null && (t07VarY2 = layoutNodeZ2.y()) != null && z91.I(t07VarY2)) {
            mo5Var.e(androidComposeView, layoutNodeZ2.Y);
        }
        if (ai2Var2 == null || (layoutNodeZ = yn0.Z(ai2Var2)) == null || (t07VarY = layoutNodeZ.y()) == null || !z91.I(t07VarY)) {
            return;
        }
        int i = layoutNodeZ.Y;
        u86 u86Var = this.f0;
        LayoutNode layoutNode = (LayoutNode) u86Var.a.b(i);
        if (layoutNode == null || layoutNode.i0 == -4) {
            return;
        }
        ne neVar = u86Var.c;
        int iD = u86Var.d(layoutNode);
        long[] jArr = (long[]) neVar.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        mo5Var.d(androidComposeView, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }

    public final void b(SparseArray sparseArray) {
        t07 t07VarY;
        gn2 gn2Var;
        gn2 gn2Var2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueA = c42.a(sparseArray.get(iKeyAt));
            LayoutNode layoutNode = (LayoutNode) this.Y.c.b(iKeyAt);
            if (layoutNode != null && (t07VarY = layoutNode.y()) != null) {
                s05 s05Var = t07VarY.X;
                Object objG = s05Var.g(s07.g);
                if (objG == null) {
                    objG = null;
                }
                q3 q3Var = (q3) objG;
                if (q3Var != null && (gn2Var2 = (gn2) q3Var.b) != null) {
                }
                Object objG2 = s05Var.g(s07.h);
                q3 q3Var2 = (q3) (objG2 != null ? objG2 : null);
                if (q3Var2 != null && (gn2Var = (gn2) q3Var2.b) != null) {
                }
            }
        }
    }
}
