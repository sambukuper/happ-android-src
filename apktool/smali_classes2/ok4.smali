.class public final synthetic Lok4;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;

.field public final synthetic Z:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public final synthetic f0:Ljava/lang/Boolean;

.field public final synthetic g0:Z

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Z

.field public final synthetic j0:Ljava/lang/String;

.field public final synthetic k0:Z

.field public final synthetic l0:Lg83;


# direct methods
.method public constructor <init>(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/lang/String;ZLg83;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lok4;->X:Z

    .line 2
    .line 3
    iput-object p2, p0, Lok4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    iput-object p3, p0, Lok4;->Z:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 6
    .line 7
    iput-object p4, p0, Lok4;->f0:Ljava/lang/Boolean;

    .line 8
    .line 9
    iput-boolean p5, p0, Lok4;->g0:Z

    .line 10
    .line 11
    iput-object p6, p0, Lok4;->h0:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lok4;->i0:Z

    .line 14
    .line 15
    iput-object p8, p0, Lok4;->j0:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p9, p0, Lok4;->k0:Z

    .line 18
    .line 19
    iput-object p10, p0, Lok4;->l0:Lg83;

    .line 20
    .line 21
    const-string p4, "importConfigViaSub_G_TNPe4$onConfigTextError(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/lang/String;ZLsu/happ/proxyutility/interfaces/ImportConfigViaSubResultListener;Ljava/lang/Throwable;)V"

    .line 22
    .line 23
    const/4 p5, 0x0

    .line 24
    const/4 p1, 0x1

    .line 25
    const-class p2, Lch3;

    .line 26
    .line 27
    const-string p3, "onConfigTextError"

    .line 28
    .line 29
    invoke-direct/range {p0 .. p5}, Lno2;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 7
    .line 8
    instance-of v0, p1, Lqr7;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-boolean v9, p0, Lok4;->X:Z

    .line 12
    .line 13
    iget-object v3, p0, Lok4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 14
    .line 15
    iget-object v5, p0, Lok4;->Z:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    if-nez v9, :cond_0

    .line 22
    .line 23
    sget-object p0, Lko1;->B1:Lm51;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lkm4;->x(Lml2;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v6, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;

    .line 45
    .line 46
    invoke-direct {v6, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;-><init>(Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v6, v4

    .line 51
    :goto_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    filled-new-array {v6, v0, v7, p0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    xor-int/2addr p0, v2

    .line 76
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object p0, v4

    .line 82
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_3

    .line 89
    .line 90
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    sget-object p0, Lq23;->f0:Lq23;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    check-cast p1, Lqr7;

    .line 100
    .line 101
    iget-object p0, p1, Lqr7;->X:Lq23;

    .line 102
    .line 103
    :goto_2
    iget-object p1, v3, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 104
    .line 105
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget-object v0, Ltp1;->a:Lnf1;

    .line 110
    .line 111
    sget-object v0, Ldm4;->a:Lhv2;

    .line 112
    .line 113
    new-instance v2, Lk;

    .line 114
    .line 115
    const/16 v5, 0x14

    .line 116
    .line 117
    invoke-direct {v2, v3, p0, v4, v5}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0, v2, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 121
    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    instance-of v0, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 126
    .line 127
    iget-boolean v7, p0, Lok4;->g0:Z

    .line 128
    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 132
    .line 133
    iget-object v0, p0, Lok4;->f0:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    if-nez v9, :cond_b

    .line 142
    .line 143
    sget-object p0, Lko1;->B1:Lm51;

    .line 144
    .line 145
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    sget-object p1, Ljo1;->h0:Ljo1;

    .line 150
    .line 151
    invoke-static {p0, p1, v4}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_4

    .line 155
    .line 156
    :cond_5
    if-nez v9, :cond_b

    .line 157
    .line 158
    invoke-static {v3}, Li21;->H(Ld94;)Lu84;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    sget-object v0, Ltp1;->a:Lnf1;

    .line 163
    .line 164
    sget-object v0, Ldm4;->a:Lhv2;

    .line 165
    .line 166
    new-instance v2, Lmk4;

    .line 167
    .line 168
    const/4 v12, 0x0

    .line 169
    iget-object v4, p0, Lok4;->h0:Ljava/lang/String;

    .line 170
    .line 171
    iget-boolean v6, p0, Lok4;->i0:Z

    .line 172
    .line 173
    iget-object v8, p0, Lok4;->j0:Ljava/lang/String;

    .line 174
    .line 175
    iget-boolean v10, p0, Lok4;->k0:Z

    .line 176
    .line 177
    iget-object v11, p0, Lok4;->l0:Lg83;

    .line 178
    .line 179
    invoke-direct/range {v2 .. v12}, Lmk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;ZZLg83;Lq51;)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1, v0, v2, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    instance-of p0, p1, Ljava/net/SocketTimeoutException;

    .line 187
    .line 188
    if-nez p0, :cond_a

    .line 189
    .line 190
    instance-of p0, p1, Ljava/net/ConnectException;

    .line 191
    .line 192
    if-nez p0, :cond_a

    .line 193
    .line 194
    instance-of p0, p1, Ljava/io/InterruptedIOException;

    .line 195
    .line 196
    if-eqz p0, :cond_7

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    instance-of p0, p1, Ljava/io/IOException;

    .line 200
    .line 201
    if-eqz p0, :cond_9

    .line 202
    .line 203
    if-nez v9, :cond_8

    .line 204
    .line 205
    sget-object p0, Lko1;->B1:Lm51;

    .line 206
    .line 207
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    move-object v0, p1

    .line 212
    check-cast v0, Ljava/io/IOException;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    sget-object v1, Ljo1;->g0:Ljo1;

    .line 219
    .line 220
    invoke-static {p0, v1, v0}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_8
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 224
    .line 225
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    new-instance v0, Ln72;

    .line 234
    .line 235
    invoke-direct {v0, p1, v2}, Ln72;-><init>(Ljava/lang/Throwable;B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, v0}, Lkf4;->h(Lgn2;)V

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_9
    if-nez v9, :cond_b

    .line 243
    .line 244
    sget-object p0, Lko1;->B1:Lm51;

    .line 245
    .line 246
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-static {p0}, Lkm4;->x(Lml2;)V

    .line 251
    .line 252
    .line 253
    new-instance p0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 254
    .line 255
    sget-object p1, Lr83;->a:Lr83;

    .line 256
    .line 257
    const/4 v0, 0x5

    .line 258
    const/4 v1, 0x0

    .line 259
    invoke-direct {p0, v1, p1, v4, v0}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, p0, v7, v2}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_a
    :goto_3
    if-nez v9, :cond_b

    .line 267
    .line 268
    sget-object p0, Lko1;->B1:Lm51;

    .line 269
    .line 270
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    sget-object p1, Ljo1;->f0:Ljo1;

    .line 275
    .line 276
    invoke-static {p0, p1, v4}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_b
    :goto_4
    sget-object p0, Lss8;->a:Lss8;

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    const-string p0, ""

    .line 285
    .line 286
    const-string p1, "su.happ.proxyutility.action.service"

    .line 287
    .line 288
    const/16 v0, 0x2a

    .line 289
    .line 290
    invoke-static {v3, p1, v0, p0}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 291
    .line 292
    .line 293
    sget-object p0, Ldn8;->a:Ldn8;

    .line 294
    .line 295
    return-object p0
.end method
