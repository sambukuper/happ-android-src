package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.lg7;
import defpackage.mb6;
import defpackage.v2;
import defpackage.w45;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends v2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new lg7((byte) 11);
    public final String X;
    public final String Y;
    public final String Z;
    public final String f0;
    public final Uri g0;
    public String h0;
    public final long i0;
    public final String j0;
    public final List k0;
    public final String l0;
    public final String m0;
    public final HashSet n0 = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.f0 = str4;
        this.g0 = uri;
        this.h0 = str5;
        this.i0 = j;
        this.j0 = str6;
        this.k0 = arrayList;
        this.l0 = str7;
        this.m0 = str8;
    }

    public static GoogleSignInAccount c(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        w45.q(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.h0 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.j0.equals(this.j0)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.k0);
        hashSet.addAll(googleSignInAccount.n0);
        HashSet hashSet2 = new HashSet(this.k0);
        hashSet2.addAll(this.n0);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.j0.hashCode() + 527;
        HashSet hashSet = new HashSet(this.k0);
        hashSet.addAll(this.n0);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.n0(parcel, 2, this.X);
        mb6.n0(parcel, 3, this.Y);
        mb6.n0(parcel, 4, this.Z);
        mb6.n0(parcel, 5, this.f0);
        mb6.m0(parcel, 6, this.g0, i);
        mb6.n0(parcel, 7, this.h0);
        mb6.r0(parcel, 8, 8);
        parcel.writeLong(this.i0);
        mb6.n0(parcel, 9, this.j0);
        mb6.p0(parcel, 10, this.k0);
        mb6.n0(parcel, 11, this.l0);
        mb6.n0(parcel, 12, this.m0);
        mb6.t0(parcel, iS0);
    }
}
