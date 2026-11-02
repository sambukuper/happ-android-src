.class public final Lz79;
.super Lw79;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lz79;->i:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public g(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Lps2;Lqs2;)Lis2;
    .locals 7

    .line 1
    iget-byte v0, p0, Lz79;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, Lw79;->g(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Lps2;Lqs2;)Lis2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p4}, Lpc6;->i(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    throw p0

    .line 16
    :pswitch_1
    check-cast p4, La97;

    .line 17
    .line 18
    new-instance v0, Lz87;

    .line 19
    .line 20
    iget-object p0, p3, Lfu6;->h0:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p3, Lfu6;->i0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Integer;

    .line 25
    .line 26
    new-instance v4, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string p4, "com.google.android.gms.signin.internal.clientRequestedAccount"

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v4, p4, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 35
    .line 36
    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const-string p4, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {v4, p4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    const-string p0, "com.google.android.gms.signin.internal.offlineAccessRequested"

    .line 49
    .line 50
    const/4 p4, 0x0

    .line 51
    invoke-virtual {v4, p0, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string p0, "com.google.android.gms.signin.internal.idTokenRequested"

    .line 55
    .line 56
    invoke-virtual {v4, p0, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string p0, "com.google.android.gms.signin.internal.serverClientId"

    .line 60
    .line 61
    invoke-virtual {v4, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string p0, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-virtual {v4, p0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    const-string p0, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    .line 71
    .line 72
    invoke-virtual {v4, p0, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    const-string p0, "com.google.android.gms.signin.internal.hostedDomain"

    .line 76
    .line 77
    invoke-virtual {v4, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string p0, "com.google.android.gms.signin.internal.logSessionId"

    .line 81
    .line 82
    invoke-virtual {v4, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string p0, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    .line 86
    .line 87
    invoke-virtual {v4, p0, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    move-object v1, p1

    .line 91
    move-object v2, p2

    .line 92
    move-object v3, p3

    .line 93
    move-object v5, p5

    .line 94
    move-object v6, p6

    .line 95
    invoke-direct/range {v0 .. v6}, Lz87;-><init>(Landroid/content/Context;Landroid/os/Looper;Lfu6;Landroid/os/Bundle;Lps2;Lqs2;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Li89;Li89;)Lis2;
    .locals 7

    .line 1
    iget-byte v0, p0, Lz79;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, Lw79;->h(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Li89;Li89;)Lis2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p5

    .line 15
    move-object v6, p6

    .line 16
    check-cast p4, Lan;

    .line 17
    .line 18
    new-instance v0, Lfa9;

    .line 19
    .line 20
    const/16 v3, 0x1c9

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, Lis2;-><init>(Landroid/content/Context;Landroid/os/Looper;ILfu6;Lps2;Lqs2;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    move-object v1, p1

    .line 27
    move-object v2, p2

    .line 28
    move-object v4, p3

    .line 29
    move-object v5, p5

    .line 30
    move-object v6, p6

    .line 31
    check-cast p4, Lj28;

    .line 32
    .line 33
    new-instance v0, Li99;

    .line 34
    .line 35
    move-object v3, v4

    .line 36
    move-object v4, p4

    .line 37
    invoke-direct/range {v0 .. v6}, Li99;-><init>(Landroid/content/Context;Landroid/os/Looper;Lfu6;Lj28;Li89;Li89;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_2
    move-object v1, p1

    .line 42
    move-object v2, p2

    .line 43
    move-object v4, p3

    .line 44
    move-object v5, p5

    .line 45
    move-object v6, p6

    .line 46
    check-cast p4, Lan;

    .line 47
    .line 48
    new-instance v0, Lf89;

    .line 49
    .line 50
    const/16 v3, 0x1c1

    .line 51
    .line 52
    invoke-direct/range {v0 .. v6}, Lis2;-><init>(Landroid/content/Context;Landroid/os/Looper;ILfu6;Lps2;Lqs2;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
