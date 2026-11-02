package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jq implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ jq(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                lq lqVar = (lq) obj;
                AppCompatSpinner appCompatSpinner = lqVar.I0;
                appCompatSpinner.setSelection(i);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i, lqVar.F0.getItemId(i));
                }
                lqVar.dismiss();
                break;
            case 1:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.j0;
                if (i < 0) {
                    item = !listPopupWindow.B0.isShowing() ? null : listPopupWindow.Z.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i);
                }
                materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !listPopupWindow.B0.isShowing() ? null : listPopupWindow.Z.getSelectedView();
                        i = !listPopupWindow.B0.isShowing() ? -1 : listPopupWindow.Z.getSelectedItemPosition();
                        j = !listPopupWindow.B0.isShowing() ? Long.MIN_VALUE : listPopupWindow.Z.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(listPopupWindow.Z, view, i, j);
                }
                listPopupWindow.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
