.class public final Lcc;
.super Lwl6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic j0:B

.field public final synthetic k0:Lt3;


# direct methods
.method public synthetic constructor <init>(Lt3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcc;->j0:B

    .line 2
    .line 3
    iput-object p1, p0, Lcc;->k0:Lt3;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lwl6;-><init>(B)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public J(ILh4;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcc;->j0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lcc;->k0:Lt3;

    .line 8
    .line 9
    check-cast p0, Lgc;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Lgc;->j(ILh4;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final L(I)Lh4;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Lcc;->j0:B

    .line 6
    .line 7
    iget-object v0, v0, Lcc;->k0:Lt3;

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Lj62;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lj62;->q(I)Lh4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lh4;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 19
    .line 20
    invoke-static {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lh4;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lh4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    check-cast v0, Lgc;

    .line 31
    .line 32
    iget-object v2, v0, Lgc;->i0:Landroid/view/accessibility/AccessibilityManager;

    .line 33
    .line 34
    iget-object v3, v0, Lgc;->f0:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 35
    .line 36
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lxz0;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Lxz0;->d()Ld94;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v4}, Ld94;->h()Lg94;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-object v4, v4, Lg94;->i:Lo84;

    .line 49
    .line 50
    sget-object v5, Lo84;->X:Lo84;

    .line 51
    .line 52
    if-ne v4, v5, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_0

    .line 59
    .line 60
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v6, Lh4;

    .line 65
    .line 66
    invoke-direct {v6, v2}, Lh4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v6, 0x0

    .line 71
    :goto_0
    move-object v9, v0

    .line 72
    move v5, v1

    .line 73
    goto/16 :goto_47

    .line 74
    .line 75
    :cond_1
    invoke-virtual {v0}, Lgc;->s()Lff3;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4, v1}, Lff3;->b(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, La17;

    .line 84
    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_0

    .line 92
    .line 93
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v6, Lh4;

    .line 98
    .line 99
    invoke-direct {v6, v2}, Lh4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    iget-object v5, v4, La17;->a:Ly07;

    .line 104
    .line 105
    invoke-virtual {v5}, Ly07;->k()Lt07;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    iget-object v8, v5, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 110
    .line 111
    sget-object v9, Lc17;->o:Le17;

    .line 112
    .line 113
    iget-object v7, v7, Lt07;->X:Ls05;

    .line 114
    .line 115
    invoke-virtual {v7, v9}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-nez v7, :cond_3

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    :cond_3
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-static {v7, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    const/16 v10, 0x22

    .line 129
    .line 130
    if-eqz v7, :cond_5

    .line 131
    .line 132
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 133
    .line 134
    if-lt v11, v10, :cond_4

    .line 135
    .line 136
    invoke-static {v2}, Lu3;->u(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    goto :goto_1

    .line 141
    :cond_4
    const/4 v11, 0x1

    .line 142
    :goto_1
    if-nez v11, :cond_5

    .line 143
    .line 144
    move-object v9, v0

    .line 145
    move v5, v1

    .line 146
    const/4 v6, 0x0

    .line 147
    goto/16 :goto_47

    .line 148
    .line 149
    :cond_5
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    new-instance v12, Lh4;

    .line 154
    .line 155
    invoke-direct {v12, v11}, Lh4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 156
    .line 157
    .line 158
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 159
    .line 160
    if-lt v13, v10, :cond_6

    .line 161
    .line 162
    invoke-static {v11, v7}, Lu3;->D(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    const/16 v14, 0x40

    .line 167
    .line 168
    invoke-virtual {v12, v14, v7}, Lh4;->j(IZ)V

    .line 169
    .line 170
    .line 171
    :goto_2
    const/4 v7, -0x1

    .line 172
    if-ne v1, v7, :cond_8

    .line 173
    .line 174
    invoke-virtual {v3}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 175
    .line 176
    .line 177
    move-result-object v14

    .line 178
    instance-of v15, v14, Landroid/view/View;

    .line 179
    .line 180
    if-eqz v15, :cond_7

    .line 181
    .line 182
    check-cast v14, Landroid/view/View;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    const/4 v14, 0x0

    .line 186
    :goto_3
    iput v7, v12, Lh4;->b:I

    .line 187
    .line 188
    invoke-virtual {v11, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    invoke-virtual {v5}, Ly07;->l()Ly07;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    if-eqz v14, :cond_9

    .line 197
    .line 198
    iget v14, v14, Ly07;->f:I

    .line 199
    .line 200
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    goto :goto_4

    .line 205
    :cond_9
    const/4 v14, 0x0

    .line 206
    :goto_4
    if-eqz v14, :cond_b4

    .line 207
    .line 208
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Lb17;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    invoke-virtual {v15}, Lb17;->a()Ly07;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    iget v15, v15, Ly07;->f:I

    .line 221
    .line 222
    if-ne v14, v15, :cond_a

    .line 223
    .line 224
    move v14, v7

    .line 225
    :cond_a
    iput v14, v12, Lh4;->b:I

    .line 226
    .line 227
    invoke-virtual {v11, v3, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 228
    .line 229
    .line 230
    :goto_5
    iput v1, v12, Lh4;->c:I

    .line 231
    .line 232
    invoke-virtual {v11, v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v4}, Lgc;->k(La17;)Landroid/graphics/Rect;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v12, v4}, Lh4;->l(Landroid/graphics/Rect;)V

    .line 240
    .line 241
    .line 242
    iget-object v4, v0, Lgc;->L0:Ltz4;

    .line 243
    .line 244
    iget-object v14, v0, Lgc;->u0:Lue7;

    .line 245
    .line 246
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    const/16 p0, 0x0

    .line 255
    .line 256
    const-string v6, "android.view.View"

    .line 257
    .line 258
    invoke-virtual {v12, v6}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    iget-object v6, v5, Ly07;->d:Lt07;

    .line 262
    .line 263
    iget-object v9, v6, Lt07;->X:Ls05;

    .line 264
    .line 265
    sget-object v7, Lc17;->G:Le17;

    .line 266
    .line 267
    invoke-virtual {v9, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-eqz v7, :cond_b

    .line 272
    .line 273
    const-string v7, "android.widget.EditText"

    .line 274
    .line 275
    invoke-virtual {v12, v7}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 276
    .line 277
    .line 278
    :cond_b
    sget-object v7, Lc17;->C:Le17;

    .line 279
    .line 280
    invoke-virtual {v9, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-eqz v7, :cond_c

    .line 285
    .line 286
    const-string v7, "android.widget.TextView"

    .line 287
    .line 288
    invoke-virtual {v12, v7}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 289
    .line 290
    .line 291
    :cond_c
    sget-object v7, Lc17;->z:Le17;

    .line 292
    .line 293
    invoke-virtual {v9, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    if-nez v7, :cond_d

    .line 298
    .line 299
    move-object/from16 v7, p0

    .line 300
    .line 301
    :cond_d
    check-cast v7, Lkl6;

    .line 302
    .line 303
    if-eqz v7, :cond_12

    .line 304
    .line 305
    iget-byte v10, v7, Lkl6;->a:B

    .line 306
    .line 307
    invoke-virtual {v5}, Ly07;->n()Z

    .line 308
    .line 309
    .line 310
    move-result v19

    .line 311
    if-nez v19, :cond_e

    .line 312
    .line 313
    move-object/from16 v19, v2

    .line 314
    .line 315
    const/4 v2, 0x4

    .line 316
    invoke-static {v2, v5}, Ly07;->j(ILy07;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v17

    .line 320
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v17

    .line 324
    move-object/from16 v20, v14

    .line 325
    .line 326
    if-eqz v17, :cond_13

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_e
    move-object/from16 v19, v2

    .line 330
    .line 331
    const/4 v2, 0x4

    .line 332
    move-object/from16 v20, v14

    .line 333
    .line 334
    :goto_6
    const-string v14, "AccessibilityNodeInfo.roleDescription"

    .line 335
    .line 336
    if-ne v10, v2, :cond_f

    .line 337
    .line 338
    sget v2, Lb56;->tab:I

    .line 339
    .line 340
    invoke-virtual {v15, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    invoke-virtual {v10, v14, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 349
    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_f
    const/4 v2, 0x2

    .line 353
    if-ne v10, v2, :cond_10

    .line 354
    .line 355
    sget v2, Lb56;->switch_role:I

    .line 356
    .line 357
    invoke-virtual {v15, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    invoke-virtual {v10, v14, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_10
    invoke-static {v10}, Lgv3;->X(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const/4 v14, 0x5

    .line 374
    if-ne v10, v14, :cond_11

    .line 375
    .line 376
    invoke-static {v5}, Lvr3;->M(Ly07;)Z

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    if-nez v10, :cond_11

    .line 381
    .line 382
    iget-boolean v10, v6, Lt07;->Z:Z

    .line 383
    .line 384
    if-eqz v10, :cond_13

    .line 385
    .line 386
    :cond_11
    invoke-virtual {v12, v2}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_12
    move-object/from16 v19, v2

    .line 391
    .line 392
    move-object/from16 v20, v14

    .line 393
    .line 394
    :cond_13
    :goto_7
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v11, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v5}, Ljm4;->M(Ly07;)Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    invoke-virtual {v11, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 410
    .line 411
    .line 412
    const/16 v2, 0x22

    .line 413
    .line 414
    if-lt v13, v2, :cond_14

    .line 415
    .line 416
    invoke-static/range {v19 .. v19}, Lu3;->u(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    :goto_8
    const/4 v10, 0x4

    .line 421
    goto :goto_9

    .line 422
    :cond_14
    const/4 v2, 0x1

    .line 423
    goto :goto_8

    .line 424
    :goto_9
    invoke-static {v10, v5}, Ly07;->j(ILy07;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v13

    .line 428
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    move/from16 v19, v2

    .line 433
    .line 434
    move-object/from16 v21, v8

    .line 435
    .line 436
    const/4 v2, 0x0

    .line 437
    const/4 v14, 0x0

    .line 438
    :goto_a
    iget-object v8, v12, Lh4;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 439
    .line 440
    if-ge v14, v10, :cond_1c

    .line 441
    .line 442
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v22

    .line 446
    move/from16 v23, v10

    .line 447
    .line 448
    move-object/from16 v10, v22

    .line 449
    .line 450
    check-cast v10, Ly07;

    .line 451
    .line 452
    move-object/from16 v22, v13

    .line 453
    .line 454
    invoke-virtual {v0}, Lgc;->s()Lff3;

    .line 455
    .line 456
    .line 457
    move-result-object v13

    .line 458
    move/from16 v24, v14

    .line 459
    .line 460
    iget v14, v10, Ly07;->f:I

    .line 461
    .line 462
    invoke-virtual {v13, v14}, Lff3;->a(I)Z

    .line 463
    .line 464
    .line 465
    move-result v13

    .line 466
    if-eqz v13, :cond_1b

    .line 467
    .line 468
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Lgi;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    invoke-virtual {v13}, Lgi;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 473
    .line 474
    .line 475
    move-result-object v13

    .line 476
    iget-object v10, v10, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 477
    .line 478
    invoke-virtual {v13, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    if-nez v10, :cond_1a

    .line 483
    .line 484
    const/4 v10, -0x1

    .line 485
    if-ne v14, v10, :cond_15

    .line 486
    .line 487
    goto :goto_d

    .line 488
    :cond_15
    invoke-virtual {v0}, Lgc;->s()Lff3;

    .line 489
    .line 490
    .line 491
    move-result-object v10

    .line 492
    invoke-virtual {v10, v14}, Lff3;->b(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v10

    .line 496
    check-cast v10, La17;

    .line 497
    .line 498
    if-eqz v10, :cond_17

    .line 499
    .line 500
    iget-object v10, v10, La17;->a:Ly07;

    .line 501
    .line 502
    if-eqz v10, :cond_17

    .line 503
    .line 504
    invoke-virtual {v10}, Ly07;->k()Lt07;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    sget-object v13, Lc17;->o:Le17;

    .line 509
    .line 510
    iget-object v10, v10, Lt07;->X:Ls05;

    .line 511
    .line 512
    invoke-virtual {v10, v13}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    if-nez v10, :cond_16

    .line 517
    .line 518
    move-object/from16 v10, p0

    .line 519
    .line 520
    :cond_16
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 521
    .line 522
    invoke-static {v10, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v10

    .line 526
    goto :goto_b

    .line 527
    :cond_17
    const/4 v10, 0x0

    .line 528
    :goto_b
    if-nez v19, :cond_18

    .line 529
    .line 530
    if-nez v10, :cond_19

    .line 531
    .line 532
    :cond_18
    invoke-virtual {v8, v3, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 533
    .line 534
    .line 535
    :cond_19
    invoke-virtual {v4, v14, v2}, Ltz4;->f(II)V

    .line 536
    .line 537
    .line 538
    add-int/lit8 v2, v2, 0x1

    .line 539
    .line 540
    goto :goto_d

    .line 541
    :cond_1a
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 542
    .line 543
    .line 544
    :goto_c
    move-object/from16 v6, p0

    .line 545
    .line 546
    goto/16 :goto_48

    .line 547
    .line 548
    :cond_1b
    :goto_d
    add-int/lit8 v14, v24, 0x1

    .line 549
    .line 550
    move-object/from16 v13, v22

    .line 551
    .line 552
    move/from16 v10, v23

    .line 553
    .line 554
    goto :goto_a

    .line 555
    :cond_1c
    iget v2, v0, Lgc;->m0:I

    .line 556
    .line 557
    if-ne v1, v2, :cond_1d

    .line 558
    .line 559
    const/4 v2, 0x1

    .line 560
    invoke-virtual {v8, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 561
    .line 562
    .line 563
    sget-object v2, La4;->i:La4;

    .line 564
    .line 565
    invoke-virtual {v12, v2}, Lh4;->b(La4;)V

    .line 566
    .line 567
    .line 568
    goto :goto_e

    .line 569
    :cond_1d
    const/4 v2, 0x0

    .line 570
    invoke-virtual {v8, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 571
    .line 572
    .line 573
    sget-object v2, La4;->h:La4;

    .line 574
    .line 575
    invoke-virtual {v12, v2}, Lh4;->b(La4;)V

    .line 576
    .line 577
    .line 578
    :goto_e
    invoke-static {v5}, Lvr3;->C(Ly07;)Lql;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    if-eqz v2, :cond_38

    .line 583
    .line 584
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getFontFamilyResolver()Lfi2;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lfi1;

    .line 588
    .line 589
    .line 590
    move-result-object v25

    .line 591
    iget-object v10, v0, Lgc;->H0:Lzv7;

    .line 592
    .line 593
    new-instance v13, Landroid/text/SpannableString;

    .line 594
    .line 595
    iget-object v14, v2, Lql;->Y:Ljava/lang/String;

    .line 596
    .line 597
    move-object/from16 v19, v3

    .line 598
    .line 599
    iget-object v3, v2, Lql;->X:Ljava/util/List;

    .line 600
    .line 601
    invoke-direct {v13, v14}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v28, v14

    .line 605
    .line 606
    iget-object v14, v2, Lql;->Z:Ljava/util/ArrayList;

    .line 607
    .line 608
    move-object/from16 v29, v0

    .line 609
    .line 610
    if-eqz v14, :cond_29

    .line 611
    .line 612
    invoke-interface {v14}, Ljava/util/Collection;->size()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    move-object/from16 v30, v4

    .line 617
    .line 618
    const/4 v4, 0x0

    .line 619
    :goto_f
    if-ge v4, v0, :cond_28

    .line 620
    .line 621
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v22

    .line 625
    move/from16 v31, v0

    .line 626
    .line 627
    move-object/from16 v0, v22

    .line 628
    .line 629
    check-cast v0, Lpl;

    .line 630
    .line 631
    move/from16 v32, v4

    .line 632
    .line 633
    iget-object v4, v0, Lpl;->a:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v4, Lqe7;

    .line 636
    .line 637
    move-object/from16 v33, v14

    .line 638
    .line 639
    iget v14, v0, Lpl;->b:I

    .line 640
    .line 641
    iget v0, v0, Lpl;->c:I

    .line 642
    .line 643
    iget-object v1, v4, Lqe7;->a:Lf78;

    .line 644
    .line 645
    move-object/from16 v34, v6

    .line 646
    .line 647
    move-object/from16 v35, v7

    .line 648
    .line 649
    invoke-interface {v1}, Lf78;->b()J

    .line 650
    .line 651
    .line 652
    move-result-wide v6

    .line 653
    move-object/from16 v36, v8

    .line 654
    .line 655
    move-object v1, v9

    .line 656
    iget-wide v8, v4, Lqe7;->b:J

    .line 657
    .line 658
    move-object/from16 v37, v1

    .line 659
    .line 660
    iget-object v1, v4, Lqe7;->c:Ldj2;

    .line 661
    .line 662
    move-object/from16 v38, v1

    .line 663
    .line 664
    iget-object v1, v4, Lqe7;->d:Lbj2;

    .line 665
    .line 666
    move-wide/from16 v23, v8

    .line 667
    .line 668
    iget-object v8, v4, Lqe7;->j:Lg78;

    .line 669
    .line 670
    iget-object v9, v4, Lqe7;->k:Lge4;

    .line 671
    .line 672
    move-object/from16 v39, v11

    .line 673
    .line 674
    move-object/from16 v40, v12

    .line 675
    .line 676
    iget-wide v11, v4, Lqe7;->l:J

    .line 677
    .line 678
    move-wide/from16 v41, v11

    .line 679
    .line 680
    iget-object v11, v4, Lqe7;->m:Lx38;

    .line 681
    .line 682
    iget-object v4, v4, Lqe7;->a:Lf78;

    .line 683
    .line 684
    move-object/from16 v22, v4

    .line 685
    .line 686
    move-object v12, v5

    .line 687
    invoke-interface/range {v22 .. v22}, Lf78;->b()J

    .line 688
    .line 689
    .line 690
    move-result-wide v4

    .line 691
    sget v26, Ldw0;->h:I

    .line 692
    .line 693
    invoke-static {v6, v7, v4, v5}, Ltk8;->a(JJ)Z

    .line 694
    .line 695
    .line 696
    move-result v4

    .line 697
    const-wide/16 v43, 0x10

    .line 698
    .line 699
    if-eqz v4, :cond_1e

    .line 700
    .line 701
    move-object/from16 v4, v22

    .line 702
    .line 703
    goto :goto_10

    .line 704
    :cond_1e
    cmp-long v4, v6, v43

    .line 705
    .line 706
    if-eqz v4, :cond_1f

    .line 707
    .line 708
    new-instance v4, Lpw0;

    .line 709
    .line 710
    invoke-direct {v4, v6, v7}, Lpw0;-><init>(J)V

    .line 711
    .line 712
    .line 713
    goto :goto_10

    .line 714
    :cond_1f
    sget-object v4, Le78;->a:Le78;

    .line 715
    .line 716
    :goto_10
    invoke-interface {v4}, Lf78;->b()J

    .line 717
    .line 718
    .line 719
    move-result-wide v4

    .line 720
    invoke-static {v13, v4, v5, v14, v0}, Ldh3;->J(Landroid/text/Spannable;JII)V

    .line 721
    .line 722
    .line 723
    move/from16 v27, v0

    .line 724
    .line 725
    move-object/from16 v22, v13

    .line 726
    .line 727
    move/from16 v26, v14

    .line 728
    .line 729
    invoke-static/range {v22 .. v27}, Ldh3;->K(Landroid/text/Spannable;JLfi1;II)V

    .line 730
    .line 731
    .line 732
    move-object/from16 v0, v22

    .line 733
    .line 734
    move/from16 v4, v26

    .line 735
    .line 736
    move/from16 v5, v27

    .line 737
    .line 738
    if-nez v38, :cond_21

    .line 739
    .line 740
    if-eqz v1, :cond_20

    .line 741
    .line 742
    goto :goto_11

    .line 743
    :cond_20
    const/16 v1, 0x21

    .line 744
    .line 745
    goto :goto_14

    .line 746
    :cond_21
    :goto_11
    if-nez v38, :cond_22

    .line 747
    .line 748
    sget-object v6, Ldj2;->g0:Ldj2;

    .line 749
    .line 750
    goto :goto_12

    .line 751
    :cond_22
    move-object/from16 v6, v38

    .line 752
    .line 753
    :goto_12
    if-eqz v1, :cond_23

    .line 754
    .line 755
    iget v1, v1, Lbj2;->a:I

    .line 756
    .line 757
    goto :goto_13

    .line 758
    :cond_23
    const/4 v1, 0x0

    .line 759
    :goto_13
    new-instance v7, Landroid/text/style/StyleSpan;

    .line 760
    .line 761
    invoke-static {v6, v1}, Lkm4;->H(Ldj2;I)I

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    invoke-direct {v7, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 766
    .line 767
    .line 768
    const/16 v1, 0x21

    .line 769
    .line 770
    invoke-virtual {v0, v7, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 771
    .line 772
    .line 773
    :goto_14
    if-eqz v11, :cond_25

    .line 774
    .line 775
    iget v6, v11, Lx38;->a:I

    .line 776
    .line 777
    or-int/lit8 v7, v6, 0x1

    .line 778
    .line 779
    if-ne v7, v6, :cond_24

    .line 780
    .line 781
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 782
    .line 783
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v0, v7, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 787
    .line 788
    .line 789
    :cond_24
    or-int/lit8 v7, v6, 0x2

    .line 790
    .line 791
    if-ne v7, v6, :cond_25

    .line 792
    .line 793
    new-instance v6, Landroid/text/style/StrikethroughSpan;

    .line 794
    .line 795
    invoke-direct {v6}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v0, v6, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 799
    .line 800
    .line 801
    :cond_25
    if-eqz v8, :cond_26

    .line 802
    .line 803
    new-instance v6, Landroid/text/style/ScaleXSpan;

    .line 804
    .line 805
    iget v7, v8, Lg78;->a:F

    .line 806
    .line 807
    invoke-direct {v6, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v6, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 811
    .line 812
    .line 813
    :cond_26
    invoke-static {v0, v9, v4, v5}, Ldh3;->L(Landroid/text/Spannable;Lge4;II)V

    .line 814
    .line 815
    .line 816
    cmp-long v6, v41, v43

    .line 817
    .line 818
    if-eqz v6, :cond_27

    .line 819
    .line 820
    new-instance v6, Landroid/text/style/BackgroundColorSpan;

    .line 821
    .line 822
    invoke-static/range {v41 .. v42}, Lz51;->U(J)I

    .line 823
    .line 824
    .line 825
    move-result v7

    .line 826
    invoke-direct {v6, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v6, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 830
    .line 831
    .line 832
    :cond_27
    add-int/lit8 v4, v32, 0x1

    .line 833
    .line 834
    move/from16 v1, p1

    .line 835
    .line 836
    move-object v13, v0

    .line 837
    move-object v5, v12

    .line 838
    move/from16 v0, v31

    .line 839
    .line 840
    move-object/from16 v14, v33

    .line 841
    .line 842
    move-object/from16 v6, v34

    .line 843
    .line 844
    move-object/from16 v7, v35

    .line 845
    .line 846
    move-object/from16 v8, v36

    .line 847
    .line 848
    move-object/from16 v9, v37

    .line 849
    .line 850
    move-object/from16 v11, v39

    .line 851
    .line 852
    move-object/from16 v12, v40

    .line 853
    .line 854
    goto/16 :goto_f

    .line 855
    .line 856
    :cond_28
    :goto_15
    move-object/from16 v34, v6

    .line 857
    .line 858
    move-object/from16 v35, v7

    .line 859
    .line 860
    move-object/from16 v36, v8

    .line 861
    .line 862
    move-object/from16 v37, v9

    .line 863
    .line 864
    move-object/from16 v39, v11

    .line 865
    .line 866
    move-object/from16 v40, v12

    .line 867
    .line 868
    move-object v0, v13

    .line 869
    move-object v12, v5

    .line 870
    goto :goto_16

    .line 871
    :cond_29
    move-object/from16 v30, v4

    .line 872
    .line 873
    goto :goto_15

    .line 874
    :goto_16
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 875
    .line 876
    .line 877
    move-result v1

    .line 878
    sget-object v4, Ld02;->X:Ld02;

    .line 879
    .line 880
    if-eqz v3, :cond_2b

    .line 881
    .line 882
    new-instance v5, Ljava/util/ArrayList;

    .line 883
    .line 884
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 885
    .line 886
    .line 887
    move-result v6

    .line 888
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 889
    .line 890
    .line 891
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 892
    .line 893
    .line 894
    move-result v6

    .line 895
    const/4 v7, 0x0

    .line 896
    :goto_17
    if-ge v7, v6, :cond_2c

    .line 897
    .line 898
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v8

    .line 902
    move-object v9, v8

    .line 903
    check-cast v9, Lpl;

    .line 904
    .line 905
    iget-object v11, v9, Lpl;->a:Ljava/lang/Object;

    .line 906
    .line 907
    instance-of v11, v11, Lyu8;

    .line 908
    .line 909
    if-eqz v11, :cond_2a

    .line 910
    .line 911
    iget v11, v9, Lpl;->b:I

    .line 912
    .line 913
    iget v9, v9, Lpl;->c:I

    .line 914
    .line 915
    const/4 v13, 0x0

    .line 916
    invoke-static {v13, v1, v11, v9}, Lrl;->b(IIII)Z

    .line 917
    .line 918
    .line 919
    move-result v9

    .line 920
    if-eqz v9, :cond_2a

    .line 921
    .line 922
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 926
    .line 927
    goto :goto_17

    .line 928
    :cond_2b
    move-object v5, v4

    .line 929
    :cond_2c
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    const/4 v6, 0x0

    .line 934
    :goto_18
    if-ge v6, v1, :cond_2e

    .line 935
    .line 936
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v7

    .line 940
    check-cast v7, Lpl;

    .line 941
    .line 942
    iget-object v8, v7, Lpl;->a:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v8, Lyu8;

    .line 945
    .line 946
    iget v9, v7, Lpl;->b:I

    .line 947
    .line 948
    iget v7, v7, Lpl;->c:I

    .line 949
    .line 950
    instance-of v11, v8, Lyu8;

    .line 951
    .line 952
    if-eqz v11, :cond_2d

    .line 953
    .line 954
    new-instance v11, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 955
    .line 956
    iget-object v8, v8, Lyu8;->a:Ljava/lang/String;

    .line 957
    .line 958
    invoke-direct {v11, v8}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v11}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    const/16 v11, 0x21

    .line 966
    .line 967
    invoke-virtual {v0, v8, v9, v7, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 968
    .line 969
    .line 970
    add-int/lit8 v6, v6, 0x1

    .line 971
    .line 972
    goto :goto_18

    .line 973
    :cond_2d
    invoke-static {}, Lb61;->c()V

    .line 974
    .line 975
    .line 976
    goto/16 :goto_c

    .line 977
    .line 978
    :cond_2e
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 979
    .line 980
    .line 981
    move-result v1

    .line 982
    if-eqz v3, :cond_30

    .line 983
    .line 984
    new-instance v4, Ljava/util/ArrayList;

    .line 985
    .line 986
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 987
    .line 988
    .line 989
    move-result v5

    .line 990
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 991
    .line 992
    .line 993
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    const/4 v6, 0x0

    .line 998
    :goto_19
    if-ge v6, v5, :cond_30

    .line 999
    .line 1000
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v7

    .line 1004
    move-object v8, v7

    .line 1005
    check-cast v8, Lpl;

    .line 1006
    .line 1007
    iget-object v9, v8, Lpl;->a:Ljava/lang/Object;

    .line 1008
    .line 1009
    instance-of v9, v9, Lfq8;

    .line 1010
    .line 1011
    if-eqz v9, :cond_2f

    .line 1012
    .line 1013
    iget v9, v8, Lpl;->b:I

    .line 1014
    .line 1015
    iget v8, v8, Lpl;->c:I

    .line 1016
    .line 1017
    const/4 v13, 0x0

    .line 1018
    invoke-static {v13, v1, v9, v8}, Lrl;->b(IIII)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v8

    .line 1022
    if-eqz v8, :cond_2f

    .line 1023
    .line 1024
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    :cond_2f
    add-int/lit8 v6, v6, 0x1

    .line 1028
    .line 1029
    goto :goto_19

    .line 1030
    :cond_30
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1031
    .line 1032
    .line 1033
    move-result v1

    .line 1034
    const/4 v3, 0x0

    .line 1035
    :goto_1a
    if-ge v3, v1, :cond_32

    .line 1036
    .line 1037
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v5

    .line 1041
    check-cast v5, Lpl;

    .line 1042
    .line 1043
    iget-object v6, v5, Lpl;->a:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v6, Lfq8;

    .line 1046
    .line 1047
    iget v7, v5, Lpl;->b:I

    .line 1048
    .line 1049
    iget v5, v5, Lpl;->c:I

    .line 1050
    .line 1051
    iget-object v8, v10, Lzv7;->X:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v8, Ljava/util/WeakHashMap;

    .line 1054
    .line 1055
    invoke-virtual {v8, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v9

    .line 1059
    if-nez v9, :cond_31

    .line 1060
    .line 1061
    new-instance v9, Landroid/text/style/URLSpan;

    .line 1062
    .line 1063
    iget-object v11, v6, Lfq8;->a:Ljava/lang/String;

    .line 1064
    .line 1065
    invoke-direct {v9, v11}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v8, v6, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    :cond_31
    check-cast v9, Landroid/text/style/URLSpan;

    .line 1072
    .line 1073
    const/16 v11, 0x21

    .line 1074
    .line 1075
    invoke-virtual {v0, v9, v7, v5, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1076
    .line 1077
    .line 1078
    add-int/lit8 v3, v3, 0x1

    .line 1079
    .line 1080
    goto :goto_1a

    .line 1081
    :cond_32
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 1082
    .line 1083
    .line 1084
    move-result v1

    .line 1085
    invoke-virtual {v2, v1}, Lql;->a(I)Ljava/util/List;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1090
    .line 1091
    .line 1092
    move-result v2

    .line 1093
    const/4 v3, 0x0

    .line 1094
    :goto_1b
    if-ge v3, v2, :cond_37

    .line 1095
    .line 1096
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    check-cast v4, Lpl;

    .line 1101
    .line 1102
    iget v5, v4, Lpl;->b:I

    .line 1103
    .line 1104
    iget-object v6, v4, Lpl;->a:Ljava/lang/Object;

    .line 1105
    .line 1106
    iget v7, v4, Lpl;->c:I

    .line 1107
    .line 1108
    if-eq v5, v7, :cond_36

    .line 1109
    .line 1110
    move-object v8, v6

    .line 1111
    check-cast v8, Lpa4;

    .line 1112
    .line 1113
    instance-of v9, v8, Loa4;

    .line 1114
    .line 1115
    if-eqz v9, :cond_34

    .line 1116
    .line 1117
    new-instance v4, Lpl;

    .line 1118
    .line 1119
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    check-cast v6, Loa4;

    .line 1123
    .line 1124
    invoke-direct {v4, v5, v7, v6}, Lpl;-><init>(IILjava/lang/Object;)V

    .line 1125
    .line 1126
    .line 1127
    iget-object v8, v10, Lzv7;->Y:Ljava/lang/Object;

    .line 1128
    .line 1129
    check-cast v8, Ljava/util/WeakHashMap;

    .line 1130
    .line 1131
    invoke-virtual {v8, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v9

    .line 1135
    if-nez v9, :cond_33

    .line 1136
    .line 1137
    new-instance v9, Landroid/text/style/URLSpan;

    .line 1138
    .line 1139
    iget-object v6, v6, Loa4;->a:Ljava/lang/String;

    .line 1140
    .line 1141
    invoke-direct {v9, v6}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v8, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    :cond_33
    check-cast v9, Landroid/text/style/URLSpan;

    .line 1148
    .line 1149
    const/16 v11, 0x21

    .line 1150
    .line 1151
    invoke-virtual {v0, v9, v5, v7, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1152
    .line 1153
    .line 1154
    goto :goto_1c

    .line 1155
    :cond_34
    iget-object v6, v10, Lzv7;->Z:Ljava/lang/Object;

    .line 1156
    .line 1157
    check-cast v6, Ljava/util/WeakHashMap;

    .line 1158
    .line 1159
    invoke-virtual {v6, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v9

    .line 1163
    if-nez v9, :cond_35

    .line 1164
    .line 1165
    new-instance v9, Lgz0;

    .line 1166
    .line 1167
    invoke-direct {v9, v8}, Lgz0;-><init>(Lpa4;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v6, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    :cond_35
    check-cast v9, Landroid/text/style/ClickableSpan;

    .line 1174
    .line 1175
    const/16 v11, 0x21

    .line 1176
    .line 1177
    invoke-virtual {v0, v9, v5, v7, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1178
    .line 1179
    .line 1180
    goto :goto_1c

    .line 1181
    :cond_36
    const/16 v11, 0x21

    .line 1182
    .line 1183
    :goto_1c
    add-int/lit8 v3, v3, 0x1

    .line 1184
    .line 1185
    goto :goto_1b

    .line 1186
    :cond_37
    invoke-static {v0}, Lgc;->P(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    check-cast v0, Landroid/text/SpannableString;

    .line 1191
    .line 1192
    :goto_1d
    move-object/from16 v1, v40

    .line 1193
    .line 1194
    goto :goto_1e

    .line 1195
    :cond_38
    move-object/from16 v29, v0

    .line 1196
    .line 1197
    move-object/from16 v19, v3

    .line 1198
    .line 1199
    move-object/from16 v30, v4

    .line 1200
    .line 1201
    move-object/from16 v34, v6

    .line 1202
    .line 1203
    move-object/from16 v35, v7

    .line 1204
    .line 1205
    move-object/from16 v36, v8

    .line 1206
    .line 1207
    move-object/from16 v37, v9

    .line 1208
    .line 1209
    move-object/from16 v39, v11

    .line 1210
    .line 1211
    move-object/from16 v40, v12

    .line 1212
    .line 1213
    move-object v12, v5

    .line 1214
    move-object/from16 v0, p0

    .line 1215
    .line 1216
    goto :goto_1d

    .line 1217
    :goto_1e
    invoke-virtual {v1, v0}, Lh4;->x(Ljava/lang/CharSequence;)V

    .line 1218
    .line 1219
    .line 1220
    sget-object v0, Lc17;->O:Le17;

    .line 1221
    .line 1222
    move-object/from16 v2, v37

    .line 1223
    .line 1224
    invoke-virtual {v2, v0}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v3

    .line 1228
    if-eqz v3, :cond_3a

    .line 1229
    .line 1230
    move-object/from16 v3, v39

    .line 1231
    .line 1232
    const/4 v4, 0x1

    .line 1233
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v2, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    if-nez v0, :cond_39

    .line 1241
    .line 1242
    move-object/from16 v0, p0

    .line 1243
    .line 1244
    :cond_39
    check-cast v0, Ljava/lang/CharSequence;

    .line 1245
    .line 1246
    move-object/from16 v4, v36

    .line 1247
    .line 1248
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 1249
    .line 1250
    .line 1251
    goto :goto_1f

    .line 1252
    :cond_3a
    move-object/from16 v4, v36

    .line 1253
    .line 1254
    move-object/from16 v3, v39

    .line 1255
    .line 1256
    :goto_1f
    invoke-static {v12, v15}, Lvr3;->B(Ly07;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    invoke-virtual {v1, v0}, Lh4;->w(Ljava/lang/CharSequence;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-static {v12}, Lvr3;->A(Ly07;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v0

    .line 1267
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 1268
    .line 1269
    .line 1270
    sget-object v0, Lc17;->L:Le17;

    .line 1271
    .line 1272
    invoke-virtual {v2, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    if-nez v0, :cond_3b

    .line 1277
    .line 1278
    move-object/from16 v0, p0

    .line 1279
    .line 1280
    :cond_3b
    check-cast v0, Lib8;

    .line 1281
    .line 1282
    if-eqz v0, :cond_3d

    .line 1283
    .line 1284
    sget-object v5, Lib8;->X:Lib8;

    .line 1285
    .line 1286
    if-ne v0, v5, :cond_3c

    .line 1287
    .line 1288
    const/4 v5, 0x1

    .line 1289
    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_20

    .line 1293
    :cond_3c
    sget-object v5, Lib8;->Y:Lib8;

    .line 1294
    .line 1295
    if-ne v0, v5, :cond_3d

    .line 1296
    .line 1297
    const/4 v13, 0x0

    .line 1298
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1299
    .line 1300
    .line 1301
    :cond_3d
    :goto_20
    sget-object v0, Lc17;->K:Le17;

    .line 1302
    .line 1303
    invoke-virtual {v2, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    if-nez v0, :cond_3e

    .line 1308
    .line 1309
    move-object/from16 v0, p0

    .line 1310
    .line 1311
    :cond_3e
    check-cast v0, Ljava/lang/Boolean;

    .line 1312
    .line 1313
    if-eqz v0, :cond_41

    .line 1314
    .line 1315
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v0

    .line 1319
    if-nez v35, :cond_3f

    .line 1320
    .line 1321
    move-object/from16 v7, v35

    .line 1322
    .line 1323
    const/4 v10, 0x4

    .line 1324
    goto :goto_21

    .line 1325
    :cond_3f
    move-object/from16 v7, v35

    .line 1326
    .line 1327
    iget-byte v5, v7, Lkl6;->a:B

    .line 1328
    .line 1329
    const/4 v10, 0x4

    .line 1330
    if-ne v5, v10, :cond_40

    .line 1331
    .line 1332
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_22

    .line 1336
    :cond_40
    :goto_21
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1337
    .line 1338
    .line 1339
    :goto_22
    move-object/from16 v0, v34

    .line 1340
    .line 1341
    goto :goto_23

    .line 1342
    :cond_41
    move-object/from16 v7, v35

    .line 1343
    .line 1344
    const/4 v10, 0x4

    .line 1345
    goto :goto_22

    .line 1346
    :goto_23
    iget-boolean v5, v0, Lt07;->Z:Z

    .line 1347
    .line 1348
    if-eqz v5, :cond_42

    .line 1349
    .line 1350
    invoke-static {v10, v12}, Ly07;->j(ILy07;)Ljava/util/List;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v5

    .line 1354
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1355
    .line 1356
    .line 1357
    move-result v5

    .line 1358
    if-eqz v5, :cond_45

    .line 1359
    .line 1360
    :cond_42
    sget-object v5, Lc17;->a:Le17;

    .line 1361
    .line 1362
    invoke-virtual {v2, v5}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v5

    .line 1366
    if-nez v5, :cond_43

    .line 1367
    .line 1368
    move-object/from16 v5, p0

    .line 1369
    .line 1370
    :cond_43
    check-cast v5, Ljava/util/List;

    .line 1371
    .line 1372
    if-eqz v5, :cond_44

    .line 1373
    .line 1374
    invoke-static {v5}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v5

    .line 1378
    check-cast v5, Ljava/lang/String;

    .line 1379
    .line 1380
    goto :goto_24

    .line 1381
    :cond_44
    move-object/from16 v5, p0

    .line 1382
    .line 1383
    :goto_24
    invoke-virtual {v1, v5}, Lh4;->p(Ljava/lang/CharSequence;)V

    .line 1384
    .line 1385
    .line 1386
    :cond_45
    sget-object v5, Lc17;->A:Le17;

    .line 1387
    .line 1388
    invoke-virtual {v2, v5}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v5

    .line 1392
    if-nez v5, :cond_46

    .line 1393
    .line 1394
    move-object/from16 v5, p0

    .line 1395
    .line 1396
    :cond_46
    check-cast v5, Ljava/lang/String;

    .line 1397
    .line 1398
    if-eqz v5, :cond_49

    .line 1399
    .line 1400
    move-object v6, v12

    .line 1401
    :goto_25
    if-eqz v6, :cond_48

    .line 1402
    .line 1403
    iget-object v8, v6, Ly07;->d:Lt07;

    .line 1404
    .line 1405
    sget-object v9, Lkm4;->i:Le17;

    .line 1406
    .line 1407
    iget-object v10, v8, Lt07;->X:Ls05;

    .line 1408
    .line 1409
    invoke-virtual {v10, v9}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v10

    .line 1413
    if-eqz v10, :cond_47

    .line 1414
    .line 1415
    invoke-virtual {v8, v9}, Lt07;->c(Le17;)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v6

    .line 1419
    check-cast v6, Ljava/lang/Boolean;

    .line 1420
    .line 1421
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v6

    .line 1425
    goto :goto_26

    .line 1426
    :cond_47
    invoke-virtual {v6}, Ly07;->l()Ly07;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v6

    .line 1430
    goto :goto_25

    .line 1431
    :cond_48
    const/4 v6, 0x0

    .line 1432
    :goto_26
    if-eqz v6, :cond_49

    .line 1433
    .line 1434
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    :cond_49
    sget-object v5, Lc17;->h:Le17;

    .line 1438
    .line 1439
    invoke-virtual {v2, v5}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v5

    .line 1443
    if-nez v5, :cond_4a

    .line 1444
    .line 1445
    move-object/from16 v5, p0

    .line 1446
    .line 1447
    :cond_4a
    check-cast v5, Ldn8;

    .line 1448
    .line 1449
    if-eqz v5, :cond_4b

    .line 1450
    .line 1451
    const/4 v5, 0x1

    .line 1452
    invoke-virtual {v1, v5}, Lh4;->q(Z)V

    .line 1453
    .line 1454
    .line 1455
    :cond_4b
    sget-object v5, Lc17;->i:Le17;

    .line 1456
    .line 1457
    invoke-virtual {v2, v5}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v5

    .line 1461
    if-nez v5, :cond_4c

    .line 1462
    .line 1463
    move-object/from16 v5, p0

    .line 1464
    .line 1465
    :cond_4c
    check-cast v5, Ldn8;

    .line 1466
    .line 1467
    if-eqz v5, :cond_4d

    .line 1468
    .line 1469
    invoke-virtual {v1}, Lh4;->y()V

    .line 1470
    .line 1471
    .line 1472
    :cond_4d
    move/from16 v5, p1

    .line 1473
    .line 1474
    const/4 v10, -0x1

    .line 1475
    if-eq v5, v10, :cond_4e

    .line 1476
    .line 1477
    iget v6, v12, Ly07;->f:I

    .line 1478
    .line 1479
    move-object/from16 v8, v30

    .line 1480
    .line 1481
    invoke-virtual {v8, v6}, Ltz4;->d(I)I

    .line 1482
    .line 1483
    .line 1484
    move-result v6

    .line 1485
    if-eq v6, v10, :cond_4e

    .line 1486
    .line 1487
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    .line 1488
    .line 1489
    .line 1490
    :cond_4e
    sget-object v6, Lc17;->N:Le17;

    .line 1491
    .line 1492
    invoke-virtual {v2, v6}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1493
    .line 1494
    .line 1495
    move-result v6

    .line 1496
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 1497
    .line 1498
    .line 1499
    sget-object v6, Lc17;->Q:Le17;

    .line 1500
    .line 1501
    invoke-virtual {v2, v6}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v6

    .line 1505
    if-nez v6, :cond_4f

    .line 1506
    .line 1507
    move-object/from16 v6, p0

    .line 1508
    .line 1509
    :cond_4f
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1510
    .line 1511
    invoke-static {v6, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    move-result v6

    .line 1515
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 1516
    .line 1517
    .line 1518
    sget-object v6, Lc17;->R:Le17;

    .line 1519
    .line 1520
    invoke-virtual {v2, v6}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v6

    .line 1524
    if-nez v6, :cond_50

    .line 1525
    .line 1526
    move-object/from16 v6, p0

    .line 1527
    .line 1528
    :cond_50
    check-cast v6, Ljava/lang/Integer;

    .line 1529
    .line 1530
    if-eqz v6, :cond_51

    .line 1531
    .line 1532
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1533
    .line 1534
    .line 1535
    move-result v10

    .line 1536
    goto :goto_27

    .line 1537
    :cond_51
    const/4 v10, -0x1

    .line 1538
    :goto_27
    invoke-virtual {v4, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 1539
    .line 1540
    .line 1541
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 1542
    .line 1543
    .line 1544
    move-result v6

    .line 1545
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 1546
    .line 1547
    .line 1548
    sget-object v6, Lc17;->l:Le17;

    .line 1549
    .line 1550
    invoke-virtual {v2, v6}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v9

    .line 1554
    invoke-virtual {v4, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 1558
    .line 1559
    .line 1560
    move-result v9

    .line 1561
    if-eqz v9, :cond_53

    .line 1562
    .line 1563
    invoke-virtual {v0, v6}, Lt07;->c(Le17;)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v9

    .line 1567
    check-cast v9, Ljava/lang/Boolean;

    .line 1568
    .line 1569
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1570
    .line 1571
    .line 1572
    move-result v9

    .line 1573
    invoke-virtual {v4, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1577
    .line 1578
    .line 1579
    move-result v9

    .line 1580
    if-eqz v9, :cond_52

    .line 1581
    .line 1582
    const/4 v9, 0x2

    .line 1583
    invoke-virtual {v1, v9}, Lh4;->a(I)V

    .line 1584
    .line 1585
    .line 1586
    move-object/from16 v9, v29

    .line 1587
    .line 1588
    iput v5, v9, Lgc;->n0:I

    .line 1589
    .line 1590
    :goto_28
    const/4 v10, 0x1

    .line 1591
    goto :goto_29

    .line 1592
    :cond_52
    move-object/from16 v9, v29

    .line 1593
    .line 1594
    const/4 v10, 0x1

    .line 1595
    invoke-virtual {v1, v10}, Lh4;->a(I)V

    .line 1596
    .line 1597
    .line 1598
    goto :goto_29

    .line 1599
    :cond_53
    move-object/from16 v9, v29

    .line 1600
    .line 1601
    goto :goto_28

    .line 1602
    :goto_29
    invoke-static {v12}, Ljm4;->L(Ly07;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v11

    .line 1606
    xor-int/2addr v11, v10

    .line 1607
    invoke-virtual {v4, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v12}, Ly07;->n()Z

    .line 1611
    .line 1612
    .line 1613
    move-result v10

    .line 1614
    if-eqz v10, :cond_54

    .line 1615
    .line 1616
    invoke-virtual {v12}, Ly07;->l()Ly07;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v10

    .line 1620
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    .line 1622
    .line 1623
    goto :goto_2a

    .line 1624
    :cond_54
    move-object v10, v12

    .line 1625
    :goto_2a
    invoke-virtual {v10}, Ly07;->m()Ls86;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v10

    .line 1629
    invoke-virtual {v10}, Ls86;->h()Z

    .line 1630
    .line 1631
    .line 1632
    move-result v10

    .line 1633
    if-eqz v10, :cond_55

    .line 1634
    .line 1635
    const/4 v13, 0x0

    .line 1636
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1637
    .line 1638
    .line 1639
    :cond_55
    sget-object v10, Lc17;->k:Le17;

    .line 1640
    .line 1641
    invoke-virtual {v2, v10}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v10

    .line 1645
    if-nez v10, :cond_56

    .line 1646
    .line 1647
    move-object/from16 v10, p0

    .line 1648
    .line 1649
    :cond_56
    check-cast v10, Luc4;

    .line 1650
    .line 1651
    if-eqz v10, :cond_57

    .line 1652
    .line 1653
    const/4 v10, 0x2

    .line 1654
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 1655
    .line 1656
    .line 1657
    :cond_57
    const/4 v13, 0x0

    .line 1658
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1659
    .line 1660
    .line 1661
    sget-object v10, Ls07;->b:Le17;

    .line 1662
    .line 1663
    invoke-virtual {v2, v10}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v10

    .line 1667
    if-nez v10, :cond_58

    .line 1668
    .line 1669
    move-object/from16 v10, p0

    .line 1670
    .line 1671
    :cond_58
    check-cast v10, Lq3;

    .line 1672
    .line 1673
    if-eqz v10, :cond_60

    .line 1674
    .line 1675
    sget-object v14, Lc17;->K:Le17;

    .line 1676
    .line 1677
    invoke-virtual {v2, v14}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v14

    .line 1681
    if-nez v14, :cond_59

    .line 1682
    .line 1683
    move-object/from16 v14, p0

    .line 1684
    .line 1685
    :cond_59
    invoke-static {v14, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v14

    .line 1689
    if-nez v7, :cond_5a

    .line 1690
    .line 1691
    goto :goto_2b

    .line 1692
    :cond_5a
    iget-byte v11, v7, Lkl6;->a:B

    .line 1693
    .line 1694
    const/4 v13, 0x4

    .line 1695
    if-ne v11, v13, :cond_5b

    .line 1696
    .line 1697
    goto :goto_2c

    .line 1698
    :cond_5b
    :goto_2b
    if-nez v7, :cond_5c

    .line 1699
    .line 1700
    goto :goto_2d

    .line 1701
    :cond_5c
    iget-byte v7, v7, Lkl6;->a:B

    .line 1702
    .line 1703
    const/4 v11, 0x3

    .line 1704
    if-ne v7, v11, :cond_5d

    .line 1705
    .line 1706
    :goto_2c
    const/4 v7, 0x1

    .line 1707
    goto :goto_2e

    .line 1708
    :cond_5d
    :goto_2d
    const/4 v7, 0x0

    .line 1709
    :goto_2e
    if-eqz v7, :cond_5f

    .line 1710
    .line 1711
    if-eqz v7, :cond_5e

    .line 1712
    .line 1713
    if-nez v14, :cond_5e

    .line 1714
    .line 1715
    goto :goto_2f

    .line 1716
    :cond_5e
    const/4 v7, 0x0

    .line 1717
    goto :goto_30

    .line 1718
    :cond_5f
    :goto_2f
    const/4 v7, 0x1

    .line 1719
    :goto_30
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1720
    .line 1721
    .line 1722
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v7

    .line 1726
    if-eqz v7, :cond_60

    .line 1727
    .line 1728
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    .line 1729
    .line 1730
    .line 1731
    move-result v7

    .line 1732
    if-eqz v7, :cond_60

    .line 1733
    .line 1734
    new-instance v7, La4;

    .line 1735
    .line 1736
    iget-object v10, v10, Lq3;->a:Ljava/lang/String;

    .line 1737
    .line 1738
    const/16 v11, 0x10

    .line 1739
    .line 1740
    invoke-direct {v7, v11, v10}, La4;-><init>(ILjava/lang/String;)V

    .line 1741
    .line 1742
    .line 1743
    invoke-virtual {v1, v7}, Lh4;->b(La4;)V

    .line 1744
    .line 1745
    .line 1746
    :cond_60
    const/4 v13, 0x0

    .line 1747
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1748
    .line 1749
    .line 1750
    sget-object v7, Ls07;->c:Le17;

    .line 1751
    .line 1752
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v7

    .line 1756
    if-nez v7, :cond_61

    .line 1757
    .line 1758
    move-object/from16 v7, p0

    .line 1759
    .line 1760
    :cond_61
    check-cast v7, Lq3;

    .line 1761
    .line 1762
    if-eqz v7, :cond_62

    .line 1763
    .line 1764
    const/4 v10, 0x1

    .line 1765
    invoke-virtual {v4, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1766
    .line 1767
    .line 1768
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 1769
    .line 1770
    .line 1771
    move-result v10

    .line 1772
    if-eqz v10, :cond_62

    .line 1773
    .line 1774
    new-instance v10, La4;

    .line 1775
    .line 1776
    const/16 v11, 0x20

    .line 1777
    .line 1778
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1779
    .line 1780
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 1784
    .line 1785
    .line 1786
    :cond_62
    sget-object v7, Ls07;->q:Le17;

    .line 1787
    .line 1788
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v7

    .line 1792
    if-nez v7, :cond_63

    .line 1793
    .line 1794
    move-object/from16 v7, p0

    .line 1795
    .line 1796
    :cond_63
    check-cast v7, Lq3;

    .line 1797
    .line 1798
    if-eqz v7, :cond_64

    .line 1799
    .line 1800
    new-instance v10, La4;

    .line 1801
    .line 1802
    const/16 v11, 0x4000

    .line 1803
    .line 1804
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1805
    .line 1806
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 1810
    .line 1811
    .line 1812
    :cond_64
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 1813
    .line 1814
    .line 1815
    move-result v7

    .line 1816
    if-eqz v7, :cond_6d

    .line 1817
    .line 1818
    sget-object v7, Ls07;->k:Le17;

    .line 1819
    .line 1820
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v7

    .line 1824
    if-nez v7, :cond_65

    .line 1825
    .line 1826
    move-object/from16 v7, p0

    .line 1827
    .line 1828
    :cond_65
    check-cast v7, Lq3;

    .line 1829
    .line 1830
    if-eqz v7, :cond_66

    .line 1831
    .line 1832
    new-instance v10, La4;

    .line 1833
    .line 1834
    const/high16 v11, 0x200000

    .line 1835
    .line 1836
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1837
    .line 1838
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 1839
    .line 1840
    .line 1841
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 1842
    .line 1843
    .line 1844
    :cond_66
    sget-object v7, Ls07;->p:Le17;

    .line 1845
    .line 1846
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v7

    .line 1850
    if-nez v7, :cond_67

    .line 1851
    .line 1852
    move-object/from16 v7, p0

    .line 1853
    .line 1854
    :cond_67
    check-cast v7, Lq3;

    .line 1855
    .line 1856
    if-eqz v7, :cond_68

    .line 1857
    .line 1858
    new-instance v10, La4;

    .line 1859
    .line 1860
    const v11, 0x1020054

    .line 1861
    .line 1862
    .line 1863
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1864
    .line 1865
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 1866
    .line 1867
    .line 1868
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 1869
    .line 1870
    .line 1871
    :cond_68
    sget-object v7, Ls07;->r:Le17;

    .line 1872
    .line 1873
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v7

    .line 1877
    if-nez v7, :cond_69

    .line 1878
    .line 1879
    move-object/from16 v7, p0

    .line 1880
    .line 1881
    :cond_69
    check-cast v7, Lq3;

    .line 1882
    .line 1883
    if-eqz v7, :cond_6a

    .line 1884
    .line 1885
    new-instance v10, La4;

    .line 1886
    .line 1887
    const/high16 v11, 0x10000

    .line 1888
    .line 1889
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1890
    .line 1891
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 1895
    .line 1896
    .line 1897
    :cond_6a
    sget-object v7, Ls07;->s:Le17;

    .line 1898
    .line 1899
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v7

    .line 1903
    if-nez v7, :cond_6b

    .line 1904
    .line 1905
    move-object/from16 v7, p0

    .line 1906
    .line 1907
    :cond_6b
    check-cast v7, Lq3;

    .line 1908
    .line 1909
    if-eqz v7, :cond_6d

    .line 1910
    .line 1911
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1912
    .line 1913
    .line 1914
    move-result v10

    .line 1915
    if-eqz v10, :cond_6d

    .line 1916
    .line 1917
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Llu0;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v10

    .line 1921
    check-cast v10, Ldq;

    .line 1922
    .line 1923
    invoke-virtual {v10}, Ldq;->v()Landroid/content/ClipboardManager;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v10

    .line 1927
    invoke-virtual {v10}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v10

    .line 1931
    if-eqz v10, :cond_6c

    .line 1932
    .line 1933
    const-string v11, "text/*"

    .line 1934
    .line 1935
    invoke-virtual {v10, v11}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v10

    .line 1939
    goto :goto_31

    .line 1940
    :cond_6c
    const/4 v10, 0x0

    .line 1941
    :goto_31
    if-eqz v10, :cond_6d

    .line 1942
    .line 1943
    new-instance v10, La4;

    .line 1944
    .line 1945
    const v11, 0x8000

    .line 1946
    .line 1947
    .line 1948
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1949
    .line 1950
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 1951
    .line 1952
    .line 1953
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 1954
    .line 1955
    .line 1956
    :cond_6d
    invoke-static {v12}, Lgc;->t(Ly07;)Ljava/lang/String;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v7

    .line 1960
    if-eqz v7, :cond_79

    .line 1961
    .line 1962
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1963
    .line 1964
    .line 1965
    move-result v7

    .line 1966
    if-nez v7, :cond_6e

    .line 1967
    .line 1968
    goto/16 :goto_36

    .line 1969
    .line 1970
    :cond_6e
    invoke-virtual {v9, v12}, Lgc;->r(Ly07;)I

    .line 1971
    .line 1972
    .line 1973
    move-result v7

    .line 1974
    invoke-virtual {v9, v12}, Lgc;->q(Ly07;)I

    .line 1975
    .line 1976
    .line 1977
    move-result v10

    .line 1978
    invoke-virtual {v3, v7, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 1979
    .line 1980
    .line 1981
    sget-object v7, Ls07;->j:Le17;

    .line 1982
    .line 1983
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v7

    .line 1987
    if-nez v7, :cond_6f

    .line 1988
    .line 1989
    move-object/from16 v7, p0

    .line 1990
    .line 1991
    :cond_6f
    check-cast v7, Lq3;

    .line 1992
    .line 1993
    new-instance v10, La4;

    .line 1994
    .line 1995
    if-eqz v7, :cond_70

    .line 1996
    .line 1997
    iget-object v7, v7, Lq3;->a:Ljava/lang/String;

    .line 1998
    .line 1999
    goto :goto_32

    .line 2000
    :cond_70
    move-object/from16 v7, p0

    .line 2001
    .line 2002
    :goto_32
    const/high16 v11, 0x20000

    .line 2003
    .line 2004
    invoke-direct {v10, v11, v7}, La4;-><init>(ILjava/lang/String;)V

    .line 2005
    .line 2006
    .line 2007
    invoke-virtual {v1, v10}, Lh4;->b(La4;)V

    .line 2008
    .line 2009
    .line 2010
    const/16 v7, 0x100

    .line 2011
    .line 2012
    invoke-virtual {v1, v7}, Lh4;->a(I)V

    .line 2013
    .line 2014
    .line 2015
    const/16 v7, 0x200

    .line 2016
    .line 2017
    invoke-virtual {v1, v7}, Lh4;->a(I)V

    .line 2018
    .line 2019
    .line 2020
    const/16 v7, 0xb

    .line 2021
    .line 2022
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2023
    .line 2024
    .line 2025
    sget-object v7, Lc17;->a:Le17;

    .line 2026
    .line 2027
    invoke-virtual {v2, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v7

    .line 2031
    if-nez v7, :cond_71

    .line 2032
    .line 2033
    move-object/from16 v7, p0

    .line 2034
    .line 2035
    :cond_71
    check-cast v7, Ljava/util/List;

    .line 2036
    .line 2037
    if-eqz v7, :cond_72

    .line 2038
    .line 2039
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 2040
    .line 2041
    .line 2042
    move-result v7

    .line 2043
    if-eqz v7, :cond_79

    .line 2044
    .line 2045
    :cond_72
    sget-object v7, Ls07;->a:Le17;

    .line 2046
    .line 2047
    invoke-virtual {v2, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2048
    .line 2049
    .line 2050
    move-result v7

    .line 2051
    if-eqz v7, :cond_79

    .line 2052
    .line 2053
    sget-object v7, Lc17;->G:Le17;

    .line 2054
    .line 2055
    invoke-virtual {v2, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2056
    .line 2057
    .line 2058
    move-result v7

    .line 2059
    if-eqz v7, :cond_73

    .line 2060
    .line 2061
    invoke-static {v0, v6}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v6

    .line 2065
    invoke-static {v6, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v6

    .line 2069
    if-nez v6, :cond_73

    .line 2070
    .line 2071
    goto :goto_36

    .line 2072
    :cond_73
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v6

    .line 2076
    :goto_33
    if-eqz v6, :cond_75

    .line 2077
    .line 2078
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v7

    .line 2082
    if-eqz v7, :cond_74

    .line 2083
    .line 2084
    iget-boolean v8, v7, Lt07;->Z:Z

    .line 2085
    .line 2086
    const/4 v10, 0x1

    .line 2087
    if-ne v8, v10, :cond_74

    .line 2088
    .line 2089
    sget-object v8, Lc17;->G:Le17;

    .line 2090
    .line 2091
    iget-object v7, v7, Lt07;->X:Ls05;

    .line 2092
    .line 2093
    invoke-virtual {v7, v8}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2094
    .line 2095
    .line 2096
    move-result v7

    .line 2097
    if-eqz v7, :cond_74

    .line 2098
    .line 2099
    goto :goto_34

    .line 2100
    :cond_74
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v6

    .line 2104
    goto :goto_33

    .line 2105
    :cond_75
    move-object/from16 v6, p0

    .line 2106
    .line 2107
    :goto_34
    if-eqz v6, :cond_78

    .line 2108
    .line 2109
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v6

    .line 2113
    if-eqz v6, :cond_77

    .line 2114
    .line 2115
    sget-object v7, Lc17;->l:Le17;

    .line 2116
    .line 2117
    iget-object v6, v6, Lt07;->X:Ls05;

    .line 2118
    .line 2119
    invoke-virtual {v6, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v6

    .line 2123
    if-nez v6, :cond_76

    .line 2124
    .line 2125
    move-object/from16 v6, p0

    .line 2126
    .line 2127
    :cond_76
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2128
    .line 2129
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2130
    .line 2131
    .line 2132
    move-result v6

    .line 2133
    goto :goto_35

    .line 2134
    :cond_77
    const/4 v6, 0x0

    .line 2135
    :goto_35
    if-nez v6, :cond_78

    .line 2136
    .line 2137
    goto :goto_36

    .line 2138
    :cond_78
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    .line 2139
    .line 2140
    .line 2141
    move-result v6

    .line 2142
    or-int/lit8 v6, v6, 0x14

    .line 2143
    .line 2144
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2145
    .line 2146
    .line 2147
    :cond_79
    :goto_36
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2148
    .line 2149
    const/16 v7, 0x1a

    .line 2150
    .line 2151
    if-lt v6, v7, :cond_7e

    .line 2152
    .line 2153
    new-instance v6, Ljava/util/ArrayList;

    .line 2154
    .line 2155
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2156
    .line 2157
    .line 2158
    const-string v7, "androidx.compose.ui.semantics.id"

    .line 2159
    .line 2160
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual {v1}, Lh4;->g()Ljava/lang/CharSequence;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v7

    .line 2167
    if-eqz v7, :cond_7b

    .line 2168
    .line 2169
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 2170
    .line 2171
    .line 2172
    move-result v7

    .line 2173
    if-nez v7, :cond_7a

    .line 2174
    .line 2175
    goto :goto_37

    .line 2176
    :cond_7a
    sget-object v7, Ls07;->a:Le17;

    .line 2177
    .line 2178
    invoke-virtual {v2, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2179
    .line 2180
    .line 2181
    move-result v7

    .line 2182
    if-eqz v7, :cond_7b

    .line 2183
    .line 2184
    const-string v7, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 2185
    .line 2186
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2187
    .line 2188
    .line 2189
    :cond_7b
    :goto_37
    sget-object v7, Lc17;->A:Le17;

    .line 2190
    .line 2191
    invoke-virtual {v2, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2192
    .line 2193
    .line 2194
    move-result v7

    .line 2195
    if-eqz v7, :cond_7c

    .line 2196
    .line 2197
    const-string v7, "androidx.compose.ui.semantics.testTag"

    .line 2198
    .line 2199
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2200
    .line 2201
    .line 2202
    :cond_7c
    sget-object v7, Lc17;->S:Le17;

    .line 2203
    .line 2204
    invoke-virtual {v2, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2205
    .line 2206
    .line 2207
    move-result v7

    .line 2208
    if-eqz v7, :cond_7d

    .line 2209
    .line 2210
    const-string v7, "androidx.compose.ui.semantics.shapeType"

    .line 2211
    .line 2212
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2213
    .line 2214
    .line 2215
    const-string v7, "androidx.compose.ui.semantics.shapeRect"

    .line 2216
    .line 2217
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2218
    .line 2219
    .line 2220
    const-string v7, "androidx.compose.ui.semantics.shapeCorners"

    .line 2221
    .line 2222
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2223
    .line 2224
    .line 2225
    const-string v7, "androidx.compose.ui.semantics.shapeRegion"

    .line 2226
    .line 2227
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2228
    .line 2229
    .line 2230
    :cond_7d
    invoke-virtual {v1, v6}, Lh4;->i(Ljava/util/ArrayList;)V

    .line 2231
    .line 2232
    .line 2233
    :cond_7e
    sget-object v6, Lc17;->c:Le17;

    .line 2234
    .line 2235
    invoke-static {v0, v6}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v6

    .line 2239
    check-cast v6, Lqw5;

    .line 2240
    .line 2241
    if-eqz v6, :cond_84

    .line 2242
    .line 2243
    iget v7, v6, Lqw5;->a:F

    .line 2244
    .line 2245
    iget-object v8, v6, Lqw5;->b:Luu0;

    .line 2246
    .line 2247
    sget-object v10, Ls07;->i:Le17;

    .line 2248
    .line 2249
    invoke-virtual {v2, v10}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2250
    .line 2251
    .line 2252
    move-result v11

    .line 2253
    if-eqz v11, :cond_7f

    .line 2254
    .line 2255
    const-string v11, "android.widget.SeekBar"

    .line 2256
    .line 2257
    invoke-virtual {v1, v11}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 2258
    .line 2259
    .line 2260
    goto :goto_38

    .line 2261
    :cond_7f
    const-string v11, "android.widget.ProgressBar"

    .line 2262
    .line 2263
    invoke-virtual {v1, v11}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 2264
    .line 2265
    .line 2266
    :goto_38
    sget-object v11, Lqw5;->d:Lqw5;

    .line 2267
    .line 2268
    if-eq v6, v11, :cond_80

    .line 2269
    .line 2270
    iget v6, v8, Luu0;->X:F

    .line 2271
    .line 2272
    iget v11, v8, Luu0;->Y:F

    .line 2273
    .line 2274
    const/4 v13, 0x1

    .line 2275
    invoke-static {v13, v6, v11, v7}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v6

    .line 2279
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 2280
    .line 2281
    .line 2282
    :cond_80
    invoke-virtual {v2, v10}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2283
    .line 2284
    .line 2285
    move-result v4

    .line 2286
    if-eqz v4, :cond_84

    .line 2287
    .line 2288
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 2289
    .line 2290
    .line 2291
    move-result v4

    .line 2292
    if-eqz v4, :cond_84

    .line 2293
    .line 2294
    iget v4, v8, Luu0;->Y:F

    .line 2295
    .line 2296
    iget v6, v8, Luu0;->X:F

    .line 2297
    .line 2298
    cmpg-float v10, v4, v6

    .line 2299
    .line 2300
    if-gez v10, :cond_81

    .line 2301
    .line 2302
    move v4, v6

    .line 2303
    :cond_81
    cmpg-float v4, v7, v4

    .line 2304
    .line 2305
    if-gez v4, :cond_82

    .line 2306
    .line 2307
    sget-object v4, La4;->j:La4;

    .line 2308
    .line 2309
    invoke-virtual {v1, v4}, Lh4;->b(La4;)V

    .line 2310
    .line 2311
    .line 2312
    :cond_82
    iget v4, v8, Luu0;->Y:F

    .line 2313
    .line 2314
    cmpl-float v8, v6, v4

    .line 2315
    .line 2316
    if-lez v8, :cond_83

    .line 2317
    .line 2318
    move v6, v4

    .line 2319
    :cond_83
    cmpl-float v4, v7, v6

    .line 2320
    .line 2321
    if-lez v4, :cond_84

    .line 2322
    .line 2323
    sget-object v4, La4;->k:La4;

    .line 2324
    .line 2325
    invoke-virtual {v1, v4}, Lh4;->b(La4;)V

    .line 2326
    .line 2327
    .line 2328
    :cond_84
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 2329
    .line 2330
    .line 2331
    move-result v4

    .line 2332
    if-eqz v4, :cond_85

    .line 2333
    .line 2334
    sget-object v4, Ls07;->i:Le17;

    .line 2335
    .line 2336
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v4

    .line 2340
    check-cast v4, Lq3;

    .line 2341
    .line 2342
    if-eqz v4, :cond_85

    .line 2343
    .line 2344
    new-instance v6, La4;

    .line 2345
    .line 2346
    const v7, 0x102003d

    .line 2347
    .line 2348
    .line 2349
    iget-object v4, v4, Lq3;->a:Ljava/lang/String;

    .line 2350
    .line 2351
    invoke-direct {v6, v7, v4}, La4;-><init>(ILjava/lang/String;)V

    .line 2352
    .line 2353
    .line 2354
    invoke-virtual {v1, v6}, Lh4;->b(La4;)V

    .line 2355
    .line 2356
    .line 2357
    :cond_85
    invoke-static {v1, v12}, Lyn0;->e0(Lh4;Ly07;)V

    .line 2358
    .line 2359
    .line 2360
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v4

    .line 2364
    sget-object v6, Lc17;->g:Le17;

    .line 2365
    .line 2366
    iget-object v4, v4, Lt07;->X:Ls05;

    .line 2367
    .line 2368
    invoke-virtual {v4, v6}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v4

    .line 2372
    if-nez v4, :cond_86

    .line 2373
    .line 2374
    move-object/from16 v4, p0

    .line 2375
    .line 2376
    :cond_86
    if-nez v4, :cond_91

    .line 2377
    .line 2378
    invoke-virtual {v12}, Ly07;->l()Ly07;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v4

    .line 2382
    if-nez v4, :cond_87

    .line 2383
    .line 2384
    goto/16 :goto_3c

    .line 2385
    .line 2386
    :cond_87
    invoke-virtual {v4}, Ly07;->k()Lt07;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v6

    .line 2390
    sget-object v7, Lc17;->e:Le17;

    .line 2391
    .line 2392
    iget-object v6, v6, Lt07;->X:Ls05;

    .line 2393
    .line 2394
    invoke-virtual {v6, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v6

    .line 2398
    if-nez v6, :cond_88

    .line 2399
    .line 2400
    move-object/from16 v6, p0

    .line 2401
    .line 2402
    :cond_88
    if-eqz v6, :cond_92

    .line 2403
    .line 2404
    invoke-virtual {v4}, Ly07;->k()Lt07;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v6

    .line 2408
    sget-object v7, Lc17;->f:Le17;

    .line 2409
    .line 2410
    iget-object v6, v6, Lt07;->X:Ls05;

    .line 2411
    .line 2412
    invoke-virtual {v6, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v6

    .line 2416
    if-nez v6, :cond_89

    .line 2417
    .line 2418
    move-object/from16 v6, p0

    .line 2419
    .line 2420
    :cond_89
    check-cast v6, Lsv0;

    .line 2421
    .line 2422
    if-eqz v6, :cond_8a

    .line 2423
    .line 2424
    iget v7, v6, Lsv0;->a:I

    .line 2425
    .line 2426
    if-ltz v7, :cond_92

    .line 2427
    .line 2428
    iget v6, v6, Lsv0;->b:I

    .line 2429
    .line 2430
    if-gez v6, :cond_8a

    .line 2431
    .line 2432
    goto/16 :goto_3c

    .line 2433
    .line 2434
    :cond_8a
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v6

    .line 2438
    sget-object v7, Lc17;->K:Le17;

    .line 2439
    .line 2440
    iget-object v6, v6, Lt07;->X:Ls05;

    .line 2441
    .line 2442
    invoke-virtual {v6, v7}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2443
    .line 2444
    .line 2445
    move-result v6

    .line 2446
    if-nez v6, :cond_8b

    .line 2447
    .line 2448
    goto/16 :goto_3c

    .line 2449
    .line 2450
    :cond_8b
    new-instance v6, Ljava/util/ArrayList;

    .line 2451
    .line 2452
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2453
    .line 2454
    .line 2455
    const/4 v10, 0x4

    .line 2456
    invoke-static {v10, v4}, Ly07;->j(ILy07;)Ljava/util/List;

    .line 2457
    .line 2458
    .line 2459
    move-result-object v4

    .line 2460
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 2461
    .line 2462
    .line 2463
    move-result v7

    .line 2464
    const/4 v8, 0x0

    .line 2465
    const/4 v10, 0x0

    .line 2466
    :goto_39
    if-ge v8, v7, :cond_8d

    .line 2467
    .line 2468
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v11

    .line 2472
    check-cast v11, Ly07;

    .line 2473
    .line 2474
    invoke-virtual {v11}, Ly07;->k()Lt07;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v13

    .line 2478
    sget-object v14, Lc17;->K:Le17;

    .line 2479
    .line 2480
    iget-object v13, v13, Lt07;->X:Ls05;

    .line 2481
    .line 2482
    invoke-virtual {v13, v14}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2483
    .line 2484
    .line 2485
    move-result v13

    .line 2486
    if-eqz v13, :cond_8c

    .line 2487
    .line 2488
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2489
    .line 2490
    .line 2491
    iget-object v11, v11, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 2492
    .line 2493
    invoke-virtual {v11}, Landroidx/compose/ui/node/LayoutNode;->x()I

    .line 2494
    .line 2495
    .line 2496
    move-result v11

    .line 2497
    iget-object v13, v12, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 2498
    .line 2499
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->x()I

    .line 2500
    .line 2501
    .line 2502
    move-result v13

    .line 2503
    if-ge v11, v13, :cond_8c

    .line 2504
    .line 2505
    add-int/lit8 v10, v10, 0x1

    .line 2506
    .line 2507
    :cond_8c
    add-int/lit8 v8, v8, 0x1

    .line 2508
    .line 2509
    goto :goto_39

    .line 2510
    :cond_8d
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2511
    .line 2512
    .line 2513
    move-result v4

    .line 2514
    if-nez v4, :cond_92

    .line 2515
    .line 2516
    invoke-static {v6}, Lyn0;->t(Ljava/util/ArrayList;)Z

    .line 2517
    .line 2518
    .line 2519
    move-result v4

    .line 2520
    if-eqz v4, :cond_8e

    .line 2521
    .line 2522
    const/4 v6, 0x0

    .line 2523
    goto :goto_3a

    .line 2524
    :cond_8e
    move v6, v10

    .line 2525
    :goto_3a
    if-eqz v4, :cond_8f

    .line 2526
    .line 2527
    goto :goto_3b

    .line 2528
    :cond_8f
    const/4 v10, 0x0

    .line 2529
    :goto_3b
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2530
    .line 2531
    .line 2532
    move-result-object v4

    .line 2533
    sget-object v7, Lc17;->K:Le17;

    .line 2534
    .line 2535
    iget-object v4, v4, Lt07;->X:Ls05;

    .line 2536
    .line 2537
    invoke-virtual {v4, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2538
    .line 2539
    .line 2540
    move-result-object v4

    .line 2541
    if-nez v4, :cond_90

    .line 2542
    .line 2543
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2544
    .line 2545
    :cond_90
    check-cast v4, Ljava/lang/Boolean;

    .line 2546
    .line 2547
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2548
    .line 2549
    .line 2550
    move-result v4

    .line 2551
    const/4 v13, 0x1

    .line 2552
    invoke-static {v6, v4, v13, v10, v13}, Lg4;->a(IZIII)Lg4;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v4

    .line 2556
    invoke-virtual {v1, v4}, Lh4;->o(Lg4;)V

    .line 2557
    .line 2558
    .line 2559
    goto :goto_3c

    .line 2560
    :cond_91
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 2561
    .line 2562
    .line 2563
    :cond_92
    :goto_3c
    sget-object v4, Lc17;->v:Le17;

    .line 2564
    .line 2565
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v4

    .line 2569
    check-cast v4, Ljx6;

    .line 2570
    .line 2571
    sget-object v6, Ls07;->d:Le17;

    .line 2572
    .line 2573
    invoke-static {v0, v6}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v6

    .line 2577
    check-cast v6, Lq3;

    .line 2578
    .line 2579
    const/4 v7, 0x0

    .line 2580
    if-eqz v4, :cond_9b

    .line 2581
    .line 2582
    if-eqz v6, :cond_9b

    .line 2583
    .line 2584
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v8

    .line 2588
    sget-object v10, Lc17;->f:Le17;

    .line 2589
    .line 2590
    iget-object v8, v8, Lt07;->X:Ls05;

    .line 2591
    .line 2592
    invoke-virtual {v8, v10}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v8

    .line 2596
    if-nez v8, :cond_93

    .line 2597
    .line 2598
    move-object/from16 v8, p0

    .line 2599
    .line 2600
    :cond_93
    if-nez v8, :cond_96

    .line 2601
    .line 2602
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v8

    .line 2606
    sget-object v10, Lc17;->e:Le17;

    .line 2607
    .line 2608
    iget-object v8, v8, Lt07;->X:Ls05;

    .line 2609
    .line 2610
    invoke-virtual {v8, v10}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2611
    .line 2612
    .line 2613
    move-result-object v8

    .line 2614
    if-nez v8, :cond_94

    .line 2615
    .line 2616
    move-object/from16 v8, p0

    .line 2617
    .line 2618
    :cond_94
    if-eqz v8, :cond_95

    .line 2619
    .line 2620
    goto :goto_3d

    .line 2621
    :cond_95
    const-string v8, "android.widget.HorizontalScrollView"

    .line 2622
    .line 2623
    invoke-virtual {v1, v8}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 2624
    .line 2625
    .line 2626
    :cond_96
    :goto_3d
    iget-object v8, v4, Ljx6;->b:Ldn2;

    .line 2627
    .line 2628
    invoke-interface {v8}, Ldn2;->invoke()Ljava/lang/Object;

    .line 2629
    .line 2630
    .line 2631
    move-result-object v8

    .line 2632
    check-cast v8, Ljava/lang/Number;

    .line 2633
    .line 2634
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 2635
    .line 2636
    .line 2637
    move-result v8

    .line 2638
    cmpl-float v8, v8, v7

    .line 2639
    .line 2640
    if-lez v8, :cond_97

    .line 2641
    .line 2642
    const/4 v10, 0x1

    .line 2643
    invoke-virtual {v1, v10}, Lh4;->u(Z)V

    .line 2644
    .line 2645
    .line 2646
    :cond_97
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 2647
    .line 2648
    .line 2649
    move-result v8

    .line 2650
    if-eqz v8, :cond_9b

    .line 2651
    .line 2652
    invoke-static {v4}, Lgc;->z(Ljx6;)Z

    .line 2653
    .line 2654
    .line 2655
    move-result v8

    .line 2656
    sget-object v10, Lz24;->Y:Lz24;

    .line 2657
    .line 2658
    if-eqz v8, :cond_99

    .line 2659
    .line 2660
    sget-object v8, La4;->j:La4;

    .line 2661
    .line 2662
    invoke-virtual {v1, v8}, Lh4;->b(La4;)V

    .line 2663
    .line 2664
    .line 2665
    move-object/from16 v8, v21

    .line 2666
    .line 2667
    iget-object v11, v8, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 2668
    .line 2669
    if-ne v11, v10, :cond_98

    .line 2670
    .line 2671
    sget-object v11, La4;->p:La4;

    .line 2672
    .line 2673
    goto :goto_3e

    .line 2674
    :cond_98
    sget-object v11, La4;->r:La4;

    .line 2675
    .line 2676
    :goto_3e
    invoke-virtual {v1, v11}, Lh4;->b(La4;)V

    .line 2677
    .line 2678
    .line 2679
    goto :goto_3f

    .line 2680
    :cond_99
    move-object/from16 v8, v21

    .line 2681
    .line 2682
    :goto_3f
    invoke-static {v4}, Lgc;->y(Ljx6;)Z

    .line 2683
    .line 2684
    .line 2685
    move-result v4

    .line 2686
    if-eqz v4, :cond_9b

    .line 2687
    .line 2688
    sget-object v4, La4;->k:La4;

    .line 2689
    .line 2690
    invoke-virtual {v1, v4}, Lh4;->b(La4;)V

    .line 2691
    .line 2692
    .line 2693
    iget-object v4, v8, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 2694
    .line 2695
    if-ne v4, v10, :cond_9a

    .line 2696
    .line 2697
    sget-object v4, La4;->r:La4;

    .line 2698
    .line 2699
    goto :goto_40

    .line 2700
    :cond_9a
    sget-object v4, La4;->p:La4;

    .line 2701
    .line 2702
    :goto_40
    invoke-virtual {v1, v4}, Lh4;->b(La4;)V

    .line 2703
    .line 2704
    .line 2705
    :cond_9b
    sget-object v4, Lc17;->w:Le17;

    .line 2706
    .line 2707
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v4

    .line 2711
    check-cast v4, Ljx6;

    .line 2712
    .line 2713
    if-eqz v4, :cond_a2

    .line 2714
    .line 2715
    if-eqz v6, :cond_a2

    .line 2716
    .line 2717
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v6

    .line 2721
    sget-object v8, Lc17;->f:Le17;

    .line 2722
    .line 2723
    iget-object v6, v6, Lt07;->X:Ls05;

    .line 2724
    .line 2725
    invoke-virtual {v6, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v6

    .line 2729
    if-nez v6, :cond_9c

    .line 2730
    .line 2731
    move-object/from16 v6, p0

    .line 2732
    .line 2733
    :cond_9c
    if-nez v6, :cond_9f

    .line 2734
    .line 2735
    invoke-virtual {v12}, Ly07;->k()Lt07;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v6

    .line 2739
    sget-object v8, Lc17;->e:Le17;

    .line 2740
    .line 2741
    iget-object v6, v6, Lt07;->X:Ls05;

    .line 2742
    .line 2743
    invoke-virtual {v6, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2744
    .line 2745
    .line 2746
    move-result-object v6

    .line 2747
    if-nez v6, :cond_9d

    .line 2748
    .line 2749
    move-object/from16 v6, p0

    .line 2750
    .line 2751
    :cond_9d
    if-eqz v6, :cond_9e

    .line 2752
    .line 2753
    goto :goto_41

    .line 2754
    :cond_9e
    const-string v6, "android.widget.ScrollView"

    .line 2755
    .line 2756
    invoke-virtual {v1, v6}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 2757
    .line 2758
    .line 2759
    :cond_9f
    :goto_41
    iget-object v6, v4, Ljx6;->b:Ldn2;

    .line 2760
    .line 2761
    invoke-interface {v6}, Ldn2;->invoke()Ljava/lang/Object;

    .line 2762
    .line 2763
    .line 2764
    move-result-object v6

    .line 2765
    check-cast v6, Ljava/lang/Number;

    .line 2766
    .line 2767
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 2768
    .line 2769
    .line 2770
    move-result v6

    .line 2771
    cmpl-float v6, v6, v7

    .line 2772
    .line 2773
    if-lez v6, :cond_a0

    .line 2774
    .line 2775
    const/4 v10, 0x1

    .line 2776
    invoke-virtual {v1, v10}, Lh4;->u(Z)V

    .line 2777
    .line 2778
    .line 2779
    :cond_a0
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 2780
    .line 2781
    .line 2782
    move-result v6

    .line 2783
    if-eqz v6, :cond_a2

    .line 2784
    .line 2785
    invoke-static {v4}, Lgc;->z(Ljx6;)Z

    .line 2786
    .line 2787
    .line 2788
    move-result v6

    .line 2789
    if-eqz v6, :cond_a1

    .line 2790
    .line 2791
    sget-object v6, La4;->j:La4;

    .line 2792
    .line 2793
    invoke-virtual {v1, v6}, Lh4;->b(La4;)V

    .line 2794
    .line 2795
    .line 2796
    sget-object v6, La4;->q:La4;

    .line 2797
    .line 2798
    invoke-virtual {v1, v6}, Lh4;->b(La4;)V

    .line 2799
    .line 2800
    .line 2801
    :cond_a1
    invoke-static {v4}, Lgc;->y(Ljx6;)Z

    .line 2802
    .line 2803
    .line 2804
    move-result v4

    .line 2805
    if-eqz v4, :cond_a2

    .line 2806
    .line 2807
    sget-object v4, La4;->k:La4;

    .line 2808
    .line 2809
    invoke-virtual {v1, v4}, Lh4;->b(La4;)V

    .line 2810
    .line 2811
    .line 2812
    sget-object v4, La4;->o:La4;

    .line 2813
    .line 2814
    invoke-virtual {v1, v4}, Lh4;->b(La4;)V

    .line 2815
    .line 2816
    .line 2817
    :cond_a2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2818
    .line 2819
    const/16 v6, 0x1d

    .line 2820
    .line 2821
    if-lt v4, v6, :cond_a3

    .line 2822
    .line 2823
    invoke-static {v1, v12}, Ldh3;->d(Lh4;Ly07;)V

    .line 2824
    .line 2825
    .line 2826
    :cond_a3
    sget-object v4, Lc17;->d:Le17;

    .line 2827
    .line 2828
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v4

    .line 2832
    check-cast v4, Ljava/lang/CharSequence;

    .line 2833
    .line 2834
    invoke-virtual {v1, v4}, Lh4;->s(Ljava/lang/CharSequence;)V

    .line 2835
    .line 2836
    .line 2837
    invoke-static {v12}, Lvr3;->t(Ly07;)Z

    .line 2838
    .line 2839
    .line 2840
    move-result v4

    .line 2841
    if-eqz v4, :cond_af

    .line 2842
    .line 2843
    sget-object v4, Ls07;->t:Le17;

    .line 2844
    .line 2845
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v4

    .line 2849
    check-cast v4, Lq3;

    .line 2850
    .line 2851
    if-eqz v4, :cond_a4

    .line 2852
    .line 2853
    new-instance v6, La4;

    .line 2854
    .line 2855
    const/high16 v7, 0x40000

    .line 2856
    .line 2857
    iget-object v4, v4, Lq3;->a:Ljava/lang/String;

    .line 2858
    .line 2859
    invoke-direct {v6, v7, v4}, La4;-><init>(ILjava/lang/String;)V

    .line 2860
    .line 2861
    .line 2862
    invoke-virtual {v1, v6}, Lh4;->b(La4;)V

    .line 2863
    .line 2864
    .line 2865
    :cond_a4
    sget-object v4, Ls07;->u:Le17;

    .line 2866
    .line 2867
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2868
    .line 2869
    .line 2870
    move-result-object v4

    .line 2871
    check-cast v4, Lq3;

    .line 2872
    .line 2873
    if-eqz v4, :cond_a5

    .line 2874
    .line 2875
    new-instance v6, La4;

    .line 2876
    .line 2877
    const/high16 v7, 0x80000

    .line 2878
    .line 2879
    iget-object v4, v4, Lq3;->a:Ljava/lang/String;

    .line 2880
    .line 2881
    invoke-direct {v6, v7, v4}, La4;-><init>(ILjava/lang/String;)V

    .line 2882
    .line 2883
    .line 2884
    invoke-virtual {v1, v6}, Lh4;->b(La4;)V

    .line 2885
    .line 2886
    .line 2887
    :cond_a5
    sget-object v4, Ls07;->v:Le17;

    .line 2888
    .line 2889
    invoke-static {v0, v4}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v4

    .line 2893
    check-cast v4, Lq3;

    .line 2894
    .line 2895
    if-eqz v4, :cond_a6

    .line 2896
    .line 2897
    new-instance v6, La4;

    .line 2898
    .line 2899
    const/high16 v7, 0x100000

    .line 2900
    .line 2901
    iget-object v4, v4, Lq3;->a:Ljava/lang/String;

    .line 2902
    .line 2903
    invoke-direct {v6, v7, v4}, La4;-><init>(ILjava/lang/String;)V

    .line 2904
    .line 2905
    .line 2906
    invoke-virtual {v1, v6}, Lh4;->b(La4;)V

    .line 2907
    .line 2908
    .line 2909
    :cond_a6
    sget-object v4, Ls07;->x:Le17;

    .line 2910
    .line 2911
    invoke-virtual {v2, v4}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2912
    .line 2913
    .line 2914
    move-result v2

    .line 2915
    if-eqz v2, :cond_af

    .line 2916
    .line 2917
    invoke-virtual {v0, v4}, Lt07;->c(Le17;)Ljava/lang/Object;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v2

    .line 2921
    check-cast v2, Ljava/util/List;

    .line 2922
    .line 2923
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2924
    .line 2925
    .line 2926
    move-result v4

    .line 2927
    sget-object v6, Lgc;->P0:Luz4;

    .line 2928
    .line 2929
    iget v7, v6, Luz4;->b:I

    .line 2930
    .line 2931
    if-ge v4, v7, :cond_ae

    .line 2932
    .line 2933
    new-instance v4, Lue7;

    .line 2934
    .line 2935
    const/4 v13, 0x0

    .line 2936
    invoke-direct {v4, v13}, Lue7;-><init>(I)V

    .line 2937
    .line 2938
    .line 2939
    invoke-static {}, Lg85;->a()Lf05;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v7

    .line 2943
    move-object/from16 v8, v20

    .line 2944
    .line 2945
    iget-object v10, v8, Lue7;->X:[I

    .line 2946
    .line 2947
    iget v11, v8, Lue7;->Z:I

    .line 2948
    .line 2949
    invoke-static {v11, v5, v10}, Lw45;->k(II[I)I

    .line 2950
    .line 2951
    .line 2952
    move-result v10

    .line 2953
    if-ltz v10, :cond_ac

    .line 2954
    .line 2955
    invoke-static {v8, v5}, Lx97;->t(Lue7;I)Ljava/lang/Object;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v10

    .line 2959
    check-cast v10, Lf05;

    .line 2960
    .line 2961
    const/16 v11, 0x10

    .line 2962
    .line 2963
    new-array v11, v11, [I

    .line 2964
    .line 2965
    iget-object v13, v6, Luz4;->a:[I

    .line 2966
    .line 2967
    iget v6, v6, Luz4;->b:I

    .line 2968
    .line 2969
    move-object/from16 v16, v10

    .line 2970
    .line 2971
    move-object v10, v11

    .line 2972
    const/4 v11, 0x0

    .line 2973
    const/4 v14, 0x0

    .line 2974
    :goto_42
    if-ge v11, v6, :cond_a8

    .line 2975
    .line 2976
    aget v17, v13, v11

    .line 2977
    .line 2978
    move/from16 v20, v6

    .line 2979
    .line 2980
    add-int/lit8 v6, v14, 0x1

    .line 2981
    .line 2982
    move/from16 v21, v11

    .line 2983
    .line 2984
    array-length v11, v10

    .line 2985
    if-ge v11, v6, :cond_a7

    .line 2986
    .line 2987
    array-length v11, v10

    .line 2988
    const/16 v23, 0x3

    .line 2989
    .line 2990
    mul-int/lit8 v11, v11, 0x3

    .line 2991
    .line 2992
    const/16 v18, 0x2

    .line 2993
    .line 2994
    div-int/lit8 v11, v11, 0x2

    .line 2995
    .line 2996
    invoke-static {v6, v11}, Ljava/lang/Math;->max(II)I

    .line 2997
    .line 2998
    .line 2999
    move-result v11

    .line 3000
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([II)[I

    .line 3001
    .line 3002
    .line 3003
    move-result-object v10

    .line 3004
    goto :goto_43

    .line 3005
    :cond_a7
    const/16 v18, 0x2

    .line 3006
    .line 3007
    const/16 v23, 0x3

    .line 3008
    .line 3009
    :goto_43
    aput v17, v10, v14

    .line 3010
    .line 3011
    add-int/lit8 v11, v21, 0x1

    .line 3012
    .line 3013
    move v14, v6

    .line 3014
    move/from16 v6, v20

    .line 3015
    .line 3016
    goto :goto_42

    .line 3017
    :cond_a8
    new-instance v6, Ljava/util/ArrayList;

    .line 3018
    .line 3019
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 3020
    .line 3021
    .line 3022
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 3023
    .line 3024
    .line 3025
    move-result v11

    .line 3026
    if-gtz v11, :cond_ab

    .line 3027
    .line 3028
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 3029
    .line 3030
    .line 3031
    move-result v2

    .line 3032
    if-gtz v2, :cond_a9

    .line 3033
    .line 3034
    goto :goto_44

    .line 3035
    :cond_a9
    const/4 v13, 0x0

    .line 3036
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3037
    .line 3038
    .line 3039
    move-result-object v0

    .line 3040
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 3041
    .line 3042
    .line 3043
    if-gtz v14, :cond_aa

    .line 3044
    .line 3045
    const-string v0, "Index must be between 0 and size"

    .line 3046
    .line 3047
    invoke-static {v0}, Lkp5;->k(Ljava/lang/String;)V

    .line 3048
    .line 3049
    .line 3050
    goto/16 :goto_c

    .line 3051
    .line 3052
    :cond_aa
    aget v0, v10, v13

    .line 3053
    .line 3054
    throw p0

    .line 3055
    :cond_ab
    const/4 v13, 0x0

    .line 3056
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v0

    .line 3060
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 3061
    .line 3062
    .line 3063
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3064
    .line 3065
    .line 3066
    throw p0

    .line 3067
    :cond_ac
    const/4 v13, 0x0

    .line 3068
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 3069
    .line 3070
    .line 3071
    move-result v10

    .line 3072
    if-gtz v10, :cond_ad

    .line 3073
    .line 3074
    :goto_44
    iget-object v2, v9, Lgc;->t0:Lue7;

    .line 3075
    .line 3076
    invoke-virtual {v2, v5, v4}, Lue7;->d(ILjava/lang/Object;)V

    .line 3077
    .line 3078
    .line 3079
    invoke-virtual {v8, v5, v7}, Lue7;->d(ILjava/lang/Object;)V

    .line 3080
    .line 3081
    .line 3082
    goto :goto_45

    .line 3083
    :cond_ad
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3084
    .line 3085
    .line 3086
    move-result-object v0

    .line 3087
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 3088
    .line 3089
    .line 3090
    invoke-virtual {v6, v13}, Luz4;->c(I)I

    .line 3091
    .line 3092
    .line 3093
    throw p0

    .line 3094
    :cond_ae
    const-string v0, "Can\'t have more than "

    .line 3095
    .line 3096
    const-string v1, " custom actions for one widget"

    .line 3097
    .line 3098
    invoke-static {v0, v7, v1}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 3099
    .line 3100
    .line 3101
    move-result-object v0

    .line 3102
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 3103
    .line 3104
    .line 3105
    goto/16 :goto_c

    .line 3106
    .line 3107
    :cond_af
    :goto_45
    invoke-static {v12, v15}, Lvr3;->L(Ly07;Landroid/content/res/Resources;)Z

    .line 3108
    .line 3109
    .line 3110
    move-result v2

    .line 3111
    invoke-virtual {v1, v2}, Lh4;->t(Z)V

    .line 3112
    .line 3113
    .line 3114
    iget-object v2, v9, Lgc;->D0:Ltz4;

    .line 3115
    .line 3116
    invoke-virtual {v2, v5}, Ltz4;->d(I)I

    .line 3117
    .line 3118
    .line 3119
    move-result v2

    .line 3120
    const/4 v10, -0x1

    .line 3121
    if-eq v2, v10, :cond_b0

    .line 3122
    .line 3123
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Lgi;

    .line 3124
    .line 3125
    .line 3126
    move-result-object v4

    .line 3127
    invoke-static {v4, v2}, Lgv3;->V(Lgi;I)V

    .line 3128
    .line 3129
    .line 3130
    move-object/from16 v4, v19

    .line 3131
    .line 3132
    invoke-virtual {v3, v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 3133
    .line 3134
    .line 3135
    iget-object v2, v9, Lgc;->F0:Ljava/lang/String;

    .line 3136
    .line 3137
    move-object/from16 v3, p0

    .line 3138
    .line 3139
    invoke-virtual {v9, v5, v1, v2, v3}, Lgc;->j(ILh4;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3140
    .line 3141
    .line 3142
    goto :goto_46

    .line 3143
    :cond_b0
    move-object/from16 v4, v19

    .line 3144
    .line 3145
    :goto_46
    iget-object v2, v9, Lgc;->E0:Ltz4;

    .line 3146
    .line 3147
    invoke-virtual {v2, v5}, Ltz4;->d(I)I

    .line 3148
    .line 3149
    .line 3150
    move-result v2

    .line 3151
    if-eq v2, v10, :cond_b1

    .line 3152
    .line 3153
    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Lgi;

    .line 3154
    .line 3155
    .line 3156
    move-result-object v3

    .line 3157
    invoke-static {v3, v2}, Lgv3;->V(Lgi;I)V

    .line 3158
    .line 3159
    .line 3160
    :cond_b1
    sget-object v2, Lkm4;->j:Le17;

    .line 3161
    .line 3162
    invoke-static {v0, v2}, Lg33;->x(Lt07;Le17;)Ljava/lang/Object;

    .line 3163
    .line 3164
    .line 3165
    move-result-object v0

    .line 3166
    check-cast v0, Ljava/lang/String;

    .line 3167
    .line 3168
    if-eqz v0, :cond_b2

    .line 3169
    .line 3170
    invoke-virtual {v1, v0}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 3171
    .line 3172
    .line 3173
    :cond_b2
    move-object v6, v1

    .line 3174
    :goto_47
    iget-boolean v0, v9, Lgc;->q0:Z

    .line 3175
    .line 3176
    if-eqz v0, :cond_b5

    .line 3177
    .line 3178
    iget v0, v9, Lgc;->m0:I

    .line 3179
    .line 3180
    if-ne v5, v0, :cond_b3

    .line 3181
    .line 3182
    iput-object v6, v9, Lgc;->o0:Lh4;

    .line 3183
    .line 3184
    :cond_b3
    iget v0, v9, Lgc;->n0:I

    .line 3185
    .line 3186
    if-ne v5, v0, :cond_b5

    .line 3187
    .line 3188
    iput-object v6, v9, Lgc;->p0:Lh4;

    .line 3189
    .line 3190
    goto :goto_48

    .line 3191
    :cond_b4
    move v5, v1

    .line 3192
    const/4 v3, 0x0

    .line 3193
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3194
    .line 3195
    const-string v1, "semanticsNode "

    .line 3196
    .line 3197
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3198
    .line 3199
    .line 3200
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3201
    .line 3202
    .line 3203
    const-string v1, " has null parent"

    .line 3204
    .line 3205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3206
    .line 3207
    .line 3208
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3209
    .line 3210
    .line 3211
    move-result-object v0

    .line 3212
    invoke-static {v0}, Lwc3;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 3213
    .line 3214
    .line 3215
    invoke-static {}, Lb61;->n()V

    .line 3216
    .line 3217
    .line 3218
    move-object v6, v3

    .line 3219
    :cond_b5
    :goto_48
    return-object v6

    .line 3220
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final N(I)Lh4;
    .locals 5

    .line 1
    iget-byte v0, p0, Lcc;->j0:B

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    iget-object v2, p0, Lcc;->k0:Lt3;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Lj62;

    .line 13
    .line 14
    if-ne p1, v3, :cond_0

    .line 15
    .line 16
    iget p1, v2, Lj62;->m0:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget p1, v2, Lj62;->n0:I

    .line 20
    .line 21
    :goto_0
    if-ne p1, v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcc;->L(I)Lh4;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :goto_1
    return-object v4

    .line 29
    :pswitch_0
    check-cast v2, Lgc;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-eq p1, v0, :cond_3

    .line 33
    .line 34
    if-ne p1, v3, :cond_2

    .line 35
    .line 36
    iget p1, v2, Lgc;->m0:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcc;->L(I)Lh4;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const-string p0, "Unknown focus type: "

    .line 44
    .line 45
    invoke-static {p1, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    iget p1, v2, Lgc;->n0:I

    .line 54
    .line 55
    if-ne p1, v1, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    invoke-virtual {p0, p1}, Lcc;->L(I)Lh4;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :goto_2
    return-object v4

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final S(IILandroid/os/Bundle;)Z
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-byte v4, v0, Lcc;->j0:B

    .line 10
    .line 11
    const v5, 0x8000

    .line 12
    .line 13
    .line 14
    const/16 v6, 0x80

    .line 15
    .line 16
    const/16 v7, 0x40

    .line 17
    .line 18
    const/4 v8, -0x1

    .line 19
    iget-object v0, v0, Lcc;->k0:Lt3;

    .line 20
    .line 21
    const/high16 v9, -0x80000000

    .line 22
    .line 23
    const/high16 v10, 0x10000

    .line 24
    .line 25
    const/4 v11, 0x2

    .line 26
    const/4 v12, 0x1

    .line 27
    packed-switch v4, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v0, Lj62;

    .line 31
    .line 32
    iget-object v4, v0, Lj62;->k0:Landroid/view/View;

    .line 33
    .line 34
    if-eq v1, v8, :cond_7

    .line 35
    .line 36
    if-eq v2, v12, :cond_6

    .line 37
    .line 38
    if-eq v2, v11, :cond_5

    .line 39
    .line 40
    if-eq v2, v7, :cond_2

    .line 41
    .line 42
    if-eq v2, v6, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2, v3}, Lj62;->r(IILandroid/os/Bundle;)Z

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    iget v2, v0, Lj62;->m0:I

    .line 50
    .line 51
    if-ne v2, v1, :cond_1

    .line 52
    .line 53
    iput v9, v0, Lj62;->m0:I

    .line 54
    .line 55
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v10}, Lj62;->w(II)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    const/4 v12, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget-object v2, v0, Lj62;->j0:Landroid/view/accessibility/AccessibilityManager;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget v2, v0, Lj62;->m0:I

    .line 80
    .line 81
    if-eq v2, v1, :cond_1

    .line 82
    .line 83
    if-eq v2, v9, :cond_4

    .line 84
    .line 85
    iput v9, v0, Lj62;->m0:I

    .line 86
    .line 87
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2, v10}, Lj62;->w(II)V

    .line 91
    .line 92
    .line 93
    :cond_4
    iput v1, v0, Lj62;->m0:I

    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1, v5}, Lj62;->w(II)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {v0, v1}, Lj62;->j(I)Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    goto :goto_1

    .line 107
    :cond_6
    invoke-virtual {v0, v1}, Lj62;->v(I)Z

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    goto :goto_1

    .line 112
    :cond_7
    invoke-virtual {v4, v2, v3}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    :goto_1
    return v12

    .line 117
    :pswitch_0
    check-cast v0, Lgc;

    .line 118
    .line 119
    iget-object v4, v0, Lgc;->i0:Landroid/view/accessibility/AccessibilityManager;

    .line 120
    .line 121
    const/4 v14, 0x0

    .line 122
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    move/from16 p0, v14

    .line 127
    .line 128
    iget-object v14, v0, Lgc;->f0:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 129
    .line 130
    invoke-virtual {v0}, Lgc;->s()Lff3;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v5, v1}, Lff3;->b(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, La17;

    .line 139
    .line 140
    if-eqz v5, :cond_8

    .line 141
    .line 142
    iget-object v5, v5, La17;->a:Ly07;

    .line 143
    .line 144
    if-nez v5, :cond_9

    .line 145
    .line 146
    :cond_8
    :goto_2
    const/16 v20, 0x0

    .line 147
    .line 148
    goto/16 :goto_4d

    .line 149
    .line 150
    :cond_9
    iget-object v10, v5, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 151
    .line 152
    iget v9, v5, Ly07;->f:I

    .line 153
    .line 154
    iget-object v8, v5, Ly07;->d:Lt07;

    .line 155
    .line 156
    iget-object v13, v8, Lt07;->X:Ls05;

    .line 157
    .line 158
    sget-object v11, Lc17;->o:Le17;

    .line 159
    .line 160
    invoke-virtual {v13, v11}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    if-nez v11, :cond_a

    .line 165
    .line 166
    const/4 v11, 0x0

    .line 167
    :cond_a
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 168
    .line 169
    invoke-static {v11, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    if-eqz v11, :cond_c

    .line 174
    .line 175
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 176
    .line 177
    const/16 v6, 0x22

    .line 178
    .line 179
    if-lt v11, v6, :cond_b

    .line 180
    .line 181
    invoke-static {v4}, Lu3;->u(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    goto :goto_3

    .line 186
    :cond_b
    const/4 v6, 0x1

    .line 187
    :goto_3
    if-nez v6, :cond_c

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_c
    const/16 v6, 0xc

    .line 191
    .line 192
    if-eq v2, v7, :cond_90

    .line 193
    .line 194
    const/16 v7, 0x80

    .line 195
    .line 196
    if-eq v2, v7, :cond_8e

    .line 197
    .line 198
    const/16 v4, 0x8

    .line 199
    .line 200
    const/16 v7, 0x200

    .line 201
    .line 202
    const/16 v11, 0x100

    .line 203
    .line 204
    if-eq v2, v11, :cond_70

    .line 205
    .line 206
    if-eq v2, v7, :cond_70

    .line 207
    .line 208
    const/16 v7, 0x4000

    .line 209
    .line 210
    if-eq v2, v7, :cond_6e

    .line 211
    .line 212
    const/high16 v7, 0x20000

    .line 213
    .line 214
    if-eq v2, v7, :cond_6b

    .line 215
    .line 216
    invoke-static {v5}, Lvr3;->t(Ly07;)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-nez v7, :cond_d

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_d
    const/4 v7, 0x1

    .line 224
    if-eq v2, v7, :cond_68

    .line 225
    .line 226
    const/4 v7, 0x2

    .line 227
    if-eq v2, v7, :cond_66

    .line 228
    .line 229
    sget-object v4, Lz24;->Y:Lz24;

    .line 230
    .line 231
    sparse-switch v2, :sswitch_data_0

    .line 232
    .line 233
    .line 234
    packed-switch v2, :pswitch_data_1

    .line 235
    .line 236
    .line 237
    packed-switch v2, :pswitch_data_2

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, Lgc;->t0:Lue7;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {v0, v1}, Lx97;->t(Lue7;I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Lue7;

    .line 250
    .line 251
    if-eqz v0, :cond_8

    .line 252
    .line 253
    invoke-static {v0, v2}, Lx97;->t(Lue7;I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Ljava/lang/CharSequence;

    .line 258
    .line 259
    if-nez v0, :cond_e

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_e
    sget-object v0, Ls07;->x:Le17;

    .line 263
    .line 264
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-nez v0, :cond_f

    .line 269
    .line 270
    const/4 v12, 0x0

    .line 271
    goto :goto_4

    .line 272
    :cond_f
    move-object v12, v0

    .line 273
    :goto_4
    check-cast v12, Ljava/util/List;

    .line 274
    .line 275
    if-nez v12, :cond_10

    .line 276
    .line 277
    goto/16 :goto_2

    .line 278
    .line 279
    :cond_10
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-gtz v0, :cond_11

    .line 284
    .line 285
    goto/16 :goto_2

    .line 286
    .line 287
    :cond_11
    const/4 v0, 0x0

    .line 288
    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 296
    .line 297
    .line 298
    const/4 v12, 0x0

    .line 299
    goto/16 :goto_4e

    .line 300
    .line 301
    :pswitch_1
    sget-object v0, Ls07;->B:Le17;

    .line 302
    .line 303
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-nez v0, :cond_12

    .line 308
    .line 309
    const/4 v12, 0x0

    .line 310
    goto :goto_5

    .line 311
    :cond_12
    move-object v12, v0

    .line 312
    :goto_5
    check-cast v12, Lq3;

    .line 313
    .line 314
    if-eqz v12, :cond_8

    .line 315
    .line 316
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 317
    .line 318
    check-cast v0, Ldn2;

    .line 319
    .line 320
    if-eqz v0, :cond_8

    .line 321
    .line 322
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    goto/16 :goto_4e

    .line 333
    .line 334
    :pswitch_2
    sget-object v0, Ls07;->z:Le17;

    .line 335
    .line 336
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-nez v0, :cond_13

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    goto :goto_6

    .line 344
    :cond_13
    move-object v12, v0

    .line 345
    :goto_6
    check-cast v12, Lq3;

    .line 346
    .line 347
    if-eqz v12, :cond_8

    .line 348
    .line 349
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 350
    .line 351
    check-cast v0, Ldn2;

    .line 352
    .line 353
    if-eqz v0, :cond_8

    .line 354
    .line 355
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Ljava/lang/Boolean;

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 362
    .line 363
    .line 364
    move-result v12

    .line 365
    goto/16 :goto_4e

    .line 366
    .line 367
    :pswitch_3
    sget-object v0, Ls07;->A:Le17;

    .line 368
    .line 369
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-nez v0, :cond_14

    .line 374
    .line 375
    const/4 v12, 0x0

    .line 376
    goto :goto_7

    .line 377
    :cond_14
    move-object v12, v0

    .line 378
    :goto_7
    check-cast v12, Lq3;

    .line 379
    .line 380
    if-eqz v12, :cond_8

    .line 381
    .line 382
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 383
    .line 384
    check-cast v0, Ldn2;

    .line 385
    .line 386
    if-eqz v0, :cond_8

    .line 387
    .line 388
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    check-cast v0, Ljava/lang/Boolean;

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 395
    .line 396
    .line 397
    move-result v12

    .line 398
    goto/16 :goto_4e

    .line 399
    .line 400
    :pswitch_4
    sget-object v0, Ls07;->y:Le17;

    .line 401
    .line 402
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    if-nez v0, :cond_15

    .line 407
    .line 408
    const/4 v12, 0x0

    .line 409
    goto :goto_8

    .line 410
    :cond_15
    move-object v12, v0

    .line 411
    :goto_8
    check-cast v12, Lq3;

    .line 412
    .line 413
    if-eqz v12, :cond_8

    .line 414
    .line 415
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 416
    .line 417
    check-cast v0, Ldn2;

    .line 418
    .line 419
    if-eqz v0, :cond_8

    .line 420
    .line 421
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    check-cast v0, Ljava/lang/Boolean;

    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    goto/16 :goto_4e

    .line 432
    .line 433
    :pswitch_5
    :sswitch_0
    const/16 v16, 0x20

    .line 434
    .line 435
    const-wide v17, 0xffffffffL

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    goto/16 :goto_1f

    .line 441
    .line 442
    :sswitch_1
    sget-object v0, Ls07;->p:Le17;

    .line 443
    .line 444
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-nez v0, :cond_16

    .line 449
    .line 450
    const/4 v12, 0x0

    .line 451
    goto :goto_9

    .line 452
    :cond_16
    move-object v12, v0

    .line 453
    :goto_9
    check-cast v12, Lq3;

    .line 454
    .line 455
    if-eqz v12, :cond_8

    .line 456
    .line 457
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 458
    .line 459
    check-cast v0, Ldn2;

    .line 460
    .line 461
    if-eqz v0, :cond_8

    .line 462
    .line 463
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, Ljava/lang/Boolean;

    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 470
    .line 471
    .line 472
    move-result v12

    .line 473
    goto/16 :goto_4e

    .line 474
    .line 475
    :sswitch_2
    if-eqz v3, :cond_8

    .line 476
    .line 477
    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 478
    .line 479
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-nez v1, :cond_17

    .line 484
    .line 485
    goto/16 :goto_2

    .line 486
    .line 487
    :cond_17
    sget-object v1, Ls07;->i:Le17;

    .line 488
    .line 489
    invoke-virtual {v13, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    if-nez v1, :cond_18

    .line 494
    .line 495
    const/4 v12, 0x0

    .line 496
    goto :goto_a

    .line 497
    :cond_18
    move-object v12, v1

    .line 498
    :goto_a
    check-cast v12, Lq3;

    .line 499
    .line 500
    if-eqz v12, :cond_8

    .line 501
    .line 502
    iget-object v1, v12, Lq3;->b:Lon2;

    .line 503
    .line 504
    check-cast v1, Lgn2;

    .line 505
    .line 506
    if-eqz v1, :cond_8

    .line 507
    .line 508
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-interface {v1, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, Ljava/lang/Boolean;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 523
    .line 524
    .line 525
    move-result v12

    .line 526
    goto/16 :goto_4e

    .line 527
    .line 528
    :sswitch_3
    invoke-virtual {v5}, Ly07;->l()Ly07;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    if-eqz v0, :cond_1a

    .line 533
    .line 534
    iget-object v1, v0, Ly07;->d:Lt07;

    .line 535
    .line 536
    sget-object v2, Ls07;->d:Le17;

    .line 537
    .line 538
    iget-object v1, v1, Lt07;->X:Ls05;

    .line 539
    .line 540
    invoke-virtual {v1, v2}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    if-nez v1, :cond_19

    .line 545
    .line 546
    const/4 v1, 0x0

    .line 547
    :cond_19
    check-cast v1, Lq3;

    .line 548
    .line 549
    goto :goto_b

    .line 550
    :cond_1a
    const/4 v1, 0x0

    .line 551
    :goto_b
    if-nez v1, :cond_1c

    .line 552
    .line 553
    if-eqz v0, :cond_1c

    .line 554
    .line 555
    invoke-virtual {v0}, Ly07;->l()Ly07;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    if-eqz v0, :cond_1a

    .line 560
    .line 561
    iget-object v1, v0, Ly07;->d:Lt07;

    .line 562
    .line 563
    sget-object v2, Ls07;->d:Le17;

    .line 564
    .line 565
    iget-object v1, v1, Lt07;->X:Ls05;

    .line 566
    .line 567
    invoke-virtual {v1, v2}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    if-nez v1, :cond_1b

    .line 572
    .line 573
    const/4 v1, 0x0

    .line 574
    :cond_1b
    check-cast v1, Lq3;

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_1c
    if-nez v0, :cond_1d

    .line 578
    .line 579
    invoke-virtual {v5}, Ly07;->g()Ls86;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    new-instance v1, Landroid/graphics/Rect;

    .line 584
    .line 585
    iget v2, v0, Ls86;->a:F

    .line 586
    .line 587
    float-to-double v2, v2

    .line 588
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 589
    .line 590
    .line 591
    move-result-wide v2

    .line 592
    double-to-float v2, v2

    .line 593
    float-to-int v2, v2

    .line 594
    iget v3, v0, Ls86;->b:F

    .line 595
    .line 596
    float-to-double v3, v3

    .line 597
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 598
    .line 599
    .line 600
    move-result-wide v3

    .line 601
    double-to-float v3, v3

    .line 602
    float-to-int v3, v3

    .line 603
    iget v4, v0, Ls86;->c:F

    .line 604
    .line 605
    float-to-double v4, v4

    .line 606
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 607
    .line 608
    .line 609
    move-result-wide v4

    .line 610
    double-to-float v4, v4

    .line 611
    invoke-static {v4}, Lnr4;->O(F)I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    iget v0, v0, Ls86;->d:F

    .line 616
    .line 617
    float-to-double v5, v0

    .line 618
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 619
    .line 620
    .line 621
    move-result-wide v5

    .line 622
    double-to-float v0, v5

    .line 623
    invoke-static {v0}, Lnr4;->O(F)I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v14, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 631
    .line 632
    .line 633
    move-result v12

    .line 634
    goto/16 :goto_4e

    .line 635
    .line 636
    :cond_1d
    const-wide/16 v1, 0x0

    .line 637
    .line 638
    move-wide v11, v1

    .line 639
    const/4 v3, 0x0

    .line 640
    :goto_c
    if-eqz v0, :cond_2e

    .line 641
    .line 642
    iget-object v6, v0, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 643
    .line 644
    iget-object v13, v0, Ly07;->d:Lt07;

    .line 645
    .line 646
    iget-object v13, v13, Lt07;->X:Ls05;

    .line 647
    .line 648
    sget-object v14, Ls07;->d:Le17;

    .line 649
    .line 650
    invoke-virtual {v13, v14}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v14

    .line 654
    if-nez v14, :cond_1e

    .line 655
    .line 656
    const/4 v14, 0x0

    .line 657
    :cond_1e
    check-cast v14, Lq3;

    .line 658
    .line 659
    if-eqz v14, :cond_2d

    .line 660
    .line 661
    iget-object v15, v6, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 662
    .line 663
    iget-object v15, v15, Lt6;->f0:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v15, Lfd3;

    .line 666
    .line 667
    invoke-static {v15}, Ljm4;->q(Ly24;)Ls86;

    .line 668
    .line 669
    .line 670
    move-result-object v15

    .line 671
    iget-object v6, v6, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 672
    .line 673
    iget-object v6, v6, Lt6;->f0:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v6, Lfd3;

    .line 676
    .line 677
    invoke-virtual {v6}, Li55;->y()Ly24;

    .line 678
    .line 679
    .line 680
    move-result-object v6

    .line 681
    if-eqz v6, :cond_1f

    .line 682
    .line 683
    check-cast v6, Li55;

    .line 684
    .line 685
    invoke-virtual {v6, v1, v2}, Li55;->I(J)J

    .line 686
    .line 687
    .line 688
    move-result-wide v16

    .line 689
    move-wide/from16 v7, v16

    .line 690
    .line 691
    :goto_d
    const/16 v16, 0x20

    .line 692
    .line 693
    const-wide v17, 0xffffffffL

    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    goto :goto_e

    .line 699
    :cond_1f
    move-wide v7, v1

    .line 700
    goto :goto_d

    .line 701
    :goto_e
    invoke-virtual {v15, v7, v8}, Ls86;->k(J)Ls86;

    .line 702
    .line 703
    .line 704
    move-result-object v6

    .line 705
    invoke-virtual {v5}, Ly07;->d()Li55;

    .line 706
    .line 707
    .line 708
    move-result-object v7

    .line 709
    if-eqz v7, :cond_21

    .line 710
    .line 711
    invoke-virtual {v7}, Li55;->V0()Ljx4;

    .line 712
    .line 713
    .line 714
    move-result-object v8

    .line 715
    iget-boolean v8, v8, Ljx4;->p0:Z

    .line 716
    .line 717
    if-eqz v8, :cond_20

    .line 718
    .line 719
    goto :goto_f

    .line 720
    :cond_20
    const/4 v7, 0x0

    .line 721
    :goto_f
    if-eqz v7, :cond_21

    .line 722
    .line 723
    invoke-virtual {v7, v1, v2}, Li55;->I(J)J

    .line 724
    .line 725
    .line 726
    move-result-wide v7

    .line 727
    goto :goto_10

    .line 728
    :cond_21
    move-wide v7, v1

    .line 729
    :goto_10
    invoke-static {v7, v8, v11, v12}, Lz85;->f(JJ)J

    .line 730
    .line 731
    .line 732
    move-result-wide v7

    .line 733
    invoke-virtual {v5}, Ly07;->d()Li55;

    .line 734
    .line 735
    .line 736
    move-result-object v9

    .line 737
    if-eqz v9, :cond_22

    .line 738
    .line 739
    iget-wide v1, v9, Leo5;->Z:J

    .line 740
    .line 741
    goto :goto_11

    .line 742
    :cond_22
    const-wide/16 v1, 0x0

    .line 743
    .line 744
    :goto_11
    invoke-static {v1, v2}, Lu15;->R(J)J

    .line 745
    .line 746
    .line 747
    move-result-wide v1

    .line 748
    invoke-static {v7, v8, v1, v2}, Lu70;->n(JJ)Ls86;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    iget v2, v1, Ls86;->a:F

    .line 753
    .line 754
    iget v7, v6, Ls86;->a:F

    .line 755
    .line 756
    sub-float/2addr v2, v7

    .line 757
    iget v7, v1, Ls86;->c:F

    .line 758
    .line 759
    iget v8, v6, Ls86;->c:F

    .line 760
    .line 761
    sub-float/2addr v7, v8

    .line 762
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 763
    .line 764
    .line 765
    move-result v8

    .line 766
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 767
    .line 768
    .line 769
    move-result v9

    .line 770
    cmpg-float v8, v8, v9

    .line 771
    .line 772
    if-nez v8, :cond_24

    .line 773
    .line 774
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 775
    .line 776
    .line 777
    move-result v8

    .line 778
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 779
    .line 780
    .line 781
    move-result v9

    .line 782
    cmpg-float v8, v8, v9

    .line 783
    .line 784
    if-gez v8, :cond_23

    .line 785
    .line 786
    goto :goto_12

    .line 787
    :cond_23
    move v2, v7

    .line 788
    goto :goto_12

    .line 789
    :cond_24
    move/from16 v2, p0

    .line 790
    .line 791
    :goto_12
    iget v7, v1, Ls86;->b:F

    .line 792
    .line 793
    iget v8, v6, Ls86;->b:F

    .line 794
    .line 795
    sub-float/2addr v7, v8

    .line 796
    iget v1, v1, Ls86;->d:F

    .line 797
    .line 798
    iget v6, v6, Ls86;->d:F

    .line 799
    .line 800
    sub-float/2addr v1, v6

    .line 801
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 806
    .line 807
    .line 808
    move-result v8

    .line 809
    cmpg-float v6, v6, v8

    .line 810
    .line 811
    if-nez v6, :cond_26

    .line 812
    .line 813
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 814
    .line 815
    .line 816
    move-result v6

    .line 817
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 818
    .line 819
    .line 820
    move-result v8

    .line 821
    cmpg-float v6, v6, v8

    .line 822
    .line 823
    if-gez v6, :cond_25

    .line 824
    .line 825
    goto :goto_13

    .line 826
    :cond_25
    move v7, v1

    .line 827
    goto :goto_13

    .line 828
    :cond_26
    move/from16 v7, p0

    .line 829
    .line 830
    :goto_13
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    int-to-long v1, v1

    .line 835
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 836
    .line 837
    .line 838
    move-result v6

    .line 839
    int-to-long v6, v6

    .line 840
    shl-long v1, v1, v16

    .line 841
    .line 842
    and-long v6, v6, v17

    .line 843
    .line 844
    or-long/2addr v1, v6

    .line 845
    const-wide/16 v6, 0x0

    .line 846
    .line 847
    invoke-static {v1, v2, v6, v7}, Lz85;->b(JJ)Z

    .line 848
    .line 849
    .line 850
    move-result v8

    .line 851
    if-eqz v8, :cond_27

    .line 852
    .line 853
    move-wide v6, v1

    .line 854
    goto :goto_14

    .line 855
    :cond_27
    shr-long v8, v1, v16

    .line 856
    .line 857
    long-to-int v8, v8

    .line 858
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 859
    .line 860
    .line 861
    move-result v8

    .line 862
    and-long v6, v1, v17

    .line 863
    .line 864
    long-to-int v6, v6

    .line 865
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 866
    .line 867
    .line 868
    move-result v6

    .line 869
    sget-object v7, Lc17;->v:Le17;

    .line 870
    .line 871
    invoke-virtual {v13, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v7

    .line 875
    if-nez v7, :cond_28

    .line 876
    .line 877
    const/4 v7, 0x0

    .line 878
    :cond_28
    check-cast v7, Ljx6;

    .line 879
    .line 880
    iget-object v7, v10, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 881
    .line 882
    if-ne v7, v4, :cond_29

    .line 883
    .line 884
    neg-float v8, v8

    .line 885
    :cond_29
    sget-object v7, Lc17;->w:Le17;

    .line 886
    .line 887
    invoke-virtual {v13, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v7

    .line 891
    if-nez v7, :cond_2a

    .line 892
    .line 893
    const/4 v7, 0x0

    .line 894
    :cond_2a
    check-cast v7, Ljx6;

    .line 895
    .line 896
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    int-to-long v7, v7

    .line 901
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 902
    .line 903
    .line 904
    move-result v6

    .line 905
    move-wide/from16 v23, v7

    .line 906
    .line 907
    int-to-long v6, v6

    .line 908
    shl-long v8, v23, v16

    .line 909
    .line 910
    and-long v6, v6, v17

    .line 911
    .line 912
    or-long/2addr v6, v8

    .line 913
    :goto_14
    iget-object v8, v14, Lq3;->b:Lon2;

    .line 914
    .line 915
    check-cast v8, Lrn2;

    .line 916
    .line 917
    if-eqz v8, :cond_2b

    .line 918
    .line 919
    shr-long v13, v6, v16

    .line 920
    .line 921
    long-to-int v9, v13

    .line 922
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 923
    .line 924
    .line 925
    move-result v9

    .line 926
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    and-long v6, v6, v17

    .line 931
    .line 932
    long-to-int v6, v6

    .line 933
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 934
    .line 935
    .line 936
    move-result v6

    .line 937
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 938
    .line 939
    .line 940
    move-result-object v6

    .line 941
    invoke-interface {v8, v9, v6}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v6

    .line 945
    check-cast v6, Ljava/lang/Boolean;

    .line 946
    .line 947
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    const/4 v7, 0x1

    .line 952
    if-ne v6, v7, :cond_2b

    .line 953
    .line 954
    goto :goto_15

    .line 955
    :cond_2b
    if-eqz v3, :cond_2c

    .line 956
    .line 957
    :goto_15
    const/4 v3, 0x1

    .line 958
    goto :goto_16

    .line 959
    :cond_2c
    const/4 v3, 0x0

    .line 960
    :goto_16
    invoke-static {v11, v12, v1, v2}, Lz85;->e(JJ)J

    .line 961
    .line 962
    .line 963
    move-result-wide v11

    .line 964
    goto :goto_17

    .line 965
    :cond_2d
    const/16 v16, 0x20

    .line 966
    .line 967
    const-wide v17, 0xffffffffL

    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    :goto_17
    invoke-virtual {v0}, Ly07;->l()Ly07;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    const-wide/16 v1, 0x0

    .line 977
    .line 978
    goto/16 :goto_c

    .line 979
    .line 980
    :cond_2e
    move v12, v3

    .line 981
    goto/16 :goto_4e

    .line 982
    .line 983
    :sswitch_4
    if-eqz v3, :cond_2f

    .line 984
    .line 985
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 986
    .line 987
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    goto :goto_18

    .line 992
    :cond_2f
    const/4 v0, 0x0

    .line 993
    :goto_18
    sget-object v1, Ls07;->k:Le17;

    .line 994
    .line 995
    invoke-virtual {v13, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    if-nez v1, :cond_30

    .line 1000
    .line 1001
    const/4 v12, 0x0

    .line 1002
    goto :goto_19

    .line 1003
    :cond_30
    move-object v12, v1

    .line 1004
    :goto_19
    check-cast v12, Lq3;

    .line 1005
    .line 1006
    if-eqz v12, :cond_8

    .line 1007
    .line 1008
    iget-object v1, v12, Lq3;->b:Lon2;

    .line 1009
    .line 1010
    check-cast v1, Lgn2;

    .line 1011
    .line 1012
    if-eqz v1, :cond_8

    .line 1013
    .line 1014
    new-instance v2, Lql;

    .line 1015
    .line 1016
    if-nez v0, :cond_31

    .line 1017
    .line 1018
    const-string v0, ""

    .line 1019
    .line 1020
    :cond_31
    invoke-direct {v2, v0}, Lql;-><init>(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-interface {v1, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    check-cast v0, Ljava/lang/Boolean;

    .line 1028
    .line 1029
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v12

    .line 1033
    goto/16 :goto_4e

    .line 1034
    .line 1035
    :sswitch_5
    sget-object v0, Ls07;->v:Le17;

    .line 1036
    .line 1037
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    if-nez v0, :cond_32

    .line 1042
    .line 1043
    const/4 v12, 0x0

    .line 1044
    goto :goto_1a

    .line 1045
    :cond_32
    move-object v12, v0

    .line 1046
    :goto_1a
    check-cast v12, Lq3;

    .line 1047
    .line 1048
    if-eqz v12, :cond_8

    .line 1049
    .line 1050
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1051
    .line 1052
    check-cast v0, Ldn2;

    .line 1053
    .line 1054
    if-eqz v0, :cond_8

    .line 1055
    .line 1056
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    check-cast v0, Ljava/lang/Boolean;

    .line 1061
    .line 1062
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1063
    .line 1064
    .line 1065
    move-result v12

    .line 1066
    goto/16 :goto_4e

    .line 1067
    .line 1068
    :sswitch_6
    sget-object v0, Ls07;->u:Le17;

    .line 1069
    .line 1070
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    if-nez v0, :cond_33

    .line 1075
    .line 1076
    const/4 v12, 0x0

    .line 1077
    goto :goto_1b

    .line 1078
    :cond_33
    move-object v12, v0

    .line 1079
    :goto_1b
    check-cast v12, Lq3;

    .line 1080
    .line 1081
    if-eqz v12, :cond_8

    .line 1082
    .line 1083
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1084
    .line 1085
    check-cast v0, Ldn2;

    .line 1086
    .line 1087
    if-eqz v0, :cond_8

    .line 1088
    .line 1089
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    check-cast v0, Ljava/lang/Boolean;

    .line 1094
    .line 1095
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1096
    .line 1097
    .line 1098
    move-result v12

    .line 1099
    goto/16 :goto_4e

    .line 1100
    .line 1101
    :sswitch_7
    sget-object v0, Ls07;->t:Le17;

    .line 1102
    .line 1103
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    if-nez v0, :cond_34

    .line 1108
    .line 1109
    const/4 v12, 0x0

    .line 1110
    goto :goto_1c

    .line 1111
    :cond_34
    move-object v12, v0

    .line 1112
    :goto_1c
    check-cast v12, Lq3;

    .line 1113
    .line 1114
    if-eqz v12, :cond_8

    .line 1115
    .line 1116
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1117
    .line 1118
    check-cast v0, Ldn2;

    .line 1119
    .line 1120
    if-eqz v0, :cond_8

    .line 1121
    .line 1122
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    check-cast v0, Ljava/lang/Boolean;

    .line 1127
    .line 1128
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1129
    .line 1130
    .line 1131
    move-result v12

    .line 1132
    goto/16 :goto_4e

    .line 1133
    .line 1134
    :sswitch_8
    sget-object v0, Ls07;->r:Le17;

    .line 1135
    .line 1136
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    if-nez v0, :cond_35

    .line 1141
    .line 1142
    const/4 v12, 0x0

    .line 1143
    goto :goto_1d

    .line 1144
    :cond_35
    move-object v12, v0

    .line 1145
    :goto_1d
    check-cast v12, Lq3;

    .line 1146
    .line 1147
    if-eqz v12, :cond_8

    .line 1148
    .line 1149
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1150
    .line 1151
    check-cast v0, Ldn2;

    .line 1152
    .line 1153
    if-eqz v0, :cond_8

    .line 1154
    .line 1155
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    check-cast v0, Ljava/lang/Boolean;

    .line 1160
    .line 1161
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v12

    .line 1165
    goto/16 :goto_4e

    .line 1166
    .line 1167
    :sswitch_9
    sget-object v0, Ls07;->s:Le17;

    .line 1168
    .line 1169
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    if-nez v0, :cond_36

    .line 1174
    .line 1175
    const/4 v12, 0x0

    .line 1176
    goto :goto_1e

    .line 1177
    :cond_36
    move-object v12, v0

    .line 1178
    :goto_1e
    check-cast v12, Lq3;

    .line 1179
    .line 1180
    if-eqz v12, :cond_8

    .line 1181
    .line 1182
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1183
    .line 1184
    check-cast v0, Ldn2;

    .line 1185
    .line 1186
    if-eqz v0, :cond_8

    .line 1187
    .line 1188
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    check-cast v0, Ljava/lang/Boolean;

    .line 1193
    .line 1194
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1195
    .line 1196
    .line 1197
    move-result v12

    .line 1198
    goto/16 :goto_4e

    .line 1199
    .line 1200
    :goto_1f
    const/16 v0, 0x1000

    .line 1201
    .line 1202
    if-ne v2, v0, :cond_37

    .line 1203
    .line 1204
    const/4 v0, 0x1

    .line 1205
    goto :goto_20

    .line 1206
    :cond_37
    const/4 v0, 0x0

    .line 1207
    :goto_20
    const/16 v1, 0x2000

    .line 1208
    .line 1209
    if-ne v2, v1, :cond_38

    .line 1210
    .line 1211
    const/4 v1, 0x1

    .line 1212
    goto :goto_21

    .line 1213
    :cond_38
    const/4 v1, 0x0

    .line 1214
    :goto_21
    const v3, 0x1020039

    .line 1215
    .line 1216
    .line 1217
    if-ne v2, v3, :cond_39

    .line 1218
    .line 1219
    const/4 v3, 0x1

    .line 1220
    goto :goto_22

    .line 1221
    :cond_39
    const/4 v3, 0x0

    .line 1222
    :goto_22
    const v5, 0x102003b

    .line 1223
    .line 1224
    .line 1225
    if-ne v2, v5, :cond_3a

    .line 1226
    .line 1227
    const/4 v5, 0x1

    .line 1228
    goto :goto_23

    .line 1229
    :cond_3a
    const/4 v5, 0x0

    .line 1230
    :goto_23
    const v6, 0x1020038

    .line 1231
    .line 1232
    .line 1233
    if-ne v2, v6, :cond_3b

    .line 1234
    .line 1235
    const/4 v6, 0x1

    .line 1236
    goto :goto_24

    .line 1237
    :cond_3b
    const/4 v6, 0x0

    .line 1238
    :goto_24
    const v7, 0x102003a

    .line 1239
    .line 1240
    .line 1241
    if-ne v2, v7, :cond_3c

    .line 1242
    .line 1243
    const/4 v2, 0x1

    .line 1244
    goto :goto_25

    .line 1245
    :cond_3c
    const/4 v2, 0x0

    .line 1246
    :goto_25
    if-nez v3, :cond_3e

    .line 1247
    .line 1248
    if-nez v5, :cond_3e

    .line 1249
    .line 1250
    if-nez v0, :cond_3e

    .line 1251
    .line 1252
    if-eqz v1, :cond_3d

    .line 1253
    .line 1254
    goto :goto_26

    .line 1255
    :cond_3d
    const/4 v7, 0x0

    .line 1256
    goto :goto_27

    .line 1257
    :cond_3e
    :goto_26
    const/4 v7, 0x1

    .line 1258
    :goto_27
    if-nez v6, :cond_40

    .line 1259
    .line 1260
    if-nez v2, :cond_40

    .line 1261
    .line 1262
    if-nez v0, :cond_40

    .line 1263
    .line 1264
    if-eqz v1, :cond_3f

    .line 1265
    .line 1266
    goto :goto_28

    .line 1267
    :cond_3f
    const/4 v2, 0x0

    .line 1268
    goto :goto_29

    .line 1269
    :cond_40
    :goto_28
    const/4 v2, 0x1

    .line 1270
    :goto_29
    if-nez v0, :cond_41

    .line 1271
    .line 1272
    if-eqz v1, :cond_48

    .line 1273
    .line 1274
    :cond_41
    sget-object v0, Lc17;->c:Le17;

    .line 1275
    .line 1276
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    if-nez v0, :cond_42

    .line 1281
    .line 1282
    const/4 v0, 0x0

    .line 1283
    :cond_42
    check-cast v0, Lqw5;

    .line 1284
    .line 1285
    sget-object v8, Ls07;->i:Le17;

    .line 1286
    .line 1287
    invoke-virtual {v13, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v8

    .line 1291
    if-nez v8, :cond_43

    .line 1292
    .line 1293
    const/4 v8, 0x0

    .line 1294
    :cond_43
    check-cast v8, Lq3;

    .line 1295
    .line 1296
    if-eqz v0, :cond_48

    .line 1297
    .line 1298
    iget-object v9, v0, Lqw5;->b:Luu0;

    .line 1299
    .line 1300
    if-eqz v8, :cond_48

    .line 1301
    .line 1302
    iget v2, v9, Luu0;->Y:F

    .line 1303
    .line 1304
    iget v3, v9, Luu0;->X:F

    .line 1305
    .line 1306
    cmpg-float v4, v2, v3

    .line 1307
    .line 1308
    if-gez v4, :cond_44

    .line 1309
    .line 1310
    move v4, v3

    .line 1311
    goto :goto_2a

    .line 1312
    :cond_44
    move v4, v2

    .line 1313
    :goto_2a
    cmpl-float v5, v3, v2

    .line 1314
    .line 1315
    if-lez v5, :cond_45

    .line 1316
    .line 1317
    goto :goto_2b

    .line 1318
    :cond_45
    move v2, v3

    .line 1319
    :goto_2b
    iget-byte v3, v0, Lqw5;->c:B

    .line 1320
    .line 1321
    if-lez v3, :cond_46

    .line 1322
    .line 1323
    sub-float/2addr v4, v2

    .line 1324
    const/16 v25, 0x1

    .line 1325
    .line 1326
    add-int/lit8 v3, v3, 0x1

    .line 1327
    .line 1328
    int-to-float v2, v3

    .line 1329
    :goto_2c
    div-float/2addr v4, v2

    .line 1330
    goto :goto_2d

    .line 1331
    :cond_46
    sub-float/2addr v4, v2

    .line 1332
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1333
    .line 1334
    goto :goto_2c

    .line 1335
    :goto_2d
    if-eqz v1, :cond_47

    .line 1336
    .line 1337
    neg-float v4, v4

    .line 1338
    :cond_47
    iget-object v1, v8, Lq3;->b:Lon2;

    .line 1339
    .line 1340
    check-cast v1, Lgn2;

    .line 1341
    .line 1342
    if-eqz v1, :cond_8

    .line 1343
    .line 1344
    iget v0, v0, Lqw5;->a:F

    .line 1345
    .line 1346
    add-float/2addr v0, v4

    .line 1347
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    invoke-interface {v1, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    check-cast v0, Ljava/lang/Boolean;

    .line 1356
    .line 1357
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v12

    .line 1361
    goto/16 :goto_4e

    .line 1362
    .line 1363
    :cond_48
    iget-object v0, v10, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 1364
    .line 1365
    iget-object v0, v0, Lt6;->f0:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v0, Lfd3;

    .line 1368
    .line 1369
    invoke-static {v0}, Ljm4;->q(Ly24;)Ls86;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    invoke-virtual {v0}, Ls86;->e()J

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v8

    .line 1377
    new-instance v0, Ljava/util/ArrayList;

    .line 1378
    .line 1379
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1380
    .line 1381
    .line 1382
    sget-object v11, Ls07;->C:Le17;

    .line 1383
    .line 1384
    invoke-virtual {v13, v11}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v11

    .line 1388
    if-nez v11, :cond_49

    .line 1389
    .line 1390
    const/4 v11, 0x0

    .line 1391
    :cond_49
    check-cast v11, Lq3;

    .line 1392
    .line 1393
    if-eqz v11, :cond_4a

    .line 1394
    .line 1395
    iget-object v11, v11, Lq3;->b:Lon2;

    .line 1396
    .line 1397
    check-cast v11, Lgn2;

    .line 1398
    .line 1399
    if-eqz v11, :cond_4a

    .line 1400
    .line 1401
    invoke-interface {v11, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v11

    .line 1405
    check-cast v11, Ljava/lang/Boolean;

    .line 1406
    .line 1407
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1408
    .line 1409
    .line 1410
    move-result v11

    .line 1411
    if-eqz v11, :cond_4a

    .line 1412
    .line 1413
    const/4 v11, 0x0

    .line 1414
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    check-cast v0, Ljava/lang/Float;

    .line 1419
    .line 1420
    goto :goto_2e

    .line 1421
    :cond_4a
    const/4 v0, 0x0

    .line 1422
    :goto_2e
    sget-object v11, Ls07;->d:Le17;

    .line 1423
    .line 1424
    invoke-virtual {v13, v11}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v11

    .line 1428
    if-nez v11, :cond_4b

    .line 1429
    .line 1430
    const/4 v11, 0x0

    .line 1431
    :cond_4b
    check-cast v11, Lq3;

    .line 1432
    .line 1433
    if-nez v11, :cond_4c

    .line 1434
    .line 1435
    goto/16 :goto_2

    .line 1436
    .line 1437
    :cond_4c
    iget-object v11, v11, Lq3;->b:Lon2;

    .line 1438
    .line 1439
    sget-object v12, Lc17;->v:Le17;

    .line 1440
    .line 1441
    invoke-virtual {v13, v12}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v12

    .line 1445
    if-nez v12, :cond_4d

    .line 1446
    .line 1447
    const/4 v12, 0x0

    .line 1448
    :cond_4d
    check-cast v12, Ljx6;

    .line 1449
    .line 1450
    if-eqz v12, :cond_58

    .line 1451
    .line 1452
    if-eqz v7, :cond_58

    .line 1453
    .line 1454
    if-eqz v0, :cond_4e

    .line 1455
    .line 1456
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1457
    .line 1458
    .line 1459
    move-result v7

    .line 1460
    move-object/from16 p2, v0

    .line 1461
    .line 1462
    move/from16 p1, v1

    .line 1463
    .line 1464
    goto :goto_2f

    .line 1465
    :cond_4e
    move-object/from16 p2, v0

    .line 1466
    .line 1467
    move/from16 p1, v1

    .line 1468
    .line 1469
    shr-long v0, v8, v16

    .line 1470
    .line 1471
    long-to-int v0, v0

    .line 1472
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1473
    .line 1474
    .line 1475
    move-result v7

    .line 1476
    :goto_2f
    if-nez v3, :cond_4f

    .line 1477
    .line 1478
    if-eqz p1, :cond_50

    .line 1479
    .line 1480
    :cond_4f
    neg-float v7, v7

    .line 1481
    :cond_50
    iget-object v0, v10, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 1482
    .line 1483
    if-ne v0, v4, :cond_52

    .line 1484
    .line 1485
    if-nez v3, :cond_51

    .line 1486
    .line 1487
    if-eqz v5, :cond_52

    .line 1488
    .line 1489
    :cond_51
    neg-float v7, v7

    .line 1490
    :cond_52
    invoke-static {v12, v7}, Lgc;->x(Ljx6;F)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v0

    .line 1494
    if-eqz v0, :cond_59

    .line 1495
    .line 1496
    sget-object v0, Ls07;->z:Le17;

    .line 1497
    .line 1498
    invoke-virtual {v13, v0}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1499
    .line 1500
    .line 1501
    move-result v1

    .line 1502
    if-nez v1, :cond_54

    .line 1503
    .line 1504
    sget-object v1, Ls07;->B:Le17;

    .line 1505
    .line 1506
    invoke-virtual {v13, v1}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1507
    .line 1508
    .line 1509
    move-result v1

    .line 1510
    if-eqz v1, :cond_53

    .line 1511
    .line 1512
    goto :goto_30

    .line 1513
    :cond_53
    check-cast v11, Lrn2;

    .line 1514
    .line 1515
    if-eqz v11, :cond_8

    .line 1516
    .line 1517
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    invoke-interface {v11, v0, v15}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    check-cast v0, Ljava/lang/Boolean;

    .line 1526
    .line 1527
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1528
    .line 1529
    .line 1530
    move-result v12

    .line 1531
    goto/16 :goto_4e

    .line 1532
    .line 1533
    :cond_54
    :goto_30
    cmpl-float v1, v7, p0

    .line 1534
    .line 1535
    if-lez v1, :cond_56

    .line 1536
    .line 1537
    sget-object v0, Ls07;->B:Le17;

    .line 1538
    .line 1539
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    if-nez v0, :cond_55

    .line 1544
    .line 1545
    const/4 v12, 0x0

    .line 1546
    goto :goto_31

    .line 1547
    :cond_55
    move-object v12, v0

    .line 1548
    :goto_31
    check-cast v12, Lq3;

    .line 1549
    .line 1550
    goto :goto_33

    .line 1551
    :cond_56
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    if-nez v0, :cond_57

    .line 1556
    .line 1557
    const/4 v12, 0x0

    .line 1558
    goto :goto_32

    .line 1559
    :cond_57
    move-object v12, v0

    .line 1560
    :goto_32
    check-cast v12, Lq3;

    .line 1561
    .line 1562
    :goto_33
    if-eqz v12, :cond_8

    .line 1563
    .line 1564
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1565
    .line 1566
    check-cast v0, Ldn2;

    .line 1567
    .line 1568
    if-eqz v0, :cond_8

    .line 1569
    .line 1570
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    check-cast v0, Ljava/lang/Boolean;

    .line 1575
    .line 1576
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1577
    .line 1578
    .line 1579
    move-result v12

    .line 1580
    goto/16 :goto_4e

    .line 1581
    .line 1582
    :cond_58
    move-object/from16 p2, v0

    .line 1583
    .line 1584
    move/from16 p1, v1

    .line 1585
    .line 1586
    :cond_59
    sget-object v0, Lc17;->w:Le17;

    .line 1587
    .line 1588
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    if-nez v0, :cond_5a

    .line 1593
    .line 1594
    const/4 v0, 0x0

    .line 1595
    :cond_5a
    check-cast v0, Ljx6;

    .line 1596
    .line 1597
    if-eqz v0, :cond_8

    .line 1598
    .line 1599
    if-eqz v2, :cond_8

    .line 1600
    .line 1601
    if-eqz p2, :cond_5b

    .line 1602
    .line 1603
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    .line 1604
    .line 1605
    .line 1606
    move-result v1

    .line 1607
    goto :goto_34

    .line 1608
    :cond_5b
    and-long v1, v8, v17

    .line 1609
    .line 1610
    long-to-int v1, v1

    .line 1611
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1612
    .line 1613
    .line 1614
    move-result v1

    .line 1615
    :goto_34
    if-nez v6, :cond_5c

    .line 1616
    .line 1617
    if-eqz p1, :cond_5d

    .line 1618
    .line 1619
    :cond_5c
    neg-float v1, v1

    .line 1620
    :cond_5d
    invoke-static {v0, v1}, Lgc;->x(Ljx6;F)Z

    .line 1621
    .line 1622
    .line 1623
    move-result v0

    .line 1624
    if-eqz v0, :cond_8

    .line 1625
    .line 1626
    sget-object v0, Ls07;->y:Le17;

    .line 1627
    .line 1628
    invoke-virtual {v13, v0}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v2

    .line 1632
    if-nez v2, :cond_5f

    .line 1633
    .line 1634
    sget-object v2, Ls07;->A:Le17;

    .line 1635
    .line 1636
    invoke-virtual {v13, v2}, Ls05;->c(Ljava/lang/Object;)Z

    .line 1637
    .line 1638
    .line 1639
    move-result v2

    .line 1640
    if-eqz v2, :cond_5e

    .line 1641
    .line 1642
    goto :goto_35

    .line 1643
    :cond_5e
    check-cast v11, Lrn2;

    .line 1644
    .line 1645
    if-eqz v11, :cond_8

    .line 1646
    .line 1647
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    invoke-interface {v11, v15, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v0

    .line 1655
    check-cast v0, Ljava/lang/Boolean;

    .line 1656
    .line 1657
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1658
    .line 1659
    .line 1660
    move-result v12

    .line 1661
    goto/16 :goto_4e

    .line 1662
    .line 1663
    :cond_5f
    :goto_35
    cmpl-float v1, v1, p0

    .line 1664
    .line 1665
    if-lez v1, :cond_61

    .line 1666
    .line 1667
    sget-object v0, Ls07;->A:Le17;

    .line 1668
    .line 1669
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    if-nez v0, :cond_60

    .line 1674
    .line 1675
    const/4 v12, 0x0

    .line 1676
    goto :goto_36

    .line 1677
    :cond_60
    move-object v12, v0

    .line 1678
    :goto_36
    check-cast v12, Lq3;

    .line 1679
    .line 1680
    goto :goto_38

    .line 1681
    :cond_61
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    if-nez v0, :cond_62

    .line 1686
    .line 1687
    const/4 v12, 0x0

    .line 1688
    goto :goto_37

    .line 1689
    :cond_62
    move-object v12, v0

    .line 1690
    :goto_37
    check-cast v12, Lq3;

    .line 1691
    .line 1692
    :goto_38
    if-eqz v12, :cond_8

    .line 1693
    .line 1694
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1695
    .line 1696
    check-cast v0, Ldn2;

    .line 1697
    .line 1698
    if-eqz v0, :cond_8

    .line 1699
    .line 1700
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v0

    .line 1704
    check-cast v0, Ljava/lang/Boolean;

    .line 1705
    .line 1706
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1707
    .line 1708
    .line 1709
    move-result v12

    .line 1710
    goto/16 :goto_4e

    .line 1711
    .line 1712
    :sswitch_a
    sget-object v0, Ls07;->c:Le17;

    .line 1713
    .line 1714
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    if-nez v0, :cond_63

    .line 1719
    .line 1720
    const/4 v12, 0x0

    .line 1721
    goto :goto_39

    .line 1722
    :cond_63
    move-object v12, v0

    .line 1723
    :goto_39
    check-cast v12, Lq3;

    .line 1724
    .line 1725
    if-eqz v12, :cond_8

    .line 1726
    .line 1727
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1728
    .line 1729
    check-cast v0, Ldn2;

    .line 1730
    .line 1731
    if-eqz v0, :cond_8

    .line 1732
    .line 1733
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    check-cast v0, Ljava/lang/Boolean;

    .line 1738
    .line 1739
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1740
    .line 1741
    .line 1742
    move-result v12

    .line 1743
    goto/16 :goto_4e

    .line 1744
    .line 1745
    :sswitch_b
    sget-object v2, Ls07;->b:Le17;

    .line 1746
    .line 1747
    invoke-virtual {v13, v2}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v2

    .line 1751
    if-nez v2, :cond_64

    .line 1752
    .line 1753
    const/4 v2, 0x0

    .line 1754
    :cond_64
    check-cast v2, Lq3;

    .line 1755
    .line 1756
    if-eqz v2, :cond_65

    .line 1757
    .line 1758
    iget-object v2, v2, Lq3;->b:Lon2;

    .line 1759
    .line 1760
    check-cast v2, Ldn2;

    .line 1761
    .line 1762
    if-eqz v2, :cond_65

    .line 1763
    .line 1764
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v2

    .line 1768
    check-cast v2, Ljava/lang/Boolean;

    .line 1769
    .line 1770
    move-object/from16 v22, v2

    .line 1771
    .line 1772
    :goto_3a
    const/4 v2, 0x0

    .line 1773
    const/4 v7, 0x1

    .line 1774
    goto :goto_3b

    .line 1775
    :cond_65
    const/16 v22, 0x0

    .line 1776
    .line 1777
    goto :goto_3a

    .line 1778
    :goto_3b
    invoke-static {v0, v1, v7, v2, v6}, Lgc;->E(Lgc;IILjava/lang/Integer;I)V

    .line 1779
    .line 1780
    .line 1781
    if-eqz v22, :cond_8

    .line 1782
    .line 1783
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1784
    .line 1785
    .line 1786
    move-result v12

    .line 1787
    goto/16 :goto_4e

    .line 1788
    .line 1789
    :cond_66
    sget-object v0, Lc17;->l:Le17;

    .line 1790
    .line 1791
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    if-nez v0, :cond_67

    .line 1796
    .line 1797
    const/4 v0, 0x0

    .line 1798
    :cond_67
    invoke-static {v0, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result v0

    .line 1802
    if-eqz v0, :cond_8

    .line 1803
    .line 1804
    invoke-virtual {v14}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Leh2;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v0

    .line 1808
    check-cast v0, Lgh2;

    .line 1809
    .line 1810
    const/4 v7, 0x1

    .line 1811
    const/4 v11, 0x0

    .line 1812
    invoke-virtual {v0, v4, v11, v7}, Lgh2;->b(IZZ)Z

    .line 1813
    .line 1814
    .line 1815
    const/4 v12, 0x1

    .line 1816
    goto/16 :goto_4e

    .line 1817
    .line 1818
    :cond_68
    invoke-virtual {v14}, Landroid/view/View;->isInTouchMode()Z

    .line 1819
    .line 1820
    .line 1821
    move-result v0

    .line 1822
    if-eqz v0, :cond_69

    .line 1823
    .line 1824
    invoke-virtual {v14}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 1825
    .line 1826
    .line 1827
    :cond_69
    sget-object v0, Ls07;->w:Le17;

    .line 1828
    .line 1829
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v0

    .line 1833
    if-nez v0, :cond_6a

    .line 1834
    .line 1835
    const/4 v12, 0x0

    .line 1836
    goto :goto_3c

    .line 1837
    :cond_6a
    move-object v12, v0

    .line 1838
    :goto_3c
    check-cast v12, Lq3;

    .line 1839
    .line 1840
    if-eqz v12, :cond_8

    .line 1841
    .line 1842
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1843
    .line 1844
    check-cast v0, Ldn2;

    .line 1845
    .line 1846
    if-eqz v0, :cond_8

    .line 1847
    .line 1848
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    check-cast v0, Ljava/lang/Boolean;

    .line 1853
    .line 1854
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1855
    .line 1856
    .line 1857
    move-result v12

    .line 1858
    goto/16 :goto_4e

    .line 1859
    .line 1860
    :cond_6b
    if-eqz v3, :cond_6c

    .line 1861
    .line 1862
    const-string v1, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 1863
    .line 1864
    const/4 v2, -0x1

    .line 1865
    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1866
    .line 1867
    .line 1868
    move-result v19

    .line 1869
    move/from16 v1, v19

    .line 1870
    .line 1871
    goto :goto_3d

    .line 1872
    :cond_6c
    const/4 v2, -0x1

    .line 1873
    move v1, v2

    .line 1874
    :goto_3d
    if-eqz v3, :cond_6d

    .line 1875
    .line 1876
    const-string v4, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 1877
    .line 1878
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1879
    .line 1880
    .line 1881
    move-result v8

    .line 1882
    :goto_3e
    const/4 v11, 0x0

    .line 1883
    goto :goto_3f

    .line 1884
    :cond_6d
    const/4 v8, -0x1

    .line 1885
    goto :goto_3e

    .line 1886
    :goto_3f
    invoke-virtual {v0, v5, v1, v8, v11}, Lgc;->K(Ly07;IIZ)Z

    .line 1887
    .line 1888
    .line 1889
    move-result v12

    .line 1890
    if-eqz v12, :cond_93

    .line 1891
    .line 1892
    invoke-virtual {v0, v9}, Lgc;->A(I)I

    .line 1893
    .line 1894
    .line 1895
    move-result v1

    .line 1896
    const/4 v2, 0x0

    .line 1897
    invoke-static {v0, v1, v11, v2, v6}, Lgc;->E(Lgc;IILjava/lang/Integer;I)V

    .line 1898
    .line 1899
    .line 1900
    goto/16 :goto_4e

    .line 1901
    .line 1902
    :cond_6e
    sget-object v0, Ls07;->q:Le17;

    .line 1903
    .line 1904
    invoke-virtual {v13, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v0

    .line 1908
    if-nez v0, :cond_6f

    .line 1909
    .line 1910
    const/4 v12, 0x0

    .line 1911
    goto :goto_40

    .line 1912
    :cond_6f
    move-object v12, v0

    .line 1913
    :goto_40
    check-cast v12, Lq3;

    .line 1914
    .line 1915
    if-eqz v12, :cond_8

    .line 1916
    .line 1917
    iget-object v0, v12, Lq3;->b:Lon2;

    .line 1918
    .line 1919
    check-cast v0, Ldn2;

    .line 1920
    .line 1921
    if-eqz v0, :cond_8

    .line 1922
    .line 1923
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    check-cast v0, Ljava/lang/Boolean;

    .line 1928
    .line 1929
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1930
    .line 1931
    .line 1932
    move-result v12

    .line 1933
    goto/16 :goto_4e

    .line 1934
    .line 1935
    :cond_70
    if-eqz v3, :cond_8

    .line 1936
    .line 1937
    const-string v1, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 1938
    .line 1939
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1940
    .line 1941
    .line 1942
    move-result v1

    .line 1943
    const-string v6, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 1944
    .line 1945
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1946
    .line 1947
    .line 1948
    move-result v3

    .line 1949
    if-ne v2, v11, :cond_71

    .line 1950
    .line 1951
    const/4 v2, 0x1

    .line 1952
    goto :goto_41

    .line 1953
    :cond_71
    const/4 v2, 0x0

    .line 1954
    :goto_41
    iget-object v6, v0, Lgc;->w0:Ljava/lang/Integer;

    .line 1955
    .line 1956
    if-nez v6, :cond_72

    .line 1957
    .line 1958
    :goto_42
    const/4 v6, -0x1

    .line 1959
    goto :goto_43

    .line 1960
    :cond_72
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1961
    .line 1962
    .line 1963
    move-result v6

    .line 1964
    if-eq v9, v6, :cond_73

    .line 1965
    .line 1966
    goto :goto_42

    .line 1967
    :goto_43
    iput v6, v0, Lgc;->v0:I

    .line 1968
    .line 1969
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v6

    .line 1973
    iput-object v6, v0, Lgc;->w0:Ljava/lang/Integer;

    .line 1974
    .line 1975
    :cond_73
    invoke-static {v5}, Lgc;->t(Ly07;)Ljava/lang/String;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v6

    .line 1979
    if-eqz v6, :cond_8

    .line 1980
    .line 1981
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1982
    .line 1983
    .line 1984
    move-result v9

    .line 1985
    if-nez v9, :cond_74

    .line 1986
    .line 1987
    goto/16 :goto_2

    .line 1988
    .line 1989
    :cond_74
    invoke-static {v5}, Lgc;->t(Ly07;)Ljava/lang/String;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v9

    .line 1993
    if-eqz v9, :cond_76

    .line 1994
    .line 1995
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1996
    .line 1997
    .line 1998
    move-result v10

    .line 1999
    if-nez v10, :cond_75

    .line 2000
    .line 2001
    goto :goto_44

    .line 2002
    :cond_75
    const/4 v10, 0x1

    .line 2003
    if-eq v1, v10, :cond_81

    .line 2004
    .line 2005
    const/4 v10, 0x2

    .line 2006
    if-eq v1, v10, :cond_7f

    .line 2007
    .line 2008
    const/4 v10, 0x4

    .line 2009
    if-eq v1, v10, :cond_79

    .line 2010
    .line 2011
    if-eq v1, v4, :cond_77

    .line 2012
    .line 2013
    const/16 v4, 0x10

    .line 2014
    .line 2015
    if-eq v1, v4, :cond_79

    .line 2016
    .line 2017
    :cond_76
    :goto_44
    const/4 v12, 0x0

    .line 2018
    goto/16 :goto_45

    .line 2019
    .line 2020
    :cond_77
    sget-object v4, Ly3;->c:Ly3;

    .line 2021
    .line 2022
    if-nez v4, :cond_78

    .line 2023
    .line 2024
    new-instance v4, Ly3;

    .line 2025
    .line 2026
    const/4 v8, 0x0

    .line 2027
    invoke-direct {v4, v8}, Lv3;-><init>(B)V

    .line 2028
    .line 2029
    .line 2030
    sput-object v4, Ly3;->c:Ly3;

    .line 2031
    .line 2032
    :cond_78
    move-object v12, v4

    .line 2033
    iput-object v9, v12, Lv3;->a:Ljava/lang/Object;

    .line 2034
    .line 2035
    goto/16 :goto_45

    .line 2036
    .line 2037
    :cond_79
    sget-object v4, Ls07;->a:Le17;

    .line 2038
    .line 2039
    invoke-virtual {v13, v4}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2040
    .line 2041
    .line 2042
    move-result v4

    .line 2043
    if-nez v4, :cond_7a

    .line 2044
    .line 2045
    goto :goto_44

    .line 2046
    :cond_7a
    invoke-static {v8}, Lgv3;->C(Lt07;)Lx78;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v4

    .line 2050
    if-nez v4, :cond_7b

    .line 2051
    .line 2052
    goto :goto_44

    .line 2053
    :cond_7b
    if-ne v1, v10, :cond_7d

    .line 2054
    .line 2055
    sget-object v8, Lw3;->g:Lw3;

    .line 2056
    .line 2057
    if-nez v8, :cond_7c

    .line 2058
    .line 2059
    new-instance v8, Lw3;

    .line 2060
    .line 2061
    const/4 v10, 0x2

    .line 2062
    invoke-direct {v8, v10}, Lw3;-><init>(B)V

    .line 2063
    .line 2064
    .line 2065
    sput-object v8, Lw3;->g:Lw3;

    .line 2066
    .line 2067
    :cond_7c
    move-object v12, v8

    .line 2068
    iput-object v9, v12, Lv3;->a:Ljava/lang/Object;

    .line 2069
    .line 2070
    iput-object v4, v12, Lw3;->d:Ljava/lang/Object;

    .line 2071
    .line 2072
    goto :goto_45

    .line 2073
    :cond_7d
    sget-object v8, Lx3;->e:Lx3;

    .line 2074
    .line 2075
    if-nez v8, :cond_7e

    .line 2076
    .line 2077
    new-instance v8, Lx3;

    .line 2078
    .line 2079
    const/4 v10, 0x0

    .line 2080
    invoke-direct {v8, v10}, Lv3;-><init>(B)V

    .line 2081
    .line 2082
    .line 2083
    new-instance v10, Landroid/graphics/Rect;

    .line 2084
    .line 2085
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 2086
    .line 2087
    .line 2088
    sput-object v8, Lx3;->e:Lx3;

    .line 2089
    .line 2090
    :cond_7e
    move-object v12, v8

    .line 2091
    iput-object v9, v12, Lv3;->a:Ljava/lang/Object;

    .line 2092
    .line 2093
    iput-object v4, v12, Lx3;->c:Lx78;

    .line 2094
    .line 2095
    iput-object v5, v12, Lx3;->d:Ly07;

    .line 2096
    .line 2097
    goto :goto_45

    .line 2098
    :cond_7f
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v4

    .line 2102
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v4

    .line 2106
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v4

    .line 2110
    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 2111
    .line 2112
    sget-object v8, Lw3;->f:Lw3;

    .line 2113
    .line 2114
    if-nez v8, :cond_80

    .line 2115
    .line 2116
    new-instance v8, Lw3;

    .line 2117
    .line 2118
    const/4 v10, 0x1

    .line 2119
    invoke-direct {v8, v10}, Lw3;-><init>(B)V

    .line 2120
    .line 2121
    .line 2122
    invoke-static {v4}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v4

    .line 2126
    iput-object v4, v8, Lw3;->d:Ljava/lang/Object;

    .line 2127
    .line 2128
    sput-object v8, Lw3;->f:Lw3;

    .line 2129
    .line 2130
    :cond_80
    move-object v12, v8

    .line 2131
    invoke-virtual {v12, v9}, Lw3;->z(Ljava/lang/String;)V

    .line 2132
    .line 2133
    .line 2134
    goto :goto_45

    .line 2135
    :cond_81
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v4

    .line 2139
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v4

    .line 2143
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v4

    .line 2147
    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 2148
    .line 2149
    sget-object v8, Lw3;->e:Lw3;

    .line 2150
    .line 2151
    if-nez v8, :cond_82

    .line 2152
    .line 2153
    new-instance v8, Lw3;

    .line 2154
    .line 2155
    const/4 v10, 0x0

    .line 2156
    invoke-direct {v8, v10}, Lw3;-><init>(B)V

    .line 2157
    .line 2158
    .line 2159
    invoke-static {v4}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v4

    .line 2163
    iput-object v4, v8, Lw3;->d:Ljava/lang/Object;

    .line 2164
    .line 2165
    sput-object v8, Lw3;->e:Lw3;

    .line 2166
    .line 2167
    :cond_82
    move-object v12, v8

    .line 2168
    invoke-virtual {v12, v9}, Lw3;->z(Ljava/lang/String;)V

    .line 2169
    .line 2170
    .line 2171
    :goto_45
    if-nez v12, :cond_83

    .line 2172
    .line 2173
    goto/16 :goto_2

    .line 2174
    .line 2175
    :cond_83
    invoke-virtual {v0, v5}, Lgc;->q(Ly07;)I

    .line 2176
    .line 2177
    .line 2178
    move-result v4

    .line 2179
    const/4 v8, -0x1

    .line 2180
    if-ne v4, v8, :cond_85

    .line 2181
    .line 2182
    if-eqz v2, :cond_84

    .line 2183
    .line 2184
    const/4 v4, 0x0

    .line 2185
    goto :goto_46

    .line 2186
    :cond_84
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2187
    .line 2188
    .line 2189
    move-result v4

    .line 2190
    :cond_85
    :goto_46
    if-eqz v2, :cond_86

    .line 2191
    .line 2192
    invoke-virtual {v12, v4}, Lv3;->h(I)[I

    .line 2193
    .line 2194
    .line 2195
    move-result-object v4

    .line 2196
    goto :goto_47

    .line 2197
    :cond_86
    invoke-virtual {v12, v4}, Lv3;->p(I)[I

    .line 2198
    .line 2199
    .line 2200
    move-result-object v4

    .line 2201
    :goto_47
    if-nez v4, :cond_87

    .line 2202
    .line 2203
    goto/16 :goto_2

    .line 2204
    .line 2205
    :cond_87
    const/16 v20, 0x0

    .line 2206
    .line 2207
    aget v21, v4, v20

    .line 2208
    .line 2209
    const/16 v25, 0x1

    .line 2210
    .line 2211
    aget v22, v4, v25

    .line 2212
    .line 2213
    if-eqz v3, :cond_8b

    .line 2214
    .line 2215
    sget-object v3, Lc17;->a:Le17;

    .line 2216
    .line 2217
    invoke-virtual {v13, v3}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2218
    .line 2219
    .line 2220
    move-result v3

    .line 2221
    if-nez v3, :cond_8b

    .line 2222
    .line 2223
    sget-object v3, Lc17;->G:Le17;

    .line 2224
    .line 2225
    invoke-virtual {v13, v3}, Ls05;->c(Ljava/lang/Object;)Z

    .line 2226
    .line 2227
    .line 2228
    move-result v3

    .line 2229
    if-eqz v3, :cond_8b

    .line 2230
    .line 2231
    invoke-virtual {v0, v5}, Lgc;->r(Ly07;)I

    .line 2232
    .line 2233
    .line 2234
    move-result v3

    .line 2235
    const/4 v6, -0x1

    .line 2236
    if-ne v3, v6, :cond_89

    .line 2237
    .line 2238
    if-eqz v2, :cond_88

    .line 2239
    .line 2240
    move/from16 v3, v21

    .line 2241
    .line 2242
    goto :goto_48

    .line 2243
    :cond_88
    move/from16 v3, v22

    .line 2244
    .line 2245
    :cond_89
    :goto_48
    if-eqz v2, :cond_8a

    .line 2246
    .line 2247
    move/from16 v4, v22

    .line 2248
    .line 2249
    goto :goto_4a

    .line 2250
    :cond_8a
    move/from16 v4, v21

    .line 2251
    .line 2252
    goto :goto_4a

    .line 2253
    :cond_8b
    if-eqz v2, :cond_8c

    .line 2254
    .line 2255
    move/from16 v3, v22

    .line 2256
    .line 2257
    goto :goto_49

    .line 2258
    :cond_8c
    move/from16 v3, v21

    .line 2259
    .line 2260
    :goto_49
    move v4, v3

    .line 2261
    :goto_4a
    if-eqz v2, :cond_8d

    .line 2262
    .line 2263
    move/from16 v19, v11

    .line 2264
    .line 2265
    goto :goto_4b

    .line 2266
    :cond_8d
    move/from16 v19, v7

    .line 2267
    .line 2268
    :goto_4b
    new-instance v17, Ldc;

    .line 2269
    .line 2270
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2271
    .line 2272
    .line 2273
    move-result-wide v23

    .line 2274
    move/from16 v20, v1

    .line 2275
    .line 2276
    move-object/from16 v18, v5

    .line 2277
    .line 2278
    invoke-direct/range {v17 .. v24}, Ldc;-><init>(Ly07;IIIIJ)V

    .line 2279
    .line 2280
    .line 2281
    move-object/from16 v2, v17

    .line 2282
    .line 2283
    move-object/from16 v1, v18

    .line 2284
    .line 2285
    iput-object v2, v0, Lgc;->A0:Ldc;

    .line 2286
    .line 2287
    const/4 v7, 0x1

    .line 2288
    invoke-virtual {v0, v1, v3, v4, v7}, Lgc;->K(Ly07;IIZ)Z

    .line 2289
    .line 2290
    .line 2291
    :goto_4c
    move v12, v7

    .line 2292
    goto :goto_4e

    .line 2293
    :cond_8e
    const/4 v7, 0x1

    .line 2294
    const/16 v20, 0x0

    .line 2295
    .line 2296
    iget v2, v0, Lgc;->m0:I

    .line 2297
    .line 2298
    if-ne v2, v1, :cond_8f

    .line 2299
    .line 2300
    const/high16 v2, -0x80000000

    .line 2301
    .line 2302
    iput v2, v0, Lgc;->m0:I

    .line 2303
    .line 2304
    const/4 v2, 0x0

    .line 2305
    iput-object v2, v0, Lgc;->o0:Lh4;

    .line 2306
    .line 2307
    invoke-virtual {v14}, Landroid/view/View;->invalidate()V

    .line 2308
    .line 2309
    .line 2310
    const/high16 v3, 0x10000

    .line 2311
    .line 2312
    invoke-static {v0, v1, v3, v2, v6}, Lgc;->E(Lgc;IILjava/lang/Integer;I)V

    .line 2313
    .line 2314
    .line 2315
    goto :goto_4c

    .line 2316
    :cond_8f
    :goto_4d
    move/from16 v12, v20

    .line 2317
    .line 2318
    goto :goto_4e

    .line 2319
    :cond_90
    const/4 v2, 0x0

    .line 2320
    const/high16 v3, 0x10000

    .line 2321
    .line 2322
    const/4 v7, 0x1

    .line 2323
    const/16 v20, 0x0

    .line 2324
    .line 2325
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 2326
    .line 2327
    .line 2328
    move-result v5

    .line 2329
    if-eqz v5, :cond_8f

    .line 2330
    .line 2331
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 2332
    .line 2333
    .line 2334
    move-result v4

    .line 2335
    if-eqz v4, :cond_8f

    .line 2336
    .line 2337
    iget v4, v0, Lgc;->m0:I

    .line 2338
    .line 2339
    if-ne v4, v1, :cond_91

    .line 2340
    .line 2341
    goto :goto_4d

    .line 2342
    :cond_91
    const/high16 v5, -0x80000000

    .line 2343
    .line 2344
    if-eq v4, v5, :cond_92

    .line 2345
    .line 2346
    invoke-static {v0, v4, v3, v2, v6}, Lgc;->E(Lgc;IILjava/lang/Integer;I)V

    .line 2347
    .line 2348
    .line 2349
    :cond_92
    iput v1, v0, Lgc;->m0:I

    .line 2350
    .line 2351
    invoke-virtual {v14}, Landroid/view/View;->invalidate()V

    .line 2352
    .line 2353
    .line 2354
    const v3, 0x8000

    .line 2355
    .line 2356
    .line 2357
    invoke-static {v0, v1, v3, v2, v6}, Lgc;->E(Lgc;IILjava/lang/Integer;I)V

    .line 2358
    .line 2359
    .line 2360
    goto :goto_4c

    .line 2361
    :cond_93
    :goto_4e
    return v12

    .line 2362
    nop

    .line 2363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_0
        0x8000 -> :sswitch_9
        0x10000 -> :sswitch_8
        0x40000 -> :sswitch_7
        0x80000 -> :sswitch_6
        0x100000 -> :sswitch_5
        0x200000 -> :sswitch_4
        0x1020036 -> :sswitch_3
        0x102003d -> :sswitch_2
        0x1020054 -> :sswitch_1
    .end sparse-switch

    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    :pswitch_data_1
    .packed-switch 0x1020038
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1020046
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
