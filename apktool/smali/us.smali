.class public final Lus;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lgk7;

.field public final c:Lvz7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 2
    .line 3
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->g()Lgk7;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lus;->a:Landroid/content/Context;

    .line 18
    .line 19
    iput-object v0, p0, Lus;->b:Lgk7;

    .line 20
    .line 21
    new-instance p1, Lo7;

    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    invoke-direct {p1, p0, v0}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lvz7;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lus;->c:Lvz7;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lts;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lts;

    .line 7
    .line 8
    iget v1, v0, Lts;->k0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lts;->k0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lts;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lts;-><init>(Lus;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lts;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lts;->k0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lts;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 41
    .line 42
    iget-object v1, v0, Lts;->g0:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v0, v0, Lts;->f0:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_2
    iget-object p1, v0, Lts;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 58
    .line 59
    iget-object v1, v0, Lts;->g0:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v6, v0, Lts;->f0:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p2, Lkw4;->a:Lkw4;

    .line 71
    .line 72
    invoke-static {p1}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz p2, :cond_14

    .line 77
    .line 78
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    iput-object p1, v0, Lts;->f0:Ljava/lang/String;

    .line 89
    .line 90
    iput-object v2, v0, Lts;->g0:Ljava/lang/String;

    .line 91
    .line 92
    iput-object p2, v0, Lts;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 93
    .line 94
    iput v4, v0, Lts;->k0:I

    .line 95
    .line 96
    iget-object v7, p0, Lus;->b:Lgk7;

    .line 97
    .line 98
    invoke-virtual {v7, v1, v6, p1, v0}, Lgk7;->a(Lsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/String;Ls51;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v5, :cond_4

    .line 103
    .line 104
    goto/16 :goto_4

    .line 105
    .line 106
    :cond_4
    move-object v6, p1

    .line 107
    move-object p1, p2

    .line 108
    move-object v1, v2

    .line 109
    :goto_1
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    if-eqz p2, :cond_5

    .line 114
    .line 115
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->s0()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    :cond_5
    if-nez v2, :cond_6

    .line 120
    .line 121
    const-string v2, ""

    .line 122
    .line 123
    :cond_6
    const/4 p2, 0x0

    .line 124
    invoke-virtual {p1, v2, p2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->v0(Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_7

    .line 132
    .line 133
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-eqz v2, :cond_7

    .line 138
    .line 139
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->b1()Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_7

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {p1, v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->l0(Z)V

    .line 150
    .line 151
    .line 152
    :cond_7
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-eqz v2, :cond_a

    .line 157
    .line 158
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->c0()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-eqz v2, :cond_a

    .line 163
    .line 164
    sget-object v7, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 165
    .line 166
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    iget-object v7, v7, Lsu/happ/proxyutility/HappApplication;->l0:Lvz7;

    .line 171
    .line 172
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    check-cast v7, Len7;

    .line 177
    .line 178
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v7, v7, Len7;->a:Lvz7;

    .line 182
    .line 183
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    check-cast v7, Ll45;

    .line 188
    .line 189
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, p1, v2}, Ll45;->a(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)Lk45;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    instance-of v7, v2, Lg45;

    .line 197
    .line 198
    if-eqz v7, :cond_8

    .line 199
    .line 200
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-virtual {v7}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    new-instance v8, Lss;

    .line 209
    .line 210
    check-cast v2, Lg45;

    .line 211
    .line 212
    invoke-direct {v8, v2, p2}, Lss;-><init>(Lg45;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v8}, Lkf4;->h(Lgn2;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_8
    instance-of v7, v2, Lh45;

    .line 220
    .line 221
    if-eqz v7, :cond_9

    .line 222
    .line 223
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    new-instance v7, Ly2;

    .line 232
    .line 233
    const/16 v8, 0x13

    .line 234
    .line 235
    invoke-direct {v7, v8}, Ly2;-><init>(B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v7}, Lkf4;->h(Lgn2;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_9
    instance-of v2, v2, Lj45;

    .line 243
    .line 244
    if-eqz v2, :cond_a

    .line 245
    .line 246
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    new-instance v7, Ly2;

    .line 255
    .line 256
    const/16 v8, 0x14

    .line 257
    .line 258
    invoke-direct {v7, v8}, Ly2;-><init>(B)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v7}, Lkf4;->h(Lgn2;)V

    .line 262
    .line 263
    .line 264
    :cond_a
    :goto_2
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-eqz v2, :cond_c

    .line 269
    .line 270
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->d0()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    if-eqz v2, :cond_c

    .line 275
    .line 276
    sget-object v7, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 277
    .line 278
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    iget-object v7, v7, Lsu/happ/proxyutility/HappApplication;->l0:Lvz7;

    .line 283
    .line 284
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    check-cast v7, Len7;

    .line 289
    .line 290
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    iget-object v7, v7, Len7;->b:Lvz7;

    .line 294
    .line 295
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    check-cast v7, Lr45;

    .line 300
    .line 301
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-static {p1, v2}, Lr45;->a(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)Lk45;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    instance-of v7, v2, Lj45;

    .line 309
    .line 310
    if-eqz v7, :cond_b

    .line 311
    .line 312
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    new-instance v7, Ly2;

    .line 321
    .line 322
    const/16 v8, 0x15

    .line 323
    .line 324
    invoke-direct {v7, v8}, Ly2;-><init>(B)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v7}, Lkf4;->h(Lgn2;)V

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_b
    instance-of v2, v2, Lh45;

    .line 332
    .line 333
    if-eqz v2, :cond_c

    .line 334
    .line 335
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    new-instance v7, Ly2;

    .line 344
    .line 345
    const/16 v8, 0x16

    .line 346
    .line 347
    invoke-direct {v7, v8}, Ly2;-><init>(B)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v7}, Lkf4;->h(Lgn2;)V

    .line 351
    .line 352
    .line 353
    :cond_c
    :goto_3
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    if-eqz v2, :cond_f

    .line 358
    .line 359
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->O()Ljava/lang/Boolean;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    if-eqz v2, :cond_f

    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    iget-object v7, p0, Lus;->c:Lvz7;

    .line 370
    .line 371
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    check-cast v7, Lh03;

    .line 376
    .line 377
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    if-eqz v8, :cond_d

    .line 385
    .line 386
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->V()Lsu/happ/proxyutility/dto/SubscriptionItem$Status;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    if-nez v8, :cond_d

    .line 391
    .line 392
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->B()Ljava/lang/Long;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    if-nez v8, :cond_d

    .line 397
    .line 398
    move p2, v4

    .line 399
    :cond_d
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 400
    .line 401
    .line 402
    move-result v8

    .line 403
    if-nez v8, :cond_e

    .line 404
    .line 405
    if-nez p2, :cond_e

    .line 406
    .line 407
    iget-object p2, v7, Lh03;->a:Lvz7;

    .line 408
    .line 409
    invoke-virtual {p2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    check-cast p2, Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 416
    .line 417
    .line 418
    move-result p2

    .line 419
    if-eqz p2, :cond_f

    .line 420
    .line 421
    :cond_e
    invoke-virtual {p1, v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->n0(Z)V

    .line 422
    .line 423
    .line 424
    :cond_f
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    if-eqz p2, :cond_11

    .line 429
    .line 430
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->E0()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object p2

    .line 434
    if-eqz p2, :cond_11

    .line 435
    .line 436
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-lez v2, :cond_11

    .line 441
    .line 442
    sget-object v2, Lkw2;->a:Lkw2;

    .line 443
    .line 444
    iput-object v6, v0, Lts;->f0:Ljava/lang/String;

    .line 445
    .line 446
    iput-object v1, v0, Lts;->g0:Ljava/lang/String;

    .line 447
    .line 448
    iput-object p1, v0, Lts;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 449
    .line 450
    iput v3, v0, Lts;->k0:I

    .line 451
    .line 452
    invoke-virtual {v2, p2, v6, v4, v0}, Lkw2;->h(Ljava/lang/String;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p2

    .line 456
    if-ne p2, v5, :cond_10

    .line 457
    .line 458
    :goto_4
    return-object v5

    .line 459
    :cond_10
    move-object v0, v6

    .line 460
    :goto_5
    move-object v6, v0

    .line 461
    :cond_11
    if-eqz v1, :cond_12

    .line 462
    .line 463
    invoke-virtual {p1, v1, v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->v0(Ljava/lang/String;Z)V

    .line 464
    .line 465
    .line 466
    :cond_12
    sget-object p2, Lkw4;->a:Lkw4;

    .line 467
    .line 468
    invoke-static {v6}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 469
    .line 470
    .line 471
    move-result-object p2

    .line 472
    if-nez p2, :cond_13

    .line 473
    .line 474
    goto :goto_6

    .line 475
    :cond_13
    invoke-static {p1, v6}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    :goto_6
    iget-object p0, p0, Lus;->a:Landroid/content/Context;

    .line 479
    .line 480
    const/16 p1, 0x81

    .line 481
    .line 482
    invoke-static {p0, p1}, Lqe4;->O0(Landroid/content/Context;I)V

    .line 483
    .line 484
    .line 485
    sget-object p0, Ldn8;->a:Ldn8;

    .line 486
    .line 487
    return-object p0

    .line 488
    :cond_14
    const-string p0, "Required value was null."

    .line 489
    .line 490
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    return-object v2
.end method
