.class public final synthetic Ldx4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Ldx4;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte p0, p0, Ldx4;->X:B

    .line 2
    .line 3
    const-string v0, "["

    .line 4
    .line 5
    const-string v1, ", "

    .line 6
    .line 7
    const/4 v2, 0x7

    .line 8
    sget-object v3, Lec7;->Y:Lec7;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    sget-object v7, Ldn8;->a:Ldn8;

    .line 14
    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Lzx3;

    .line 19
    .line 20
    const/16 p0, 0x1770

    .line 21
    .line 22
    iput-short p0, p1, Lzx3;->a:S

    .line 23
    .line 24
    const/high16 v0, 0x42b40000    # 90.0f

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/16 v1, 0x12c

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v2, Loy4;->b:Lb81;

    .line 37
    .line 38
    iput-object v2, v1, Lyx3;->b:Lxx1;

    .line 39
    .line 40
    const/16 v1, 0x5dc

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 43
    .line 44
    .line 45
    const/high16 v0, 0x43340000    # 180.0f

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/16 v1, 0x708

    .line 52
    .line 53
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0xbb8

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 59
    .line 60
    .line 61
    const/high16 v0, 0x43870000    # 270.0f

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/16 v1, 0xce4

    .line 68
    .line 69
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 70
    .line 71
    .line 72
    const/16 v1, 0x1194

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x43b40000    # 360.0f

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/16 v1, 0x12c0

    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0, p0}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 89
    .line 90
    .line 91
    return-object v7

    .line 92
    :pswitch_0
    check-cast p1, Landroid/content/Context;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance v0, Landroid/content/Intent;

    .line 99
    .line 100
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v1, "android.intent.action.PROCESS_TEXT"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "text/plain"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p0, v0, v6}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    :goto_0
    if-ge v6, v1, :cond_2

    .line 133
    .line 134
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    move-object v3, v2

    .line 139
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-object v5, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 146
    .line 147
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-nez v4, :cond_0

    .line 154
    .line 155
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 156
    .line 157
    iget-boolean v4, v3, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 158
    .line 159
    if-eqz v4, :cond_1

    .line 160
    .line 161
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 162
    .line 163
    if-eqz v3, :cond_0

    .line 164
    .line 165
    invoke-virtual {p1, v3}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_1

    .line 170
    .line 171
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_2
    return-object v0

    .line 178
    :pswitch_1
    check-cast p1, Ljava/lang/Void;

    .line 179
    .line 180
    sget-object p0, Lxu5;->b:Lxu5;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    sget-object p0, Ld02;->X:Ld02;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_3
    check-cast p1, Lir5;

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_3

    .line 198
    .line 199
    invoke-virtual {p1}, Lir5;->q()V

    .line 200
    .line 201
    .line 202
    :cond_3
    return-object v7

    .line 203
    :pswitch_4
    check-cast p1, Lpk6;

    .line 204
    .line 205
    return-object v7

    .line 206
    :pswitch_5
    check-cast p1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 207
    .line 208
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    const-string v0, "com.google"

    .line 213
    .line 214
    invoke-static {p0, v6, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-eqz p0, :cond_4

    .line 219
    .line 220
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    const-string p1, "com.google.android.webview"

    .line 225
    .line 226
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-nez p0, :cond_4

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_4
    move v5, v6

    .line 234
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    return-object p0

    .line 239
    :pswitch_6
    move-object v0, p1

    .line 240
    check-cast v0, Llk5;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    sget-object v4, Lkm5;->f0:Lkm5;

    .line 246
    .line 247
    iget-object p0, v0, Llk5;->c:Lj2;

    .line 248
    .line 249
    invoke-virtual {v3}, Lec7;->c()Lqm5;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p0, v6}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_5

    .line 262
    .line 263
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 268
    .line 269
    invoke-static {v1, v6}, Lsu/happ/proxyutility/dto/AppInfo;->a(Lsu/happ/proxyutility/dto/AppInfo;I)Lsu/happ/proxyutility/dto/AppInfo;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {p1, v1}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_5
    invoke-virtual {p1}, Lqm5;->c()Lj2;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    const/4 v6, 0x0

    .line 282
    const/16 v7, 0x33

    .line 283
    .line 284
    const/4 v1, 0x0

    .line 285
    const/4 v2, 0x0

    .line 286
    const/4 v5, 0x0

    .line 287
    invoke-static/range {v0 .. v7}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_7
    move-object v0, p1

    .line 293
    check-cast v0, Llk5;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    sget-object v4, Lkm5;->f0:Lkm5;

    .line 299
    .line 300
    iget-object p0, v0, Llk5;->c:Lj2;

    .line 301
    .line 302
    invoke-virtual {v3}, Lec7;->c()Lqm5;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p0, v6}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_6

    .line 315
    .line 316
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 321
    .line 322
    invoke-static {v1, v6}, Lsu/happ/proxyutility/dto/AppInfo;->a(Lsu/happ/proxyutility/dto/AppInfo;I)Lsu/happ/proxyutility/dto/AppInfo;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {p1, v1}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_6
    invoke-virtual {p1}, Lqm5;->c()Lj2;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    const/4 v6, 0x0

    .line 335
    const/16 v7, 0x33

    .line 336
    .line 337
    const/4 v1, 0x0

    .line 338
    const/4 v2, 0x0

    .line 339
    const/4 v5, 0x0

    .line 340
    invoke-static/range {v0 .. v7}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    return-object p0

    .line 345
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 346
    .line 347
    sget p0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->V0:I

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-static {p1}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 361
    .line 362
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    return-object p0

    .line 370
    :pswitch_9
    check-cast p1, Landroid/view/View;

    .line 371
    .line 372
    sget p0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->V0:I

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    instance-of p0, p1, Landroid/widget/ImageView;

    .line 378
    .line 379
    if-eqz p0, :cond_7

    .line 380
    .line 381
    move-object v4, p1

    .line 382
    check-cast v4, Landroid/widget/ImageView;

    .line 383
    .line 384
    :cond_7
    return-object v4

    .line 385
    :pswitch_a
    check-cast p1, Lfi5;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    new-instance p0, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    const-string v0, "position "

    .line 393
    .line 394
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    iget v0, p1, Lfi5;->a:I

    .line 398
    .line 399
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v0, ": \'"

    .line 403
    .line 404
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    iget-object p1, p1, Lfi5;->b:Ldn2;

    .line 408
    .line 409
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    check-cast p1, Ljava/lang/String;

    .line 414
    .line 415
    const/16 v0, 0x27

    .line 416
    .line 417
    invoke-static {p0, p1, v0}, Loi0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    return-object p0

    .line 422
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    check-cast p1, Lnf5;

    .line 426
    .line 427
    invoke-interface {p1}, Lnf5;->t()Z

    .line 428
    .line 429
    .line 430
    move-result p0

    .line 431
    xor-int/2addr p0, v5

    .line 432
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    return-object p0

    .line 437
    :pswitch_c
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 438
    .line 439
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    if-eqz p0, :cond_8

    .line 444
    .line 445
    invoke-virtual {p1, v6}, Landroidx/compose/ui/node/LayoutNode;->V(Z)V

    .line 446
    .line 447
    .line 448
    :cond_8
    return-object v7

    .line 449
    :pswitch_d
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 450
    .line 451
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 452
    .line 453
    .line 454
    move-result p0

    .line 455
    if-eqz p0, :cond_9

    .line 456
    .line 457
    invoke-virtual {p1, v6}, Landroidx/compose/ui/node/LayoutNode;->V(Z)V

    .line 458
    .line 459
    .line 460
    :cond_9
    return-object v7

    .line 461
    :pswitch_e
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 462
    .line 463
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 464
    .line 465
    .line 466
    move-result p0

    .line 467
    if-eqz p0, :cond_a

    .line 468
    .line 469
    invoke-virtual {p1, v6}, Landroidx/compose/ui/node/LayoutNode;->X(Z)V

    .line 470
    .line 471
    .line 472
    :cond_a
    return-object v7

    .line 473
    :pswitch_f
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 474
    .line 475
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 476
    .line 477
    .line 478
    move-result p0

    .line 479
    if-eqz p0, :cond_b

    .line 480
    .line 481
    invoke-virtual {p1, v6}, Landroidx/compose/ui/node/LayoutNode;->X(Z)V

    .line 482
    .line 483
    .line 484
    :cond_b
    return-object v7

    .line 485
    :pswitch_10
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 486
    .line 487
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 488
    .line 489
    .line 490
    move-result p0

    .line 491
    if-eqz p0, :cond_c

    .line 492
    .line 493
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->I()V

    .line 494
    .line 495
    .line 496
    :cond_c
    return-object v7

    .line 497
    :pswitch_11
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 498
    .line 499
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 500
    .line 501
    .line 502
    move-result p0

    .line 503
    if-eqz p0, :cond_d

    .line 504
    .line 505
    invoke-static {p1, v6, v2}, Landroidx/compose/ui/node/LayoutNode;->Y(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 506
    .line 507
    .line 508
    :cond_d
    return-object v7

    .line 509
    :pswitch_12
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 510
    .line 511
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    if-eqz p0, :cond_e

    .line 516
    .line 517
    invoke-static {p1, v6, v2}, Landroidx/compose/ui/node/LayoutNode;->W(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 518
    .line 519
    .line 520
    :cond_e
    return-object v7

    .line 521
    :pswitch_13
    check-cast p1, Lkl5;

    .line 522
    .line 523
    sget p0, Lbf;->a:I

    .line 524
    .line 525
    sget-object p0, Lpc;->b:Lox1;

    .line 526
    .line 527
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    move-object v6, p0

    .line 535
    check-cast v6, Landroid/content/Context;

    .line 536
    .line 537
    sget-object p0, Ly01;->h:Lox1;

    .line 538
    .line 539
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object p0

    .line 543
    move-object v7, p0

    .line 544
    check-cast v7, Lfi1;

    .line 545
    .line 546
    sget-object p0, Ljf5;->a:Lox1;

    .line 547
    .line 548
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    check-cast p0, Lif5;

    .line 553
    .line 554
    if-nez p0, :cond_f

    .line 555
    .line 556
    goto :goto_4

    .line 557
    :cond_f
    new-instance v5, Lud;

    .line 558
    .line 559
    iget-wide v8, p0, Lif5;->a:J

    .line 560
    .line 561
    iget-object v10, p0, Lif5;->b:Lig5;

    .line 562
    .line 563
    invoke-direct/range {v5 .. v10}, Lud;-><init>(Landroid/content/Context;Lfi1;JLig5;)V

    .line 564
    .line 565
    .line 566
    move-object v4, v5

    .line 567
    :goto_4
    return-object v4

    .line 568
    :pswitch_14
    check-cast p1, Lf17;

    .line 569
    .line 570
    return-object v7

    .line 571
    :pswitch_15
    check-cast p1, Lx85;

    .line 572
    .line 573
    invoke-virtual {p1}, Lx85;->t()Z

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    if-eqz p0, :cond_10

    .line 578
    .line 579
    iget-object p0, p1, Lx85;->X:Lw85;

    .line 580
    .line 581
    invoke-interface {p0}, Lw85;->q0()V

    .line 582
    .line 583
    .line 584
    :cond_10
    return-object v7

    .line 585
    :pswitch_16
    check-cast p1, Ljava/lang/Long;

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    return-object v7

    .line 591
    :pswitch_17
    check-cast p1, Li55;

    .line 592
    .line 593
    iget-object p0, p1, Li55;->V0:Llf5;

    .line 594
    .line 595
    if-eqz p0, :cond_11

    .line 596
    .line 597
    check-cast p0, Lau2;

    .line 598
    .line 599
    invoke-virtual {p0}, Lau2;->c()V

    .line 600
    .line 601
    .line 602
    :cond_11
    return-object v7

    .line 603
    :pswitch_18
    check-cast p1, Li55;

    .line 604
    .line 605
    iget-object p0, p1, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 606
    .line 607
    :try_start_0
    invoke-virtual {p1}, Li55;->t()Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eqz v0, :cond_12

    .line 612
    .line 613
    invoke-virtual {p1, v5}, Li55;->u1(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 614
    .line 615
    .line 616
    goto :goto_5

    .line 617
    :catchall_0
    move-exception v0

    .line 618
    move-object p1, v0

    .line 619
    goto :goto_6

    .line 620
    :cond_12
    :goto_5
    return-object v7

    .line 621
    :goto_6
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LayoutNode;->b0(Ljava/lang/Throwable;)V

    .line 622
    .line 623
    .line 624
    throw v4

    .line 625
    :pswitch_19
    check-cast p1, Ls45;

    .line 626
    .line 627
    iget-object p0, p1, Ls45;->a:Ltb2;

    .line 628
    .line 629
    if-eqz p0, :cond_13

    .line 630
    .line 631
    invoke-virtual {p0}, Ltb2;->invoke()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    :cond_13
    return-object v7

    .line 635
    :pswitch_1a
    check-cast p1, Ljava/util/Map$Entry;

    .line 636
    .line 637
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    instance-of v2, p0, [B

    .line 645
    .line 646
    if-eqz v2, :cond_16

    .line 647
    .line 648
    check-cast p0, [B

    .line 649
    .line 650
    new-instance v2, Ljava/lang/StringBuilder;

    .line 651
    .line 652
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 656
    .line 657
    .line 658
    array-length v0, p0

    .line 659
    move v3, v6

    .line 660
    :goto_7
    if-ge v6, v0, :cond_15

    .line 661
    .line 662
    aget-byte v4, p0, v6

    .line 663
    .line 664
    add-int/2addr v3, v5

    .line 665
    if-le v3, v5, :cond_14

    .line 666
    .line 667
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 668
    .line 669
    .line 670
    :cond_14
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 675
    .line 676
    .line 677
    add-int/lit8 v6, v6, 0x1

    .line 678
    .line 679
    goto :goto_7

    .line 680
    :cond_15
    const-string p0, "]"

    .line 681
    .line 682
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    goto :goto_8

    .line 690
    :cond_16
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 699
    .line 700
    const-string v1, "  "

    .line 701
    .line 702
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object p1

    .line 709
    check-cast p1, Ljs5;

    .line 710
    .line 711
    iget-object p1, p1, Ljs5;->a:Ljava/lang/String;

    .line 712
    .line 713
    const-string v1, " = "

    .line 714
    .line 715
    invoke-static {v0, p1, v1, p0}, Lp61;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object p0

    .line 719
    return-object p0

    .line 720
    :pswitch_1b
    check-cast p1, Ltg5;

    .line 721
    .line 722
    iget p0, p1, Ltg5;->b:I

    .line 723
    .line 724
    iget p1, p1, Ltg5;->c:I

    .line 725
    .line 726
    const-string v2, ")"

    .line 727
    .line 728
    invoke-static {p0, v0, p1, v1, v2}, Lpc6;->k(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object p0

    .line 732
    return-object p0

    .line 733
    :pswitch_1c
    check-cast p1, Lf17;

    .line 734
    .line 735
    sget-object p0, Ld17;->a:[Lnw3;

    .line 736
    .line 737
    sget-object p0, Lc17;->y:Le17;

    .line 738
    .line 739
    invoke-interface {p1, p0, v7}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    return-object v7

    .line 743
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
