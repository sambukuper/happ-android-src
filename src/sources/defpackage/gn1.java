package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn1 implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById;
        q70 q70Var = dialogInterface instanceof q70 ? (q70) dialogInterface : null;
        if (q70Var == null || (viewFindViewById = q70Var.findViewById(c46.design_bottom_sheet)) == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorD = BottomSheetBehavior.D(viewFindViewById);
        bottomSheetBehaviorD.N(3);
        bottomSheetBehaviorD.K = true;
    }
}
