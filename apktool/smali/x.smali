.class public final synthetic Lx;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, Lx;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput-byte p1, p0, Lx;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte p0, p0, Lx;->X:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    return-object v1

    .line 10
    :pswitch_1
    sget p0, Lsu/happ/proxyutility/ui/BaseActivity;->P0:I

    .line 11
    .line 12
    sget-object p0, Lkw4;->a:Lkw4;

    .line 13
    .line 14
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_2
    sget-object p0, Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;->a:Lvz7;

    .line 20
    .line 21
    new-instance p0, La10;

    .line 22
    .line 23
    invoke-direct {p0}, La10;-><init>()V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_3
    new-instance p0, Lfe7;

    .line 28
    .line 29
    const v0, 0x4dffeb3b    # 5.3670077E8f

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lz51;->d(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-direct {p0, v0, v1}, Lfe7;-><init>(J)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_4
    invoke-static {}, Lw51;->q()Lds;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_5
    new-instance p0, Ltr;

    .line 46
    .line 47
    sget-object v0, Lnr;->b:Lnr;

    .line 48
    .line 49
    sget-object v1, Lfr;->b:Lfr;

    .line 50
    .line 51
    sget-object v2, Lcp;->b:Lcp;

    .line 52
    .line 53
    invoke-direct {p0, v0, v1, v2}, Ltr;-><init>(Lnr;Lfr;Lcp;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_6
    new-instance p0, Lgr;

    .line 58
    .line 59
    sget-object v0, Lsr;->e:Lsr;

    .line 60
    .line 61
    invoke-direct {p0, v0}, Lgr;-><init>(Lsr;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_7
    const/4 p0, 0x1

    .line 66
    invoke-static {p0}, Loc;->j(Z)Ldp;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_8
    sget-object p0, Lzo;->a:Lox1;

    .line 72
    .line 73
    sget-object p0, Loy1;->q0:Loy1;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_9
    sget-object p0, Lzo;->a:Lox1;

    .line 77
    .line 78
    sget-object p0, Lvf1;->a:Lvf1;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_a
    new-instance p0, Lyh;

    .line 82
    .line 83
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-ne v0, v2, :cond_0

    .line 92
    .line 93
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    sget-object v0, Ltp1;->a:Lnf1;

    .line 99
    .line 100
    sget-object v0, Ldm4;->a:Lhv2;

    .line 101
    .line 102
    new-instance v2, Lvh;

    .line 103
    .line 104
    const/4 v3, 0x2

    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-direct {v2, v3, v1, v4}, Lvh;-><init>(ILq51;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v2}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroid/view/Choreographer;

    .line 114
    .line 115
    :goto_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lz91;->p(Landroid/os/Looper;)Landroid/os/Handler;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {p0, v0, v1}, Lyh;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lyh;->n0:Lai;

    .line 127
    .line 128
    invoke-static {p0, v0}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_b
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_c
    const-string p0, "DEFAULT_TEST_TAG"

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_d
    const-string p0, "AndroidKeyStore"

    .line 142
    .line 143
    invoke-static {p0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_e
    const-string p0, "AES/GCM/NoPadding"

    .line 152
    .line 153
    invoke-static {p0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_f
    invoke-static {}, Lokhttp3/android/AndroidDns;->a()Landroid/security/NetworkSecurityPolicy;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_10
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :pswitch_11
    const-string p0, "LocalView"

    .line 169
    .line 170
    invoke-static {p0}, Lpc;->a(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :pswitch_12
    const-string p0, "LocalResourceIdCache"

    .line 175
    .line 176
    invoke-static {p0}, Lpc;->a(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v1

    .line 180
    :pswitch_13
    const-string p0, "LocalImageVectorCache"

    .line 181
    .line 182
    invoke-static {p0}, Lpc;->a(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v1

    .line 186
    :pswitch_14
    const-string p0, "LocalContext"

    .line 187
    .line 188
    invoke-static {p0}, Lpc;->a(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v1

    .line 192
    :pswitch_15
    const-string p0, "LocalConfiguration"

    .line 193
    .line 194
    invoke-static {p0}, Lpc;->a(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v1

    .line 198
    :pswitch_16
    return-object v0

    .line 199
    :pswitch_17
    sget-object p0, Ln8;->a:Lig5;

    .line 200
    .line 201
    sget-object p0, Lde1;->a:Lde1;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_18
    return-object v0

    .line 205
    :pswitch_19
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 206
    .line 207
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_1a
    sget-object p0, Lkw4;->a:Lkw4;

    .line 217
    .line 218
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_1b
    const/high16 p0, 0x7fff0000

    .line 224
    .line 225
    sget-object v0, Lm66;->Y:Ll2;

    .line 226
    .line 227
    invoke-virtual {v0, p0}, Ll2;->g(I)I

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    const/high16 v0, 0x10000

    .line 232
    .line 233
    add-int/2addr p0, v0

    .line 234
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    return-object p0

    .line 239
    :pswitch_1c
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 240
    .line 241
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->k0:Lvz7;

    .line 246
    .line 247
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    check-cast p0, Ls24;

    .line 252
    .line 253
    return-object p0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
