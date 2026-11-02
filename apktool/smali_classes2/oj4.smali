.class public final synthetic Loj4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Loj4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Loj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Loj4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x4

    .line 7
    sget-object v5, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    iget-object p0, p0, Loj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->x1:Lr6;

    .line 25
    .line 26
    new-instance v0, Landroid/content/Intent;

    .line 27
    .line 28
    const-class v1, Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lr6;->h0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget p1, Ly46;->toast_permission_denied:I

    .line 38
    .line 39
    sget v0, Ly46;->permission_camera:I

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v0, Lay2;

    .line 57
    .line 58
    sget v1, Ly46;->toast_permission_denied_open_settings:I

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget v2, Lq36;->ic_settings_12dp:I

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v3, Lmj4;

    .line 74
    .line 75
    const/16 v6, 0xb

    .line 76
    .line 77
    invoke-direct {v3, p0, v6}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1, v2, v3}, Lay2;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ldn2;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p0, p1, v0, v4}, Lpu;->N(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;Ljava/util/List;I)V

    .line 88
    .line 89
    .line 90
    :goto_0
    return-object v5

    .line 91
    :pswitch_0
    check-cast p1, Lom4;

    .line 92
    .line 93
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 94
    .line 95
    if-nez p1, :cond_1

    .line 96
    .line 97
    const/4 p1, -0x1

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sget-object v0, Ltj4;->a:[I

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    aget p1, v0, p1

    .line 106
    .line 107
    :goto_1
    const/4 v0, 0x1

    .line 108
    if-eq p1, v0, :cond_3

    .line 109
    .line 110
    if-eq p1, v2, :cond_4

    .line 111
    .line 112
    const/4 p0, 0x3

    .line 113
    if-eq p1, p0, :cond_4

    .line 114
    .line 115
    if-eq p1, v4, :cond_4

    .line 116
    .line 117
    if-ne p1, v1, :cond_2

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    sget-object p1, Lss8;->a:Lss8;

    .line 125
    .line 126
    const-string p1, ""

    .line 127
    .line 128
    const-string v0, "su.happ.proxyutility.action.service"

    .line 129
    .line 130
    const/16 v1, 0x2a

    .line 131
    .line 132
    invoke-static {p0, v0, v1, p1}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    :goto_2
    move-object v3, v5

    .line 136
    :goto_3
    return-object v3

    .line 137
    :pswitch_1
    check-cast p1, Ll69;

    .line 138
    .line 139
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 140
    .line 141
    instance-of v0, p1, Lj69;

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    sget-object v0, Lss8;->a:Lss8;

    .line 146
    .line 147
    check-cast p1, Lj69;

    .line 148
    .line 149
    iget-object p1, p1, Lj69;->X:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {p1}, Lfm7;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "net/http: TLS handshake"

    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    invoke-static {v0, v4, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    sget p1, Ly46;->connection_test_error_tls_handshake:I

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_5
    invoke-static {p1}, Lfm7;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v1, "io: read/write on closed pipe"

    .line 187
    .line 188
    invoke-static {v0, v4, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    sget p1, Ly46;->connection_test_error_eof:I

    .line 195
    .line 196
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_6
    instance-of v0, p1, Lk69;

    .line 205
    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    sget v0, Ly46;->connection_test_available:I

    .line 209
    .line 210
    check-cast p1, Lk69;

    .line 211
    .line 212
    iget-wide v6, p1, Lk69;->X:J

    .line 213
    .line 214
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    :cond_7
    :goto_4
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->c1:Log7;

    .line 230
    .line 231
    if-eqz v0, :cond_8

    .line 232
    .line 233
    invoke-virtual {v0, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 234
    .line 235
    .line 236
    :cond_8
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 237
    .line 238
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    sget-object v1, Ltp1;->a:Lnf1;

    .line 243
    .line 244
    sget-object v1, Ldm4;->a:Lhv2;

    .line 245
    .line 246
    new-instance v4, Lfk4;

    .line 247
    .line 248
    const/4 v6, 0x6

    .line 249
    invoke-direct {v4, p0, p1, v3, v6}, Lfk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1, v4, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iput-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->c1:Log7;

    .line 257
    .line 258
    move-object v3, v5

    .line 259
    goto :goto_5

    .line 260
    :cond_9
    invoke-static {}, Lb61;->c()V

    .line 261
    .line 262
    .line 263
    :goto_5
    return-object v3

    .line 264
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 265
    .line 266
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    if-nez p1, :cond_a

    .line 273
    .line 274
    sget p1, Ly46;->toast_permission_denied:I

    .line 275
    .line 276
    sget v0, Ly46;->permission_notifications:I

    .line 277
    .line 278
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    new-instance v0, Lay2;

    .line 294
    .line 295
    sget v2, Ly46;->toast_permission_denied_open_settings:I

    .line 296
    .line 297
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    sget v3, Lq36;->ic_settings_12dp:I

    .line 305
    .line 306
    invoke-virtual {p0, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    new-instance v6, Lmj4;

    .line 311
    .line 312
    invoke-direct {v6, p0, v1}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 313
    .line 314
    .line 315
    invoke-direct {v0, v2, v3, v6}, Lay2;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ldn2;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {p0, p1, v0, v4}, Lpu;->N(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;Ljava/util/List;I)V

    .line 323
    .line 324
    .line 325
    :cond_a
    return-object v5

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
