.class public final Lyj5;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lyj5;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lyj5;->i0:Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lyj5;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lpk5;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lyj5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyj5;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyj5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Ljk5;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lyj5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lyj5;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lyj5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lyj5;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lyj5;->i0:Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lyj5;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, Lyj5;-><init>(Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;Lq51;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Lyj5;->h0:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lyj5;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p1, v1}, Lyj5;-><init>(Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;Lq51;B)V

    .line 21
    .line 22
    .line 23
    iput-object p2, v0, Lyj5;->h0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lyj5;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lyj5;->i0:Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object p0, p0, Lyj5;->h0:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lpk5;

    .line 14
    .line 15
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget p1, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->V0:I

    .line 19
    .line 20
    instance-of p1, p0, Lok5;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget p0, Ly46;->warning_settings_after_tunnel_restart:I

    .line 25
    .line 26
    invoke-static {v2, p0}, Lpu;->O(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of p1, p0, Lmk5;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget p1, Ly46;->per_app_proxy_google_apps_total:I

    .line 35
    .line 36
    check-cast p0, Lmk5;

    .line 37
    .line 38
    iget p0, p0, Lmk5;->a:I

    .line 39
    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v2, p1, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v2, p0}, Lpu;->R(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    instance-of p1, p0, Lnk5;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    sget p1, Ly46;->per_app_proxy_spy_apps_total:I

    .line 64
    .line 65
    check-cast p0, Lnk5;

    .line 66
    .line 67
    iget p0, p0, Lnk5;->a:I

    .line 68
    .line 69
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v2, p1, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v2, p0}, Lpu;->R(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 89
    .line 90
    .line 91
    move-object v1, v3

    .line 92
    :goto_0
    return-object v1

    .line 93
    :pswitch_0
    check-cast p0, Ljk5;

    .line 94
    .line 95
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget p1, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->V0:I

    .line 99
    .line 100
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 101
    .line 102
    const-string v0, "binding"

    .line 103
    .line 104
    if-eqz p1, :cond_18

    .line 105
    .line 106
    iget-object p1, p1, Lc6;->i0:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Landroid/view/View;

    .line 109
    .line 110
    const/16 v4, 0x8

    .line 111
    .line 112
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 116
    .line 117
    if-eqz p1, :cond_17

    .line 118
    .line 119
    iget-object p1, p1, Lc6;->j0:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Landroid/view/View;

    .line 122
    .line 123
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 127
    .line 128
    if-eqz p1, :cond_16

    .line 129
    .line 130
    iget-object p1, p1, Lc6;->Y:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Landroid/view/View;

    .line 133
    .line 134
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    const/4 v4, 0x2

    .line 142
    const/4 v5, 0x1

    .line 143
    const/4 v6, 0x0

    .line 144
    if-eqz p1, :cond_d

    .line 145
    .line 146
    if-eq p1, v5, :cond_8

    .line 147
    .line 148
    if-ne p1, v4, :cond_7

    .line 149
    .line 150
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 151
    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    iget-object p1, p1, Lc6;->Z:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 157
    .line 158
    sget v7, Lv26;->settingsCategory:I

    .line 159
    .line 160
    invoke-static {p1, v7}, Los4;->N(Landroid/widget/TextView;I)V

    .line 161
    .line 162
    .line 163
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 164
    .line 165
    if-eqz p1, :cond_5

    .line 166
    .line 167
    iget-object p1, p1, Lc6;->Y:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p1, Landroid/view/View;

    .line 170
    .line 171
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 175
    .line 176
    if-eqz p1, :cond_4

    .line 177
    .line 178
    iget-object p1, p1, Lc6;->r0:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 181
    .line 182
    sget v6, Lv26;->settingsTextDescription:I

    .line 183
    .line 184
    invoke-static {p1, v6}, Los4;->N(Landroid/widget/TextView;I)V

    .line 185
    .line 186
    .line 187
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 188
    .line 189
    if-eqz p1, :cond_3

    .line 190
    .line 191
    iget-object p1, p1, Lc6;->h0:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 194
    .line 195
    sget v6, Lv26;->settingsTextDescription:I

    .line 196
    .line 197
    invoke-static {p1, v6}, Los4;->N(Landroid/widget/TextView;I)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_2

    .line 201
    .line 202
    :cond_3
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v3

    .line 206
    :cond_4
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v3

    .line 210
    :cond_5
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v3

    .line 214
    :cond_6
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v3

    .line 218
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 219
    .line 220
    .line 221
    :goto_1
    move-object v1, v3

    .line 222
    goto/16 :goto_4

    .line 223
    .line 224
    :cond_8
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 225
    .line 226
    if-eqz p1, :cond_c

    .line 227
    .line 228
    iget-object p1, p1, Lc6;->r0:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 231
    .line 232
    sget v7, Lv26;->settingsCategory:I

    .line 233
    .line 234
    invoke-static {p1, v7}, Los4;->N(Landroid/widget/TextView;I)V

    .line 235
    .line 236
    .line 237
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 238
    .line 239
    if-eqz p1, :cond_b

    .line 240
    .line 241
    iget-object p1, p1, Lc6;->j0:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p1, Landroid/view/View;

    .line 244
    .line 245
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 246
    .line 247
    .line 248
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 249
    .line 250
    if-eqz p1, :cond_a

    .line 251
    .line 252
    iget-object p1, p1, Lc6;->h0:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 255
    .line 256
    sget v6, Lv26;->settingsTextDescription:I

    .line 257
    .line 258
    invoke-static {p1, v6}, Los4;->N(Landroid/widget/TextView;I)V

    .line 259
    .line 260
    .line 261
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 262
    .line 263
    if-eqz p1, :cond_9

    .line 264
    .line 265
    iget-object p1, p1, Lc6;->Z:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 268
    .line 269
    sget v6, Lv26;->settingsTextDescription:I

    .line 270
    .line 271
    invoke-static {p1, v6}, Los4;->N(Landroid/widget/TextView;I)V

    .line 272
    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_9
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v3

    .line 279
    :cond_a
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v3

    .line 283
    :cond_b
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v3

    .line 287
    :cond_c
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v3

    .line 291
    :cond_d
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 292
    .line 293
    if-eqz p1, :cond_15

    .line 294
    .line 295
    iget-object p1, p1, Lc6;->h0:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 298
    .line 299
    sget v7, Lv26;->settingsCategory:I

    .line 300
    .line 301
    invoke-static {p1, v7}, Los4;->N(Landroid/widget/TextView;I)V

    .line 302
    .line 303
    .line 304
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 305
    .line 306
    if-eqz p1, :cond_14

    .line 307
    .line 308
    iget-object p1, p1, Lc6;->i0:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p1, Landroid/view/View;

    .line 311
    .line 312
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 313
    .line 314
    .line 315
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 316
    .line 317
    if-eqz p1, :cond_13

    .line 318
    .line 319
    iget-object p1, p1, Lc6;->r0:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 322
    .line 323
    sget v6, Lv26;->settingsTextDescription:I

    .line 324
    .line 325
    invoke-static {p1, v6}, Los4;->N(Landroid/widget/TextView;I)V

    .line 326
    .line 327
    .line 328
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 329
    .line 330
    if-eqz p1, :cond_12

    .line 331
    .line 332
    iget-object p1, p1, Lc6;->Z:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 335
    .line 336
    sget v6, Lv26;->settingsTextDescription:I

    .line 337
    .line 338
    invoke-static {p1, v6}, Los4;->N(Landroid/widget/TextView;I)V

    .line 339
    .line 340
    .line 341
    :goto_2
    iget-object p1, v2, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 342
    .line 343
    if-eqz p1, :cond_11

    .line 344
    .line 345
    iget-object p1, p1, Lc6;->g0:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 348
    .line 349
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 350
    .line 351
    .line 352
    move-result p0

    .line 353
    if-eqz p0, :cond_10

    .line 354
    .line 355
    if-eq p0, v5, :cond_f

    .line 356
    .line 357
    if-ne p0, v4, :cond_e

    .line 358
    .line 359
    sget p0, Ly46;->per_app_proxy_description_bypass:I

    .line 360
    .line 361
    invoke-virtual {v2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    goto :goto_3

    .line 366
    :cond_e
    invoke-static {}, Lb61;->c()V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_1

    .line 370
    .line 371
    :cond_f
    sget p0, Ly46;->per_app_proxy_description_on:I

    .line 372
    .line 373
    invoke-virtual {v2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    goto :goto_3

    .line 378
    :cond_10
    sget p0, Ly46;->per_app_proxy_description_off:I

    .line 379
    .line 380
    invoke-virtual {v2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    :goto_3
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 385
    .line 386
    .line 387
    :goto_4
    return-object v1

    .line 388
    :cond_11
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v3

    .line 392
    :cond_12
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v3

    .line 396
    :cond_13
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw v3

    .line 400
    :cond_14
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v3

    .line 404
    :cond_15
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v3

    .line 408
    :cond_16
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v3

    .line 412
    :cond_17
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v3

    .line 416
    :cond_18
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v3

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
