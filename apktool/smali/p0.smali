.class public final synthetic Lp0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lp0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lp0;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lp0;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lp0;->X:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    sget-object v6, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget-object v7, p0, Lp0;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Lp0;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 19
    .line 20
    check-cast v7, Landroid/content/Context;

    .line 21
    .line 22
    check-cast p1, Landroid/content/res/TypedArray;

    .line 23
    .line 24
    sget v0, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;->j0:I

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;->f0:Landroid/widget/TextView;

    .line 30
    .line 31
    sget v1, Lx56;->HappForwardField_title:I

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    sget v1, Lx56;->HappForwardField_titleColor:I

    .line 41
    .line 42
    sget v2, Lv26;->settingsText:I

    .line 43
    .line 44
    invoke-static {v7, v2}, Los4;->q(Landroid/content/Context;I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;->g0:Landroid/widget/TextView;

    .line 56
    .line 57
    sget v1, Lx56;->HappForwardField_value:I

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    sget v0, Lx56;->HappForwardField_description:I

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p0, p0, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;->i0:Landroid/widget/TextView;

    .line 73
    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    move v3, v4

    .line 77
    :cond_0
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    return-object v6

    .line 84
    :pswitch_0
    check-cast p0, Ljava/util/Map;

    .line 85
    .line 86
    check-cast v7, Lca6;

    .line 87
    .line 88
    check-cast p1, Ljava/io/PrintWriter;

    .line 89
    .line 90
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz p0, :cond_1

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    :cond_1
    iget p0, v7, Lca6;->X:I

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, " Config manager import batch: before servers: "

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, ", now servers "

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v6

    .line 138
    :pswitch_1
    check-cast p0, Lca6;

    .line 139
    .line 140
    check-cast v7, Lca6;

    .line 141
    .line 142
    check-cast p1, Lfq4;

    .line 143
    .line 144
    iget v0, p0, Lca6;->X:I

    .line 145
    .line 146
    const/4 v1, -0x1

    .line 147
    if-ne v0, v1, :cond_2

    .line 148
    .line 149
    invoke-virtual {p1}, Lfq4;->b()Lkf3;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iget v0, v0, Lif3;->X:I

    .line 154
    .line 155
    iput v0, p0, Lca6;->X:I

    .line 156
    .line 157
    :cond_2
    invoke-virtual {p1}, Lfq4;->b()Lkf3;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    iget p0, p0, Lif3;->Y:I

    .line 162
    .line 163
    add-int/2addr p0, v2

    .line 164
    iput p0, v7, Lca6;->X:I

    .line 165
    .line 166
    const-string p0, ""

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_2
    check-cast p0, Lhv2;

    .line 170
    .line 171
    check-cast v7, Lsc;

    .line 172
    .line 173
    check-cast p1, Ljava/lang/Throwable;

    .line 174
    .line 175
    iget-object p0, p0, Lhv2;->Z:Landroid/os/Handler;

    .line 176
    .line 177
    invoke-virtual {p0, v7}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 178
    .line 179
    .line 180
    return-object v6

    .line 181
    :pswitch_3
    check-cast p0, Lxz4;

    .line 182
    .line 183
    check-cast v7, Lvf3;

    .line 184
    .line 185
    check-cast p1, Ljava/lang/Throwable;

    .line 186
    .line 187
    invoke-virtual {p0, v7}, Lxz4;->b(Lvf3;)V

    .line 188
    .line 189
    .line 190
    return-object v6

    .line 191
    :pswitch_4
    check-cast p0, Ljava/lang/String;

    .line 192
    .line 193
    check-cast v7, Ljava/lang/String;

    .line 194
    .line 195
    check-cast p1, Ljava/io/PrintWriter;

    .line 196
    .line 197
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v1, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v0, " control type:set-settings param:"

    .line 210
    .line 211
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string p0, " value:"

    .line 218
    .line 219
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    return-object v6

    .line 233
    :pswitch_5
    check-cast p0, Lhp0;

    .line 234
    .line 235
    check-cast v7, Ljava/lang/String;

    .line 236
    .line 237
    check-cast p1, Ljava/io/PrintWriter;

    .line 238
    .line 239
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object p0, p0, Lhp0;->X:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    new-instance v2, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v0, " control type:sub-change change:"

    .line 258
    .line 259
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string p0, " size:"

    .line 266
    .line 267
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-object v6

    .line 281
    :pswitch_6
    check-cast p0, Lrn2;

    .line 282
    .line 283
    check-cast v7, Ljava/lang/String;

    .line 284
    .line 285
    check-cast p1, Lqg5;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p1, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 293
    .line 294
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-nez p1, :cond_3

    .line 299
    .line 300
    goto :goto_0

    .line 301
    :cond_3
    move-object v5, p1

    .line 302
    :goto_0
    invoke-interface {p0, v5, v7}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    check-cast p0, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_7
    check-cast p0, Ljava/lang/Boolean;

    .line 313
    .line 314
    check-cast v7, Lp72;

    .line 315
    .line 316
    check-cast p1, Ljava/io/PrintWriter;

    .line 317
    .line 318
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    new-instance v1, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v0, " Check provider with file: "

    .line 331
    .line 332
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v7}, Lp72;->c()Ll72;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    const-string p0, "1792654306601"

    .line 353
    .line 354
    invoke-static {p0}, Lmm7;->c0(Ljava/lang/String;)Ljava/lang/Long;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    if-eqz p0, :cond_4

    .line 359
    .line 360
    sget-object v0, Lte3;->Z:Lte3;

    .line 361
    .line 362
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 363
    .line 364
    .line 365
    move-result-wide v0

    .line 366
    invoke-static {v0, v1}, Lkm4;->E(J)Lte3;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    if-eqz p0, :cond_4

    .line 371
    .line 372
    sget-object v0, Lpa8;->b:Lxc2;

    .line 373
    .line 374
    invoke-static {p0, v0}, Lv18;->d(Lte3;Lpa8;)Lld4;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    sget-object v0, Lm72;->a:Lnd4;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, p0}, Lg1;->a(Lld4;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    goto :goto_1

    .line 388
    :cond_4
    move-object p0, v5

    .line 389
    :goto_1
    invoke-virtual {v7}, Lp72;->c()Ll72;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iget-object v0, v0, Ll72;->a:Lvz7;

    .line 394
    .line 395
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 400
    .line 401
    const-wide/16 v1, -0x1

    .line 402
    .line 403
    const-string v3, "extra_file_timestamp"

    .line 404
    .line 405
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/mmkv/MMKV;->f(JLjava/lang/String;)J

    .line 406
    .line 407
    .line 408
    move-result-wide v3

    .line 409
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    cmp-long v1, v3, v1

    .line 414
    .line 415
    if-eqz v1, :cond_5

    .line 416
    .line 417
    goto :goto_2

    .line 418
    :cond_5
    move-object v0, v5

    .line 419
    :goto_2
    if-eqz v0, :cond_6

    .line 420
    .line 421
    sget-object v1, Lte3;->Z:Lte3;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 424
    .line 425
    .line 426
    move-result-wide v0

    .line 427
    invoke-static {v0, v1}, Lkm4;->E(J)Lte3;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-eqz v0, :cond_6

    .line 432
    .line 433
    sget-object v1, Lpa8;->b:Lxc2;

    .line 434
    .line 435
    invoke-static {v0, v1}, Lv18;->d(Lte3;Lpa8;)Lld4;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    sget-object v1, Lm72;->a:Lnd4;

    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v0}, Lg1;->a(Lld4;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v1, "date_in: "

    .line 451
    .line 452
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string p0, " date_re: "

    .line 459
    .line 460
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    return-object v6

    .line 474
    :pswitch_8
    check-cast p0, Ljava/lang/String;

    .line 475
    .line 476
    check-cast v7, Ljava/util/List;

    .line 477
    .line 478
    check-cast p1, Ljava/io/PrintWriter;

    .line 479
    .line 480
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    sget-object v1, Lsu/happ/proxyutility/dto/ProviderId;->Companion:Lsu/happ/proxyutility/dto/ProviderId$Companion;

    .line 485
    .line 486
    if-eqz v7, :cond_7

    .line 487
    .line 488
    goto :goto_3

    .line 489
    :cond_7
    move v2, v4

    .line 490
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 491
    .line 492
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    const-string v0, " Provider "

    .line 499
    .line 500
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    const-string p0, " was found in file: "

    .line 507
    .line 508
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-object v6

    .line 522
    :pswitch_9
    check-cast p0, Lz32;

    .line 523
    .line 524
    check-cast v7, Ly32;

    .line 525
    .line 526
    check-cast p1, Ljava/lang/Throwable;

    .line 527
    .line 528
    iget-object p0, p0, Lz32;->b:Llx0;

    .line 529
    .line 530
    invoke-virtual {p0, v7}, Llx0;->b(Lme6;)V

    .line 531
    .line 532
    .line 533
    return-object v6

    .line 534
    :pswitch_a
    check-cast p0, Lpy7;

    .line 535
    .line 536
    check-cast v7, Ld58;

    .line 537
    .line 538
    check-cast p1, Lpt1;

    .line 539
    .line 540
    invoke-virtual {p0, p1}, Lpy7;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    check-cast p0, Ljava/lang/Boolean;

    .line 545
    .line 546
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 547
    .line 548
    .line 549
    move-result p0

    .line 550
    if-eqz p0, :cond_8

    .line 551
    .line 552
    move-object v5, v7

    .line 553
    :cond_8
    return-object v5

    .line 554
    :pswitch_b
    check-cast p0, Ljava/lang/String;

    .line 555
    .line 556
    check-cast v7, Landroid/app/Service;

    .line 557
    .line 558
    check-cast p1, Ljava/lang/String;

    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    :try_start_0
    sget-object v0, Lyw2;->b:Lcom/google/gson/a;

    .line 564
    .line 565
    const-class v1, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    new-instance v2, Lyi8;

    .line 571
    .line 572
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, p0, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    check-cast p0, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 580
    .line 581
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eqz v1, :cond_a

    .line 594
    .line 595
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    check-cast v1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 600
    .line 601
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    const-string v4, "proxy"

    .line 606
    .line 607
    invoke-static {v2, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-eqz v2, :cond_9

    .line 612
    .line 613
    invoke-virtual {v1, p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->n(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    goto :goto_4

    .line 617
    :catchall_0
    move-exception v0

    .line 618
    move-object p0, v0

    .line 619
    goto :goto_5

    .line 620
    :cond_a
    new-instance v0, Lsu/happ/proxyutility/dto/ResolveForPingData;

    .line 621
    .line 622
    sget-object v1, Lyw2;->d:Lcom/google/gson/a;

    .line 623
    .line 624
    invoke-virtual {v1, p0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    invoke-direct {v0, p1, p0}, Lsu/happ/proxyutility/dto/ResolveForPingData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    new-instance p0, Lcom/google/gson/a;

    .line 632
    .line 633
    invoke-direct {p0}, Lcom/google/gson/a;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-virtual {p0, v0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    invoke-static {v3, v7, p0}, Lqe4;->M0(ILandroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 641
    .line 642
    .line 643
    goto :goto_6

    .line 644
    :goto_5
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 645
    .line 646
    if-nez p1, :cond_c

    .line 647
    .line 648
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 649
    .line 650
    if-nez p1, :cond_c

    .line 651
    .line 652
    new-instance v6, Lrj6;

    .line 653
    .line 654
    invoke-direct {v6, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 655
    .line 656
    .line 657
    :goto_6
    instance-of p0, v6, Lrj6;

    .line 658
    .line 659
    if-eqz p0, :cond_b

    .line 660
    .line 661
    goto :goto_7

    .line 662
    :cond_b
    move-object v5, v6

    .line 663
    :goto_7
    check-cast v5, Ldn8;

    .line 664
    .line 665
    return-object v5

    .line 666
    :cond_c
    throw p0

    .line 667
    :pswitch_c
    check-cast p0, Lokhttp3/internal/cache/DiskLruCache;

    .line 668
    .line 669
    check-cast v7, Lokhttp3/internal/cache/DiskLruCache$Editor;

    .line 670
    .line 671
    check-cast p1, Ljava/io/IOException;

    .line 672
    .line 673
    invoke-static {p0, v7, p1}, Lokhttp3/internal/cache/DiskLruCache$Editor;->a(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Editor;Ljava/io/IOException;)Ldn8;

    .line 674
    .line 675
    .line 676
    move-result-object p0

    .line 677
    return-object p0

    .line 678
    :pswitch_d
    check-cast p0, Ljo1;

    .line 679
    .line 680
    check-cast v7, Ljava/lang/String;

    .line 681
    .line 682
    check-cast p1, Lko1;

    .line 683
    .line 684
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-virtual {p1, p0, v7}, Lko1;->b0(Ljo1;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    return-object v6

    .line 691
    :pswitch_e
    check-cast p0, Lpi1;

    .line 692
    .line 693
    check-cast v7, Lki1;

    .line 694
    .line 695
    check-cast p1, Lqr6;

    .line 696
    .line 697
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    iget-object p0, p0, Lpi1;->b:Loi1;

    .line 701
    .line 702
    invoke-virtual {p0, p1, v7}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    return-object v6

    .line 706
    :pswitch_f
    check-cast p0, Lxg1;

    .line 707
    .line 708
    check-cast v7, Lux0;

    .line 709
    .line 710
    check-cast p1, Ljava/lang/Throwable;

    .line 711
    .line 712
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    if-eqz p1, :cond_e

    .line 719
    .line 720
    instance-of p0, p1, Ljava/util/concurrent/CancellationException;

    .line 721
    .line 722
    if-eqz p0, :cond_d

    .line 723
    .line 724
    check-cast p1, Ljava/util/concurrent/CancellationException;

    .line 725
    .line 726
    invoke-virtual {v7, p1}, Lrm3;->l(Ljava/lang/Throwable;)V

    .line 727
    .line 728
    .line 729
    goto :goto_8

    .line 730
    :cond_d
    invoke-virtual {v7, p1}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 731
    .line 732
    .line 733
    goto :goto_8

    .line 734
    :cond_e
    invoke-interface {p0}, Lxg1;->p()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object p0

    .line 738
    invoke-virtual {v7, p0}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    :goto_8
    return-object v6

    .line 742
    :pswitch_10
    check-cast p0, Lqd0;

    .line 743
    .line 744
    check-cast v7, Lux0;

    .line 745
    .line 746
    check-cast p1, Ljava/lang/Throwable;

    .line 747
    .line 748
    if-eqz p1, :cond_10

    .line 749
    .line 750
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 751
    .line 752
    if-eqz v0, :cond_f

    .line 753
    .line 754
    invoke-virtual {p0}, Lqd0;->c()V

    .line 755
    .line 756
    .line 757
    goto :goto_9

    .line 758
    :cond_f
    invoke-virtual {p0, p1}, Lqd0;->d(Ljava/lang/Throwable;)Z

    .line 759
    .line 760
    .line 761
    goto :goto_9

    .line 762
    :cond_10
    invoke-virtual {v7}, Lrm3;->G()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    invoke-virtual {p0, p1}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    :goto_9
    return-object v6

    .line 770
    :pswitch_11
    check-cast p0, Lyr2;

    .line 771
    .line 772
    check-cast v7, Ll41;

    .line 773
    .line 774
    check-cast p1, Ljava/lang/Throwable;

    .line 775
    .line 776
    iget-object p0, p0, Lyr2;->Y:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast p0, Lc15;

    .line 779
    .line 780
    invoke-virtual {p0, v7}, Lc15;->j(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    return-object v6

    .line 784
    :pswitch_12
    check-cast p0, Lzd5;

    .line 785
    .line 786
    move-object v2, v7

    .line 787
    check-cast v2, Ld90;

    .line 788
    .line 789
    move-object v0, p1

    .line 790
    check-cast v0, Lp34;

    .line 791
    .line 792
    invoke-virtual {v0}, Lp34;->a()V

    .line 793
    .line 794
    .line 795
    iget-object v1, p0, Lzd5;->j0:Llf;

    .line 796
    .line 797
    const/4 v4, 0x0

    .line 798
    const/16 v5, 0x3c

    .line 799
    .line 800
    const/4 v3, 0x0

    .line 801
    invoke-static/range {v0 .. v5}, Lsv1;->d0(Lsv1;Llf;Ld90;FLom7;I)V

    .line 802
    .line 803
    .line 804
    return-object v6

    .line 805
    :pswitch_13
    move-object v8, p0

    .line 806
    check-cast v8, Llf;

    .line 807
    .line 808
    move-object v9, v7

    .line 809
    check-cast v9, Ld90;

    .line 810
    .line 811
    move-object v7, p1

    .line 812
    check-cast v7, Lp34;

    .line 813
    .line 814
    invoke-virtual {v7}, Lp34;->a()V

    .line 815
    .line 816
    .line 817
    const/4 v11, 0x0

    .line 818
    const/16 v12, 0x3c

    .line 819
    .line 820
    const/4 v10, 0x0

    .line 821
    invoke-static/range {v7 .. v12}, Lsv1;->d0(Lsv1;Llf;Ld90;FLom7;I)V

    .line 822
    .line 823
    .line 824
    return-object v6

    .line 825
    :pswitch_14
    move-object v1, p0

    .line 826
    check-cast v1, Leo5;

    .line 827
    .line 828
    check-cast v7, Lj60;

    .line 829
    .line 830
    move-object v0, p1

    .line 831
    check-cast v0, Ldo5;

    .line 832
    .line 833
    iget-object v4, v7, Lj60;->q0:Lgn2;

    .line 834
    .line 835
    const/4 v5, 0x4

    .line 836
    const/4 v2, 0x0

    .line 837
    const/4 v3, 0x0

    .line 838
    invoke-static/range {v0 .. v5}, Ldo5;->k(Ldo5;Leo5;IILgn2;I)V

    .line 839
    .line 840
    .line 841
    return-object v6

    .line 842
    :pswitch_15
    check-cast p0, Lb71;

    .line 843
    .line 844
    check-cast v7, Ljc8;

    .line 845
    .line 846
    check-cast p1, Lyh2;

    .line 847
    .line 848
    new-instance v0, Lq0;

    .line 849
    .line 850
    const/4 v2, 0x7

    .line 851
    invoke-direct {v0, p1, v7, v5, v2}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 852
    .line 853
    .line 854
    invoke-static {p0, v5, v5, v0, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 855
    .line 856
    .line 857
    return-object v6

    .line 858
    :pswitch_16
    check-cast p0, Lm00;

    .line 859
    .line 860
    check-cast v7, Lfz0;

    .line 861
    .line 862
    check-cast p1, Leq1;

    .line 863
    .line 864
    iget-object p1, p0, Lm00;->a:Lz47;

    .line 865
    .line 866
    if-eqz p1, :cond_11

    .line 867
    .line 868
    iget-object v0, v7, Lfz0;->b:Lk00;

    .line 869
    .line 870
    invoke-static {p1, v0}, Lz47;->k(Lz47;Lk25;)V

    .line 871
    .line 872
    .line 873
    goto :goto_a

    .line 874
    :cond_11
    iget-object p1, p0, Lm00;->b:Lz95;

    .line 875
    .line 876
    if-eqz p1, :cond_12

    .line 877
    .line 878
    iget-object v0, v7, Lfz0;->a:Ll00;

    .line 879
    .line 880
    invoke-virtual {p1, v0}, Lz95;->b(Lu95;)V

    .line 881
    .line 882
    .line 883
    :goto_a
    new-instance v5, Lp00;

    .line 884
    .line 885
    invoke-direct {v5, p0, v7, v4}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 886
    .line 887
    .line 888
    goto :goto_b

    .line 889
    :cond_12
    const-string p0, "Unreachable"

    .line 890
    .line 891
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    :goto_b
    return-object v5

    .line 895
    :pswitch_17
    check-cast p0, Lc00;

    .line 896
    .line 897
    check-cast v7, Ld00;

    .line 898
    .line 899
    check-cast p1, Ltc6;

    .line 900
    .line 901
    iget-object p1, p0, Lc00;->q0:Lt98;

    .line 902
    .line 903
    if-eqz p1, :cond_13

    .line 904
    .line 905
    invoke-virtual {p1}, Lt98;->b()V

    .line 906
    .line 907
    .line 908
    :cond_13
    iput-object v5, p0, Lc00;->q0:Lt98;

    .line 909
    .line 910
    iget-object p0, v7, Ld00;->Y:Lux0;

    .line 911
    .line 912
    if-eqz p0, :cond_14

    .line 913
    .line 914
    invoke-virtual {p0, v6}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    :cond_14
    iput-object v5, v7, Ld00;->Y:Lux0;

    .line 918
    .line 919
    return-object v6

    .line 920
    :pswitch_18
    check-cast p0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 921
    .line 922
    check-cast v7, Lqg5;

    .line 923
    .line 924
    check-cast p1, Ljava/io/PrintWriter;

    .line 925
    .line 926
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object p0

    .line 934
    if-eqz v7, :cond_15

    .line 935
    .line 936
    iget-object v1, v7, Lqg5;->X:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v1, Ljava/lang/Integer;

    .line 939
    .line 940
    goto :goto_c

    .line 941
    :cond_15
    move-object v1, v5

    .line 942
    :goto_c
    if-eqz v7, :cond_16

    .line 943
    .line 944
    iget-object v2, v7, Lqg5;->Y:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v2, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 947
    .line 948
    if-eqz v2, :cond_16

    .line 949
    .line 950
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;->a()I

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 955
    .line 956
    .line 957
    move-result-object v5

    .line 958
    :cond_16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 959
    .line 960
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    const-string v0, " subscription "

    .line 967
    .line 968
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    const-string p0, " check provider response code: "

    .line 975
    .line 976
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    const-string p0, " total "

    .line 983
    .line 984
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object p0

    .line 994
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    return-object v6

    .line 998
    :pswitch_19
    check-cast p0, Lir5;

    .line 999
    .line 1000
    check-cast v7, Lnr5;

    .line 1001
    .line 1002
    check-cast p1, Leq1;

    .line 1003
    .line 1004
    invoke-virtual {p0, v7}, Lir5;->setPositionProvider(Lnr5;)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {p0}, Lir5;->q()V

    .line 1008
    .line 1009
    .line 1010
    new-instance p0, Lzf;

    .line 1011
    .line 1012
    invoke-direct {p0, v4}, Lzf;-><init>(B)V

    .line 1013
    .line 1014
    .line 1015
    return-object p0

    .line 1016
    :pswitch_1a
    check-cast p0, Lkh;

    .line 1017
    .line 1018
    check-cast v7, Lrf;

    .line 1019
    .line 1020
    check-cast p1, Lb71;

    .line 1021
    .line 1022
    new-instance p1, Lwd3;

    .line 1023
    .line 1024
    new-instance v0, Lo7;

    .line 1025
    .line 1026
    invoke-direct {v0, v7, v1}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 1027
    .line 1028
    .line 1029
    invoke-direct {p1, p0, v0}, Lwd3;-><init>(Lkh;Lo7;)V

    .line 1030
    .line 1031
    .line 1032
    return-object p1

    .line 1033
    :pswitch_1b
    check-cast p0, Lz9;

    .line 1034
    .line 1035
    check-cast v7, Lia;

    .line 1036
    .line 1037
    check-cast p1, Lfu1;

    .line 1038
    .line 1039
    iget-wide v0, p1, Lfu1;->a:J

    .line 1040
    .line 1041
    invoke-virtual {p0}, Lz9;->u1()Z

    .line 1042
    .line 1043
    .line 1044
    move-result p1

    .line 1045
    if-eqz p1, :cond_17

    .line 1046
    .line 1047
    const/high16 p1, -0x40800000    # -1.0f

    .line 1048
    .line 1049
    :goto_d
    invoke-static {p1, v0, v1}, Lz85;->g(FJ)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v0

    .line 1053
    goto :goto_e

    .line 1054
    :cond_17
    const/high16 p1, 0x3f800000    # 1.0f

    .line 1055
    .line 1056
    goto :goto_d

    .line 1057
    :goto_e
    iget-object p1, p0, Lxu1;->s0:Lsd5;

    .line 1058
    .line 1059
    sget-object v2, Lsd5;->X:Lsd5;

    .line 1060
    .line 1061
    if-ne p1, v2, :cond_18

    .line 1062
    .line 1063
    const-wide v2, 0xffffffffL

    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    and-long/2addr v0, v2

    .line 1069
    :goto_f
    long-to-int p1, v0

    .line 1070
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1071
    .line 1072
    .line 1073
    move-result p1

    .line 1074
    goto :goto_10

    .line 1075
    :cond_18
    const/16 p1, 0x20

    .line 1076
    .line 1077
    shr-long/2addr v0, p1

    .line 1078
    goto :goto_f

    .line 1079
    :goto_10
    iget-object p0, p0, Lz9;->L0:Lla;

    .line 1080
    .line 1081
    invoke-virtual {p0, p1}, Lla;->c(F)F

    .line 1082
    .line 1083
    .line 1084
    move-result p0

    .line 1085
    invoke-static {v7, p0}, Lia;->b(Lia;F)V

    .line 1086
    .line 1087
    .line 1088
    return-object v6

    .line 1089
    :pswitch_1c
    check-cast p0, Lxz4;

    .line 1090
    .line 1091
    check-cast v7, Let5;

    .line 1092
    .line 1093
    check-cast p1, Ljava/lang/Throwable;

    .line 1094
    .line 1095
    invoke-virtual {p0, v7}, Lxz4;->b(Lvf3;)V

    .line 1096
    .line 1097
    .line 1098
    return-object v6

    .line 1099
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
