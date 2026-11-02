.class public final synthetic Lpj4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lpj4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lpj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lpj4;->X:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x7

    .line 9
    const-string v6, "binding"

    .line 10
    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x0

    .line 13
    iget-object v9, v0, Lpj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 19
    .line 20
    invoke-virtual {v9}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lwj4;

    .line 29
    .line 30
    const/16 v2, 0xd

    .line 31
    .line 32
    invoke-direct {v1, v9, v8, v2}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v8, v1, v7}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    sget v1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 40
    .line 41
    sget v1, Lt46;->dialog_alert_warning:I

    .line 42
    .line 43
    sget v2, Ly46;->jobs_title:I

    .line 44
    .line 45
    iget-object v6, v0, Lpj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 46
    .line 47
    invoke-virtual {v6, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    sget v0, Ly46;->jobs_description:I

    .line 52
    .line 53
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    sget v0, Ly46;->jobs_btn:I

    .line 58
    .line 59
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    new-instance v13, Lmj4;

    .line 68
    .line 69
    invoke-direct {v13, v6, v5}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 70
    .line 71
    .line 72
    const/4 v14, 0x0

    .line 73
    const/16 v15, 0x552

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    invoke-static/range {v6 .. v15}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_1
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 82
    .line 83
    invoke-virtual {v9}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, Lwj4;

    .line 92
    .line 93
    const/16 v2, 0xc

    .line 94
    .line 95
    invoke-direct {v1, v9, v8, v2}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v8, v1, v7}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_2
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 103
    .line 104
    invoke-virtual {v9}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v1, Lwj4;

    .line 113
    .line 114
    const/16 v2, 0xb

    .line 115
    .line 116
    invoke-direct {v1, v9, v8, v2}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v8, v1, v7}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_3
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 124
    .line 125
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->g:Lvz7;

    .line 130
    .line 131
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lqc2;

    .line 136
    .line 137
    iget-object v0, v0, Lqc2;->h:Lh76;

    .line 138
    .line 139
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 140
    .line 141
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/util/List;

    .line 146
    .line 147
    if-eqz v0, :cond_0

    .line 148
    .line 149
    invoke-virtual {v9, v0, v4}, Lsu/happ/proxyutility/feature/main/MainActivity;->f0(Ljava/util/List;Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_0
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->x:Lh76;

    .line 158
    .line 159
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 160
    .line 161
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Lxm4;

    .line 166
    .line 167
    iget-object v0, v0, Lxm4;->d:Lb83;

    .line 168
    .line 169
    invoke-virtual {v9, v0, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->f0(Ljava/util/List;Z)V

    .line 170
    .line 171
    .line 172
    :goto_0
    return-void

    .line 173
    :pswitch_4
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 174
    .line 175
    new-instance v10, Lf63;

    .line 176
    .line 177
    new-instance v11, Ln51;

    .line 178
    .line 179
    sget v0, Lp56;->CustomPopupMenuTheme:I

    .line 180
    .line 181
    invoke-direct {v11, v9, v0}, Ln51;-><init>(Landroid/content/Context;I)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 185
    .line 186
    if-eqz v0, :cond_8

    .line 187
    .line 188
    iget-object v12, v0, Lb6;->C0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 189
    .line 190
    sget v14, Lw26;->popupMenuStyle:I

    .line 191
    .line 192
    const/4 v15, 0x0

    .line 193
    const/4 v13, 0x0

    .line 194
    invoke-direct/range {v10 .. v15}, Lf63;-><init>(Landroid/content/Context;Landroid/view/View;III)V

    .line 195
    .line 196
    .line 197
    iget-object v0, v10, Lf63;->Z:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ldu4;

    .line 200
    .line 201
    iget-object v1, v10, Lf63;->Y:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, Lnt4;

    .line 204
    .line 205
    iget-object v5, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->U0:Lvz7;

    .line 206
    .line 207
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    check-cast v5, Lcom/tencent/mmkv/MMKV;

    .line 212
    .line 213
    const-string v6, "SELECTED_SERVER"

    .line 214
    .line 215
    invoke-virtual {v5, v6}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    if-eqz v5, :cond_2

    .line 220
    .line 221
    new-instance v6, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 222
    .line 223
    invoke-direct {v6, v5}, Lsu/happ/proxyutility/domain/sub/GuId;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/sub/GuId;->b()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {v5}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-nez v5, :cond_1

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_1
    move-object v6, v8

    .line 238
    :goto_1
    if-eqz v6, :cond_2

    .line 239
    .line 240
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/sub/GuId;->b()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    goto :goto_2

    .line 245
    :cond_2
    move-object v5, v8

    .line 246
    :goto_2
    new-instance v6, Ljn0;

    .line 247
    .line 248
    const/4 v7, 0x5

    .line 249
    invoke-direct {v6, v9, v5, v7}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 250
    .line 251
    .line 252
    iput-object v6, v10, Lf63;->f0:Ljava/lang/Object;

    .line 253
    .line 254
    const v6, 0x800005

    .line 255
    .line 256
    .line 257
    iput v6, v0, Ldu4;->g:I

    .line 258
    .line 259
    invoke-static {v9}, Lue3;->y(Landroid/content/Context;)Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-nez v6, :cond_4

    .line 264
    .line 265
    sget-object v6, Lss8;->a:Lss8;

    .line 266
    .line 267
    invoke-static {}, Lss8;->t()Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_3

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_3
    sget v6, Lv46;->menu_main_mobile:I

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_4
    :goto_3
    sget v6, Lv46;->menu_main_tv:I

    .line 278
    .line 279
    :goto_4
    new-instance v7, Luw7;

    .line 280
    .line 281
    invoke-direct {v7, v11}, Luw7;-><init>(Landroid/content/Context;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, v6, v1}, Luw7;->inflate(ILandroid/view/Menu;)V

    .line 285
    .line 286
    .line 287
    sget v6, Le46;->export_json_clipboard:I

    .line 288
    .line 289
    invoke-virtual {v1, v6}, Lnt4;->findItem(I)Landroid/view/MenuItem;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-interface {v6, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 294
    .line 295
    .line 296
    iget-object v7, v9, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 297
    .line 298
    invoke-static {v7}, Lys0;->z(Lg94;)Lu84;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    sget-object v9, Ltp1;->a:Lnf1;

    .line 303
    .line 304
    sget-object v9, Ldm4;->a:Lhv2;

    .line 305
    .line 306
    new-instance v10, Lco;

    .line 307
    .line 308
    invoke-direct {v10, v5, v6, v8}, Lco;-><init>(Ljava/lang/String;Landroid/view/MenuItem;Lq51;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v7, v9, v10, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 312
    .line 313
    .line 314
    sget v2, Le46;->config_group:I

    .line 315
    .line 316
    invoke-virtual {v1, v2}, Lnt4;->findItem(I)Landroid/view/MenuItem;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 321
    .line 322
    .line 323
    sget v5, Le46;->dialog_test:I

    .line 324
    .line 325
    invoke-virtual {v1, v5}, Lnt4;->findItem(I)Landroid/view/MenuItem;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 330
    .line 331
    .line 332
    sget-object v5, Lss8;->a:Lss8;

    .line 333
    .line 334
    invoke-static {}, Lss8;->t()Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    if-eqz v5, :cond_5

    .line 339
    .line 340
    invoke-interface {v2, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 341
    .line 342
    .line 343
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 344
    .line 345
    .line 346
    :cond_5
    invoke-virtual {v0}, Ldu4;->b()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_6

    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_6
    iget-object v1, v0, Ldu4;->f:Landroid/view/View;

    .line 354
    .line 355
    if-eqz v1, :cond_7

    .line 356
    .line 357
    invoke-virtual {v0, v3, v3, v3, v3}, Ldu4;->d(IIZZ)V

    .line 358
    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_7
    const-string v0, "MenuPopupHelper cannot be used without an anchor"

    .line 362
    .line 363
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    :goto_5
    return-void

    .line 367
    :cond_8
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    throw v8

    .line 371
    :pswitch_5
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 372
    .line 373
    new-instance v0, Landroid/content/Intent;

    .line 374
    .line 375
    const-class v1, Lsu/happ/proxyutility/feature/settings/SettingsActivity;

    .line 376
    .line 377
    invoke-direct {v0, v9, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    const-string v2, "isRunning"

    .line 389
    .line 390
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v9, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :pswitch_6
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 399
    .line 400
    sget-object v0, Lss8;->a:Lss8;

    .line 401
    .line 402
    invoke-static {v9}, Lss8;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-static {v9, v0}, Lss8;->E(Landroid/content/Context;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    sget v0, Ly46;->toast_copied_to_clipboard:I

    .line 410
    .line 411
    invoke-static {v9, v0}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :pswitch_7
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 416
    .line 417
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    sget-object v3, Ltp1;->a:Lnf1;

    .line 426
    .line 427
    sget-object v3, Lye1;->Z:Lye1;

    .line 428
    .line 429
    new-instance v4, Ll40;

    .line 430
    .line 431
    invoke-direct {v4, v0, v8, v5}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 432
    .line 433
    .line 434
    invoke-static {v1, v3, v4, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :pswitch_8
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 439
    .line 440
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->x:Lh76;

    .line 445
    .line 446
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 447
    .line 448
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    check-cast v0, Lxm4;

    .line 453
    .line 454
    iget-boolean v0, v0, Lxm4;->e:Z

    .line 455
    .line 456
    if-eqz v0, :cond_a

    .line 457
    .line 458
    iget-object v0, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 459
    .line 460
    if-eqz v0, :cond_9

    .line 461
    .line 462
    iget-object v0, v0, Lb6;->I0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 463
    .line 464
    if-eqz v0, :cond_a

    .line 465
    .line 466
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 467
    .line 468
    .line 469
    goto :goto_6

    .line 470
    :cond_9
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw v8

    .line 474
    :cond_a
    :goto_6
    return-void

    .line 475
    :pswitch_9
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 476
    .line 477
    sget-object v0, Lss8;->a:Lss8;

    .line 478
    .line 479
    const-string v0, "https://ai-4docs.com/happ"

    .line 480
    .line 481
    invoke-static {v9, v0}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :pswitch_a
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 486
    .line 487
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->R()V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :pswitch_b
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 492
    .line 493
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->N()V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_c
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 498
    .line 499
    iget-object v0, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->h1:Ly5;

    .line 500
    .line 501
    invoke-virtual {v0}, Ly5;->getValue()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    check-cast v0, Ldr2;

    .line 506
    .line 507
    sget-object v1, Lvq2;->a:Lvq2;

    .line 508
    .line 509
    invoke-virtual {v0, v1}, Ldr2;->e(Lyq2;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 517
    .line 518
    :cond_b
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    move-object v2, v1

    .line 523
    check-cast v2, Lxm4;

    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    const/16 v19, 0x0

    .line 529
    .line 530
    const v20, 0xdfff

    .line 531
    .line 532
    .line 533
    const/4 v3, 0x0

    .line 534
    const-wide/16 v4, 0x0

    .line 535
    .line 536
    const/4 v6, 0x0

    .line 537
    const/4 v7, 0x0

    .line 538
    const/4 v8, 0x0

    .line 539
    const/4 v9, 0x0

    .line 540
    const/4 v10, 0x0

    .line 541
    const/4 v11, 0x0

    .line 542
    const/4 v12, 0x0

    .line 543
    const/4 v13, 0x0

    .line 544
    const/4 v14, 0x0

    .line 545
    const/4 v15, 0x0

    .line 546
    const/16 v16, 0x0

    .line 547
    .line 548
    const/16 v17, 0x1

    .line 549
    .line 550
    const/16 v18, 0x0

    .line 551
    .line 552
    invoke-static/range {v2 .. v20}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_b

    .line 561
    .line 562
    return-void

    .line 563
    :pswitch_d
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 564
    .line 565
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    if-eqz v0, :cond_c

    .line 574
    .line 575
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->g0()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    iget-object v0, v0, Lfi;->b:Landroid/app/Application;

    .line 583
    .line 584
    const-string v1, ""

    .line 585
    .line 586
    const-string v2, "su.happ.proxyutility.action.service"

    .line 587
    .line 588
    const/4 v3, 0x6

    .line 589
    invoke-static {v0, v2, v3, v1}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 590
    .line 591
    .line 592
    :cond_c
    return-void

    .line 593
    :pswitch_e
    iget-object v0, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 594
    .line 595
    if-eqz v0, :cond_e

    .line 596
    .line 597
    iget-object v0, v0, Lb6;->L0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 598
    .line 599
    if-eqz v0, :cond_d

    .line 600
    .line 601
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 602
    .line 603
    .line 604
    :cond_d
    return-void

    .line 605
    :cond_e
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw v8

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
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
