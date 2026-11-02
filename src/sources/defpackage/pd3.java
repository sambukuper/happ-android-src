package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd3 implements TextWatcher {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public pd3(TextView textView, sd3 sd3Var) {
        this.Y = textView;
        this.Z = sd3Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.X) {
            case 0:
                ((TextView) this.Y).setText(((sd3) this.Z).N().getString(y46.dialog_input_url_symbols_indicator, Integer.valueOf(String.valueOf(editable).length())));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.X;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.X) {
            case 0:
                break;
            default:
                wy6 wy6Var = (wy6) this.Y;
                SearchBar searchBar = (SearchBar) this.Z;
                Handler handler = searchBar.m0;
                if (!searchBar.A0) {
                    handler.removeCallbacks(wy6Var);
                    handler.post(wy6Var);
                    break;
                }
                break;
        }
    }

    public pd3(SearchBar searchBar, wy6 wy6Var) {
        this.Z = searchBar;
        this.Y = wy6Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
