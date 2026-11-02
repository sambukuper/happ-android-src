package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rf7 extends ArrayAdapter {
    public final LayoutInflater X;
    public final CustomSpinner Y;
    public final String[] Z;
    public int f0;
    public int g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf7(Context context, LayoutInflater layoutInflater, CustomSpinner customSpinner, String[] strArr) {
        super(context, t46.spinner_dropdown_item, strArr);
        customSpinner.getClass();
        this.X = layoutInflater;
        this.Y = customSpinner;
        this.Z = strArr;
        customSpinner.setOnItemSelectedListenerForAdapter(new ob4(this, (byte) 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.Z.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(final int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        if (view == null) {
            view = this.X.inflate(t46.spinner_dropdown_item_popup, viewGroup, false);
        }
        CustomSpinner customSpinner = this.Y;
        boolean z = customSpinner.getSelectedItemPosition() == i;
        if (z) {
            view.requestFocus();
        }
        TextView textView = (TextView) view.findViewById(e46.item_text);
        String string = this.Z[i];
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            string = getContext().getString(y46.spinner_item_none);
            string.getClass();
        }
        textView.setText(string);
        View viewFindViewById = view.findViewById(e46.item_check);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(z ? 0 : 8);
        view.setOnClickListener(new View.OnClickListener() { // from class: pf7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomSpinner customSpinner2 = this.X.Y;
                customSpinner2.setSelection(i);
                customSpinner2.onDetachedFromWindow();
            }
        });
        if (i == 0) {
            customSpinner.setDropDownVerticalOffset(this.f0);
            customSpinner.setDropDownHorizontalOffset(this.g0);
            view.getViewTreeObserver().addOnGlobalLayoutListener(new qf7(viewGroup, this, view));
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return this.Z[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        if (view == null) {
            view = this.X.inflate(t46.spinner_dropdown_item, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(e46.item_text);
        String string = this.Z[i];
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            string = getContext().getString(y46.spinner_item_none);
            string.getClass();
        }
        textView.setText(string);
        return view;
    }
}
